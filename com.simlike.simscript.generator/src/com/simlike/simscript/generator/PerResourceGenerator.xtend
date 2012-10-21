package com.simlike.simscript.generator

import com.google.inject.Inject
import com.simlike.simscript.application.SimApplicationDslExtensions
import com.simlike.simscript.application.simApplicationDsl.ApplicationModel
import com.simlike.simscript.backend.SimBackendDslExtensions
import com.simlike.simscript.backend.simBackendDsl.BackendModel
import com.simlike.simscript.generator.backend.ControllerGenerator
import com.simlike.simscript.generator.backend.CrudServletsGenerator
import com.simlike.simscript.generator.backend.PojoGenerator
import com.simlike.simscript.generator.backend.ServletGenerator
import com.simlike.simscript.generator.ui.ApplicationGenerator
import com.simlike.simscript.generator.ui.UserInterfaceGenerator
import com.simlike.simscript.structure.structureDsl.Structure
import com.simlike.simscript.structure.structureDsl.StructureModel
import com.simlike.simscript.ui.simUiDsl.UiModule
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import com.simlike.simscript.generator.backend.AuthenticationGenerator

/**
 * Generator for the {@code all-in-1} DSL.
 * <p>
 * It generates on a per-file basis
 * (with the possible, future exception of putting all servlets in {@code web.xml})
 * the following types of files:
 * <ul>
 * 	<li>a POJO for every <b>structure</b>, in the {@code .data} sub package;</li>
 * 	<li>(future)a controller for every <b>structure</b>, in the {@code .controllers} sub package;</li>
 * 	<li>(future)a servlet for every <b>interface</b>, in the {@code .servlets} sub package;</li>
 * 	<li>...</li>
 * </ul>
 * 
 * @author Meinte Boersma
 */
// (not @Singleton <== instance has state: field 'fileSystemAccess')
class PerResourceGenerator implements IGenerator {

	@Inject extension ResourceUtil
	@Inject extension SimBackendDslExtensions
	@Inject extension SimApplicationDslExtensions

	@Inject private PojoGenerator pojoGenerator
	@Inject private ControllerGenerator controllerGenerator
	@Inject private ServletGenerator servletsGenerator
	@Inject private CrudServletsGenerator crudServletsGenerator
	@Inject private UserInterfaceGenerator userInterfaceGenerator
	@Inject private ApplicationGenerator applicationGenerator
	@Inject private AuthenticationGenerator authGenerator

	// constants:
	public String javaGenFolder = "../src/gen/java/"

	// local state:
	private AbstractFileSystemAccess fileSystemAccess
	private String javaBasePath

	override doGenerate(Resource resource, IFileSystemAccess fileSystemAccess) {
		this.fileSystemAccess = fileSystemAccess as AbstractFileSystemAccess

		if( !resource.properlyLocated ) {
			System::err.println('''«logPrefix» resource «resource.URI» is not properly located: skipping''')
			return
		}

		val model = resource.contents.head
		if( model == null ) {
			System::err.println('''«logPrefix» resource «resource.URI» is empty: skipping''')
			return
		}

		javaBasePath = javaGenFolder + "/" + model.packageName.asPath

		try {
			model.generate
			// TODO  use File.save paradigm
		} catch( IllegalArgumentException e ) {
			println( "aborted generation for Resource with uri=" + resource.URI + "; cause:\n" + e.message )
			e.printStackTrace
		}
	}

	def private dispatch void generate(StructureModel it) {
		for( structure : typeDefinitions.filter(typeof(Structure)) /* TODO  add .filter[persistent] */ ) {
			fileSystemAccess.generateFile(javaBasePath + "/data/" + structure.name + ".java", pojoGenerator.generatePOJO(structure))
			fileSystemAccess.generateFile(javaBasePath + "/controllers/" + structure.name + "Controller.java", controllerGenerator.generateController(structure))
		}
	}

	// TODO  use File.save paradigm everywhere to strongly couple location of generated file to generated content itself (e.g., for fully-qualified Java names)
	def private dispatch void generate(BackendModel it) {
		for( interface_ : interfaces ) { // ("interface" is not properly escaped for Java)
			fileSystemAccess.generateFile(javaBasePath + "/servlets/Abstract" + interface_.name.toFirstUpper + "Servlet.java", servletsGenerator.generateBaseServlet(interface_))
			// TODO  generate a stub for the actual implementation if that doesn't exist yet
		}

		for( crudService : crudServices ) {
			crudServletsGenerator.generateServlets(crudService, javaBasePath, fileSystemAccess)
		}

		for( authOpt : authOpts ) {
			authGenerator.generateAuthenticationTokenCreator(authOpt, javaBasePath, fileSystemAccess)
		}
	}

	def private dispatch void generate(UiModule it) {
		userInterfaceGenerator.generate(it, fileSystemAccess)
	}

	def private dispatch void generate(ApplicationModel it) {
		fileSystemAccess.generateFile(name + "_app.html", applicationGenerator.generateHtml(it))
	}

	def private dispatch void generate(EObject it) {
		System::out.println('''«logPrefix» don't have a generator for model with root type «eClass.name»: skipping''')
	}

	def private logPrefix() {
		this.^class.simpleName + ":"
	}
}

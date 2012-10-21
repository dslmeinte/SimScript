package com.simlike.simscript.generator

import com.google.inject.Inject
import com.simlike.simscript.backend.simBackendDsl.BackendModel
import com.simlike.simscript.generator.backend.AuthenticationGenerator
import com.simlike.simscript.generator.backend.WebXmlGenerator
import com.simlike.simscript.generator.ui.CommunicationParseGenerator
import com.simlike.simscript.generator.util.IMultipleResourceGenerator
import com.simlike.simscript.structure.structureDsl.Structure
import com.simlike.simscript.structure.structureDsl.StructureModel
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.mwe.utils.DirectoryCleaner
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Generator for the {@code SimScript} DSLs.
 * <p>
 * It generates on a per-file basis (delegating to {@link PerResourceGenerator}),
 * plus it also puts all servlets in {@code web.xml}.
 * 
 * @author Meinte Boersma
 */
class SimScriptMultipleResourceGenerator implements IMultipleResourceGenerator {

	@Inject private PerResourceGenerator perResourceGenerator
	@Inject private WebXmlGenerator webXmlGenerator
	@Inject private AuthenticationGenerator authenticationGenerator
	@Inject private CommunicationParseGenerator communicationParseGenerator

	@Inject extension ResourceUtil


	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa) {
		println(this.^class.simpleName + ": running generation for SimScript(-*)")

		// resolve all references otherwise the ResourceSet is added to, leading to a ConcurrentModificationException:
		EcoreUtil2::resolveAll(resourceSet)

		// treat each resource separately:
		resourceSet.resources.forEach[perResourceGenerator.doGenerate(it, fsa)]

		val allModels = resourceSet.resources.filter[properlyLocated].map[contents.head]

		println("\t#models considered: " + allModels.size)

		val allBackendModels = allModels.filter(typeof(BackendModel))

		// put all interfaces in web.xml:
		val allDeclarations = allBackendModels.map[declarations].flatten
		fsa.generateFile("../src/main/webapp/WEB-INF/web.xml", webXmlGenerator.generateWebXml(allDeclarations))

		// create the AuthenticationSource:
		val allAuthentications = allBackendModels.map[authOpts].flatten
		fsa.generateFile("../src/gen/java/com/simlike/api/auth/AuthenticationSource.java", authenticationGenerator.generateAuthenticationSource(allAuthentications))

		// create the structureMapper.js:
		val allStructures = allModels.filter(typeof(StructureModel)).map[typeDefinitions.filter(typeof(Structure))].flatten
		fsa.generateFile("../src/gen/javascript/structureMapper.js", communicationParseGenerator.generateParseFunctions(allStructures))
			// TODO  remove assumptions on location (Maven and such)
			// Note: the structure mapper source should end up next to the other JS sources.

		println("\t(ran generation)")
	}

	// FIXME  throws illegalAccessError
	def protected clean() {
		val cleaner = new DirectoryCleaner()
		cleaner.cleanFolder(perResourceGenerator.javaGenFolder)
	}

}

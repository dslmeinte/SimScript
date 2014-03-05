package nl.dslmeinte.simscript.tests

import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.util.Collection
import nl.dslmeinte.simscript.application.SimApplicationDslExtensions
import nl.dslmeinte.simscript.application.SimApplicationDslStandaloneSetup
import nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel
import nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage
import nl.dslmeinte.simscript.backend.SimBackendDslStandaloneSetup
import nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage
import nl.dslmeinte.simscript.generator.ui.ApplicationGenerator
import nl.dslmeinte.simscript.generator.ui.UserInterfaceGenerator
import nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage
import nl.dslmeinte.simscript.types.TypesPackage
import nl.dslmeinte.simscript.ui.SimUiDslStandaloneSetup
import nl.dslmeinte.simscript.ui.extensions.StructuralExtensions
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage
import nl.dslmeinte.simscript.ui.simUiDsl.UiModule
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.junit.AbstractXtextTests
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.validation.AbstractValidationDiagnostic

/**
 * Support class (which ought to be abstract) to help with unit testing files,
 * without using the classes from org.eclipse.xtext.junit4.parameterized
 * (which are either too limited/limiting or which I don't understand).
 */
abstract class XtextTestsSupport extends AbstractXtextTests {

	protected Diagnostician diagnostician

	override protected setUp() {
		super.setUp()
		diagnostician = new Diagnostician()
		with(typeof(SimApplicationDslStandaloneSetup))
		with(typeof(SimBackendDslStandaloneSetup))
		with(typeof(SimUiDslStandaloneSetup))
		EPackage.Registry.INSTANCE.put(SimApplicationDslPackage.eINSTANCE.nsURI, SimApplicationDslPackage.eINSTANCE)
		EPackage.Registry.INSTANCE.put(SimBackendDslPackage.eINSTANCE.nsURI, SimBackendDslPackage.eINSTANCE)
		EPackage.Registry.INSTANCE.put(StructureDslPackage.eINSTANCE.nsURI, StructureDslPackage.eINSTANCE)
		EPackage.Registry.INSTANCE.put(SimUiDslPackage.eINSTANCE.nsURI, SimUiDslPackage.eINSTANCE)
		EPackage.Registry.INSTANCE.put(TypesPackage.eINSTANCE.nsURI, TypesPackage.eINSTANCE)
	}

	def protected reportFor(Resource it) {
		for( e : it.errors ) {
			e.print("error")
		}

		for( w : it.warnings ) {
			w.print("warning")
		}
		val issues = diagnostician.validate(contents.head).children
		for( i : issues ) {
			i.print
		}
		return issues.filter[error].size + errors.size
	}

	def private print(Resource.Diagnostic it, String type) {
		println( '''parse-«type»		L«line»	«message»'''.toString )
	}

	def private print(Diagnostic it) {
		println( '''semantic-«severity.severityIntToString»	«location_»	«message»'''.toString )
	}

	def private isError(Diagnostic it) {
		severity == 4
	}

	def private dispatch location_(AbstractValidationDiagnostic it) {
		val node = NodeModelUtils.getNode(sourceEObject)
		'''L«node.startLine»'''
	}

	def private dispatch location_(Diagnostic it)
		'''	'''

	def private severityIntToString(int severity) {
		switch severity {
			case 2:		"warning"
			case 4:		"error	"
			default:	"?"
		}
	}

	def protected gatherFiles(File dir) {
		val files = <File>newArrayList
		gatherFiles(dir, "sim_struct", files)
		gatherFiles(dir, "sim_back", files)
		gatherFiles(dir, "sim_ui", files)
		gatherFiles(dir, "sim_app", files)
		return files as Iterable<File>
	}

	def private void gatherFiles(File dir, String fileExtension, Collection<File> files) {
		files += dir.listFiles.filter[ it.file && it.fileExtension == fileExtension ]
		dir.listFiles.filter[it.directory].forEach[ d | gatherFiles(d, fileExtension, files) ]
	}

	def private fileExtension(File file) {
		val fileName = file.toString
		val idx = fileName.lastIndexOf('.')
		if( idx < 0 ) {
			null
		} else {
			fileName.substring(idx+1)
		}
	}

	def protected loadIntoOneResourceSet(Iterable<File> files) {
		val resourceSet = new XtextResourceSet()
 		for( file : files ) {
			val resource = resourceSet.getResource(URI.createFileURI(file.toString), true)
			resource.load(emptyMap)
		}
		EcoreUtil.resolveAll(resourceSet)

		return resourceSet
	}

	def protected dump(String path, CharSequence contents) {
		val out = new BufferedWriter(new FileWriter(new File(path)))
		out.append(contents)
		out.close
	}

	def protected generateAll(ResourceSet resourceSet, String outputPath, boolean generateHtml) {
		// clean-create output dir.:
		val outputDir = new File(outputPath)
		if( outputDir.exists ) {
			outputDir.listFiles.forEach[delete]
		} else {
			outputDir.mkdirs
		}

		// generate for all UI and APP models:
		val allModels = resourceSet.resources.map[contents.head]
		val uiExtensions = injector.getInstance(typeof(StructuralExtensions))
		val userInterfaceGenerator = injector.getInstance(typeof(UserInterfaceGenerator))
		for( module : allModels.filter(typeof(UiModule)) ) {
			dump(outputPath + "/" + uiExtensions.name(module) + ".js", userInterfaceGenerator.jsFile(module))
			if( generateHtml ) {
				dump(outputPath + "/" + uiExtensions.name(module) + ".html", userInterfaceGenerator.htmlFile(module))
			}
		}
		val appExtensions = injector.getInstance(typeof(SimApplicationDslExtensions))
		val applicationGenerator = injector.getInstance(typeof(ApplicationGenerator))
		for( app : allModels.filter(typeof(ApplicationModel)) ) {
			dump(outputPath + "/" + appExtensions.name(app) + ".html", applicationGenerator.generateHtml(app))
		}
	}

	def protected reportFor(ResourceSet resourceSet) {
		var nErrors = 0
		for( resource : resourceSet.resources ) {
			println('''reporting on «resource.URI.lastSegment.toString» (full URI: «resource.URI.toString»):''')
			nErrors = nErrors + resource.reportFor
			println("")
		}
		return nErrors
	}

}

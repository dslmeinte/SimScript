package com.simlike.simscript.generator.standalone

import com.google.inject.Guice
import com.google.inject.Inject
import com.google.inject.Provider
import com.simlike.simscript.application.SimApplicationDslStandaloneSetup
import com.simlike.simscript.backend.SimBackendDslStandaloneSetup
import com.simlike.simscript.generator.SimScriptGeneratorModule
import com.simlike.simscript.generator.SimScriptMultipleResourceGenerator
import com.simlike.simscript.structure.SimStructureDslStandaloneSetup
import com.simlike.simscript.ui.SimUiDslStandaloneSetup
import java.io.File
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet

/**
 * Main class to run the generator in standalone mode (not even using MWE2).
 * 
 * @author Meinte Boersma
 */
class GenerateStandalone {

	def static void main(String[] args) {
		if( args.size >= 1 ) {
			val instance = Guice::createInjector(new SimScriptGeneratorModule()).getInstance(typeof(GenerateStandalone))
			instance.repositoryFolder = args.head
			instance.run
		} else {
			println("Usage: 1st argument is an absolute path to the local Git repository containing the Eclipse projects with the SimScript resources")
		}
	}

	@Inject private SimScriptMultipleResourceGenerator generator

	private String repositoryFolder

	def private run() {
		if( !repositoryFolder.endsWith('/') ) {
			repositoryFolder = repositoryFolder + '/'
		}
		val fsa = new JavaIoFileSystemAccess()
		fsa.setOutputPath(repositoryFolder + "api/src-gen/")
		println("all model files (absolute URIs):")
		allModels.resources.forEach[println("\t" + it.URI)]
		generator.doGenerate(allModels, fsa)
	}

	@Inject private Provider<XtextResourceSet> resourceSetProvider

	def private allModels() {
		SimStructureDslStandaloneSetup::doSetup
		SimBackendDslStandaloneSetup::doSetup
		SimUiDslStandaloneSetup::doSetup
		SimApplicationDslStandaloneSetup::doSetup
		val resourceSet = resourceSetProvider.get

		resourceSet.addLoadOption(XtextResource::OPTION_RESOLVE_ALL, Boolean::TRUE)

		allModelFiles.forEach[
			resourceSet.getResource(URI::createFileURI(path), true)
		]

		resourceSet
	}

	def private allModelFiles() {
		new File(repositoryFolder + "api/").allModelFiles
	}

	def private allModelFiles(File dir) {
		val list = <File>newArrayList

		dir.listFiles.forEach[
			if( directory && !path.contains('target/classes/') ) {
				list.addAll(it.allModelFiles)
			} else if( file && name.indexOf('.sim_') > -1 ) {
				list.add(it)
			}
		]

		list
	}

}

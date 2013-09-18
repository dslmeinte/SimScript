package nl.dslmeinte.simscript.structure.metamodel

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.xtext.GeneratedMetamodel
import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor

/**
 * Simple (synthetically abstract) support class to help with post-processing Xtext-generated Ecore meta models.
 * 
 * @author Meinte Boersma
 */
class Xtend2PostProcessorSupport implements IXtext2EcorePostProcessor {

	new() {
		if( ^class == typeof(Xtend2PostProcessorSupport) ) {
			throw new RuntimeException(typeof(Xtend2PostProcessorSupport).name + " is (meant to be) abstract")
		}
	}

	protected EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE

	override process(GeneratedMetamodel metamodel) {
		this.ePackage = metamodel.EPackage
	}

	private EPackage ePackage

	def protected getEPackage() {
		ePackage
	}

	def protected process() {
		throw new UnsupportedOperationException("implement/override process(EPackage)")
	}

}

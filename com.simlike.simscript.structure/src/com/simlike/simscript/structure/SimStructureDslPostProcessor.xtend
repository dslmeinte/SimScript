package com.simlike.simscript.structure

import com.simlike.simscript.util.XtextUtil
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.xtext.GeneratedMetamodel
import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor

class SimStructureDslPostProcessor implements IXtext2EcorePostProcessor {

	def static void augment(GeneratedMetamodel metamodel) {
		new SimStructureDslPostProcessor().process(metamodel)
	}

	override void process(GeneratedMetamodel metamodel) {
		process(metamodel.EPackage)
	}

	private EcoreFactory eFactory = EcoreFactory::eINSTANCE

	// need manual injection because this class is not instantiated within a Guice container:
	extension XtextUtil xtextUtil = new XtextUtil()

	def private process(EPackage ePackage) {
		val typeLiteralType = ePackage.getEClassifier("TypeLiteral")

		// add type parameter <T extends TypeLiteral> to <EClass>Feature:
		val featureType = ePackage.getEClassifier("Feature").checkedCast(typeof(EClass))
		val typeParameter = eFactory.createETypeParameter
		typeParameter.name = "T"
		val typeBound = eFactory.createEGenericType
		typeBound.EClassifier = typeLiteralType
		typeParameter.EBounds += typeBound
		featureType.ETypeParameters += typeParameter

		// modify eType of Feature.type to be T:
		val typeFeature = featureType.getEStructuralFeature("type")
		val typeFeatureGType = eFactory.createEGenericType
		typeFeatureGType.ETypeParameter = typeParameter
		typeFeature.EType = null
		typeFeature.EGenericType = typeFeatureGType

		// modify eType of Structure.features to be Feature<TypeLiteral>:
		val featuresFeature = (ePackage.getEClassifier("Structure").checkedCast(typeof(EClass))).getEStructuralFeature("features")
		featuresFeature.modifyTypeToGeneric(featureType, typeLiteralType)
	}

}

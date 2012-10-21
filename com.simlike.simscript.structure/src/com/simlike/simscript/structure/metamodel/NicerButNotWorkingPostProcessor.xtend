package com.simlike.simscript.structure.metamodel

import com.simlike.simscript.util.XtextUtil
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.GeneratedMetamodel

/*
 * FIXME  post-processor doesn't work: augmentations are not saved?
 */
class NicerButNotWorkingPostProcessor extends Xtend2PostProcessorSupport {

	def static void augment(GeneratedMetamodel metamodel) {
		new com.simlike.simscript.structure.metamodel.NicerButNotWorkingPostProcessor().process(metamodel)
	}

	override process() {
		val typeLiteralType = EPackage.getEClassifier("TypeLiteral")

		// add type parameter <T extends TypeLiteral> to <EClass>Feature:
		val featureType = EPackage.getEClassifier("Feature").checkedCast(typeof(EClass))
		val typeParameter = ecoreFactory.createETypeParameter
		typeParameter.name = "T"
		val typeBound = ecoreFactory.createEGenericType
		typeBound.EClassifier = typeLiteralType
		typeParameter.EBounds += typeBound
		featureType.ETypeParameters += typeParameter

		// modify eType of Feature.type to be T:
		val typeFeature = featureType.getEStructuralFeature("type")
		val typeFeatureGType = ecoreFactory.createEGenericType
		typeFeatureGType.ETypeParameter = typeParameter
		typeFeature.EType = null
		typeFeature.EGenericType = typeFeatureGType

		// modify eType of Structure.features to be Feature<TypeLiteral>:
		val featuresFeature = (EPackage.getEClassifier("Structure").checkedCast(typeof(EClass))).getEStructuralFeature("features")
		featuresFeature.modifyTypeToGeneric(featureType, typeLiteralType)
	}

	extension XtextUtil = new XtextUtil()

}

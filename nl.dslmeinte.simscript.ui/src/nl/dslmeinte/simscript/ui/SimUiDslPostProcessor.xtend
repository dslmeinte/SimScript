package nl.dslmeinte.simscript.ui

import nl.dslmeinte.simscript.util.XtextUtil
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.xtext.GeneratedMetamodel
import org.eclipse.xtext.xtext.ecoreInference.IXtext2EcorePostProcessor

/**
 * Augments the Ecore meta model generated from the grammar with some
 * abstract convenience super types which cannot specified through the
 * grammar itself.
 * <p>
 * In particular, these are:
 * <ul>
 * 	<li>{@link BinaryOperatorExpression}: indicates any binary infix operator (without specifying precedence or associativity);
 * 	<li>{@link BooleanBinaryOperatorExpression}: indicates a binary infix operator whose operands as well as result value are boolean-typed;
 * 	<li>{@link ArithmeticBinaryOperatorExpression}: indicates a binary infix operator whose operands as well as result value are numerically-typed.
 * </ul>
 * Note that the {@link ComparisonExpression} is only "half-a" {@link BooleanBinaryOperatorExpression}.
 * 
 * @author Meinte Boersma
 */
class SimUiDslPostProcessor implements IXtext2EcorePostProcessor {

	def static void augment(GeneratedMetamodel metamodel) {
		new SimUiDslPostProcessor().process(metamodel)
	}

	override void process(GeneratedMetamodel metamodel) {
		process(metamodel.EPackage)
	}

	private EPackage ePackage


	/**
	 * Create "in-between" types for various classes of binary operators,
	 * add them to the Ecore meta model and modify existing EClass-es
	 * for binary operators accordingly.
	 */
	def private process(EPackage root) {
		ePackage = root

		// take care of the binary operators:
		val booleanBinary = mkBinaryOperator("BooleanBinaryOperatorExpression")
		val arithmeticBinary = mkBinaryOperator("ArithmeticBinaryOperatorExpression")
		ePackage.EClassifiers += booleanBinary
		ePackage.EClassifiers += arithmeticBinary
		ePackage.EClassifiers += commonBinaryOperator
		"ComparisonExpression".modifyOperator(commonBinaryOperator)
		newArrayList("OrExpression", "AndExpression").modifyOperators(booleanBinary)
		newArrayList("AdditiveExpression", "MultiplicativeExpression").modifyOperators(arithmeticBinary)

		// modify eType of FeatureAccessExpression.feature and FeatureAssignment.feature to be Feature<TypeLiteral> (instead of the raw type):
		val typeLiteralType = findEClass("Parameter").getEStructuralFeature("type").EType
		val faefFeature = findEClass("FeatureAccessExpression").getEStructuralFeature("feature")
		val featureType = faefFeature.EType
		faefFeature.modifyTypeToGeneric(featureType, typeLiteralType)
		val fafFeature = findEClass("FeatureAssignment").getEStructuralFeature("feature")
		fafFeature.modifyTypeToGeneric(featureType, typeLiteralType)

		/*
		 * FIXME  last section does not work (but the first one does!)
		 * 
		 * Apparently, this has something to do with TypeLiteral and Feature types coming from
		 * a different package. Directly obtaining those type (instances) from StructureDslPackage
		 * results in an invalid Ecore file (proxy not resolvable through nsURI). It works fine
		 * for the 1 EPackage-situation (cf. SimScript-Structure).
		 * 
		 * This doesn't break stuff but introduces a bunch of warnings regarding raw types.
		 */
	}

	extension XtextUtil xtextUtil = new XtextUtil()

	def private findEClass(String name) {
		ePackage.getEClassifier(name).checkedCast(typeof(EClass))
	}

	private EcoreFactory eFactory = EcoreFactory.eINSTANCE

	def private mkBinaryOperator(String name) {
		val eClass = eFactory.createEClass

		eClass.name = name
		eClass.ESuperTypes += commonBinaryOperator

		eClass
	}

	/**
	 * @return The common super type for binary operators.
	 */
	def private commonBinaryOperator() {
		if( _commonBinaryOperator == null ) {
			_commonBinaryOperator = eFactory.createEClass
			_commonBinaryOperator.name = "BinaryOperatorExpression"
			_commonBinaryOperator.^abstract = true
			_commonBinaryOperator.ESuperTypes += expressionType
			_commonBinaryOperator.EStructuralFeatures += mkReference("leftOperand", expressionType)
			_commonBinaryOperator.EStructuralFeatures += mkReference("rightOperand", expressionType)
		}
		_commonBinaryOperator
	}
	private EClass _commonBinaryOperator	// singleton


	def private expressionType() {
		findEClass("Expression")
	}


	def private mkReference(String name, EClass targetType) {
		val eRef = eFactory.createEReference

		eRef.name = name
		eRef.containment = true
		eRef.EType = targetType

		eRef
	}

	/**
	 * Looks up the EClass-es corresponding to the operator names provided
	 * inside the given EPackage and modifies those.
	 */
	def private modifyOperators(Iterable<String> opNames, EClass superOperator) {
		opNames.forEach[ opName | modifyOperator(opName, superOperator) ]
	}

	/**
	 * Looks up the EClass corresponding to the given operator name
	 * inside the given EPackage and modifies that.
	 */
	def private modifyOperator(String opName, EClass superOperator) {
		findEClass(opName).modifyOperatorEClass(superOperator)
	}

	/**
	 * Modifies a binary operator EClass by replacing its Expression super type
	 * with 'newSuperType' and removing the 'left' and 'right' features (which
	 * are members of the common binary operator EClass).
	 */
	def private modifyOperatorEClass(EClass operatorEClass, EClass newSuperType) {
		val superTypes = operatorEClass.ESuperTypes
		val features = operatorEClass.EStructuralFeatures
		superTypes.remove(superTypes.findFirst[name == "Expression"])
		superTypes += newSuperType
		features.removeAll( features.filter[newHashSet("leftOperand", "rightOperand").contains(it.name)].toSet )
	}

}

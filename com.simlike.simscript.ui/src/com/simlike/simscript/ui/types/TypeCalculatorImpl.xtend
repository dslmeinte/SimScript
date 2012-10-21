package com.simlike.simscript.ui.types

import com.google.inject.Inject
import com.google.inject.Singleton
import com.simlike.simscript.structure.structureDsl.Structure
import com.simlike.simscript.structure.structureDsl.TypeLiteral
import com.simlike.simscript.structure.types.TypeExtensions
import com.simlike.simscript.ui.extensions.ExpressionExtensions
import com.simlike.simscript.ui.extensions.MethodExtensions
import com.simlike.simscript.ui.extensions.ServiceExtensions
import com.simlike.simscript.ui.extensions.StatementExtensions
import com.simlike.simscript.ui.simUiDsl.AdditiveExpression
import com.simlike.simscript.ui.simUiDsl.AdditiveOperators
import com.simlike.simscript.ui.simUiDsl.ArithmeticBinaryOperatorExpression
import com.simlike.simscript.ui.simUiDsl.BooleanBinaryOperatorExpression
import com.simlike.simscript.ui.simUiDsl.BooleanLiteralExpression
import com.simlike.simscript.ui.simUiDsl.BuiltinFunctionExpression
import com.simlike.simscript.ui.simUiDsl.CalendarElement
import com.simlike.simscript.ui.simUiDsl.CallbackErrorResponseExpression
import com.simlike.simscript.ui.simUiDsl.CallbackExpression
import com.simlike.simscript.ui.simUiDsl.CallbackResponseExpression
import com.simlike.simscript.ui.simUiDsl.ComparisonExpression
import com.simlike.simscript.ui.simUiDsl.DateExpression
import com.simlike.simscript.ui.simUiDsl.DecisionExpression
import com.simlike.simscript.ui.simUiDsl.Element
import com.simlike.simscript.ui.simUiDsl.EnumerationLiteralExpression
import com.simlike.simscript.ui.simUiDsl.Expression
import com.simlike.simscript.ui.simUiDsl.FeatureAccessExpression
import com.simlike.simscript.ui.simUiDsl.IntegerLiteralExpression
import com.simlike.simscript.ui.simUiDsl.InterfaceCallExpression
import com.simlike.simscript.ui.simUiDsl.ListLiteralExpression
import com.simlike.simscript.ui.simUiDsl.ListVariable
import com.simlike.simscript.ui.simUiDsl.Method
import com.simlike.simscript.ui.simUiDsl.MethodCallExpression
import com.simlike.simscript.ui.simUiDsl.MultiplicativeExpression
import com.simlike.simscript.ui.simUiDsl.MultiplicativeOperators
import com.simlike.simscript.ui.simUiDsl.NotExpression
import com.simlike.simscript.ui.simUiDsl.NumberLiteralExpression
import com.simlike.simscript.ui.simUiDsl.Parameter
import com.simlike.simscript.ui.simUiDsl.Referable
import com.simlike.simscript.ui.simUiDsl.ReferenceExpression
import com.simlike.simscript.ui.simUiDsl.SelectionExpression
import com.simlike.simscript.ui.simUiDsl.SimUiDslPackage
import com.simlike.simscript.ui.simUiDsl.StringLiteralExpression
import com.simlike.simscript.ui.simUiDsl.StructureCreationExpression
import com.simlike.simscript.ui.simUiDsl.TernaryExpression
import com.simlike.simscript.ui.simUiDsl.TimeSlotListElement
import com.simlike.simscript.ui.simUiDsl.Value
import com.simlike.simscript.util.XtextUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.IScopeProvider

import static com.simlike.simscript.structure.structureDsl.BuiltinTypes.*
import static com.simlike.simscript.ui.simUiDsl.BuiltinFunctions.*
import com.simlike.simscript.ui.extensions.impl.ReferableExtensionsImpl

/**
 * This class computes types of {@link Expression expressions} and other
 * SimScript-UI language constructs which can be construed as having an
 * (inferred) type. Types are represented by {@link TypeLiteral type
 * literals}. {@code void} is represented by {@link VoidLiteral}.
 * <p>
 * {@code null} represents the unknown/uncomputable type, usually
 * due to unresolved cross-references while in the context of
 * list types it corresponds to {@code ?}.
 * <p>
 * This class is used for custom validation, scoping for type
 * checking and the generator classes for type calculation.
 * 
 * @author Meinte Boersma
 */
@Singleton
class TypeCalculatorImpl implements TypeCalculator {

	@Inject extension TypeExtensions
	@Inject extension ReferableExtensionsImpl
	@Inject extension ExpressionExtensions
	@Inject extension StatementExtensions
	@Inject extension MethodExtensions
	@Inject extension ServiceExtensions

	@Inject private IScopeProvider scopeProvider

	@Inject extension XtextUtil


	/*
	 * +-------------+
	 * | expressions |
	 * +-------------+
	 * 
	 * Each method has an explicit return type to ensure we get
	 * an error as this mechanism breaks (by a dispatch function
	 * returning something else, causing the dispatcher to have
	 * Object as return type) + ensuring that it works in the
	 * face of recursion.
	 */

	override TypeLiteral type(Expression it) {
		if( it == null ) {
			System::err.println("WARNING	type calculation invoked on null; stacktrace:")
			new RuntimeException().printStackTrace(System::err)
			return null
		}
		try {
			type_
		} catch( IllegalArgumentException e ) {
			if( e.message.startsWith("Unhandled") ) {
				System::err.println('''WARNING	type calculation not complete for Expression of sub type «eClass.name»; stracktrace:''')
				e.printStackTrace(System::err)
			}
			return null
		}
	}

	def private dispatch type_(TernaryExpression it)				{ thenExpr.type }

	def private dispatch type_(BooleanBinaryOperatorExpression it)	{ BOOLEAN.createBuiltinTypeLiteral }
	def private dispatch type_(ComparisonExpression it)				{ BOOLEAN.createBuiltinTypeLiteral }

	def private dispatch type_(ArithmeticBinaryOperatorExpression it) {
		if( leftOperand.type.integerTyped && rightOperand.type.integerTyped && !division ) {
			INTEGER.createBuiltinTypeLiteral
		} else if( addition && leftOperand.type.textuallyTyped ) {
			STRING.createBuiltinTypeLiteral
		} else {
			NUMBER.createBuiltinTypeLiteral
		}
	}

	def private dispatch isDivision(AdditiveExpression it)			{ false }
	def private dispatch isDivision(MultiplicativeExpression it)	{ operator == MultiplicativeOperators::DIV }

	def private dispatch isAddition(AdditiveExpression it)			{ operator == AdditiveOperators::PLUS }
	def private dispatch isAddition(MultiplicativeExpression it)	{ false }

	def private dispatch type_(NotExpression it)					{ BOOLEAN.createBuiltinTypeLiteral }

	def private dispatch type_(FeatureAccessExpression it) {
		if( feature.eIsProxy ) null else feature.type
			// check for proxies to prevent scope provision from failing through an AssertionError about cyclic resolution
	}

	def private dispatch type_(StringLiteralExpression it)			{ STRING.createBuiltinTypeLiteral }
	def private dispatch type_(BooleanLiteralExpression it)			{ BOOLEAN.createBuiltinTypeLiteral }
	def private dispatch type_(IntegerLiteralExpression it)			{ INTEGER.createBuiltinTypeLiteral }
	def private dispatch type_(NumberLiteralExpression it)			{ NUMBER.createBuiltinTypeLiteral }
	def private dispatch type_(EnumerationLiteralExpression it)		{ enumeration.createDefinedTypeLiteral }

	def private dispatch type_(ListLiteralExpression it) {
		createListTypeLiteral(
			if( members.size == 0 ) {
				null
			} else {
				members.head.type
			}
		)
	}

	def private dispatch type_(CallbackResponseExpression it) {
		val interfaceCall = containerHaving(typeof(InterfaceCallExpression))
		if( interfaceCall == null ) {
			unhandled
		} else {
			if( it == interfaceCall.input ) {
				// 'response' is used as the parameter to an interface call, so it's type is determined by the "outer" call:
				val outerCall = interfaceCall.eContainer.containerHaving(typeof(InterfaceCallExpression))
				if( outerCall == null ) {
					unhandled
				} else {
					outerCall.serviceId.returnType
				}
			} else {
				interfaceCall.serviceId.returnType
			}
		}
	}

	def private dispatch type_(CallbackExpression it)				{ createCallbackLiteral }
	def private dispatch type_(CallbackErrorResponseExpression it)	{ createCallbackErrorResponseLiteral }
	def private dispatch type_(InterfaceCallExpression it)			{ serviceId.returnType }
	def private dispatch type_(StructureCreationExpression it)		{ structure.createDefinedTypeLiteral }

	def private dispatch type_(ReferenceExpression it) {
		if( ref?.eIsProxy ) null else ref.refType
	}

	def private dispatch type_(DateExpression it)					{ DATE.createBuiltinTypeLiteral }
	def private dispatch type_(BuiltinFunctionExpression it) {
		switch function {
			case COPY_OF:	argument.type
			case IS_SET:	BOOLEAN.createBuiltinTypeLiteral
			case TO_MILLIS:	NUMBER.createBuiltinTypeLiteral
			case ROUND:		INTEGER.createBuiltinTypeLiteral
			case ALERT:		createVoidLiteral
			case CONFIRM:	BOOLEAN.createBuiltinTypeLiteral
			case IS_VALID:	BOOLEAN.createBuiltinTypeLiteral
			case ID:		STRING.createBuiltinTypeLiteral
			default:		null
		}
	}

	def private dispatch type_(SelectionExpression it) {
		switch containerHaving(typeof(Element)) {
			CalendarElement:		DATE.createBuiltinTypeLiteral
			TimeSlotListElement:	slotStructure.createDefinedTypeLiteral
			default:				return null		// (return is required for this dispatch function to have correct return type)
		}
	}

	def private dispatch type_(MethodCallExpression it)			{ method.refType }

	def private dispatch type_(DecisionExpression it) {
		if( cases.empty ) {
			defaultValueExpr?.type
		} else {
			cases.head.valueExpr.type
		}
	}


	/*
	 * +---------------------+
	 * | referable instances |
	 * +---------------------+
	 */

	def private TypeLiteral refType(Referable it) {
		switch it {
			Value:			if( declaration.declaredType == null ) { declaration.valueExpr?.type_ } else { declaration.declaredType }	// (returns null in case of parse/validation error)
			Parameter:		it.type
			ListVariable:	<TypeLiteral>ifIndexVarThenElse( [INTEGER.createBuiltinTypeLiteral], [valueVariableType] )
			Method:			it.returnType
			default:		{
								logProblem('''encountered «IF eIsProxy»unresolved proxy of «ENDIF»«eClass.name» in dispatch to TypeCalculator#refType'''.toString)
								null
							}
		}
	}

	override TypeLiteral returnType(Method it) {
		val statements = definition.statementBlock.statements
		if( !statements.empty && statements.last.hasResultValue ) {
			statements.last.resultType
			// FIXME  this computation doesn't deal with a recursive chain of method calls for which no type can inferred
			// TODO   detect recursive type computation and report suitably (but how to propagate to an error?!)
		} else {
			createVoidLiteral
		}
	}


	/*
	 * +------------------+
	 * | helper functions |
	 * +------------------+
	 */

	def private unhandled(EObject it) {
		println("WARNING\tdon't know how to compute type for instance of " + ^class.simpleName + " (returning Void)")
		createVoidLiteral
	}

	/**
	 * @return The {@link Structure} named '{@code Slot}' anywhere in the global scope, or {@code null}.
	 */
	def private slotStructure(EObject context) {
		scopeProvider.getScope(context, SimUiDslPackage::eINSTANCE.structureCreationExpression_Structure).allElements.map[EObjectOrProxy as Structure].findFirst[it.name == 'Slot']
	}

}

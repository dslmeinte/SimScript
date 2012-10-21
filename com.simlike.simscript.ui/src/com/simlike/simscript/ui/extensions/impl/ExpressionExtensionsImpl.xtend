package com.simlike.simscript.ui.extensions.impl

import com.google.inject.Inject
import com.google.inject.Singleton
import com.simlike.simscript.structure.structureDsl.TypeLiteral
import com.simlike.simscript.structure.types.TypeExtensions
import com.simlike.simscript.ui.extensions.ExpressionExtensions
import com.simlike.simscript.ui.extensions.MethodExtensions
import com.simlike.simscript.ui.extensions.ReferableExtensions
import com.simlike.simscript.ui.simUiDsl.BinaryOperatorExpression
import com.simlike.simscript.ui.simUiDsl.BuiltinFunctionExpression
import com.simlike.simscript.ui.simUiDsl.BuiltinFunctions
import com.simlike.simscript.ui.simUiDsl.CallbackExpression
import com.simlike.simscript.ui.simUiDsl.DecisionExpression
import com.simlike.simscript.ui.simUiDsl.Expression
import com.simlike.simscript.ui.simUiDsl.FeatureAccessExpression
import com.simlike.simscript.ui.simUiDsl.InterfaceCallExpression
import com.simlike.simscript.ui.simUiDsl.ListVariable
import com.simlike.simscript.ui.simUiDsl.LiteralExpression
import com.simlike.simscript.ui.simUiDsl.Method
import com.simlike.simscript.ui.simUiDsl.MethodCallExpression
import com.simlike.simscript.ui.simUiDsl.NotExpression
import com.simlike.simscript.ui.simUiDsl.Parameter
import com.simlike.simscript.ui.simUiDsl.ReferenceExpression
import com.simlike.simscript.ui.simUiDsl.TernaryExpression
import com.simlike.simscript.ui.simUiDsl.Value
import com.simlike.simscript.ui.types.TypeCalculator
import com.simlike.simscript.util.XtextUtil
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static com.simlike.simscript.ui.simUiDsl.BuiltinFunctions.*

/**
 * Class with common extensions on {@link Expression expressions}.
 * 
 * @author Meinte Boersma
 */
@Singleton
class ExpressionExtensionsImpl implements ExpressionExtensions {

	@Inject extension TypeExtensions
	@Inject extension TypeCalculator
	@Inject extension ReferableExtensions
	@Inject extension MethodExtensions methodExtensions

	@Inject extension XtextUtil


	/*
	 * +-------------+
	 * | l-valueness |
	 * +-------------+
	 */

	def dispatch isLValue(FeatureAccessExpression it)		{ previous.LValue as boolean }	// (cast is necessary to get type inference to work in the face of recursion)
	def dispatch isLValue(ReferenceExpression it)			{ ref.LValue_ }
	def dispatch isLValue(Expression it)					{ false }						// (sentinel @ Expression-level)

	def private dispatch isLValue_(Value it)				{ variable }
	def private dispatch isLValue_(Parameter it)			{ !(type.callback || type.voidTyped) }
	def private dispatch isLValue_(ListVariable it) 		{ ifIndexVarThenElse([false], [valueVariableType.structureTyped]) }
	def private dispatch isLValue_(Method it)				{ false }

	// sentinel:
	def private dispatch isLValue_(EObject it) {
		if( eIsProxy ) {
			logProblem("encountered unresolved proxy during LValue_ computation")
		}
		false
	}


	/*
	 * +-------------+
	 * | observables |
	 * +-------------+
	 */

	override isObservable(Expression it) {
		switch it {
			BinaryOperatorExpression:	it.leftOperand.observable && it.rightOperand.observable
			TernaryExpression:			true
			NotExpression:				true
			FeatureAccessExpression:	true
			ReferenceExpression:		true
			InterfaceCallExpression:	!it.observeSites.empty
			BuiltinFunctionExpression:	it.function.observable && it.argument.observable
			MethodCallExpression:		it.method.pure
			DecisionExpression:			true
			LiteralExpression:			true	// note: literal expressions are not referable like variables so observing them has no use - they can't be changed
			CallbackExpression:			false
			default:
				{
					logProblem('''don't know (explicitly) whether sub type «eClass.name» of Expression is observable: assuming it is not''')
					false
				}
		}
	}

	/**
	 * @return Whether the given {@link BuiltinFunctions built-in function} is observable.
	 */
	def private isObservable(BuiltinFunctions it) {
		switch it {
			case IS_SET:	true
			case TO_MILLIS:	true
			case ROUND:		true
			case COPY_OF:	false
			case ALERT:		false
			case CONFIRM:	false
			case IS_VALID:	true
			case ID:		true
		}
	}

	override Set<? extends Expression> valuesToObserve(Expression it) {
		switch it {
			BinaryOperatorExpression:	it.leftOperand.valuesToObserve + it.rightOperand.valuesToObserve
			TernaryExpression:			it.guard.valuesToObserve
			NotExpression:				it.operand.valuesToObserve
			FeatureAccessExpression:	it.observeSingleton
			ReferenceExpression:		it.observeSingleton
			InterfaceCallExpression:	it.observeSites.map[ e | e.valuesToObserve ].union
			BuiltinFunctionExpression:	it.argument.valuesToObserve
			MethodCallExpression:		methodExtensions.valuesToObserve(it)
				/*
				 * TODO  fix difference between top-level functions that have no computational context beyond [...]
				 * 			the parameters they are passed and functions inside viewables that may reference a value
				 * TODO  fix problem with Viewable-local functions that don't have explicit parameters but have
				 * 			implicit ones: the values of the Viewable
				 * TODO  define computational/evaluational context for methods/functions
				 */
			DecisionExpression:			it.cases.map[ c | c.guardExpr.valuesToObserve ].union
			LiteralExpression:			nothingToObserve
			default:					{
											logProblem('''don't know how to (explicitly) compute values to observe for sub type «eClass.name» of Expression: assuming there's nothing to observe''')
											nothingToObserve
										}
		}
	}


	/*
	 * +---------------+
	 * | miscellaneous |
	 * +---------------+
	 */

	override method(MethodCallExpression it) {
		methodRef.ref.checkedCast(typeof(Method))
	}

	override typeCompatible(TypeLiteral leftType, Expression right) {
		right.type.vaguelyTyped || leftType.isAssignableFrom(right.type)
		// TODO  strengthen this some more
	}

	override nothingToObserve() {
		<Expression>newLinkedHashSet
	}

	override observeSingleton(Expression it) {
		<Expression>newLinkedHashSet(it)
	}

}

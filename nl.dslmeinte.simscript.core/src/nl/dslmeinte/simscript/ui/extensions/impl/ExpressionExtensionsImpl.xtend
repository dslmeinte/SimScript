package nl.dslmeinte.simscript.ui.extensions.impl

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.Set
import nl.dslmeinte.simscript.types.TypeExtensions
import nl.dslmeinte.simscript.types.TypeLiteral
import nl.dslmeinte.simscript.ui.extensions.ExpressionExtensions
import nl.dslmeinte.simscript.ui.extensions.MethodExtensions
import nl.dslmeinte.simscript.ui.extensions.ReferableExtensions
import nl.dslmeinte.simscript.ui.simUiDsl.BinaryOperatorExpression
import nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression
import nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctions
import nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression
import nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression
import nl.dslmeinte.simscript.ui.simUiDsl.Expression
import nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression
import nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression
import nl.dslmeinte.simscript.ui.simUiDsl.ListVariable
import nl.dslmeinte.simscript.ui.simUiDsl.LiteralExpression
import nl.dslmeinte.simscript.ui.simUiDsl.Method
import nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression
import nl.dslmeinte.simscript.ui.simUiDsl.NotExpression
import nl.dslmeinte.simscript.ui.simUiDsl.Parameter
import nl.dslmeinte.simscript.ui.simUiDsl.ReferenceExpression
import nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression
import nl.dslmeinte.simscript.ui.simUiDsl.Value
import nl.dslmeinte.simscript.ui.types.TypeCalculator
import nl.dslmeinte.simscript.util.XtextUtil
import org.eclipse.emf.ecore.EObject

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

	def dispatch boolean isLValue(FeatureAccessExpression it)	{ previous.LValue }
	def dispatch boolean isLValue(ReferenceExpression it)		{ ref.LValue_ }
	def dispatch boolean isLValue(Expression it)				{ false }				// (sentinel @ Expression-level)

	def private dispatch isLValue_(Value it)				{ variable }
	def private dispatch isLValue_(Parameter it)			{ !(type.callback || type.voidTyped) }
	def private dispatch isLValue_(ListVariable it) 		{ ifIndexVarThenElse([false], [valueVariableType.structureTyped]) as boolean }
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
			case CONFIRM:	false
			case IS_VALID:	true
			case ID:		true
			default:		throw new RuntimeException("unhandled enum: " + name())
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

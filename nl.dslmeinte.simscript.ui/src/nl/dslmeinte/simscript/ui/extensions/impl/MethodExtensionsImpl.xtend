package nl.dslmeinte.simscript.ui.extensions.impl

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.ui.extensions.ExpressionExtensions
import nl.dslmeinte.simscript.ui.extensions.MethodExtensions
import nl.dslmeinte.simscript.ui.extensions.StatementExtensions
import nl.dslmeinte.simscript.ui.simUiDsl.Argument
import nl.dslmeinte.simscript.ui.simUiDsl.Expression
import nl.dslmeinte.simscript.ui.simUiDsl.Method
import nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression
import nl.dslmeinte.simscript.ui.simUiDsl.MethodDefinition
import nl.dslmeinte.simscript.ui.simUiDsl.UiModule
import nl.dslmeinte.simscript.util.XtextUtil
import java.util.Set

@Singleton
class MethodExtensionsImpl implements MethodExtensions {

	@Inject extension ExpressionExtensions
	@Inject extension StatementExtensions

	@Inject extension XtextUtil


	override definition(Method it) {
		eContainer.checkedCast(typeof(MethodDefinition))
	}

	override isTopLevel(Method it) {
		definition.eContainer instanceof UiModule
	}

	override isFunction(Method it) {
		definition.statementBlock.statements.last?.hasResultValue
	}

	override arguments(MethodCallExpression it) {
		argumentList.arguments as Iterable<Argument>
	}

	override valuesToObserve(MethodCallExpression it) {
		arguments.map[it.valueExpr.valuesToObserve].flatten.toSet as Set<? extends Expression>	// (cast required for Xtend2.2 compatibility)
//			+ method.definition.statementBlock.statements.map[it.valuesToObserve].flatten.toSet
	}

	override isPure(Method it) {
		function && definition.statementBlock.statements.forall[it.isPure]
	}

}

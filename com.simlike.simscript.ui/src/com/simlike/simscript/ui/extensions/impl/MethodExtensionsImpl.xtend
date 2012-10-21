package com.simlike.simscript.ui.extensions.impl

import com.google.inject.Inject
import com.google.inject.Singleton
import com.simlike.simscript.ui.extensions.ExpressionExtensions
import com.simlike.simscript.ui.extensions.MethodExtensions
import com.simlike.simscript.ui.extensions.StatementExtensions
import com.simlike.simscript.ui.simUiDsl.Argument
import com.simlike.simscript.ui.simUiDsl.Expression
import com.simlike.simscript.ui.simUiDsl.Method
import com.simlike.simscript.ui.simUiDsl.MethodCallExpression
import com.simlike.simscript.ui.simUiDsl.MethodDefinition
import com.simlike.simscript.ui.simUiDsl.UiModule
import com.simlike.simscript.util.XtextUtil
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

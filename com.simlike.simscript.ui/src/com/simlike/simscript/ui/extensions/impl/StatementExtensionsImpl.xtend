package com.simlike.simscript.ui.extensions.impl

import com.google.inject.Inject
import com.google.inject.Singleton
import com.simlike.simscript.structure.structureDsl.VoidLiteral
import com.simlike.simscript.structure.types.TypeExtensions
import com.simlike.simscript.ui.extensions.ExpressionExtensions
import com.simlike.simscript.ui.extensions.StatementExtensions
import com.simlike.simscript.ui.simUiDsl.AssignmentOrExpressionStatement
import com.simlike.simscript.ui.simUiDsl.LocalValueDeclarationStatement
import com.simlike.simscript.ui.simUiDsl.Statement
import com.simlike.simscript.ui.simUiDsl.StatementBlock
import com.simlike.simscript.ui.types.TypeCalculator
import com.simlike.simscript.util.XtextUtil

@Singleton
class StatementExtensionsImpl implements StatementExtensions {

	@Inject extension TypeCalculator
	@Inject extension TypeExtensions
	@Inject extension ExpressionExtensions

	@Inject extension XtextUtil


	override precedingLocalValues(Statement it) {
		val statements = eContainer.checkedCast(typeof(StatementBlock)).statements
		val index = statements.indexOf(it)
			// indices are 0-based so taking an `index` # of elements excludes the current Statement
		statements.take(index).filter(typeof(LocalValueDeclarationStatement)).map[value]
	}


	override isAssignment(AssignmentOrExpressionStatement it) {
		rhs != null
	}


	override isExpression(AssignmentOrExpressionStatement it) {
		rhs == null
	}


	override hasResultValue(Statement it) {
		!(resultType instanceof VoidLiteral)
	}


	override resultType(Statement it) {
		switch it {
			AssignmentOrExpressionStatement case assignment:	createVoidLiteral
			AssignmentOrExpressionStatement case expression:	it.lhs.type
			default:											createVoidLiteral
		}
	}


	override valuesToObserve(Statement it) {
		switch it {
			AssignmentOrExpressionStatement case expression:	it.lhs.valuesToObserve
			LocalValueDeclarationStatement:						it.valueExpr.valuesToObserve
			default:											nothingToObserve
		}
	}


	override isPure(Statement it) {
		switch it {
			AssignmentOrExpressionStatement:	it.expression
			LocalValueDeclarationStatement:		true
			default:							false
		}
	}

}

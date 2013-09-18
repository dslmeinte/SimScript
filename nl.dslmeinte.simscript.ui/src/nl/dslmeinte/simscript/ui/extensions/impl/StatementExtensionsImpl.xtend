package nl.dslmeinte.simscript.ui.extensions.impl

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.structure.structureDsl.VoidLiteral
import nl.dslmeinte.simscript.structure.types.TypeExtensions
import nl.dslmeinte.simscript.ui.extensions.ExpressionExtensions
import nl.dslmeinte.simscript.ui.extensions.StatementExtensions
import nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement
import nl.dslmeinte.simscript.ui.simUiDsl.LocalValueDeclarationStatement
import nl.dslmeinte.simscript.ui.simUiDsl.Statement
import nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock
import nl.dslmeinte.simscript.ui.types.TypeCalculator
import nl.dslmeinte.simscript.util.XtextUtil

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

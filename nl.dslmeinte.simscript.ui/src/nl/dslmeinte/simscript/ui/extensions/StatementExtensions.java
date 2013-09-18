package nl.dslmeinte.simscript.ui.extensions;

import java.util.Set;

import com.google.inject.ImplementedBy;
import nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral;
import nl.dslmeinte.simscript.ui.extensions.impl.StatementExtensionsImpl;
import nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.Statement;
import nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock;
import nl.dslmeinte.simscript.ui.simUiDsl.Value;

@ImplementedBy(StatementExtensionsImpl.class)
public interface StatementExtensions {

	/**
	 * @return The locally-defined {@link Value values} preceding this {@link Statement} in its {@link StatementBlock}.
	 */
	Iterable<Value> precedingLocalValues(Statement it);

	/**
	 * @return Whether this {@link AssignmentOrExpressionStatement} is (actually) an assignment.
	 */
	boolean isAssignment(AssignmentOrExpressionStatement it);

	/**
	 * @return Whether this {@link AssignmentOrExpressionStatement} is a (lone) expression.
	 */
	boolean isExpression(AssignmentOrExpressionStatement it);

	/**
	 * @return Whether this {@link Statement} has a (non-void) result value.
	 * (This is relevant for determining whether a {@link Method} is a function or a procedure.)
	 */
	boolean hasResultValue(Statement it);

	/**
	 * @return The result type of this {@link Statement}.
	 */
	TypeLiteral resultType(Statement it);

	/**
	 * @return A set of {@link Expression expressions} which are observed by the given {@link Statement}.
	 */
	Set<? extends Expression> valuesToObserve(Statement it);

	/**
	 * @return Whether this {@link Statement} can be considered to be a pure (i.e., side-effect free) functional statement.
	 */
	boolean isPure(Statement it);

}

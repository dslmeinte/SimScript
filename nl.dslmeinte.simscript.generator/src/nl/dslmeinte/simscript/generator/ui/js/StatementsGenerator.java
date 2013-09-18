package nl.dslmeinte.simscript.generator.ui.js;

import com.google.inject.ImplementedBy;
import nl.dslmeinte.simscript.generator.ui.js.impl.StatementsGeneratorImpl;
import nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.Statement;
import nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock;

@ImplementedBy(StatementsGeneratorImpl.class)
public interface StatementsGenerator {

	String asJs(Statement it);

	CharSequence asJs(StatementBlock it, ReturnFlags returnFlag);

	CharSequence asJs(CallbackExpression it);

}

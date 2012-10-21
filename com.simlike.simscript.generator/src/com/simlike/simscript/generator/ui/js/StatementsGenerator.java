package com.simlike.simscript.generator.ui.js;

import com.google.inject.ImplementedBy;
import com.simlike.simscript.generator.ui.js.impl.StatementsGeneratorImpl;
import com.simlike.simscript.ui.simUiDsl.CallbackExpression;
import com.simlike.simscript.ui.simUiDsl.Statement;
import com.simlike.simscript.ui.simUiDsl.StatementBlock;

@ImplementedBy(StatementsGeneratorImpl.class)
public interface StatementsGenerator {

	String asJs(Statement it);

	CharSequence asJs(StatementBlock it, ReturnFlags returnFlag);

	CharSequence asJs(CallbackExpression it);

}

package com.simlike.simscript.generator.ui.js;

import com.google.inject.ImplementedBy;
import com.simlike.simscript.generator.ui.js.impl.ExpressionsGeneratorImpl;
import com.simlike.simscript.ui.simUiDsl.Expression;

@ImplementedBy(ExpressionsGeneratorImpl.class)
public interface ExpressionsGenerator {

	CharSequence asPlainJs(Expression it);
	CharSequence asObservableJs(Expression it);

}

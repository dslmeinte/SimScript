package nl.dslmeinte.simscript.generator.ui.js;

import com.google.inject.ImplementedBy;
import nl.dslmeinte.simscript.generator.ui.js.impl.ExpressionsGeneratorImpl;
import nl.dslmeinte.simscript.ui.simUiDsl.Expression;

@ImplementedBy(ExpressionsGeneratorImpl.class)
public interface ExpressionsGenerator {

	CharSequence asPlainJs(Expression it);
	CharSequence asObservableJs(Expression it);

}

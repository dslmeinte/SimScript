package nl.dslmeinte.simscript.generator.ui.js;

import nl.dslmeinte.simscript.generator.ui.js.impl.ExpressionsGeneratorImpl;
import nl.dslmeinte.simscript.ui.simUiDsl.Expression;

import com.google.inject.ImplementedBy;

@ImplementedBy(ExpressionsGeneratorImpl.class)
public interface ExpressionsGenerator {

	/**
	 * @return JS code that represents the value given {@link Expression} in a wrapped form (which can be observed).
	 * 			The wrapping is done through the use of the Item, Literal and List JS-types.
	 */
	CharSequence asObservableJs(Expression it);

	/**
	 * @return JS code that evaluates the given {@link Expression} as a(n unwrapped) value.
	 */
	CharSequence asPlainJs(Expression it);

}

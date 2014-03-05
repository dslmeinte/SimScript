package nl.dslmeinte.simscript.ui.types;

import nl.dslmeinte.simscript.types.TypeLiteral;
import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.Method;

import com.google.inject.ImplementedBy;

@ImplementedBy(TypeCalculatorImpl.class)
public interface TypeCalculator {

	TypeLiteral type(Expression it);
	TypeLiteral returnType(Method it);

}

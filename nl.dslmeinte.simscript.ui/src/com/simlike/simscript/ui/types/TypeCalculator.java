package nl.dslmeinte.simscript.ui.types;

import com.google.inject.ImplementedBy;
import nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral;
import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.Method;

@ImplementedBy(TypeCalculatorImpl.class)
public interface TypeCalculator {

	TypeLiteral type(Expression it);
	TypeLiteral returnType(Method it);

}

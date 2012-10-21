package com.simlike.simscript.ui.types;

import com.google.inject.ImplementedBy;
import com.simlike.simscript.structure.structureDsl.TypeLiteral;
import com.simlike.simscript.ui.simUiDsl.Expression;
import com.simlike.simscript.ui.simUiDsl.Method;

@ImplementedBy(TypeCalculatorImpl.class)
public interface TypeCalculator {

	TypeLiteral type(Expression it);
	TypeLiteral returnType(Method it);

}

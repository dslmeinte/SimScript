package com.simlike.simscript.ui.extensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import com.google.inject.ImplementedBy;
import com.simlike.simscript.structure.structureDsl.TypeLiteral;
import com.simlike.simscript.ui.extensions.impl.ReferableExtensionsImpl;
import com.simlike.simscript.ui.simUiDsl.AbstractValueDeclaration;
import com.simlike.simscript.ui.simUiDsl.ListElement;
import com.simlike.simscript.ui.simUiDsl.ListVariable;
import com.simlike.simscript.ui.simUiDsl.Value;

@ImplementedBy(ReferableExtensionsImpl.class)
public interface ReferableExtensions {

	/**
	 * Inverse of {@link VariableDeclaration}{@code .variable}.
	 */
	AbstractValueDeclaration declaration(Value it);

	/**
	 * Finds the {@link ListElement} which defines the given {@link ListVariable}
	 * and performs the given Xtend functions for the case when it's the index or
	 * the value variable.
	 */
	<T extends Object> T ifIndexVarThenElse(ListVariable it,
			Function1<? super ListElement, ? extends T> indexFunc,
			Function1<? super ListElement, ? extends T> valueFunc);

	/**
	 * @return Whether this {@link Value} is variable, i.e. represents a variable.
	 */
	Boolean isVariable(Value it);

	/**
	 * @return Whether this {@link Value} is derived, i.e. represents a derived value.
	 */
	Boolean isDerived(Value it);

	/**
	 * @return The type of the <em>value</em> {@link ListVariable} of the {@link ListElement} given.
	 */
	TypeLiteral valueVariableType(ListElement it);

}
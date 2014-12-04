package nl.dslmeinte.simscript.ui.extensions;

import nl.dslmeinte.simscript.types.TypeLiteral;
import nl.dslmeinte.simscript.ui.extensions.impl.ReferableExtensionsImpl;
import nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration;
import nl.dslmeinte.simscript.ui.simUiDsl.ListElement;
import nl.dslmeinte.simscript.ui.simUiDsl.ListVariable;
import nl.dslmeinte.simscript.ui.simUiDsl.Value;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import com.google.inject.ImplementedBy;

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
	boolean isVariable(Value it);

	/**
	 * @return The type of the <em>value</em> {@link ListVariable} of the {@link ListElement} given.
	 */
	TypeLiteral valueVariableType(ListElement it);

}
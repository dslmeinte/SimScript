package nl.dslmeinte.simscript.ui.extensions;

import java.util.List;

import com.google.inject.ImplementedBy;
import nl.dslmeinte.simscript.ui.extensions.impl.ViewableExtensionsImpl;
import nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable;
import nl.dslmeinte.simscript.ui.simUiDsl.Element;
import nl.dslmeinte.simscript.ui.simUiDsl.MethodDefinition;
import nl.dslmeinte.simscript.ui.simUiDsl.Value;
import nl.dslmeinte.simscript.ui.simUiDsl.Viewable;

@ImplementedBy(ViewableExtensionsImpl.class)
public interface ViewableExtensions {

	/**
	 * @return The {@link Element elements} contained in this {@link Viewable}.
	 */
	Iterable<Element> elements(DefinedViewable it);

	/**
	 * @return The local {@link MethodDefinition method definitions} contained in this {@link Viewable}.
	 */
	Iterable<MethodDefinition> localMethodDefinitions(DefinedViewable it);

	/**
	 * @return The {@link Value values} declared in the <b>values</b>-block of this {@link Viewable}.
	 */
	List<Value> values(final DefinedViewable it);

	/**
	 * @return Whether this {@link Viewable} is a re-usable component (not a screen).
	 */
	boolean isComponent(final Viewable it);

	/**
	 * @return Whether this {@link Viewable} is a screen.
	 */
	boolean isScreen(final Viewable it);

}
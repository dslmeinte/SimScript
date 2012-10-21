package com.simlike.simscript.ui.extensions;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.ImplementedBy;
import com.simlike.simscript.ui.extensions.impl.StructuralExtensionsImpl;
import com.simlike.simscript.ui.simUiDsl.Argument;
import com.simlike.simscript.ui.simUiDsl.GotoModuleStatement;
import com.simlike.simscript.ui.simUiDsl.GotoScreenStatement;
import com.simlike.simscript.ui.simUiDsl.Method;
import com.simlike.simscript.ui.simUiDsl.Parameter;
import com.simlike.simscript.ui.simUiDsl.TableRowsDefinition;
import com.simlike.simscript.ui.simUiDsl.TableRowsInvocation;
import com.simlike.simscript.ui.simUiDsl.TopLevelDefinition;
import com.simlike.simscript.ui.simUiDsl.UiModule;
import com.simlike.simscript.ui.simUiDsl.Viewable;
import com.simlike.simscript.ui.simUiDsl.ViewableCallSite;

@ImplementedBy(StructuralExtensionsImpl.class)
public interface StructuralExtensions {

	/**
	 * @return The effective name of the {@link UiModule}, derived from its file name.
	 */
	String name(UiModule it);

	/**
	 * @return Whether this {@link UiModule} is authenticated - which is the
	 *         default.
	 */
	boolean isAuthenticated(UiModule it);

	/**
	 * @return All the {@link Viewable}s of the module.
	 */
	Iterable<Viewable> viewables(UiModule it);

	/**
	 * @return All the {@link TableRowsDefinition} of the module.
	 */
	Iterable<TableRowsDefinition> tableRowsDefinitions(UiModule it);

	/**
	 * @return All the {@link Method methods} of the module.
	 */
	Iterable<Method> topLevelMethods(UiModule it);

	/**
	 * @return The first actual screen of this module.
	 */
	Viewable firstScreen(UiModule it);

	/**
	 * @return A {@link Set} of all modules explicitly called by this module,
	 * 	through a {@code goto-module} {@link GotoModuleStatement statement}.
	 */
	Set<UiModule> calledModules(UiModule it);

	/**
	 * @return The {@link UiModule UI module} this {@link Viewable} resides in.
	 */
	UiModule module(Viewable it);

	/**
	 * @return A {@link Set} of all modules referenced by this {@link UiModule UI module}
	 * 	either explicitly through a {@code goto-module} {@link GotoModuleStatement statement}
	 * 	or implicitly through a {@code goto(-screen)} {@link GotoScreenStatement statement}
	 * 	where the target screen is located in another module.
	 */
	Set<UiModule> referredModules(UiModule it);

	/**
	 * @return A {@link Set} of all modules (transitively) referred to by/from this module.
	 */
	Set<UiModule> allReferredModules(UiModule it);

	/**
	 * @return The containing {@link UiModule}.
	 */
	UiModule containingModule(EObject it);

	/**
	 * +--------------------------+
	 * | parameters and arguments |
	 * +--------------------------+
	 * 
	 * The reuse of parameter and argument lists into separate type rules
	 * (and thus: types) is essentially a grammar engineering matter and
	 * clients of types having such lists shouldn't be burdened with that
	 * choice.
	 */
	Iterable<Parameter> parameters(TopLevelDefinition it);

	Iterable<Argument> arguments(ViewableCallSite it);

	Iterable<Argument> arguments(TableRowsInvocation it);

}
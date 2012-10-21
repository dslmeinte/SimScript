package com.simlike.simscript.ui.extensions;

import java.util.Set;

import com.google.inject.ImplementedBy;
import com.simlike.simscript.ui.extensions.impl.MethodExtensionsImpl;
import com.simlike.simscript.ui.simUiDsl.Argument;
import com.simlike.simscript.ui.simUiDsl.Expression;
import com.simlike.simscript.ui.simUiDsl.Method;
import com.simlike.simscript.ui.simUiDsl.MethodCallExpression;
import com.simlike.simscript.ui.simUiDsl.MethodDefinition;
import com.simlike.simscript.ui.simUiDsl.Viewable;

@ImplementedBy(MethodExtensionsImpl.class)
public interface MethodExtensions {

	/**
	 * @return The {@link MethodDefinition} defining the given {@link Method} - provides access to parameters and such.
	 */
	MethodDefinition definition(Method it);

	/**
	 * @return Whether the given {@link Method} is defined at top-level (as opposed to: inside a {@link Viewable}).
	 */
	boolean isTopLevel(Method it);

	/**
	 * @return Whether the indicated {@link Method} is actually a function.
	 */
	boolean isFunction(Method it);

	/**
	 * @return The {@link Argument arguments} of this {@link MethodCallExpression}.
	 */
	Iterable<Argument> arguments(MethodCallExpression it);

	/**
	 * @return The set of {@link Expression value expressions} to observe in this {@link MethodCallExpression}.
	 */
	Set<? extends Expression> valuesToObserve(MethodCallExpression it);

	/**
	 * @return Whether this {@link Method} is a pure function.
	 */
	boolean isPure(Method it);

}
package nl.dslmeinte.simscript.ui;

import nl.dslmeinte.simscript.ui.index.SimUiResourceDescriptionStrategy;

import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;

public class SimUiDslRuntimeModule extends nl.dslmeinte.simscript.ui.AbstractSimUiDslRuntimeModule {

	/**
	 * Make sure the right model elements are exported to the Index.
	 */
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return SimUiResourceDescriptionStrategy.class;
	}

	public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
		return nl.dslmeinte.simscript.ui.scoping.SimUiDslScopeProvider.class;
	}

}

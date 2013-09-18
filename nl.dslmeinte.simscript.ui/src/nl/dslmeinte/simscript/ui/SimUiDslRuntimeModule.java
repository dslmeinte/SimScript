package nl.dslmeinte.simscript.ui;

import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;

import nl.dslmeinte.simscript.ui.index.SimUiResourceDescriptionStrategy;

public class SimUiDslRuntimeModule extends nl.dslmeinte.simscript.ui.AbstractSimUiDslRuntimeModule {

	/**
	 * Make sure the right model elements are exported to the Index.
	 */
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return SimUiResourceDescriptionStrategy.class;
	}

}

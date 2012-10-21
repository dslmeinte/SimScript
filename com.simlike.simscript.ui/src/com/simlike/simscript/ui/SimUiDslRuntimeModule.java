package com.simlike.simscript.ui;

import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;

import com.simlike.simscript.ui.index.SimUiResourceDescriptionStrategy;

public class SimUiDslRuntimeModule extends com.simlike.simscript.ui.AbstractSimUiDslRuntimeModule {

	/**
	 * Make sure the right model elements are exported to the Index.
	 */
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return SimUiResourceDescriptionStrategy.class;
	}

}

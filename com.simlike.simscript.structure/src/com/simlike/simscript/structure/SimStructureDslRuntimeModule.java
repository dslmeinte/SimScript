package com.simlike.simscript.structure;

import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;

import com.simlike.simscript.structure.index.SimStructureResourceDescriptionStrategy;

public class SimStructureDslRuntimeModule extends AbstractSimStructureDslRuntimeModule {

	/**
	 * Make sure the right model elements are exported to the Index.
	 */
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return SimStructureResourceDescriptionStrategy.class;
	}

}

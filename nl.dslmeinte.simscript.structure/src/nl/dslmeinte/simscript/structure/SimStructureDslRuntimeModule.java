package nl.dslmeinte.simscript.structure;

import nl.dslmeinte.simscript.structure.index.SimStructureResourceDescriptionStrategy;

import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;

public class SimStructureDslRuntimeModule extends AbstractSimStructureDslRuntimeModule {

	/**
	 * Make sure the right model elements are exported to the Index.
	 */
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return SimStructureResourceDescriptionStrategy.class;
	}

}

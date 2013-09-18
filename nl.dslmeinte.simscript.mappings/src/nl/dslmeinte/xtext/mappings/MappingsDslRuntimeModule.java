package nl.dslmeinte.simscript.mappings;

import nl.dslmeinte.simscript.mappings.index.MappingsResourceDescriptionStrategy;

import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;

public class MappingsDslRuntimeModule extends nl.dslmeinte.simscript.mappings.AbstractMappingsDslRuntimeModule {

	/**
	 * Make sure the right model elements are exported to the Index.
	 */
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return MappingsResourceDescriptionStrategy.class;
	}

}

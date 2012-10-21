package nl.dslmeinte.xtext.mappings;

import nl.dslmeinte.xtext.mappings.index.MappingsResourceDescriptionStrategy;

import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;

public class MappingsDslRuntimeModule extends nl.dslmeinte.xtext.mappings.AbstractMappingsDslRuntimeModule {

	/**
	 * Make sure the right model elements are exported to the Index.
	 */
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return MappingsResourceDescriptionStrategy.class;
	}

}

package nl.dslmeinte.xtext.simpleDb;

import nl.dslmeinte.xtext.simpleDb.index.SimpleDbResourceDescriptionStrategy;

import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;

public class SimpleDbDslRuntimeModule extends nl.dslmeinte.xtext.simpleDb.AbstractSimpleDbDslRuntimeModule {

	/**
	 * Make sure the right model elements are exported to the Index.
	 */
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return SimpleDbResourceDescriptionStrategy.class;
	}

}

package nl.dslmeinte.simscript.simpleDb;

import nl.dslmeinte.simscript.simpleDb.index.SimpleDbResourceDescriptionStrategy;

import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;

public class SimpleDbDslRuntimeModule extends nl.dslmeinte.simscript.simpleDb.AbstractSimpleDbDslRuntimeModule {

	/**
	 * Make sure the right model elements are exported to the Index.
	 */
	public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return SimpleDbResourceDescriptionStrategy.class;
	}

}

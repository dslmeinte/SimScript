
package nl.dslmeinte.simscript.simpleDb;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SimpleDbDslStandaloneSetup extends SimpleDbDslStandaloneSetupGenerated{

	public static void doSetup() {
		new SimpleDbDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


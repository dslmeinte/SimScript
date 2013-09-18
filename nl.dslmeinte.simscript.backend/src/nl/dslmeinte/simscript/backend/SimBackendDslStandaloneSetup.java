
package nl.dslmeinte.simscript.backend;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SimBackendDslStandaloneSetup extends SimBackendDslStandaloneSetupGenerated{

	public static void doSetup() {
		new SimBackendDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


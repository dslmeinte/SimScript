
package nl.dslmeinte.simscript.application;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SimApplicationDslStandaloneSetup extends SimApplicationDslStandaloneSetupGenerated{

	public static void doSetup() {
		new SimApplicationDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


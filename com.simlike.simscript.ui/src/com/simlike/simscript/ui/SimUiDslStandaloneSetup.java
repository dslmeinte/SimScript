
package com.simlike.simscript.ui;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SimUiDslStandaloneSetup extends SimUiDslStandaloneSetupGenerated{

	public static void doSetup() {
		new SimUiDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


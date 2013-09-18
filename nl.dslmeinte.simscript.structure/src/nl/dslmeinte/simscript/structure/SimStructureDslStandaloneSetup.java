package nl.dslmeinte.simscript.structure;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SimStructureDslStandaloneSetup extends SimStructureDslStandaloneSetupGenerated{

	public static void doSetup() {
		new SimStructureDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


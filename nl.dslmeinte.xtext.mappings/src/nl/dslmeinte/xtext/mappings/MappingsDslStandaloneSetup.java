
package nl.dslmeinte.xtext.mappings;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MappingsDslStandaloneSetup extends MappingsDslStandaloneSetupGenerated{

	public static void doSetup() {
		new MappingsDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


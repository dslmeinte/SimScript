package nl.dslmeinte.simscript.generator.ui.js;

import com.google.inject.ImplementedBy;
import nl.dslmeinte.simscript.backend.simBackendDsl.Service;
import nl.dslmeinte.simscript.generator.ui.js.impl.CommunicationsGeneratorImpl;
import nl.dslmeinte.simscript.ui.simUiDsl.UiModule;

@ImplementedBy(CommunicationsGeneratorImpl.class)
public interface CommunicationsGenerator {

	static String defaultApiBaseUrl = "https://fb.DSLConsultancy.com/api/";

	CharSequence interfaceFunctions(UiModule it);

	CharSequence generateDeclarations(Iterable<Service> it);
}

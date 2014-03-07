package nl.dslmeinte.simscript.ui.extensions;

import nl.dslmeinte.simscript.backend.simBackendDsl.ServiceIdentification;
import nl.dslmeinte.simscript.types.TypeLiteral;
import nl.dslmeinte.simscript.ui.extensions.impl.ServiceExtensionsImpl;

import com.google.inject.ImplementedBy;

@ImplementedBy(ServiceExtensionsImpl.class)
public interface ServiceExtensions {

	TypeLiteral inputType(ServiceIdentification it);

	TypeLiteral returnType(ServiceIdentification it);

	boolean isInterface(ServiceIdentification it);

	boolean isLegacyServlet(ServiceIdentification it);

}

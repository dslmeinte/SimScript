package nl.dslmeinte.simscript.ui.extensions;

import com.google.inject.ImplementedBy;
import nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral;
import nl.dslmeinte.simscript.ui.extensions.impl.ServiceExtensionsImpl;
import nl.dslmeinte.simscript.ui.simUiDsl.ServiceIdentification;

@ImplementedBy(ServiceExtensionsImpl.class)
public interface ServiceExtensions {

	TypeLiteral inputType(ServiceIdentification it);

	TypeLiteral returnType(ServiceIdentification it);

	boolean isInterface(ServiceIdentification it);

	boolean isLegacyServlet(ServiceIdentification it);

}

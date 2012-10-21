package com.simlike.simscript.ui.extensions;

import com.google.inject.ImplementedBy;
import com.simlike.simscript.structure.structureDsl.TypeLiteral;
import com.simlike.simscript.ui.extensions.impl.ServiceExtensionsImpl;
import com.simlike.simscript.ui.simUiDsl.ServiceIdentification;

@ImplementedBy(ServiceExtensionsImpl.class)
public interface ServiceExtensions {

	TypeLiteral inputType(ServiceIdentification it);

	TypeLiteral returnType(ServiceIdentification it);

	boolean isInterface(ServiceIdentification it);

	boolean isLegacyServlet(ServiceIdentification it);

}

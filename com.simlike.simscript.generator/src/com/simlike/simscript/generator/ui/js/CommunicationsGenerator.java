package com.simlike.simscript.generator.ui.js;

import com.google.inject.ImplementedBy;
import com.simlike.simscript.generator.ui.js.impl.CommunicationsGeneratorImpl;
import com.simlike.simscript.ui.simUiDsl.UiModule;

@ImplementedBy(CommunicationsGeneratorImpl.class)
public interface CommunicationsGenerator {

	static String defaultApiBaseUrl = "http://fb.simlike.com/api/";

	CharSequence interfaceFunctions(UiModule it);

}

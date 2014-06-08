package nl.dslmeinte.simscript.generator.ui.internal;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

import nl.dslmeinte.simscript.application.SimApplicationDslRuntimeModule;
import nl.dslmeinte.simscript.backend.SimBackendDslRuntimeModule;
import nl.dslmeinte.simscript.generator.SimScriptGeneratorModule;
import nl.dslmeinte.simscript.generator.ui.SimScriptGeneratorUIModule;
import nl.dslmeinte.simscript.mappings.MappingsDslRuntimeModule;
import nl.dslmeinte.simscript.structure.SimStructureDslRuntimeModule;
import nl.dslmeinte.simscript.ui.SimUiDslRuntimeModule;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	private Injector injector;
	private static Activator INSTANCE;

	public Injector getInjector() {
		return injector;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		try {
		    injector = Guice.createInjector(Modules2.mixin(
		    		new SharedStateModule(), new SimScriptGeneratorModule(), new SimScriptGeneratorUIModule(this),
		    		new SimStructureDslRuntimeModule(), new SimBackendDslRuntimeModule(), new SimApplicationDslRuntimeModule(),
		    		new MappingsDslRuntimeModule(),
		    		new SimUiDslRuntimeModule()
		    			/*
		    			 * Note: for some reason (and only from Xtext >= 2.3), only the extension for the last-registered DSL runtime module
		    			 * is set in the FileExtensionProvider instance. For the other extensions, you'd have to do a full build for the change
		    			 * to be picked up. Since SimScript-UI files tend to be changed most often, I chose this preference.
		    			 */
		    	));
		} catch (Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injector = null;
		super.stop(context);
	}
	
	public static Activator getInstance() {
		return INSTANCE;
	}
	
}

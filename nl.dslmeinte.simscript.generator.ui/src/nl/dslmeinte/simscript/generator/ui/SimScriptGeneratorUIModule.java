package nl.dslmeinte.simscript.generator.ui;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Binder;

public class SimScriptGeneratorUIModule extends AbstractGenericModule {

	private final AbstractUIPlugin plugin;
    
    public SimScriptGeneratorUIModule (AbstractUIPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void configure(Binder binder) {
        super.configure(binder);
        binder.bind(AbstractUIPlugin.class).toInstance(plugin);
        binder.bind(IDialogSettings.class).toInstance(plugin.getDialogSettings());
    }

	public Class<? extends IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
        return MultipleResourceBuilderParticipant.class;
    }

}

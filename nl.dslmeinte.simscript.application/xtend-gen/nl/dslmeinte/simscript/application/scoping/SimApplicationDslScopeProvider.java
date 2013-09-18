package nl.dslmeinte.simscript.application.scoping;

import com.google.common.base.Function;
import com.google.inject.Inject;
import nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel;
import nl.dslmeinte.simscript.ui.extensions.StructuralExtensions;
import nl.dslmeinte.simscript.ui.simUiDsl.UiModule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class SimApplicationDslScopeProvider extends AbstractDeclarativeScopeProvider {
  @Inject
  @Extension
  private StructuralExtensions _structuralExtensions;
  
  public IScope scope_ApplicationModel_entryModule(final ApplicationModel it, final EReference eRef) {
    EList<UiModule> _includedModules = it.getIncludedModules();
    final Function<UiModule,QualifiedName> _function = new Function<UiModule,QualifiedName>() {
      public QualifiedName apply(final UiModule it) {
        String _name = SimApplicationDslScopeProvider.this._structuralExtensions.name(it);
        QualifiedName _create = QualifiedName.create(_name);
        return _create;
      }
    };
    IScope _scopeFor = Scopes.<UiModule>scopeFor(_includedModules, _function, IScope.NULLSCOPE);
    return _scopeFor;
  }
}

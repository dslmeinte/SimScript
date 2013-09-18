package nl.dslmeinte.simscript.application.scoping;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class SimApplicationDslScopeProvider extends AbstractDeclarativeScopeProvider {
  @Inject
  @Extension
  private /* StructuralExtensions */Object _structuralExtensions;
  
  public IScope scope_ApplicationModel_entryModule(final /* ApplicationModel */Object it, final EReference eRef) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field includedModules is undefined for the type SimApplicationDslScopeProvider"
      + "\nThe method or field name is undefined for the type SimApplicationDslScopeProvider");
  }
}

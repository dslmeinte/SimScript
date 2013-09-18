package nl.dslmeinte.simscript.application;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import java.util.Set;
import nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel;
import nl.dslmeinte.simscript.ui.extensions.StructuralExtensions;
import nl.dslmeinte.simscript.ui.simUiDsl.UiModule;
import nl.dslmeinte.simscript.util.XtextUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@Singleton
@SuppressWarnings("all")
public class SimApplicationDslExtensions {
  @Inject
  @Extension
  private StructuralExtensions _structuralExtensions;
  
  @Inject
  @Extension
  private XtextUtil _xtextUtil;
  
  public List<UiModule> allReferredModules(final ApplicationModel it) {
    EList<UiModule> _includedModules = it.getIncludedModules();
    final Function1<UiModule,Set<UiModule>> _function = new Function1<UiModule,Set<UiModule>>() {
      public Set<UiModule> apply(final UiModule m) {
        Set<UiModule> _allReferredModules = SimApplicationDslExtensions.this._structuralExtensions.allReferredModules(m);
        return _allReferredModules;
      }
    };
    List<Set<UiModule>> _map = ListExtensions.<UiModule, Set<UiModule>>map(_includedModules, _function);
    Iterable<UiModule> _flatten = Iterables.<UiModule>concat(_map);
    final Function1<UiModule,String> _function_1 = new Function1<UiModule,String>() {
      public String apply(final UiModule it) {
        String _name = SimApplicationDslExtensions.this._structuralExtensions.name(it);
        return _name;
      }
    };
    List<UiModule> _sortBy = IterableExtensions.<UiModule, String>sortBy(_flatten, _function_1);
    return _sortBy;
  }
  
  public String name(final ApplicationModel it) {
    Resource _eResource = it.eResource();
    String _fileName = this._xtextUtil.fileName(_eResource);
    return _fileName;
  }
}

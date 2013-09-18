package nl.dslmeinte.simscript.application;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import nl.dslmeinte.simscript.util.XtextUtil;
import org.eclipse.xtext.xbase.lib.Extension;

@Singleton
@SuppressWarnings("all")
public class SimApplicationDslExtensions {
  @Inject
  @Extension
  private /* StructuralExtensions */Object _structuralExtensions;
  
  @Inject
  @Extension
  private XtextUtil _xtextUtil;
  
  public Object allReferredModules(final /* ApplicationModel */Object it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field includedModules is undefined for the type SimApplicationDslExtensions"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nmap cannot be resolved"
      + "\nflatten cannot be resolved"
      + "\nsortBy cannot be resolved");
  }
  
  public Object name(final /* ApplicationModel */Object it) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field eResource is undefined for the type SimApplicationDslExtensions"
      + "\nfileName cannot be resolved");
  }
}

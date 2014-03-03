package nl.dslmeinte.simscript.util;

import com.google.common.base.Objects;
import com.google.inject.Singleton;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Util class containing some Xtext niceties for scoping, validation and type
 * calculation.
 * 
 * @author Meinte Boersma
 */
@Singleton
@SuppressWarnings("all")
public class XtextUtil {
  /**
   * @return The innermost {@link EObject} of the given type, containing the
   *         given {@link EObject}.
   */
  public <T extends EObject> T containerHaving(final EObject it, final Class<T> type) {
    return EcoreUtil2.<T>getContainerOfType(it, type);
  }
  
  /**
   * Performs the magic incantation to export the given {@link EObject}
   * under the given name to the global index.
   * <p>
   * To be used in a {@link IDefaultResourceDescriptionStrategy} implementation.
   */
  public void exportName(final EObject it, final String name, final IAcceptor<IEObjectDescription> acceptor) {
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      QualifiedName _create = QualifiedName.create(name);
      IEObjectDescription _create_1 = EObjectDescription.create(_create, it);
      acceptor.accept(_create_1);
    }
  }
  
  /**
   * Raises an error with the given message on the given {@link EObject} (as a
   * whole). Usage pattern:
   * <pre>
   * 	def check_something(Concept it) {
   * 		it.error("some error message", this);
   * 	}
   * </pre>
   * Note the {@code this} as a 2nd -actually 3rd- argument.
   * Also, the {@code it.} is optional.
   */
  public void error(final EObject it, final CharSequence message, final AbstractDeclarativeValidator validator) {
    final ICompositeNode node = NodeModelUtils.getNode(it);
    ValidationMessageAcceptor _messageAcceptor = validator.getMessageAcceptor();
    String _string = message.toString();
    int _offset = node.getOffset();
    int _length = node.getLength();
    _messageAcceptor.acceptError(_string, it, _offset, _length, null);
  }
  
  /**
   * Raises a warning with the given message on the given {@link EObject} (as a
   * whole). Usage pattern:
   * <pre>
   * 	def check_something(Concept it) {
   * 		it.warning("some warning message", this);
   * 	}
   * </pre>
   * Note the {@code this} as a 2nd -actually 3rd- argument.
   * Also, the {@code it.} is optional.
   */
  public void warning(final EObject it, final CharSequence message, final AbstractDeclarativeValidator validator) {
    final ICompositeNode node = NodeModelUtils.getNode(it);
    ValidationMessageAcceptor _messageAcceptor = validator.getMessageAcceptor();
    String _string = message.toString();
    int _offset = node.getOffset();
    int _length = node.getLength();
    _messageAcceptor.acceptWarning(_string, it, _offset, _length, null);
  }
  
  /**
   * Logs the given message on {@link System#err} with some information
   * on resource + line number of the given {@link EObject}.
   */
  public void logProblem(final EObject it, final CharSequence message) {
    ICompositeNode node = NodeModelUtils.findActualNodeFor(it);
    boolean _equals = Objects.equal(node, null);
    if (_equals) {
      ICompositeNode _node = NodeModelUtils.getNode(it);
      node = _node;
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(message, "");
    _builder.append("; location: L");
    int _totalStartLine = node.getTotalStartLine();
    _builder.append(_totalStartLine, "");
    _builder.append(" in ");
    Resource _eResource = it.eResource();
    URI _uRI = _eResource.getURI();
    _builder.append(_uRI, "");
    System.err.println(_builder);
  }
  
  /**
   * Logs the given message {@link System#err} with some information
   * on resource + line number of the given {@link EObject},
   * together with the (non-fatal) stacktrace.
   */
  public void logProblemWithStacktrace(final EObject it, final CharSequence message) {
    this.logProblem(it, message);
    RuntimeException _runtimeException = new RuntimeException();
    _runtimeException.printStackTrace(System.err);
    System.err.println("(non-fatal stacktrace - ignore first lines ~ methods in XtextUtil)");
  }
  
  /**
   * Logs some information on the current scope invocation site.
   * <p>
   * To be used inside {@link IScopeProvider} implementations.
   */
  public String logScopeComputation(final EObject it, final EReference eRef) {
    String _xblockexpression = null;
    {
      final ICompositeNode node = NodeModelUtils.findActualNodeFor(it);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("computing scope for (");
      EClass _eReferenceType = eRef.getEReferenceType();
      String _name = _eReferenceType.getName();
      _builder.append(_name, "");
      _builder.append("-typed) reference ");
      EClass _eContainingClass = eRef.getEContainingClass();
      String _name_1 = _eContainingClass.getName();
      _builder.append(_name_1, "");
      _builder.append(".");
      String _name_2 = eRef.getName();
      _builder.append(_name_2, "");
      _builder.append(" on ");
      EClass _eClass = it.eClass();
      String _name_3 = _eClass.getName();
      _builder.append(_name_3, "");
      _builder.append("-typed context \"");
      String _text = node.getText();
      _builder.append(_text, "");
      _builder.append("\" @ L");
      int _totalStartLine = node.getTotalStartLine();
      int _plus = (_totalStartLine + 1);
      _builder.append(_plus, "");
      _xblockexpression = InputOutput.<String>println(_builder.toString());
    }
    return _xblockexpression;
  }
  
  /**
   * Checks whether the given {@link EObject} is an instance of the given type,
   * and reports that both by logging on {@link System#err} and by throwing an
   * {@link Exception} to avoid having the latter swallowed, e.g. during scope
   * computation.
   */
  public <T extends EObject> T checkedCast(final EObject it, final Class<T> type) {
    T _xblockexpression = null;
    {
      Class<? extends EObject> _class = it.getClass();
      boolean _isAssignableFrom = type.isAssignableFrom(_class);
      boolean _not = (!_isAssignableFrom);
      if (_not) {
        String _simpleName = type.getSimpleName();
        final String message = ("assertion failed / assumption broken: container not of type " + _simpleName);
        this.logProblemWithStacktrace(it, message);
        throw new IllegalArgumentException(message);
      }
      _xblockexpression = type.cast(it);
    }
    return _xblockexpression;
  }
  
  /**
   * @return The union of all given {@link Set sets}.
   * (This is useful when using {@code .map[..]}, e.g., since Xtend's overloaded @{code +} doesn't handle this properly.)
   */
  public <T extends Object> Set<? extends T> union(final Iterable<Set<? extends T>> sets) {
    final LinkedHashSet<T> newSet = CollectionLiterals.<T>newLinkedHashSet();
    final Procedure1<Set<? extends T>> _function = new Procedure1<Set<? extends T>>() {
      public void apply(final Set<? extends T> s) {
        newSet.addAll(s);
      }
    };
    IterableExtensions.<Set<? extends T>>forEach(sets, _function);
    return ((Set<? extends T>) newSet);
  }
  
  /**
   * @return The union of the two given {@link Set sets}.
   */
  public <T extends Object> Set<? extends T> operator_plus(final Set<? extends T> set1, final Set<? extends T> set2) {
    final LinkedHashSet<T> newSet = CollectionLiterals.<T>newLinkedHashSet();
    newSet.addAll(set1);
    newSet.addAll(set2);
    return newSet;
  }
  
  /**
   * @returns The file name of the {@link Resource} <em>without</em> the extension.
   * 
   * Assumptions:
   * 1.)	The resource URI has an extension of the form .<[^\.]*>
   * 	That's not an ASCII art beat-up ghost, it's a regexp.
   */
  public String fileName(final Resource it) {
    URI _uRI = it.getURI();
    URI _trimFileExtension = _uRI.trimFileExtension();
    return _trimFileExtension.lastSegment();
  }
}

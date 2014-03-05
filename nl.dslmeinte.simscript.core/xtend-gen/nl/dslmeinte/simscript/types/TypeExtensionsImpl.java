package nl.dslmeinte.simscript.types;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Arrays;
import java.util.List;
import nl.dslmeinte.simscript.types.BuiltinTypeLiteral;
import nl.dslmeinte.simscript.types.BuiltinTypes;
import nl.dslmeinte.simscript.types.CallbackErrorResponseLiteral;
import nl.dslmeinte.simscript.types.CallbackLiteral;
import nl.dslmeinte.simscript.types.DefinedType;
import nl.dslmeinte.simscript.types.DefinedTypeLiteral;
import nl.dslmeinte.simscript.types.Enumeration;
import nl.dslmeinte.simscript.types.Feature;
import nl.dslmeinte.simscript.types.ListTypeLiteral;
import nl.dslmeinte.simscript.types.Structure;
import nl.dslmeinte.simscript.types.TypeExtensions;
import nl.dslmeinte.simscript.types.TypeLiteral;
import nl.dslmeinte.simscript.types.TypesFactory;
import nl.dslmeinte.simscript.types.VoidLiteral;
import nl.dslmeinte.simscript.util.XtextUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Singleton
@SuppressWarnings("all")
public class TypeExtensionsImpl implements TypeExtensions {
  @Inject
  @Extension
  private XtextUtil _xtextUtil;
  
  private boolean isBuiltinTyped(final TypeLiteral it) {
    return (it instanceof BuiltinTypeLiteral);
  }
  
  private boolean isBuiltinTypedAs(final TypeLiteral it, final BuiltinTypes builtintType) {
    boolean _and = false;
    boolean _isBuiltinTyped = this.isBuiltinTyped(it);
    if (!_isBuiltinTyped) {
      _and = false;
    } else {
      BuiltinTypes _builtin = ((BuiltinTypeLiteral) it).getBuiltin();
      boolean _equals = Objects.equal(_builtin, builtintType);
      _and = _equals;
    }
    return _and;
  }
  
  public boolean isBooleanTyped(final TypeLiteral it) {
    return this.isBuiltinTypedAs(it, BuiltinTypes.BOOLEAN);
  }
  
  public boolean isStringTyped(final TypeLiteral it) {
    return this.isBuiltinTypedAs(it, BuiltinTypes.STRING);
  }
  
  public boolean isTextTyped(final TypeLiteral it) {
    return this.isBuiltinTypedAs(it, BuiltinTypes.TEXT);
  }
  
  public boolean isIntegerTyped(final TypeLiteral it) {
    return this.isBuiltinTypedAs(it, BuiltinTypes.INTEGER);
  }
  
  public boolean isNumberTyped(final TypeLiteral it) {
    return this.isBuiltinTypedAs(it, BuiltinTypes.NUMBER);
  }
  
  public boolean isDateTyped(final TypeLiteral it) {
    return this.isBuiltinTypedAs(it, BuiltinTypes.DATE);
  }
  
  public boolean isPasswordTyped(final TypeLiteral it) {
    return this.isBuiltinTypedAs(it, BuiltinTypes.PASSWORD);
  }
  
  public boolean isEmailTyped(final TypeLiteral it) {
    return this.isBuiltinTypedAs(it, BuiltinTypes.EMAIL);
  }
  
  /**
   * Dependencies/Assumptions:
   * 1.)	If any non-primitive built-ins are added, this method should be updated.
   * 2.)	If any new built-ins are added a is<Type>Typed method should be made
   */
  public boolean isSimpleTyped(final TypeLiteral it) {
    return this.isBuiltinTyped(it);
  }
  
  /**
   * Dependencies/Assumptions:
   * 1.)	update this if new BuiltinTypes are added
   */
  public boolean isTextuallyTyped(final TypeLiteral it) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _or_2 = false;
    boolean _isStringTyped = this.isStringTyped(it);
    if (_isStringTyped) {
      _or_2 = true;
    } else {
      boolean _isTextTyped = this.isTextTyped(it);
      _or_2 = _isTextTyped;
    }
    if (_or_2) {
      _or_1 = true;
    } else {
      boolean _isPasswordTyped = this.isPasswordTyped(it);
      _or_1 = _isPasswordTyped;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _isEmailTyped = this.isEmailTyped(it);
      _or = _isEmailTyped;
    }
    return _or;
  }
  
  public boolean isNumericallyTyped(final TypeLiteral it) {
    boolean _or = false;
    boolean _isIntegerTyped = this.isIntegerTyped(it);
    if (_isIntegerTyped) {
      _or = true;
    } else {
      boolean _isNumberTyped = this.isNumberTyped(it);
      _or = _isNumberTyped;
    }
    return _or;
  }
  
  public boolean isListTyped(final TypeLiteral it) {
    return (it instanceof ListTypeLiteral);
  }
  
  public boolean isDefinedTyped(final TypeLiteral it) {
    return (it instanceof DefinedTypeLiteral);
  }
  
  public boolean isStructureTyped(final TypeLiteral it) {
    boolean _and = false;
    boolean _isDefinedTyped = this.isDefinedTyped(it);
    if (!_isDefinedTyped) {
      _and = false;
    } else {
      DefinedType _type = ((DefinedTypeLiteral) it).getType();
      _and = (_type instanceof Structure);
    }
    return _and;
  }
  
  public boolean isEnumerationTyped(final TypeLiteral it) {
    boolean _and = false;
    boolean _isDefinedTyped = this.isDefinedTyped(it);
    if (!_isDefinedTyped) {
      _and = false;
    } else {
      DefinedType _type = ((DefinedTypeLiteral) it).getType();
      _and = (_type instanceof Enumeration);
    }
    return _and;
  }
  
  public boolean isCallback(final TypeLiteral it) {
    return (it instanceof CallbackLiteral);
  }
  
  public boolean isVaguelyTyped(final TypeLiteral it) {
    boolean _and = false;
    boolean _isListTyped = this.isListTyped(it);
    if (!_isListTyped) {
      _and = false;
    } else {
      TypeLiteral _itemType = ((ListTypeLiteral) it).getItemType();
      boolean _equals = Objects.equal(_itemType, null);
      _and = _equals;
    }
    return _and;
  }
  
  public boolean isVoidTyped(final TypeLiteral it) {
    return (it instanceof VoidLiteral);
  }
  
  private boolean isLinkedTyped(final TypeLiteral it) {
    boolean _or = false;
    boolean _isSimpleTyped = this.isSimpleTyped(it);
    if (_isSimpleTyped) {
      _or = true;
    } else {
      boolean _isListTyped = this.isListTyped(it);
      _or = _isListTyped;
    }
    return (!_or);
  }
  
  public TypeLiteral listItemType(final TypeLiteral it) {
    ListTypeLiteral _checkedCast = this._xtextUtil.<ListTypeLiteral>checkedCast(it, ListTypeLiteral.class);
    return _checkedCast.getItemType();
  }
  
  public Structure structure(final TypeLiteral it) {
    DefinedTypeLiteral _checkedCast = this._xtextUtil.<DefinedTypeLiteral>checkedCast(it, DefinedTypeLiteral.class);
    DefinedType _type = _checkedCast.getType();
    return this._xtextUtil.<Structure>checkedCast(_type, Structure.class);
  }
  
  public Enumeration enumeration(final TypeLiteral it) {
    DefinedTypeLiteral _checkedCast = this._xtextUtil.<DefinedTypeLiteral>checkedCast(it, DefinedTypeLiteral.class);
    DefinedType _type = _checkedCast.getType();
    return this._xtextUtil.<Enumeration>checkedCast(_type, Enumeration.class);
  }
  
  /**
   * +----------+
   * | features |
   * +----------+
   */
  public List<Feature<TypeLiteral>> features(final TypeLiteral it) {
    return this.features_(it);
  }
  
  private List<Feature<TypeLiteral>> _features_(final CallbackLiteral it) {
    return CollectionLiterals.<Feature<TypeLiteral>>emptyList();
  }
  
  private List<Feature<TypeLiteral>> _features_(final BuiltinTypeLiteral it) {
    return CollectionLiterals.<Feature<TypeLiteral>>emptyList();
  }
  
  private List<Feature<TypeLiteral>> _features_(final ListTypeLiteral it) {
    return CollectionLiterals.<Feature<TypeLiteral>>emptyList();
  }
  
  private List<Feature<TypeLiteral>> _features_(final DefinedTypeLiteral it) {
    DefinedType _type = it.getType();
    return this.featuresOf(_type);
  }
  
  protected List<Feature<TypeLiteral>> _featuresOf(final Structure it) {
    return it.getFeatures();
  }
  
  protected List<Feature<TypeLiteral>> _featuresOf(final Enumeration it) {
    return CollectionLiterals.<Feature<TypeLiteral>>emptyList();
  }
  
  public Iterable<Feature<TypeLiteral>> simpleTypedFeatures(final Structure it) {
    EList<Feature<TypeLiteral>> _features = it.getFeatures();
    final Function1<Feature<TypeLiteral>,Boolean> _function = new Function1<Feature<TypeLiteral>,Boolean>() {
      public Boolean apply(final Feature<TypeLiteral> it) {
        TypeLiteral _type = it.getType();
        return Boolean.valueOf(TypeExtensionsImpl.this.isSimpleTyped(_type));
      }
    };
    return IterableExtensions.<Feature<TypeLiteral>>filter(_features, _function);
  }
  
  public Iterable<Feature<TypeLiteral>> linkedTypedFeatures(final Structure it) {
    EList<Feature<TypeLiteral>> _features = it.getFeatures();
    final Function1<Feature<TypeLiteral>,Boolean> _function = new Function1<Feature<TypeLiteral>,Boolean>() {
      public Boolean apply(final Feature<TypeLiteral> it) {
        TypeLiteral _type = it.getType();
        return Boolean.valueOf(TypeExtensionsImpl.this.isLinkedTyped(_type));
      }
    };
    return IterableExtensions.<Feature<TypeLiteral>>filter(_features, _function);
  }
  
  public Iterable<Feature<TypeLiteral>> listTypedFeatures(final DefinedType it) {
    List<Feature<TypeLiteral>> _featuresOf = this.featuresOf(it);
    final Function1<Feature<TypeLiteral>,Boolean> _function = new Function1<Feature<TypeLiteral>,Boolean>() {
      public Boolean apply(final Feature<TypeLiteral> it) {
        TypeLiteral _type = it.getType();
        return Boolean.valueOf(TypeExtensionsImpl.this.isListTyped(_type));
      }
    };
    return IterableExtensions.<Feature<TypeLiteral>>filter(_featuresOf, _function);
  }
  
  public Iterable<Feature<TypeLiteral>> structureTypedFeatures(final DefinedType it) {
    List<Feature<TypeLiteral>> _featuresOf = this.featuresOf(it);
    final Function1<Feature<TypeLiteral>,Boolean> _function = new Function1<Feature<TypeLiteral>,Boolean>() {
      public Boolean apply(final Feature<TypeLiteral> it) {
        TypeLiteral _type = it.getType();
        return Boolean.valueOf(TypeExtensionsImpl.this.isStructureTyped(_type));
      }
    };
    return IterableExtensions.<Feature<TypeLiteral>>filter(_featuresOf, _function);
  }
  
  public Iterable<Feature<TypeLiteral>> builtinTypedFeatures(final Structure it) {
    EList<Feature<TypeLiteral>> _features = it.getFeatures();
    final Function1<Feature<TypeLiteral>,Boolean> _function = new Function1<Feature<TypeLiteral>,Boolean>() {
      public Boolean apply(final Feature<TypeLiteral> it) {
        TypeLiteral _type = it.getType();
        return Boolean.valueOf(TypeExtensionsImpl.this.isBuiltinTyped(_type));
      }
    };
    return IterableExtensions.<Feature<TypeLiteral>>filter(_features, _function);
  }
  
  /**
   * @returns Whether a target having the first type (representation),
   * 			can be assigned from a value having the second type (representation).
   */
  protected boolean _isAssignableFrom(final CallbackLiteral target, final CallbackLiteral source) {
    return true;
  }
  
  protected boolean _isAssignableFrom(final CallbackErrorResponseLiteral target, final CallbackErrorResponseLiteral source) {
    return true;
  }
  
  protected boolean _isAssignableFrom(final BuiltinTypeLiteral target, final CallbackErrorResponseLiteral source) {
    BuiltinTypes _builtin = target.getBuiltin();
    return Objects.equal(_builtin, BuiltinTypes.STRING);
  }
  
  protected boolean _isAssignableFrom(final BuiltinTypeLiteral target, final BuiltinTypeLiteral source) {
    BuiltinTypes _builtin = target.getBuiltin();
    BuiltinTypes _builtin_1 = source.getBuiltin();
    return this.isAssignableFrom_(_builtin, _builtin_1);
  }
  
  private boolean isAssignableFrom_(final BuiltinTypes target, final BuiltinTypes source) {
    boolean _switchResult = false;
    if (target != null) {
      switch (target) {
        case EMAIL:
          boolean _or = false;
          boolean _equals = Objects.equal(source, BuiltinTypes.EMAIL);
          if (_equals) {
            _or = true;
          } else {
            boolean _equals_1 = Objects.equal(source, BuiltinTypes.STRING);
            _or = _equals_1;
          }
          _switchResult = _or;
          break;
        case PASSWORD:
          boolean _or_1 = false;
          boolean _equals_2 = Objects.equal(source, BuiltinTypes.PASSWORD);
          if (_equals_2) {
            _or_1 = true;
          } else {
            boolean _equals_3 = Objects.equal(source, BuiltinTypes.STRING);
            _or_1 = _equals_3;
          }
          _switchResult = _or_1;
          break;
        case TEXT:
          boolean _or_2 = false;
          boolean _equals_4 = Objects.equal(source, BuiltinTypes.TEXT);
          if (_equals_4) {
            _or_2 = true;
          } else {
            boolean _equals_5 = Objects.equal(source, BuiltinTypes.STRING);
            _or_2 = _equals_5;
          }
          _switchResult = _or_2;
          break;
        case NUMBER:
          boolean _or_3 = false;
          boolean _equals_6 = Objects.equal(source, BuiltinTypes.NUMBER);
          if (_equals_6) {
            _or_3 = true;
          } else {
            boolean _equals_7 = Objects.equal(source, BuiltinTypes.INTEGER);
            _or_3 = _equals_7;
          }
          _switchResult = _or_3;
          break;
        default:
          _switchResult = Objects.equal(source, target);
          break;
      }
    } else {
      _switchResult = Objects.equal(source, target);
    }
    return _switchResult;
  }
  
  protected boolean _isAssignableFrom(final DefinedTypeLiteral target, final DefinedTypeLiteral source) {
    DefinedType _type = target.getType();
    DefinedType _type_1 = source.getType();
    return EcoreUtil.equals(_type, _type_1);
  }
  
  protected boolean _isAssignableFrom(final ListTypeLiteral target, final ListTypeLiteral source) {
    TypeLiteral _itemType = target.getItemType();
    TypeLiteral _itemType_1 = source.getItemType();
    return EcoreUtil.equals(_itemType, _itemType_1);
  }
  
  protected boolean _isAssignableFrom(final TypeLiteral target, final TypeLiteral source) {
    return false;
  }
  
  protected boolean _isAssignableFrom(final TypeLiteral target, final Void source) {
    boolean _xblockexpression = false;
    {
      this._xtextUtil.logProblem(target, "isAssignableFrom called with source == null");
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  protected boolean _isAssignableFrom(final Void target, final TypeLiteral source) {
    boolean _xblockexpression = false;
    {
      this._xtextUtil.logProblem(source, "isAssignableFrom called with target == null");
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  protected boolean _isAssignableFrom(final Void target, final Void source) {
    boolean _xblockexpression = false;
    {
      System.err.println("WARNING\t\tisAssignableFrom called with source, target == null; stacktrace:");
      RuntimeException _runtimeException = new RuntimeException();
      _runtimeException.printStackTrace(System.err);
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  /**
   * +-------------------+
   * | factory functions |
   * +-------------------+
   */
  private final TypesFactory eFactory = TypesFactory.eINSTANCE;
  
  public BuiltinTypeLiteral createBuiltinTypeLiteral(final BuiltinTypes builtinType) {
    final BuiltinTypeLiteral typeLiteral = this.eFactory.createBuiltinTypeLiteral();
    typeLiteral.setBuiltin(builtinType);
    return typeLiteral;
  }
  
  public DefinedTypeLiteral createDefinedTypeLiteral(final DefinedType it) {
    final DefinedTypeLiteral typeLiteral = this.eFactory.createDefinedTypeLiteral();
    typeLiteral.setType(it);
    return typeLiteral;
  }
  
  public ListTypeLiteral createListTypeLiteral(final TypeLiteral itemType) {
    final ListTypeLiteral typeLiteral = this.eFactory.createListTypeLiteral();
    typeLiteral.setItemType(itemType);
    return typeLiteral;
  }
  
  public CallbackLiteral createCallbackLiteral() {
    return this.eFactory.createCallbackLiteral();
  }
  
  public CallbackErrorResponseLiteral createCallbackErrorResponseLiteral() {
    return this.eFactory.createCallbackErrorResponseLiteral();
  }
  
  public VoidLiteral createVoidLiteral() {
    return this.eFactory.createVoidLiteral();
  }
  
  /**
   * +-------------------+
   * | literal verbosity |
   * +-------------------+
   */
  protected String _toLiteral(final BuiltinTypeLiteral it) {
    BuiltinTypes _builtin = it.getBuiltin();
    return _builtin.getLiteral();
  }
  
  protected String _toLiteral(final ListTypeLiteral it) {
    String _xifexpression = null;
    boolean _isVaguelyTyped = this.isVaguelyTyped(it);
    if (_isVaguelyTyped) {
      _xifexpression = "?";
    } else {
      TypeLiteral _itemType = it.getItemType();
      _xifexpression = this.toLiteral(_itemType);
    }
    String _plus = ("[" + _xifexpression);
    return (_plus + "]");
  }
  
  protected String _toLiteral(final DefinedTypeLiteral it) {
    DefinedType _type = it.getType();
    return _type.getName();
  }
  
  protected String _toLiteral(final CallbackLiteral it) {
    return "Callback";
  }
  
  protected String _toLiteral(final CallbackErrorResponseLiteral it) {
    return "Error";
  }
  
  protected String _toLiteral(final VoidLiteral it) {
    return "void";
  }
  
  protected String _toLiteral(final TypeLiteral it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<literal-less type (Java class: ");
    Class<? extends TypeLiteral> _class = it.getClass();
    String _simpleName = _class.getSimpleName();
    _builder.append(_simpleName, "");
    _builder.append(")>");
    return _builder.toString();
  }
  
  protected String _toLiteral(final Void it) {
    return "<uncalculable type>";
  }
  
  private List<Feature<TypeLiteral>> features_(final TypeLiteral it) {
    if (it instanceof CallbackLiteral) {
      return _features_((CallbackLiteral)it);
    } else if (it instanceof BuiltinTypeLiteral) {
      return _features_((BuiltinTypeLiteral)it);
    } else if (it instanceof DefinedTypeLiteral) {
      return _features_((DefinedTypeLiteral)it);
    } else if (it instanceof ListTypeLiteral) {
      return _features_((ListTypeLiteral)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public List<Feature<TypeLiteral>> featuresOf(final DefinedType it) {
    if (it instanceof Enumeration) {
      return _featuresOf((Enumeration)it);
    } else if (it instanceof Structure) {
      return _featuresOf((Structure)it);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
  
  public boolean isAssignableFrom(final TypeLiteral target, final TypeLiteral source) {
    if (target instanceof CallbackErrorResponseLiteral
         && source instanceof CallbackErrorResponseLiteral) {
      return _isAssignableFrom((CallbackErrorResponseLiteral)target, (CallbackErrorResponseLiteral)source);
    } else if (target instanceof CallbackLiteral
         && source instanceof CallbackLiteral) {
      return _isAssignableFrom((CallbackLiteral)target, (CallbackLiteral)source);
    } else if (target instanceof BuiltinTypeLiteral
         && source instanceof CallbackErrorResponseLiteral) {
      return _isAssignableFrom((BuiltinTypeLiteral)target, (CallbackErrorResponseLiteral)source);
    } else if (target instanceof BuiltinTypeLiteral
         && source instanceof BuiltinTypeLiteral) {
      return _isAssignableFrom((BuiltinTypeLiteral)target, (BuiltinTypeLiteral)source);
    } else if (target instanceof DefinedTypeLiteral
         && source instanceof DefinedTypeLiteral) {
      return _isAssignableFrom((DefinedTypeLiteral)target, (DefinedTypeLiteral)source);
    } else if (target instanceof ListTypeLiteral
         && source instanceof ListTypeLiteral) {
      return _isAssignableFrom((ListTypeLiteral)target, (ListTypeLiteral)source);
    } else if (target != null
         && source != null) {
      return _isAssignableFrom(target, source);
    } else if (target != null
         && source == null) {
      return _isAssignableFrom(target, (Void)null);
    } else if (target == null
         && source != null) {
      return _isAssignableFrom((Void)null, source);
    } else if (target == null
         && source == null) {
      return _isAssignableFrom((Void)null, (Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(target, source).toString());
    }
  }
  
  public String toLiteral(final TypeLiteral it) {
    if (it instanceof CallbackErrorResponseLiteral) {
      return _toLiteral((CallbackErrorResponseLiteral)it);
    } else if (it instanceof CallbackLiteral) {
      return _toLiteral((CallbackLiteral)it);
    } else if (it instanceof VoidLiteral) {
      return _toLiteral((VoidLiteral)it);
    } else if (it instanceof BuiltinTypeLiteral) {
      return _toLiteral((BuiltinTypeLiteral)it);
    } else if (it instanceof DefinedTypeLiteral) {
      return _toLiteral((DefinedTypeLiteral)it);
    } else if (it instanceof ListTypeLiteral) {
      return _toLiteral((ListTypeLiteral)it);
    } else if (it != null) {
      return _toLiteral(it);
    } else if (it == null) {
      return _toLiteral((Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(it).toString());
    }
  }
}

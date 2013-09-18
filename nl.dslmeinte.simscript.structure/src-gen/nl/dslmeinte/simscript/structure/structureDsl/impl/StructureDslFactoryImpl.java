/**
 */
package nl.dslmeinte.simscript.structure.structureDsl.impl;

import nl.dslmeinte.simscript.structure.structureDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureDslFactoryImpl extends EFactoryImpl implements StructureDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StructureDslFactory init()
  {
    try
    {
      StructureDslFactory theStructureDslFactory = (StructureDslFactory)EPackage.Registry.INSTANCE.getEFactory(StructureDslPackage.eNS_URI);
      if (theStructureDslFactory != null)
      {
        return theStructureDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new StructureDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case StructureDslPackage.STRUCTURE_MODEL: return createStructureModel();
      case StructureDslPackage.DEFINED_TYPE: return createDefinedType();
      case StructureDslPackage.STRUCTURE: return createStructure();
      case StructureDslPackage.FEATURE: return createFeature();
      case StructureDslPackage.ENUMERATION: return createEnumeration();
      case StructureDslPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
      case StructureDslPackage.TYPE_LITERAL: return createTypeLiteral();
      case StructureDslPackage.BUILTIN_TYPE_LITERAL: return createBuiltinTypeLiteral();
      case StructureDslPackage.DEFINED_TYPE_LITERAL: return createDefinedTypeLiteral();
      case StructureDslPackage.LIST_TYPE_LITERAL: return createListTypeLiteral();
      case StructureDslPackage.SYNTHETIC_TYPE_LITERAL: return createSyntheticTypeLiteral();
      case StructureDslPackage.CALLBACK_LITERAL: return createCallbackLiteral();
      case StructureDslPackage.CALLBACK_ERROR_RESPONSE_LITERAL: return createCallbackErrorResponseLiteral();
      case StructureDslPackage.VOID_LITERAL: return createVoidLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case StructureDslPackage.BUILTIN_TYPES:
        return createBuiltinTypesFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case StructureDslPackage.BUILTIN_TYPES:
        return convertBuiltinTypesToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureModel createStructureModel()
  {
    StructureModelImpl structureModel = new StructureModelImpl();
    return structureModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinedType createDefinedType()
  {
    DefinedTypeImpl definedType = new DefinedTypeImpl();
    return definedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Structure createStructure()
  {
    StructureImpl structure = new StructureImpl();
    return structure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public <T extends TypeLiteral> Feature<T> createFeature()
  {
    FeatureImpl<T> feature = new FeatureImpl<T>();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral createEnumerationLiteral()
  {
    EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
    return enumerationLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLiteral createTypeLiteral()
  {
    TypeLiteralImpl typeLiteral = new TypeLiteralImpl();
    return typeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltinTypeLiteral createBuiltinTypeLiteral()
  {
    BuiltinTypeLiteralImpl builtinTypeLiteral = new BuiltinTypeLiteralImpl();
    return builtinTypeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinedTypeLiteral createDefinedTypeLiteral()
  {
    DefinedTypeLiteralImpl definedTypeLiteral = new DefinedTypeLiteralImpl();
    return definedTypeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListTypeLiteral createListTypeLiteral()
  {
    ListTypeLiteralImpl listTypeLiteral = new ListTypeLiteralImpl();
    return listTypeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SyntheticTypeLiteral createSyntheticTypeLiteral()
  {
    SyntheticTypeLiteralImpl syntheticTypeLiteral = new SyntheticTypeLiteralImpl();
    return syntheticTypeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallbackLiteral createCallbackLiteral()
  {
    CallbackLiteralImpl callbackLiteral = new CallbackLiteralImpl();
    return callbackLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallbackErrorResponseLiteral createCallbackErrorResponseLiteral()
  {
    CallbackErrorResponseLiteralImpl callbackErrorResponseLiteral = new CallbackErrorResponseLiteralImpl();
    return callbackErrorResponseLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VoidLiteral createVoidLiteral()
  {
    VoidLiteralImpl voidLiteral = new VoidLiteralImpl();
    return voidLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltinTypes createBuiltinTypesFromString(EDataType eDataType, String initialValue)
  {
    BuiltinTypes result = BuiltinTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBuiltinTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureDslPackage getStructureDslPackage()
  {
    return (StructureDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static StructureDslPackage getPackage()
  {
    return StructureDslPackage.eINSTANCE;
  }

} //StructureDslFactoryImpl

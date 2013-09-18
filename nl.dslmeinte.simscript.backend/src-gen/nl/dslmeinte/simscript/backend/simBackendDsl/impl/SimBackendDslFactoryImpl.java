/**
 */
package nl.dslmeinte.simscript.backend.simBackendDsl.impl;

import nl.dslmeinte.simscript.backend.simBackendDsl.*;

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
public class SimBackendDslFactoryImpl extends EFactoryImpl implements SimBackendDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimBackendDslFactory init()
  {
    try
    {
      SimBackendDslFactory theSimBackendDslFactory = (SimBackendDslFactory)EPackage.Registry.INSTANCE.getEFactory(SimBackendDslPackage.eNS_URI);
      if (theSimBackendDslFactory != null)
      {
        return theSimBackendDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimBackendDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimBackendDslFactoryImpl()
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
      case SimBackendDslPackage.BACKEND_MODEL: return createBackendModel();
      case SimBackendDslPackage.AUTHENTICATION_DECLARATION: return createAuthenticationDeclaration();
      case SimBackendDslPackage.AUTHENTICATION_PARAMETER: return createAuthenticationParameter();
      case SimBackendDslPackage.SERVICE: return createService();
      case SimBackendDslPackage.NAMED_SERVICE: return createNamedService();
      case SimBackendDslPackage.INTERFACE: return createInterface();
      case SimBackendDslPackage.LEGACY_SERVLET: return createLegacyServlet();
      case SimBackendDslPackage.CRUD_SERVICE: return createCrudService();
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
      case SimBackendDslPackage.FLAVORS:
        return createFlavorsFromString(eDataType, initialValue);
      case SimBackendDslPackage.HTTP_METHODS:
        return createHttpMethodsFromString(eDataType, initialValue);
      case SimBackendDslPackage.CRUD_TYPES:
        return createCrudTypesFromString(eDataType, initialValue);
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
      case SimBackendDslPackage.FLAVORS:
        return convertFlavorsToString(eDataType, instanceValue);
      case SimBackendDslPackage.HTTP_METHODS:
        return convertHttpMethodsToString(eDataType, instanceValue);
      case SimBackendDslPackage.CRUD_TYPES:
        return convertCrudTypesToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BackendModel createBackendModel()
  {
    BackendModelImpl backendModel = new BackendModelImpl();
    return backendModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AuthenticationDeclaration createAuthenticationDeclaration()
  {
    AuthenticationDeclarationImpl authenticationDeclaration = new AuthenticationDeclarationImpl();
    return authenticationDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AuthenticationParameter createAuthenticationParameter()
  {
    AuthenticationParameterImpl authenticationParameter = new AuthenticationParameterImpl();
    return authenticationParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedService createNamedService()
  {
    NamedServiceImpl namedService = new NamedServiceImpl();
    return namedService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LegacyServlet createLegacyServlet()
  {
    LegacyServletImpl legacyServlet = new LegacyServletImpl();
    return legacyServlet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CrudService createCrudService()
  {
    CrudServiceImpl crudService = new CrudServiceImpl();
    return crudService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flavors createFlavorsFromString(EDataType eDataType, String initialValue)
  {
    Flavors result = Flavors.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFlavorsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpMethods createHttpMethodsFromString(EDataType eDataType, String initialValue)
  {
    HttpMethods result = HttpMethods.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHttpMethodsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CrudTypes createCrudTypesFromString(EDataType eDataType, String initialValue)
  {
    CrudTypes result = CrudTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCrudTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimBackendDslPackage getSimBackendDslPackage()
  {
    return (SimBackendDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimBackendDslPackage getPackage()
  {
    return SimBackendDslPackage.eINSTANCE;
  }

} //SimBackendDslFactoryImpl

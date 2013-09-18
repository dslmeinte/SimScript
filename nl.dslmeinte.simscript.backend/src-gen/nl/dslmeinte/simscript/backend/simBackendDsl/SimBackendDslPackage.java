/**
 */
package nl.dslmeinte.simscript.backend.simBackendDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslFactory
 * @model kind="package"
 * @generated
 */
public interface SimBackendDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "simBackendDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dslconsultancy.com/simscript/backend/SimBackendDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "simBackendDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimBackendDslPackage eINSTANCE = nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl.init();

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.BackendModelImpl <em>Backend Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.BackendModelImpl
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getBackendModel()
   * @generated
   */
  int BACKEND_MODEL = 0;

  /**
   * The feature id for the '<em><b>Base Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKEND_MODEL__BASE_URL = 0;

  /**
   * The feature id for the '<em><b>Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKEND_MODEL__FLAVOR = 1;

  /**
   * The feature id for the '<em><b>Auth Opts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKEND_MODEL__AUTH_OPTS = 2;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKEND_MODEL__DECLARATIONS = 3;

  /**
   * The number of structural features of the '<em>Backend Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACKEND_MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.AuthenticationDeclarationImpl <em>Authentication Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.AuthenticationDeclarationImpl
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getAuthenticationDeclaration()
   * @generated
   */
  int AUTHENTICATION_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHENTICATION_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Principal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHENTICATION_DECLARATION__PRINCIPAL = 1;

  /**
   * The feature id for the '<em><b>Credential</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHENTICATION_DECLARATION__CREDENTIAL = 2;

  /**
   * The number of structural features of the '<em>Authentication Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHENTICATION_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.AuthenticationParameterImpl <em>Authentication Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.AuthenticationParameterImpl
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getAuthenticationParameter()
   * @generated
   */
  int AUTHENTICATION_PARAMETER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHENTICATION_PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHENTICATION_PARAMETER__TYPE = 1;

  /**
   * The number of structural features of the '<em>Authentication Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHENTICATION_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.ServiceImpl
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getService()
   * @generated
   */
  int SERVICE = 3;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.NamedServiceImpl <em>Named Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.NamedServiceImpl
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getNamedService()
   * @generated
   */
  int NAMED_SERVICE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_SERVICE__NAME = SERVICE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.InterfaceImpl
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = NAMED_SERVICE__NAME;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__METHOD = NAMED_SERVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Input Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__INPUT_TYPE = NAMED_SERVICE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Output Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__OUTPUT_TYPE = NAMED_SERVICE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Not Authenticated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NOT_AUTHENTICATED = NAMED_SERVICE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Legacy Servlet</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__LEGACY_SERVLET = NAMED_SERVICE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__DOCUMENTATION = NAMED_SERVICE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = NAMED_SERVICE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.LegacyServletImpl <em>Legacy Servlet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.LegacyServletImpl
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getLegacyServlet()
   * @generated
   */
  int LEGACY_SERVLET = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEGACY_SERVLET__NAME = NAMED_SERVICE__NAME;

  /**
   * The feature id for the '<em><b>Url Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEGACY_SERVLET__URL_PATTERN = NAMED_SERVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fq Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEGACY_SERVLET__FQ_CLASS_NAME = NAMED_SERVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Legacy Servlet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEGACY_SERVLET_FEATURE_COUNT = NAMED_SERVICE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.CrudServiceImpl <em>Crud Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.CrudServiceImpl
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getCrudService()
   * @generated
   */
  int CRUD_SERVICE = 7;

  /**
   * The feature id for the '<em><b>Structure</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRUD_SERVICE__STRUCTURE = SERVICE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Services</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRUD_SERVICE__SERVICES = SERVICE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Crud Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRUD_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Flavors <em>Flavors</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.Flavors
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getFlavors()
   * @generated
   */
  int FLAVORS = 8;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.HttpMethods <em>Http Methods</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.HttpMethods
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getHttpMethods()
   * @generated
   */
  int HTTP_METHODS = 9;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.CrudTypes <em>Crud Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.CrudTypes
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getCrudTypes()
   * @generated
   */
  int CRUD_TYPES = 10;


  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel <em>Backend Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Backend Model</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel
   * @generated
   */
  EClass getBackendModel();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel#getBaseUrl <em>Base Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Url</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel#getBaseUrl()
   * @see #getBackendModel()
   * @generated
   */
  EAttribute getBackendModel_BaseUrl();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel#getFlavor <em>Flavor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flavor</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel#getFlavor()
   * @see #getBackendModel()
   * @generated
   */
  EAttribute getBackendModel_Flavor();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel#getAuthOpts <em>Auth Opts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Auth Opts</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel#getAuthOpts()
   * @see #getBackendModel()
   * @generated
   */
  EReference getBackendModel_AuthOpts();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel#getDeclarations()
   * @see #getBackendModel()
   * @generated
   */
  EReference getBackendModel_Declarations();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration <em>Authentication Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Authentication Declaration</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration
   * @generated
   */
  EClass getAuthenticationDeclaration();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration#getName()
   * @see #getAuthenticationDeclaration()
   * @generated
   */
  EAttribute getAuthenticationDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration#getPrincipal <em>Principal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Principal</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration#getPrincipal()
   * @see #getAuthenticationDeclaration()
   * @generated
   */
  EReference getAuthenticationDeclaration_Principal();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration#getCredential <em>Credential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Credential</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration#getCredential()
   * @see #getAuthenticationDeclaration()
   * @generated
   */
  EReference getAuthenticationDeclaration_Credential();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter <em>Authentication Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Authentication Parameter</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter
   * @generated
   */
  EClass getAuthenticationParameter();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter#getName()
   * @see #getAuthenticationParameter()
   * @generated
   */
  EAttribute getAuthenticationParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter#getType()
   * @see #getAuthenticationParameter()
   * @generated
   */
  EReference getAuthenticationParameter_Type();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.backend.simBackendDsl.NamedService <em>Named Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Service</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.NamedService
   * @generated
   */
  EClass getNamedService();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.backend.simBackendDsl.NamedService#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.NamedService#getName()
   * @see #getNamedService()
   * @generated
   */
  EAttribute getNamedService_Name();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getMethod()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Method();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getInputType <em>Input Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input Type</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getInputType()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_InputType();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getOutputType <em>Output Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Type</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getOutputType()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_OutputType();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#isNotAuthenticated <em>Not Authenticated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Authenticated</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.Interface#isNotAuthenticated()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_NotAuthenticated();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getLegacyServlet <em>Legacy Servlet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Legacy Servlet</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getLegacyServlet()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_LegacyServlet();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getDocumentation <em>Documentation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Documentation</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getDocumentation()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Documentation();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet <em>Legacy Servlet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Legacy Servlet</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet
   * @generated
   */
  EClass getLegacyServlet();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet#getUrlPattern <em>Url Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url Pattern</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet#getUrlPattern()
   * @see #getLegacyServlet()
   * @generated
   */
  EAttribute getLegacyServlet_UrlPattern();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet#getFqClassName <em>Fq Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fq Class Name</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet#getFqClassName()
   * @see #getLegacyServlet()
   * @generated
   */
  EAttribute getLegacyServlet_FqClassName();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.backend.simBackendDsl.CrudService <em>Crud Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Crud Service</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.CrudService
   * @generated
   */
  EClass getCrudService();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.backend.simBackendDsl.CrudService#getStructure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Structure</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.CrudService#getStructure()
   * @see #getCrudService()
   * @generated
   */
  EReference getCrudService_Structure();

  /**
   * Returns the meta object for the attribute list '{@link nl.dslmeinte.simscript.backend.simBackendDsl.CrudService#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Services</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.CrudService#getServices()
   * @see #getCrudService()
   * @generated
   */
  EAttribute getCrudService_Services();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Flavors <em>Flavors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Flavors</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.Flavors
   * @generated
   */
  EEnum getFlavors();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.backend.simBackendDsl.HttpMethods <em>Http Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Http Methods</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.HttpMethods
   * @generated
   */
  EEnum getHttpMethods();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.backend.simBackendDsl.CrudTypes <em>Crud Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Crud Types</em>'.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.CrudTypes
   * @generated
   */
  EEnum getCrudTypes();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimBackendDslFactory getSimBackendDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.BackendModelImpl <em>Backend Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.BackendModelImpl
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getBackendModel()
     * @generated
     */
    EClass BACKEND_MODEL = eINSTANCE.getBackendModel();

    /**
     * The meta object literal for the '<em><b>Base Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BACKEND_MODEL__BASE_URL = eINSTANCE.getBackendModel_BaseUrl();

    /**
     * The meta object literal for the '<em><b>Flavor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BACKEND_MODEL__FLAVOR = eINSTANCE.getBackendModel_Flavor();

    /**
     * The meta object literal for the '<em><b>Auth Opts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BACKEND_MODEL__AUTH_OPTS = eINSTANCE.getBackendModel_AuthOpts();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BACKEND_MODEL__DECLARATIONS = eINSTANCE.getBackendModel_Declarations();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.AuthenticationDeclarationImpl <em>Authentication Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.AuthenticationDeclarationImpl
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getAuthenticationDeclaration()
     * @generated
     */
    EClass AUTHENTICATION_DECLARATION = eINSTANCE.getAuthenticationDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUTHENTICATION_DECLARATION__NAME = eINSTANCE.getAuthenticationDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Principal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTHENTICATION_DECLARATION__PRINCIPAL = eINSTANCE.getAuthenticationDeclaration_Principal();

    /**
     * The meta object literal for the '<em><b>Credential</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTHENTICATION_DECLARATION__CREDENTIAL = eINSTANCE.getAuthenticationDeclaration_Credential();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.AuthenticationParameterImpl <em>Authentication Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.AuthenticationParameterImpl
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getAuthenticationParameter()
     * @generated
     */
    EClass AUTHENTICATION_PARAMETER = eINSTANCE.getAuthenticationParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUTHENTICATION_PARAMETER__NAME = eINSTANCE.getAuthenticationParameter_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTHENTICATION_PARAMETER__TYPE = eINSTANCE.getAuthenticationParameter_Type();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.ServiceImpl
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.NamedServiceImpl <em>Named Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.NamedServiceImpl
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getNamedService()
     * @generated
     */
    EClass NAMED_SERVICE = eINSTANCE.getNamedService();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_SERVICE__NAME = eINSTANCE.getNamedService_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.InterfaceImpl
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__METHOD = eINSTANCE.getInterface_Method();

    /**
     * The meta object literal for the '<em><b>Input Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__INPUT_TYPE = eINSTANCE.getInterface_InputType();

    /**
     * The meta object literal for the '<em><b>Output Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__OUTPUT_TYPE = eINSTANCE.getInterface_OutputType();

    /**
     * The meta object literal for the '<em><b>Not Authenticated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__NOT_AUTHENTICATED = eINSTANCE.getInterface_NotAuthenticated();

    /**
     * The meta object literal for the '<em><b>Legacy Servlet</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__LEGACY_SERVLET = eINSTANCE.getInterface_LegacyServlet();

    /**
     * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__DOCUMENTATION = eINSTANCE.getInterface_Documentation();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.LegacyServletImpl <em>Legacy Servlet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.LegacyServletImpl
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getLegacyServlet()
     * @generated
     */
    EClass LEGACY_SERVLET = eINSTANCE.getLegacyServlet();

    /**
     * The meta object literal for the '<em><b>Url Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEGACY_SERVLET__URL_PATTERN = eINSTANCE.getLegacyServlet_UrlPattern();

    /**
     * The meta object literal for the '<em><b>Fq Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LEGACY_SERVLET__FQ_CLASS_NAME = eINSTANCE.getLegacyServlet_FqClassName();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.CrudServiceImpl <em>Crud Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.CrudServiceImpl
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getCrudService()
     * @generated
     */
    EClass CRUD_SERVICE = eINSTANCE.getCrudService();

    /**
     * The meta object literal for the '<em><b>Structure</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CRUD_SERVICE__STRUCTURE = eINSTANCE.getCrudService_Structure();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CRUD_SERVICE__SERVICES = eINSTANCE.getCrudService_Services();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Flavors <em>Flavors</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.Flavors
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getFlavors()
     * @generated
     */
    EEnum FLAVORS = eINSTANCE.getFlavors();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.HttpMethods <em>Http Methods</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.HttpMethods
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getHttpMethods()
     * @generated
     */
    EEnum HTTP_METHODS = eINSTANCE.getHttpMethods();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.CrudTypes <em>Crud Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.CrudTypes
     * @see nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslPackageImpl#getCrudTypes()
     * @generated
     */
    EEnum CRUD_TYPES = eINSTANCE.getCrudTypes();

  }

} //SimBackendDslPackage

/**
 */
package nl.dslmeinte.simscript.backend.simBackendDsl.impl;

import nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration;
import nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter;
import nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel;
import nl.dslmeinte.simscript.backend.simBackendDsl.CrudService;
import nl.dslmeinte.simscript.backend.simBackendDsl.CrudTypes;
import nl.dslmeinte.simscript.backend.simBackendDsl.Flavors;
import nl.dslmeinte.simscript.backend.simBackendDsl.HttpMethods;
import nl.dslmeinte.simscript.backend.simBackendDsl.Interface;
import nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet;
import nl.dslmeinte.simscript.backend.simBackendDsl.NamedService;
import nl.dslmeinte.simscript.backend.simBackendDsl.Service;
import nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslFactory;
import nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage;

import nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimBackendDslPackageImpl extends EPackageImpl implements SimBackendDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass backendModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass authenticationDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass authenticationParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass legacyServletEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass crudServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum flavorsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum httpMethodsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum crudTypesEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SimBackendDslPackageImpl()
  {
    super(eNS_URI, SimBackendDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SimBackendDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SimBackendDslPackage init()
  {
    if (isInited) return (SimBackendDslPackage)EPackage.Registry.INSTANCE.getEPackage(SimBackendDslPackage.eNS_URI);

    // Obtain or create and register package
    SimBackendDslPackageImpl theSimBackendDslPackage = (SimBackendDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimBackendDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimBackendDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    StructureDslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSimBackendDslPackage.createPackageContents();

    // Initialize created meta-data
    theSimBackendDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSimBackendDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SimBackendDslPackage.eNS_URI, theSimBackendDslPackage);
    return theSimBackendDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBackendModel()
  {
    return backendModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBackendModel_BaseUrl()
  {
    return (EAttribute)backendModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBackendModel_Flavor()
  {
    return (EAttribute)backendModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBackendModel_AuthOpts()
  {
    return (EReference)backendModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBackendModel_Declarations()
  {
    return (EReference)backendModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAuthenticationDeclaration()
  {
    return authenticationDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAuthenticationDeclaration_Name()
  {
    return (EAttribute)authenticationDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAuthenticationDeclaration_Principal()
  {
    return (EReference)authenticationDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAuthenticationDeclaration_Credential()
  {
    return (EReference)authenticationDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAuthenticationParameter()
  {
    return authenticationParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAuthenticationParameter_Name()
  {
    return (EAttribute)authenticationParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAuthenticationParameter_Type()
  {
    return (EReference)authenticationParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getService()
  {
    return serviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedService()
  {
    return namedServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedService_Name()
  {
    return (EAttribute)namedServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface()
  {
    return interfaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_Method()
  {
    return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_InputType()
  {
    return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_OutputType()
  {
    return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_NotAuthenticated()
  {
    return (EAttribute)interfaceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_LegacyServlet()
  {
    return (EReference)interfaceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_Documentation()
  {
    return (EAttribute)interfaceEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLegacyServlet()
  {
    return legacyServletEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLegacyServlet_UrlPattern()
  {
    return (EAttribute)legacyServletEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLegacyServlet_FqClassName()
  {
    return (EAttribute)legacyServletEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCrudService()
  {
    return crudServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCrudService_Structure()
  {
    return (EReference)crudServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCrudService_Services()
  {
    return (EAttribute)crudServiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFlavors()
  {
    return flavorsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getHttpMethods()
  {
    return httpMethodsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getCrudTypes()
  {
    return crudTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimBackendDslFactory getSimBackendDslFactory()
  {
    return (SimBackendDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    backendModelEClass = createEClass(BACKEND_MODEL);
    createEAttribute(backendModelEClass, BACKEND_MODEL__BASE_URL);
    createEAttribute(backendModelEClass, BACKEND_MODEL__FLAVOR);
    createEReference(backendModelEClass, BACKEND_MODEL__AUTH_OPTS);
    createEReference(backendModelEClass, BACKEND_MODEL__DECLARATIONS);

    authenticationDeclarationEClass = createEClass(AUTHENTICATION_DECLARATION);
    createEAttribute(authenticationDeclarationEClass, AUTHENTICATION_DECLARATION__NAME);
    createEReference(authenticationDeclarationEClass, AUTHENTICATION_DECLARATION__PRINCIPAL);
    createEReference(authenticationDeclarationEClass, AUTHENTICATION_DECLARATION__CREDENTIAL);

    authenticationParameterEClass = createEClass(AUTHENTICATION_PARAMETER);
    createEAttribute(authenticationParameterEClass, AUTHENTICATION_PARAMETER__NAME);
    createEReference(authenticationParameterEClass, AUTHENTICATION_PARAMETER__TYPE);

    serviceEClass = createEClass(SERVICE);

    namedServiceEClass = createEClass(NAMED_SERVICE);
    createEAttribute(namedServiceEClass, NAMED_SERVICE__NAME);

    interfaceEClass = createEClass(INTERFACE);
    createEAttribute(interfaceEClass, INTERFACE__METHOD);
    createEReference(interfaceEClass, INTERFACE__INPUT_TYPE);
    createEReference(interfaceEClass, INTERFACE__OUTPUT_TYPE);
    createEAttribute(interfaceEClass, INTERFACE__NOT_AUTHENTICATED);
    createEReference(interfaceEClass, INTERFACE__LEGACY_SERVLET);
    createEAttribute(interfaceEClass, INTERFACE__DOCUMENTATION);

    legacyServletEClass = createEClass(LEGACY_SERVLET);
    createEAttribute(legacyServletEClass, LEGACY_SERVLET__URL_PATTERN);
    createEAttribute(legacyServletEClass, LEGACY_SERVLET__FQ_CLASS_NAME);

    crudServiceEClass = createEClass(CRUD_SERVICE);
    createEReference(crudServiceEClass, CRUD_SERVICE__STRUCTURE);
    createEAttribute(crudServiceEClass, CRUD_SERVICE__SERVICES);

    // Create enums
    flavorsEEnum = createEEnum(FLAVORS);
    httpMethodsEEnum = createEEnum(HTTP_METHODS);
    crudTypesEEnum = createEEnum(CRUD_TYPES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    StructureDslPackage theStructureDslPackage = (StructureDslPackage)EPackage.Registry.INSTANCE.getEPackage(StructureDslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    namedServiceEClass.getESuperTypes().add(this.getService());
    interfaceEClass.getESuperTypes().add(this.getNamedService());
    legacyServletEClass.getESuperTypes().add(this.getNamedService());
    crudServiceEClass.getESuperTypes().add(this.getService());

    // Initialize classes and features; add operations and parameters
    initEClass(backendModelEClass, BackendModel.class, "BackendModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBackendModel_BaseUrl(), ecorePackage.getEString(), "baseUrl", null, 0, 1, BackendModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBackendModel_Flavor(), this.getFlavors(), "flavor", null, 0, 1, BackendModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBackendModel_AuthOpts(), this.getAuthenticationDeclaration(), null, "authOpts", null, 0, -1, BackendModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBackendModel_Declarations(), this.getService(), null, "declarations", null, 0, -1, BackendModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(authenticationDeclarationEClass, AuthenticationDeclaration.class, "AuthenticationDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAuthenticationDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, AuthenticationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAuthenticationDeclaration_Principal(), this.getAuthenticationParameter(), null, "principal", null, 0, 1, AuthenticationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAuthenticationDeclaration_Credential(), this.getAuthenticationParameter(), null, "credential", null, 0, 1, AuthenticationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(authenticationParameterEClass, AuthenticationParameter.class, "AuthenticationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAuthenticationParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, AuthenticationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAuthenticationParameter_Type(), theStructureDslPackage.getTypeLiteral(), null, "type", null, 0, 1, AuthenticationParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedServiceEClass, NamedService.class, "NamedService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedService_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterface_Method(), this.getHttpMethods(), "method", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_InputType(), theStructureDslPackage.getDefinedTypeLiteral(), null, "inputType", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_OutputType(), theStructureDslPackage.getTypeLiteral(), null, "outputType", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterface_NotAuthenticated(), ecorePackage.getEBoolean(), "notAuthenticated", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_LegacyServlet(), this.getLegacyServlet(), null, "legacyServlet", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterface_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(legacyServletEClass, LegacyServlet.class, "LegacyServlet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLegacyServlet_UrlPattern(), ecorePackage.getEString(), "urlPattern", null, 0, 1, LegacyServlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLegacyServlet_FqClassName(), ecorePackage.getEString(), "fqClassName", null, 0, 1, LegacyServlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(crudServiceEClass, CrudService.class, "CrudService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCrudService_Structure(), theStructureDslPackage.getStructure(), null, "structure", null, 0, 1, CrudService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCrudService_Services(), this.getCrudTypes(), "services", null, 0, -1, CrudService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(flavorsEEnum, Flavors.class, "Flavors");
    addEEnumLiteral(flavorsEEnum, Flavors.JAVA);
    addEEnumLiteral(flavorsEEnum, Flavors.PHP);

    initEEnum(httpMethodsEEnum, HttpMethods.class, "HttpMethods");
    addEEnumLiteral(httpMethodsEEnum, HttpMethods.GET);
    addEEnumLiteral(httpMethodsEEnum, HttpMethods.POST);

    initEEnum(crudTypesEEnum, CrudTypes.class, "CrudTypes");
    addEEnumLiteral(crudTypesEEnum, CrudTypes.CREATE);
    addEEnumLiteral(crudTypesEEnum, CrudTypes.GET_BY_ID);
    addEEnumLiteral(crudTypesEEnum, CrudTypes.UPDATE);
    addEEnumLiteral(crudTypesEEnum, CrudTypes.DELETE);

    // Create resource
    createResource(eNS_URI);
  }

} //SimBackendDslPackageImpl

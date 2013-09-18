/**
 */
package nl.dslmeinte.simscript.application.simApplicationDsl.impl;

import nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel;
import nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslFactory;
import nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage;
import nl.dslmeinte.simscript.application.simApplicationDsl.TargetPlatforms;

import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;

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
public class SimApplicationDslPackageImpl extends EPackageImpl implements SimApplicationDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum targetPlatformsEEnum = null;

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
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SimApplicationDslPackageImpl()
  {
    super(eNS_URI, SimApplicationDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SimApplicationDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SimApplicationDslPackage init()
  {
    if (isInited) return (SimApplicationDslPackage)EPackage.Registry.INSTANCE.getEPackage(SimApplicationDslPackage.eNS_URI);

    // Obtain or create and register package
    SimApplicationDslPackageImpl theSimApplicationDslPackage = (SimApplicationDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimApplicationDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimApplicationDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SimUiDslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSimApplicationDslPackage.createPackageContents();

    // Initialize created meta-data
    theSimApplicationDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSimApplicationDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SimApplicationDslPackage.eNS_URI, theSimApplicationDslPackage);
    return theSimApplicationDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationModel()
  {
    return applicationModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationModel_Title()
  {
    return (EAttribute)applicationModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationModel_TargetPlatform()
  {
    return (EAttribute)applicationModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationModel_IncludeCSSs()
  {
    return (EAttribute)applicationModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationModel_DefaultCSS()
  {
    return (EAttribute)applicationModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationModel_IncludedModules()
  {
    return (EReference)applicationModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplicationModel_EntryModule()
  {
    return (EReference)applicationModelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationModel_IncludeCustomJS()
  {
    return (EAttribute)applicationModelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationModel_CHtmlHead()
  {
    return (EAttribute)applicationModelEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationModel_CHtmlBody()
  {
    return (EAttribute)applicationModelEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationModel_GenericBackButtonPrevention()
  {
    return (EAttribute)applicationModelEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTargetPlatforms()
  {
    return targetPlatformsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimApplicationDslFactory getSimApplicationDslFactory()
  {
    return (SimApplicationDslFactory)getEFactoryInstance();
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
    applicationModelEClass = createEClass(APPLICATION_MODEL);
    createEAttribute(applicationModelEClass, APPLICATION_MODEL__TITLE);
    createEAttribute(applicationModelEClass, APPLICATION_MODEL__TARGET_PLATFORM);
    createEAttribute(applicationModelEClass, APPLICATION_MODEL__INCLUDE_CS_SS);
    createEAttribute(applicationModelEClass, APPLICATION_MODEL__DEFAULT_CSS);
    createEReference(applicationModelEClass, APPLICATION_MODEL__INCLUDED_MODULES);
    createEReference(applicationModelEClass, APPLICATION_MODEL__ENTRY_MODULE);
    createEAttribute(applicationModelEClass, APPLICATION_MODEL__INCLUDE_CUSTOM_JS);
    createEAttribute(applicationModelEClass, APPLICATION_MODEL__CHTML_HEAD);
    createEAttribute(applicationModelEClass, APPLICATION_MODEL__CHTML_BODY);
    createEAttribute(applicationModelEClass, APPLICATION_MODEL__GENERIC_BACK_BUTTON_PREVENTION);

    // Create enums
    targetPlatformsEEnum = createEEnum(TARGET_PLATFORMS);
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
    SimUiDslPackage theSimUiDslPackage = (SimUiDslPackage)EPackage.Registry.INSTANCE.getEPackage(SimUiDslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(applicationModelEClass, ApplicationModel.class, "ApplicationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationModel_Title(), ecorePackage.getEString(), "title", null, 0, 1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationModel_TargetPlatform(), this.getTargetPlatforms(), "targetPlatform", null, 0, 1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationModel_IncludeCSSs(), ecorePackage.getEString(), "includeCSSs", null, 0, -1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationModel_DefaultCSS(), ecorePackage.getEBoolean(), "defaultCSS", null, 0, 1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationModel_IncludedModules(), theSimUiDslPackage.getUiModule(), null, "includedModules", null, 0, -1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplicationModel_EntryModule(), theSimUiDslPackage.getUiModule(), null, "entryModule", null, 0, 1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationModel_IncludeCustomJS(), ecorePackage.getEString(), "includeCustomJS", null, 0, -1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationModel_CHtmlHead(), ecorePackage.getEString(), "cHtmlHead", null, 0, 1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationModel_CHtmlBody(), ecorePackage.getEString(), "cHtmlBody", null, 0, 1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationModel_GenericBackButtonPrevention(), ecorePackage.getEBoolean(), "genericBackButtonPrevention", null, 0, 1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(targetPlatformsEEnum, TargetPlatforms.class, "TargetPlatforms");
    addEEnumLiteral(targetPlatformsEEnum, TargetPlatforms.HTML5);
    addEEnumLiteral(targetPlatformsEEnum, TargetPlatforms.FACEBOOK);
    addEEnumLiteral(targetPlatformsEEnum, TargetPlatforms.MOBILE);

    // Create resource
    createResource(eNS_URI);
  }

} //SimApplicationDslPackageImpl

/**
 */
package nl.dslmeinte.simscript.structure.structureDsl.impl;

import nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypes;
import nl.dslmeinte.simscript.structure.structureDsl.CallbackErrorResponseLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.CallbackLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.DefinedType;
import nl.dslmeinte.simscript.structure.structureDsl.DefinedTypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.Enumeration;
import nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.Feature;
import nl.dslmeinte.simscript.structure.structureDsl.ListTypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.Structure;
import nl.dslmeinte.simscript.structure.structureDsl.StructureDslFactory;
import nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage;
import nl.dslmeinte.simscript.structure.structureDsl.StructureModel;
import nl.dslmeinte.simscript.structure.structureDsl.SyntheticTypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.VoidLiteral;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureDslPackageImpl extends EPackageImpl implements StructureDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structureModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definedTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerationLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builtinTypeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definedTypeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listTypeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass syntheticTypeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callbackLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callbackErrorResponseLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass voidLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum builtinTypesEEnum = null;

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
   * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private StructureDslPackageImpl()
  {
    super(eNS_URI, StructureDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link StructureDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static StructureDslPackage init()
  {
    if (isInited) return (StructureDslPackage)EPackage.Registry.INSTANCE.getEPackage(StructureDslPackage.eNS_URI);

    // Obtain or create and register package
    StructureDslPackageImpl theStructureDslPackage = (StructureDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StructureDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StructureDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theStructureDslPackage.createPackageContents();

    // Initialize created meta-data
    theStructureDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theStructureDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(StructureDslPackage.eNS_URI, theStructureDslPackage);
    return theStructureDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructureModel()
  {
    return structureModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructureModel_TypeDefinitions()
  {
    return (EReference)structureModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinedType()
  {
    return definedTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefinedType_Name()
  {
    return (EAttribute)definedTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructure()
  {
    return structureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructure_Persistent()
  {
    return (EAttribute)structureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructure_Features()
  {
    return (EReference)structureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Name()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_Optional()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_Type()
  {
    return (EReference)featureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumeration()
  {
    return enumerationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumeration_Literals()
  {
    return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumerationLiteral()
  {
    return enumerationLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumerationLiteral_Name()
  {
    return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumerationLiteral_DisplayName()
  {
    return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeLiteral()
  {
    return typeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuiltinTypeLiteral()
  {
    return builtinTypeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuiltinTypeLiteral_Builtin()
  {
    return (EAttribute)builtinTypeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinedTypeLiteral()
  {
    return definedTypeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinedTypeLiteral_Type()
  {
    return (EReference)definedTypeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListTypeLiteral()
  {
    return listTypeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListTypeLiteral_ItemType()
  {
    return (EReference)listTypeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSyntheticTypeLiteral()
  {
    return syntheticTypeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallbackLiteral()
  {
    return callbackLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallbackErrorResponseLiteral()
  {
    return callbackErrorResponseLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVoidLiteral()
  {
    return voidLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBuiltinTypes()
  {
    return builtinTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureDslFactory getStructureDslFactory()
  {
    return (StructureDslFactory)getEFactoryInstance();
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
    structureModelEClass = createEClass(STRUCTURE_MODEL);
    createEReference(structureModelEClass, STRUCTURE_MODEL__TYPE_DEFINITIONS);

    definedTypeEClass = createEClass(DEFINED_TYPE);
    createEAttribute(definedTypeEClass, DEFINED_TYPE__NAME);

    structureEClass = createEClass(STRUCTURE);
    createEAttribute(structureEClass, STRUCTURE__PERSISTENT);
    createEReference(structureEClass, STRUCTURE__FEATURES);

    featureEClass = createEClass(FEATURE);
    createEAttribute(featureEClass, FEATURE__NAME);
    createEAttribute(featureEClass, FEATURE__OPTIONAL);
    createEReference(featureEClass, FEATURE__TYPE);

    enumerationEClass = createEClass(ENUMERATION);
    createEReference(enumerationEClass, ENUMERATION__LITERALS);

    enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
    createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__NAME);
    createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__DISPLAY_NAME);

    typeLiteralEClass = createEClass(TYPE_LITERAL);

    builtinTypeLiteralEClass = createEClass(BUILTIN_TYPE_LITERAL);
    createEAttribute(builtinTypeLiteralEClass, BUILTIN_TYPE_LITERAL__BUILTIN);

    definedTypeLiteralEClass = createEClass(DEFINED_TYPE_LITERAL);
    createEReference(definedTypeLiteralEClass, DEFINED_TYPE_LITERAL__TYPE);

    listTypeLiteralEClass = createEClass(LIST_TYPE_LITERAL);
    createEReference(listTypeLiteralEClass, LIST_TYPE_LITERAL__ITEM_TYPE);

    syntheticTypeLiteralEClass = createEClass(SYNTHETIC_TYPE_LITERAL);

    callbackLiteralEClass = createEClass(CALLBACK_LITERAL);

    callbackErrorResponseLiteralEClass = createEClass(CALLBACK_ERROR_RESPONSE_LITERAL);

    voidLiteralEClass = createEClass(VOID_LITERAL);

    // Create enums
    builtinTypesEEnum = createEEnum(BUILTIN_TYPES);
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

    // Create type parameters
    ETypeParameter featureEClass_T = addETypeParameter(featureEClass, "T");

    // Set bounds for type parameters
    EGenericType g1 = createEGenericType(this.getTypeLiteral());
    featureEClass_T.getEBounds().add(g1);

    // Add supertypes to classes
    structureEClass.getESuperTypes().add(this.getDefinedType());
    enumerationEClass.getESuperTypes().add(this.getDefinedType());
    builtinTypeLiteralEClass.getESuperTypes().add(this.getTypeLiteral());
    definedTypeLiteralEClass.getESuperTypes().add(this.getTypeLiteral());
    listTypeLiteralEClass.getESuperTypes().add(this.getTypeLiteral());
    syntheticTypeLiteralEClass.getESuperTypes().add(this.getTypeLiteral());
    callbackLiteralEClass.getESuperTypes().add(this.getSyntheticTypeLiteral());
    callbackErrorResponseLiteralEClass.getESuperTypes().add(this.getSyntheticTypeLiteral());
    voidLiteralEClass.getESuperTypes().add(this.getSyntheticTypeLiteral());

    // Initialize classes and features; add operations and parameters
    initEClass(structureModelEClass, StructureModel.class, "StructureModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructureModel_TypeDefinitions(), this.getDefinedType(), null, "typeDefinitions", null, 0, -1, StructureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definedTypeEClass, DefinedType.class, "DefinedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefinedType_Name(), ecorePackage.getEString(), "name", null, 0, 1, DefinedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structureEClass, Structure.class, "Structure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStructure_Persistent(), ecorePackage.getEBoolean(), "persistent", null, 0, 1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    g1 = createEGenericType(this.getFeature());
    EGenericType g2 = createEGenericType(this.getTypeLiteral());
    g1.getETypeArguments().add(g2);
    initEReference(getStructure_Features(), g1, null, "features", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeature_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    g1 = createEGenericType(featureEClass_T);
    initEReference(getFeature_Type(), g1, null, "type", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumeration_Literals(), this.getEnumerationLiteral(), null, "literals", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumerationLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumerationLiteral_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeLiteralEClass, TypeLiteral.class, "TypeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(builtinTypeLiteralEClass, BuiltinTypeLiteral.class, "BuiltinTypeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuiltinTypeLiteral_Builtin(), this.getBuiltinTypes(), "builtin", null, 0, 1, BuiltinTypeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definedTypeLiteralEClass, DefinedTypeLiteral.class, "DefinedTypeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinedTypeLiteral_Type(), this.getDefinedType(), null, "type", null, 0, 1, DefinedTypeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listTypeLiteralEClass, ListTypeLiteral.class, "ListTypeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListTypeLiteral_ItemType(), this.getTypeLiteral(), null, "itemType", null, 0, 1, ListTypeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(syntheticTypeLiteralEClass, SyntheticTypeLiteral.class, "SyntheticTypeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(callbackLiteralEClass, CallbackLiteral.class, "CallbackLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(callbackErrorResponseLiteralEClass, CallbackErrorResponseLiteral.class, "CallbackErrorResponseLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(voidLiteralEClass, VoidLiteral.class, "VoidLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(builtinTypesEEnum, BuiltinTypes.class, "BuiltinTypes");
    addEEnumLiteral(builtinTypesEEnum, BuiltinTypes.STRING);
    addEEnumLiteral(builtinTypesEEnum, BuiltinTypes.BOOLEAN);
    addEEnumLiteral(builtinTypesEEnum, BuiltinTypes.INTEGER);
    addEEnumLiteral(builtinTypesEEnum, BuiltinTypes.URL);
    addEEnumLiteral(builtinTypesEEnum, BuiltinTypes.TEXT);
    addEEnumLiteral(builtinTypesEEnum, BuiltinTypes.NUMBER);
    addEEnumLiteral(builtinTypesEEnum, BuiltinTypes.EMAIL);
    addEEnumLiteral(builtinTypesEEnum, BuiltinTypes.PHONE);
    addEEnumLiteral(builtinTypesEEnum, BuiltinTypes.DATE);
    addEEnumLiteral(builtinTypesEEnum, BuiltinTypes.PASSWORD);

    // Create resource
    createResource(eNS_URI);
  }

} //StructureDslPackageImpl

/**
 */
package nl.dslmeinte.simscript.structure.structureDsl;

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
 * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslFactory
 * @model kind="package"
 * @generated
 */
public interface StructureDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "structureDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dslconsultancy.com/simscript/structure/StructureDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "structureDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StructureDslPackage eINSTANCE = nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl.init();

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.StructureModelImpl <em>Structure Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureModelImpl
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getStructureModel()
   * @generated
   */
  int STRUCTURE_MODEL = 0;

  /**
   * The feature id for the '<em><b>Type Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_MODEL__TYPE_DEFINITIONS = 0;

  /**
   * The number of structural features of the '<em>Structure Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.DefinedTypeImpl <em>Defined Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.DefinedTypeImpl
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getDefinedType()
   * @generated
   */
  int DEFINED_TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINED_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Defined Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINED_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.StructureImpl <em>Structure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureImpl
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getStructure()
   * @generated
   */
  int STRUCTURE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE__NAME = DEFINED_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE__PERSISTENT = DEFINED_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE__FEATURES = DEFINED_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Structure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FEATURE_COUNT = DEFINED_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.FeatureImpl
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__OPTIONAL = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.EnumerationImpl
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__NAME = DEFINED_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__LITERALS = DEFINED_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = DEFINED_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.EnumerationLiteralImpl
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getEnumerationLiteral()
   * @generated
   */
  int ENUMERATION_LITERAL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__DISPLAY_NAME = 1;

  /**
   * The number of structural features of the '<em>Enumeration Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.TypeLiteralImpl <em>Type Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.TypeLiteralImpl
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getTypeLiteral()
   * @generated
   */
  int TYPE_LITERAL = 6;

  /**
   * The number of structural features of the '<em>Type Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.BuiltinTypeLiteralImpl <em>Builtin Type Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.BuiltinTypeLiteralImpl
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getBuiltinTypeLiteral()
   * @generated
   */
  int BUILTIN_TYPE_LITERAL = 7;

  /**
   * The feature id for the '<em><b>Builtin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILTIN_TYPE_LITERAL__BUILTIN = TYPE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Builtin Type Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILTIN_TYPE_LITERAL_FEATURE_COUNT = TYPE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.DefinedTypeLiteralImpl <em>Defined Type Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.DefinedTypeLiteralImpl
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getDefinedTypeLiteral()
   * @generated
   */
  int DEFINED_TYPE_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINED_TYPE_LITERAL__TYPE = TYPE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Defined Type Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINED_TYPE_LITERAL_FEATURE_COUNT = TYPE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.ListTypeLiteralImpl <em>List Type Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.ListTypeLiteralImpl
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getListTypeLiteral()
   * @generated
   */
  int LIST_TYPE_LITERAL = 9;

  /**
   * The feature id for the '<em><b>Item Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE_LITERAL__ITEM_TYPE = TYPE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Type Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE_LITERAL_FEATURE_COUNT = TYPE_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.SyntheticTypeLiteralImpl <em>Synthetic Type Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.SyntheticTypeLiteralImpl
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getSyntheticTypeLiteral()
   * @generated
   */
  int SYNTHETIC_TYPE_LITERAL = 10;

  /**
   * The number of structural features of the '<em>Synthetic Type Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTHETIC_TYPE_LITERAL_FEATURE_COUNT = TYPE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.CallbackLiteralImpl <em>Callback Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.CallbackLiteralImpl
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getCallbackLiteral()
   * @generated
   */
  int CALLBACK_LITERAL = 11;

  /**
   * The number of structural features of the '<em>Callback Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLBACK_LITERAL_FEATURE_COUNT = SYNTHETIC_TYPE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.CallbackErrorResponseLiteralImpl <em>Callback Error Response Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.CallbackErrorResponseLiteralImpl
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getCallbackErrorResponseLiteral()
   * @generated
   */
  int CALLBACK_ERROR_RESPONSE_LITERAL = 12;

  /**
   * The number of structural features of the '<em>Callback Error Response Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLBACK_ERROR_RESPONSE_LITERAL_FEATURE_COUNT = SYNTHETIC_TYPE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.VoidLiteralImpl <em>Void Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.VoidLiteralImpl
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getVoidLiteral()
   * @generated
   */
  int VOID_LITERAL = 13;

  /**
   * The number of structural features of the '<em>Void Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID_LITERAL_FEATURE_COUNT = SYNTHETIC_TYPE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypes <em>Builtin Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypes
   * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getBuiltinTypes()
   * @generated
   */
  int BUILTIN_TYPES = 14;


  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.structure.structureDsl.StructureModel <em>Structure Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Model</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.StructureModel
   * @generated
   */
  EClass getStructureModel();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.structure.structureDsl.StructureModel#getTypeDefinitions <em>Type Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Definitions</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.StructureModel#getTypeDefinitions()
   * @see #getStructureModel()
   * @generated
   */
  EReference getStructureModel_TypeDefinitions();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.structure.structureDsl.DefinedType <em>Defined Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Defined Type</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.DefinedType
   * @generated
   */
  EClass getDefinedType();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.structure.structureDsl.DefinedType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.DefinedType#getName()
   * @see #getDefinedType()
   * @generated
   */
  EAttribute getDefinedType_Name();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.structure.structureDsl.Structure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.Structure
   * @generated
   */
  EClass getStructure();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.structure.structureDsl.Structure#isPersistent <em>Persistent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Persistent</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.Structure#isPersistent()
   * @see #getStructure()
   * @generated
   */
  EAttribute getStructure_Persistent();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.structure.structureDsl.Structure#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.Structure#getFeatures()
   * @see #getStructure()
   * @generated
   */
  EReference getStructure_Features();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.structure.structureDsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.structure.structureDsl.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.structure.structureDsl.Feature#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.Feature#isOptional()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Optional();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.structure.structureDsl.Feature#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.Feature#getType()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Type();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.structure.structureDsl.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.structure.structureDsl.Enumeration#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.Enumeration#getLiterals()
   * @see #getEnumeration()
   * @generated
   */
  EReference getEnumeration_Literals();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral <em>Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Literal</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral
   * @generated
   */
  EClass getEnumerationLiteral();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral#getName()
   * @see #getEnumerationLiteral()
   * @generated
   */
  EAttribute getEnumerationLiteral_Name();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral#getDisplayName <em>Display Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Name</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral#getDisplayName()
   * @see #getEnumerationLiteral()
   * @generated
   */
  EAttribute getEnumerationLiteral_DisplayName();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral <em>Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Literal</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral
   * @generated
   */
  EClass getTypeLiteral();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypeLiteral <em>Builtin Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Builtin Type Literal</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypeLiteral
   * @generated
   */
  EClass getBuiltinTypeLiteral();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypeLiteral#getBuiltin <em>Builtin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Builtin</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypeLiteral#getBuiltin()
   * @see #getBuiltinTypeLiteral()
   * @generated
   */
  EAttribute getBuiltinTypeLiteral_Builtin();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.structure.structureDsl.DefinedTypeLiteral <em>Defined Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Defined Type Literal</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.DefinedTypeLiteral
   * @generated
   */
  EClass getDefinedTypeLiteral();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.structure.structureDsl.DefinedTypeLiteral#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.DefinedTypeLiteral#getType()
   * @see #getDefinedTypeLiteral()
   * @generated
   */
  EReference getDefinedTypeLiteral_Type();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.structure.structureDsl.ListTypeLiteral <em>List Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Type Literal</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.ListTypeLiteral
   * @generated
   */
  EClass getListTypeLiteral();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.structure.structureDsl.ListTypeLiteral#getItemType <em>Item Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Item Type</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.ListTypeLiteral#getItemType()
   * @see #getListTypeLiteral()
   * @generated
   */
  EReference getListTypeLiteral_ItemType();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.structure.structureDsl.SyntheticTypeLiteral <em>Synthetic Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Synthetic Type Literal</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.SyntheticTypeLiteral
   * @generated
   */
  EClass getSyntheticTypeLiteral();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.structure.structureDsl.CallbackLiteral <em>Callback Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Callback Literal</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.CallbackLiteral
   * @generated
   */
  EClass getCallbackLiteral();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.structure.structureDsl.CallbackErrorResponseLiteral <em>Callback Error Response Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Callback Error Response Literal</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.CallbackErrorResponseLiteral
   * @generated
   */
  EClass getCallbackErrorResponseLiteral();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.structure.structureDsl.VoidLiteral <em>Void Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Void Literal</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.VoidLiteral
   * @generated
   */
  EClass getVoidLiteral();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypes <em>Builtin Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Builtin Types</em>'.
   * @see nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypes
   * @generated
   */
  EEnum getBuiltinTypes();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StructureDslFactory getStructureDslFactory();

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
     * The meta object literal for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.StructureModelImpl <em>Structure Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureModelImpl
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getStructureModel()
     * @generated
     */
    EClass STRUCTURE_MODEL = eINSTANCE.getStructureModel();

    /**
     * The meta object literal for the '<em><b>Type Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE_MODEL__TYPE_DEFINITIONS = eINSTANCE.getStructureModel_TypeDefinitions();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.DefinedTypeImpl <em>Defined Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.DefinedTypeImpl
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getDefinedType()
     * @generated
     */
    EClass DEFINED_TYPE = eINSTANCE.getDefinedType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINED_TYPE__NAME = eINSTANCE.getDefinedType_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.StructureImpl <em>Structure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureImpl
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getStructure()
     * @generated
     */
    EClass STRUCTURE = eINSTANCE.getStructure();

    /**
     * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURE__PERSISTENT = eINSTANCE.getStructure_Persistent();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE__FEATURES = eINSTANCE.getStructure_Features();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.FeatureImpl
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__OPTIONAL = eINSTANCE.getFeature_Optional();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.EnumerationImpl
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.EnumerationLiteralImpl
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getEnumerationLiteral()
     * @generated
     */
    EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION_LITERAL__NAME = eINSTANCE.getEnumerationLiteral_Name();

    /**
     * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION_LITERAL__DISPLAY_NAME = eINSTANCE.getEnumerationLiteral_DisplayName();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.TypeLiteralImpl <em>Type Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.TypeLiteralImpl
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getTypeLiteral()
     * @generated
     */
    EClass TYPE_LITERAL = eINSTANCE.getTypeLiteral();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.BuiltinTypeLiteralImpl <em>Builtin Type Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.BuiltinTypeLiteralImpl
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getBuiltinTypeLiteral()
     * @generated
     */
    EClass BUILTIN_TYPE_LITERAL = eINSTANCE.getBuiltinTypeLiteral();

    /**
     * The meta object literal for the '<em><b>Builtin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILTIN_TYPE_LITERAL__BUILTIN = eINSTANCE.getBuiltinTypeLiteral_Builtin();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.DefinedTypeLiteralImpl <em>Defined Type Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.DefinedTypeLiteralImpl
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getDefinedTypeLiteral()
     * @generated
     */
    EClass DEFINED_TYPE_LITERAL = eINSTANCE.getDefinedTypeLiteral();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINED_TYPE_LITERAL__TYPE = eINSTANCE.getDefinedTypeLiteral_Type();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.ListTypeLiteralImpl <em>List Type Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.ListTypeLiteralImpl
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getListTypeLiteral()
     * @generated
     */
    EClass LIST_TYPE_LITERAL = eINSTANCE.getListTypeLiteral();

    /**
     * The meta object literal for the '<em><b>Item Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_TYPE_LITERAL__ITEM_TYPE = eINSTANCE.getListTypeLiteral_ItemType();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.SyntheticTypeLiteralImpl <em>Synthetic Type Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.SyntheticTypeLiteralImpl
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getSyntheticTypeLiteral()
     * @generated
     */
    EClass SYNTHETIC_TYPE_LITERAL = eINSTANCE.getSyntheticTypeLiteral();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.CallbackLiteralImpl <em>Callback Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.CallbackLiteralImpl
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getCallbackLiteral()
     * @generated
     */
    EClass CALLBACK_LITERAL = eINSTANCE.getCallbackLiteral();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.CallbackErrorResponseLiteralImpl <em>Callback Error Response Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.CallbackErrorResponseLiteralImpl
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getCallbackErrorResponseLiteral()
     * @generated
     */
    EClass CALLBACK_ERROR_RESPONSE_LITERAL = eINSTANCE.getCallbackErrorResponseLiteral();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.structure.structureDsl.impl.VoidLiteralImpl <em>Void Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.VoidLiteralImpl
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getVoidLiteral()
     * @generated
     */
    EClass VOID_LITERAL = eINSTANCE.getVoidLiteral();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypes <em>Builtin Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypes
     * @see nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslPackageImpl#getBuiltinTypes()
     * @generated
     */
    EEnum BUILTIN_TYPES = eINSTANCE.getBuiltinTypes();

  }

} //StructureDslPackage

/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

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
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslFactory
 * @model kind="package"
 * @generated
 */
public interface SimUiDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "simUiDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dslconsultancy.com/simscript/ui/SimUiDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "simUiDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimUiDslPackage eINSTANCE = nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl.init();

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.UiModuleImpl <em>Ui Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.UiModuleImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getUiModule()
   * @generated
   */
  int UI_MODULE = 0;

  /**
   * The feature id for the '<em><b>Not Authenticated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_MODULE__NOT_AUTHENTICATED = 0;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_MODULE__DEFINITIONS = 1;

  /**
   * The number of structural features of the '<em>Ui Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_MODULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TopLevelDefinitionImpl <em>Top Level Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TopLevelDefinitionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTopLevelDefinition()
   * @generated
   */
  int TOP_LEVEL_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_DEFINITION__PARAMETER_LIST = 0;

  /**
   * The number of structural features of the '<em>Top Level Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_LEVEL_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TableRowsDefinitionImpl <em>Table Rows Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TableRowsDefinitionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTableRowsDefinition()
   * @generated
   */
  int TABLE_ROWS_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROWS_DEFINITION__PARAMETER_LIST = TOP_LEVEL_DEFINITION__PARAMETER_LIST;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROWS_DEFINITION__NAME = TOP_LEVEL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROWS_DEFINITION__ROWS = TOP_LEVEL_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Table Rows Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROWS_DEFINITION_FEATURE_COUNT = TOP_LEVEL_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ViewableImpl <em>Viewable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ViewableImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getViewable()
   * @generated
   */
  int VIEWABLE = 3;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWABLE__PARAMETER_LIST = TOP_LEVEL_DEFINITION__PARAMETER_LIST;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWABLE__TYPE = TOP_LEVEL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWABLE__NAME = TOP_LEVEL_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Viewable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWABLE_FEATURE_COUNT = TOP_LEVEL_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DefinedViewableImpl <em>Defined Viewable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.DefinedViewableImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getDefinedViewable()
   * @generated
   */
  int DEFINED_VIEWABLE = 4;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINED_VIEWABLE__PARAMETER_LIST = VIEWABLE__PARAMETER_LIST;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINED_VIEWABLE__TYPE = VIEWABLE__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINED_VIEWABLE__NAME = VIEWABLE__NAME;

  /**
   * The feature id for the '<em><b>Values Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINED_VIEWABLE__VALUES_BLOCK = VIEWABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINED_VIEWABLE__DEFINITIONS = VIEWABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Defined Viewable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINED_VIEWABLE_FEATURE_COUNT = VIEWABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ManualViewableImpl <em>Manual Viewable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ManualViewableImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getManualViewable()
   * @generated
   */
  int MANUAL_VIEWABLE = 5;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANUAL_VIEWABLE__PARAMETER_LIST = VIEWABLE__PARAMETER_LIST;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANUAL_VIEWABLE__TYPE = VIEWABLE__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANUAL_VIEWABLE__NAME = VIEWABLE__NAME;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANUAL_VIEWABLE__NAMESPACE = VIEWABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Manual Viewable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANUAL_VIEWABLE_FEATURE_COUNT = VIEWABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.LocalViewableDefinitionImpl <em>Local Viewable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.LocalViewableDefinitionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getLocalViewableDefinition()
   * @generated
   */
  int LOCAL_VIEWABLE_DEFINITION = 6;

  /**
   * The number of structural features of the '<em>Local Viewable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VIEWABLE_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ValuesBlockImpl <em>Values Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ValuesBlockImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getValuesBlock()
   * @generated
   */
  int VALUES_BLOCK = 7;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_BLOCK__DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Values Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.AbstractValueDeclarationImpl <em>Abstract Value Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.AbstractValueDeclarationImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getAbstractValueDeclaration()
   * @generated
   */
  int ABSTRACT_VALUE_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VALUE_DECLARATION__VALUE = 0;

  /**
   * The feature id for the '<em><b>Declared Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VALUE_DECLARATION__DECLARED_TYPE = 1;

  /**
   * The feature id for the '<em><b>Value Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VALUE_DECLARATION__VALUE_EXPR = 2;

  /**
   * The number of structural features of the '<em>Abstract Value Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_VALUE_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ValueDeclarationImpl <em>Value Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ValueDeclarationImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getValueDeclaration()
   * @generated
   */
  int VALUE_DECLARATION = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_DECLARATION__VALUE = ABSTRACT_VALUE_DECLARATION__VALUE;

  /**
   * The feature id for the '<em><b>Declared Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_DECLARATION__DECLARED_TYPE = ABSTRACT_VALUE_DECLARATION__DECLARED_TYPE;

  /**
   * The feature id for the '<em><b>Value Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_DECLARATION__VALUE_EXPR = ABSTRACT_VALUE_DECLARATION__VALUE_EXPR;

  /**
   * The feature id for the '<em><b>Value Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_DECLARATION__VALUE_TYPE = ABSTRACT_VALUE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_DECLARATION_FEATURE_COUNT = ABSTRACT_VALUE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ReferableImpl <em>Referable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ReferableImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getReferable()
   * @generated
   */
  int REFERABLE = 78;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Referable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ValueImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getValue()
   * @generated
   */
  int VALUE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__NAME = REFERABLE__NAME;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = REFERABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ParameterImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = REFERABLE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = REFERABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = REFERABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ParameterListImpl <em>Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ParameterListImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getParameterList()
   * @generated
   */
  int PARAMETER_LIST = 12;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodDefinitionImpl <em>Method Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodDefinitionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getMethodDefinition()
   * @generated
   */
  int METHOD_DEFINITION = 13;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION__PARAMETER_LIST = TOP_LEVEL_DEFINITION__PARAMETER_LIST;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION__METHOD = TOP_LEVEL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION__STATEMENT_BLOCK = TOP_LEVEL_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION_FEATURE_COUNT = TOP_LEVEL_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = REFERABLE__NAME;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = REFERABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 15;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = LOCAL_VIEWABLE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.QuotationImpl <em>Quotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.QuotationImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getQuotation()
   * @generated
   */
  int QUOTATION = 16;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTATION__PATH = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Quotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUOTATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.BindingImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBinding()
   * @generated
   */
  int BINDING = 17;

  /**
   * The feature id for the '<em><b>Bind Site</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__BIND_SITE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ElementBodyImpl <em>Element Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ElementBodyImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getElementBody()
   * @generated
   */
  int ELEMENT_BODY = 18;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_BODY__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Element Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ComponentInvocationImpl <em>Component Invocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ComponentInvocationImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getComponentInvocation()
   * @generated
   */
  int COMPONENT_INVOCATION = 19;

  /**
   * The feature id for the '<em><b>Viewable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INVOCATION__VIEWABLE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INVOCATION__ARGUMENT_LIST = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Component Invocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_INVOCATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ArgumentImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 20;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Value Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__VALUE_EXPR = 1;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ArgumentListImpl <em>Argument List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ArgumentListImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getArgumentList()
   * @generated
   */
  int ARGUMENT_LIST = 21;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_LIST__ARGUMENTS = 0;

  /**
   * The number of structural features of the '<em>Argument List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InputElementImpl <em>Input Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.InputElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getInputElement()
   * @generated
   */
  int INPUT_ELEMENT = 22;

  /**
   * The feature id for the '<em><b>Bind Site</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__BIND_SITE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Hint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__HINT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__MIN_VALUE = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Max Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__MAX_VALUE = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Radio Option</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__RADIO_OPTION = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>On Change</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__ON_CHANGE = ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>On Submit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__ON_SUBMIT = ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Structure Option</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT__STRUCTURE_OPTION = ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Input Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.RadioOptionImpl <em>Radio Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.RadioOptionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getRadioOption()
   * @generated
   */
  int RADIO_OPTION = 23;

  /**
   * The feature id for the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_OPTION__TRUE = 0;

  /**
   * The feature id for the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_OPTION__FALSE = 1;

  /**
   * The number of structural features of the '<em>Radio Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_OPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.StructureOptionImpl <em>Structure Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.StructureOptionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getStructureOption()
   * @generated
   */
  int STRUCTURE_OPTION = 24;

  /**
   * The feature id for the '<em><b>Source Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_OPTION__SOURCE_EXPR = 0;

  /**
   * The feature id for the '<em><b>Display Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_OPTION__DISPLAY_FUNCTION = 1;

  /**
   * The number of structural features of the '<em>Structure Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_OPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ButtonElementImpl <em>Button Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ButtonElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getButtonElement()
   * @generated
   */
  int BUTTON_ELEMENT = 25;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ELEMENT__TEXT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ELEMENT__ACTION = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ELEMENT__CSS_CLASS = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Button Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BlockElementImpl <em>Block Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.BlockElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBlockElement()
   * @generated
   */
  int BLOCK_ELEMENT = 26;

  /**
   * The feature id for the '<em><b>On Click</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ELEMENT__ON_CLICK = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ELEMENT__CSS_CLASS = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ELEMENT__BODY_CSS_CLASS = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ELEMENT__STYLE = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ELEMENT__HEADER = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Header Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ELEMENT__HEADER_CSS_CLASS = ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>No Css</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ELEMENT__NO_CSS = ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ELEMENT__BODY = ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Block Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListElementImpl <em>List Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ListElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getListElement()
   * @generated
   */
  int LIST_ELEMENT = 27;

  /**
   * The feature id for the '<em><b>Index Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ELEMENT__INDEX_VARIABLE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ELEMENT__VALUE_VARIABLE = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>List Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ELEMENT__LIST_EXPRESSION = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ELEMENT__BODY = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>List Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListVariableImpl <em>List Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ListVariableImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getListVariable()
   * @generated
   */
  int LIST_VARIABLE = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VARIABLE__NAME = REFERABLE__NAME;

  /**
   * The number of structural features of the '<em>List Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VARIABLE_FEATURE_COUNT = REFERABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TableElementImpl <em>Table Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TableElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTableElement()
   * @generated
   */
  int TABLE_ELEMENT = 29;

  /**
   * The feature id for the '<em><b>Sub Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT__SUB_ELEMENTS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Table Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TableBodyElementImpl <em>Table Body Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TableBodyElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTableBodyElement()
   * @generated
   */
  int TABLE_BODY_ELEMENT = 30;

  /**
   * The number of structural features of the '<em>Table Body Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_BODY_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TableRowsInvocationImpl <em>Table Rows Invocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TableRowsInvocationImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTableRowsInvocation()
   * @generated
   */
  int TABLE_ROWS_INVOCATION = 31;

  /**
   * The feature id for the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROWS_INVOCATION__DEFINITION = TABLE_BODY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROWS_INVOCATION__ARGUMENT_LIST = TABLE_BODY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Table Rows Invocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROWS_INVOCATION_FEATURE_COUNT = TABLE_BODY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TableRowImpl <em>Table Row</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TableRowImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTableRow()
   * @generated
   */
  int TABLE_ROW = 32;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROW__LABEL = TABLE_BODY_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROW__BODY = TABLE_BODY_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Table Row</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_ROW_FEATURE_COUNT = TABLE_BODY_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.LabeledTableElementImpl <em>Labeled Table Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.LabeledTableElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getLabeledTableElement()
   * @generated
   */
  int LABELED_TABLE_ELEMENT = 33;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_TABLE_ELEMENT__BODY = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Labeled Table Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_TABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.LabeledTableRowImpl <em>Labeled Table Row</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.LabeledTableRowImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getLabeledTableRow()
   * @generated
   */
  int LABELED_TABLE_ROW = 34;

  /**
   * The feature id for the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_TABLE_ROW__LABEL = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_TABLE_ROW__BODY = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Labeled Table Row</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_TABLE_ROW_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ProgressBarTabSetImpl <em>Progress Bar Tab Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ProgressBarTabSetImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getProgressBarTabSet()
   * @generated
   */
  int PROGRESS_BAR_TAB_SET = 35;

  /**
   * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRESS_BAR_TAB_SET__TABS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Progress Bar Tab Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRESS_BAR_TAB_SET_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ViewableCallSiteImpl <em>Viewable Call Site</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ViewableCallSiteImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getViewableCallSite()
   * @generated
   */
  int VIEWABLE_CALL_SITE = 62;

  /**
   * The feature id for the '<em><b>Viewable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWABLE_CALL_SITE__VIEWABLE = 0;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWABLE_CALL_SITE__ARGUMENT_LIST = 1;

  /**
   * The number of structural features of the '<em>Viewable Call Site</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEWABLE_CALL_SITE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TabDeclarationImpl <em>Tab Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TabDeclarationImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTabDeclaration()
   * @generated
   */
  int TAB_DECLARATION = 36;

  /**
   * The feature id for the '<em><b>Viewable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_DECLARATION__VIEWABLE = VIEWABLE_CALL_SITE__VIEWABLE;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_DECLARATION__ARGUMENT_LIST = VIEWABLE_CALL_SITE__ARGUMENT_LIST;

  /**
   * The feature id for the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_DECLARATION__HEADER = VIEWABLE_CALL_SITE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Previous Callback</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_DECLARATION__PREVIOUS_CALLBACK = VIEWABLE_CALL_SITE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Next Callback</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_DECLARATION__NEXT_CALLBACK = VIEWABLE_CALL_SITE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Tab Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_DECLARATION_FEATURE_COUNT = VIEWABLE_CALL_SITE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GroupElementImpl <em>Group Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.GroupElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getGroupElement()
   * @generated
   */
  int GROUP_ELEMENT = 37;

  /**
   * The feature id for the '<em><b>Orientation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ELEMENT__ORIENTATION = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Valign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ELEMENT__VALIGN = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Nested Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ELEMENT__NESTED_GROUPS = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Leaf Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ELEMENT__LEAF_GROUPS = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Group Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CountdownTimerImpl <em>Countdown Timer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CountdownTimerImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCountdownTimer()
   * @generated
   */
  int COUNTDOWN_TIMER = 38;

  /**
   * The feature id for the '<em><b>Observed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNTDOWN_TIMER__OBSERVED = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNTDOWN_TIMER__END_TIME = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>On End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNTDOWN_TIMER__ON_END = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Countdown Timer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNTDOWN_TIMER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ObserveElementImpl <em>Observe Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ObserveElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getObserveElement()
   * @generated
   */
  int OBSERVE_ELEMENT = 39;

  /**
   * The feature id for the '<em><b>Observe Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVE_ELEMENT__OBSERVE_EXPR = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVE_ELEMENT__STATEMENT_BLOCK = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Observe Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CalendarElementImpl <em>Calendar Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CalendarElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCalendarElement()
   * @generated
   */
  int CALENDAR_ELEMENT = 40;

  /**
   * The feature id for the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALENDAR_ELEMENT__DATE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>On Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALENDAR_ELEMENT__ON_SELECT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Allow From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALENDAR_ELEMENT__ALLOW_FROM = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Date Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALENDAR_ELEMENT__DATE_FORMAT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Days</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALENDAR_ELEMENT__DAYS = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALENDAR_ELEMENT__CSS_CLASS = ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Calendar Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALENDAR_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TimeSlotListElementImpl <em>Time Slot List Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TimeSlotListElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTimeSlotListElement()
   * @generated
   */
  int TIME_SLOT_LIST_ELEMENT = 41;

  /**
   * The feature id for the '<em><b>Slots</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SLOT_LIST_ELEMENT__SLOTS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>On Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SLOT_LIST_ELEMENT__ON_SELECT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>On Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SLOT_LIST_ELEMENT__ON_DELETE = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Time Slot List Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_SLOT_LIST_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.SlotAddElementImpl <em>Slot Add Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SlotAddElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getSlotAddElement()
   * @generated
   */
  int SLOT_ADD_ELEMENT = 42;

  /**
   * The feature id for the '<em><b>Product</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLOT_ADD_ELEMENT__PRODUCT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Day</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLOT_ADD_ELEMENT__DAY = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Slots</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLOT_ADD_ELEMENT__SLOTS = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Start Hour</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLOT_ADD_ELEMENT__START_HOUR = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>End Hour</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLOT_ADD_ELEMENT__END_HOUR = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Slot Add Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLOT_ADD_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.WhenElementImpl <em>When Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.WhenElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getWhenElement()
   * @generated
   */
  int WHEN_ELEMENT = 43;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_ELEMENT__CONDITION = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_ELEMENT__BODY = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ImageElementImpl <em>Image Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ImageElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getImageElement()
   * @generated
   */
  int IMAGE_ELEMENT = 44;

  /**
   * The feature id for the '<em><b>Observed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ELEMENT__OBSERVED = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ELEMENT__SOURCE_URL = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ELEMENT__WIDTH = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ELEMENT__HEIGHT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Image Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.FrameElementImpl <em>Frame Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.FrameElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getFrameElement()
   * @generated
   */
  int FRAME_ELEMENT = 45;

  /**
   * The feature id for the '<em><b>Source Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_ELEMENT__SOURCE_URL = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_ELEMENT__WIDTH = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_ELEMENT__HEIGHT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Frame Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAME_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.LineBreakElementImpl <em>Line Break Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.LineBreakElementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getLineBreakElement()
   * @generated
   */
  int LINE_BREAK_ELEMENT = 46;

  /**
   * The number of structural features of the '<em>Line Break Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_BREAK_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.StatementBlockImpl <em>Statement Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.StatementBlockImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getStatementBlock()
   * @generated
   */
  int STATEMENT_BLOCK = 47;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Statement Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.StatementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 48;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ExitingStatementImpl <em>Exiting Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ExitingStatementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getExitingStatement()
   * @generated
   */
  int EXITING_STATEMENT = 49;

  /**
   * The number of structural features of the '<em>Exiting Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXITING_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.NonExitingStatementImpl <em>Non Exiting Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.NonExitingStatementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getNonExitingStatement()
   * @generated
   */
  int NON_EXITING_STATEMENT = 50;

  /**
   * The number of structural features of the '<em>Non Exiting Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_EXITING_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ForStatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ForStatementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getForStatement()
   * @generated
   */
  int FOR_STATEMENT = 51;

  /**
   * The feature id for the '<em><b>Index Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__INDEX_VARIABLE = NON_EXITING_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__VALUE_VARIABLE = NON_EXITING_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>List Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__LIST_EXPRESSION = NON_EXITING_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Then Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__THEN_BLOCK = NON_EXITING_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>For Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = NON_EXITING_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListRemoveStatementImpl <em>List Remove Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ListRemoveStatementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getListRemoveStatement()
   * @generated
   */
  int LIST_REMOVE_STATEMENT = 52;

  /**
   * The feature id for the '<em><b>List Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_REMOVE_STATEMENT__LIST_EXPR = NON_EXITING_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_REMOVE_STATEMENT__FEATURE = NON_EXITING_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_REMOVE_STATEMENT__VALUE_EXPR = NON_EXITING_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Index Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_REMOVE_STATEMENT__INDEX_VARIABLE = NON_EXITING_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>List Remove Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_REMOVE_STATEMENT_FEATURE_COUNT = NON_EXITING_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.AssignmentOrExpressionStatementImpl <em>Assignment Or Expression Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.AssignmentOrExpressionStatementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getAssignmentOrExpressionStatement()
   * @generated
   */
  int ASSIGNMENT_OR_EXPRESSION_STATEMENT = 53;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OR_EXPRESSION_STATEMENT__LHS = NON_EXITING_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OR_EXPRESSION_STATEMENT__OPERATOR = NON_EXITING_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OR_EXPRESSION_STATEMENT__RHS = NON_EXITING_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assignment Or Expression Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OR_EXPRESSION_STATEMENT_FEATURE_COUNT = NON_EXITING_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ShowModalStatementImpl <em>Show Modal Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ShowModalStatementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getShowModalStatement()
   * @generated
   */
  int SHOW_MODAL_STATEMENT = 54;

  /**
   * The feature id for the '<em><b>Viewable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_MODAL_STATEMENT__VIEWABLE = NON_EXITING_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_MODAL_STATEMENT__ARGUMENT_LIST = NON_EXITING_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_MODAL_STATEMENT__PERSISTENT = NON_EXITING_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Show Modal Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_MODAL_STATEMENT_FEATURE_COUNT = NON_EXITING_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ExitModalStatementImpl <em>Exit Modal Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ExitModalStatementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getExitModalStatement()
   * @generated
   */
  int EXIT_MODAL_STATEMENT = 55;

  /**
   * The number of structural features of the '<em>Exit Modal Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_MODAL_STATEMENT_FEATURE_COUNT = NON_EXITING_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoScreenStatementImpl <em>Goto Screen Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoScreenStatementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getGotoScreenStatement()
   * @generated
   */
  int GOTO_SCREEN_STATEMENT = 56;

  /**
   * The feature id for the '<em><b>Viewable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_SCREEN_STATEMENT__VIEWABLE = EXITING_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_SCREEN_STATEMENT__ARGUMENT_LIST = EXITING_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Goto Screen Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_SCREEN_STATEMENT_FEATURE_COUNT = EXITING_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoModuleStatementImpl <em>Goto Module Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoModuleStatementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getGotoModuleStatement()
   * @generated
   */
  int GOTO_MODULE_STATEMENT = 57;

  /**
   * The feature id for the '<em><b>Target Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_MODULE_STATEMENT__TARGET_MODULE = EXITING_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_MODULE_STATEMENT__ARGS = EXITING_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Authenticate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_MODULE_STATEMENT__AUTHENTICATE = EXITING_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Auth Option</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_MODULE_STATEMENT__AUTH_OPTION = EXITING_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Principal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_MODULE_STATEMENT__PRINCIPAL = EXITING_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Credential</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_MODULE_STATEMENT__CREDENTIAL = EXITING_STATEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Error Callback</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_MODULE_STATEMENT__ERROR_CALLBACK = EXITING_STATEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Goto Module Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_MODULE_STATEMENT_FEATURE_COUNT = EXITING_STATEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.PrincipalArgumentImpl <em>Principal Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.PrincipalArgumentImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getPrincipalArgument()
   * @generated
   */
  int PRINCIPAL_ARGUMENT = 58;

  /**
   * The feature id for the '<em><b>Principal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINCIPAL_ARGUMENT__PRINCIPAL = 0;

  /**
   * The feature id for the '<em><b>Value Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINCIPAL_ARGUMENT__VALUE_EXPR = 1;

  /**
   * The number of structural features of the '<em>Principal Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINCIPAL_ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CredentialArgumentImpl <em>Credential Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CredentialArgumentImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCredentialArgument()
   * @generated
   */
  int CREDENTIAL_ARGUMENT = 59;

  /**
   * The feature id for the '<em><b>Credential</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDENTIAL_ARGUMENT__CREDENTIAL = 0;

  /**
   * The feature id for the '<em><b>Value Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDENTIAL_ARGUMENT__VALUE_EXPR = 1;

  /**
   * The number of structural features of the '<em>Credential Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDENTIAL_ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.IfStatementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 60;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__CONDITION = NON_EXITING_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__THEN_BLOCK = NON_EXITING_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSE_BLOCK = NON_EXITING_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = NON_EXITING_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.LocalValueDeclarationStatementImpl <em>Local Value Declaration Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.LocalValueDeclarationStatementImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getLocalValueDeclarationStatement()
   * @generated
   */
  int LOCAL_VALUE_DECLARATION_STATEMENT = 61;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VALUE_DECLARATION_STATEMENT__VALUE = ABSTRACT_VALUE_DECLARATION__VALUE;

  /**
   * The feature id for the '<em><b>Declared Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VALUE_DECLARATION_STATEMENT__DECLARED_TYPE = ABSTRACT_VALUE_DECLARATION__DECLARED_TYPE;

  /**
   * The feature id for the '<em><b>Value Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VALUE_DECLARATION_STATEMENT__VALUE_EXPR = ABSTRACT_VALUE_DECLARATION__VALUE_EXPR;

  /**
   * The number of structural features of the '<em>Local Value Declaration Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VALUE_DECLARATION_STATEMENT_FEATURE_COUNT = ABSTRACT_VALUE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 63;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ServiceIdentificationImpl <em>Service Identification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ServiceIdentificationImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getServiceIdentification()
   * @generated
   */
  int SERVICE_IDENTIFICATION = 64;

  /**
   * The number of structural features of the '<em>Service Identification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_IDENTIFICATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DateExpressionImpl <em>Date Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.DateExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getDateExpression()
   * @generated
   */
  int DATE_EXPRESSION = 65;

  /**
   * The number of structural features of the '<em>Date Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BuiltinFunctionExpressionImpl <em>Builtin Function Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.BuiltinFunctionExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBuiltinFunctionExpression()
   * @generated
   */
  int BUILTIN_FUNCTION_EXPRESSION = 66;

  /**
   * The feature id for the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILTIN_FUNCTION_EXPRESSION__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILTIN_FUNCTION_EXPRESSION__ARGUMENT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sort Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILTIN_FUNCTION_EXPRESSION__SORT_FEATURE = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Builtin Function Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILTIN_FUNCTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.LiteralExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getLiteralExpression()
   * @generated
   */
  int LITERAL_EXPRESSION = 67;

  /**
   * The number of structural features of the '<em>Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListLiteralExpressionImpl <em>List Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ListLiteralExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getListLiteralExpression()
   * @generated
   */
  int LIST_LITERAL_EXPRESSION = 68;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL_EXPRESSION__MEMBERS = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_LITERAL_EXPRESSION_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.EnumerationLiteralExpressionImpl <em>Enumeration Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.EnumerationLiteralExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getEnumerationLiteralExpression()
   * @generated
   */
  int ENUMERATION_LITERAL_EXPRESSION = 69;

  /**
   * The feature id for the '<em><b>Enumeration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL_EXPRESSION__ENUMERATION = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL_EXPRESSION__LITERAL = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enumeration Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL_EXPRESSION_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DecisionExpressionImpl <em>Decision Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.DecisionExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getDecisionExpression()
   * @generated
   */
  int DECISION_EXPRESSION = 70;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_EXPRESSION__CASES = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default Value Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_EXPRESSION__DEFAULT_VALUE_EXPR = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Decision Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_EXPRESSION_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DecisionCaseImpl <em>Decision Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.DecisionCaseImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getDecisionCase()
   * @generated
   */
  int DECISION_CASE = 71;

  /**
   * The feature id for the '<em><b>Guard Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_CASE__GUARD_EXPR = 0;

  /**
   * The feature id for the '<em><b>Value Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_CASE__VALUE_EXPR = 1;

  /**
   * The number of structural features of the '<em>Decision Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackExpressionsImpl <em>Callback Expressions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackExpressionsImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCallbackExpressions()
   * @generated
   */
  int CALLBACK_EXPRESSIONS = 72;

  /**
   * The number of structural features of the '<em>Callback Expressions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLBACK_EXPRESSIONS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackExpressionImpl <em>Callback Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCallbackExpression()
   * @generated
   */
  int CALLBACK_EXPRESSION = 73;

  /**
   * The feature id for the '<em><b>Statement Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLBACK_EXPRESSION__STATEMENT_BLOCK = CALLBACK_EXPRESSIONS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Callback Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLBACK_EXPRESSION_FEATURE_COUNT = CALLBACK_EXPRESSIONS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.StructureCreationExpressionImpl <em>Structure Creation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.StructureCreationExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getStructureCreationExpression()
   * @generated
   */
  int STRUCTURE_CREATION_EXPRESSION = 74;

  /**
   * The feature id for the '<em><b>Structure</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_CREATION_EXPRESSION__STRUCTURE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_CREATION_EXPRESSION__ASSIGNMENTS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Structure Creation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_CREATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.FeatureAssignmentImpl <em>Feature Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.FeatureAssignmentImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getFeatureAssignment()
   * @generated
   */
  int FEATURE_ASSIGNMENT = 75;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_ASSIGNMENT__FEATURE = 0;

  /**
   * The feature id for the '<em><b>Value Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_ASSIGNMENT__VALUE_EXPR = 1;

  /**
   * The number of structural features of the '<em>Feature Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ValueReferenceOrMethodCallExpressionImpl <em>Value Reference Or Method Call Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ValueReferenceOrMethodCallExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getValueReferenceOrMethodCallExpression()
   * @generated
   */
  int VALUE_REFERENCE_OR_METHOD_CALL_EXPRESSION = 76;

  /**
   * The number of structural features of the '<em>Value Reference Or Method Call Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_REFERENCE_OR_METHOD_CALL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ReferenceExpressionImpl <em>Reference Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ReferenceExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getReferenceExpression()
   * @generated
   */
  int REFERENCE_EXPRESSION = 77;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_EXPRESSION__REF = VALUE_REFERENCE_OR_METHOD_CALL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reference Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_EXPRESSION_FEATURE_COUNT = VALUE_REFERENCE_OR_METHOD_CALL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TernaryExpressionImpl <em>Ternary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TernaryExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTernaryExpression()
   * @generated
   */
  int TERNARY_EXPRESSION = 79;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERNARY_EXPRESSION__GUARD = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERNARY_EXPRESSION__THEN_EXPR = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERNARY_EXPRESSION__ELSE_EXPR = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Ternary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BinaryOperatorExpressionImpl <em>Binary Operator Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.BinaryOperatorExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBinaryOperatorExpression()
   * @generated
   */
  int BINARY_OPERATOR_EXPRESSION = 102;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATOR_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Binary Operator Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BooleanBinaryOperatorExpressionImpl <em>Boolean Binary Operator Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.BooleanBinaryOperatorExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBooleanBinaryOperatorExpression()
   * @generated
   */
  int BOOLEAN_BINARY_OPERATOR_EXPRESSION = 100;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_BINARY_OPERATOR_EXPRESSION__LEFT_OPERAND = BINARY_OPERATOR_EXPRESSION__LEFT_OPERAND;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_BINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND = BINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND;

  /**
   * The number of structural features of the '<em>Boolean Binary Operator Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT = BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.OrExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 80;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__LEFT_OPERAND = BOOLEAN_BINARY_OPERATOR_EXPRESSION__LEFT_OPERAND;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__RIGHT_OPERAND = BOOLEAN_BINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = BOOLEAN_BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.AndExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 81;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__LEFT_OPERAND = BOOLEAN_BINARY_OPERATOR_EXPRESSION__LEFT_OPERAND;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__RIGHT_OPERAND = BOOLEAN_BINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = BOOLEAN_BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ComparisonExpressionImpl <em>Comparison Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ComparisonExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getComparisonExpression()
   * @generated
   */
  int COMPARISON_EXPRESSION = 82;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION__LEFT_OPERAND = BINARY_OPERATOR_EXPRESSION__LEFT_OPERAND;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION__RIGHT_OPERAND = BINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND;

  /**
   * The feature id for the '<em><b>Comparator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION__COMPARATOR = BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Comparison Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_EXPRESSION_FEATURE_COUNT = BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ArithmeticBinaryOperatorExpressionImpl <em>Arithmetic Binary Operator Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ArithmeticBinaryOperatorExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getArithmeticBinaryOperatorExpression()
   * @generated
   */
  int ARITHMETIC_BINARY_OPERATOR_EXPRESSION = 101;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_BINARY_OPERATOR_EXPRESSION__LEFT_OPERAND = BINARY_OPERATOR_EXPRESSION__LEFT_OPERAND;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_BINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND = BINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND;

  /**
   * The number of structural features of the '<em>Arithmetic Binary Operator Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT = BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.AdditiveExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getAdditiveExpression()
   * @generated
   */
  int ADDITIVE_EXPRESSION = 83;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__LEFT_OPERAND = ARITHMETIC_BINARY_OPERATOR_EXPRESSION__LEFT_OPERAND;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__RIGHT_OPERAND = ARITHMETIC_BINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__OPERATOR = ARITHMETIC_BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Additive Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_FEATURE_COUNT = ARITHMETIC_BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.MultiplicativeExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getMultiplicativeExpression()
   * @generated
   */
  int MULTIPLICATIVE_EXPRESSION = 84;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__LEFT_OPERAND = ARITHMETIC_BINARY_OPERATOR_EXPRESSION__LEFT_OPERAND;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__RIGHT_OPERAND = ARITHMETIC_BINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__OPERATOR = ARITHMETIC_BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Multiplicative Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = ARITHMETIC_BINARY_OPERATOR_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.NotExpressionImpl <em>Not Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.NotExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getNotExpression()
   * @generated
   */
  int NOT_EXPRESSION = 85;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InterfaceCallExpressionImpl <em>Interface Call Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.InterfaceCallExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getInterfaceCallExpression()
   * @generated
   */
  int INTERFACE_CALL_EXPRESSION = 86;

  /**
   * The feature id for the '<em><b>Service Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_CALL_EXPRESSION__SERVICE_ID = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Observe Sites</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_CALL_EXPRESSION__OBSERVE_SITES = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_CALL_EXPRESSION__INPUT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Callback</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_CALL_EXPRESSION__CALLBACK = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Error Callback</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_CALL_EXPRESSION__ERROR_CALLBACK = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Interface Call Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_CALL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.NamedServiceReferenceImpl <em>Named Service Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.NamedServiceReferenceImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getNamedServiceReference()
   * @generated
   */
  int NAMED_SERVICE_REFERENCE = 87;

  /**
   * The feature id for the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_SERVICE_REFERENCE__SERVICE = SERVICE_IDENTIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Service Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_SERVICE_REFERENCE_FEATURE_COUNT = SERVICE_IDENTIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CrudServiceIdentificationImpl <em>Crud Service Identification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CrudServiceIdentificationImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCrudServiceIdentification()
   * @generated
   */
  int CRUD_SERVICE_IDENTIFICATION = 88;

  /**
   * The feature id for the '<em><b>Crud Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRUD_SERVICE_IDENTIFICATION__CRUD_TYPE = SERVICE_IDENTIFICATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Structure</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRUD_SERVICE_IDENTIFICATION__STRUCTURE = SERVICE_IDENTIFICATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Crud Service Identification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRUD_SERVICE_IDENTIFICATION_FEATURE_COUNT = SERVICE_IDENTIFICATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.FeatureAccessExpressionImpl <em>Feature Access Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.FeatureAccessExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getFeatureAccessExpression()
   * @generated
   */
  int FEATURE_ACCESS_EXPRESSION = 89;

  /**
   * The feature id for the '<em><b>Previous</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_ACCESS_EXPRESSION__PREVIOUS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_ACCESS_EXPRESSION__FEATURE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Feature Access Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_ACCESS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.SelectionExpressionImpl <em>Selection Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SelectionExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getSelectionExpression()
   * @generated
   */
  int SELECTION_EXPRESSION = 90;

  /**
   * The number of structural features of the '<em>Selection Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DateNowExpressionImpl <em>Date Now Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.DateNowExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getDateNowExpression()
   * @generated
   */
  int DATE_NOW_EXPRESSION = 91;

  /**
   * The number of structural features of the '<em>Date Now Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_NOW_EXPRESSION_FEATURE_COUNT = DATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DateTodayExpressionImpl <em>Date Today Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.DateTodayExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getDateTodayExpression()
   * @generated
   */
  int DATE_TODAY_EXPRESSION = 92;

  /**
   * The number of structural features of the '<em>Date Today Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_TODAY_EXPRESSION_FEATURE_COUNT = DATE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.StringLiteralExpressionImpl <em>String Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.StringLiteralExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getStringLiteralExpression()
   * @generated
   */
  int STRING_LITERAL_EXPRESSION = 93;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_EXPRESSION__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_EXPRESSION_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BooleanLiteralExpressionImpl <em>Boolean Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.BooleanLiteralExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBooleanLiteralExpression()
   * @generated
   */
  int BOOLEAN_LITERAL_EXPRESSION = 94;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_EXPRESSION__LITERAL = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_EXPRESSION_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.IntegerLiteralExpressionImpl <em>Integer Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.IntegerLiteralExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getIntegerLiteralExpression()
   * @generated
   */
  int INTEGER_LITERAL_EXPRESSION = 95;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_EXPRESSION__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_EXPRESSION_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.NumberLiteralExpressionImpl <em>Number Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.NumberLiteralExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getNumberLiteralExpression()
   * @generated
   */
  int NUMBER_LITERAL_EXPRESSION = 96;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_EXPRESSION__VALUE = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_EXPRESSION_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackResponseExpressionImpl <em>Callback Response Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackResponseExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCallbackResponseExpression()
   * @generated
   */
  int CALLBACK_RESPONSE_EXPRESSION = 97;

  /**
   * The number of structural features of the '<em>Callback Response Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLBACK_RESPONSE_EXPRESSION_FEATURE_COUNT = CALLBACK_EXPRESSIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackErrorResponseExpressionImpl <em>Callback Error Response Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackErrorResponseExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCallbackErrorResponseExpression()
   * @generated
   */
  int CALLBACK_ERROR_RESPONSE_EXPRESSION = 98;

  /**
   * The number of structural features of the '<em>Callback Error Response Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLBACK_ERROR_RESPONSE_EXPRESSION_FEATURE_COUNT = CALLBACK_EXPRESSIONS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodCallExpressionImpl <em>Method Call Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodCallExpressionImpl
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getMethodCallExpression()
   * @generated
   */
  int METHOD_CALL_EXPRESSION = 99;

  /**
   * The feature id for the '<em><b>Method Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL_EXPRESSION__METHOD_REF = VALUE_REFERENCE_OR_METHOD_CALL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL_EXPRESSION__ARGUMENT_LIST = VALUE_REFERENCE_OR_METHOD_CALL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method Call Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL_EXPRESSION_FEATURE_COUNT = VALUE_REFERENCE_OR_METHOD_CALL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ViewableTypes <em>Viewable Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ViewableTypes
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getViewableTypes()
   * @generated
   */
  int VIEWABLE_TYPES = 103;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ValueTypes <em>Value Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ValueTypes
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getValueTypes()
   * @generated
   */
  int VALUE_TYPES = 104;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.GroupOrientations <em>Group Orientations</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GroupOrientations
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getGroupOrientations()
   * @generated
   */
  int GROUP_ORIENTATIONS = 105;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.VerticalAlignment <em>Vertical Alignment</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.VerticalAlignment
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getVerticalAlignment()
   * @generated
   */
  int VERTICAL_ALIGNMENT = 106;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOperator <em>Assignment Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOperator
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getAssignmentOperator()
   * @generated
   */
  int ASSIGNMENT_OPERATOR = 107;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.Comparator <em>Comparator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Comparator
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getComparator()
   * @generated
   */
  int COMPARATOR = 108;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.AdditiveOperators <em>Additive Operators</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AdditiveOperators
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getAdditiveOperators()
   * @generated
   */
  int ADDITIVE_OPERATORS = 109;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeOperators <em>Multiplicative Operators</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeOperators
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getMultiplicativeOperators()
   * @generated
   */
  int MULTIPLICATIVE_OPERATORS = 110;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CrudTypes <em>Crud Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CrudTypes
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCrudTypes()
   * @generated
   */
  int CRUD_TYPES = 111;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctions <em>Builtin Functions</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctions
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBuiltinFunctions()
   * @generated
   */
  int BUILTIN_FUNCTIONS = 112;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiterals <em>Boolean Literals</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiterals
   * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBooleanLiterals()
   * @generated
   */
  int BOOLEAN_LITERALS = 113;


  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.UiModule <em>Ui Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ui Module</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.UiModule
   * @generated
   */
  EClass getUiModule();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.UiModule#isNotAuthenticated <em>Not Authenticated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Authenticated</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.UiModule#isNotAuthenticated()
   * @see #getUiModule()
   * @generated
   */
  EAttribute getUiModule_NotAuthenticated();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.UiModule#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.UiModule#getDefinitions()
   * @see #getUiModule()
   * @generated
   */
  EReference getUiModule_Definitions();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TopLevelDefinition <em>Top Level Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Level Definition</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TopLevelDefinition
   * @generated
   */
  EClass getTopLevelDefinition();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.TopLevelDefinition#getParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TopLevelDefinition#getParameterList()
   * @see #getTopLevelDefinition()
   * @generated
   */
  EReference getTopLevelDefinition_ParameterList();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRowsDefinition <em>Table Rows Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Rows Definition</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableRowsDefinition
   * @generated
   */
  EClass getTableRowsDefinition();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRowsDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableRowsDefinition#getName()
   * @see #getTableRowsDefinition()
   * @generated
   */
  EAttribute getTableRowsDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRowsDefinition#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rows</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableRowsDefinition#getRows()
   * @see #getTableRowsDefinition()
   * @generated
   */
  EReference getTableRowsDefinition_Rows();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Viewable <em>Viewable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Viewable</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Viewable
   * @generated
   */
  EClass getViewable();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.Viewable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Viewable#getType()
   * @see #getViewable()
   * @generated
   */
  EAttribute getViewable_Type();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.Viewable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Viewable#getName()
   * @see #getViewable()
   * @generated
   */
  EAttribute getViewable_Name();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable <em>Defined Viewable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Defined Viewable</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable
   * @generated
   */
  EClass getDefinedViewable();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable#getValuesBlock <em>Values Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Values Block</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable#getValuesBlock()
   * @see #getDefinedViewable()
   * @generated
   */
  EReference getDefinedViewable_ValuesBlock();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable#getDefinitions()
   * @see #getDefinedViewable()
   * @generated
   */
  EReference getDefinedViewable_Definitions();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ManualViewable <em>Manual Viewable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Manual Viewable</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ManualViewable
   * @generated
   */
  EClass getManualViewable();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.ManualViewable#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ManualViewable#getNamespace()
   * @see #getManualViewable()
   * @generated
   */
  EAttribute getManualViewable_Namespace();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.LocalViewableDefinition <em>Local Viewable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Viewable Definition</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.LocalViewableDefinition
   * @generated
   */
  EClass getLocalViewableDefinition();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ValuesBlock <em>Values Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Values Block</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ValuesBlock
   * @generated
   */
  EClass getValuesBlock();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.ValuesBlock#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ValuesBlock#getDeclarations()
   * @see #getValuesBlock()
   * @generated
   */
  EReference getValuesBlock_Declarations();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ValueDeclaration <em>Value Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Declaration</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ValueDeclaration
   * @generated
   */
  EClass getValueDeclaration();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.ValueDeclaration#getValueType <em>Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Type</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ValueDeclaration#getValueType()
   * @see #getValueDeclaration()
   * @generated
   */
  EAttribute getValueDeclaration_ValueType();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration <em>Abstract Value Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Value Declaration</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration
   * @generated
   */
  EClass getAbstractValueDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration#getValue()
   * @see #getAbstractValueDeclaration()
   * @generated
   */
  EReference getAbstractValueDeclaration_Value();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration#getDeclaredType <em>Declared Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declared Type</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration#getDeclaredType()
   * @see #getAbstractValueDeclaration()
   * @generated
   */
  EReference getAbstractValueDeclaration_DeclaredType();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration#getValueExpr <em>Value Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Expr</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration#getValueExpr()
   * @see #getAbstractValueDeclaration()
   * @generated
   */
  EReference getAbstractValueDeclaration_ValueExpr();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter List</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ParameterList
   * @generated
   */
  EClass getParameterList();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.ParameterList#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ParameterList#getParameters()
   * @see #getParameterList()
   * @generated
   */
  EReference getParameterList_Parameters();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.MethodDefinition <em>Method Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Definition</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.MethodDefinition
   * @generated
   */
  EClass getMethodDefinition();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.MethodDefinition#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.MethodDefinition#getMethod()
   * @see #getMethodDefinition()
   * @generated
   */
  EReference getMethodDefinition_Method();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.MethodDefinition#getStatementBlock <em>Statement Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Block</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.MethodDefinition#getStatementBlock()
   * @see #getMethodDefinition()
   * @generated
   */
  EReference getMethodDefinition_StatementBlock();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Quotation <em>Quotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quotation</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Quotation
   * @generated
   */
  EClass getQuotation();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.Quotation#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Quotation#getPath()
   * @see #getQuotation()
   * @generated
   */
  EReference getQuotation_Path();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.Binding#getBindSite <em>Bind Site</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bind Site</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Binding#getBindSite()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_BindSite();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ElementBody <em>Element Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Body</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ElementBody
   * @generated
   */
  EClass getElementBody();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.ElementBody#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ElementBody#getElements()
   * @see #getElementBody()
   * @generated
   */
  EReference getElementBody_Elements();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ComponentInvocation <em>Component Invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Invocation</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ComponentInvocation
   * @generated
   */
  EClass getComponentInvocation();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.Argument#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Argument#getParameter()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Parameter();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.Argument#getValueExpr <em>Value Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Expr</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Argument#getValueExpr()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_ValueExpr();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument List</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ArgumentList
   * @generated
   */
  EClass getArgumentList();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.ArgumentList#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ArgumentList#getArguments()
   * @see #getArgumentList()
   * @generated
   */
  EReference getArgumentList_Arguments();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement <em>Input Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InputElement
   * @generated
   */
  EClass getInputElement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getBindSite <em>Bind Site</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bind Site</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getBindSite()
   * @see #getInputElement()
   * @generated
   */
  EReference getInputElement_BindSite();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getHint <em>Hint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hint</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getHint()
   * @see #getInputElement()
   * @generated
   */
  EAttribute getInputElement_Hint();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getMinValue <em>Min Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min Value</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getMinValue()
   * @see #getInputElement()
   * @generated
   */
  EReference getInputElement_MinValue();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getMaxValue <em>Max Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max Value</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getMaxValue()
   * @see #getInputElement()
   * @generated
   */
  EReference getInputElement_MaxValue();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getRadioOption <em>Radio Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Radio Option</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getRadioOption()
   * @see #getInputElement()
   * @generated
   */
  EReference getInputElement_RadioOption();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getOnChange <em>On Change</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>On Change</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getOnChange()
   * @see #getInputElement()
   * @generated
   */
  EReference getInputElement_OnChange();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getOnSubmit <em>On Submit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>On Submit</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getOnSubmit()
   * @see #getInputElement()
   * @generated
   */
  EReference getInputElement_OnSubmit();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getStructureOption <em>Structure Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structure Option</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getStructureOption()
   * @see #getInputElement()
   * @generated
   */
  EReference getInputElement_StructureOption();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.RadioOption <em>Radio Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Radio Option</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.RadioOption
   * @generated
   */
  EClass getRadioOption();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.RadioOption#getTrue <em>True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>True</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.RadioOption#getTrue()
   * @see #getRadioOption()
   * @generated
   */
  EAttribute getRadioOption_True();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.RadioOption#getFalse <em>False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>False</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.RadioOption#getFalse()
   * @see #getRadioOption()
   * @generated
   */
  EAttribute getRadioOption_False();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.StructureOption <em>Structure Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Option</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.StructureOption
   * @generated
   */
  EClass getStructureOption();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.StructureOption#getSourceExpr <em>Source Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Expr</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.StructureOption#getSourceExpr()
   * @see #getStructureOption()
   * @generated
   */
  EReference getStructureOption_SourceExpr();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.StructureOption#getDisplayFunction <em>Display Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Display Function</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.StructureOption#getDisplayFunction()
   * @see #getStructureOption()
   * @generated
   */
  EReference getStructureOption_DisplayFunction();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement <em>Button Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement
   * @generated
   */
  EClass getButtonElement();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement#getText()
   * @see #getButtonElement()
   * @generated
   */
  EAttribute getButtonElement_Text();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement#getAction()
   * @see #getButtonElement()
   * @generated
   */
  EReference getButtonElement_Action();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement#getCssClass <em>Css Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Css Class</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement#getCssClass()
   * @see #getButtonElement()
   * @generated
   */
  EAttribute getButtonElement_CssClass();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement <em>Block Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BlockElement
   * @generated
   */
  EClass getBlockElement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getOnClick <em>On Click</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>On Click</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getOnClick()
   * @see #getBlockElement()
   * @generated
   */
  EReference getBlockElement_OnClick();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getCssClass <em>Css Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Css Class</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getCssClass()
   * @see #getBlockElement()
   * @generated
   */
  EAttribute getBlockElement_CssClass();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getBodyCssClass <em>Body Css Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body Css Class</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getBodyCssClass()
   * @see #getBlockElement()
   * @generated
   */
  EAttribute getBlockElement_BodyCssClass();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getStyle()
   * @see #getBlockElement()
   * @generated
   */
  EAttribute getBlockElement_Style();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Header</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getHeader()
   * @see #getBlockElement()
   * @generated
   */
  EReference getBlockElement_Header();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getHeaderCssClass <em>Header Css Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Header Css Class</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getHeaderCssClass()
   * @see #getBlockElement()
   * @generated
   */
  EAttribute getBlockElement_HeaderCssClass();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#isNoCss <em>No Css</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>No Css</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#isNoCss()
   * @see #getBlockElement()
   * @generated
   */
  EAttribute getBlockElement_NoCss();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getBody()
   * @see #getBlockElement()
   * @generated
   */
  EReference getBlockElement_Body();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListElement <em>List Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListElement
   * @generated
   */
  EClass getListElement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getIndexVariable <em>Index Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index Variable</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getIndexVariable()
   * @see #getListElement()
   * @generated
   */
  EReference getListElement_IndexVariable();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getValueVariable <em>Value Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Variable</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getValueVariable()
   * @see #getListElement()
   * @generated
   */
  EReference getListElement_ValueVariable();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getListExpression <em>List Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getListExpression()
   * @see #getListElement()
   * @generated
   */
  EReference getListElement_ListExpression();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getBody()
   * @see #getListElement()
   * @generated
   */
  EReference getListElement_Body();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListVariable <em>List Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Variable</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListVariable
   * @generated
   */
  EClass getListVariable();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableElement <em>Table Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableElement
   * @generated
   */
  EClass getTableElement();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableElement#getSubElements <em>Sub Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Elements</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableElement#getSubElements()
   * @see #getTableElement()
   * @generated
   */
  EReference getTableElement_SubElements();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableBodyElement <em>Table Body Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Body Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableBodyElement
   * @generated
   */
  EClass getTableBodyElement();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation <em>Table Rows Invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Rows Invocation</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation
   * @generated
   */
  EClass getTableRowsInvocation();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Definition</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation#getDefinition()
   * @see #getTableRowsInvocation()
   * @generated
   */
  EReference getTableRowsInvocation_Definition();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation#getArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument List</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation#getArgumentList()
   * @see #getTableRowsInvocation()
   * @generated
   */
  EReference getTableRowsInvocation_ArgumentList();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRow <em>Table Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Row</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableRow
   * @generated
   */
  EClass getTableRow();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRow#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableRow#getLabel()
   * @see #getTableRow()
   * @generated
   */
  EReference getTableRow_Label();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRow#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableRow#getBody()
   * @see #getTableRow()
   * @generated
   */
  EReference getTableRow_Body();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableElement <em>Labeled Table Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Labeled Table Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableElement
   * @generated
   */
  EClass getLabeledTableElement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableElement#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableElement#getBody()
   * @see #getLabeledTableElement()
   * @generated
   */
  EReference getLabeledTableElement_Body();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableRow <em>Labeled Table Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Labeled Table Row</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableRow
   * @generated
   */
  EClass getLabeledTableRow();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableRow#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableRow#getLabel()
   * @see #getLabeledTableRow()
   * @generated
   */
  EReference getLabeledTableRow_Label();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableRow#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableRow#getBody()
   * @see #getLabeledTableRow()
   * @generated
   */
  EReference getLabeledTableRow_Body();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ProgressBarTabSet <em>Progress Bar Tab Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Progress Bar Tab Set</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ProgressBarTabSet
   * @generated
   */
  EClass getProgressBarTabSet();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.ProgressBarTabSet#getTabs <em>Tabs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tabs</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ProgressBarTabSet#getTabs()
   * @see #getProgressBarTabSet()
   * @generated
   */
  EReference getProgressBarTabSet_Tabs();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration <em>Tab Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tab Declaration</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration
   * @generated
   */
  EClass getTabDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Header</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration#getHeader()
   * @see #getTabDeclaration()
   * @generated
   */
  EReference getTabDeclaration_Header();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration#getPreviousCallback <em>Previous Callback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Previous Callback</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration#getPreviousCallback()
   * @see #getTabDeclaration()
   * @generated
   */
  EReference getTabDeclaration_PreviousCallback();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration#getNextCallback <em>Next Callback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next Callback</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration#getNextCallback()
   * @see #getTabDeclaration()
   * @generated
   */
  EReference getTabDeclaration_NextCallback();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.GroupElement <em>Group Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GroupElement
   * @generated
   */
  EClass getGroupElement();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.GroupElement#getOrientation <em>Orientation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orientation</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GroupElement#getOrientation()
   * @see #getGroupElement()
   * @generated
   */
  EAttribute getGroupElement_Orientation();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.GroupElement#getV_align <em>Valign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valign</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GroupElement#getV_align()
   * @see #getGroupElement()
   * @generated
   */
  EAttribute getGroupElement_V_align();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.GroupElement#getNestedGroups <em>Nested Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nested Groups</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GroupElement#getNestedGroups()
   * @see #getGroupElement()
   * @generated
   */
  EReference getGroupElement_NestedGroups();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.GroupElement#getLeafGroups <em>Leaf Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Leaf Groups</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GroupElement#getLeafGroups()
   * @see #getGroupElement()
   * @generated
   */
  EReference getGroupElement_LeafGroups();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer <em>Countdown Timer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Countdown Timer</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer
   * @generated
   */
  EClass getCountdownTimer();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer#isObserved <em>Observed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Observed</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer#isObserved()
   * @see #getCountdownTimer()
   * @generated
   */
  EAttribute getCountdownTimer_Observed();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer#getEndTime <em>End Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End Time</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer#getEndTime()
   * @see #getCountdownTimer()
   * @generated
   */
  EReference getCountdownTimer_EndTime();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer#getOnEnd <em>On End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>On End</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer#getOnEnd()
   * @see #getCountdownTimer()
   * @generated
   */
  EReference getCountdownTimer_OnEnd();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ObserveElement <em>Observe Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Observe Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ObserveElement
   * @generated
   */
  EClass getObserveElement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ObserveElement#getObserveExpr <em>Observe Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Observe Expr</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ObserveElement#getObserveExpr()
   * @see #getObserveElement()
   * @generated
   */
  EReference getObserveElement_ObserveExpr();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ObserveElement#getStatementBlock <em>Statement Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Block</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ObserveElement#getStatementBlock()
   * @see #getObserveElement()
   * @generated
   */
  EReference getObserveElement_StatementBlock();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement <em>Calendar Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Calendar Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement
   * @generated
   */
  EClass getCalendarElement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Date</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getDate()
   * @see #getCalendarElement()
   * @generated
   */
  EReference getCalendarElement_Date();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getOnSelect <em>On Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>On Select</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getOnSelect()
   * @see #getCalendarElement()
   * @generated
   */
  EReference getCalendarElement_OnSelect();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getAllowFrom <em>Allow From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Allow From</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getAllowFrom()
   * @see #getCalendarElement()
   * @generated
   */
  EReference getCalendarElement_AllowFrom();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getDateFormat <em>Date Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date Format</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getDateFormat()
   * @see #getCalendarElement()
   * @generated
   */
  EAttribute getCalendarElement_DateFormat();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getDays <em>Days</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Days</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getDays()
   * @see #getCalendarElement()
   * @generated
   */
  EReference getCalendarElement_Days();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getCssClass <em>Css Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Css Class</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getCssClass()
   * @see #getCalendarElement()
   * @generated
   */
  EAttribute getCalendarElement_CssClass();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement <em>Time Slot List Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Slot List Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement
   * @generated
   */
  EClass getTimeSlotListElement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement#getSlots <em>Slots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Slots</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement#getSlots()
   * @see #getTimeSlotListElement()
   * @generated
   */
  EReference getTimeSlotListElement_Slots();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement#getOnSelect <em>On Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>On Select</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement#getOnSelect()
   * @see #getTimeSlotListElement()
   * @generated
   */
  EReference getTimeSlotListElement_OnSelect();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement#getOnDelete <em>On Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>On Delete</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement#getOnDelete()
   * @see #getTimeSlotListElement()
   * @generated
   */
  EReference getTimeSlotListElement_OnDelete();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement <em>Slot Add Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Slot Add Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement
   * @generated
   */
  EClass getSlotAddElement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement#getProduct <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Product</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement#getProduct()
   * @see #getSlotAddElement()
   * @generated
   */
  EReference getSlotAddElement_Product();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement#getDay <em>Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Day</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement#getDay()
   * @see #getSlotAddElement()
   * @generated
   */
  EReference getSlotAddElement_Day();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement#getSlots <em>Slots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Slots</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement#getSlots()
   * @see #getSlotAddElement()
   * @generated
   */
  EReference getSlotAddElement_Slots();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement#getStartHour <em>Start Hour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start Hour</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement#getStartHour()
   * @see #getSlotAddElement()
   * @generated
   */
  EReference getSlotAddElement_StartHour();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement#getEndHour <em>End Hour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End Hour</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement#getEndHour()
   * @see #getSlotAddElement()
   * @generated
   */
  EReference getSlotAddElement_EndHour();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.WhenElement <em>When Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.WhenElement
   * @generated
   */
  EClass getWhenElement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.WhenElement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.WhenElement#getCondition()
   * @see #getWhenElement()
   * @generated
   */
  EReference getWhenElement_Condition();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.WhenElement#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.WhenElement#getBody()
   * @see #getWhenElement()
   * @generated
   */
  EReference getWhenElement_Body();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ImageElement <em>Image Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ImageElement
   * @generated
   */
  EClass getImageElement();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#isObserved <em>Observed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Observed</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#isObserved()
   * @see #getImageElement()
   * @generated
   */
  EAttribute getImageElement_Observed();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#getSourceUrl <em>Source Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Url</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#getSourceUrl()
   * @see #getImageElement()
   * @generated
   */
  EReference getImageElement_SourceUrl();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Width</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#getWidth()
   * @see #getImageElement()
   * @generated
   */
  EReference getImageElement_Width();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Height</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#getHeight()
   * @see #getImageElement()
   * @generated
   */
  EReference getImageElement_Height();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.FrameElement <em>Frame Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Frame Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.FrameElement
   * @generated
   */
  EClass getFrameElement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.FrameElement#getSourceUrl <em>Source Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Url</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.FrameElement#getSourceUrl()
   * @see #getFrameElement()
   * @generated
   */
  EReference getFrameElement_SourceUrl();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.FrameElement#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Width</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.FrameElement#getWidth()
   * @see #getFrameElement()
   * @generated
   */
  EReference getFrameElement_Width();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.FrameElement#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Height</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.FrameElement#getHeight()
   * @see #getFrameElement()
   * @generated
   */
  EReference getFrameElement_Height();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.LineBreakElement <em>Line Break Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line Break Element</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.LineBreakElement
   * @generated
   */
  EClass getLineBreakElement();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock <em>Statement Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Block</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock
   * @generated
   */
  EClass getStatementBlock();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock#getStatements()
   * @see #getStatementBlock()
   * @generated
   */
  EReference getStatementBlock_Statements();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ExitingStatement <em>Exiting Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exiting Statement</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ExitingStatement
   * @generated
   */
  EClass getExitingStatement();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.NonExitingStatement <em>Non Exiting Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Exiting Statement</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.NonExitingStatement
   * @generated
   */
  EClass getNonExitingStatement();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Statement</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ForStatement
   * @generated
   */
  EClass getForStatement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getIndexVariable <em>Index Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index Variable</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getIndexVariable()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_IndexVariable();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getValueVariable <em>Value Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Variable</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getValueVariable()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_ValueVariable();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getListExpression <em>List Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getListExpression()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_ListExpression();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getThenBlock <em>Then Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Block</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getThenBlock()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_ThenBlock();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement <em>List Remove Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Remove Statement</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement
   * @generated
   */
  EClass getListRemoveStatement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getListExpr <em>List Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List Expr</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getListExpr()
   * @see #getListRemoveStatement()
   * @generated
   */
  EReference getListRemoveStatement_ListExpr();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getFeature()
   * @see #getListRemoveStatement()
   * @generated
   */
  EReference getListRemoveStatement_Feature();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getValueExpr <em>Value Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Expr</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getValueExpr()
   * @see #getListRemoveStatement()
   * @generated
   */
  EReference getListRemoveStatement_ValueExpr();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getIndexVariable <em>Index Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index Variable</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getIndexVariable()
   * @see #getListRemoveStatement()
   * @generated
   */
  EReference getListRemoveStatement_IndexVariable();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement <em>Assignment Or Expression Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Or Expression Statement</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement
   * @generated
   */
  EClass getAssignmentOrExpressionStatement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement#getLhs()
   * @see #getAssignmentOrExpressionStatement()
   * @generated
   */
  EReference getAssignmentOrExpressionStatement_Lhs();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement#getOperator()
   * @see #getAssignmentOrExpressionStatement()
   * @generated
   */
  EAttribute getAssignmentOrExpressionStatement_Operator();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement#getRhs()
   * @see #getAssignmentOrExpressionStatement()
   * @generated
   */
  EReference getAssignmentOrExpressionStatement_Rhs();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ShowModalStatement <em>Show Modal Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Show Modal Statement</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ShowModalStatement
   * @generated
   */
  EClass getShowModalStatement();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.ShowModalStatement#isPersistent <em>Persistent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Persistent</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ShowModalStatement#isPersistent()
   * @see #getShowModalStatement()
   * @generated
   */
  EAttribute getShowModalStatement_Persistent();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ExitModalStatement <em>Exit Modal Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exit Modal Statement</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ExitModalStatement
   * @generated
   */
  EClass getExitModalStatement();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoScreenStatement <em>Goto Screen Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goto Screen Statement</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GotoScreenStatement
   * @generated
   */
  EClass getGotoScreenStatement();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement <em>Goto Module Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goto Module Statement</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement
   * @generated
   */
  EClass getGotoModuleStatement();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getTargetModule <em>Target Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Module</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getTargetModule()
   * @see #getGotoModuleStatement()
   * @generated
   */
  EReference getGotoModuleStatement_TargetModule();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getArgs()
   * @see #getGotoModuleStatement()
   * @generated
   */
  EReference getGotoModuleStatement_Args();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#isAuthenticate <em>Authenticate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Authenticate</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#isAuthenticate()
   * @see #getGotoModuleStatement()
   * @generated
   */
  EAttribute getGotoModuleStatement_Authenticate();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getAuthOption <em>Auth Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Auth Option</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getAuthOption()
   * @see #getGotoModuleStatement()
   * @generated
   */
  EReference getGotoModuleStatement_AuthOption();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getPrincipal <em>Principal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Principal</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getPrincipal()
   * @see #getGotoModuleStatement()
   * @generated
   */
  EReference getGotoModuleStatement_Principal();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getCredential <em>Credential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Credential</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getCredential()
   * @see #getGotoModuleStatement()
   * @generated
   */
  EReference getGotoModuleStatement_Credential();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getErrorCallback <em>Error Callback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Error Callback</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getErrorCallback()
   * @see #getGotoModuleStatement()
   * @generated
   */
  EReference getGotoModuleStatement_ErrorCallback();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument <em>Principal Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Principal Argument</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument
   * @generated
   */
  EClass getPrincipalArgument();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument#getPrincipal <em>Principal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Principal</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument#getPrincipal()
   * @see #getPrincipalArgument()
   * @generated
   */
  EReference getPrincipalArgument_Principal();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument#getValueExpr <em>Value Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Expr</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument#getValueExpr()
   * @see #getPrincipalArgument()
   * @generated
   */
  EReference getPrincipalArgument_ValueExpr();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CredentialArgument <em>Credential Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Credential Argument</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CredentialArgument
   * @generated
   */
  EClass getCredentialArgument();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.CredentialArgument#getCredential <em>Credential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Credential</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CredentialArgument#getCredential()
   * @see #getCredentialArgument()
   * @generated
   */
  EReference getCredentialArgument_Credential();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.CredentialArgument#getValueExpr <em>Value Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Expr</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CredentialArgument#getValueExpr()
   * @see #getCredentialArgument()
   * @generated
   */
  EReference getCredentialArgument_ValueExpr();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.IfStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.IfStatement#getCondition()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Condition();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.IfStatement#getThenBlock <em>Then Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Block</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.IfStatement#getThenBlock()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_ThenBlock();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.IfStatement#getElseBlock <em>Else Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Block</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.IfStatement#getElseBlock()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_ElseBlock();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.LocalValueDeclarationStatement <em>Local Value Declaration Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Value Declaration Statement</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.LocalValueDeclarationStatement
   * @generated
   */
  EClass getLocalValueDeclarationStatement();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite <em>Viewable Call Site</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Viewable Call Site</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite
   * @generated
   */
  EClass getViewableCallSite();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite#getViewable <em>Viewable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Viewable</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite#getViewable()
   * @see #getViewableCallSite()
   * @generated
   */
  EReference getViewableCallSite_Viewable();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite#getArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument List</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite#getArgumentList()
   * @see #getViewableCallSite()
   * @generated
   */
  EReference getViewableCallSite_ArgumentList();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ServiceIdentification <em>Service Identification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Identification</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ServiceIdentification
   * @generated
   */
  EClass getServiceIdentification();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.DateExpression <em>Date Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DateExpression
   * @generated
   */
  EClass getDateExpression();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression <em>Builtin Function Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Builtin Function Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression
   * @generated
   */
  EClass getBuiltinFunctionExpression();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression#getFunction()
   * @see #getBuiltinFunctionExpression()
   * @generated
   */
  EAttribute getBuiltinFunctionExpression_Function();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression#getArgument()
   * @see #getBuiltinFunctionExpression()
   * @generated
   */
  EReference getBuiltinFunctionExpression_Argument();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression#getSortFeature <em>Sort Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sort Feature</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression#getSortFeature()
   * @see #getBuiltinFunctionExpression()
   * @generated
   */
  EReference getBuiltinFunctionExpression_SortFeature();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.LiteralExpression <em>Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.LiteralExpression
   * @generated
   */
  EClass getLiteralExpression();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListLiteralExpression <em>List Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Literal Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListLiteralExpression
   * @generated
   */
  EClass getListLiteralExpression();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListLiteralExpression#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListLiteralExpression#getMembers()
   * @see #getListLiteralExpression()
   * @generated
   */
  EReference getListLiteralExpression_Members();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.EnumerationLiteralExpression <em>Enumeration Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Literal Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.EnumerationLiteralExpression
   * @generated
   */
  EClass getEnumerationLiteralExpression();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.EnumerationLiteralExpression#getEnumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Enumeration</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.EnumerationLiteralExpression#getEnumeration()
   * @see #getEnumerationLiteralExpression()
   * @generated
   */
  EReference getEnumerationLiteralExpression_Enumeration();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.EnumerationLiteralExpression#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Literal</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.EnumerationLiteralExpression#getLiteral()
   * @see #getEnumerationLiteralExpression()
   * @generated
   */
  EReference getEnumerationLiteralExpression_Literal();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression <em>Decision Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression
   * @generated
   */
  EClass getDecisionExpression();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression#getCases()
   * @see #getDecisionExpression()
   * @generated
   */
  EReference getDecisionExpression_Cases();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression#getDefaultValueExpr <em>Default Value Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value Expr</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression#getDefaultValueExpr()
   * @see #getDecisionExpression()
   * @generated
   */
  EReference getDecisionExpression_DefaultValueExpr();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.DecisionCase <em>Decision Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision Case</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DecisionCase
   * @generated
   */
  EClass getDecisionCase();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.DecisionCase#getGuardExpr <em>Guard Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard Expr</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DecisionCase#getGuardExpr()
   * @see #getDecisionCase()
   * @generated
   */
  EReference getDecisionCase_GuardExpr();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.DecisionCase#getValueExpr <em>Value Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Expr</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DecisionCase#getValueExpr()
   * @see #getDecisionCase()
   * @generated
   */
  EReference getDecisionCase_ValueExpr();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpressions <em>Callback Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Callback Expressions</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpressions
   * @generated
   */
  EClass getCallbackExpressions();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression <em>Callback Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Callback Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression
   * @generated
   */
  EClass getCallbackExpression();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression#getStatementBlock <em>Statement Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Block</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression#getStatementBlock()
   * @see #getCallbackExpression()
   * @generated
   */
  EReference getCallbackExpression_StatementBlock();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.StructureCreationExpression <em>Structure Creation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Creation Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.StructureCreationExpression
   * @generated
   */
  EClass getStructureCreationExpression();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.StructureCreationExpression#getStructure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Structure</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.StructureCreationExpression#getStructure()
   * @see #getStructureCreationExpression()
   * @generated
   */
  EReference getStructureCreationExpression_Structure();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.StructureCreationExpression#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignments</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.StructureCreationExpression#getAssignments()
   * @see #getStructureCreationExpression()
   * @generated
   */
  EReference getStructureCreationExpression_Assignments();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.FeatureAssignment <em>Feature Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Assignment</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.FeatureAssignment
   * @generated
   */
  EClass getFeatureAssignment();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.FeatureAssignment#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.FeatureAssignment#getFeature()
   * @see #getFeatureAssignment()
   * @generated
   */
  EReference getFeatureAssignment_Feature();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.FeatureAssignment#getValueExpr <em>Value Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Expr</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.FeatureAssignment#getValueExpr()
   * @see #getFeatureAssignment()
   * @generated
   */
  EReference getFeatureAssignment_ValueExpr();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ValueReferenceOrMethodCallExpression <em>Value Reference Or Method Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Reference Or Method Call Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ValueReferenceOrMethodCallExpression
   * @generated
   */
  EClass getValueReferenceOrMethodCallExpression();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ReferenceExpression <em>Reference Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ReferenceExpression
   * @generated
   */
  EClass getReferenceExpression();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.ReferenceExpression#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ReferenceExpression#getRef()
   * @see #getReferenceExpression()
   * @generated
   */
  EReference getReferenceExpression_Ref();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Referable <em>Referable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referable</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Referable
   * @generated
   */
  EClass getReferable();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.Referable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Referable#getName()
   * @see #getReferable()
   * @generated
   */
  EAttribute getReferable_Name();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression <em>Ternary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ternary Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression
   * @generated
   */
  EClass getTernaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression#getGuard()
   * @see #getTernaryExpression()
   * @generated
   */
  EReference getTernaryExpression_Guard();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression#getThenExpr <em>Then Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Expr</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression#getThenExpr()
   * @see #getTernaryExpression()
   * @generated
   */
  EReference getTernaryExpression_ThenExpr();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression#getElseExpr <em>Else Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Expr</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression#getElseExpr()
   * @see #getTernaryExpression()
   * @generated
   */
  EReference getTernaryExpression_ElseExpr();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ComparisonExpression <em>Comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ComparisonExpression
   * @generated
   */
  EClass getComparisonExpression();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.ComparisonExpression#getComparator <em>Comparator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comparator</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ComparisonExpression#getComparator()
   * @see #getComparisonExpression()
   * @generated
   */
  EAttribute getComparisonExpression_Comparator();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AdditiveExpression
   * @generated
   */
  EClass getAdditiveExpression();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.AdditiveExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AdditiveExpression#getOperator()
   * @see #getAdditiveExpression()
   * @generated
   */
  EAttribute getAdditiveExpression_Operator();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeExpression
   * @generated
   */
  EClass getMultiplicativeExpression();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeExpression#getOperator()
   * @see #getMultiplicativeExpression()
   * @generated
   */
  EAttribute getMultiplicativeExpression_Operator();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.NotExpression <em>Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.NotExpression
   * @generated
   */
  EClass getNotExpression();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.NotExpression#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.NotExpression#getOperand()
   * @see #getNotExpression()
   * @generated
   */
  EReference getNotExpression_Operand();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression <em>Interface Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Call Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression
   * @generated
   */
  EClass getInterfaceCallExpression();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getServiceId <em>Service Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Service Id</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getServiceId()
   * @see #getInterfaceCallExpression()
   * @generated
   */
  EReference getInterfaceCallExpression_ServiceId();

  /**
   * Returns the meta object for the containment reference list '{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getObserveSites <em>Observe Sites</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Observe Sites</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getObserveSites()
   * @see #getInterfaceCallExpression()
   * @generated
   */
  EReference getInterfaceCallExpression_ObserveSites();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getInput()
   * @see #getInterfaceCallExpression()
   * @generated
   */
  EReference getInterfaceCallExpression_Input();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getCallback <em>Callback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Callback</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getCallback()
   * @see #getInterfaceCallExpression()
   * @generated
   */
  EReference getInterfaceCallExpression_Callback();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getErrorCallback <em>Error Callback</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Error Callback</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getErrorCallback()
   * @see #getInterfaceCallExpression()
   * @generated
   */
  EReference getInterfaceCallExpression_ErrorCallback();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.NamedServiceReference <em>Named Service Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Service Reference</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.NamedServiceReference
   * @generated
   */
  EClass getNamedServiceReference();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.NamedServiceReference#getService <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.NamedServiceReference#getService()
   * @see #getNamedServiceReference()
   * @generated
   */
  EReference getNamedServiceReference_Service();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CrudServiceIdentification <em>Crud Service Identification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Crud Service Identification</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CrudServiceIdentification
   * @generated
   */
  EClass getCrudServiceIdentification();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.CrudServiceIdentification#getCrudType <em>Crud Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Crud Type</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CrudServiceIdentification#getCrudType()
   * @see #getCrudServiceIdentification()
   * @generated
   */
  EAttribute getCrudServiceIdentification_CrudType();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.CrudServiceIdentification#getStructure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Structure</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CrudServiceIdentification#getStructure()
   * @see #getCrudServiceIdentification()
   * @generated
   */
  EReference getCrudServiceIdentification_Structure();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression <em>Feature Access Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Access Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression
   * @generated
   */
  EClass getFeatureAccessExpression();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression#getPrevious <em>Previous</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Previous</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression#getPrevious()
   * @see #getFeatureAccessExpression()
   * @generated
   */
  EReference getFeatureAccessExpression_Previous();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression#getFeature()
   * @see #getFeatureAccessExpression()
   * @generated
   */
  EReference getFeatureAccessExpression_Feature();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.SelectionExpression <em>Selection Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selection Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SelectionExpression
   * @generated
   */
  EClass getSelectionExpression();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.DateNowExpression <em>Date Now Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Now Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DateNowExpression
   * @generated
   */
  EClass getDateNowExpression();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.DateTodayExpression <em>Date Today Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Today Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DateTodayExpression
   * @generated
   */
  EClass getDateTodayExpression();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.StringLiteralExpression <em>String Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.StringLiteralExpression
   * @generated
   */
  EClass getStringLiteralExpression();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.StringLiteralExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.StringLiteralExpression#getValue()
   * @see #getStringLiteralExpression()
   * @generated
   */
  EAttribute getStringLiteralExpression_Value();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiteralExpression <em>Boolean Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiteralExpression
   * @generated
   */
  EClass getBooleanLiteralExpression();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiteralExpression#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiteralExpression#getLiteral()
   * @see #getBooleanLiteralExpression()
   * @generated
   */
  EAttribute getBooleanLiteralExpression_Literal();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.IntegerLiteralExpression <em>Integer Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.IntegerLiteralExpression
   * @generated
   */
  EClass getIntegerLiteralExpression();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.IntegerLiteralExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.IntegerLiteralExpression#getValue()
   * @see #getIntegerLiteralExpression()
   * @generated
   */
  EAttribute getIntegerLiteralExpression_Value();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.NumberLiteralExpression <em>Number Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.NumberLiteralExpression
   * @generated
   */
  EClass getNumberLiteralExpression();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.ui.simUiDsl.NumberLiteralExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.NumberLiteralExpression#getValue()
   * @see #getNumberLiteralExpression()
   * @generated
   */
  EAttribute getNumberLiteralExpression_Value();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CallbackResponseExpression <em>Callback Response Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Callback Response Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CallbackResponseExpression
   * @generated
   */
  EClass getCallbackResponseExpression();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CallbackErrorResponseExpression <em>Callback Error Response Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Callback Error Response Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CallbackErrorResponseExpression
   * @generated
   */
  EClass getCallbackErrorResponseExpression();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression <em>Method Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Call Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression
   * @generated
   */
  EClass getMethodCallExpression();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression#getMethodRef <em>Method Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method Ref</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression#getMethodRef()
   * @see #getMethodCallExpression()
   * @generated
   */
  EReference getMethodCallExpression_MethodRef();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression#getArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument List</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression#getArgumentList()
   * @see #getMethodCallExpression()
   * @generated
   */
  EReference getMethodCallExpression_ArgumentList();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.BooleanBinaryOperatorExpression <em>Boolean Binary Operator Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Binary Operator Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BooleanBinaryOperatorExpression
   * @generated
   */
  EClass getBooleanBinaryOperatorExpression();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ArithmeticBinaryOperatorExpression <em>Arithmetic Binary Operator Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arithmetic Binary Operator Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ArithmeticBinaryOperatorExpression
   * @generated
   */
  EClass getArithmeticBinaryOperatorExpression();

  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.ui.simUiDsl.BinaryOperatorExpression <em>Binary Operator Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Operator Expression</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BinaryOperatorExpression
   * @generated
   */
  EClass getBinaryOperatorExpression();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.BinaryOperatorExpression#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BinaryOperatorExpression#getLeftOperand()
   * @see #getBinaryOperatorExpression()
   * @generated
   */
  EReference getBinaryOperatorExpression_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link nl.dslmeinte.simscript.ui.simUiDsl.BinaryOperatorExpression#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BinaryOperatorExpression#getRightOperand()
   * @see #getBinaryOperatorExpression()
   * @generated
   */
  EReference getBinaryOperatorExpression_RightOperand();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.ui.simUiDsl.ViewableTypes <em>Viewable Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Viewable Types</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ViewableTypes
   * @generated
   */
  EEnum getViewableTypes();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.ui.simUiDsl.ValueTypes <em>Value Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Value Types</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ValueTypes
   * @generated
   */
  EEnum getValueTypes();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.ui.simUiDsl.GroupOrientations <em>Group Orientations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Group Orientations</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GroupOrientations
   * @generated
   */
  EEnum getGroupOrientations();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.ui.simUiDsl.VerticalAlignment <em>Vertical Alignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Vertical Alignment</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.VerticalAlignment
   * @generated
   */
  EEnum getVerticalAlignment();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOperator <em>Assignment Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Assignment Operator</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOperator
   * @generated
   */
  EEnum getAssignmentOperator();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.ui.simUiDsl.Comparator <em>Comparator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Comparator</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Comparator
   * @generated
   */
  EEnum getComparator();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.ui.simUiDsl.AdditiveOperators <em>Additive Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Additive Operators</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AdditiveOperators
   * @generated
   */
  EEnum getAdditiveOperators();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeOperators <em>Multiplicative Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Multiplicative Operators</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeOperators
   * @generated
   */
  EEnum getMultiplicativeOperators();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.ui.simUiDsl.CrudTypes <em>Crud Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Crud Types</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CrudTypes
   * @generated
   */
  EEnum getCrudTypes();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctions <em>Builtin Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Builtin Functions</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctions
   * @generated
   */
  EEnum getBuiltinFunctions();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiterals <em>Boolean Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Boolean Literals</em>'.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiterals
   * @generated
   */
  EEnum getBooleanLiterals();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimUiDslFactory getSimUiDslFactory();

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
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.UiModuleImpl <em>Ui Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.UiModuleImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getUiModule()
     * @generated
     */
    EClass UI_MODULE = eINSTANCE.getUiModule();

    /**
     * The meta object literal for the '<em><b>Not Authenticated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UI_MODULE__NOT_AUTHENTICATED = eINSTANCE.getUiModule_NotAuthenticated();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UI_MODULE__DEFINITIONS = eINSTANCE.getUiModule_Definitions();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TopLevelDefinitionImpl <em>Top Level Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TopLevelDefinitionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTopLevelDefinition()
     * @generated
     */
    EClass TOP_LEVEL_DEFINITION = eINSTANCE.getTopLevelDefinition();

    /**
     * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP_LEVEL_DEFINITION__PARAMETER_LIST = eINSTANCE.getTopLevelDefinition_ParameterList();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TableRowsDefinitionImpl <em>Table Rows Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TableRowsDefinitionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTableRowsDefinition()
     * @generated
     */
    EClass TABLE_ROWS_DEFINITION = eINSTANCE.getTableRowsDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_ROWS_DEFINITION__NAME = eINSTANCE.getTableRowsDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_ROWS_DEFINITION__ROWS = eINSTANCE.getTableRowsDefinition_Rows();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ViewableImpl <em>Viewable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ViewableImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getViewable()
     * @generated
     */
    EClass VIEWABLE = eINSTANCE.getViewable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWABLE__TYPE = eINSTANCE.getViewable_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEWABLE__NAME = eINSTANCE.getViewable_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DefinedViewableImpl <em>Defined Viewable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.DefinedViewableImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getDefinedViewable()
     * @generated
     */
    EClass DEFINED_VIEWABLE = eINSTANCE.getDefinedViewable();

    /**
     * The meta object literal for the '<em><b>Values Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINED_VIEWABLE__VALUES_BLOCK = eINSTANCE.getDefinedViewable_ValuesBlock();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINED_VIEWABLE__DEFINITIONS = eINSTANCE.getDefinedViewable_Definitions();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ManualViewableImpl <em>Manual Viewable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ManualViewableImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getManualViewable()
     * @generated
     */
    EClass MANUAL_VIEWABLE = eINSTANCE.getManualViewable();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANUAL_VIEWABLE__NAMESPACE = eINSTANCE.getManualViewable_Namespace();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.LocalViewableDefinitionImpl <em>Local Viewable Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.LocalViewableDefinitionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getLocalViewableDefinition()
     * @generated
     */
    EClass LOCAL_VIEWABLE_DEFINITION = eINSTANCE.getLocalViewableDefinition();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ValuesBlockImpl <em>Values Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ValuesBlockImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getValuesBlock()
     * @generated
     */
    EClass VALUES_BLOCK = eINSTANCE.getValuesBlock();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUES_BLOCK__DECLARATIONS = eINSTANCE.getValuesBlock_Declarations();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ValueDeclarationImpl <em>Value Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ValueDeclarationImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getValueDeclaration()
     * @generated
     */
    EClass VALUE_DECLARATION = eINSTANCE.getValueDeclaration();

    /**
     * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_DECLARATION__VALUE_TYPE = eINSTANCE.getValueDeclaration_ValueType();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ValueImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.AbstractValueDeclarationImpl <em>Abstract Value Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.AbstractValueDeclarationImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getAbstractValueDeclaration()
     * @generated
     */
    EClass ABSTRACT_VALUE_DECLARATION = eINSTANCE.getAbstractValueDeclaration();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_VALUE_DECLARATION__VALUE = eINSTANCE.getAbstractValueDeclaration_Value();

    /**
     * The meta object literal for the '<em><b>Declared Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_VALUE_DECLARATION__DECLARED_TYPE = eINSTANCE.getAbstractValueDeclaration_DeclaredType();

    /**
     * The meta object literal for the '<em><b>Value Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_VALUE_DECLARATION__VALUE_EXPR = eINSTANCE.getAbstractValueDeclaration_ValueExpr();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ParameterImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ParameterListImpl <em>Parameter List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ParameterListImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getParameterList()
     * @generated
     */
    EClass PARAMETER_LIST = eINSTANCE.getParameterList();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_LIST__PARAMETERS = eINSTANCE.getParameterList_Parameters();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodDefinitionImpl <em>Method Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodDefinitionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getMethodDefinition()
     * @generated
     */
    EClass METHOD_DEFINITION = eINSTANCE.getMethodDefinition();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DEFINITION__METHOD = eINSTANCE.getMethodDefinition_Method();

    /**
     * The meta object literal for the '<em><b>Statement Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DEFINITION__STATEMENT_BLOCK = eINSTANCE.getMethodDefinition_StatementBlock();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.QuotationImpl <em>Quotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.QuotationImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getQuotation()
     * @generated
     */
    EClass QUOTATION = eINSTANCE.getQuotation();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUOTATION__PATH = eINSTANCE.getQuotation_Path();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.BindingImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '<em><b>Bind Site</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__BIND_SITE = eINSTANCE.getBinding_BindSite();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ElementBodyImpl <em>Element Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ElementBodyImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getElementBody()
     * @generated
     */
    EClass ELEMENT_BODY = eINSTANCE.getElementBody();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_BODY__ELEMENTS = eINSTANCE.getElementBody_Elements();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ComponentInvocationImpl <em>Component Invocation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ComponentInvocationImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getComponentInvocation()
     * @generated
     */
    EClass COMPONENT_INVOCATION = eINSTANCE.getComponentInvocation();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ArgumentImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__PARAMETER = eINSTANCE.getArgument_Parameter();

    /**
     * The meta object literal for the '<em><b>Value Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__VALUE_EXPR = eINSTANCE.getArgument_ValueExpr();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ArgumentListImpl <em>Argument List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ArgumentListImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getArgumentList()
     * @generated
     */
    EClass ARGUMENT_LIST = eINSTANCE.getArgumentList();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT_LIST__ARGUMENTS = eINSTANCE.getArgumentList_Arguments();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InputElementImpl <em>Input Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.InputElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getInputElement()
     * @generated
     */
    EClass INPUT_ELEMENT = eINSTANCE.getInputElement();

    /**
     * The meta object literal for the '<em><b>Bind Site</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_ELEMENT__BIND_SITE = eINSTANCE.getInputElement_BindSite();

    /**
     * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_ELEMENT__HINT = eINSTANCE.getInputElement_Hint();

    /**
     * The meta object literal for the '<em><b>Min Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_ELEMENT__MIN_VALUE = eINSTANCE.getInputElement_MinValue();

    /**
     * The meta object literal for the '<em><b>Max Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_ELEMENT__MAX_VALUE = eINSTANCE.getInputElement_MaxValue();

    /**
     * The meta object literal for the '<em><b>Radio Option</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_ELEMENT__RADIO_OPTION = eINSTANCE.getInputElement_RadioOption();

    /**
     * The meta object literal for the '<em><b>On Change</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_ELEMENT__ON_CHANGE = eINSTANCE.getInputElement_OnChange();

    /**
     * The meta object literal for the '<em><b>On Submit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_ELEMENT__ON_SUBMIT = eINSTANCE.getInputElement_OnSubmit();

    /**
     * The meta object literal for the '<em><b>Structure Option</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_ELEMENT__STRUCTURE_OPTION = eINSTANCE.getInputElement_StructureOption();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.RadioOptionImpl <em>Radio Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.RadioOptionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getRadioOption()
     * @generated
     */
    EClass RADIO_OPTION = eINSTANCE.getRadioOption();

    /**
     * The meta object literal for the '<em><b>True</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RADIO_OPTION__TRUE = eINSTANCE.getRadioOption_True();

    /**
     * The meta object literal for the '<em><b>False</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RADIO_OPTION__FALSE = eINSTANCE.getRadioOption_False();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.StructureOptionImpl <em>Structure Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.StructureOptionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getStructureOption()
     * @generated
     */
    EClass STRUCTURE_OPTION = eINSTANCE.getStructureOption();

    /**
     * The meta object literal for the '<em><b>Source Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE_OPTION__SOURCE_EXPR = eINSTANCE.getStructureOption_SourceExpr();

    /**
     * The meta object literal for the '<em><b>Display Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE_OPTION__DISPLAY_FUNCTION = eINSTANCE.getStructureOption_DisplayFunction();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ButtonElementImpl <em>Button Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ButtonElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getButtonElement()
     * @generated
     */
    EClass BUTTON_ELEMENT = eINSTANCE.getButtonElement();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON_ELEMENT__TEXT = eINSTANCE.getButtonElement_Text();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON_ELEMENT__ACTION = eINSTANCE.getButtonElement_Action();

    /**
     * The meta object literal for the '<em><b>Css Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON_ELEMENT__CSS_CLASS = eINSTANCE.getButtonElement_CssClass();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BlockElementImpl <em>Block Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.BlockElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBlockElement()
     * @generated
     */
    EClass BLOCK_ELEMENT = eINSTANCE.getBlockElement();

    /**
     * The meta object literal for the '<em><b>On Click</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_ELEMENT__ON_CLICK = eINSTANCE.getBlockElement_OnClick();

    /**
     * The meta object literal for the '<em><b>Css Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK_ELEMENT__CSS_CLASS = eINSTANCE.getBlockElement_CssClass();

    /**
     * The meta object literal for the '<em><b>Body Css Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK_ELEMENT__BODY_CSS_CLASS = eINSTANCE.getBlockElement_BodyCssClass();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK_ELEMENT__STYLE = eINSTANCE.getBlockElement_Style();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_ELEMENT__HEADER = eINSTANCE.getBlockElement_Header();

    /**
     * The meta object literal for the '<em><b>Header Css Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK_ELEMENT__HEADER_CSS_CLASS = eINSTANCE.getBlockElement_HeaderCssClass();

    /**
     * The meta object literal for the '<em><b>No Css</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BLOCK_ELEMENT__NO_CSS = eINSTANCE.getBlockElement_NoCss();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_ELEMENT__BODY = eINSTANCE.getBlockElement_Body();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListElementImpl <em>List Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ListElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getListElement()
     * @generated
     */
    EClass LIST_ELEMENT = eINSTANCE.getListElement();

    /**
     * The meta object literal for the '<em><b>Index Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_ELEMENT__INDEX_VARIABLE = eINSTANCE.getListElement_IndexVariable();

    /**
     * The meta object literal for the '<em><b>Value Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_ELEMENT__VALUE_VARIABLE = eINSTANCE.getListElement_ValueVariable();

    /**
     * The meta object literal for the '<em><b>List Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_ELEMENT__LIST_EXPRESSION = eINSTANCE.getListElement_ListExpression();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_ELEMENT__BODY = eINSTANCE.getListElement_Body();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListVariableImpl <em>List Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ListVariableImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getListVariable()
     * @generated
     */
    EClass LIST_VARIABLE = eINSTANCE.getListVariable();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TableElementImpl <em>Table Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TableElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTableElement()
     * @generated
     */
    EClass TABLE_ELEMENT = eINSTANCE.getTableElement();

    /**
     * The meta object literal for the '<em><b>Sub Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_ELEMENT__SUB_ELEMENTS = eINSTANCE.getTableElement_SubElements();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TableBodyElementImpl <em>Table Body Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TableBodyElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTableBodyElement()
     * @generated
     */
    EClass TABLE_BODY_ELEMENT = eINSTANCE.getTableBodyElement();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TableRowsInvocationImpl <em>Table Rows Invocation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TableRowsInvocationImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTableRowsInvocation()
     * @generated
     */
    EClass TABLE_ROWS_INVOCATION = eINSTANCE.getTableRowsInvocation();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_ROWS_INVOCATION__DEFINITION = eINSTANCE.getTableRowsInvocation_Definition();

    /**
     * The meta object literal for the '<em><b>Argument List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_ROWS_INVOCATION__ARGUMENT_LIST = eINSTANCE.getTableRowsInvocation_ArgumentList();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TableRowImpl <em>Table Row</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TableRowImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTableRow()
     * @generated
     */
    EClass TABLE_ROW = eINSTANCE.getTableRow();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_ROW__LABEL = eINSTANCE.getTableRow_Label();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_ROW__BODY = eINSTANCE.getTableRow_Body();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.LabeledTableElementImpl <em>Labeled Table Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.LabeledTableElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getLabeledTableElement()
     * @generated
     */
    EClass LABELED_TABLE_ELEMENT = eINSTANCE.getLabeledTableElement();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELED_TABLE_ELEMENT__BODY = eINSTANCE.getLabeledTableElement_Body();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.LabeledTableRowImpl <em>Labeled Table Row</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.LabeledTableRowImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getLabeledTableRow()
     * @generated
     */
    EClass LABELED_TABLE_ROW = eINSTANCE.getLabeledTableRow();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELED_TABLE_ROW__LABEL = eINSTANCE.getLabeledTableRow_Label();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELED_TABLE_ROW__BODY = eINSTANCE.getLabeledTableRow_Body();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ProgressBarTabSetImpl <em>Progress Bar Tab Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ProgressBarTabSetImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getProgressBarTabSet()
     * @generated
     */
    EClass PROGRESS_BAR_TAB_SET = eINSTANCE.getProgressBarTabSet();

    /**
     * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRESS_BAR_TAB_SET__TABS = eINSTANCE.getProgressBarTabSet_Tabs();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TabDeclarationImpl <em>Tab Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TabDeclarationImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTabDeclaration()
     * @generated
     */
    EClass TAB_DECLARATION = eINSTANCE.getTabDeclaration();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB_DECLARATION__HEADER = eINSTANCE.getTabDeclaration_Header();

    /**
     * The meta object literal for the '<em><b>Previous Callback</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB_DECLARATION__PREVIOUS_CALLBACK = eINSTANCE.getTabDeclaration_PreviousCallback();

    /**
     * The meta object literal for the '<em><b>Next Callback</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB_DECLARATION__NEXT_CALLBACK = eINSTANCE.getTabDeclaration_NextCallback();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GroupElementImpl <em>Group Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.GroupElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getGroupElement()
     * @generated
     */
    EClass GROUP_ELEMENT = eINSTANCE.getGroupElement();

    /**
     * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_ELEMENT__ORIENTATION = eINSTANCE.getGroupElement_Orientation();

    /**
     * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_ELEMENT__VALIGN = eINSTANCE.getGroupElement_V_align();

    /**
     * The meta object literal for the '<em><b>Nested Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_ELEMENT__NESTED_GROUPS = eINSTANCE.getGroupElement_NestedGroups();

    /**
     * The meta object literal for the '<em><b>Leaf Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_ELEMENT__LEAF_GROUPS = eINSTANCE.getGroupElement_LeafGroups();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CountdownTimerImpl <em>Countdown Timer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CountdownTimerImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCountdownTimer()
     * @generated
     */
    EClass COUNTDOWN_TIMER = eINSTANCE.getCountdownTimer();

    /**
     * The meta object literal for the '<em><b>Observed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COUNTDOWN_TIMER__OBSERVED = eINSTANCE.getCountdownTimer_Observed();

    /**
     * The meta object literal for the '<em><b>End Time</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COUNTDOWN_TIMER__END_TIME = eINSTANCE.getCountdownTimer_EndTime();

    /**
     * The meta object literal for the '<em><b>On End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COUNTDOWN_TIMER__ON_END = eINSTANCE.getCountdownTimer_OnEnd();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ObserveElementImpl <em>Observe Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ObserveElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getObserveElement()
     * @generated
     */
    EClass OBSERVE_ELEMENT = eINSTANCE.getObserveElement();

    /**
     * The meta object literal for the '<em><b>Observe Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBSERVE_ELEMENT__OBSERVE_EXPR = eINSTANCE.getObserveElement_ObserveExpr();

    /**
     * The meta object literal for the '<em><b>Statement Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBSERVE_ELEMENT__STATEMENT_BLOCK = eINSTANCE.getObserveElement_StatementBlock();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CalendarElementImpl <em>Calendar Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CalendarElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCalendarElement()
     * @generated
     */
    EClass CALENDAR_ELEMENT = eINSTANCE.getCalendarElement();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALENDAR_ELEMENT__DATE = eINSTANCE.getCalendarElement_Date();

    /**
     * The meta object literal for the '<em><b>On Select</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALENDAR_ELEMENT__ON_SELECT = eINSTANCE.getCalendarElement_OnSelect();

    /**
     * The meta object literal for the '<em><b>Allow From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALENDAR_ELEMENT__ALLOW_FROM = eINSTANCE.getCalendarElement_AllowFrom();

    /**
     * The meta object literal for the '<em><b>Date Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALENDAR_ELEMENT__DATE_FORMAT = eINSTANCE.getCalendarElement_DateFormat();

    /**
     * The meta object literal for the '<em><b>Days</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALENDAR_ELEMENT__DAYS = eINSTANCE.getCalendarElement_Days();

    /**
     * The meta object literal for the '<em><b>Css Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALENDAR_ELEMENT__CSS_CLASS = eINSTANCE.getCalendarElement_CssClass();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TimeSlotListElementImpl <em>Time Slot List Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TimeSlotListElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTimeSlotListElement()
     * @generated
     */
    EClass TIME_SLOT_LIST_ELEMENT = eINSTANCE.getTimeSlotListElement();

    /**
     * The meta object literal for the '<em><b>Slots</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIME_SLOT_LIST_ELEMENT__SLOTS = eINSTANCE.getTimeSlotListElement_Slots();

    /**
     * The meta object literal for the '<em><b>On Select</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIME_SLOT_LIST_ELEMENT__ON_SELECT = eINSTANCE.getTimeSlotListElement_OnSelect();

    /**
     * The meta object literal for the '<em><b>On Delete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIME_SLOT_LIST_ELEMENT__ON_DELETE = eINSTANCE.getTimeSlotListElement_OnDelete();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.SlotAddElementImpl <em>Slot Add Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SlotAddElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getSlotAddElement()
     * @generated
     */
    EClass SLOT_ADD_ELEMENT = eINSTANCE.getSlotAddElement();

    /**
     * The meta object literal for the '<em><b>Product</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLOT_ADD_ELEMENT__PRODUCT = eINSTANCE.getSlotAddElement_Product();

    /**
     * The meta object literal for the '<em><b>Day</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLOT_ADD_ELEMENT__DAY = eINSTANCE.getSlotAddElement_Day();

    /**
     * The meta object literal for the '<em><b>Slots</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLOT_ADD_ELEMENT__SLOTS = eINSTANCE.getSlotAddElement_Slots();

    /**
     * The meta object literal for the '<em><b>Start Hour</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLOT_ADD_ELEMENT__START_HOUR = eINSTANCE.getSlotAddElement_StartHour();

    /**
     * The meta object literal for the '<em><b>End Hour</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SLOT_ADD_ELEMENT__END_HOUR = eINSTANCE.getSlotAddElement_EndHour();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.WhenElementImpl <em>When Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.WhenElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getWhenElement()
     * @generated
     */
    EClass WHEN_ELEMENT = eINSTANCE.getWhenElement();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_ELEMENT__CONDITION = eINSTANCE.getWhenElement_Condition();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_ELEMENT__BODY = eINSTANCE.getWhenElement_Body();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ImageElementImpl <em>Image Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ImageElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getImageElement()
     * @generated
     */
    EClass IMAGE_ELEMENT = eINSTANCE.getImageElement();

    /**
     * The meta object literal for the '<em><b>Observed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_ELEMENT__OBSERVED = eINSTANCE.getImageElement_Observed();

    /**
     * The meta object literal for the '<em><b>Source Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE_ELEMENT__SOURCE_URL = eINSTANCE.getImageElement_SourceUrl();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE_ELEMENT__WIDTH = eINSTANCE.getImageElement_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMAGE_ELEMENT__HEIGHT = eINSTANCE.getImageElement_Height();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.FrameElementImpl <em>Frame Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.FrameElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getFrameElement()
     * @generated
     */
    EClass FRAME_ELEMENT = eINSTANCE.getFrameElement();

    /**
     * The meta object literal for the '<em><b>Source Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAME_ELEMENT__SOURCE_URL = eINSTANCE.getFrameElement_SourceUrl();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAME_ELEMENT__WIDTH = eINSTANCE.getFrameElement_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAME_ELEMENT__HEIGHT = eINSTANCE.getFrameElement_Height();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.LineBreakElementImpl <em>Line Break Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.LineBreakElementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getLineBreakElement()
     * @generated
     */
    EClass LINE_BREAK_ELEMENT = eINSTANCE.getLineBreakElement();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.StatementBlockImpl <em>Statement Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.StatementBlockImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getStatementBlock()
     * @generated
     */
    EClass STATEMENT_BLOCK = eINSTANCE.getStatementBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_BLOCK__STATEMENTS = eINSTANCE.getStatementBlock_Statements();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.StatementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ExitingStatementImpl <em>Exiting Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ExitingStatementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getExitingStatement()
     * @generated
     */
    EClass EXITING_STATEMENT = eINSTANCE.getExitingStatement();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.NonExitingStatementImpl <em>Non Exiting Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.NonExitingStatementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getNonExitingStatement()
     * @generated
     */
    EClass NON_EXITING_STATEMENT = eINSTANCE.getNonExitingStatement();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ForStatementImpl <em>For Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ForStatementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getForStatement()
     * @generated
     */
    EClass FOR_STATEMENT = eINSTANCE.getForStatement();

    /**
     * The meta object literal for the '<em><b>Index Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__INDEX_VARIABLE = eINSTANCE.getForStatement_IndexVariable();

    /**
     * The meta object literal for the '<em><b>Value Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__VALUE_VARIABLE = eINSTANCE.getForStatement_ValueVariable();

    /**
     * The meta object literal for the '<em><b>List Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__LIST_EXPRESSION = eINSTANCE.getForStatement_ListExpression();

    /**
     * The meta object literal for the '<em><b>Then Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__THEN_BLOCK = eINSTANCE.getForStatement_ThenBlock();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListRemoveStatementImpl <em>List Remove Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ListRemoveStatementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getListRemoveStatement()
     * @generated
     */
    EClass LIST_REMOVE_STATEMENT = eINSTANCE.getListRemoveStatement();

    /**
     * The meta object literal for the '<em><b>List Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_REMOVE_STATEMENT__LIST_EXPR = eINSTANCE.getListRemoveStatement_ListExpr();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_REMOVE_STATEMENT__FEATURE = eINSTANCE.getListRemoveStatement_Feature();

    /**
     * The meta object literal for the '<em><b>Value Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_REMOVE_STATEMENT__VALUE_EXPR = eINSTANCE.getListRemoveStatement_ValueExpr();

    /**
     * The meta object literal for the '<em><b>Index Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_REMOVE_STATEMENT__INDEX_VARIABLE = eINSTANCE.getListRemoveStatement_IndexVariable();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.AssignmentOrExpressionStatementImpl <em>Assignment Or Expression Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.AssignmentOrExpressionStatementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getAssignmentOrExpressionStatement()
     * @generated
     */
    EClass ASSIGNMENT_OR_EXPRESSION_STATEMENT = eINSTANCE.getAssignmentOrExpressionStatement();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_OR_EXPRESSION_STATEMENT__LHS = eINSTANCE.getAssignmentOrExpressionStatement_Lhs();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT_OR_EXPRESSION_STATEMENT__OPERATOR = eINSTANCE.getAssignmentOrExpressionStatement_Operator();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_OR_EXPRESSION_STATEMENT__RHS = eINSTANCE.getAssignmentOrExpressionStatement_Rhs();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ShowModalStatementImpl <em>Show Modal Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ShowModalStatementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getShowModalStatement()
     * @generated
     */
    EClass SHOW_MODAL_STATEMENT = eINSTANCE.getShowModalStatement();

    /**
     * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHOW_MODAL_STATEMENT__PERSISTENT = eINSTANCE.getShowModalStatement_Persistent();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ExitModalStatementImpl <em>Exit Modal Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ExitModalStatementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getExitModalStatement()
     * @generated
     */
    EClass EXIT_MODAL_STATEMENT = eINSTANCE.getExitModalStatement();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoScreenStatementImpl <em>Goto Screen Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoScreenStatementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getGotoScreenStatement()
     * @generated
     */
    EClass GOTO_SCREEN_STATEMENT = eINSTANCE.getGotoScreenStatement();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoModuleStatementImpl <em>Goto Module Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoModuleStatementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getGotoModuleStatement()
     * @generated
     */
    EClass GOTO_MODULE_STATEMENT = eINSTANCE.getGotoModuleStatement();

    /**
     * The meta object literal for the '<em><b>Target Module</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOTO_MODULE_STATEMENT__TARGET_MODULE = eINSTANCE.getGotoModuleStatement_TargetModule();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOTO_MODULE_STATEMENT__ARGS = eINSTANCE.getGotoModuleStatement_Args();

    /**
     * The meta object literal for the '<em><b>Authenticate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOTO_MODULE_STATEMENT__AUTHENTICATE = eINSTANCE.getGotoModuleStatement_Authenticate();

    /**
     * The meta object literal for the '<em><b>Auth Option</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOTO_MODULE_STATEMENT__AUTH_OPTION = eINSTANCE.getGotoModuleStatement_AuthOption();

    /**
     * The meta object literal for the '<em><b>Principal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOTO_MODULE_STATEMENT__PRINCIPAL = eINSTANCE.getGotoModuleStatement_Principal();

    /**
     * The meta object literal for the '<em><b>Credential</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOTO_MODULE_STATEMENT__CREDENTIAL = eINSTANCE.getGotoModuleStatement_Credential();

    /**
     * The meta object literal for the '<em><b>Error Callback</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOTO_MODULE_STATEMENT__ERROR_CALLBACK = eINSTANCE.getGotoModuleStatement_ErrorCallback();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.PrincipalArgumentImpl <em>Principal Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.PrincipalArgumentImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getPrincipalArgument()
     * @generated
     */
    EClass PRINCIPAL_ARGUMENT = eINSTANCE.getPrincipalArgument();

    /**
     * The meta object literal for the '<em><b>Principal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRINCIPAL_ARGUMENT__PRINCIPAL = eINSTANCE.getPrincipalArgument_Principal();

    /**
     * The meta object literal for the '<em><b>Value Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRINCIPAL_ARGUMENT__VALUE_EXPR = eINSTANCE.getPrincipalArgument_ValueExpr();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CredentialArgumentImpl <em>Credential Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CredentialArgumentImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCredentialArgument()
     * @generated
     */
    EClass CREDENTIAL_ARGUMENT = eINSTANCE.getCredentialArgument();

    /**
     * The meta object literal for the '<em><b>Credential</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREDENTIAL_ARGUMENT__CREDENTIAL = eINSTANCE.getCredentialArgument_Credential();

    /**
     * The meta object literal for the '<em><b>Value Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREDENTIAL_ARGUMENT__VALUE_EXPR = eINSTANCE.getCredentialArgument_ValueExpr();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.IfStatementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getIfStatement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIfStatement();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

    /**
     * The meta object literal for the '<em><b>Then Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__THEN_BLOCK = eINSTANCE.getIfStatement_ThenBlock();

    /**
     * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSE_BLOCK = eINSTANCE.getIfStatement_ElseBlock();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.LocalValueDeclarationStatementImpl <em>Local Value Declaration Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.LocalValueDeclarationStatementImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getLocalValueDeclarationStatement()
     * @generated
     */
    EClass LOCAL_VALUE_DECLARATION_STATEMENT = eINSTANCE.getLocalValueDeclarationStatement();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ViewableCallSiteImpl <em>Viewable Call Site</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ViewableCallSiteImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getViewableCallSite()
     * @generated
     */
    EClass VIEWABLE_CALL_SITE = eINSTANCE.getViewableCallSite();

    /**
     * The meta object literal for the '<em><b>Viewable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWABLE_CALL_SITE__VIEWABLE = eINSTANCE.getViewableCallSite_Viewable();

    /**
     * The meta object literal for the '<em><b>Argument List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEWABLE_CALL_SITE__ARGUMENT_LIST = eINSTANCE.getViewableCallSite_ArgumentList();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ServiceIdentificationImpl <em>Service Identification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ServiceIdentificationImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getServiceIdentification()
     * @generated
     */
    EClass SERVICE_IDENTIFICATION = eINSTANCE.getServiceIdentification();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DateExpressionImpl <em>Date Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.DateExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getDateExpression()
     * @generated
     */
    EClass DATE_EXPRESSION = eINSTANCE.getDateExpression();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BuiltinFunctionExpressionImpl <em>Builtin Function Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.BuiltinFunctionExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBuiltinFunctionExpression()
     * @generated
     */
    EClass BUILTIN_FUNCTION_EXPRESSION = eINSTANCE.getBuiltinFunctionExpression();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILTIN_FUNCTION_EXPRESSION__FUNCTION = eINSTANCE.getBuiltinFunctionExpression_Function();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILTIN_FUNCTION_EXPRESSION__ARGUMENT = eINSTANCE.getBuiltinFunctionExpression_Argument();

    /**
     * The meta object literal for the '<em><b>Sort Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILTIN_FUNCTION_EXPRESSION__SORT_FEATURE = eINSTANCE.getBuiltinFunctionExpression_SortFeature();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.LiteralExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getLiteralExpression()
     * @generated
     */
    EClass LITERAL_EXPRESSION = eINSTANCE.getLiteralExpression();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListLiteralExpressionImpl <em>List Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ListLiteralExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getListLiteralExpression()
     * @generated
     */
    EClass LIST_LITERAL_EXPRESSION = eINSTANCE.getListLiteralExpression();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_LITERAL_EXPRESSION__MEMBERS = eINSTANCE.getListLiteralExpression_Members();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.EnumerationLiteralExpressionImpl <em>Enumeration Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.EnumerationLiteralExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getEnumerationLiteralExpression()
     * @generated
     */
    EClass ENUMERATION_LITERAL_EXPRESSION = eINSTANCE.getEnumerationLiteralExpression();

    /**
     * The meta object literal for the '<em><b>Enumeration</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION_LITERAL_EXPRESSION__ENUMERATION = eINSTANCE.getEnumerationLiteralExpression_Enumeration();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION_LITERAL_EXPRESSION__LITERAL = eINSTANCE.getEnumerationLiteralExpression_Literal();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DecisionExpressionImpl <em>Decision Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.DecisionExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getDecisionExpression()
     * @generated
     */
    EClass DECISION_EXPRESSION = eINSTANCE.getDecisionExpression();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECISION_EXPRESSION__CASES = eINSTANCE.getDecisionExpression_Cases();

    /**
     * The meta object literal for the '<em><b>Default Value Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECISION_EXPRESSION__DEFAULT_VALUE_EXPR = eINSTANCE.getDecisionExpression_DefaultValueExpr();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DecisionCaseImpl <em>Decision Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.DecisionCaseImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getDecisionCase()
     * @generated
     */
    EClass DECISION_CASE = eINSTANCE.getDecisionCase();

    /**
     * The meta object literal for the '<em><b>Guard Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECISION_CASE__GUARD_EXPR = eINSTANCE.getDecisionCase_GuardExpr();

    /**
     * The meta object literal for the '<em><b>Value Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECISION_CASE__VALUE_EXPR = eINSTANCE.getDecisionCase_ValueExpr();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackExpressionsImpl <em>Callback Expressions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackExpressionsImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCallbackExpressions()
     * @generated
     */
    EClass CALLBACK_EXPRESSIONS = eINSTANCE.getCallbackExpressions();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackExpressionImpl <em>Callback Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCallbackExpression()
     * @generated
     */
    EClass CALLBACK_EXPRESSION = eINSTANCE.getCallbackExpression();

    /**
     * The meta object literal for the '<em><b>Statement Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALLBACK_EXPRESSION__STATEMENT_BLOCK = eINSTANCE.getCallbackExpression_StatementBlock();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.StructureCreationExpressionImpl <em>Structure Creation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.StructureCreationExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getStructureCreationExpression()
     * @generated
     */
    EClass STRUCTURE_CREATION_EXPRESSION = eINSTANCE.getStructureCreationExpression();

    /**
     * The meta object literal for the '<em><b>Structure</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE_CREATION_EXPRESSION__STRUCTURE = eINSTANCE.getStructureCreationExpression_Structure();

    /**
     * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE_CREATION_EXPRESSION__ASSIGNMENTS = eINSTANCE.getStructureCreationExpression_Assignments();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.FeatureAssignmentImpl <em>Feature Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.FeatureAssignmentImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getFeatureAssignment()
     * @generated
     */
    EClass FEATURE_ASSIGNMENT = eINSTANCE.getFeatureAssignment();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_ASSIGNMENT__FEATURE = eINSTANCE.getFeatureAssignment_Feature();

    /**
     * The meta object literal for the '<em><b>Value Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_ASSIGNMENT__VALUE_EXPR = eINSTANCE.getFeatureAssignment_ValueExpr();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ValueReferenceOrMethodCallExpressionImpl <em>Value Reference Or Method Call Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ValueReferenceOrMethodCallExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getValueReferenceOrMethodCallExpression()
     * @generated
     */
    EClass VALUE_REFERENCE_OR_METHOD_CALL_EXPRESSION = eINSTANCE.getValueReferenceOrMethodCallExpression();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ReferenceExpressionImpl <em>Reference Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ReferenceExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getReferenceExpression()
     * @generated
     */
    EClass REFERENCE_EXPRESSION = eINSTANCE.getReferenceExpression();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_EXPRESSION__REF = eINSTANCE.getReferenceExpression_Ref();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ReferableImpl <em>Referable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ReferableImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getReferable()
     * @generated
     */
    EClass REFERABLE = eINSTANCE.getReferable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERABLE__NAME = eINSTANCE.getReferable_Name();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TernaryExpressionImpl <em>Ternary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.TernaryExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getTernaryExpression()
     * @generated
     */
    EClass TERNARY_EXPRESSION = eINSTANCE.getTernaryExpression();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERNARY_EXPRESSION__GUARD = eINSTANCE.getTernaryExpression_Guard();

    /**
     * The meta object literal for the '<em><b>Then Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERNARY_EXPRESSION__THEN_EXPR = eINSTANCE.getTernaryExpression_ThenExpr();

    /**
     * The meta object literal for the '<em><b>Else Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERNARY_EXPRESSION__ELSE_EXPR = eINSTANCE.getTernaryExpression_ElseExpr();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.OrExpressionImpl <em>Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.OrExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getOrExpression()
     * @generated
     */
    EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.AndExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ComparisonExpressionImpl <em>Comparison Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ComparisonExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getComparisonExpression()
     * @generated
     */
    EClass COMPARISON_EXPRESSION = eINSTANCE.getComparisonExpression();

    /**
     * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON_EXPRESSION__COMPARATOR = eINSTANCE.getComparisonExpression_Comparator();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.AdditiveExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getAdditiveExpression()
     * @generated
     */
    EClass ADDITIVE_EXPRESSION = eINSTANCE.getAdditiveExpression();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITIVE_EXPRESSION__OPERATOR = eINSTANCE.getAdditiveExpression_Operator();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.MultiplicativeExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getMultiplicativeExpression()
     * @generated
     */
    EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getMultiplicativeExpression();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICATIVE_EXPRESSION__OPERATOR = eINSTANCE.getMultiplicativeExpression_Operator();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.NotExpressionImpl <em>Not Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.NotExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getNotExpression()
     * @generated
     */
    EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EXPRESSION__OPERAND = eINSTANCE.getNotExpression_Operand();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InterfaceCallExpressionImpl <em>Interface Call Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.InterfaceCallExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getInterfaceCallExpression()
     * @generated
     */
    EClass INTERFACE_CALL_EXPRESSION = eINSTANCE.getInterfaceCallExpression();

    /**
     * The meta object literal for the '<em><b>Service Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_CALL_EXPRESSION__SERVICE_ID = eINSTANCE.getInterfaceCallExpression_ServiceId();

    /**
     * The meta object literal for the '<em><b>Observe Sites</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_CALL_EXPRESSION__OBSERVE_SITES = eINSTANCE.getInterfaceCallExpression_ObserveSites();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_CALL_EXPRESSION__INPUT = eINSTANCE.getInterfaceCallExpression_Input();

    /**
     * The meta object literal for the '<em><b>Callback</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_CALL_EXPRESSION__CALLBACK = eINSTANCE.getInterfaceCallExpression_Callback();

    /**
     * The meta object literal for the '<em><b>Error Callback</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_CALL_EXPRESSION__ERROR_CALLBACK = eINSTANCE.getInterfaceCallExpression_ErrorCallback();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.NamedServiceReferenceImpl <em>Named Service Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.NamedServiceReferenceImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getNamedServiceReference()
     * @generated
     */
    EClass NAMED_SERVICE_REFERENCE = eINSTANCE.getNamedServiceReference();

    /**
     * The meta object literal for the '<em><b>Service</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_SERVICE_REFERENCE__SERVICE = eINSTANCE.getNamedServiceReference_Service();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CrudServiceIdentificationImpl <em>Crud Service Identification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CrudServiceIdentificationImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCrudServiceIdentification()
     * @generated
     */
    EClass CRUD_SERVICE_IDENTIFICATION = eINSTANCE.getCrudServiceIdentification();

    /**
     * The meta object literal for the '<em><b>Crud Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CRUD_SERVICE_IDENTIFICATION__CRUD_TYPE = eINSTANCE.getCrudServiceIdentification_CrudType();

    /**
     * The meta object literal for the '<em><b>Structure</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CRUD_SERVICE_IDENTIFICATION__STRUCTURE = eINSTANCE.getCrudServiceIdentification_Structure();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.FeatureAccessExpressionImpl <em>Feature Access Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.FeatureAccessExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getFeatureAccessExpression()
     * @generated
     */
    EClass FEATURE_ACCESS_EXPRESSION = eINSTANCE.getFeatureAccessExpression();

    /**
     * The meta object literal for the '<em><b>Previous</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_ACCESS_EXPRESSION__PREVIOUS = eINSTANCE.getFeatureAccessExpression_Previous();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_ACCESS_EXPRESSION__FEATURE = eINSTANCE.getFeatureAccessExpression_Feature();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.SelectionExpressionImpl <em>Selection Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SelectionExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getSelectionExpression()
     * @generated
     */
    EClass SELECTION_EXPRESSION = eINSTANCE.getSelectionExpression();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DateNowExpressionImpl <em>Date Now Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.DateNowExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getDateNowExpression()
     * @generated
     */
    EClass DATE_NOW_EXPRESSION = eINSTANCE.getDateNowExpression();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DateTodayExpressionImpl <em>Date Today Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.DateTodayExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getDateTodayExpression()
     * @generated
     */
    EClass DATE_TODAY_EXPRESSION = eINSTANCE.getDateTodayExpression();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.StringLiteralExpressionImpl <em>String Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.StringLiteralExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getStringLiteralExpression()
     * @generated
     */
    EClass STRING_LITERAL_EXPRESSION = eINSTANCE.getStringLiteralExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL_EXPRESSION__VALUE = eINSTANCE.getStringLiteralExpression_Value();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BooleanLiteralExpressionImpl <em>Boolean Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.BooleanLiteralExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBooleanLiteralExpression()
     * @generated
     */
    EClass BOOLEAN_LITERAL_EXPRESSION = eINSTANCE.getBooleanLiteralExpression();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL_EXPRESSION__LITERAL = eINSTANCE.getBooleanLiteralExpression_Literal();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.IntegerLiteralExpressionImpl <em>Integer Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.IntegerLiteralExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getIntegerLiteralExpression()
     * @generated
     */
    EClass INTEGER_LITERAL_EXPRESSION = eINSTANCE.getIntegerLiteralExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_LITERAL_EXPRESSION__VALUE = eINSTANCE.getIntegerLiteralExpression_Value();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.NumberLiteralExpressionImpl <em>Number Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.NumberLiteralExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getNumberLiteralExpression()
     * @generated
     */
    EClass NUMBER_LITERAL_EXPRESSION = eINSTANCE.getNumberLiteralExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL_EXPRESSION__VALUE = eINSTANCE.getNumberLiteralExpression_Value();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackResponseExpressionImpl <em>Callback Response Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackResponseExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCallbackResponseExpression()
     * @generated
     */
    EClass CALLBACK_RESPONSE_EXPRESSION = eINSTANCE.getCallbackResponseExpression();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackErrorResponseExpressionImpl <em>Callback Error Response Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackErrorResponseExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCallbackErrorResponseExpression()
     * @generated
     */
    EClass CALLBACK_ERROR_RESPONSE_EXPRESSION = eINSTANCE.getCallbackErrorResponseExpression();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodCallExpressionImpl <em>Method Call Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodCallExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getMethodCallExpression()
     * @generated
     */
    EClass METHOD_CALL_EXPRESSION = eINSTANCE.getMethodCallExpression();

    /**
     * The meta object literal for the '<em><b>Method Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_CALL_EXPRESSION__METHOD_REF = eINSTANCE.getMethodCallExpression_MethodRef();

    /**
     * The meta object literal for the '<em><b>Argument List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_CALL_EXPRESSION__ARGUMENT_LIST = eINSTANCE.getMethodCallExpression_ArgumentList();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BooleanBinaryOperatorExpressionImpl <em>Boolean Binary Operator Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.BooleanBinaryOperatorExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBooleanBinaryOperatorExpression()
     * @generated
     */
    EClass BOOLEAN_BINARY_OPERATOR_EXPRESSION = eINSTANCE.getBooleanBinaryOperatorExpression();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ArithmeticBinaryOperatorExpressionImpl <em>Arithmetic Binary Operator Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.ArithmeticBinaryOperatorExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getArithmeticBinaryOperatorExpression()
     * @generated
     */
    EClass ARITHMETIC_BINARY_OPERATOR_EXPRESSION = eINSTANCE.getArithmeticBinaryOperatorExpression();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BinaryOperatorExpressionImpl <em>Binary Operator Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.BinaryOperatorExpressionImpl
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBinaryOperatorExpression()
     * @generated
     */
    EClass BINARY_OPERATOR_EXPRESSION = eINSTANCE.getBinaryOperatorExpression();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_OPERATOR_EXPRESSION__LEFT_OPERAND = eINSTANCE.getBinaryOperatorExpression_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getBinaryOperatorExpression_RightOperand();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ViewableTypes <em>Viewable Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.ViewableTypes
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getViewableTypes()
     * @generated
     */
    EEnum VIEWABLE_TYPES = eINSTANCE.getViewableTypes();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ValueTypes <em>Value Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.ValueTypes
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getValueTypes()
     * @generated
     */
    EEnum VALUE_TYPES = eINSTANCE.getValueTypes();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.GroupOrientations <em>Group Orientations</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.GroupOrientations
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getGroupOrientations()
     * @generated
     */
    EEnum GROUP_ORIENTATIONS = eINSTANCE.getGroupOrientations();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.VerticalAlignment <em>Vertical Alignment</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.VerticalAlignment
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getVerticalAlignment()
     * @generated
     */
    EEnum VERTICAL_ALIGNMENT = eINSTANCE.getVerticalAlignment();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOperator <em>Assignment Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOperator
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getAssignmentOperator()
     * @generated
     */
    EEnum ASSIGNMENT_OPERATOR = eINSTANCE.getAssignmentOperator();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.Comparator <em>Comparator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.Comparator
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getComparator()
     * @generated
     */
    EEnum COMPARATOR = eINSTANCE.getComparator();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.AdditiveOperators <em>Additive Operators</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.AdditiveOperators
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getAdditiveOperators()
     * @generated
     */
    EEnum ADDITIVE_OPERATORS = eINSTANCE.getAdditiveOperators();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeOperators <em>Multiplicative Operators</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeOperators
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getMultiplicativeOperators()
     * @generated
     */
    EEnum MULTIPLICATIVE_OPERATORS = eINSTANCE.getMultiplicativeOperators();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CrudTypes <em>Crud Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.CrudTypes
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getCrudTypes()
     * @generated
     */
    EEnum CRUD_TYPES = eINSTANCE.getCrudTypes();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctions <em>Builtin Functions</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctions
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBuiltinFunctions()
     * @generated
     */
    EEnum BUILTIN_FUNCTIONS = eINSTANCE.getBuiltinFunctions();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiterals <em>Boolean Literals</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiterals
     * @see nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslPackageImpl#getBooleanLiterals()
     * @generated
     */
    EEnum BOOLEAN_LITERALS = eINSTANCE.getBooleanLiterals();

  }

} //SimUiDslPackage

/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.*;

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
public class SimUiDslFactoryImpl extends EFactoryImpl implements SimUiDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimUiDslFactory init()
  {
    try
    {
      SimUiDslFactory theSimUiDslFactory = (SimUiDslFactory)EPackage.Registry.INSTANCE.getEFactory(SimUiDslPackage.eNS_URI);
      if (theSimUiDslFactory != null)
      {
        return theSimUiDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimUiDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimUiDslFactoryImpl()
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
      case SimUiDslPackage.UI_MODULE: return createUiModule();
      case SimUiDslPackage.TOP_LEVEL_DEFINITION: return createTopLevelDefinition();
      case SimUiDslPackage.TABLE_ROWS_DEFINITION: return createTableRowsDefinition();
      case SimUiDslPackage.VIEWABLE: return createViewable();
      case SimUiDslPackage.DEFINED_VIEWABLE: return createDefinedViewable();
      case SimUiDslPackage.MANUAL_VIEWABLE: return createManualViewable();
      case SimUiDslPackage.LOCAL_VIEWABLE_DEFINITION: return createLocalViewableDefinition();
      case SimUiDslPackage.VALUES_BLOCK: return createValuesBlock();
      case SimUiDslPackage.VALUE_DECLARATION: return createValueDeclaration();
      case SimUiDslPackage.VALUE: return createValue();
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION: return createAbstractValueDeclaration();
      case SimUiDslPackage.PARAMETER: return createParameter();
      case SimUiDslPackage.PARAMETER_LIST: return createParameterList();
      case SimUiDslPackage.METHOD_DEFINITION: return createMethodDefinition();
      case SimUiDslPackage.METHOD: return createMethod();
      case SimUiDslPackage.ELEMENT: return createElement();
      case SimUiDslPackage.QUOTATION: return createQuotation();
      case SimUiDslPackage.BINDING: return createBinding();
      case SimUiDslPackage.ELEMENT_BODY: return createElementBody();
      case SimUiDslPackage.COMPONENT_INVOCATION: return createComponentInvocation();
      case SimUiDslPackage.ARGUMENT: return createArgument();
      case SimUiDslPackage.ARGUMENT_LIST: return createArgumentList();
      case SimUiDslPackage.INPUT_ELEMENT: return createInputElement();
      case SimUiDslPackage.RADIO_OPTION: return createRadioOption();
      case SimUiDslPackage.STRUCTURE_OPTION: return createStructureOption();
      case SimUiDslPackage.BUTTON_ELEMENT: return createButtonElement();
      case SimUiDslPackage.BLOCK_ELEMENT: return createBlockElement();
      case SimUiDslPackage.LIST_ELEMENT: return createListElement();
      case SimUiDslPackage.LIST_VARIABLE: return createListVariable();
      case SimUiDslPackage.TABLE_ELEMENT: return createTableElement();
      case SimUiDslPackage.TABLE_BODY_ELEMENT: return createTableBodyElement();
      case SimUiDslPackage.TABLE_ROWS_INVOCATION: return createTableRowsInvocation();
      case SimUiDslPackage.TABLE_ROW: return createTableRow();
      case SimUiDslPackage.LABELED_TABLE_ELEMENT: return createLabeledTableElement();
      case SimUiDslPackage.LABELED_TABLE_ROW: return createLabeledTableRow();
      case SimUiDslPackage.PROGRESS_BAR_TAB_SET: return createProgressBarTabSet();
      case SimUiDslPackage.TAB_DECLARATION: return createTabDeclaration();
      case SimUiDslPackage.GROUP_ELEMENT: return createGroupElement();
      case SimUiDslPackage.COUNTDOWN_TIMER: return createCountdownTimer();
      case SimUiDslPackage.OBSERVE_ELEMENT: return createObserveElement();
      case SimUiDslPackage.CALENDAR_ELEMENT: return createCalendarElement();
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT: return createTimeSlotListElement();
      case SimUiDslPackage.SLOT_ADD_ELEMENT: return createSlotAddElement();
      case SimUiDslPackage.WHEN_ELEMENT: return createWhenElement();
      case SimUiDslPackage.IMAGE_ELEMENT: return createImageElement();
      case SimUiDslPackage.FRAME_ELEMENT: return createFrameElement();
      case SimUiDslPackage.LINE_BREAK_ELEMENT: return createLineBreakElement();
      case SimUiDslPackage.STATEMENT_BLOCK: return createStatementBlock();
      case SimUiDslPackage.STATEMENT: return createStatement();
      case SimUiDslPackage.EXITING_STATEMENT: return createExitingStatement();
      case SimUiDslPackage.NON_EXITING_STATEMENT: return createNonExitingStatement();
      case SimUiDslPackage.FOR_STATEMENT: return createForStatement();
      case SimUiDslPackage.LIST_REMOVE_STATEMENT: return createListRemoveStatement();
      case SimUiDslPackage.ASSIGNMENT_OR_EXPRESSION_STATEMENT: return createAssignmentOrExpressionStatement();
      case SimUiDslPackage.SHOW_MODAL_STATEMENT: return createShowModalStatement();
      case SimUiDslPackage.EXIT_MODAL_STATEMENT: return createExitModalStatement();
      case SimUiDslPackage.GOTO_SCREEN_STATEMENT: return createGotoScreenStatement();
      case SimUiDslPackage.GOTO_MODULE_STATEMENT: return createGotoModuleStatement();
      case SimUiDslPackage.PRINCIPAL_ARGUMENT: return createPrincipalArgument();
      case SimUiDslPackage.CREDENTIAL_ARGUMENT: return createCredentialArgument();
      case SimUiDslPackage.IF_STATEMENT: return createIfStatement();
      case SimUiDslPackage.LOCAL_VALUE_DECLARATION_STATEMENT: return createLocalValueDeclarationStatement();
      case SimUiDslPackage.VIEWABLE_CALL_SITE: return createViewableCallSite();
      case SimUiDslPackage.EXPRESSION: return createExpression();
      case SimUiDslPackage.SERVICE_IDENTIFICATION: return createServiceIdentification();
      case SimUiDslPackage.DATE_EXPRESSION: return createDateExpression();
      case SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION: return createBuiltinFunctionExpression();
      case SimUiDslPackage.LITERAL_EXPRESSION: return createLiteralExpression();
      case SimUiDslPackage.LIST_LITERAL_EXPRESSION: return createListLiteralExpression();
      case SimUiDslPackage.ENUMERATION_LITERAL_EXPRESSION: return createEnumerationLiteralExpression();
      case SimUiDslPackage.DECISION_EXPRESSION: return createDecisionExpression();
      case SimUiDslPackage.DECISION_CASE: return createDecisionCase();
      case SimUiDslPackage.CALLBACK_EXPRESSIONS: return createCallbackExpressions();
      case SimUiDslPackage.CALLBACK_EXPRESSION: return createCallbackExpression();
      case SimUiDslPackage.STRUCTURE_CREATION_EXPRESSION: return createStructureCreationExpression();
      case SimUiDslPackage.FEATURE_ASSIGNMENT: return createFeatureAssignment();
      case SimUiDslPackage.VALUE_REFERENCE_OR_METHOD_CALL_EXPRESSION: return createValueReferenceOrMethodCallExpression();
      case SimUiDslPackage.REFERENCE_EXPRESSION: return createReferenceExpression();
      case SimUiDslPackage.REFERABLE: return createReferable();
      case SimUiDslPackage.TERNARY_EXPRESSION: return createTernaryExpression();
      case SimUiDslPackage.OR_EXPRESSION: return createOrExpression();
      case SimUiDslPackage.AND_EXPRESSION: return createAndExpression();
      case SimUiDslPackage.COMPARISON_EXPRESSION: return createComparisonExpression();
      case SimUiDslPackage.ADDITIVE_EXPRESSION: return createAdditiveExpression();
      case SimUiDslPackage.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
      case SimUiDslPackage.NOT_EXPRESSION: return createNotExpression();
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION: return createInterfaceCallExpression();
      case SimUiDslPackage.NAMED_SERVICE_REFERENCE: return createNamedServiceReference();
      case SimUiDslPackage.CRUD_SERVICE_IDENTIFICATION: return createCrudServiceIdentification();
      case SimUiDslPackage.FEATURE_ACCESS_EXPRESSION: return createFeatureAccessExpression();
      case SimUiDslPackage.SELECTION_EXPRESSION: return createSelectionExpression();
      case SimUiDslPackage.DATE_NOW_EXPRESSION: return createDateNowExpression();
      case SimUiDslPackage.DATE_TODAY_EXPRESSION: return createDateTodayExpression();
      case SimUiDslPackage.STRING_LITERAL_EXPRESSION: return createStringLiteralExpression();
      case SimUiDslPackage.BOOLEAN_LITERAL_EXPRESSION: return createBooleanLiteralExpression();
      case SimUiDslPackage.INTEGER_LITERAL_EXPRESSION: return createIntegerLiteralExpression();
      case SimUiDslPackage.NUMBER_LITERAL_EXPRESSION: return createNumberLiteralExpression();
      case SimUiDslPackage.CALLBACK_RESPONSE_EXPRESSION: return createCallbackResponseExpression();
      case SimUiDslPackage.CALLBACK_ERROR_RESPONSE_EXPRESSION: return createCallbackErrorResponseExpression();
      case SimUiDslPackage.METHOD_CALL_EXPRESSION: return createMethodCallExpression();
      case SimUiDslPackage.BOOLEAN_BINARY_OPERATOR_EXPRESSION: return createBooleanBinaryOperatorExpression();
      case SimUiDslPackage.ARITHMETIC_BINARY_OPERATOR_EXPRESSION: return createArithmeticBinaryOperatorExpression();
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
      case SimUiDslPackage.VIEWABLE_TYPES:
        return createViewableTypesFromString(eDataType, initialValue);
      case SimUiDslPackage.VALUE_TYPES:
        return createValueTypesFromString(eDataType, initialValue);
      case SimUiDslPackage.GROUP_ORIENTATIONS:
        return createGroupOrientationsFromString(eDataType, initialValue);
      case SimUiDslPackage.VERTICAL_ALIGNMENT:
        return createVerticalAlignmentFromString(eDataType, initialValue);
      case SimUiDslPackage.ASSIGNMENT_OPERATOR:
        return createAssignmentOperatorFromString(eDataType, initialValue);
      case SimUiDslPackage.COMPARATOR:
        return createComparatorFromString(eDataType, initialValue);
      case SimUiDslPackage.ADDITIVE_OPERATORS:
        return createAdditiveOperatorsFromString(eDataType, initialValue);
      case SimUiDslPackage.MULTIPLICATIVE_OPERATORS:
        return createMultiplicativeOperatorsFromString(eDataType, initialValue);
      case SimUiDslPackage.CRUD_TYPES:
        return createCrudTypesFromString(eDataType, initialValue);
      case SimUiDslPackage.BUILTIN_FUNCTIONS:
        return createBuiltinFunctionsFromString(eDataType, initialValue);
      case SimUiDslPackage.BOOLEAN_LITERALS:
        return createBooleanLiteralsFromString(eDataType, initialValue);
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
      case SimUiDslPackage.VIEWABLE_TYPES:
        return convertViewableTypesToString(eDataType, instanceValue);
      case SimUiDslPackage.VALUE_TYPES:
        return convertValueTypesToString(eDataType, instanceValue);
      case SimUiDslPackage.GROUP_ORIENTATIONS:
        return convertGroupOrientationsToString(eDataType, instanceValue);
      case SimUiDslPackage.VERTICAL_ALIGNMENT:
        return convertVerticalAlignmentToString(eDataType, instanceValue);
      case SimUiDslPackage.ASSIGNMENT_OPERATOR:
        return convertAssignmentOperatorToString(eDataType, instanceValue);
      case SimUiDslPackage.COMPARATOR:
        return convertComparatorToString(eDataType, instanceValue);
      case SimUiDslPackage.ADDITIVE_OPERATORS:
        return convertAdditiveOperatorsToString(eDataType, instanceValue);
      case SimUiDslPackage.MULTIPLICATIVE_OPERATORS:
        return convertMultiplicativeOperatorsToString(eDataType, instanceValue);
      case SimUiDslPackage.CRUD_TYPES:
        return convertCrudTypesToString(eDataType, instanceValue);
      case SimUiDslPackage.BUILTIN_FUNCTIONS:
        return convertBuiltinFunctionsToString(eDataType, instanceValue);
      case SimUiDslPackage.BOOLEAN_LITERALS:
        return convertBooleanLiteralsToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UiModule createUiModule()
  {
    UiModuleImpl uiModule = new UiModuleImpl();
    return uiModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelDefinition createTopLevelDefinition()
  {
    TopLevelDefinitionImpl topLevelDefinition = new TopLevelDefinitionImpl();
    return topLevelDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableRowsDefinition createTableRowsDefinition()
  {
    TableRowsDefinitionImpl tableRowsDefinition = new TableRowsDefinitionImpl();
    return tableRowsDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Viewable createViewable()
  {
    ViewableImpl viewable = new ViewableImpl();
    return viewable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinedViewable createDefinedViewable()
  {
    DefinedViewableImpl definedViewable = new DefinedViewableImpl();
    return definedViewable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ManualViewable createManualViewable()
  {
    ManualViewableImpl manualViewable = new ManualViewableImpl();
    return manualViewable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalViewableDefinition createLocalViewableDefinition()
  {
    LocalViewableDefinitionImpl localViewableDefinition = new LocalViewableDefinitionImpl();
    return localViewableDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuesBlock createValuesBlock()
  {
    ValuesBlockImpl valuesBlock = new ValuesBlockImpl();
    return valuesBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueDeclaration createValueDeclaration()
  {
    ValueDeclarationImpl valueDeclaration = new ValueDeclarationImpl();
    return valueDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractValueDeclaration createAbstractValueDeclaration()
  {
    AbstractValueDeclarationImpl abstractValueDeclaration = new AbstractValueDeclarationImpl();
    return abstractValueDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList createParameterList()
  {
    ParameterListImpl parameterList = new ParameterListImpl();
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDefinition createMethodDefinition()
  {
    MethodDefinitionImpl methodDefinition = new MethodDefinitionImpl();
    return methodDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quotation createQuotation()
  {
    QuotationImpl quotation = new QuotationImpl();
    return quotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementBody createElementBody()
  {
    ElementBodyImpl elementBody = new ElementBodyImpl();
    return elementBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentInvocation createComponentInvocation()
  {
    ComponentInvocationImpl componentInvocation = new ComponentInvocationImpl();
    return componentInvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentList createArgumentList()
  {
    ArgumentListImpl argumentList = new ArgumentListImpl();
    return argumentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputElement createInputElement()
  {
    InputElementImpl inputElement = new InputElementImpl();
    return inputElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RadioOption createRadioOption()
  {
    RadioOptionImpl radioOption = new RadioOptionImpl();
    return radioOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureOption createStructureOption()
  {
    StructureOptionImpl structureOption = new StructureOptionImpl();
    return structureOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonElement createButtonElement()
  {
    ButtonElementImpl buttonElement = new ButtonElementImpl();
    return buttonElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockElement createBlockElement()
  {
    BlockElementImpl blockElement = new BlockElementImpl();
    return blockElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListElement createListElement()
  {
    ListElementImpl listElement = new ListElementImpl();
    return listElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListVariable createListVariable()
  {
    ListVariableImpl listVariable = new ListVariableImpl();
    return listVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableElement createTableElement()
  {
    TableElementImpl tableElement = new TableElementImpl();
    return tableElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableBodyElement createTableBodyElement()
  {
    TableBodyElementImpl tableBodyElement = new TableBodyElementImpl();
    return tableBodyElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableRowsInvocation createTableRowsInvocation()
  {
    TableRowsInvocationImpl tableRowsInvocation = new TableRowsInvocationImpl();
    return tableRowsInvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableRow createTableRow()
  {
    TableRowImpl tableRow = new TableRowImpl();
    return tableRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabeledTableElement createLabeledTableElement()
  {
    LabeledTableElementImpl labeledTableElement = new LabeledTableElementImpl();
    return labeledTableElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabeledTableRow createLabeledTableRow()
  {
    LabeledTableRowImpl labeledTableRow = new LabeledTableRowImpl();
    return labeledTableRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProgressBarTabSet createProgressBarTabSet()
  {
    ProgressBarTabSetImpl progressBarTabSet = new ProgressBarTabSetImpl();
    return progressBarTabSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TabDeclaration createTabDeclaration()
  {
    TabDeclarationImpl tabDeclaration = new TabDeclarationImpl();
    return tabDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupElement createGroupElement()
  {
    GroupElementImpl groupElement = new GroupElementImpl();
    return groupElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CountdownTimer createCountdownTimer()
  {
    CountdownTimerImpl countdownTimer = new CountdownTimerImpl();
    return countdownTimer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ObserveElement createObserveElement()
  {
    ObserveElementImpl observeElement = new ObserveElementImpl();
    return observeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CalendarElement createCalendarElement()
  {
    CalendarElementImpl calendarElement = new CalendarElementImpl();
    return calendarElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeSlotListElement createTimeSlotListElement()
  {
    TimeSlotListElementImpl timeSlotListElement = new TimeSlotListElementImpl();
    return timeSlotListElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SlotAddElement createSlotAddElement()
  {
    SlotAddElementImpl slotAddElement = new SlotAddElementImpl();
    return slotAddElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenElement createWhenElement()
  {
    WhenElementImpl whenElement = new WhenElementImpl();
    return whenElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageElement createImageElement()
  {
    ImageElementImpl imageElement = new ImageElementImpl();
    return imageElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FrameElement createFrameElement()
  {
    FrameElementImpl frameElement = new FrameElementImpl();
    return frameElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineBreakElement createLineBreakElement()
  {
    LineBreakElementImpl lineBreakElement = new LineBreakElementImpl();
    return lineBreakElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementBlock createStatementBlock()
  {
    StatementBlockImpl statementBlock = new StatementBlockImpl();
    return statementBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExitingStatement createExitingStatement()
  {
    ExitingStatementImpl exitingStatement = new ExitingStatementImpl();
    return exitingStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonExitingStatement createNonExitingStatement()
  {
    NonExitingStatementImpl nonExitingStatement = new NonExitingStatementImpl();
    return nonExitingStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStatement createForStatement()
  {
    ForStatementImpl forStatement = new ForStatementImpl();
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListRemoveStatement createListRemoveStatement()
  {
    ListRemoveStatementImpl listRemoveStatement = new ListRemoveStatementImpl();
    return listRemoveStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentOrExpressionStatement createAssignmentOrExpressionStatement()
  {
    AssignmentOrExpressionStatementImpl assignmentOrExpressionStatement = new AssignmentOrExpressionStatementImpl();
    return assignmentOrExpressionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShowModalStatement createShowModalStatement()
  {
    ShowModalStatementImpl showModalStatement = new ShowModalStatementImpl();
    return showModalStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExitModalStatement createExitModalStatement()
  {
    ExitModalStatementImpl exitModalStatement = new ExitModalStatementImpl();
    return exitModalStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GotoScreenStatement createGotoScreenStatement()
  {
    GotoScreenStatementImpl gotoScreenStatement = new GotoScreenStatementImpl();
    return gotoScreenStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GotoModuleStatement createGotoModuleStatement()
  {
    GotoModuleStatementImpl gotoModuleStatement = new GotoModuleStatementImpl();
    return gotoModuleStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrincipalArgument createPrincipalArgument()
  {
    PrincipalArgumentImpl principalArgument = new PrincipalArgumentImpl();
    return principalArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CredentialArgument createCredentialArgument()
  {
    CredentialArgumentImpl credentialArgument = new CredentialArgumentImpl();
    return credentialArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalValueDeclarationStatement createLocalValueDeclarationStatement()
  {
    LocalValueDeclarationStatementImpl localValueDeclarationStatement = new LocalValueDeclarationStatementImpl();
    return localValueDeclarationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewableCallSite createViewableCallSite()
  {
    ViewableCallSiteImpl viewableCallSite = new ViewableCallSiteImpl();
    return viewableCallSite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceIdentification createServiceIdentification()
  {
    ServiceIdentificationImpl serviceIdentification = new ServiceIdentificationImpl();
    return serviceIdentification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateExpression createDateExpression()
  {
    DateExpressionImpl dateExpression = new DateExpressionImpl();
    return dateExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltinFunctionExpression createBuiltinFunctionExpression()
  {
    BuiltinFunctionExpressionImpl builtinFunctionExpression = new BuiltinFunctionExpressionImpl();
    return builtinFunctionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression createLiteralExpression()
  {
    LiteralExpressionImpl literalExpression = new LiteralExpressionImpl();
    return literalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListLiteralExpression createListLiteralExpression()
  {
    ListLiteralExpressionImpl listLiteralExpression = new ListLiteralExpressionImpl();
    return listLiteralExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteralExpression createEnumerationLiteralExpression()
  {
    EnumerationLiteralExpressionImpl enumerationLiteralExpression = new EnumerationLiteralExpressionImpl();
    return enumerationLiteralExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecisionExpression createDecisionExpression()
  {
    DecisionExpressionImpl decisionExpression = new DecisionExpressionImpl();
    return decisionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecisionCase createDecisionCase()
  {
    DecisionCaseImpl decisionCase = new DecisionCaseImpl();
    return decisionCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallbackExpressions createCallbackExpressions()
  {
    CallbackExpressionsImpl callbackExpressions = new CallbackExpressionsImpl();
    return callbackExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallbackExpression createCallbackExpression()
  {
    CallbackExpressionImpl callbackExpression = new CallbackExpressionImpl();
    return callbackExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureCreationExpression createStructureCreationExpression()
  {
    StructureCreationExpressionImpl structureCreationExpression = new StructureCreationExpressionImpl();
    return structureCreationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureAssignment createFeatureAssignment()
  {
    FeatureAssignmentImpl featureAssignment = new FeatureAssignmentImpl();
    return featureAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueReferenceOrMethodCallExpression createValueReferenceOrMethodCallExpression()
  {
    ValueReferenceOrMethodCallExpressionImpl valueReferenceOrMethodCallExpression = new ValueReferenceOrMethodCallExpressionImpl();
    return valueReferenceOrMethodCallExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceExpression createReferenceExpression()
  {
    ReferenceExpressionImpl referenceExpression = new ReferenceExpressionImpl();
    return referenceExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Referable createReferable()
  {
    ReferableImpl referable = new ReferableImpl();
    return referable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TernaryExpression createTernaryExpression()
  {
    TernaryExpressionImpl ternaryExpression = new TernaryExpressionImpl();
    return ternaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparisonExpression createComparisonExpression()
  {
    ComparisonExpressionImpl comparisonExpression = new ComparisonExpressionImpl();
    return comparisonExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpression createAdditiveExpression()
  {
    AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeExpression createMultiplicativeExpression()
  {
    MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
    return multiplicativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotExpression createNotExpression()
  {
    NotExpressionImpl notExpression = new NotExpressionImpl();
    return notExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceCallExpression createInterfaceCallExpression()
  {
    InterfaceCallExpressionImpl interfaceCallExpression = new InterfaceCallExpressionImpl();
    return interfaceCallExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedServiceReference createNamedServiceReference()
  {
    NamedServiceReferenceImpl namedServiceReference = new NamedServiceReferenceImpl();
    return namedServiceReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CrudServiceIdentification createCrudServiceIdentification()
  {
    CrudServiceIdentificationImpl crudServiceIdentification = new CrudServiceIdentificationImpl();
    return crudServiceIdentification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureAccessExpression createFeatureAccessExpression()
  {
    FeatureAccessExpressionImpl featureAccessExpression = new FeatureAccessExpressionImpl();
    return featureAccessExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectionExpression createSelectionExpression()
  {
    SelectionExpressionImpl selectionExpression = new SelectionExpressionImpl();
    return selectionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateNowExpression createDateNowExpression()
  {
    DateNowExpressionImpl dateNowExpression = new DateNowExpressionImpl();
    return dateNowExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateTodayExpression createDateTodayExpression()
  {
    DateTodayExpressionImpl dateTodayExpression = new DateTodayExpressionImpl();
    return dateTodayExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteralExpression createStringLiteralExpression()
  {
    StringLiteralExpressionImpl stringLiteralExpression = new StringLiteralExpressionImpl();
    return stringLiteralExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteralExpression createBooleanLiteralExpression()
  {
    BooleanLiteralExpressionImpl booleanLiteralExpression = new BooleanLiteralExpressionImpl();
    return booleanLiteralExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteralExpression createIntegerLiteralExpression()
  {
    IntegerLiteralExpressionImpl integerLiteralExpression = new IntegerLiteralExpressionImpl();
    return integerLiteralExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteralExpression createNumberLiteralExpression()
  {
    NumberLiteralExpressionImpl numberLiteralExpression = new NumberLiteralExpressionImpl();
    return numberLiteralExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallbackResponseExpression createCallbackResponseExpression()
  {
    CallbackResponseExpressionImpl callbackResponseExpression = new CallbackResponseExpressionImpl();
    return callbackResponseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallbackErrorResponseExpression createCallbackErrorResponseExpression()
  {
    CallbackErrorResponseExpressionImpl callbackErrorResponseExpression = new CallbackErrorResponseExpressionImpl();
    return callbackErrorResponseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodCallExpression createMethodCallExpression()
  {
    MethodCallExpressionImpl methodCallExpression = new MethodCallExpressionImpl();
    return methodCallExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanBinaryOperatorExpression createBooleanBinaryOperatorExpression()
  {
    BooleanBinaryOperatorExpressionImpl booleanBinaryOperatorExpression = new BooleanBinaryOperatorExpressionImpl();
    return booleanBinaryOperatorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticBinaryOperatorExpression createArithmeticBinaryOperatorExpression()
  {
    ArithmeticBinaryOperatorExpressionImpl arithmeticBinaryOperatorExpression = new ArithmeticBinaryOperatorExpressionImpl();
    return arithmeticBinaryOperatorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewableTypes createViewableTypesFromString(EDataType eDataType, String initialValue)
  {
    ViewableTypes result = ViewableTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertViewableTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueTypes createValueTypesFromString(EDataType eDataType, String initialValue)
  {
    ValueTypes result = ValueTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertValueTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupOrientations createGroupOrientationsFromString(EDataType eDataType, String initialValue)
  {
    GroupOrientations result = GroupOrientations.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGroupOrientationsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerticalAlignment createVerticalAlignmentFromString(EDataType eDataType, String initialValue)
  {
    VerticalAlignment result = VerticalAlignment.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVerticalAlignmentToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentOperator createAssignmentOperatorFromString(EDataType eDataType, String initialValue)
  {
    AssignmentOperator result = AssignmentOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAssignmentOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparator createComparatorFromString(EDataType eDataType, String initialValue)
  {
    Comparator result = Comparator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertComparatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveOperators createAdditiveOperatorsFromString(EDataType eDataType, String initialValue)
  {
    AdditiveOperators result = AdditiveOperators.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAdditiveOperatorsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeOperators createMultiplicativeOperatorsFromString(EDataType eDataType, String initialValue)
  {
    MultiplicativeOperators result = MultiplicativeOperators.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMultiplicativeOperatorsToString(EDataType eDataType, Object instanceValue)
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
  public BuiltinFunctions createBuiltinFunctionsFromString(EDataType eDataType, String initialValue)
  {
    BuiltinFunctions result = BuiltinFunctions.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBuiltinFunctionsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiterals createBooleanLiteralsFromString(EDataType eDataType, String initialValue)
  {
    BooleanLiterals result = BooleanLiterals.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanLiteralsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimUiDslPackage getSimUiDslPackage()
  {
    return (SimUiDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimUiDslPackage getPackage()
  {
    return SimUiDslPackage.eINSTANCE;
  }

} //SimUiDslFactoryImpl

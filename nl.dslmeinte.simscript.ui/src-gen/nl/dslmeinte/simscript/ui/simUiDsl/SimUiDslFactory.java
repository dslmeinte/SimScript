/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage
 * @generated
 */
public interface SimUiDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimUiDslFactory eINSTANCE = nl.dslmeinte.simscript.ui.simUiDsl.impl.SimUiDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Ui Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ui Module</em>'.
   * @generated
   */
  UiModule createUiModule();

  /**
   * Returns a new object of class '<em>Top Level Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Level Definition</em>'.
   * @generated
   */
  TopLevelDefinition createTopLevelDefinition();

  /**
   * Returns a new object of class '<em>Table Rows Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Rows Definition</em>'.
   * @generated
   */
  TableRowsDefinition createTableRowsDefinition();

  /**
   * Returns a new object of class '<em>Viewable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Viewable</em>'.
   * @generated
   */
  Viewable createViewable();

  /**
   * Returns a new object of class '<em>Defined Viewable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Defined Viewable</em>'.
   * @generated
   */
  DefinedViewable createDefinedViewable();

  /**
   * Returns a new object of class '<em>Manual Viewable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Manual Viewable</em>'.
   * @generated
   */
  ManualViewable createManualViewable();

  /**
   * Returns a new object of class '<em>Local Viewable Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Viewable Definition</em>'.
   * @generated
   */
  LocalViewableDefinition createLocalViewableDefinition();

  /**
   * Returns a new object of class '<em>Values Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Values Block</em>'.
   * @generated
   */
  ValuesBlock createValuesBlock();

  /**
   * Returns a new object of class '<em>Value Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Declaration</em>'.
   * @generated
   */
  ValueDeclaration createValueDeclaration();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>Abstract Value Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Value Declaration</em>'.
   * @generated
   */
  AbstractValueDeclaration createAbstractValueDeclaration();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Parameter List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter List</em>'.
   * @generated
   */
  ParameterList createParameterList();

  /**
   * Returns a new object of class '<em>Method Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Definition</em>'.
   * @generated
   */
  MethodDefinition createMethodDefinition();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Quotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quotation</em>'.
   * @generated
   */
  Quotation createQuotation();

  /**
   * Returns a new object of class '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding</em>'.
   * @generated
   */
  Binding createBinding();

  /**
   * Returns a new object of class '<em>Element Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Body</em>'.
   * @generated
   */
  ElementBody createElementBody();

  /**
   * Returns a new object of class '<em>Component Invocation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Invocation</em>'.
   * @generated
   */
  ComponentInvocation createComponentInvocation();

  /**
   * Returns a new object of class '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument</em>'.
   * @generated
   */
  Argument createArgument();

  /**
   * Returns a new object of class '<em>Argument List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument List</em>'.
   * @generated
   */
  ArgumentList createArgumentList();

  /**
   * Returns a new object of class '<em>Input Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Element</em>'.
   * @generated
   */
  InputElement createInputElement();

  /**
   * Returns a new object of class '<em>Radio Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Radio Option</em>'.
   * @generated
   */
  RadioOption createRadioOption();

  /**
   * Returns a new object of class '<em>Structure Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structure Option</em>'.
   * @generated
   */
  StructureOption createStructureOption();

  /**
   * Returns a new object of class '<em>Button Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Button Element</em>'.
   * @generated
   */
  ButtonElement createButtonElement();

  /**
   * Returns a new object of class '<em>Block Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Element</em>'.
   * @generated
   */
  BlockElement createBlockElement();

  /**
   * Returns a new object of class '<em>List Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Element</em>'.
   * @generated
   */
  ListElement createListElement();

  /**
   * Returns a new object of class '<em>List Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Variable</em>'.
   * @generated
   */
  ListVariable createListVariable();

  /**
   * Returns a new object of class '<em>Table Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Element</em>'.
   * @generated
   */
  TableElement createTableElement();

  /**
   * Returns a new object of class '<em>Table Body Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Body Element</em>'.
   * @generated
   */
  TableBodyElement createTableBodyElement();

  /**
   * Returns a new object of class '<em>Table Rows Invocation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Rows Invocation</em>'.
   * @generated
   */
  TableRowsInvocation createTableRowsInvocation();

  /**
   * Returns a new object of class '<em>Table Row</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Row</em>'.
   * @generated
   */
  TableRow createTableRow();

  /**
   * Returns a new object of class '<em>Labeled Table Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Labeled Table Element</em>'.
   * @generated
   */
  LabeledTableElement createLabeledTableElement();

  /**
   * Returns a new object of class '<em>Labeled Table Row</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Labeled Table Row</em>'.
   * @generated
   */
  LabeledTableRow createLabeledTableRow();

  /**
   * Returns a new object of class '<em>Progress Bar Tab Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Progress Bar Tab Set</em>'.
   * @generated
   */
  ProgressBarTabSet createProgressBarTabSet();

  /**
   * Returns a new object of class '<em>Tab Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tab Declaration</em>'.
   * @generated
   */
  TabDeclaration createTabDeclaration();

  /**
   * Returns a new object of class '<em>Group Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Element</em>'.
   * @generated
   */
  GroupElement createGroupElement();

  /**
   * Returns a new object of class '<em>Countdown Timer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Countdown Timer</em>'.
   * @generated
   */
  CountdownTimer createCountdownTimer();

  /**
   * Returns a new object of class '<em>Observe Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Observe Element</em>'.
   * @generated
   */
  ObserveElement createObserveElement();

  /**
   * Returns a new object of class '<em>Calendar Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Calendar Element</em>'.
   * @generated
   */
  CalendarElement createCalendarElement();

  /**
   * Returns a new object of class '<em>Time Slot List Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Slot List Element</em>'.
   * @generated
   */
  TimeSlotListElement createTimeSlotListElement();

  /**
   * Returns a new object of class '<em>Slot Add Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Slot Add Element</em>'.
   * @generated
   */
  SlotAddElement createSlotAddElement();

  /**
   * Returns a new object of class '<em>When Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>When Element</em>'.
   * @generated
   */
  WhenElement createWhenElement();

  /**
   * Returns a new object of class '<em>Image Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Image Element</em>'.
   * @generated
   */
  ImageElement createImageElement();

  /**
   * Returns a new object of class '<em>Frame Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Frame Element</em>'.
   * @generated
   */
  FrameElement createFrameElement();

  /**
   * Returns a new object of class '<em>Line Break Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Line Break Element</em>'.
   * @generated
   */
  LineBreakElement createLineBreakElement();

  /**
   * Returns a new object of class '<em>Statement Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement Block</em>'.
   * @generated
   */
  StatementBlock createStatementBlock();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Exiting Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exiting Statement</em>'.
   * @generated
   */
  ExitingStatement createExitingStatement();

  /**
   * Returns a new object of class '<em>Non Exiting Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Exiting Statement</em>'.
   * @generated
   */
  NonExitingStatement createNonExitingStatement();

  /**
   * Returns a new object of class '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Statement</em>'.
   * @generated
   */
  ForStatement createForStatement();

  /**
   * Returns a new object of class '<em>List Remove Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Remove Statement</em>'.
   * @generated
   */
  ListRemoveStatement createListRemoveStatement();

  /**
   * Returns a new object of class '<em>Assignment Or Expression Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment Or Expression Statement</em>'.
   * @generated
   */
  AssignmentOrExpressionStatement createAssignmentOrExpressionStatement();

  /**
   * Returns a new object of class '<em>Show Modal Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Show Modal Statement</em>'.
   * @generated
   */
  ShowModalStatement createShowModalStatement();

  /**
   * Returns a new object of class '<em>Exit Modal Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exit Modal Statement</em>'.
   * @generated
   */
  ExitModalStatement createExitModalStatement();

  /**
   * Returns a new object of class '<em>Goto Screen Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goto Screen Statement</em>'.
   * @generated
   */
  GotoScreenStatement createGotoScreenStatement();

  /**
   * Returns a new object of class '<em>Goto Module Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goto Module Statement</em>'.
   * @generated
   */
  GotoModuleStatement createGotoModuleStatement();

  /**
   * Returns a new object of class '<em>Principal Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Principal Argument</em>'.
   * @generated
   */
  PrincipalArgument createPrincipalArgument();

  /**
   * Returns a new object of class '<em>Credential Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Credential Argument</em>'.
   * @generated
   */
  CredentialArgument createCredentialArgument();

  /**
   * Returns a new object of class '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement</em>'.
   * @generated
   */
  IfStatement createIfStatement();

  /**
   * Returns a new object of class '<em>Local Value Declaration Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Value Declaration Statement</em>'.
   * @generated
   */
  LocalValueDeclarationStatement createLocalValueDeclarationStatement();

  /**
   * Returns a new object of class '<em>Viewable Call Site</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Viewable Call Site</em>'.
   * @generated
   */
  ViewableCallSite createViewableCallSite();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Service Identification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Identification</em>'.
   * @generated
   */
  ServiceIdentification createServiceIdentification();

  /**
   * Returns a new object of class '<em>Date Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date Expression</em>'.
   * @generated
   */
  DateExpression createDateExpression();

  /**
   * Returns a new object of class '<em>Builtin Function Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Builtin Function Expression</em>'.
   * @generated
   */
  BuiltinFunctionExpression createBuiltinFunctionExpression();

  /**
   * Returns a new object of class '<em>Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Expression</em>'.
   * @generated
   */
  LiteralExpression createLiteralExpression();

  /**
   * Returns a new object of class '<em>List Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Literal Expression</em>'.
   * @generated
   */
  ListLiteralExpression createListLiteralExpression();

  /**
   * Returns a new object of class '<em>Enumeration Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration Literal Expression</em>'.
   * @generated
   */
  EnumerationLiteralExpression createEnumerationLiteralExpression();

  /**
   * Returns a new object of class '<em>Decision Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decision Expression</em>'.
   * @generated
   */
  DecisionExpression createDecisionExpression();

  /**
   * Returns a new object of class '<em>Decision Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decision Case</em>'.
   * @generated
   */
  DecisionCase createDecisionCase();

  /**
   * Returns a new object of class '<em>Callback Expressions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Callback Expressions</em>'.
   * @generated
   */
  CallbackExpressions createCallbackExpressions();

  /**
   * Returns a new object of class '<em>Callback Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Callback Expression</em>'.
   * @generated
   */
  CallbackExpression createCallbackExpression();

  /**
   * Returns a new object of class '<em>Structure Creation Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structure Creation Expression</em>'.
   * @generated
   */
  StructureCreationExpression createStructureCreationExpression();

  /**
   * Returns a new object of class '<em>Feature Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Assignment</em>'.
   * @generated
   */
  FeatureAssignment createFeatureAssignment();

  /**
   * Returns a new object of class '<em>Value Reference Or Method Call Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Reference Or Method Call Expression</em>'.
   * @generated
   */
  ValueReferenceOrMethodCallExpression createValueReferenceOrMethodCallExpression();

  /**
   * Returns a new object of class '<em>Reference Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Expression</em>'.
   * @generated
   */
  ReferenceExpression createReferenceExpression();

  /**
   * Returns a new object of class '<em>Referable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Referable</em>'.
   * @generated
   */
  Referable createReferable();

  /**
   * Returns a new object of class '<em>Ternary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ternary Expression</em>'.
   * @generated
   */
  TernaryExpression createTernaryExpression();

  /**
   * Returns a new object of class '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Expression</em>'.
   * @generated
   */
  OrExpression createOrExpression();

  /**
   * Returns a new object of class '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expression</em>'.
   * @generated
   */
  AndExpression createAndExpression();

  /**
   * Returns a new object of class '<em>Comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison Expression</em>'.
   * @generated
   */
  ComparisonExpression createComparisonExpression();

  /**
   * Returns a new object of class '<em>Additive Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Additive Expression</em>'.
   * @generated
   */
  AdditiveExpression createAdditiveExpression();

  /**
   * Returns a new object of class '<em>Multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplicative Expression</em>'.
   * @generated
   */
  MultiplicativeExpression createMultiplicativeExpression();

  /**
   * Returns a new object of class '<em>Not Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Expression</em>'.
   * @generated
   */
  NotExpression createNotExpression();

  /**
   * Returns a new object of class '<em>Interface Call Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Call Expression</em>'.
   * @generated
   */
  InterfaceCallExpression createInterfaceCallExpression();

  /**
   * Returns a new object of class '<em>Named Service Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Service Reference</em>'.
   * @generated
   */
  NamedServiceReference createNamedServiceReference();

  /**
   * Returns a new object of class '<em>Crud Service Identification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Crud Service Identification</em>'.
   * @generated
   */
  CrudServiceIdentification createCrudServiceIdentification();

  /**
   * Returns a new object of class '<em>Feature Access Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Access Expression</em>'.
   * @generated
   */
  FeatureAccessExpression createFeatureAccessExpression();

  /**
   * Returns a new object of class '<em>Selection Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selection Expression</em>'.
   * @generated
   */
  SelectionExpression createSelectionExpression();

  /**
   * Returns a new object of class '<em>Date Now Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date Now Expression</em>'.
   * @generated
   */
  DateNowExpression createDateNowExpression();

  /**
   * Returns a new object of class '<em>Date Today Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date Today Expression</em>'.
   * @generated
   */
  DateTodayExpression createDateTodayExpression();

  /**
   * Returns a new object of class '<em>String Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal Expression</em>'.
   * @generated
   */
  StringLiteralExpression createStringLiteralExpression();

  /**
   * Returns a new object of class '<em>Boolean Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal Expression</em>'.
   * @generated
   */
  BooleanLiteralExpression createBooleanLiteralExpression();

  /**
   * Returns a new object of class '<em>Integer Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Literal Expression</em>'.
   * @generated
   */
  IntegerLiteralExpression createIntegerLiteralExpression();

  /**
   * Returns a new object of class '<em>Number Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Literal Expression</em>'.
   * @generated
   */
  NumberLiteralExpression createNumberLiteralExpression();

  /**
   * Returns a new object of class '<em>Callback Response Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Callback Response Expression</em>'.
   * @generated
   */
  CallbackResponseExpression createCallbackResponseExpression();

  /**
   * Returns a new object of class '<em>Callback Error Response Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Callback Error Response Expression</em>'.
   * @generated
   */
  CallbackErrorResponseExpression createCallbackErrorResponseExpression();

  /**
   * Returns a new object of class '<em>Method Call Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Call Expression</em>'.
   * @generated
   */
  MethodCallExpression createMethodCallExpression();

  /**
   * Returns a new object of class '<em>Boolean Binary Operator Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Binary Operator Expression</em>'.
   * @generated
   */
  BooleanBinaryOperatorExpression createBooleanBinaryOperatorExpression();

  /**
   * Returns a new object of class '<em>Arithmetic Binary Operator Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arithmetic Binary Operator Expression</em>'.
   * @generated
   */
  ArithmeticBinaryOperatorExpression createArithmeticBinaryOperatorExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SimUiDslPackage getSimUiDslPackage();

} //SimUiDslFactory

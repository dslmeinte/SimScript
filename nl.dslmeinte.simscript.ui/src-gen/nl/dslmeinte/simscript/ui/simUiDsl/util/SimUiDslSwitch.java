/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.util;

import nl.dslmeinte.simscript.ui.simUiDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage
 * @generated
 */
public class SimUiDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SimUiDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimUiDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SimUiDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SimUiDslPackage.UI_MODULE:
      {
        UiModule uiModule = (UiModule)theEObject;
        T result = caseUiModule(uiModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.TOP_LEVEL_DEFINITION:
      {
        TopLevelDefinition topLevelDefinition = (TopLevelDefinition)theEObject;
        T result = caseTopLevelDefinition(topLevelDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.TABLE_ROWS_DEFINITION:
      {
        TableRowsDefinition tableRowsDefinition = (TableRowsDefinition)theEObject;
        T result = caseTableRowsDefinition(tableRowsDefinition);
        if (result == null) result = caseTopLevelDefinition(tableRowsDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.VIEWABLE:
      {
        Viewable viewable = (Viewable)theEObject;
        T result = caseViewable(viewable);
        if (result == null) result = caseTopLevelDefinition(viewable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.DEFINED_VIEWABLE:
      {
        DefinedViewable definedViewable = (DefinedViewable)theEObject;
        T result = caseDefinedViewable(definedViewable);
        if (result == null) result = caseViewable(definedViewable);
        if (result == null) result = caseTopLevelDefinition(definedViewable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.MANUAL_VIEWABLE:
      {
        ManualViewable manualViewable = (ManualViewable)theEObject;
        T result = caseManualViewable(manualViewable);
        if (result == null) result = caseViewable(manualViewable);
        if (result == null) result = caseTopLevelDefinition(manualViewable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.LOCAL_VIEWABLE_DEFINITION:
      {
        LocalViewableDefinition localViewableDefinition = (LocalViewableDefinition)theEObject;
        T result = caseLocalViewableDefinition(localViewableDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.VALUES_BLOCK:
      {
        ValuesBlock valuesBlock = (ValuesBlock)theEObject;
        T result = caseValuesBlock(valuesBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.VALUE_DECLARATION:
      {
        ValueDeclaration valueDeclaration = (ValueDeclaration)theEObject;
        T result = caseValueDeclaration(valueDeclaration);
        if (result == null) result = caseAbstractValueDeclaration(valueDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = caseReferable(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION:
      {
        AbstractValueDeclaration abstractValueDeclaration = (AbstractValueDeclaration)theEObject;
        T result = caseAbstractValueDeclaration(abstractValueDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseReferable(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.PARAMETER_LIST:
      {
        ParameterList parameterList = (ParameterList)theEObject;
        T result = caseParameterList(parameterList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.METHOD_DEFINITION:
      {
        MethodDefinition methodDefinition = (MethodDefinition)theEObject;
        T result = caseMethodDefinition(methodDefinition);
        if (result == null) result = caseTopLevelDefinition(methodDefinition);
        if (result == null) result = caseLocalViewableDefinition(methodDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.METHOD:
      {
        Method method = (Method)theEObject;
        T result = caseMethod(method);
        if (result == null) result = caseReferable(method);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = caseLocalViewableDefinition(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.QUOTATION:
      {
        Quotation quotation = (Quotation)theEObject;
        T result = caseQuotation(quotation);
        if (result == null) result = caseElement(quotation);
        if (result == null) result = caseLocalViewableDefinition(quotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.BINDING:
      {
        Binding binding = (Binding)theEObject;
        T result = caseBinding(binding);
        if (result == null) result = caseElement(binding);
        if (result == null) result = caseLocalViewableDefinition(binding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.ELEMENT_BODY:
      {
        ElementBody elementBody = (ElementBody)theEObject;
        T result = caseElementBody(elementBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.COMPONENT_INVOCATION:
      {
        ComponentInvocation componentInvocation = (ComponentInvocation)theEObject;
        T result = caseComponentInvocation(componentInvocation);
        if (result == null) result = caseElement(componentInvocation);
        if (result == null) result = caseViewableCallSite(componentInvocation);
        if (result == null) result = caseLocalViewableDefinition(componentInvocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.ARGUMENT:
      {
        Argument argument = (Argument)theEObject;
        T result = caseArgument(argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.ARGUMENT_LIST:
      {
        ArgumentList argumentList = (ArgumentList)theEObject;
        T result = caseArgumentList(argumentList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.INPUT_ELEMENT:
      {
        InputElement inputElement = (InputElement)theEObject;
        T result = caseInputElement(inputElement);
        if (result == null) result = caseElement(inputElement);
        if (result == null) result = caseLocalViewableDefinition(inputElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.RADIO_OPTION:
      {
        RadioOption radioOption = (RadioOption)theEObject;
        T result = caseRadioOption(radioOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.STRUCTURE_OPTION:
      {
        StructureOption structureOption = (StructureOption)theEObject;
        T result = caseStructureOption(structureOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.BUTTON_ELEMENT:
      {
        ButtonElement buttonElement = (ButtonElement)theEObject;
        T result = caseButtonElement(buttonElement);
        if (result == null) result = caseElement(buttonElement);
        if (result == null) result = caseLocalViewableDefinition(buttonElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.BLOCK_ELEMENT:
      {
        BlockElement blockElement = (BlockElement)theEObject;
        T result = caseBlockElement(blockElement);
        if (result == null) result = caseElement(blockElement);
        if (result == null) result = caseLocalViewableDefinition(blockElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.LIST_ELEMENT:
      {
        ListElement listElement = (ListElement)theEObject;
        T result = caseListElement(listElement);
        if (result == null) result = caseElement(listElement);
        if (result == null) result = caseLocalViewableDefinition(listElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.LIST_VARIABLE:
      {
        ListVariable listVariable = (ListVariable)theEObject;
        T result = caseListVariable(listVariable);
        if (result == null) result = caseReferable(listVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.TABLE_ELEMENT:
      {
        TableElement tableElement = (TableElement)theEObject;
        T result = caseTableElement(tableElement);
        if (result == null) result = caseElement(tableElement);
        if (result == null) result = caseLocalViewableDefinition(tableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.TABLE_BODY_ELEMENT:
      {
        TableBodyElement tableBodyElement = (TableBodyElement)theEObject;
        T result = caseTableBodyElement(tableBodyElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.TABLE_ROWS_INVOCATION:
      {
        TableRowsInvocation tableRowsInvocation = (TableRowsInvocation)theEObject;
        T result = caseTableRowsInvocation(tableRowsInvocation);
        if (result == null) result = caseTableBodyElement(tableRowsInvocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.TABLE_ROW:
      {
        TableRow tableRow = (TableRow)theEObject;
        T result = caseTableRow(tableRow);
        if (result == null) result = caseTableBodyElement(tableRow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.LABELED_TABLE_ELEMENT:
      {
        LabeledTableElement labeledTableElement = (LabeledTableElement)theEObject;
        T result = caseLabeledTableElement(labeledTableElement);
        if (result == null) result = caseElement(labeledTableElement);
        if (result == null) result = caseLocalViewableDefinition(labeledTableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.LABELED_TABLE_ROW:
      {
        LabeledTableRow labeledTableRow = (LabeledTableRow)theEObject;
        T result = caseLabeledTableRow(labeledTableRow);
        if (result == null) result = caseElement(labeledTableRow);
        if (result == null) result = caseLocalViewableDefinition(labeledTableRow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.PROGRESS_BAR_TAB_SET:
      {
        ProgressBarTabSet progressBarTabSet = (ProgressBarTabSet)theEObject;
        T result = caseProgressBarTabSet(progressBarTabSet);
        if (result == null) result = caseElement(progressBarTabSet);
        if (result == null) result = caseLocalViewableDefinition(progressBarTabSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.TAB_DECLARATION:
      {
        TabDeclaration tabDeclaration = (TabDeclaration)theEObject;
        T result = caseTabDeclaration(tabDeclaration);
        if (result == null) result = caseViewableCallSite(tabDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.GROUP_ELEMENT:
      {
        GroupElement groupElement = (GroupElement)theEObject;
        T result = caseGroupElement(groupElement);
        if (result == null) result = caseElement(groupElement);
        if (result == null) result = caseLocalViewableDefinition(groupElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.COUNTDOWN_TIMER:
      {
        CountdownTimer countdownTimer = (CountdownTimer)theEObject;
        T result = caseCountdownTimer(countdownTimer);
        if (result == null) result = caseElement(countdownTimer);
        if (result == null) result = caseLocalViewableDefinition(countdownTimer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.OBSERVE_ELEMENT:
      {
        ObserveElement observeElement = (ObserveElement)theEObject;
        T result = caseObserveElement(observeElement);
        if (result == null) result = caseElement(observeElement);
        if (result == null) result = caseLocalViewableDefinition(observeElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.CALENDAR_ELEMENT:
      {
        CalendarElement calendarElement = (CalendarElement)theEObject;
        T result = caseCalendarElement(calendarElement);
        if (result == null) result = caseElement(calendarElement);
        if (result == null) result = caseLocalViewableDefinition(calendarElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT:
      {
        TimeSlotListElement timeSlotListElement = (TimeSlotListElement)theEObject;
        T result = caseTimeSlotListElement(timeSlotListElement);
        if (result == null) result = caseElement(timeSlotListElement);
        if (result == null) result = caseLocalViewableDefinition(timeSlotListElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.SLOT_ADD_ELEMENT:
      {
        SlotAddElement slotAddElement = (SlotAddElement)theEObject;
        T result = caseSlotAddElement(slotAddElement);
        if (result == null) result = caseElement(slotAddElement);
        if (result == null) result = caseLocalViewableDefinition(slotAddElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.WHEN_ELEMENT:
      {
        WhenElement whenElement = (WhenElement)theEObject;
        T result = caseWhenElement(whenElement);
        if (result == null) result = caseElement(whenElement);
        if (result == null) result = caseLocalViewableDefinition(whenElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.IMAGE_ELEMENT:
      {
        ImageElement imageElement = (ImageElement)theEObject;
        T result = caseImageElement(imageElement);
        if (result == null) result = caseElement(imageElement);
        if (result == null) result = caseLocalViewableDefinition(imageElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.FRAME_ELEMENT:
      {
        FrameElement frameElement = (FrameElement)theEObject;
        T result = caseFrameElement(frameElement);
        if (result == null) result = caseElement(frameElement);
        if (result == null) result = caseLocalViewableDefinition(frameElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.LINE_BREAK_ELEMENT:
      {
        LineBreakElement lineBreakElement = (LineBreakElement)theEObject;
        T result = caseLineBreakElement(lineBreakElement);
        if (result == null) result = caseElement(lineBreakElement);
        if (result == null) result = caseLocalViewableDefinition(lineBreakElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.STATEMENT_BLOCK:
      {
        StatementBlock statementBlock = (StatementBlock)theEObject;
        T result = caseStatementBlock(statementBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.EXITING_STATEMENT:
      {
        ExitingStatement exitingStatement = (ExitingStatement)theEObject;
        T result = caseExitingStatement(exitingStatement);
        if (result == null) result = caseStatement(exitingStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.NON_EXITING_STATEMENT:
      {
        NonExitingStatement nonExitingStatement = (NonExitingStatement)theEObject;
        T result = caseNonExitingStatement(nonExitingStatement);
        if (result == null) result = caseStatement(nonExitingStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.FOR_STATEMENT:
      {
        ForStatement forStatement = (ForStatement)theEObject;
        T result = caseForStatement(forStatement);
        if (result == null) result = caseNonExitingStatement(forStatement);
        if (result == null) result = caseStatement(forStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.LIST_REMOVE_STATEMENT:
      {
        ListRemoveStatement listRemoveStatement = (ListRemoveStatement)theEObject;
        T result = caseListRemoveStatement(listRemoveStatement);
        if (result == null) result = caseNonExitingStatement(listRemoveStatement);
        if (result == null) result = caseStatement(listRemoveStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.ASSIGNMENT_OR_EXPRESSION_STATEMENT:
      {
        AssignmentOrExpressionStatement assignmentOrExpressionStatement = (AssignmentOrExpressionStatement)theEObject;
        T result = caseAssignmentOrExpressionStatement(assignmentOrExpressionStatement);
        if (result == null) result = caseNonExitingStatement(assignmentOrExpressionStatement);
        if (result == null) result = caseStatement(assignmentOrExpressionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.SHOW_MODAL_STATEMENT:
      {
        ShowModalStatement showModalStatement = (ShowModalStatement)theEObject;
        T result = caseShowModalStatement(showModalStatement);
        if (result == null) result = caseNonExitingStatement(showModalStatement);
        if (result == null) result = caseViewableCallSite(showModalStatement);
        if (result == null) result = caseStatement(showModalStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.EXIT_MODAL_STATEMENT:
      {
        ExitModalStatement exitModalStatement = (ExitModalStatement)theEObject;
        T result = caseExitModalStatement(exitModalStatement);
        if (result == null) result = caseNonExitingStatement(exitModalStatement);
        if (result == null) result = caseStatement(exitModalStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.GOTO_SCREEN_STATEMENT:
      {
        GotoScreenStatement gotoScreenStatement = (GotoScreenStatement)theEObject;
        T result = caseGotoScreenStatement(gotoScreenStatement);
        if (result == null) result = caseExitingStatement(gotoScreenStatement);
        if (result == null) result = caseViewableCallSite(gotoScreenStatement);
        if (result == null) result = caseStatement(gotoScreenStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.GOTO_MODULE_STATEMENT:
      {
        GotoModuleStatement gotoModuleStatement = (GotoModuleStatement)theEObject;
        T result = caseGotoModuleStatement(gotoModuleStatement);
        if (result == null) result = caseExitingStatement(gotoModuleStatement);
        if (result == null) result = caseStatement(gotoModuleStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.PRINCIPAL_ARGUMENT:
      {
        PrincipalArgument principalArgument = (PrincipalArgument)theEObject;
        T result = casePrincipalArgument(principalArgument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.CREDENTIAL_ARGUMENT:
      {
        CredentialArgument credentialArgument = (CredentialArgument)theEObject;
        T result = caseCredentialArgument(credentialArgument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.IF_STATEMENT:
      {
        IfStatement ifStatement = (IfStatement)theEObject;
        T result = caseIfStatement(ifStatement);
        if (result == null) result = caseNonExitingStatement(ifStatement);
        if (result == null) result = caseStatement(ifStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.LOCAL_VALUE_DECLARATION_STATEMENT:
      {
        LocalValueDeclarationStatement localValueDeclarationStatement = (LocalValueDeclarationStatement)theEObject;
        T result = caseLocalValueDeclarationStatement(localValueDeclarationStatement);
        if (result == null) result = caseAbstractValueDeclaration(localValueDeclarationStatement);
        if (result == null) result = caseNonExitingStatement(localValueDeclarationStatement);
        if (result == null) result = caseStatement(localValueDeclarationStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.VIEWABLE_CALL_SITE:
      {
        ViewableCallSite viewableCallSite = (ViewableCallSite)theEObject;
        T result = caseViewableCallSite(viewableCallSite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.SERVICE_IDENTIFICATION:
      {
        ServiceIdentification serviceIdentification = (ServiceIdentification)theEObject;
        T result = caseServiceIdentification(serviceIdentification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.DATE_EXPRESSION:
      {
        DateExpression dateExpression = (DateExpression)theEObject;
        T result = caseDateExpression(dateExpression);
        if (result == null) result = caseExpression(dateExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION:
      {
        BuiltinFunctionExpression builtinFunctionExpression = (BuiltinFunctionExpression)theEObject;
        T result = caseBuiltinFunctionExpression(builtinFunctionExpression);
        if (result == null) result = caseExpression(builtinFunctionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.LITERAL_EXPRESSION:
      {
        LiteralExpression literalExpression = (LiteralExpression)theEObject;
        T result = caseLiteralExpression(literalExpression);
        if (result == null) result = caseExpression(literalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.LIST_LITERAL_EXPRESSION:
      {
        ListLiteralExpression listLiteralExpression = (ListLiteralExpression)theEObject;
        T result = caseListLiteralExpression(listLiteralExpression);
        if (result == null) result = caseLiteralExpression(listLiteralExpression);
        if (result == null) result = caseExpression(listLiteralExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.ENUMERATION_LITERAL_EXPRESSION:
      {
        EnumerationLiteralExpression enumerationLiteralExpression = (EnumerationLiteralExpression)theEObject;
        T result = caseEnumerationLiteralExpression(enumerationLiteralExpression);
        if (result == null) result = caseLiteralExpression(enumerationLiteralExpression);
        if (result == null) result = caseExpression(enumerationLiteralExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.DECISION_EXPRESSION:
      {
        DecisionExpression decisionExpression = (DecisionExpression)theEObject;
        T result = caseDecisionExpression(decisionExpression);
        if (result == null) result = caseLiteralExpression(decisionExpression);
        if (result == null) result = caseExpression(decisionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.DECISION_CASE:
      {
        DecisionCase decisionCase = (DecisionCase)theEObject;
        T result = caseDecisionCase(decisionCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.CALLBACK_EXPRESSIONS:
      {
        CallbackExpressions callbackExpressions = (CallbackExpressions)theEObject;
        T result = caseCallbackExpressions(callbackExpressions);
        if (result == null) result = caseExpression(callbackExpressions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.CALLBACK_EXPRESSION:
      {
        CallbackExpression callbackExpression = (CallbackExpression)theEObject;
        T result = caseCallbackExpression(callbackExpression);
        if (result == null) result = caseCallbackExpressions(callbackExpression);
        if (result == null) result = caseExpression(callbackExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.STRUCTURE_CREATION_EXPRESSION:
      {
        StructureCreationExpression structureCreationExpression = (StructureCreationExpression)theEObject;
        T result = caseStructureCreationExpression(structureCreationExpression);
        if (result == null) result = caseExpression(structureCreationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.FEATURE_ASSIGNMENT:
      {
        FeatureAssignment featureAssignment = (FeatureAssignment)theEObject;
        T result = caseFeatureAssignment(featureAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.VALUE_REFERENCE_OR_METHOD_CALL_EXPRESSION:
      {
        ValueReferenceOrMethodCallExpression valueReferenceOrMethodCallExpression = (ValueReferenceOrMethodCallExpression)theEObject;
        T result = caseValueReferenceOrMethodCallExpression(valueReferenceOrMethodCallExpression);
        if (result == null) result = caseExpression(valueReferenceOrMethodCallExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.REFERENCE_EXPRESSION:
      {
        ReferenceExpression referenceExpression = (ReferenceExpression)theEObject;
        T result = caseReferenceExpression(referenceExpression);
        if (result == null) result = caseValueReferenceOrMethodCallExpression(referenceExpression);
        if (result == null) result = caseExpression(referenceExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.REFERABLE:
      {
        Referable referable = (Referable)theEObject;
        T result = caseReferable(referable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.TERNARY_EXPRESSION:
      {
        TernaryExpression ternaryExpression = (TernaryExpression)theEObject;
        T result = caseTernaryExpression(ternaryExpression);
        if (result == null) result = caseExpression(ternaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.OR_EXPRESSION:
      {
        OrExpression orExpression = (OrExpression)theEObject;
        T result = caseOrExpression(orExpression);
        if (result == null) result = caseBooleanBinaryOperatorExpression(orExpression);
        if (result == null) result = caseBinaryOperatorExpression(orExpression);
        if (result == null) result = caseExpression(orExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.AND_EXPRESSION:
      {
        AndExpression andExpression = (AndExpression)theEObject;
        T result = caseAndExpression(andExpression);
        if (result == null) result = caseBooleanBinaryOperatorExpression(andExpression);
        if (result == null) result = caseBinaryOperatorExpression(andExpression);
        if (result == null) result = caseExpression(andExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.COMPARISON_EXPRESSION:
      {
        ComparisonExpression comparisonExpression = (ComparisonExpression)theEObject;
        T result = caseComparisonExpression(comparisonExpression);
        if (result == null) result = caseBinaryOperatorExpression(comparisonExpression);
        if (result == null) result = caseExpression(comparisonExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.ADDITIVE_EXPRESSION:
      {
        AdditiveExpression additiveExpression = (AdditiveExpression)theEObject;
        T result = caseAdditiveExpression(additiveExpression);
        if (result == null) result = caseArithmeticBinaryOperatorExpression(additiveExpression);
        if (result == null) result = caseBinaryOperatorExpression(additiveExpression);
        if (result == null) result = caseExpression(additiveExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.MULTIPLICATIVE_EXPRESSION:
      {
        MultiplicativeExpression multiplicativeExpression = (MultiplicativeExpression)theEObject;
        T result = caseMultiplicativeExpression(multiplicativeExpression);
        if (result == null) result = caseArithmeticBinaryOperatorExpression(multiplicativeExpression);
        if (result == null) result = caseBinaryOperatorExpression(multiplicativeExpression);
        if (result == null) result = caseExpression(multiplicativeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.NOT_EXPRESSION:
      {
        NotExpression notExpression = (NotExpression)theEObject;
        T result = caseNotExpression(notExpression);
        if (result == null) result = caseExpression(notExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION:
      {
        InterfaceCallExpression interfaceCallExpression = (InterfaceCallExpression)theEObject;
        T result = caseInterfaceCallExpression(interfaceCallExpression);
        if (result == null) result = caseExpression(interfaceCallExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.NAMED_SERVICE_REFERENCE:
      {
        NamedServiceReference namedServiceReference = (NamedServiceReference)theEObject;
        T result = caseNamedServiceReference(namedServiceReference);
        if (result == null) result = caseServiceIdentification(namedServiceReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.CRUD_SERVICE_IDENTIFICATION:
      {
        CrudServiceIdentification crudServiceIdentification = (CrudServiceIdentification)theEObject;
        T result = caseCrudServiceIdentification(crudServiceIdentification);
        if (result == null) result = caseServiceIdentification(crudServiceIdentification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.FEATURE_ACCESS_EXPRESSION:
      {
        FeatureAccessExpression featureAccessExpression = (FeatureAccessExpression)theEObject;
        T result = caseFeatureAccessExpression(featureAccessExpression);
        if (result == null) result = caseExpression(featureAccessExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.SELECTION_EXPRESSION:
      {
        SelectionExpression selectionExpression = (SelectionExpression)theEObject;
        T result = caseSelectionExpression(selectionExpression);
        if (result == null) result = caseExpression(selectionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.DATE_NOW_EXPRESSION:
      {
        DateNowExpression dateNowExpression = (DateNowExpression)theEObject;
        T result = caseDateNowExpression(dateNowExpression);
        if (result == null) result = caseDateExpression(dateNowExpression);
        if (result == null) result = caseExpression(dateNowExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.DATE_TODAY_EXPRESSION:
      {
        DateTodayExpression dateTodayExpression = (DateTodayExpression)theEObject;
        T result = caseDateTodayExpression(dateTodayExpression);
        if (result == null) result = caseDateExpression(dateTodayExpression);
        if (result == null) result = caseExpression(dateTodayExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.STRING_LITERAL_EXPRESSION:
      {
        StringLiteralExpression stringLiteralExpression = (StringLiteralExpression)theEObject;
        T result = caseStringLiteralExpression(stringLiteralExpression);
        if (result == null) result = caseLiteralExpression(stringLiteralExpression);
        if (result == null) result = caseExpression(stringLiteralExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.BOOLEAN_LITERAL_EXPRESSION:
      {
        BooleanLiteralExpression booleanLiteralExpression = (BooleanLiteralExpression)theEObject;
        T result = caseBooleanLiteralExpression(booleanLiteralExpression);
        if (result == null) result = caseLiteralExpression(booleanLiteralExpression);
        if (result == null) result = caseExpression(booleanLiteralExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.INTEGER_LITERAL_EXPRESSION:
      {
        IntegerLiteralExpression integerLiteralExpression = (IntegerLiteralExpression)theEObject;
        T result = caseIntegerLiteralExpression(integerLiteralExpression);
        if (result == null) result = caseLiteralExpression(integerLiteralExpression);
        if (result == null) result = caseExpression(integerLiteralExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.NUMBER_LITERAL_EXPRESSION:
      {
        NumberLiteralExpression numberLiteralExpression = (NumberLiteralExpression)theEObject;
        T result = caseNumberLiteralExpression(numberLiteralExpression);
        if (result == null) result = caseLiteralExpression(numberLiteralExpression);
        if (result == null) result = caseExpression(numberLiteralExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.CALLBACK_RESPONSE_EXPRESSION:
      {
        CallbackResponseExpression callbackResponseExpression = (CallbackResponseExpression)theEObject;
        T result = caseCallbackResponseExpression(callbackResponseExpression);
        if (result == null) result = caseCallbackExpressions(callbackResponseExpression);
        if (result == null) result = caseExpression(callbackResponseExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.CALLBACK_ERROR_RESPONSE_EXPRESSION:
      {
        CallbackErrorResponseExpression callbackErrorResponseExpression = (CallbackErrorResponseExpression)theEObject;
        T result = caseCallbackErrorResponseExpression(callbackErrorResponseExpression);
        if (result == null) result = caseCallbackExpressions(callbackErrorResponseExpression);
        if (result == null) result = caseExpression(callbackErrorResponseExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.METHOD_CALL_EXPRESSION:
      {
        MethodCallExpression methodCallExpression = (MethodCallExpression)theEObject;
        T result = caseMethodCallExpression(methodCallExpression);
        if (result == null) result = caseValueReferenceOrMethodCallExpression(methodCallExpression);
        if (result == null) result = caseExpression(methodCallExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.BOOLEAN_BINARY_OPERATOR_EXPRESSION:
      {
        BooleanBinaryOperatorExpression booleanBinaryOperatorExpression = (BooleanBinaryOperatorExpression)theEObject;
        T result = caseBooleanBinaryOperatorExpression(booleanBinaryOperatorExpression);
        if (result == null) result = caseBinaryOperatorExpression(booleanBinaryOperatorExpression);
        if (result == null) result = caseExpression(booleanBinaryOperatorExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.ARITHMETIC_BINARY_OPERATOR_EXPRESSION:
      {
        ArithmeticBinaryOperatorExpression arithmeticBinaryOperatorExpression = (ArithmeticBinaryOperatorExpression)theEObject;
        T result = caseArithmeticBinaryOperatorExpression(arithmeticBinaryOperatorExpression);
        if (result == null) result = caseBinaryOperatorExpression(arithmeticBinaryOperatorExpression);
        if (result == null) result = caseExpression(arithmeticBinaryOperatorExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SimUiDslPackage.BINARY_OPERATOR_EXPRESSION:
      {
        BinaryOperatorExpression binaryOperatorExpression = (BinaryOperatorExpression)theEObject;
        T result = caseBinaryOperatorExpression(binaryOperatorExpression);
        if (result == null) result = caseExpression(binaryOperatorExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ui Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ui Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUiModule(UiModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelDefinition(TopLevelDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Rows Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Rows Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableRowsDefinition(TableRowsDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Viewable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Viewable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewable(Viewable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Defined Viewable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Defined Viewable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinedViewable(DefinedViewable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Manual Viewable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Manual Viewable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseManualViewable(ManualViewable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Viewable Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Viewable Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalViewableDefinition(LocalViewableDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Values Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Values Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValuesBlock(ValuesBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueDeclaration(ValueDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Value Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Value Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractValueDeclaration(AbstractValueDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterList(ParameterList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodDefinition(MethodDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod(Method object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuotation(Quotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinding(Binding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementBody(ElementBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Invocation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Invocation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentInvocation(ComponentInvocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgument(Argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgumentList(ArgumentList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputElement(InputElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Radio Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Radio Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRadioOption(RadioOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructureOption(StructureOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButtonElement(ButtonElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockElement(BlockElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListElement(ListElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListVariable(ListVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableElement(TableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Body Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Body Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableBodyElement(TableBodyElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Rows Invocation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Rows Invocation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableRowsInvocation(TableRowsInvocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTableRow(TableRow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Labeled Table Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Labeled Table Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabeledTableElement(LabeledTableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Labeled Table Row</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Labeled Table Row</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabeledTableRow(LabeledTableRow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Progress Bar Tab Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Progress Bar Tab Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgressBarTabSet(ProgressBarTabSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tab Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tab Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabDeclaration(TabDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupElement(GroupElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Countdown Timer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Countdown Timer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCountdownTimer(CountdownTimer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Observe Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observe Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObserveElement(ObserveElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Calendar Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Calendar Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCalendarElement(CalendarElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Slot List Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Slot List Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeSlotListElement(TimeSlotListElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Slot Add Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Slot Add Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSlotAddElement(SlotAddElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenElement(WhenElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageElement(ImageElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Frame Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Frame Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFrameElement(FrameElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line Break Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Break Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineBreakElement(LineBreakElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatementBlock(StatementBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exiting Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exiting Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExitingStatement(ExitingStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Non Exiting Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Non Exiting Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNonExitingStatement(NonExitingStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForStatement(ForStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Remove Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Remove Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListRemoveStatement(ListRemoveStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment Or Expression Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment Or Expression Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignmentOrExpressionStatement(AssignmentOrExpressionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Show Modal Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Show Modal Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseShowModalStatement(ShowModalStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exit Modal Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exit Modal Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExitModalStatement(ExitModalStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goto Screen Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goto Screen Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGotoScreenStatement(GotoScreenStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goto Module Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goto Module Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGotoModuleStatement(GotoModuleStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Principal Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Principal Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrincipalArgument(PrincipalArgument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Credential Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Credential Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCredentialArgument(CredentialArgument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStatement(IfStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Value Declaration Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Value Declaration Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalValueDeclarationStatement(LocalValueDeclarationStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Viewable Call Site</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Viewable Call Site</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewableCallSite(ViewableCallSite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Identification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Identification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceIdentification(ServiceIdentification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDateExpression(DateExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Builtin Function Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Builtin Function Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuiltinFunctionExpression(BuiltinFunctionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralExpression(LiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListLiteralExpression(ListLiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumerationLiteralExpression(EnumerationLiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decision Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decision Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecisionExpression(DecisionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decision Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decision Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecisionCase(DecisionCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Callback Expressions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Callback Expressions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallbackExpressions(CallbackExpressions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Callback Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Callback Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallbackExpression(CallbackExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure Creation Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure Creation Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructureCreationExpression(StructureCreationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureAssignment(FeatureAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Reference Or Method Call Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Reference Or Method Call Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueReferenceOrMethodCallExpression(ValueReferenceOrMethodCallExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceExpression(ReferenceExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Referable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferable(Referable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ternary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ternary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTernaryExpression(TernaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpression(OrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpression(AndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparisonExpression(ComparisonExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditiveExpression(AdditiveExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicativeExpression(MultiplicativeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotExpression(NotExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Call Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Call Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceCallExpression(InterfaceCallExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Service Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Service Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedServiceReference(NamedServiceReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Crud Service Identification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Crud Service Identification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCrudServiceIdentification(CrudServiceIdentification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Access Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Access Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureAccessExpression(FeatureAccessExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectionExpression(SelectionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Now Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Now Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDateNowExpression(DateNowExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Today Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Today Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDateTodayExpression(DateTodayExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteralExpression(StringLiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteralExpression(BooleanLiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerLiteralExpression(IntegerLiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberLiteralExpression(NumberLiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Callback Response Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Callback Response Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallbackResponseExpression(CallbackResponseExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Callback Error Response Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Callback Error Response Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallbackErrorResponseExpression(CallbackErrorResponseExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Call Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Call Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodCallExpression(MethodCallExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Binary Operator Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Binary Operator Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanBinaryOperatorExpression(BooleanBinaryOperatorExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Binary Operator Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Binary Operator Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticBinaryOperatorExpression(ArithmeticBinaryOperatorExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Operator Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Operator Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinaryOperatorExpression(BinaryOperatorExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SimUiDslSwitch

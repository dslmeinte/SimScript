/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.util;

import nl.dslmeinte.simscript.ui.simUiDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage
 * @generated
 */
public class SimUiDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SimUiDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimUiDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SimUiDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimUiDslSwitch<Adapter> modelSwitch =
    new SimUiDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseUiModule(UiModule object)
      {
        return createUiModuleAdapter();
      }
      @Override
      public Adapter caseTopLevelDefinition(TopLevelDefinition object)
      {
        return createTopLevelDefinitionAdapter();
      }
      @Override
      public Adapter caseTableRowsDefinition(TableRowsDefinition object)
      {
        return createTableRowsDefinitionAdapter();
      }
      @Override
      public Adapter caseViewable(Viewable object)
      {
        return createViewableAdapter();
      }
      @Override
      public Adapter caseDefinedViewable(DefinedViewable object)
      {
        return createDefinedViewableAdapter();
      }
      @Override
      public Adapter caseManualViewable(ManualViewable object)
      {
        return createManualViewableAdapter();
      }
      @Override
      public Adapter caseLocalViewableDefinition(LocalViewableDefinition object)
      {
        return createLocalViewableDefinitionAdapter();
      }
      @Override
      public Adapter caseValuesBlock(ValuesBlock object)
      {
        return createValuesBlockAdapter();
      }
      @Override
      public Adapter caseValueDeclaration(ValueDeclaration object)
      {
        return createValueDeclarationAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseAbstractValueDeclaration(AbstractValueDeclaration object)
      {
        return createAbstractValueDeclarationAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseParameterList(ParameterList object)
      {
        return createParameterListAdapter();
      }
      @Override
      public Adapter caseMethodDefinition(MethodDefinition object)
      {
        return createMethodDefinitionAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseQuotation(Quotation object)
      {
        return createQuotationAdapter();
      }
      @Override
      public Adapter caseBinding(Binding object)
      {
        return createBindingAdapter();
      }
      @Override
      public Adapter caseElementBody(ElementBody object)
      {
        return createElementBodyAdapter();
      }
      @Override
      public Adapter caseComponentInvocation(ComponentInvocation object)
      {
        return createComponentInvocationAdapter();
      }
      @Override
      public Adapter caseArgument(Argument object)
      {
        return createArgumentAdapter();
      }
      @Override
      public Adapter caseArgumentList(ArgumentList object)
      {
        return createArgumentListAdapter();
      }
      @Override
      public Adapter caseInputElement(InputElement object)
      {
        return createInputElementAdapter();
      }
      @Override
      public Adapter caseRadioOption(RadioOption object)
      {
        return createRadioOptionAdapter();
      }
      @Override
      public Adapter caseStructureOption(StructureOption object)
      {
        return createStructureOptionAdapter();
      }
      @Override
      public Adapter caseButtonElement(ButtonElement object)
      {
        return createButtonElementAdapter();
      }
      @Override
      public Adapter caseBlockElement(BlockElement object)
      {
        return createBlockElementAdapter();
      }
      @Override
      public Adapter caseListElement(ListElement object)
      {
        return createListElementAdapter();
      }
      @Override
      public Adapter caseListVariable(ListVariable object)
      {
        return createListVariableAdapter();
      }
      @Override
      public Adapter caseTableElement(TableElement object)
      {
        return createTableElementAdapter();
      }
      @Override
      public Adapter caseTableBodyElement(TableBodyElement object)
      {
        return createTableBodyElementAdapter();
      }
      @Override
      public Adapter caseTableRowsInvocation(TableRowsInvocation object)
      {
        return createTableRowsInvocationAdapter();
      }
      @Override
      public Adapter caseTableRow(TableRow object)
      {
        return createTableRowAdapter();
      }
      @Override
      public Adapter caseLabeledTableElement(LabeledTableElement object)
      {
        return createLabeledTableElementAdapter();
      }
      @Override
      public Adapter caseLabeledTableRow(LabeledTableRow object)
      {
        return createLabeledTableRowAdapter();
      }
      @Override
      public Adapter caseProgressBarTabSet(ProgressBarTabSet object)
      {
        return createProgressBarTabSetAdapter();
      }
      @Override
      public Adapter caseTabDeclaration(TabDeclaration object)
      {
        return createTabDeclarationAdapter();
      }
      @Override
      public Adapter caseGroupElement(GroupElement object)
      {
        return createGroupElementAdapter();
      }
      @Override
      public Adapter caseCountdownTimer(CountdownTimer object)
      {
        return createCountdownTimerAdapter();
      }
      @Override
      public Adapter caseObserveElement(ObserveElement object)
      {
        return createObserveElementAdapter();
      }
      @Override
      public Adapter caseCalendarElement(CalendarElement object)
      {
        return createCalendarElementAdapter();
      }
      @Override
      public Adapter caseTimeSlotListElement(TimeSlotListElement object)
      {
        return createTimeSlotListElementAdapter();
      }
      @Override
      public Adapter caseSlotAddElement(SlotAddElement object)
      {
        return createSlotAddElementAdapter();
      }
      @Override
      public Adapter caseWhenElement(WhenElement object)
      {
        return createWhenElementAdapter();
      }
      @Override
      public Adapter caseImageElement(ImageElement object)
      {
        return createImageElementAdapter();
      }
      @Override
      public Adapter caseFrameElement(FrameElement object)
      {
        return createFrameElementAdapter();
      }
      @Override
      public Adapter caseLineBreakElement(LineBreakElement object)
      {
        return createLineBreakElementAdapter();
      }
      @Override
      public Adapter caseStatementBlock(StatementBlock object)
      {
        return createStatementBlockAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseExitingStatement(ExitingStatement object)
      {
        return createExitingStatementAdapter();
      }
      @Override
      public Adapter caseNonExitingStatement(NonExitingStatement object)
      {
        return createNonExitingStatementAdapter();
      }
      @Override
      public Adapter caseForStatement(ForStatement object)
      {
        return createForStatementAdapter();
      }
      @Override
      public Adapter caseListRemoveStatement(ListRemoveStatement object)
      {
        return createListRemoveStatementAdapter();
      }
      @Override
      public Adapter caseAssignmentOrExpressionStatement(AssignmentOrExpressionStatement object)
      {
        return createAssignmentOrExpressionStatementAdapter();
      }
      @Override
      public Adapter caseShowModalStatement(ShowModalStatement object)
      {
        return createShowModalStatementAdapter();
      }
      @Override
      public Adapter caseExitModalStatement(ExitModalStatement object)
      {
        return createExitModalStatementAdapter();
      }
      @Override
      public Adapter caseGotoScreenStatement(GotoScreenStatement object)
      {
        return createGotoScreenStatementAdapter();
      }
      @Override
      public Adapter caseGotoModuleStatement(GotoModuleStatement object)
      {
        return createGotoModuleStatementAdapter();
      }
      @Override
      public Adapter casePrincipalArgument(PrincipalArgument object)
      {
        return createPrincipalArgumentAdapter();
      }
      @Override
      public Adapter caseCredentialArgument(CredentialArgument object)
      {
        return createCredentialArgumentAdapter();
      }
      @Override
      public Adapter caseIfStatement(IfStatement object)
      {
        return createIfStatementAdapter();
      }
      @Override
      public Adapter caseLocalValueDeclarationStatement(LocalValueDeclarationStatement object)
      {
        return createLocalValueDeclarationStatementAdapter();
      }
      @Override
      public Adapter caseViewableCallSite(ViewableCallSite object)
      {
        return createViewableCallSiteAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseServiceIdentification(ServiceIdentification object)
      {
        return createServiceIdentificationAdapter();
      }
      @Override
      public Adapter caseDateExpression(DateExpression object)
      {
        return createDateExpressionAdapter();
      }
      @Override
      public Adapter caseBuiltinFunctionExpression(BuiltinFunctionExpression object)
      {
        return createBuiltinFunctionExpressionAdapter();
      }
      @Override
      public Adapter caseLiteralExpression(LiteralExpression object)
      {
        return createLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseListLiteralExpression(ListLiteralExpression object)
      {
        return createListLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseEnumerationLiteralExpression(EnumerationLiteralExpression object)
      {
        return createEnumerationLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseDecisionExpression(DecisionExpression object)
      {
        return createDecisionExpressionAdapter();
      }
      @Override
      public Adapter caseDecisionCase(DecisionCase object)
      {
        return createDecisionCaseAdapter();
      }
      @Override
      public Adapter caseCallbackExpressions(CallbackExpressions object)
      {
        return createCallbackExpressionsAdapter();
      }
      @Override
      public Adapter caseCallbackExpression(CallbackExpression object)
      {
        return createCallbackExpressionAdapter();
      }
      @Override
      public Adapter caseStructureCreationExpression(StructureCreationExpression object)
      {
        return createStructureCreationExpressionAdapter();
      }
      @Override
      public Adapter caseFeatureAssignment(FeatureAssignment object)
      {
        return createFeatureAssignmentAdapter();
      }
      @Override
      public Adapter caseValueReferenceOrMethodCallExpression(ValueReferenceOrMethodCallExpression object)
      {
        return createValueReferenceOrMethodCallExpressionAdapter();
      }
      @Override
      public Adapter caseReferenceExpression(ReferenceExpression object)
      {
        return createReferenceExpressionAdapter();
      }
      @Override
      public Adapter caseReferable(Referable object)
      {
        return createReferableAdapter();
      }
      @Override
      public Adapter caseTernaryExpression(TernaryExpression object)
      {
        return createTernaryExpressionAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object)
      {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseComparisonExpression(ComparisonExpression object)
      {
        return createComparisonExpressionAdapter();
      }
      @Override
      public Adapter caseAdditiveExpression(AdditiveExpression object)
      {
        return createAdditiveExpressionAdapter();
      }
      @Override
      public Adapter caseMultiplicativeExpression(MultiplicativeExpression object)
      {
        return createMultiplicativeExpressionAdapter();
      }
      @Override
      public Adapter caseNotExpression(NotExpression object)
      {
        return createNotExpressionAdapter();
      }
      @Override
      public Adapter caseInterfaceCallExpression(InterfaceCallExpression object)
      {
        return createInterfaceCallExpressionAdapter();
      }
      @Override
      public Adapter caseNamedServiceReference(NamedServiceReference object)
      {
        return createNamedServiceReferenceAdapter();
      }
      @Override
      public Adapter caseCrudServiceIdentification(CrudServiceIdentification object)
      {
        return createCrudServiceIdentificationAdapter();
      }
      @Override
      public Adapter caseFeatureAccessExpression(FeatureAccessExpression object)
      {
        return createFeatureAccessExpressionAdapter();
      }
      @Override
      public Adapter caseSelectionExpression(SelectionExpression object)
      {
        return createSelectionExpressionAdapter();
      }
      @Override
      public Adapter caseDateNowExpression(DateNowExpression object)
      {
        return createDateNowExpressionAdapter();
      }
      @Override
      public Adapter caseDateTodayExpression(DateTodayExpression object)
      {
        return createDateTodayExpressionAdapter();
      }
      @Override
      public Adapter caseStringLiteralExpression(StringLiteralExpression object)
      {
        return createStringLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanLiteralExpression(BooleanLiteralExpression object)
      {
        return createBooleanLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseIntegerLiteralExpression(IntegerLiteralExpression object)
      {
        return createIntegerLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseNumberLiteralExpression(NumberLiteralExpression object)
      {
        return createNumberLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseCallbackResponseExpression(CallbackResponseExpression object)
      {
        return createCallbackResponseExpressionAdapter();
      }
      @Override
      public Adapter caseCallbackErrorResponseExpression(CallbackErrorResponseExpression object)
      {
        return createCallbackErrorResponseExpressionAdapter();
      }
      @Override
      public Adapter caseMethodCallExpression(MethodCallExpression object)
      {
        return createMethodCallExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanBinaryOperatorExpression(BooleanBinaryOperatorExpression object)
      {
        return createBooleanBinaryOperatorExpressionAdapter();
      }
      @Override
      public Adapter caseArithmeticBinaryOperatorExpression(ArithmeticBinaryOperatorExpression object)
      {
        return createArithmeticBinaryOperatorExpressionAdapter();
      }
      @Override
      public Adapter caseBinaryOperatorExpression(BinaryOperatorExpression object)
      {
        return createBinaryOperatorExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.UiModule <em>Ui Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.UiModule
   * @generated
   */
  public Adapter createUiModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TopLevelDefinition <em>Top Level Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TopLevelDefinition
   * @generated
   */
  public Adapter createTopLevelDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRowsDefinition <em>Table Rows Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableRowsDefinition
   * @generated
   */
  public Adapter createTableRowsDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Viewable <em>Viewable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Viewable
   * @generated
   */
  public Adapter createViewableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable <em>Defined Viewable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable
   * @generated
   */
  public Adapter createDefinedViewableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ManualViewable <em>Manual Viewable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ManualViewable
   * @generated
   */
  public Adapter createManualViewableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.LocalViewableDefinition <em>Local Viewable Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.LocalViewableDefinition
   * @generated
   */
  public Adapter createLocalViewableDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ValuesBlock <em>Values Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ValuesBlock
   * @generated
   */
  public Adapter createValuesBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ValueDeclaration <em>Value Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ValueDeclaration
   * @generated
   */
  public Adapter createValueDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration <em>Abstract Value Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration
   * @generated
   */
  public Adapter createAbstractValueDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ParameterList
   * @generated
   */
  public Adapter createParameterListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.MethodDefinition <em>Method Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.MethodDefinition
   * @generated
   */
  public Adapter createMethodDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Quotation <em>Quotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Quotation
   * @generated
   */
  public Adapter createQuotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Binding
   * @generated
   */
  public Adapter createBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ElementBody <em>Element Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ElementBody
   * @generated
   */
  public Adapter createElementBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ComponentInvocation <em>Component Invocation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ComponentInvocation
   * @generated
   */
  public Adapter createComponentInvocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Argument
   * @generated
   */
  public Adapter createArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ArgumentList <em>Argument List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ArgumentList
   * @generated
   */
  public Adapter createArgumentListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement <em>Input Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InputElement
   * @generated
   */
  public Adapter createInputElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.RadioOption <em>Radio Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.RadioOption
   * @generated
   */
  public Adapter createRadioOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.StructureOption <em>Structure Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.StructureOption
   * @generated
   */
  public Adapter createStructureOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement <em>Button Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement
   * @generated
   */
  public Adapter createButtonElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement <em>Block Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BlockElement
   * @generated
   */
  public Adapter createBlockElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListElement <em>List Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListElement
   * @generated
   */
  public Adapter createListElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListVariable <em>List Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListVariable
   * @generated
   */
  public Adapter createListVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableElement <em>Table Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableElement
   * @generated
   */
  public Adapter createTableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableBodyElement <em>Table Body Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableBodyElement
   * @generated
   */
  public Adapter createTableBodyElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation <em>Table Rows Invocation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation
   * @generated
   */
  public Adapter createTableRowsInvocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRow <em>Table Row</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TableRow
   * @generated
   */
  public Adapter createTableRowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableElement <em>Labeled Table Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableElement
   * @generated
   */
  public Adapter createLabeledTableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableRow <em>Labeled Table Row</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableRow
   * @generated
   */
  public Adapter createLabeledTableRowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ProgressBarTabSet <em>Progress Bar Tab Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ProgressBarTabSet
   * @generated
   */
  public Adapter createProgressBarTabSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration <em>Tab Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration
   * @generated
   */
  public Adapter createTabDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.GroupElement <em>Group Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GroupElement
   * @generated
   */
  public Adapter createGroupElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer <em>Countdown Timer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer
   * @generated
   */
  public Adapter createCountdownTimerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ObserveElement <em>Observe Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ObserveElement
   * @generated
   */
  public Adapter createObserveElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement <em>Calendar Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement
   * @generated
   */
  public Adapter createCalendarElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement <em>Time Slot List Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement
   * @generated
   */
  public Adapter createTimeSlotListElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement <em>Slot Add Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement
   * @generated
   */
  public Adapter createSlotAddElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.WhenElement <em>When Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.WhenElement
   * @generated
   */
  public Adapter createWhenElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ImageElement <em>Image Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ImageElement
   * @generated
   */
  public Adapter createImageElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.FrameElement <em>Frame Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.FrameElement
   * @generated
   */
  public Adapter createFrameElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.LineBreakElement <em>Line Break Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.LineBreakElement
   * @generated
   */
  public Adapter createLineBreakElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock <em>Statement Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock
   * @generated
   */
  public Adapter createStatementBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ExitingStatement <em>Exiting Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ExitingStatement
   * @generated
   */
  public Adapter createExitingStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.NonExitingStatement <em>Non Exiting Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.NonExitingStatement
   * @generated
   */
  public Adapter createNonExitingStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ForStatement
   * @generated
   */
  public Adapter createForStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement <em>List Remove Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement
   * @generated
   */
  public Adapter createListRemoveStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement <em>Assignment Or Expression Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement
   * @generated
   */
  public Adapter createAssignmentOrExpressionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ShowModalStatement <em>Show Modal Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ShowModalStatement
   * @generated
   */
  public Adapter createShowModalStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ExitModalStatement <em>Exit Modal Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ExitModalStatement
   * @generated
   */
  public Adapter createExitModalStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoScreenStatement <em>Goto Screen Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GotoScreenStatement
   * @generated
   */
  public Adapter createGotoScreenStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement <em>Goto Module Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement
   * @generated
   */
  public Adapter createGotoModuleStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument <em>Principal Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument
   * @generated
   */
  public Adapter createPrincipalArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CredentialArgument <em>Credential Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CredentialArgument
   * @generated
   */
  public Adapter createCredentialArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.IfStatement
   * @generated
   */
  public Adapter createIfStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.LocalValueDeclarationStatement <em>Local Value Declaration Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.LocalValueDeclarationStatement
   * @generated
   */
  public Adapter createLocalValueDeclarationStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite <em>Viewable Call Site</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite
   * @generated
   */
  public Adapter createViewableCallSiteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ServiceIdentification <em>Service Identification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ServiceIdentification
   * @generated
   */
  public Adapter createServiceIdentificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.DateExpression <em>Date Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DateExpression
   * @generated
   */
  public Adapter createDateExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression <em>Builtin Function Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression
   * @generated
   */
  public Adapter createBuiltinFunctionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.LiteralExpression <em>Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.LiteralExpression
   * @generated
   */
  public Adapter createLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListLiteralExpression <em>List Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ListLiteralExpression
   * @generated
   */
  public Adapter createListLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.EnumerationLiteralExpression <em>Enumeration Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.EnumerationLiteralExpression
   * @generated
   */
  public Adapter createEnumerationLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression <em>Decision Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression
   * @generated
   */
  public Adapter createDecisionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.DecisionCase <em>Decision Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DecisionCase
   * @generated
   */
  public Adapter createDecisionCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpressions <em>Callback Expressions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpressions
   * @generated
   */
  public Adapter createCallbackExpressionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression <em>Callback Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression
   * @generated
   */
  public Adapter createCallbackExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.StructureCreationExpression <em>Structure Creation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.StructureCreationExpression
   * @generated
   */
  public Adapter createStructureCreationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.FeatureAssignment <em>Feature Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.FeatureAssignment
   * @generated
   */
  public Adapter createFeatureAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ValueReferenceOrMethodCallExpression <em>Value Reference Or Method Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ValueReferenceOrMethodCallExpression
   * @generated
   */
  public Adapter createValueReferenceOrMethodCallExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ReferenceExpression <em>Reference Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ReferenceExpression
   * @generated
   */
  public Adapter createReferenceExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.Referable <em>Referable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Referable
   * @generated
   */
  public Adapter createReferableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression <em>Ternary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression
   * @generated
   */
  public Adapter createTernaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ComparisonExpression <em>Comparison Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ComparisonExpression
   * @generated
   */
  public Adapter createComparisonExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AdditiveExpression
   * @generated
   */
  public Adapter createAdditiveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeExpression
   * @generated
   */
  public Adapter createMultiplicativeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.NotExpression <em>Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.NotExpression
   * @generated
   */
  public Adapter createNotExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression <em>Interface Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression
   * @generated
   */
  public Adapter createInterfaceCallExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.NamedServiceReference <em>Named Service Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.NamedServiceReference
   * @generated
   */
  public Adapter createNamedServiceReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CrudServiceIdentification <em>Crud Service Identification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CrudServiceIdentification
   * @generated
   */
  public Adapter createCrudServiceIdentificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression <em>Feature Access Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression
   * @generated
   */
  public Adapter createFeatureAccessExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.SelectionExpression <em>Selection Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SelectionExpression
   * @generated
   */
  public Adapter createSelectionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.DateNowExpression <em>Date Now Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DateNowExpression
   * @generated
   */
  public Adapter createDateNowExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.DateTodayExpression <em>Date Today Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.DateTodayExpression
   * @generated
   */
  public Adapter createDateTodayExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.StringLiteralExpression <em>String Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.StringLiteralExpression
   * @generated
   */
  public Adapter createStringLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiteralExpression <em>Boolean Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiteralExpression
   * @generated
   */
  public Adapter createBooleanLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.IntegerLiteralExpression <em>Integer Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.IntegerLiteralExpression
   * @generated
   */
  public Adapter createIntegerLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.NumberLiteralExpression <em>Number Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.NumberLiteralExpression
   * @generated
   */
  public Adapter createNumberLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CallbackResponseExpression <em>Callback Response Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CallbackResponseExpression
   * @generated
   */
  public Adapter createCallbackResponseExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.CallbackErrorResponseExpression <em>Callback Error Response Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CallbackErrorResponseExpression
   * @generated
   */
  public Adapter createCallbackErrorResponseExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression <em>Method Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression
   * @generated
   */
  public Adapter createMethodCallExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.BooleanBinaryOperatorExpression <em>Boolean Binary Operator Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BooleanBinaryOperatorExpression
   * @generated
   */
  public Adapter createBooleanBinaryOperatorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.ArithmeticBinaryOperatorExpression <em>Arithmetic Binary Operator Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ArithmeticBinaryOperatorExpression
   * @generated
   */
  public Adapter createArithmeticBinaryOperatorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.ui.simUiDsl.BinaryOperatorExpression <em>Binary Operator Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BinaryOperatorExpression
   * @generated
   */
  public Adapter createBinaryOperatorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SimUiDslAdapterFactory

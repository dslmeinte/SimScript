/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage;

import nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage;

import nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration;
import nl.dslmeinte.simscript.ui.simUiDsl.AdditiveExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.AdditiveOperators;
import nl.dslmeinte.simscript.ui.simUiDsl.AndExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.Argument;
import nl.dslmeinte.simscript.ui.simUiDsl.ArgumentList;
import nl.dslmeinte.simscript.ui.simUiDsl.ArithmeticBinaryOperatorExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOperator;
import nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.BinaryOperatorExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.Binding;
import nl.dslmeinte.simscript.ui.simUiDsl.BlockElement;
import nl.dslmeinte.simscript.ui.simUiDsl.BooleanBinaryOperatorExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiteralExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiterals;
import nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctions;
import nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement;
import nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement;
import nl.dslmeinte.simscript.ui.simUiDsl.CallbackErrorResponseExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpressions;
import nl.dslmeinte.simscript.ui.simUiDsl.CallbackResponseExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.Comparator;
import nl.dslmeinte.simscript.ui.simUiDsl.ComparisonExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.ComponentInvocation;
import nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer;
import nl.dslmeinte.simscript.ui.simUiDsl.CredentialArgument;
import nl.dslmeinte.simscript.ui.simUiDsl.CrudServiceIdentification;
import nl.dslmeinte.simscript.ui.simUiDsl.CrudTypes;
import nl.dslmeinte.simscript.ui.simUiDsl.DateExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.DateNowExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.DateTodayExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.DecisionCase;
import nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable;
import nl.dslmeinte.simscript.ui.simUiDsl.Element;
import nl.dslmeinte.simscript.ui.simUiDsl.ElementBody;
import nl.dslmeinte.simscript.ui.simUiDsl.EnumerationLiteralExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.ExitModalStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.ExitingStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.FeatureAssignment;
import nl.dslmeinte.simscript.ui.simUiDsl.ForStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.FrameElement;
import nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.GotoScreenStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.GroupElement;
import nl.dslmeinte.simscript.ui.simUiDsl.GroupOrientations;
import nl.dslmeinte.simscript.ui.simUiDsl.IfStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.ImageElement;
import nl.dslmeinte.simscript.ui.simUiDsl.InputElement;
import nl.dslmeinte.simscript.ui.simUiDsl.IntegerLiteralExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableElement;
import nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableRow;
import nl.dslmeinte.simscript.ui.simUiDsl.LineBreakElement;
import nl.dslmeinte.simscript.ui.simUiDsl.ListElement;
import nl.dslmeinte.simscript.ui.simUiDsl.ListLiteralExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.ListVariable;
import nl.dslmeinte.simscript.ui.simUiDsl.LiteralExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.LocalValueDeclarationStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.LocalViewableDefinition;
import nl.dslmeinte.simscript.ui.simUiDsl.ManualViewable;
import nl.dslmeinte.simscript.ui.simUiDsl.Method;
import nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.MethodDefinition;
import nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeOperators;
import nl.dslmeinte.simscript.ui.simUiDsl.NamedServiceReference;
import nl.dslmeinte.simscript.ui.simUiDsl.NonExitingStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.NotExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.NumberLiteralExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.ObserveElement;
import nl.dslmeinte.simscript.ui.simUiDsl.OrExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.Parameter;
import nl.dslmeinte.simscript.ui.simUiDsl.ParameterList;
import nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument;
import nl.dslmeinte.simscript.ui.simUiDsl.ProgressBarTabSet;
import nl.dslmeinte.simscript.ui.simUiDsl.Quotation;
import nl.dslmeinte.simscript.ui.simUiDsl.RadioOption;
import nl.dslmeinte.simscript.ui.simUiDsl.Referable;
import nl.dslmeinte.simscript.ui.simUiDsl.ReferenceExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.SelectionExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.ServiceIdentification;
import nl.dslmeinte.simscript.ui.simUiDsl.ShowModalStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslFactory;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement;
import nl.dslmeinte.simscript.ui.simUiDsl.Statement;
import nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock;
import nl.dslmeinte.simscript.ui.simUiDsl.StringLiteralExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.StructureCreationExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.StructureOption;
import nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration;
import nl.dslmeinte.simscript.ui.simUiDsl.TableBodyElement;
import nl.dslmeinte.simscript.ui.simUiDsl.TableElement;
import nl.dslmeinte.simscript.ui.simUiDsl.TableRow;
import nl.dslmeinte.simscript.ui.simUiDsl.TableRowsDefinition;
import nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation;
import nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement;
import nl.dslmeinte.simscript.ui.simUiDsl.TopLevelDefinition;
import nl.dslmeinte.simscript.ui.simUiDsl.UiModule;
import nl.dslmeinte.simscript.ui.simUiDsl.Value;
import nl.dslmeinte.simscript.ui.simUiDsl.ValueDeclaration;
import nl.dslmeinte.simscript.ui.simUiDsl.ValueReferenceOrMethodCallExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.ValueTypes;
import nl.dslmeinte.simscript.ui.simUiDsl.ValuesBlock;
import nl.dslmeinte.simscript.ui.simUiDsl.VerticalAlignment;
import nl.dslmeinte.simscript.ui.simUiDsl.Viewable;
import nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite;
import nl.dslmeinte.simscript.ui.simUiDsl.ViewableTypes;
import nl.dslmeinte.simscript.ui.simUiDsl.WhenElement;

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
public class SimUiDslPackageImpl extends EPackageImpl implements SimUiDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uiModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableRowsDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definedViewableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass manualViewableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localViewableDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valuesBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractValueDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentInvocationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass radioOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structureOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableBodyElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableRowsInvocationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableRowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labeledTableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labeledTableRowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass progressBarTabSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tabDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass countdownTimerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass observeElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass calendarElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeSlotListElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slotAddElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass frameElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineBreakElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exitingStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nonExitingStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listRemoveStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentOrExpressionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass showModalStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exitModalStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gotoScreenStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gotoModuleStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass principalArgumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass credentialArgumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localValueDeclarationStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewableCallSiteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceIdentificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builtinFunctionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listLiteralExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerationLiteralExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decisionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decisionCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callbackExpressionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callbackExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structureCreationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueReferenceOrMethodCallExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ternaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisonExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additiveExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicativeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceCallExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedServiceReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass crudServiceIdentificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureAccessExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateNowExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateTodayExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLiteralExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerLiteralExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberLiteralExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callbackResponseExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callbackErrorResponseExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodCallExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanBinaryOperatorExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arithmeticBinaryOperatorExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryOperatorExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum viewableTypesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum valueTypesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum groupOrientationsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum verticalAlignmentEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum assignmentOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum comparatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum additiveOperatorsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum multiplicativeOperatorsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum crudTypesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum builtinFunctionsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum booleanLiteralsEEnum = null;

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
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SimUiDslPackageImpl()
  {
    super(eNS_URI, SimUiDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SimUiDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SimUiDslPackage init()
  {
    if (isInited) return (SimUiDslPackage)EPackage.Registry.INSTANCE.getEPackage(SimUiDslPackage.eNS_URI);

    // Obtain or create and register package
    SimUiDslPackageImpl theSimUiDslPackage = (SimUiDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimUiDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimUiDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    SimBackendDslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSimUiDslPackage.createPackageContents();

    // Initialize created meta-data
    theSimUiDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSimUiDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SimUiDslPackage.eNS_URI, theSimUiDslPackage);
    return theSimUiDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUiModule()
  {
    return uiModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUiModule_NotAuthenticated()
  {
    return (EAttribute)uiModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUiModule_Definitions()
  {
    return (EReference)uiModuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelDefinition()
  {
    return topLevelDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTopLevelDefinition_ParameterList()
  {
    return (EReference)topLevelDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableRowsDefinition()
  {
    return tableRowsDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTableRowsDefinition_Name()
  {
    return (EAttribute)tableRowsDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableRowsDefinition_Rows()
  {
    return (EReference)tableRowsDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewable()
  {
    return viewableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewable_Type()
  {
    return (EAttribute)viewableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewable_Name()
  {
    return (EAttribute)viewableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinedViewable()
  {
    return definedViewableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinedViewable_ValuesBlock()
  {
    return (EReference)definedViewableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefinedViewable_Definitions()
  {
    return (EReference)definedViewableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getManualViewable()
  {
    return manualViewableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getManualViewable_Namespace()
  {
    return (EAttribute)manualViewableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalViewableDefinition()
  {
    return localViewableDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValuesBlock()
  {
    return valuesBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValuesBlock_Declarations()
  {
    return (EReference)valuesBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueDeclaration()
  {
    return valueDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueDeclaration_ValueType()
  {
    return (EAttribute)valueDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractValueDeclaration()
  {
    return abstractValueDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractValueDeclaration_Value()
  {
    return (EReference)abstractValueDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractValueDeclaration_DeclaredType()
  {
    return (EReference)abstractValueDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractValueDeclaration_ValueExpr()
  {
    return (EReference)abstractValueDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Type()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterList()
  {
    return parameterListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterList_Parameters()
  {
    return (EReference)parameterListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodDefinition()
  {
    return methodDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodDefinition_Method()
  {
    return (EReference)methodDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodDefinition_StatementBlock()
  {
    return (EReference)methodDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod()
  {
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuotation()
  {
    return quotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuotation_Path()
  {
    return (EReference)quotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinding()
  {
    return bindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinding_BindSite()
  {
    return (EReference)bindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementBody()
  {
    return elementBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementBody_Elements()
  {
    return (EReference)elementBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentInvocation()
  {
    return componentInvocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgument()
  {
    return argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgument_Parameter()
  {
    return (EReference)argumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgument_ValueExpr()
  {
    return (EReference)argumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgumentList()
  {
    return argumentListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgumentList_Arguments()
  {
    return (EReference)argumentListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputElement()
  {
    return inputElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputElement_BindSite()
  {
    return (EReference)inputElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputElement_Hint()
  {
    return (EAttribute)inputElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputElement_MinValue()
  {
    return (EReference)inputElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputElement_MaxValue()
  {
    return (EReference)inputElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputElement_RadioOption()
  {
    return (EReference)inputElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputElement_OnChange()
  {
    return (EReference)inputElementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputElement_OnSubmit()
  {
    return (EReference)inputElementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputElement_StructureOption()
  {
    return (EReference)inputElementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRadioOption()
  {
    return radioOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadioOption_True()
  {
    return (EAttribute)radioOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadioOption_False()
  {
    return (EAttribute)radioOptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructureOption()
  {
    return structureOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructureOption_SourceExpr()
  {
    return (EReference)structureOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructureOption_DisplayFunction()
  {
    return (EReference)structureOptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButtonElement()
  {
    return buttonElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButtonElement_Text()
  {
    return (EAttribute)buttonElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButtonElement_Action()
  {
    return (EReference)buttonElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButtonElement_CssClass()
  {
    return (EAttribute)buttonElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockElement()
  {
    return blockElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlockElement_OnClick()
  {
    return (EReference)blockElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlockElement_CssClass()
  {
    return (EAttribute)blockElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlockElement_BodyCssClass()
  {
    return (EAttribute)blockElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlockElement_Style()
  {
    return (EAttribute)blockElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlockElement_Header()
  {
    return (EReference)blockElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlockElement_HeaderCssClass()
  {
    return (EAttribute)blockElementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBlockElement_NoCss()
  {
    return (EAttribute)blockElementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlockElement_Body()
  {
    return (EReference)blockElementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListElement()
  {
    return listElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListElement_IndexVariable()
  {
    return (EReference)listElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListElement_ValueVariable()
  {
    return (EReference)listElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListElement_ListExpression()
  {
    return (EReference)listElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListElement_Body()
  {
    return (EReference)listElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListVariable()
  {
    return listVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableElement()
  {
    return tableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableElement_SubElements()
  {
    return (EReference)tableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableBodyElement()
  {
    return tableBodyElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableRowsInvocation()
  {
    return tableRowsInvocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableRowsInvocation_Definition()
  {
    return (EReference)tableRowsInvocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableRowsInvocation_ArgumentList()
  {
    return (EReference)tableRowsInvocationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTableRow()
  {
    return tableRowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableRow_Label()
  {
    return (EReference)tableRowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTableRow_Body()
  {
    return (EReference)tableRowEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabeledTableElement()
  {
    return labeledTableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabeledTableElement_Body()
  {
    return (EReference)labeledTableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabeledTableRow()
  {
    return labeledTableRowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabeledTableRow_Label()
  {
    return (EReference)labeledTableRowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabeledTableRow_Body()
  {
    return (EReference)labeledTableRowEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgressBarTabSet()
  {
    return progressBarTabSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgressBarTabSet_Tabs()
  {
    return (EReference)progressBarTabSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTabDeclaration()
  {
    return tabDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabDeclaration_Header()
  {
    return (EReference)tabDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabDeclaration_PreviousCallback()
  {
    return (EReference)tabDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabDeclaration_NextCallback()
  {
    return (EReference)tabDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupElement()
  {
    return groupElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupElement_Orientation()
  {
    return (EAttribute)groupElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupElement_V_align()
  {
    return (EAttribute)groupElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupElement_NestedGroups()
  {
    return (EReference)groupElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupElement_LeafGroups()
  {
    return (EReference)groupElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCountdownTimer()
  {
    return countdownTimerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCountdownTimer_Observed()
  {
    return (EAttribute)countdownTimerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCountdownTimer_EndTime()
  {
    return (EReference)countdownTimerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCountdownTimer_OnEnd()
  {
    return (EReference)countdownTimerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObserveElement()
  {
    return observeElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObserveElement_ObserveExpr()
  {
    return (EReference)observeElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObserveElement_StatementBlock()
  {
    return (EReference)observeElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCalendarElement()
  {
    return calendarElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCalendarElement_Date()
  {
    return (EReference)calendarElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCalendarElement_OnSelect()
  {
    return (EReference)calendarElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCalendarElement_AllowFrom()
  {
    return (EReference)calendarElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCalendarElement_DateFormat()
  {
    return (EAttribute)calendarElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCalendarElement_Days()
  {
    return (EReference)calendarElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCalendarElement_CssClass()
  {
    return (EAttribute)calendarElementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeSlotListElement()
  {
    return timeSlotListElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimeSlotListElement_Slots()
  {
    return (EReference)timeSlotListElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimeSlotListElement_OnSelect()
  {
    return (EReference)timeSlotListElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimeSlotListElement_OnDelete()
  {
    return (EReference)timeSlotListElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSlotAddElement()
  {
    return slotAddElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSlotAddElement_Product()
  {
    return (EReference)slotAddElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSlotAddElement_Day()
  {
    return (EReference)slotAddElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSlotAddElement_Slots()
  {
    return (EReference)slotAddElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSlotAddElement_StartHour()
  {
    return (EReference)slotAddElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSlotAddElement_EndHour()
  {
    return (EReference)slotAddElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenElement()
  {
    return whenElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenElement_Condition()
  {
    return (EReference)whenElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenElement_Body()
  {
    return (EReference)whenElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImageElement()
  {
    return imageElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageElement_Observed()
  {
    return (EAttribute)imageElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageElement_SourceUrl()
  {
    return (EReference)imageElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageElement_Width()
  {
    return (EReference)imageElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImageElement_Height()
  {
    return (EReference)imageElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFrameElement()
  {
    return frameElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFrameElement_SourceUrl()
  {
    return (EReference)frameElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFrameElement_Width()
  {
    return (EReference)frameElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFrameElement_Height()
  {
    return (EReference)frameElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLineBreakElement()
  {
    return lineBreakElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatementBlock()
  {
    return statementBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatementBlock_Statements()
  {
    return (EReference)statementBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExitingStatement()
  {
    return exitingStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNonExitingStatement()
  {
    return nonExitingStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForStatement()
  {
    return forStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_IndexVariable()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_ValueVariable()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_ListExpression()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForStatement_ThenBlock()
  {
    return (EReference)forStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListRemoveStatement()
  {
    return listRemoveStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListRemoveStatement_ListExpr()
  {
    return (EReference)listRemoveStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListRemoveStatement_Feature()
  {
    return (EReference)listRemoveStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListRemoveStatement_ValueExpr()
  {
    return (EReference)listRemoveStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListRemoveStatement_IndexVariable()
  {
    return (EReference)listRemoveStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignmentOrExpressionStatement()
  {
    return assignmentOrExpressionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentOrExpressionStatement_Lhs()
  {
    return (EReference)assignmentOrExpressionStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignmentOrExpressionStatement_Operator()
  {
    return (EAttribute)assignmentOrExpressionStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentOrExpressionStatement_Rhs()
  {
    return (EReference)assignmentOrExpressionStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShowModalStatement()
  {
    return showModalStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShowModalStatement_Persistent()
  {
    return (EAttribute)showModalStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExitModalStatement()
  {
    return exitModalStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGotoScreenStatement()
  {
    return gotoScreenStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGotoModuleStatement()
  {
    return gotoModuleStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGotoModuleStatement_TargetModule()
  {
    return (EReference)gotoModuleStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGotoModuleStatement_Args()
  {
    return (EReference)gotoModuleStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGotoModuleStatement_Authenticate()
  {
    return (EAttribute)gotoModuleStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGotoModuleStatement_AuthOption()
  {
    return (EReference)gotoModuleStatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGotoModuleStatement_Principal()
  {
    return (EReference)gotoModuleStatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGotoModuleStatement_Credential()
  {
    return (EReference)gotoModuleStatementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGotoModuleStatement_ErrorCallback()
  {
    return (EReference)gotoModuleStatementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrincipalArgument()
  {
    return principalArgumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrincipalArgument_Principal()
  {
    return (EReference)principalArgumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrincipalArgument_ValueExpr()
  {
    return (EReference)principalArgumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCredentialArgument()
  {
    return credentialArgumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCredentialArgument_Credential()
  {
    return (EReference)credentialArgumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCredentialArgument_ValueExpr()
  {
    return (EReference)credentialArgumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfStatement()
  {
    return ifStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_Condition()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_ThenBlock()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_ElseBlock()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalValueDeclarationStatement()
  {
    return localValueDeclarationStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewableCallSite()
  {
    return viewableCallSiteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewableCallSite_Viewable()
  {
    return (EReference)viewableCallSiteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getViewableCallSite_ArgumentList()
  {
    return (EReference)viewableCallSiteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceIdentification()
  {
    return serviceIdentificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateExpression()
  {
    return dateExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuiltinFunctionExpression()
  {
    return builtinFunctionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuiltinFunctionExpression_Function()
  {
    return (EAttribute)builtinFunctionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltinFunctionExpression_Argument()
  {
    return (EReference)builtinFunctionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltinFunctionExpression_SortFeature()
  {
    return (EReference)builtinFunctionExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralExpression()
  {
    return literalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListLiteralExpression()
  {
    return listLiteralExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListLiteralExpression_Members()
  {
    return (EReference)listLiteralExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumerationLiteralExpression()
  {
    return enumerationLiteralExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumerationLiteralExpression_Enumeration()
  {
    return (EReference)enumerationLiteralExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumerationLiteralExpression_Literal()
  {
    return (EReference)enumerationLiteralExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecisionExpression()
  {
    return decisionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionExpression_Cases()
  {
    return (EReference)decisionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionExpression_DefaultValueExpr()
  {
    return (EReference)decisionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecisionCase()
  {
    return decisionCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionCase_GuardExpr()
  {
    return (EReference)decisionCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionCase_ValueExpr()
  {
    return (EReference)decisionCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallbackExpressions()
  {
    return callbackExpressionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallbackExpression()
  {
    return callbackExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallbackExpression_StatementBlock()
  {
    return (EReference)callbackExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructureCreationExpression()
  {
    return structureCreationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructureCreationExpression_Structure()
  {
    return (EReference)structureCreationExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructureCreationExpression_Assignments()
  {
    return (EReference)structureCreationExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureAssignment()
  {
    return featureAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureAssignment_Feature()
  {
    return (EReference)featureAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureAssignment_ValueExpr()
  {
    return (EReference)featureAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueReferenceOrMethodCallExpression()
  {
    return valueReferenceOrMethodCallExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceExpression()
  {
    return referenceExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceExpression_Ref()
  {
    return (EReference)referenceExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferable()
  {
    return referableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferable_Name()
  {
    return (EAttribute)referableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTernaryExpression()
  {
    return ternaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTernaryExpression_Guard()
  {
    return (EReference)ternaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTernaryExpression_ThenExpr()
  {
    return (EReference)ternaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTernaryExpression_ElseExpr()
  {
    return (EReference)ternaryExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrExpression()
  {
    return orExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndExpression()
  {
    return andExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComparisonExpression()
  {
    return comparisonExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComparisonExpression_Comparator()
  {
    return (EAttribute)comparisonExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditiveExpression()
  {
    return additiveExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdditiveExpression_Operator()
  {
    return (EAttribute)additiveExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicativeExpression()
  {
    return multiplicativeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplicativeExpression_Operator()
  {
    return (EAttribute)multiplicativeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotExpression()
  {
    return notExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNotExpression_Operand()
  {
    return (EReference)notExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceCallExpression()
  {
    return interfaceCallExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceCallExpression_ServiceId()
  {
    return (EReference)interfaceCallExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceCallExpression_ObserveSites()
  {
    return (EReference)interfaceCallExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceCallExpression_Input()
  {
    return (EReference)interfaceCallExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceCallExpression_Callback()
  {
    return (EReference)interfaceCallExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceCallExpression_ErrorCallback()
  {
    return (EReference)interfaceCallExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedServiceReference()
  {
    return namedServiceReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedServiceReference_Service()
  {
    return (EReference)namedServiceReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCrudServiceIdentification()
  {
    return crudServiceIdentificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCrudServiceIdentification_CrudType()
  {
    return (EAttribute)crudServiceIdentificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCrudServiceIdentification_Structure()
  {
    return (EReference)crudServiceIdentificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureAccessExpression()
  {
    return featureAccessExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureAccessExpression_Previous()
  {
    return (EReference)featureAccessExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureAccessExpression_Feature()
  {
    return (EReference)featureAccessExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectionExpression()
  {
    return selectionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateNowExpression()
  {
    return dateNowExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateTodayExpression()
  {
    return dateTodayExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteralExpression()
  {
    return stringLiteralExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteralExpression_Value()
  {
    return (EAttribute)stringLiteralExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteralExpression()
  {
    return booleanLiteralExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanLiteralExpression_Literal()
  {
    return (EAttribute)booleanLiteralExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerLiteralExpression()
  {
    return integerLiteralExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerLiteralExpression_Value()
  {
    return (EAttribute)integerLiteralExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberLiteralExpression()
  {
    return numberLiteralExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberLiteralExpression_Value()
  {
    return (EAttribute)numberLiteralExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallbackResponseExpression()
  {
    return callbackResponseExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallbackErrorResponseExpression()
  {
    return callbackErrorResponseExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodCallExpression()
  {
    return methodCallExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodCallExpression_MethodRef()
  {
    return (EReference)methodCallExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodCallExpression_ArgumentList()
  {
    return (EReference)methodCallExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanBinaryOperatorExpression()
  {
    return booleanBinaryOperatorExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArithmeticBinaryOperatorExpression()
  {
    return arithmeticBinaryOperatorExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryOperatorExpression()
  {
    return binaryOperatorExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryOperatorExpression_LeftOperand()
  {
    return (EReference)binaryOperatorExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryOperatorExpression_RightOperand()
  {
    return (EReference)binaryOperatorExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getViewableTypes()
  {
    return viewableTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getValueTypes()
  {
    return valueTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getGroupOrientations()
  {
    return groupOrientationsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVerticalAlignment()
  {
    return verticalAlignmentEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAssignmentOperator()
  {
    return assignmentOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getComparator()
  {
    return comparatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAdditiveOperators()
  {
    return additiveOperatorsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMultiplicativeOperators()
  {
    return multiplicativeOperatorsEEnum;
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
  public EEnum getBuiltinFunctions()
  {
    return builtinFunctionsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBooleanLiterals()
  {
    return booleanLiteralsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimUiDslFactory getSimUiDslFactory()
  {
    return (SimUiDslFactory)getEFactoryInstance();
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
    uiModuleEClass = createEClass(UI_MODULE);
    createEAttribute(uiModuleEClass, UI_MODULE__NOT_AUTHENTICATED);
    createEReference(uiModuleEClass, UI_MODULE__DEFINITIONS);

    topLevelDefinitionEClass = createEClass(TOP_LEVEL_DEFINITION);
    createEReference(topLevelDefinitionEClass, TOP_LEVEL_DEFINITION__PARAMETER_LIST);

    tableRowsDefinitionEClass = createEClass(TABLE_ROWS_DEFINITION);
    createEAttribute(tableRowsDefinitionEClass, TABLE_ROWS_DEFINITION__NAME);
    createEReference(tableRowsDefinitionEClass, TABLE_ROWS_DEFINITION__ROWS);

    viewableEClass = createEClass(VIEWABLE);
    createEAttribute(viewableEClass, VIEWABLE__TYPE);
    createEAttribute(viewableEClass, VIEWABLE__NAME);

    definedViewableEClass = createEClass(DEFINED_VIEWABLE);
    createEReference(definedViewableEClass, DEFINED_VIEWABLE__VALUES_BLOCK);
    createEReference(definedViewableEClass, DEFINED_VIEWABLE__DEFINITIONS);

    manualViewableEClass = createEClass(MANUAL_VIEWABLE);
    createEAttribute(manualViewableEClass, MANUAL_VIEWABLE__NAMESPACE);

    localViewableDefinitionEClass = createEClass(LOCAL_VIEWABLE_DEFINITION);

    valuesBlockEClass = createEClass(VALUES_BLOCK);
    createEReference(valuesBlockEClass, VALUES_BLOCK__DECLARATIONS);

    valueDeclarationEClass = createEClass(VALUE_DECLARATION);
    createEAttribute(valueDeclarationEClass, VALUE_DECLARATION__VALUE_TYPE);

    valueEClass = createEClass(VALUE);

    abstractValueDeclarationEClass = createEClass(ABSTRACT_VALUE_DECLARATION);
    createEReference(abstractValueDeclarationEClass, ABSTRACT_VALUE_DECLARATION__VALUE);
    createEReference(abstractValueDeclarationEClass, ABSTRACT_VALUE_DECLARATION__DECLARED_TYPE);
    createEReference(abstractValueDeclarationEClass, ABSTRACT_VALUE_DECLARATION__VALUE_EXPR);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__TYPE);

    parameterListEClass = createEClass(PARAMETER_LIST);
    createEReference(parameterListEClass, PARAMETER_LIST__PARAMETERS);

    methodDefinitionEClass = createEClass(METHOD_DEFINITION);
    createEReference(methodDefinitionEClass, METHOD_DEFINITION__METHOD);
    createEReference(methodDefinitionEClass, METHOD_DEFINITION__STATEMENT_BLOCK);

    methodEClass = createEClass(METHOD);

    elementEClass = createEClass(ELEMENT);

    quotationEClass = createEClass(QUOTATION);
    createEReference(quotationEClass, QUOTATION__PATH);

    bindingEClass = createEClass(BINDING);
    createEReference(bindingEClass, BINDING__BIND_SITE);

    elementBodyEClass = createEClass(ELEMENT_BODY);
    createEReference(elementBodyEClass, ELEMENT_BODY__ELEMENTS);

    componentInvocationEClass = createEClass(COMPONENT_INVOCATION);

    argumentEClass = createEClass(ARGUMENT);
    createEReference(argumentEClass, ARGUMENT__PARAMETER);
    createEReference(argumentEClass, ARGUMENT__VALUE_EXPR);

    argumentListEClass = createEClass(ARGUMENT_LIST);
    createEReference(argumentListEClass, ARGUMENT_LIST__ARGUMENTS);

    inputElementEClass = createEClass(INPUT_ELEMENT);
    createEReference(inputElementEClass, INPUT_ELEMENT__BIND_SITE);
    createEAttribute(inputElementEClass, INPUT_ELEMENT__HINT);
    createEReference(inputElementEClass, INPUT_ELEMENT__MIN_VALUE);
    createEReference(inputElementEClass, INPUT_ELEMENT__MAX_VALUE);
    createEReference(inputElementEClass, INPUT_ELEMENT__RADIO_OPTION);
    createEReference(inputElementEClass, INPUT_ELEMENT__ON_CHANGE);
    createEReference(inputElementEClass, INPUT_ELEMENT__ON_SUBMIT);
    createEReference(inputElementEClass, INPUT_ELEMENT__STRUCTURE_OPTION);

    radioOptionEClass = createEClass(RADIO_OPTION);
    createEAttribute(radioOptionEClass, RADIO_OPTION__TRUE);
    createEAttribute(radioOptionEClass, RADIO_OPTION__FALSE);

    structureOptionEClass = createEClass(STRUCTURE_OPTION);
    createEReference(structureOptionEClass, STRUCTURE_OPTION__SOURCE_EXPR);
    createEReference(structureOptionEClass, STRUCTURE_OPTION__DISPLAY_FUNCTION);

    buttonElementEClass = createEClass(BUTTON_ELEMENT);
    createEAttribute(buttonElementEClass, BUTTON_ELEMENT__TEXT);
    createEReference(buttonElementEClass, BUTTON_ELEMENT__ACTION);
    createEAttribute(buttonElementEClass, BUTTON_ELEMENT__CSS_CLASS);

    blockElementEClass = createEClass(BLOCK_ELEMENT);
    createEReference(blockElementEClass, BLOCK_ELEMENT__ON_CLICK);
    createEAttribute(blockElementEClass, BLOCK_ELEMENT__CSS_CLASS);
    createEAttribute(blockElementEClass, BLOCK_ELEMENT__BODY_CSS_CLASS);
    createEAttribute(blockElementEClass, BLOCK_ELEMENT__STYLE);
    createEReference(blockElementEClass, BLOCK_ELEMENT__HEADER);
    createEAttribute(blockElementEClass, BLOCK_ELEMENT__HEADER_CSS_CLASS);
    createEAttribute(blockElementEClass, BLOCK_ELEMENT__NO_CSS);
    createEReference(blockElementEClass, BLOCK_ELEMENT__BODY);

    listElementEClass = createEClass(LIST_ELEMENT);
    createEReference(listElementEClass, LIST_ELEMENT__INDEX_VARIABLE);
    createEReference(listElementEClass, LIST_ELEMENT__VALUE_VARIABLE);
    createEReference(listElementEClass, LIST_ELEMENT__LIST_EXPRESSION);
    createEReference(listElementEClass, LIST_ELEMENT__BODY);

    listVariableEClass = createEClass(LIST_VARIABLE);

    tableElementEClass = createEClass(TABLE_ELEMENT);
    createEReference(tableElementEClass, TABLE_ELEMENT__SUB_ELEMENTS);

    tableBodyElementEClass = createEClass(TABLE_BODY_ELEMENT);

    tableRowsInvocationEClass = createEClass(TABLE_ROWS_INVOCATION);
    createEReference(tableRowsInvocationEClass, TABLE_ROWS_INVOCATION__DEFINITION);
    createEReference(tableRowsInvocationEClass, TABLE_ROWS_INVOCATION__ARGUMENT_LIST);

    tableRowEClass = createEClass(TABLE_ROW);
    createEReference(tableRowEClass, TABLE_ROW__LABEL);
    createEReference(tableRowEClass, TABLE_ROW__BODY);

    labeledTableElementEClass = createEClass(LABELED_TABLE_ELEMENT);
    createEReference(labeledTableElementEClass, LABELED_TABLE_ELEMENT__BODY);

    labeledTableRowEClass = createEClass(LABELED_TABLE_ROW);
    createEReference(labeledTableRowEClass, LABELED_TABLE_ROW__LABEL);
    createEReference(labeledTableRowEClass, LABELED_TABLE_ROW__BODY);

    progressBarTabSetEClass = createEClass(PROGRESS_BAR_TAB_SET);
    createEReference(progressBarTabSetEClass, PROGRESS_BAR_TAB_SET__TABS);

    tabDeclarationEClass = createEClass(TAB_DECLARATION);
    createEReference(tabDeclarationEClass, TAB_DECLARATION__HEADER);
    createEReference(tabDeclarationEClass, TAB_DECLARATION__PREVIOUS_CALLBACK);
    createEReference(tabDeclarationEClass, TAB_DECLARATION__NEXT_CALLBACK);

    groupElementEClass = createEClass(GROUP_ELEMENT);
    createEAttribute(groupElementEClass, GROUP_ELEMENT__ORIENTATION);
    createEAttribute(groupElementEClass, GROUP_ELEMENT__VALIGN);
    createEReference(groupElementEClass, GROUP_ELEMENT__NESTED_GROUPS);
    createEReference(groupElementEClass, GROUP_ELEMENT__LEAF_GROUPS);

    countdownTimerEClass = createEClass(COUNTDOWN_TIMER);
    createEAttribute(countdownTimerEClass, COUNTDOWN_TIMER__OBSERVED);
    createEReference(countdownTimerEClass, COUNTDOWN_TIMER__END_TIME);
    createEReference(countdownTimerEClass, COUNTDOWN_TIMER__ON_END);

    observeElementEClass = createEClass(OBSERVE_ELEMENT);
    createEReference(observeElementEClass, OBSERVE_ELEMENT__OBSERVE_EXPR);
    createEReference(observeElementEClass, OBSERVE_ELEMENT__STATEMENT_BLOCK);

    calendarElementEClass = createEClass(CALENDAR_ELEMENT);
    createEReference(calendarElementEClass, CALENDAR_ELEMENT__DATE);
    createEReference(calendarElementEClass, CALENDAR_ELEMENT__ON_SELECT);
    createEReference(calendarElementEClass, CALENDAR_ELEMENT__ALLOW_FROM);
    createEAttribute(calendarElementEClass, CALENDAR_ELEMENT__DATE_FORMAT);
    createEReference(calendarElementEClass, CALENDAR_ELEMENT__DAYS);
    createEAttribute(calendarElementEClass, CALENDAR_ELEMENT__CSS_CLASS);

    timeSlotListElementEClass = createEClass(TIME_SLOT_LIST_ELEMENT);
    createEReference(timeSlotListElementEClass, TIME_SLOT_LIST_ELEMENT__SLOTS);
    createEReference(timeSlotListElementEClass, TIME_SLOT_LIST_ELEMENT__ON_SELECT);
    createEReference(timeSlotListElementEClass, TIME_SLOT_LIST_ELEMENT__ON_DELETE);

    slotAddElementEClass = createEClass(SLOT_ADD_ELEMENT);
    createEReference(slotAddElementEClass, SLOT_ADD_ELEMENT__PRODUCT);
    createEReference(slotAddElementEClass, SLOT_ADD_ELEMENT__DAY);
    createEReference(slotAddElementEClass, SLOT_ADD_ELEMENT__SLOTS);
    createEReference(slotAddElementEClass, SLOT_ADD_ELEMENT__START_HOUR);
    createEReference(slotAddElementEClass, SLOT_ADD_ELEMENT__END_HOUR);

    whenElementEClass = createEClass(WHEN_ELEMENT);
    createEReference(whenElementEClass, WHEN_ELEMENT__CONDITION);
    createEReference(whenElementEClass, WHEN_ELEMENT__BODY);

    imageElementEClass = createEClass(IMAGE_ELEMENT);
    createEAttribute(imageElementEClass, IMAGE_ELEMENT__OBSERVED);
    createEReference(imageElementEClass, IMAGE_ELEMENT__SOURCE_URL);
    createEReference(imageElementEClass, IMAGE_ELEMENT__WIDTH);
    createEReference(imageElementEClass, IMAGE_ELEMENT__HEIGHT);

    frameElementEClass = createEClass(FRAME_ELEMENT);
    createEReference(frameElementEClass, FRAME_ELEMENT__SOURCE_URL);
    createEReference(frameElementEClass, FRAME_ELEMENT__WIDTH);
    createEReference(frameElementEClass, FRAME_ELEMENT__HEIGHT);

    lineBreakElementEClass = createEClass(LINE_BREAK_ELEMENT);

    statementBlockEClass = createEClass(STATEMENT_BLOCK);
    createEReference(statementBlockEClass, STATEMENT_BLOCK__STATEMENTS);

    statementEClass = createEClass(STATEMENT);

    exitingStatementEClass = createEClass(EXITING_STATEMENT);

    nonExitingStatementEClass = createEClass(NON_EXITING_STATEMENT);

    forStatementEClass = createEClass(FOR_STATEMENT);
    createEReference(forStatementEClass, FOR_STATEMENT__INDEX_VARIABLE);
    createEReference(forStatementEClass, FOR_STATEMENT__VALUE_VARIABLE);
    createEReference(forStatementEClass, FOR_STATEMENT__LIST_EXPRESSION);
    createEReference(forStatementEClass, FOR_STATEMENT__THEN_BLOCK);

    listRemoveStatementEClass = createEClass(LIST_REMOVE_STATEMENT);
    createEReference(listRemoveStatementEClass, LIST_REMOVE_STATEMENT__LIST_EXPR);
    createEReference(listRemoveStatementEClass, LIST_REMOVE_STATEMENT__FEATURE);
    createEReference(listRemoveStatementEClass, LIST_REMOVE_STATEMENT__VALUE_EXPR);
    createEReference(listRemoveStatementEClass, LIST_REMOVE_STATEMENT__INDEX_VARIABLE);

    assignmentOrExpressionStatementEClass = createEClass(ASSIGNMENT_OR_EXPRESSION_STATEMENT);
    createEReference(assignmentOrExpressionStatementEClass, ASSIGNMENT_OR_EXPRESSION_STATEMENT__LHS);
    createEAttribute(assignmentOrExpressionStatementEClass, ASSIGNMENT_OR_EXPRESSION_STATEMENT__OPERATOR);
    createEReference(assignmentOrExpressionStatementEClass, ASSIGNMENT_OR_EXPRESSION_STATEMENT__RHS);

    showModalStatementEClass = createEClass(SHOW_MODAL_STATEMENT);
    createEAttribute(showModalStatementEClass, SHOW_MODAL_STATEMENT__PERSISTENT);

    exitModalStatementEClass = createEClass(EXIT_MODAL_STATEMENT);

    gotoScreenStatementEClass = createEClass(GOTO_SCREEN_STATEMENT);

    gotoModuleStatementEClass = createEClass(GOTO_MODULE_STATEMENT);
    createEReference(gotoModuleStatementEClass, GOTO_MODULE_STATEMENT__TARGET_MODULE);
    createEReference(gotoModuleStatementEClass, GOTO_MODULE_STATEMENT__ARGS);
    createEAttribute(gotoModuleStatementEClass, GOTO_MODULE_STATEMENT__AUTHENTICATE);
    createEReference(gotoModuleStatementEClass, GOTO_MODULE_STATEMENT__AUTH_OPTION);
    createEReference(gotoModuleStatementEClass, GOTO_MODULE_STATEMENT__PRINCIPAL);
    createEReference(gotoModuleStatementEClass, GOTO_MODULE_STATEMENT__CREDENTIAL);
    createEReference(gotoModuleStatementEClass, GOTO_MODULE_STATEMENT__ERROR_CALLBACK);

    principalArgumentEClass = createEClass(PRINCIPAL_ARGUMENT);
    createEReference(principalArgumentEClass, PRINCIPAL_ARGUMENT__PRINCIPAL);
    createEReference(principalArgumentEClass, PRINCIPAL_ARGUMENT__VALUE_EXPR);

    credentialArgumentEClass = createEClass(CREDENTIAL_ARGUMENT);
    createEReference(credentialArgumentEClass, CREDENTIAL_ARGUMENT__CREDENTIAL);
    createEReference(credentialArgumentEClass, CREDENTIAL_ARGUMENT__VALUE_EXPR);

    ifStatementEClass = createEClass(IF_STATEMENT);
    createEReference(ifStatementEClass, IF_STATEMENT__CONDITION);
    createEReference(ifStatementEClass, IF_STATEMENT__THEN_BLOCK);
    createEReference(ifStatementEClass, IF_STATEMENT__ELSE_BLOCK);

    localValueDeclarationStatementEClass = createEClass(LOCAL_VALUE_DECLARATION_STATEMENT);

    viewableCallSiteEClass = createEClass(VIEWABLE_CALL_SITE);
    createEReference(viewableCallSiteEClass, VIEWABLE_CALL_SITE__VIEWABLE);
    createEReference(viewableCallSiteEClass, VIEWABLE_CALL_SITE__ARGUMENT_LIST);

    expressionEClass = createEClass(EXPRESSION);

    serviceIdentificationEClass = createEClass(SERVICE_IDENTIFICATION);

    dateExpressionEClass = createEClass(DATE_EXPRESSION);

    builtinFunctionExpressionEClass = createEClass(BUILTIN_FUNCTION_EXPRESSION);
    createEAttribute(builtinFunctionExpressionEClass, BUILTIN_FUNCTION_EXPRESSION__FUNCTION);
    createEReference(builtinFunctionExpressionEClass, BUILTIN_FUNCTION_EXPRESSION__ARGUMENT);
    createEReference(builtinFunctionExpressionEClass, BUILTIN_FUNCTION_EXPRESSION__SORT_FEATURE);

    literalExpressionEClass = createEClass(LITERAL_EXPRESSION);

    listLiteralExpressionEClass = createEClass(LIST_LITERAL_EXPRESSION);
    createEReference(listLiteralExpressionEClass, LIST_LITERAL_EXPRESSION__MEMBERS);

    enumerationLiteralExpressionEClass = createEClass(ENUMERATION_LITERAL_EXPRESSION);
    createEReference(enumerationLiteralExpressionEClass, ENUMERATION_LITERAL_EXPRESSION__ENUMERATION);
    createEReference(enumerationLiteralExpressionEClass, ENUMERATION_LITERAL_EXPRESSION__LITERAL);

    decisionExpressionEClass = createEClass(DECISION_EXPRESSION);
    createEReference(decisionExpressionEClass, DECISION_EXPRESSION__CASES);
    createEReference(decisionExpressionEClass, DECISION_EXPRESSION__DEFAULT_VALUE_EXPR);

    decisionCaseEClass = createEClass(DECISION_CASE);
    createEReference(decisionCaseEClass, DECISION_CASE__GUARD_EXPR);
    createEReference(decisionCaseEClass, DECISION_CASE__VALUE_EXPR);

    callbackExpressionsEClass = createEClass(CALLBACK_EXPRESSIONS);

    callbackExpressionEClass = createEClass(CALLBACK_EXPRESSION);
    createEReference(callbackExpressionEClass, CALLBACK_EXPRESSION__STATEMENT_BLOCK);

    structureCreationExpressionEClass = createEClass(STRUCTURE_CREATION_EXPRESSION);
    createEReference(structureCreationExpressionEClass, STRUCTURE_CREATION_EXPRESSION__STRUCTURE);
    createEReference(structureCreationExpressionEClass, STRUCTURE_CREATION_EXPRESSION__ASSIGNMENTS);

    featureAssignmentEClass = createEClass(FEATURE_ASSIGNMENT);
    createEReference(featureAssignmentEClass, FEATURE_ASSIGNMENT__FEATURE);
    createEReference(featureAssignmentEClass, FEATURE_ASSIGNMENT__VALUE_EXPR);

    valueReferenceOrMethodCallExpressionEClass = createEClass(VALUE_REFERENCE_OR_METHOD_CALL_EXPRESSION);

    referenceExpressionEClass = createEClass(REFERENCE_EXPRESSION);
    createEReference(referenceExpressionEClass, REFERENCE_EXPRESSION__REF);

    referableEClass = createEClass(REFERABLE);
    createEAttribute(referableEClass, REFERABLE__NAME);

    ternaryExpressionEClass = createEClass(TERNARY_EXPRESSION);
    createEReference(ternaryExpressionEClass, TERNARY_EXPRESSION__GUARD);
    createEReference(ternaryExpressionEClass, TERNARY_EXPRESSION__THEN_EXPR);
    createEReference(ternaryExpressionEClass, TERNARY_EXPRESSION__ELSE_EXPR);

    orExpressionEClass = createEClass(OR_EXPRESSION);

    andExpressionEClass = createEClass(AND_EXPRESSION);

    comparisonExpressionEClass = createEClass(COMPARISON_EXPRESSION);
    createEAttribute(comparisonExpressionEClass, COMPARISON_EXPRESSION__COMPARATOR);

    additiveExpressionEClass = createEClass(ADDITIVE_EXPRESSION);
    createEAttribute(additiveExpressionEClass, ADDITIVE_EXPRESSION__OPERATOR);

    multiplicativeExpressionEClass = createEClass(MULTIPLICATIVE_EXPRESSION);
    createEAttribute(multiplicativeExpressionEClass, MULTIPLICATIVE_EXPRESSION__OPERATOR);

    notExpressionEClass = createEClass(NOT_EXPRESSION);
    createEReference(notExpressionEClass, NOT_EXPRESSION__OPERAND);

    interfaceCallExpressionEClass = createEClass(INTERFACE_CALL_EXPRESSION);
    createEReference(interfaceCallExpressionEClass, INTERFACE_CALL_EXPRESSION__SERVICE_ID);
    createEReference(interfaceCallExpressionEClass, INTERFACE_CALL_EXPRESSION__OBSERVE_SITES);
    createEReference(interfaceCallExpressionEClass, INTERFACE_CALL_EXPRESSION__INPUT);
    createEReference(interfaceCallExpressionEClass, INTERFACE_CALL_EXPRESSION__CALLBACK);
    createEReference(interfaceCallExpressionEClass, INTERFACE_CALL_EXPRESSION__ERROR_CALLBACK);

    namedServiceReferenceEClass = createEClass(NAMED_SERVICE_REFERENCE);
    createEReference(namedServiceReferenceEClass, NAMED_SERVICE_REFERENCE__SERVICE);

    crudServiceIdentificationEClass = createEClass(CRUD_SERVICE_IDENTIFICATION);
    createEAttribute(crudServiceIdentificationEClass, CRUD_SERVICE_IDENTIFICATION__CRUD_TYPE);
    createEReference(crudServiceIdentificationEClass, CRUD_SERVICE_IDENTIFICATION__STRUCTURE);

    featureAccessExpressionEClass = createEClass(FEATURE_ACCESS_EXPRESSION);
    createEReference(featureAccessExpressionEClass, FEATURE_ACCESS_EXPRESSION__PREVIOUS);
    createEReference(featureAccessExpressionEClass, FEATURE_ACCESS_EXPRESSION__FEATURE);

    selectionExpressionEClass = createEClass(SELECTION_EXPRESSION);

    dateNowExpressionEClass = createEClass(DATE_NOW_EXPRESSION);

    dateTodayExpressionEClass = createEClass(DATE_TODAY_EXPRESSION);

    stringLiteralExpressionEClass = createEClass(STRING_LITERAL_EXPRESSION);
    createEAttribute(stringLiteralExpressionEClass, STRING_LITERAL_EXPRESSION__VALUE);

    booleanLiteralExpressionEClass = createEClass(BOOLEAN_LITERAL_EXPRESSION);
    createEAttribute(booleanLiteralExpressionEClass, BOOLEAN_LITERAL_EXPRESSION__LITERAL);

    integerLiteralExpressionEClass = createEClass(INTEGER_LITERAL_EXPRESSION);
    createEAttribute(integerLiteralExpressionEClass, INTEGER_LITERAL_EXPRESSION__VALUE);

    numberLiteralExpressionEClass = createEClass(NUMBER_LITERAL_EXPRESSION);
    createEAttribute(numberLiteralExpressionEClass, NUMBER_LITERAL_EXPRESSION__VALUE);

    callbackResponseExpressionEClass = createEClass(CALLBACK_RESPONSE_EXPRESSION);

    callbackErrorResponseExpressionEClass = createEClass(CALLBACK_ERROR_RESPONSE_EXPRESSION);

    methodCallExpressionEClass = createEClass(METHOD_CALL_EXPRESSION);
    createEReference(methodCallExpressionEClass, METHOD_CALL_EXPRESSION__METHOD_REF);
    createEReference(methodCallExpressionEClass, METHOD_CALL_EXPRESSION__ARGUMENT_LIST);

    booleanBinaryOperatorExpressionEClass = createEClass(BOOLEAN_BINARY_OPERATOR_EXPRESSION);

    arithmeticBinaryOperatorExpressionEClass = createEClass(ARITHMETIC_BINARY_OPERATOR_EXPRESSION);

    binaryOperatorExpressionEClass = createEClass(BINARY_OPERATOR_EXPRESSION);
    createEReference(binaryOperatorExpressionEClass, BINARY_OPERATOR_EXPRESSION__LEFT_OPERAND);
    createEReference(binaryOperatorExpressionEClass, BINARY_OPERATOR_EXPRESSION__RIGHT_OPERAND);

    // Create enums
    viewableTypesEEnum = createEEnum(VIEWABLE_TYPES);
    valueTypesEEnum = createEEnum(VALUE_TYPES);
    groupOrientationsEEnum = createEEnum(GROUP_ORIENTATIONS);
    verticalAlignmentEEnum = createEEnum(VERTICAL_ALIGNMENT);
    assignmentOperatorEEnum = createEEnum(ASSIGNMENT_OPERATOR);
    comparatorEEnum = createEEnum(COMPARATOR);
    additiveOperatorsEEnum = createEEnum(ADDITIVE_OPERATORS);
    multiplicativeOperatorsEEnum = createEEnum(MULTIPLICATIVE_OPERATORS);
    crudTypesEEnum = createEEnum(CRUD_TYPES);
    builtinFunctionsEEnum = createEEnum(BUILTIN_FUNCTIONS);
    booleanLiteralsEEnum = createEEnum(BOOLEAN_LITERALS);
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
    SimBackendDslPackage theSimBackendDslPackage = (SimBackendDslPackage)EPackage.Registry.INSTANCE.getEPackage(SimBackendDslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    tableRowsDefinitionEClass.getESuperTypes().add(this.getTopLevelDefinition());
    viewableEClass.getESuperTypes().add(this.getTopLevelDefinition());
    definedViewableEClass.getESuperTypes().add(this.getViewable());
    manualViewableEClass.getESuperTypes().add(this.getViewable());
    valueDeclarationEClass.getESuperTypes().add(this.getAbstractValueDeclaration());
    valueEClass.getESuperTypes().add(this.getReferable());
    parameterEClass.getESuperTypes().add(this.getReferable());
    methodDefinitionEClass.getESuperTypes().add(this.getTopLevelDefinition());
    methodDefinitionEClass.getESuperTypes().add(this.getLocalViewableDefinition());
    methodEClass.getESuperTypes().add(this.getReferable());
    elementEClass.getESuperTypes().add(this.getLocalViewableDefinition());
    quotationEClass.getESuperTypes().add(this.getElement());
    bindingEClass.getESuperTypes().add(this.getElement());
    componentInvocationEClass.getESuperTypes().add(this.getElement());
    componentInvocationEClass.getESuperTypes().add(this.getViewableCallSite());
    inputElementEClass.getESuperTypes().add(this.getElement());
    buttonElementEClass.getESuperTypes().add(this.getElement());
    blockElementEClass.getESuperTypes().add(this.getElement());
    listElementEClass.getESuperTypes().add(this.getElement());
    listVariableEClass.getESuperTypes().add(this.getReferable());
    tableElementEClass.getESuperTypes().add(this.getElement());
    tableRowsInvocationEClass.getESuperTypes().add(this.getTableBodyElement());
    tableRowEClass.getESuperTypes().add(this.getTableBodyElement());
    labeledTableElementEClass.getESuperTypes().add(this.getElement());
    labeledTableRowEClass.getESuperTypes().add(this.getElement());
    progressBarTabSetEClass.getESuperTypes().add(this.getElement());
    tabDeclarationEClass.getESuperTypes().add(this.getViewableCallSite());
    groupElementEClass.getESuperTypes().add(this.getElement());
    countdownTimerEClass.getESuperTypes().add(this.getElement());
    observeElementEClass.getESuperTypes().add(this.getElement());
    calendarElementEClass.getESuperTypes().add(this.getElement());
    timeSlotListElementEClass.getESuperTypes().add(this.getElement());
    slotAddElementEClass.getESuperTypes().add(this.getElement());
    whenElementEClass.getESuperTypes().add(this.getElement());
    imageElementEClass.getESuperTypes().add(this.getElement());
    frameElementEClass.getESuperTypes().add(this.getElement());
    lineBreakElementEClass.getESuperTypes().add(this.getElement());
    exitingStatementEClass.getESuperTypes().add(this.getStatement());
    nonExitingStatementEClass.getESuperTypes().add(this.getStatement());
    forStatementEClass.getESuperTypes().add(this.getNonExitingStatement());
    listRemoveStatementEClass.getESuperTypes().add(this.getNonExitingStatement());
    assignmentOrExpressionStatementEClass.getESuperTypes().add(this.getNonExitingStatement());
    showModalStatementEClass.getESuperTypes().add(this.getNonExitingStatement());
    showModalStatementEClass.getESuperTypes().add(this.getViewableCallSite());
    exitModalStatementEClass.getESuperTypes().add(this.getNonExitingStatement());
    gotoScreenStatementEClass.getESuperTypes().add(this.getExitingStatement());
    gotoScreenStatementEClass.getESuperTypes().add(this.getViewableCallSite());
    gotoModuleStatementEClass.getESuperTypes().add(this.getExitingStatement());
    ifStatementEClass.getESuperTypes().add(this.getNonExitingStatement());
    localValueDeclarationStatementEClass.getESuperTypes().add(this.getAbstractValueDeclaration());
    localValueDeclarationStatementEClass.getESuperTypes().add(this.getNonExitingStatement());
    dateExpressionEClass.getESuperTypes().add(this.getExpression());
    builtinFunctionExpressionEClass.getESuperTypes().add(this.getExpression());
    literalExpressionEClass.getESuperTypes().add(this.getExpression());
    listLiteralExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
    enumerationLiteralExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
    decisionExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
    callbackExpressionsEClass.getESuperTypes().add(this.getExpression());
    callbackExpressionEClass.getESuperTypes().add(this.getCallbackExpressions());
    structureCreationExpressionEClass.getESuperTypes().add(this.getExpression());
    valueReferenceOrMethodCallExpressionEClass.getESuperTypes().add(this.getExpression());
    referenceExpressionEClass.getESuperTypes().add(this.getValueReferenceOrMethodCallExpression());
    ternaryExpressionEClass.getESuperTypes().add(this.getExpression());
    orExpressionEClass.getESuperTypes().add(this.getBooleanBinaryOperatorExpression());
    andExpressionEClass.getESuperTypes().add(this.getBooleanBinaryOperatorExpression());
    comparisonExpressionEClass.getESuperTypes().add(this.getBinaryOperatorExpression());
    additiveExpressionEClass.getESuperTypes().add(this.getArithmeticBinaryOperatorExpression());
    multiplicativeExpressionEClass.getESuperTypes().add(this.getArithmeticBinaryOperatorExpression());
    notExpressionEClass.getESuperTypes().add(this.getExpression());
    interfaceCallExpressionEClass.getESuperTypes().add(this.getExpression());
    namedServiceReferenceEClass.getESuperTypes().add(this.getServiceIdentification());
    crudServiceIdentificationEClass.getESuperTypes().add(this.getServiceIdentification());
    featureAccessExpressionEClass.getESuperTypes().add(this.getExpression());
    selectionExpressionEClass.getESuperTypes().add(this.getExpression());
    dateNowExpressionEClass.getESuperTypes().add(this.getDateExpression());
    dateTodayExpressionEClass.getESuperTypes().add(this.getDateExpression());
    stringLiteralExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
    booleanLiteralExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
    integerLiteralExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
    numberLiteralExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
    callbackResponseExpressionEClass.getESuperTypes().add(this.getCallbackExpressions());
    callbackErrorResponseExpressionEClass.getESuperTypes().add(this.getCallbackExpressions());
    methodCallExpressionEClass.getESuperTypes().add(this.getValueReferenceOrMethodCallExpression());
    booleanBinaryOperatorExpressionEClass.getESuperTypes().add(this.getBinaryOperatorExpression());
    arithmeticBinaryOperatorExpressionEClass.getESuperTypes().add(this.getBinaryOperatorExpression());
    binaryOperatorExpressionEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(uiModuleEClass, UiModule.class, "UiModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUiModule_NotAuthenticated(), ecorePackage.getEBoolean(), "notAuthenticated", null, 0, 1, UiModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUiModule_Definitions(), this.getTopLevelDefinition(), null, "definitions", null, 0, -1, UiModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(topLevelDefinitionEClass, TopLevelDefinition.class, "TopLevelDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTopLevelDefinition_ParameterList(), this.getParameterList(), null, "parameterList", null, 0, 1, TopLevelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableRowsDefinitionEClass, TableRowsDefinition.class, "TableRowsDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableRowsDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, TableRowsDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableRowsDefinition_Rows(), this.getTableRow(), null, "rows", null, 0, -1, TableRowsDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewableEClass, Viewable.class, "Viewable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getViewable_Type(), this.getViewableTypes(), "type", null, 0, 1, Viewable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getViewable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Viewable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definedViewableEClass, DefinedViewable.class, "DefinedViewable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinedViewable_ValuesBlock(), this.getValuesBlock(), null, "valuesBlock", null, 0, 1, DefinedViewable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefinedViewable_Definitions(), this.getLocalViewableDefinition(), null, "definitions", null, 0, -1, DefinedViewable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(manualViewableEClass, ManualViewable.class, "ManualViewable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getManualViewable_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, ManualViewable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localViewableDefinitionEClass, LocalViewableDefinition.class, "LocalViewableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(valuesBlockEClass, ValuesBlock.class, "ValuesBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValuesBlock_Declarations(), this.getValueDeclaration(), null, "declarations", null, 0, -1, ValuesBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueDeclarationEClass, ValueDeclaration.class, "ValueDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValueDeclaration_ValueType(), this.getValueTypes(), "valueType", null, 0, 1, ValueDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractValueDeclarationEClass, AbstractValueDeclaration.class, "AbstractValueDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractValueDeclaration_Value(), this.getValue(), null, "value", null, 0, 1, AbstractValueDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractValueDeclaration_DeclaredType(), theStructureDslPackage.getTypeLiteral(), null, "declaredType", null, 0, 1, AbstractValueDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractValueDeclaration_ValueExpr(), this.getExpression(), null, "valueExpr", null, 0, 1, AbstractValueDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Type(), theStructureDslPackage.getTypeLiteral(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterList_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodDefinitionEClass, MethodDefinition.class, "MethodDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodDefinition_Method(), this.getMethod(), null, "method", null, 0, 1, MethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodDefinition_StatementBlock(), this.getStatementBlock(), null, "statementBlock", null, 0, 1, MethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(quotationEClass, Quotation.class, "Quotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQuotation_Path(), this.getExpression(), null, "path", null, 0, 1, Quotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinding_BindSite(), this.getExpression(), null, "bindSite", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementBodyEClass, ElementBody.class, "ElementBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementBody_Elements(), this.getElement(), null, "elements", null, 0, -1, ElementBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentInvocationEClass, ComponentInvocation.class, "ComponentInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArgument_Parameter(), this.getParameter(), null, "parameter", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArgument_ValueExpr(), this.getExpression(), null, "valueExpr", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentListEClass, ArgumentList.class, "ArgumentList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArgumentList_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, ArgumentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputElementEClass, InputElement.class, "InputElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInputElement_BindSite(), this.getExpression(), null, "bindSite", null, 0, 1, InputElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInputElement_Hint(), ecorePackage.getEString(), "hint", null, 0, 1, InputElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputElement_MinValue(), this.getExpression(), null, "minValue", null, 0, 1, InputElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputElement_MaxValue(), this.getExpression(), null, "maxValue", null, 0, 1, InputElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputElement_RadioOption(), this.getRadioOption(), null, "radioOption", null, 0, 1, InputElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputElement_OnChange(), this.getExpression(), null, "onChange", null, 0, 1, InputElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputElement_OnSubmit(), this.getExpression(), null, "onSubmit", null, 0, 1, InputElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputElement_StructureOption(), this.getStructureOption(), null, "structureOption", null, 0, 1, InputElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(radioOptionEClass, RadioOption.class, "RadioOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRadioOption_True(), ecorePackage.getEString(), "true", null, 0, 1, RadioOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRadioOption_False(), ecorePackage.getEString(), "false", null, 0, 1, RadioOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structureOptionEClass, StructureOption.class, "StructureOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructureOption_SourceExpr(), this.getExpression(), null, "sourceExpr", null, 0, 1, StructureOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructureOption_DisplayFunction(), this.getMethod(), null, "displayFunction", null, 0, 1, StructureOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonElementEClass, ButtonElement.class, "ButtonElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getButtonElement_Text(), ecorePackage.getEString(), "text", null, 0, 1, ButtonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getButtonElement_Action(), this.getExpression(), null, "action", null, 0, 1, ButtonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButtonElement_CssClass(), ecorePackage.getEString(), "cssClass", null, 0, 1, ButtonElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockElementEClass, BlockElement.class, "BlockElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlockElement_OnClick(), this.getExpression(), null, "onClick", null, 0, 1, BlockElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBlockElement_CssClass(), ecorePackage.getEString(), "cssClass", null, 0, 1, BlockElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBlockElement_BodyCssClass(), ecorePackage.getEString(), "bodyCssClass", null, 0, 1, BlockElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBlockElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, BlockElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBlockElement_Header(), this.getElementBody(), null, "header", null, 0, 1, BlockElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBlockElement_HeaderCssClass(), ecorePackage.getEString(), "headerCssClass", null, 0, 1, BlockElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBlockElement_NoCss(), ecorePackage.getEBoolean(), "noCss", null, 0, 1, BlockElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBlockElement_Body(), this.getElementBody(), null, "body", null, 0, 1, BlockElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listElementEClass, ListElement.class, "ListElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListElement_IndexVariable(), this.getListVariable(), null, "indexVariable", null, 0, 1, ListElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListElement_ValueVariable(), this.getListVariable(), null, "valueVariable", null, 0, 1, ListElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListElement_ListExpression(), this.getExpression(), null, "listExpression", null, 0, 1, ListElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListElement_Body(), this.getElementBody(), null, "body", null, 0, 1, ListElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listVariableEClass, ListVariable.class, "ListVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tableElementEClass, TableElement.class, "TableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableElement_SubElements(), this.getTableBodyElement(), null, "subElements", null, 0, -1, TableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableBodyElementEClass, TableBodyElement.class, "TableBodyElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tableRowsInvocationEClass, TableRowsInvocation.class, "TableRowsInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableRowsInvocation_Definition(), this.getTableRowsDefinition(), null, "definition", null, 0, 1, TableRowsInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableRowsInvocation_ArgumentList(), this.getArgumentList(), null, "argumentList", null, 0, 1, TableRowsInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableRowEClass, TableRow.class, "TableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableRow_Label(), this.getExpression(), null, "label", null, 0, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTableRow_Body(), this.getElementBody(), null, "body", null, 0, 1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labeledTableElementEClass, LabeledTableElement.class, "LabeledTableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLabeledTableElement_Body(), this.getElementBody(), null, "body", null, 0, 1, LabeledTableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labeledTableRowEClass, LabeledTableRow.class, "LabeledTableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLabeledTableRow_Label(), this.getExpression(), null, "label", null, 0, 1, LabeledTableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLabeledTableRow_Body(), this.getElementBody(), null, "body", null, 0, 1, LabeledTableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(progressBarTabSetEClass, ProgressBarTabSet.class, "ProgressBarTabSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgressBarTabSet_Tabs(), this.getTabDeclaration(), null, "tabs", null, 0, -1, ProgressBarTabSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tabDeclarationEClass, TabDeclaration.class, "TabDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTabDeclaration_Header(), this.getElementBody(), null, "header", null, 0, 1, TabDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTabDeclaration_PreviousCallback(), this.getCallbackExpression(), null, "previousCallback", null, 0, 1, TabDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTabDeclaration_NextCallback(), this.getCallbackExpression(), null, "nextCallback", null, 0, 1, TabDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupElementEClass, GroupElement.class, "GroupElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGroupElement_Orientation(), this.getGroupOrientations(), "orientation", null, 0, 1, GroupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGroupElement_V_align(), this.getVerticalAlignment(), "v_align", null, 0, 1, GroupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroupElement_NestedGroups(), this.getGroupElement(), null, "nestedGroups", null, 0, -1, GroupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroupElement_LeafGroups(), this.getElementBody(), null, "leafGroups", null, 0, -1, GroupElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(countdownTimerEClass, CountdownTimer.class, "CountdownTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCountdownTimer_Observed(), ecorePackage.getEBoolean(), "observed", null, 0, 1, CountdownTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCountdownTimer_EndTime(), this.getExpression(), null, "endTime", null, 0, 1, CountdownTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCountdownTimer_OnEnd(), this.getExpression(), null, "onEnd", null, 0, 1, CountdownTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(observeElementEClass, ObserveElement.class, "ObserveElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObserveElement_ObserveExpr(), this.getExpression(), null, "observeExpr", null, 0, 1, ObserveElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObserveElement_StatementBlock(), this.getStatementBlock(), null, "statementBlock", null, 0, 1, ObserveElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(calendarElementEClass, CalendarElement.class, "CalendarElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCalendarElement_Date(), this.getExpression(), null, "date", null, 0, 1, CalendarElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCalendarElement_OnSelect(), this.getExpression(), null, "onSelect", null, 0, 1, CalendarElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCalendarElement_AllowFrom(), this.getExpression(), null, "allowFrom", null, 0, 1, CalendarElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCalendarElement_DateFormat(), ecorePackage.getEString(), "dateFormat", null, 0, 1, CalendarElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCalendarElement_Days(), this.getExpression(), null, "days", null, 0, 1, CalendarElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCalendarElement_CssClass(), ecorePackage.getEString(), "cssClass", null, 0, 1, CalendarElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeSlotListElementEClass, TimeSlotListElement.class, "TimeSlotListElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTimeSlotListElement_Slots(), this.getExpression(), null, "slots", null, 0, 1, TimeSlotListElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTimeSlotListElement_OnSelect(), this.getExpression(), null, "onSelect", null, 0, 1, TimeSlotListElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTimeSlotListElement_OnDelete(), this.getExpression(), null, "onDelete", null, 0, 1, TimeSlotListElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slotAddElementEClass, SlotAddElement.class, "SlotAddElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSlotAddElement_Product(), this.getExpression(), null, "product", null, 0, 1, SlotAddElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlotAddElement_Day(), this.getExpression(), null, "day", null, 0, 1, SlotAddElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlotAddElement_Slots(), this.getExpression(), null, "slots", null, 0, 1, SlotAddElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlotAddElement_StartHour(), this.getExpression(), null, "startHour", null, 0, 1, SlotAddElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSlotAddElement_EndHour(), this.getExpression(), null, "endHour", null, 0, 1, SlotAddElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenElementEClass, WhenElement.class, "WhenElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenElement_Condition(), this.getExpression(), null, "condition", null, 0, 1, WhenElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhenElement_Body(), this.getElementBody(), null, "body", null, 0, 1, WhenElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageElementEClass, ImageElement.class, "ImageElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImageElement_Observed(), ecorePackage.getEBoolean(), "observed", null, 0, 1, ImageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImageElement_SourceUrl(), this.getExpression(), null, "sourceUrl", null, 0, 1, ImageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImageElement_Width(), this.getExpression(), null, "width", null, 0, 1, ImageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImageElement_Height(), this.getExpression(), null, "height", null, 0, 1, ImageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(frameElementEClass, FrameElement.class, "FrameElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFrameElement_SourceUrl(), this.getExpression(), null, "sourceUrl", null, 0, 1, FrameElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFrameElement_Width(), this.getExpression(), null, "width", null, 0, 1, FrameElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFrameElement_Height(), this.getExpression(), null, "height", null, 0, 1, FrameElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lineBreakElementEClass, LineBreakElement.class, "LineBreakElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statementBlockEClass, StatementBlock.class, "StatementBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatementBlock_Statements(), this.getStatement(), null, "statements", null, 0, -1, StatementBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exitingStatementEClass, ExitingStatement.class, "ExitingStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nonExitingStatementEClass, NonExitingStatement.class, "NonExitingStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(forStatementEClass, ForStatement.class, "ForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForStatement_IndexVariable(), this.getListVariable(), null, "indexVariable", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_ValueVariable(), this.getListVariable(), null, "valueVariable", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_ListExpression(), this.getExpression(), null, "listExpression", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForStatement_ThenBlock(), this.getStatementBlock(), null, "thenBlock", null, 0, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listRemoveStatementEClass, ListRemoveStatement.class, "ListRemoveStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListRemoveStatement_ListExpr(), this.getExpression(), null, "listExpr", null, 0, 1, ListRemoveStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListRemoveStatement_Feature(), theStructureDslPackage.getFeature(), null, "feature", null, 0, 1, ListRemoveStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListRemoveStatement_ValueExpr(), this.getExpression(), null, "valueExpr", null, 0, 1, ListRemoveStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListRemoveStatement_IndexVariable(), this.getExpression(), null, "indexVariable", null, 0, 1, ListRemoveStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentOrExpressionStatementEClass, AssignmentOrExpressionStatement.class, "AssignmentOrExpressionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignmentOrExpressionStatement_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, AssignmentOrExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssignmentOrExpressionStatement_Operator(), this.getAssignmentOperator(), "operator", null, 0, 1, AssignmentOrExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignmentOrExpressionStatement_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, AssignmentOrExpressionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(showModalStatementEClass, ShowModalStatement.class, "ShowModalStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getShowModalStatement_Persistent(), ecorePackage.getEBoolean(), "persistent", null, 0, 1, ShowModalStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exitModalStatementEClass, ExitModalStatement.class, "ExitModalStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gotoScreenStatementEClass, GotoScreenStatement.class, "GotoScreenStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gotoModuleStatementEClass, GotoModuleStatement.class, "GotoModuleStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGotoModuleStatement_TargetModule(), this.getUiModule(), null, "targetModule", null, 0, 1, GotoModuleStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGotoModuleStatement_Args(), this.getArgumentList(), null, "args", null, 0, 1, GotoModuleStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGotoModuleStatement_Authenticate(), ecorePackage.getEBoolean(), "authenticate", null, 0, 1, GotoModuleStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGotoModuleStatement_AuthOption(), theSimBackendDslPackage.getAuthenticationDeclaration(), null, "authOption", null, 0, 1, GotoModuleStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGotoModuleStatement_Principal(), this.getPrincipalArgument(), null, "principal", null, 0, 1, GotoModuleStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGotoModuleStatement_Credential(), this.getCredentialArgument(), null, "credential", null, 0, 1, GotoModuleStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGotoModuleStatement_ErrorCallback(), this.getCallbackExpression(), null, "errorCallback", null, 0, 1, GotoModuleStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(principalArgumentEClass, PrincipalArgument.class, "PrincipalArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrincipalArgument_Principal(), theSimBackendDslPackage.getAuthenticationParameter(), null, "principal", null, 0, 1, PrincipalArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrincipalArgument_ValueExpr(), this.getExpression(), null, "valueExpr", null, 0, 1, PrincipalArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(credentialArgumentEClass, CredentialArgument.class, "CredentialArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCredentialArgument_Credential(), theSimBackendDslPackage.getAuthenticationParameter(), null, "credential", null, 0, 1, CredentialArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCredentialArgument_ValueExpr(), this.getExpression(), null, "valueExpr", null, 0, 1, CredentialArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfStatement_Condition(), this.getExpression(), null, "condition", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_ThenBlock(), this.getStatementBlock(), null, "thenBlock", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_ElseBlock(), this.getStatementBlock(), null, "elseBlock", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localValueDeclarationStatementEClass, LocalValueDeclarationStatement.class, "LocalValueDeclarationStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(viewableCallSiteEClass, ViewableCallSite.class, "ViewableCallSite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViewableCallSite_Viewable(), this.getViewable(), null, "viewable", null, 0, 1, ViewableCallSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViewableCallSite_ArgumentList(), this.getArgumentList(), null, "argumentList", null, 0, 1, ViewableCallSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(serviceIdentificationEClass, ServiceIdentification.class, "ServiceIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dateExpressionEClass, DateExpression.class, "DateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(builtinFunctionExpressionEClass, BuiltinFunctionExpression.class, "BuiltinFunctionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuiltinFunctionExpression_Function(), this.getBuiltinFunctions(), "function", null, 0, 1, BuiltinFunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuiltinFunctionExpression_Argument(), this.getExpression(), null, "argument", null, 0, 1, BuiltinFunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuiltinFunctionExpression_SortFeature(), theStructureDslPackage.getFeature(), null, "sortFeature", null, 0, 1, BuiltinFunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalExpressionEClass, LiteralExpression.class, "LiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(listLiteralExpressionEClass, ListLiteralExpression.class, "ListLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListLiteralExpression_Members(), this.getExpression(), null, "members", null, 0, -1, ListLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumerationLiteralExpressionEClass, EnumerationLiteralExpression.class, "EnumerationLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumerationLiteralExpression_Enumeration(), theStructureDslPackage.getEnumeration(), null, "enumeration", null, 0, 1, EnumerationLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumerationLiteralExpression_Literal(), theStructureDslPackage.getEnumerationLiteral(), null, "literal", null, 0, 1, EnumerationLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decisionExpressionEClass, DecisionExpression.class, "DecisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDecisionExpression_Cases(), this.getDecisionCase(), null, "cases", null, 0, -1, DecisionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecisionExpression_DefaultValueExpr(), this.getExpression(), null, "defaultValueExpr", null, 0, 1, DecisionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decisionCaseEClass, DecisionCase.class, "DecisionCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDecisionCase_GuardExpr(), this.getExpression(), null, "guardExpr", null, 0, 1, DecisionCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecisionCase_ValueExpr(), this.getExpression(), null, "valueExpr", null, 0, 1, DecisionCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callbackExpressionsEClass, CallbackExpressions.class, "CallbackExpressions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(callbackExpressionEClass, CallbackExpression.class, "CallbackExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCallbackExpression_StatementBlock(), this.getStatementBlock(), null, "statementBlock", null, 0, 1, CallbackExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structureCreationExpressionEClass, StructureCreationExpression.class, "StructureCreationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructureCreationExpression_Structure(), theStructureDslPackage.getStructure(), null, "structure", null, 0, 1, StructureCreationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructureCreationExpression_Assignments(), this.getFeatureAssignment(), null, "assignments", null, 0, -1, StructureCreationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureAssignmentEClass, FeatureAssignment.class, "FeatureAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureAssignment_Feature(), theStructureDslPackage.getFeature(), null, "feature", null, 0, 1, FeatureAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureAssignment_ValueExpr(), this.getExpression(), null, "valueExpr", null, 0, 1, FeatureAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueReferenceOrMethodCallExpressionEClass, ValueReferenceOrMethodCallExpression.class, "ValueReferenceOrMethodCallExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(referenceExpressionEClass, ReferenceExpression.class, "ReferenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceExpression_Ref(), this.getReferable(), null, "ref", null, 0, 1, ReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referableEClass, Referable.class, "Referable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReferable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Referable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ternaryExpressionEClass, TernaryExpression.class, "TernaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTernaryExpression_Guard(), this.getExpression(), null, "guard", null, 0, 1, TernaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTernaryExpression_ThenExpr(), this.getExpression(), null, "thenExpr", null, 0, 1, TernaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTernaryExpression_ElseExpr(), this.getExpression(), null, "elseExpr", null, 0, 1, TernaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orExpressionEClass, OrExpression.class, "OrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(comparisonExpressionEClass, ComparisonExpression.class, "ComparisonExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComparisonExpression_Comparator(), this.getComparator(), "comparator", null, 0, 1, ComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additiveExpressionEClass, AdditiveExpression.class, "AdditiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAdditiveExpression_Operator(), this.getAdditiveOperators(), "operator", null, 0, 1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicativeExpressionEClass, MultiplicativeExpression.class, "MultiplicativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiplicativeExpression_Operator(), this.getMultiplicativeOperators(), "operator", null, 0, 1, MultiplicativeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notExpressionEClass, NotExpression.class, "NotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNotExpression_Operand(), this.getExpression(), null, "operand", null, 0, 1, NotExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceCallExpressionEClass, InterfaceCallExpression.class, "InterfaceCallExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceCallExpression_ServiceId(), this.getServiceIdentification(), null, "serviceId", null, 0, 1, InterfaceCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceCallExpression_ObserveSites(), this.getExpression(), null, "observeSites", null, 0, -1, InterfaceCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceCallExpression_Input(), this.getExpression(), null, "input", null, 0, 1, InterfaceCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceCallExpression_Callback(), this.getCallbackExpression(), null, "callback", null, 0, 1, InterfaceCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceCallExpression_ErrorCallback(), this.getCallbackExpression(), null, "errorCallback", null, 0, 1, InterfaceCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedServiceReferenceEClass, NamedServiceReference.class, "NamedServiceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamedServiceReference_Service(), theSimBackendDslPackage.getNamedService(), null, "service", null, 0, 1, NamedServiceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(crudServiceIdentificationEClass, CrudServiceIdentification.class, "CrudServiceIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCrudServiceIdentification_CrudType(), this.getCrudTypes(), "crudType", null, 0, 1, CrudServiceIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCrudServiceIdentification_Structure(), theStructureDslPackage.getStructure(), null, "structure", null, 0, 1, CrudServiceIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureAccessExpressionEClass, FeatureAccessExpression.class, "FeatureAccessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureAccessExpression_Previous(), this.getExpression(), null, "previous", null, 0, 1, FeatureAccessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureAccessExpression_Feature(), theStructureDslPackage.getFeature(), null, "feature", null, 0, 1, FeatureAccessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectionExpressionEClass, SelectionExpression.class, "SelectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dateNowExpressionEClass, DateNowExpression.class, "DateNowExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dateTodayExpressionEClass, DateTodayExpression.class, "DateTodayExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringLiteralExpressionEClass, StringLiteralExpression.class, "StringLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteralExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanLiteralExpressionEClass, BooleanLiteralExpression.class, "BooleanLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanLiteralExpression_Literal(), this.getBooleanLiterals(), "literal", null, 0, 1, BooleanLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerLiteralExpressionEClass, IntegerLiteralExpression.class, "IntegerLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerLiteralExpression_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberLiteralExpressionEClass, NumberLiteralExpression.class, "NumberLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberLiteralExpression_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, NumberLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callbackResponseExpressionEClass, CallbackResponseExpression.class, "CallbackResponseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(callbackErrorResponseExpressionEClass, CallbackErrorResponseExpression.class, "CallbackErrorResponseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(methodCallExpressionEClass, MethodCallExpression.class, "MethodCallExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodCallExpression_MethodRef(), this.getReferenceExpression(), null, "methodRef", null, 0, 1, MethodCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodCallExpression_ArgumentList(), this.getArgumentList(), null, "argumentList", null, 0, 1, MethodCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanBinaryOperatorExpressionEClass, BooleanBinaryOperatorExpression.class, "BooleanBinaryOperatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arithmeticBinaryOperatorExpressionEClass, ArithmeticBinaryOperatorExpression.class, "ArithmeticBinaryOperatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(binaryOperatorExpressionEClass, BinaryOperatorExpression.class, "BinaryOperatorExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinaryOperatorExpression_LeftOperand(), this.getExpression(), null, "leftOperand", null, 0, 1, BinaryOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryOperatorExpression_RightOperand(), this.getExpression(), null, "rightOperand", null, 0, 1, BinaryOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(viewableTypesEEnum, ViewableTypes.class, "ViewableTypes");
    addEEnumLiteral(viewableTypesEEnum, ViewableTypes.SCREEN);
    addEEnumLiteral(viewableTypesEEnum, ViewableTypes.COMPONENT);

    initEEnum(valueTypesEEnum, ValueTypes.class, "ValueTypes");
    addEEnumLiteral(valueTypesEEnum, ValueTypes.VARIABLE);
    addEEnumLiteral(valueTypesEEnum, ValueTypes.DERIVED);

    initEEnum(groupOrientationsEEnum, GroupOrientations.class, "GroupOrientations");
    addEEnumLiteral(groupOrientationsEEnum, GroupOrientations.VERTICAL);
    addEEnumLiteral(groupOrientationsEEnum, GroupOrientations.HORIZONTAL);

    initEEnum(verticalAlignmentEEnum, VerticalAlignment.class, "VerticalAlignment");
    addEEnumLiteral(verticalAlignmentEEnum, VerticalAlignment.TOP);
    addEEnumLiteral(verticalAlignmentEEnum, VerticalAlignment.BOTTOM);
    addEEnumLiteral(verticalAlignmentEEnum, VerticalAlignment.MIDDLE);

    initEEnum(assignmentOperatorEEnum, AssignmentOperator.class, "AssignmentOperator");
    addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.ASSIGN);
    addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.ADD);
    addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.SUB);

    initEEnum(comparatorEEnum, Comparator.class, "Comparator");
    addEEnumLiteral(comparatorEEnum, Comparator.EQUALS);
    addEEnumLiteral(comparatorEEnum, Comparator.NOT_EQUALS);
    addEEnumLiteral(comparatorEEnum, Comparator.BIGGER);
    addEEnumLiteral(comparatorEEnum, Comparator.BIGGER_EQUALS);
    addEEnumLiteral(comparatorEEnum, Comparator.SMALLER);
    addEEnumLiteral(comparatorEEnum, Comparator.SMALLER_EQUALS);
    addEEnumLiteral(comparatorEEnum, Comparator.IS_IN);

    initEEnum(additiveOperatorsEEnum, AdditiveOperators.class, "AdditiveOperators");
    addEEnumLiteral(additiveOperatorsEEnum, AdditiveOperators.PLUS);
    addEEnumLiteral(additiveOperatorsEEnum, AdditiveOperators.MINUS);

    initEEnum(multiplicativeOperatorsEEnum, MultiplicativeOperators.class, "MultiplicativeOperators");
    addEEnumLiteral(multiplicativeOperatorsEEnum, MultiplicativeOperators.MULT);
    addEEnumLiteral(multiplicativeOperatorsEEnum, MultiplicativeOperators.DIV);
    addEEnumLiteral(multiplicativeOperatorsEEnum, MultiplicativeOperators.MOD);

    initEEnum(crudTypesEEnum, CrudTypes.class, "CrudTypes");
    addEEnumLiteral(crudTypesEEnum, CrudTypes.CREATE);
    addEEnumLiteral(crudTypesEEnum, CrudTypes.GET_BY_ID);
    addEEnumLiteral(crudTypesEEnum, CrudTypes.UPDATE);
    addEEnumLiteral(crudTypesEEnum, CrudTypes.DELETE);

    initEEnum(builtinFunctionsEEnum, BuiltinFunctions.class, "BuiltinFunctions");
    addEEnumLiteral(builtinFunctionsEEnum, BuiltinFunctions.IS_SET);
    addEEnumLiteral(builtinFunctionsEEnum, BuiltinFunctions.ALERT);
    addEEnumLiteral(builtinFunctionsEEnum, BuiltinFunctions.CONFIRM);
    addEEnumLiteral(builtinFunctionsEEnum, BuiltinFunctions.COPY_OF);
    addEEnumLiteral(builtinFunctionsEEnum, BuiltinFunctions.TO_MILLIS);
    addEEnumLiteral(builtinFunctionsEEnum, BuiltinFunctions.ROUND);
    addEEnumLiteral(builtinFunctionsEEnum, BuiltinFunctions.SORT);
    addEEnumLiteral(builtinFunctionsEEnum, BuiltinFunctions.IS_VALID);
    addEEnumLiteral(builtinFunctionsEEnum, BuiltinFunctions.ID);

    initEEnum(booleanLiteralsEEnum, BooleanLiterals.class, "BooleanLiterals");
    addEEnumLiteral(booleanLiteralsEEnum, BooleanLiterals.FALSE);
    addEEnumLiteral(booleanLiteralsEEnum, BooleanLiterals.TRUE);

    // Create resource
    createResource(eNS_URI);
  }

} //SimUiDslPackageImpl

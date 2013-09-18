/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression#getCases <em>Cases</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression#getDefaultValueExpr <em>Default Value Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getDecisionExpression()
 * @model
 * @generated
 */
public interface DecisionExpression extends LiteralExpression
{
  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.ui.simUiDsl.DecisionCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getDecisionExpression_Cases()
   * @model containment="true"
   * @generated
   */
  EList<DecisionCase> getCases();

  /**
   * Returns the value of the '<em><b>Default Value Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value Expr</em>' containment reference.
   * @see #setDefaultValueExpr(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getDecisionExpression_DefaultValueExpr()
   * @model containment="true"
   * @generated
   */
  Expression getDefaultValueExpr();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression#getDefaultValueExpr <em>Default Value Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value Expr</em>' containment reference.
   * @see #getDefaultValueExpr()
   * @generated
   */
  void setDefaultValueExpr(Expression value);

} // DecisionExpression

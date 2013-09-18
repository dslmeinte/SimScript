/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ternary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression#getGuard <em>Guard</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression#getThenExpr <em>Then Expr</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression#getElseExpr <em>Else Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTernaryExpression()
 * @model
 * @generated
 */
public interface TernaryExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTernaryExpression_Guard()
   * @model containment="true"
   * @generated
   */
  Expression getGuard();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Expression value);

  /**
   * Returns the value of the '<em><b>Then Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Expr</em>' containment reference.
   * @see #setThenExpr(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTernaryExpression_ThenExpr()
   * @model containment="true"
   * @generated
   */
  Expression getThenExpr();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression#getThenExpr <em>Then Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Expr</em>' containment reference.
   * @see #getThenExpr()
   * @generated
   */
  void setThenExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Else Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Expr</em>' containment reference.
   * @see #setElseExpr(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTernaryExpression_ElseExpr()
   * @model containment="true"
   * @generated
   */
  Expression getElseExpr();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression#getElseExpr <em>Else Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Expr</em>' containment reference.
   * @see #getElseExpr()
   * @generated
   */
  void setElseExpr(Expression value);

} // TernaryExpression

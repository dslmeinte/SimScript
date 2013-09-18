/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callback Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression#getStatementBlock <em>Statement Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCallbackExpression()
 * @model
 * @generated
 */
public interface CallbackExpression extends CallbackExpressions
{
  /**
   * Returns the value of the '<em><b>Statement Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement Block</em>' containment reference.
   * @see #setStatementBlock(StatementBlock)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCallbackExpression_StatementBlock()
   * @model containment="true"
   * @generated
   */
  StatementBlock getStatementBlock();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression#getStatementBlock <em>Statement Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement Block</em>' containment reference.
   * @see #getStatementBlock()
   * @generated
   */
  void setStatementBlock(StatementBlock value);

} // CallbackExpression

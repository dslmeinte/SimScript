/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getIndexVariable <em>Index Variable</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getValueVariable <em>Value Variable</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getListExpression <em>List Expression</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getThenBlock <em>Then Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends NonExitingStatement
{
  /**
   * Returns the value of the '<em><b>Index Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index Variable</em>' containment reference.
   * @see #setIndexVariable(ListVariable)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getForStatement_IndexVariable()
   * @model containment="true"
   * @generated
   */
  ListVariable getIndexVariable();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getIndexVariable <em>Index Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index Variable</em>' containment reference.
   * @see #getIndexVariable()
   * @generated
   */
  void setIndexVariable(ListVariable value);

  /**
   * Returns the value of the '<em><b>Value Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Variable</em>' containment reference.
   * @see #setValueVariable(ListVariable)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getForStatement_ValueVariable()
   * @model containment="true"
   * @generated
   */
  ListVariable getValueVariable();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getValueVariable <em>Value Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Variable</em>' containment reference.
   * @see #getValueVariable()
   * @generated
   */
  void setValueVariable(ListVariable value);

  /**
   * Returns the value of the '<em><b>List Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Expression</em>' containment reference.
   * @see #setListExpression(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getForStatement_ListExpression()
   * @model containment="true"
   * @generated
   */
  Expression getListExpression();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getListExpression <em>List Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Expression</em>' containment reference.
   * @see #getListExpression()
   * @generated
   */
  void setListExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Then Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Block</em>' containment reference.
   * @see #setThenBlock(StatementBlock)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getForStatement_ThenBlock()
   * @model containment="true"
   * @generated
   */
  StatementBlock getThenBlock();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ForStatement#getThenBlock <em>Then Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Block</em>' containment reference.
   * @see #getThenBlock()
   * @generated
   */
  void setThenBlock(StatementBlock value);

} // ForStatement

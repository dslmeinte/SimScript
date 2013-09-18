/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getIndexVariable <em>Index Variable</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getValueVariable <em>Value Variable</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getListExpression <em>List Expression</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getListElement()
 * @model
 * @generated
 */
public interface ListElement extends Element
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
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getListElement_IndexVariable()
   * @model containment="true"
   * @generated
   */
  ListVariable getIndexVariable();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getIndexVariable <em>Index Variable</em>}' containment reference.
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
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getListElement_ValueVariable()
   * @model containment="true"
   * @generated
   */
  ListVariable getValueVariable();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getValueVariable <em>Value Variable</em>}' containment reference.
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
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getListElement_ListExpression()
   * @model containment="true"
   * @generated
   */
  Expression getListExpression();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getListExpression <em>List Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Expression</em>' containment reference.
   * @see #getListExpression()
   * @generated
   */
  void setListExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(ElementBody)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getListElement_Body()
   * @model containment="true"
   * @generated
   */
  ElementBody getBody();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListElement#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ElementBody value);

} // ListElement

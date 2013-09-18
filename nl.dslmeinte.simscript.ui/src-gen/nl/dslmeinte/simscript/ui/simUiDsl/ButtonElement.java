/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement#getText <em>Text</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement#getAction <em>Action</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement#getCssClass <em>Css Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getButtonElement()
 * @model
 * @generated
 */
public interface ButtonElement extends Element
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getButtonElement_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getButtonElement_Action()
   * @model containment="true"
   * @generated
   */
  Expression getAction();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Expression value);

  /**
   * Returns the value of the '<em><b>Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Css Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Css Class</em>' attribute.
   * @see #setCssClass(String)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getButtonElement_CssClass()
   * @model
   * @generated
   */
  String getCssClass();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement#getCssClass <em>Css Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Css Class</em>' attribute.
   * @see #getCssClass()
   * @generated
   */
  void setCssClass(String value);

} // ButtonElement

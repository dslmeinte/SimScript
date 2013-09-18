/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Table Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableElement#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getLabeledTableElement()
 * @model
 * @generated
 */
public interface LabeledTableElement extends Element
{
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
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getLabeledTableElement_Body()
   * @model containment="true"
   * @generated
   */
  ElementBody getBody();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableElement#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ElementBody value);

} // LabeledTableElement

/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#isObserved <em>Observed</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#getSourceUrl <em>Source Url</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#getWidth <em>Width</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getImageElement()
 * @model
 * @generated
 */
public interface ImageElement extends Element
{
  /**
   * Returns the value of the '<em><b>Observed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Observed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Observed</em>' attribute.
   * @see #setObserved(boolean)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getImageElement_Observed()
   * @model
   * @generated
   */
  boolean isObserved();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#isObserved <em>Observed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Observed</em>' attribute.
   * @see #isObserved()
   * @generated
   */
  void setObserved(boolean value);

  /**
   * Returns the value of the '<em><b>Source Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Url</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Url</em>' containment reference.
   * @see #setSourceUrl(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getImageElement_SourceUrl()
   * @model containment="true"
   * @generated
   */
  Expression getSourceUrl();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#getSourceUrl <em>Source Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Url</em>' containment reference.
   * @see #getSourceUrl()
   * @generated
   */
  void setSourceUrl(Expression value);

  /**
   * Returns the value of the '<em><b>Width</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' containment reference.
   * @see #setWidth(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getImageElement_Width()
   * @model containment="true"
   * @generated
   */
  Expression getWidth();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#getWidth <em>Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' containment reference.
   * @see #getWidth()
   * @generated
   */
  void setWidth(Expression value);

  /**
   * Returns the value of the '<em><b>Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' containment reference.
   * @see #setHeight(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getImageElement_Height()
   * @model containment="true"
   * @generated
   */
  Expression getHeight();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ImageElement#getHeight <em>Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' containment reference.
   * @see #getHeight()
   * @generated
   */
  void setHeight(Expression value);

} // ImageElement

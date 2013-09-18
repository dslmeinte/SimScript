/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.Binding#getBindSite <em>Bind Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends Element
{
  /**
   * Returns the value of the '<em><b>Bind Site</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bind Site</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bind Site</em>' containment reference.
   * @see #setBindSite(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBinding_BindSite()
   * @model containment="true"
   * @generated
   */
  Expression getBindSite();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.Binding#getBindSite <em>Bind Site</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bind Site</em>' containment reference.
   * @see #getBindSite()
   * @generated
   */
  void setBindSite(Expression value);

} // Binding

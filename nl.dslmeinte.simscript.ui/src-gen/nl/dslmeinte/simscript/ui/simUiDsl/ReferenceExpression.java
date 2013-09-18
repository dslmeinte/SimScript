/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ReferenceExpression#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getReferenceExpression()
 * @model
 * @generated
 */
public interface ReferenceExpression extends ValueReferenceOrMethodCallExpression
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Referable)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getReferenceExpression_Ref()
   * @model
   * @generated
   */
  Referable getRef();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ReferenceExpression#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Referable value);

} // ReferenceExpression

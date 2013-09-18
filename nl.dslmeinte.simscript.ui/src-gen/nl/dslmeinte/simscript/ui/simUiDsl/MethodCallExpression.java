/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression#getMethodRef <em>Method Ref</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getMethodCallExpression()
 * @model
 * @generated
 */
public interface MethodCallExpression extends ValueReferenceOrMethodCallExpression
{
  /**
   * Returns the value of the '<em><b>Method Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Ref</em>' containment reference.
   * @see #setMethodRef(ReferenceExpression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getMethodCallExpression_MethodRef()
   * @model containment="true"
   * @generated
   */
  ReferenceExpression getMethodRef();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression#getMethodRef <em>Method Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Ref</em>' containment reference.
   * @see #getMethodRef()
   * @generated
   */
  void setMethodRef(ReferenceExpression value);

  /**
   * Returns the value of the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument List</em>' containment reference.
   * @see #setArgumentList(ArgumentList)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getMethodCallExpression_ArgumentList()
   * @model containment="true"
   * @generated
   */
  ArgumentList getArgumentList();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression#getArgumentList <em>Argument List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument List</em>' containment reference.
   * @see #getArgumentList()
   * @generated
   */
  void setArgumentList(ArgumentList value);

} // MethodCallExpression

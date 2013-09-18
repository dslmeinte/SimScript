/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getServiceId <em>Service Id</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getObserveSites <em>Observe Sites</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getInput <em>Input</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getCallback <em>Callback</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getErrorCallback <em>Error Callback</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getInterfaceCallExpression()
 * @model
 * @generated
 */
public interface InterfaceCallExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Service Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Id</em>' containment reference.
   * @see #setServiceId(ServiceIdentification)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getInterfaceCallExpression_ServiceId()
   * @model containment="true"
   * @generated
   */
  ServiceIdentification getServiceId();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getServiceId <em>Service Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service Id</em>' containment reference.
   * @see #getServiceId()
   * @generated
   */
  void setServiceId(ServiceIdentification value);

  /**
   * Returns the value of the '<em><b>Observe Sites</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.ui.simUiDsl.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Observe Sites</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Observe Sites</em>' containment reference list.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getInterfaceCallExpression_ObserveSites()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getObserveSites();

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getInterfaceCallExpression_Input()
   * @model containment="true"
   * @generated
   */
  Expression getInput();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(Expression value);

  /**
   * Returns the value of the '<em><b>Callback</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Callback</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Callback</em>' containment reference.
   * @see #setCallback(CallbackExpression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getInterfaceCallExpression_Callback()
   * @model containment="true"
   * @generated
   */
  CallbackExpression getCallback();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getCallback <em>Callback</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Callback</em>' containment reference.
   * @see #getCallback()
   * @generated
   */
  void setCallback(CallbackExpression value);

  /**
   * Returns the value of the '<em><b>Error Callback</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error Callback</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error Callback</em>' containment reference.
   * @see #setErrorCallback(CallbackExpression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getInterfaceCallExpression_ErrorCallback()
   * @model containment="true"
   * @generated
   */
  CallbackExpression getErrorCallback();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression#getErrorCallback <em>Error Callback</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error Callback</em>' containment reference.
   * @see #getErrorCallback()
   * @generated
   */
  void setErrorCallback(CallbackExpression value);

} // InterfaceCallExpression

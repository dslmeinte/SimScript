/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration#getHeader <em>Header</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration#getPreviousCallback <em>Previous Callback</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration#getNextCallback <em>Next Callback</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTabDeclaration()
 * @model
 * @generated
 */
public interface TabDeclaration extends ViewableCallSite
{
  /**
   * Returns the value of the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' containment reference.
   * @see #setHeader(ElementBody)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTabDeclaration_Header()
   * @model containment="true"
   * @generated
   */
  ElementBody getHeader();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration#getHeader <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' containment reference.
   * @see #getHeader()
   * @generated
   */
  void setHeader(ElementBody value);

  /**
   * Returns the value of the '<em><b>Previous Callback</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Previous Callback</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Previous Callback</em>' containment reference.
   * @see #setPreviousCallback(CallbackExpression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTabDeclaration_PreviousCallback()
   * @model containment="true"
   * @generated
   */
  CallbackExpression getPreviousCallback();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration#getPreviousCallback <em>Previous Callback</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Previous Callback</em>' containment reference.
   * @see #getPreviousCallback()
   * @generated
   */
  void setPreviousCallback(CallbackExpression value);

  /**
   * Returns the value of the '<em><b>Next Callback</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Callback</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Callback</em>' containment reference.
   * @see #setNextCallback(CallbackExpression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTabDeclaration_NextCallback()
   * @model containment="true"
   * @generated
   */
  CallbackExpression getNextCallback();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration#getNextCallback <em>Next Callback</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next Callback</em>' containment reference.
   * @see #getNextCallback()
   * @generated
   */
  void setNextCallback(CallbackExpression value);

} // TabDeclaration

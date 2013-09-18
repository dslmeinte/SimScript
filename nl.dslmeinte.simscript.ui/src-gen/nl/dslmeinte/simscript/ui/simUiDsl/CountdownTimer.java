/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Countdown Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer#isObserved <em>Observed</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer#getEndTime <em>End Time</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer#getOnEnd <em>On End</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCountdownTimer()
 * @model
 * @generated
 */
public interface CountdownTimer extends Element
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
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCountdownTimer_Observed()
   * @model
   * @generated
   */
  boolean isObserved();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer#isObserved <em>Observed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Observed</em>' attribute.
   * @see #isObserved()
   * @generated
   */
  void setObserved(boolean value);

  /**
   * Returns the value of the '<em><b>End Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Time</em>' containment reference.
   * @see #setEndTime(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCountdownTimer_EndTime()
   * @model containment="true"
   * @generated
   */
  Expression getEndTime();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer#getEndTime <em>End Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Time</em>' containment reference.
   * @see #getEndTime()
   * @generated
   */
  void setEndTime(Expression value);

  /**
   * Returns the value of the '<em><b>On End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On End</em>' containment reference.
   * @see #setOnEnd(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCountdownTimer_OnEnd()
   * @model containment="true"
   * @generated
   */
  Expression getOnEnd();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer#getOnEnd <em>On End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On End</em>' containment reference.
   * @see #getOnEnd()
   * @generated
   */
  void setOnEnd(Expression value);

} // CountdownTimer

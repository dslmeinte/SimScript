/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Slot List Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement#getSlots <em>Slots</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement#getOnSelect <em>On Select</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement#getOnDelete <em>On Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTimeSlotListElement()
 * @model
 * @generated
 */
public interface TimeSlotListElement extends Element
{
  /**
   * Returns the value of the '<em><b>Slots</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Slots</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Slots</em>' containment reference.
   * @see #setSlots(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTimeSlotListElement_Slots()
   * @model containment="true"
   * @generated
   */
  Expression getSlots();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement#getSlots <em>Slots</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Slots</em>' containment reference.
   * @see #getSlots()
   * @generated
   */
  void setSlots(Expression value);

  /**
   * Returns the value of the '<em><b>On Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Select</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Select</em>' containment reference.
   * @see #setOnSelect(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTimeSlotListElement_OnSelect()
   * @model containment="true"
   * @generated
   */
  Expression getOnSelect();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement#getOnSelect <em>On Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On Select</em>' containment reference.
   * @see #getOnSelect()
   * @generated
   */
  void setOnSelect(Expression value);

  /**
   * Returns the value of the '<em><b>On Delete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Delete</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Delete</em>' containment reference.
   * @see #setOnDelete(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTimeSlotListElement_OnDelete()
   * @model containment="true"
   * @generated
   */
  Expression getOnDelete();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement#getOnDelete <em>On Delete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On Delete</em>' containment reference.
   * @see #getOnDelete()
   * @generated
   */
  void setOnDelete(Expression value);

} // TimeSlotListElement

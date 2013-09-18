/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calendar Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getDate <em>Date</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getOnSelect <em>On Select</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getAllowFrom <em>Allow From</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getDays <em>Days</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getCssClass <em>Css Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCalendarElement()
 * @model
 * @generated
 */
public interface CalendarElement extends Element
{
  /**
   * Returns the value of the '<em><b>Date</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' containment reference.
   * @see #setDate(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCalendarElement_Date()
   * @model containment="true"
   * @generated
   */
  Expression getDate();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getDate <em>Date</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' containment reference.
   * @see #getDate()
   * @generated
   */
  void setDate(Expression value);

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
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCalendarElement_OnSelect()
   * @model containment="true"
   * @generated
   */
  Expression getOnSelect();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getOnSelect <em>On Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On Select</em>' containment reference.
   * @see #getOnSelect()
   * @generated
   */
  void setOnSelect(Expression value);

  /**
   * Returns the value of the '<em><b>Allow From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Allow From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Allow From</em>' containment reference.
   * @see #setAllowFrom(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCalendarElement_AllowFrom()
   * @model containment="true"
   * @generated
   */
  Expression getAllowFrom();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getAllowFrom <em>Allow From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Allow From</em>' containment reference.
   * @see #getAllowFrom()
   * @generated
   */
  void setAllowFrom(Expression value);

  /**
   * Returns the value of the '<em><b>Date Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date Format</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date Format</em>' attribute.
   * @see #setDateFormat(String)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCalendarElement_DateFormat()
   * @model
   * @generated
   */
  String getDateFormat();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getDateFormat <em>Date Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date Format</em>' attribute.
   * @see #getDateFormat()
   * @generated
   */
  void setDateFormat(String value);

  /**
   * Returns the value of the '<em><b>Days</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Days</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Days</em>' containment reference.
   * @see #setDays(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCalendarElement_Days()
   * @model containment="true"
   * @generated
   */
  Expression getDays();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getDays <em>Days</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Days</em>' containment reference.
   * @see #getDays()
   * @generated
   */
  void setDays(Expression value);

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
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCalendarElement_CssClass()
   * @model
   * @generated
   */
  String getCssClass();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement#getCssClass <em>Css Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Css Class</em>' attribute.
   * @see #getCssClass()
   * @generated
   */
  void setCssClass(String value);

} // CalendarElement

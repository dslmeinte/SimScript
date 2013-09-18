/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement;
import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calendar Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CalendarElementImpl#getDate <em>Date</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CalendarElementImpl#getOnSelect <em>On Select</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CalendarElementImpl#getAllowFrom <em>Allow From</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CalendarElementImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CalendarElementImpl#getDays <em>Days</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CalendarElementImpl#getCssClass <em>Css Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CalendarElementImpl extends ElementImpl implements CalendarElement
{
  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected Expression date;

  /**
   * The cached value of the '{@link #getOnSelect() <em>On Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnSelect()
   * @generated
   * @ordered
   */
  protected Expression onSelect;

  /**
   * The cached value of the '{@link #getAllowFrom() <em>Allow From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllowFrom()
   * @generated
   * @ordered
   */
  protected Expression allowFrom;

  /**
   * The default value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateFormat()
   * @generated
   * @ordered
   */
  protected static final String DATE_FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateFormat()
   * @generated
   * @ordered
   */
  protected String dateFormat = DATE_FORMAT_EDEFAULT;

  /**
   * The cached value of the '{@link #getDays() <em>Days</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDays()
   * @generated
   * @ordered
   */
  protected Expression days;

  /**
   * The default value of the '{@link #getCssClass() <em>Css Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCssClass()
   * @generated
   * @ordered
   */
  protected static final String CSS_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCssClass() <em>Css Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCssClass()
   * @generated
   * @ordered
   */
  protected String cssClass = CSS_CLASS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CalendarElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SimUiDslPackage.Literals.CALENDAR_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDate(Expression newDate, NotificationChain msgs)
  {
    Expression oldDate = date;
    date = newDate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.CALENDAR_ELEMENT__DATE, oldDate, newDate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(Expression newDate)
  {
    if (newDate != date)
    {
      NotificationChain msgs = null;
      if (date != null)
        msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.CALENDAR_ELEMENT__DATE, null, msgs);
      if (newDate != null)
        msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.CALENDAR_ELEMENT__DATE, null, msgs);
      msgs = basicSetDate(newDate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.CALENDAR_ELEMENT__DATE, newDate, newDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getOnSelect()
  {
    return onSelect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOnSelect(Expression newOnSelect, NotificationChain msgs)
  {
    Expression oldOnSelect = onSelect;
    onSelect = newOnSelect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.CALENDAR_ELEMENT__ON_SELECT, oldOnSelect, newOnSelect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnSelect(Expression newOnSelect)
  {
    if (newOnSelect != onSelect)
    {
      NotificationChain msgs = null;
      if (onSelect != null)
        msgs = ((InternalEObject)onSelect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.CALENDAR_ELEMENT__ON_SELECT, null, msgs);
      if (newOnSelect != null)
        msgs = ((InternalEObject)newOnSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.CALENDAR_ELEMENT__ON_SELECT, null, msgs);
      msgs = basicSetOnSelect(newOnSelect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.CALENDAR_ELEMENT__ON_SELECT, newOnSelect, newOnSelect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getAllowFrom()
  {
    return allowFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAllowFrom(Expression newAllowFrom, NotificationChain msgs)
  {
    Expression oldAllowFrom = allowFrom;
    allowFrom = newAllowFrom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.CALENDAR_ELEMENT__ALLOW_FROM, oldAllowFrom, newAllowFrom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllowFrom(Expression newAllowFrom)
  {
    if (newAllowFrom != allowFrom)
    {
      NotificationChain msgs = null;
      if (allowFrom != null)
        msgs = ((InternalEObject)allowFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.CALENDAR_ELEMENT__ALLOW_FROM, null, msgs);
      if (newAllowFrom != null)
        msgs = ((InternalEObject)newAllowFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.CALENDAR_ELEMENT__ALLOW_FROM, null, msgs);
      msgs = basicSetAllowFrom(newAllowFrom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.CALENDAR_ELEMENT__ALLOW_FROM, newAllowFrom, newAllowFrom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDateFormat()
  {
    return dateFormat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDateFormat(String newDateFormat)
  {
    String oldDateFormat = dateFormat;
    dateFormat = newDateFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.CALENDAR_ELEMENT__DATE_FORMAT, oldDateFormat, dateFormat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDays()
  {
    return days;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDays(Expression newDays, NotificationChain msgs)
  {
    Expression oldDays = days;
    days = newDays;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.CALENDAR_ELEMENT__DAYS, oldDays, newDays);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDays(Expression newDays)
  {
    if (newDays != days)
    {
      NotificationChain msgs = null;
      if (days != null)
        msgs = ((InternalEObject)days).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.CALENDAR_ELEMENT__DAYS, null, msgs);
      if (newDays != null)
        msgs = ((InternalEObject)newDays).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.CALENDAR_ELEMENT__DAYS, null, msgs);
      msgs = basicSetDays(newDays, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.CALENDAR_ELEMENT__DAYS, newDays, newDays));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCssClass()
  {
    return cssClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCssClass(String newCssClass)
  {
    String oldCssClass = cssClass;
    cssClass = newCssClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.CALENDAR_ELEMENT__CSS_CLASS, oldCssClass, cssClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SimUiDslPackage.CALENDAR_ELEMENT__DATE:
        return basicSetDate(null, msgs);
      case SimUiDslPackage.CALENDAR_ELEMENT__ON_SELECT:
        return basicSetOnSelect(null, msgs);
      case SimUiDslPackage.CALENDAR_ELEMENT__ALLOW_FROM:
        return basicSetAllowFrom(null, msgs);
      case SimUiDslPackage.CALENDAR_ELEMENT__DAYS:
        return basicSetDays(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SimUiDslPackage.CALENDAR_ELEMENT__DATE:
        return getDate();
      case SimUiDslPackage.CALENDAR_ELEMENT__ON_SELECT:
        return getOnSelect();
      case SimUiDslPackage.CALENDAR_ELEMENT__ALLOW_FROM:
        return getAllowFrom();
      case SimUiDslPackage.CALENDAR_ELEMENT__DATE_FORMAT:
        return getDateFormat();
      case SimUiDslPackage.CALENDAR_ELEMENT__DAYS:
        return getDays();
      case SimUiDslPackage.CALENDAR_ELEMENT__CSS_CLASS:
        return getCssClass();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimUiDslPackage.CALENDAR_ELEMENT__DATE:
        setDate((Expression)newValue);
        return;
      case SimUiDslPackage.CALENDAR_ELEMENT__ON_SELECT:
        setOnSelect((Expression)newValue);
        return;
      case SimUiDslPackage.CALENDAR_ELEMENT__ALLOW_FROM:
        setAllowFrom((Expression)newValue);
        return;
      case SimUiDslPackage.CALENDAR_ELEMENT__DATE_FORMAT:
        setDateFormat((String)newValue);
        return;
      case SimUiDslPackage.CALENDAR_ELEMENT__DAYS:
        setDays((Expression)newValue);
        return;
      case SimUiDslPackage.CALENDAR_ELEMENT__CSS_CLASS:
        setCssClass((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SimUiDslPackage.CALENDAR_ELEMENT__DATE:
        setDate((Expression)null);
        return;
      case SimUiDslPackage.CALENDAR_ELEMENT__ON_SELECT:
        setOnSelect((Expression)null);
        return;
      case SimUiDslPackage.CALENDAR_ELEMENT__ALLOW_FROM:
        setAllowFrom((Expression)null);
        return;
      case SimUiDslPackage.CALENDAR_ELEMENT__DATE_FORMAT:
        setDateFormat(DATE_FORMAT_EDEFAULT);
        return;
      case SimUiDslPackage.CALENDAR_ELEMENT__DAYS:
        setDays((Expression)null);
        return;
      case SimUiDslPackage.CALENDAR_ELEMENT__CSS_CLASS:
        setCssClass(CSS_CLASS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SimUiDslPackage.CALENDAR_ELEMENT__DATE:
        return date != null;
      case SimUiDslPackage.CALENDAR_ELEMENT__ON_SELECT:
        return onSelect != null;
      case SimUiDslPackage.CALENDAR_ELEMENT__ALLOW_FROM:
        return allowFrom != null;
      case SimUiDslPackage.CALENDAR_ELEMENT__DATE_FORMAT:
        return DATE_FORMAT_EDEFAULT == null ? dateFormat != null : !DATE_FORMAT_EDEFAULT.equals(dateFormat);
      case SimUiDslPackage.CALENDAR_ELEMENT__DAYS:
        return days != null;
      case SimUiDslPackage.CALENDAR_ELEMENT__CSS_CLASS:
        return CSS_CLASS_EDEFAULT == null ? cssClass != null : !CSS_CLASS_EDEFAULT.equals(cssClass);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (dateFormat: ");
    result.append(dateFormat);
    result.append(", cssClass: ");
    result.append(cssClass);
    result.append(')');
    return result.toString();
  }

} //CalendarElementImpl

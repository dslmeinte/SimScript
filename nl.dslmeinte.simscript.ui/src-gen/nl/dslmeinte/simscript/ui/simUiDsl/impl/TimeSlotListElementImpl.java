/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Slot List Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TimeSlotListElementImpl#getSlots <em>Slots</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TimeSlotListElementImpl#getOnSelect <em>On Select</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TimeSlotListElementImpl#getOnDelete <em>On Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeSlotListElementImpl extends ElementImpl implements TimeSlotListElement
{
  /**
   * The cached value of the '{@link #getSlots() <em>Slots</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlots()
   * @generated
   * @ordered
   */
  protected Expression slots;

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
   * The cached value of the '{@link #getOnDelete() <em>On Delete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnDelete()
   * @generated
   * @ordered
   */
  protected Expression onDelete;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeSlotListElementImpl()
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
    return SimUiDslPackage.Literals.TIME_SLOT_LIST_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSlots()
  {
    return slots;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSlots(Expression newSlots, NotificationChain msgs)
  {
    Expression oldSlots = slots;
    slots = newSlots;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__SLOTS, oldSlots, newSlots);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSlots(Expression newSlots)
  {
    if (newSlots != slots)
    {
      NotificationChain msgs = null;
      if (slots != null)
        msgs = ((InternalEObject)slots).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__SLOTS, null, msgs);
      if (newSlots != null)
        msgs = ((InternalEObject)newSlots).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__SLOTS, null, msgs);
      msgs = basicSetSlots(newSlots, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__SLOTS, newSlots, newSlots));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_SELECT, oldOnSelect, newOnSelect);
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
        msgs = ((InternalEObject)onSelect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_SELECT, null, msgs);
      if (newOnSelect != null)
        msgs = ((InternalEObject)newOnSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_SELECT, null, msgs);
      msgs = basicSetOnSelect(newOnSelect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_SELECT, newOnSelect, newOnSelect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getOnDelete()
  {
    return onDelete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOnDelete(Expression newOnDelete, NotificationChain msgs)
  {
    Expression oldOnDelete = onDelete;
    onDelete = newOnDelete;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_DELETE, oldOnDelete, newOnDelete);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnDelete(Expression newOnDelete)
  {
    if (newOnDelete != onDelete)
    {
      NotificationChain msgs = null;
      if (onDelete != null)
        msgs = ((InternalEObject)onDelete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_DELETE, null, msgs);
      if (newOnDelete != null)
        msgs = ((InternalEObject)newOnDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_DELETE, null, msgs);
      msgs = basicSetOnDelete(newOnDelete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_DELETE, newOnDelete, newOnDelete));
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
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__SLOTS:
        return basicSetSlots(null, msgs);
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_SELECT:
        return basicSetOnSelect(null, msgs);
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_DELETE:
        return basicSetOnDelete(null, msgs);
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
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__SLOTS:
        return getSlots();
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_SELECT:
        return getOnSelect();
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_DELETE:
        return getOnDelete();
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
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__SLOTS:
        setSlots((Expression)newValue);
        return;
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_SELECT:
        setOnSelect((Expression)newValue);
        return;
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_DELETE:
        setOnDelete((Expression)newValue);
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
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__SLOTS:
        setSlots((Expression)null);
        return;
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_SELECT:
        setOnSelect((Expression)null);
        return;
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_DELETE:
        setOnDelete((Expression)null);
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
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__SLOTS:
        return slots != null;
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_SELECT:
        return onSelect != null;
      case SimUiDslPackage.TIME_SLOT_LIST_ELEMENT__ON_DELETE:
        return onDelete != null;
    }
    return super.eIsSet(featureID);
  }

} //TimeSlotListElementImpl

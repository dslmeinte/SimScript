/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot Add Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.SlotAddElementImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.SlotAddElementImpl#getDay <em>Day</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.SlotAddElementImpl#getSlots <em>Slots</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.SlotAddElementImpl#getStartHour <em>Start Hour</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.SlotAddElementImpl#getEndHour <em>End Hour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlotAddElementImpl extends ElementImpl implements SlotAddElement
{
  /**
   * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProduct()
   * @generated
   * @ordered
   */
  protected Expression product;

  /**
   * The cached value of the '{@link #getDay() <em>Day</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDay()
   * @generated
   * @ordered
   */
  protected Expression day;

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
   * The cached value of the '{@link #getStartHour() <em>Start Hour</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartHour()
   * @generated
   * @ordered
   */
  protected Expression startHour;

  /**
   * The cached value of the '{@link #getEndHour() <em>End Hour</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndHour()
   * @generated
   * @ordered
   */
  protected Expression endHour;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlotAddElementImpl()
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
    return SimUiDslPackage.Literals.SLOT_ADD_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getProduct()
  {
    return product;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProduct(Expression newProduct, NotificationChain msgs)
  {
    Expression oldProduct = product;
    product = newProduct;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.SLOT_ADD_ELEMENT__PRODUCT, oldProduct, newProduct);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProduct(Expression newProduct)
  {
    if (newProduct != product)
    {
      NotificationChain msgs = null;
      if (product != null)
        msgs = ((InternalEObject)product).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.SLOT_ADD_ELEMENT__PRODUCT, null, msgs);
      if (newProduct != null)
        msgs = ((InternalEObject)newProduct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.SLOT_ADD_ELEMENT__PRODUCT, null, msgs);
      msgs = basicSetProduct(newProduct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.SLOT_ADD_ELEMENT__PRODUCT, newProduct, newProduct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDay()
  {
    return day;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDay(Expression newDay, NotificationChain msgs)
  {
    Expression oldDay = day;
    day = newDay;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.SLOT_ADD_ELEMENT__DAY, oldDay, newDay);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDay(Expression newDay)
  {
    if (newDay != day)
    {
      NotificationChain msgs = null;
      if (day != null)
        msgs = ((InternalEObject)day).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.SLOT_ADD_ELEMENT__DAY, null, msgs);
      if (newDay != null)
        msgs = ((InternalEObject)newDay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.SLOT_ADD_ELEMENT__DAY, null, msgs);
      msgs = basicSetDay(newDay, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.SLOT_ADD_ELEMENT__DAY, newDay, newDay));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.SLOT_ADD_ELEMENT__SLOTS, oldSlots, newSlots);
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
        msgs = ((InternalEObject)slots).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.SLOT_ADD_ELEMENT__SLOTS, null, msgs);
      if (newSlots != null)
        msgs = ((InternalEObject)newSlots).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.SLOT_ADD_ELEMENT__SLOTS, null, msgs);
      msgs = basicSetSlots(newSlots, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.SLOT_ADD_ELEMENT__SLOTS, newSlots, newSlots));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getStartHour()
  {
    return startHour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStartHour(Expression newStartHour, NotificationChain msgs)
  {
    Expression oldStartHour = startHour;
    startHour = newStartHour;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.SLOT_ADD_ELEMENT__START_HOUR, oldStartHour, newStartHour);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartHour(Expression newStartHour)
  {
    if (newStartHour != startHour)
    {
      NotificationChain msgs = null;
      if (startHour != null)
        msgs = ((InternalEObject)startHour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.SLOT_ADD_ELEMENT__START_HOUR, null, msgs);
      if (newStartHour != null)
        msgs = ((InternalEObject)newStartHour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.SLOT_ADD_ELEMENT__START_HOUR, null, msgs);
      msgs = basicSetStartHour(newStartHour, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.SLOT_ADD_ELEMENT__START_HOUR, newStartHour, newStartHour));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getEndHour()
  {
    return endHour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEndHour(Expression newEndHour, NotificationChain msgs)
  {
    Expression oldEndHour = endHour;
    endHour = newEndHour;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.SLOT_ADD_ELEMENT__END_HOUR, oldEndHour, newEndHour);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndHour(Expression newEndHour)
  {
    if (newEndHour != endHour)
    {
      NotificationChain msgs = null;
      if (endHour != null)
        msgs = ((InternalEObject)endHour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.SLOT_ADD_ELEMENT__END_HOUR, null, msgs);
      if (newEndHour != null)
        msgs = ((InternalEObject)newEndHour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.SLOT_ADD_ELEMENT__END_HOUR, null, msgs);
      msgs = basicSetEndHour(newEndHour, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.SLOT_ADD_ELEMENT__END_HOUR, newEndHour, newEndHour));
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
      case SimUiDslPackage.SLOT_ADD_ELEMENT__PRODUCT:
        return basicSetProduct(null, msgs);
      case SimUiDslPackage.SLOT_ADD_ELEMENT__DAY:
        return basicSetDay(null, msgs);
      case SimUiDslPackage.SLOT_ADD_ELEMENT__SLOTS:
        return basicSetSlots(null, msgs);
      case SimUiDslPackage.SLOT_ADD_ELEMENT__START_HOUR:
        return basicSetStartHour(null, msgs);
      case SimUiDslPackage.SLOT_ADD_ELEMENT__END_HOUR:
        return basicSetEndHour(null, msgs);
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
      case SimUiDslPackage.SLOT_ADD_ELEMENT__PRODUCT:
        return getProduct();
      case SimUiDslPackage.SLOT_ADD_ELEMENT__DAY:
        return getDay();
      case SimUiDslPackage.SLOT_ADD_ELEMENT__SLOTS:
        return getSlots();
      case SimUiDslPackage.SLOT_ADD_ELEMENT__START_HOUR:
        return getStartHour();
      case SimUiDslPackage.SLOT_ADD_ELEMENT__END_HOUR:
        return getEndHour();
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
      case SimUiDslPackage.SLOT_ADD_ELEMENT__PRODUCT:
        setProduct((Expression)newValue);
        return;
      case SimUiDslPackage.SLOT_ADD_ELEMENT__DAY:
        setDay((Expression)newValue);
        return;
      case SimUiDslPackage.SLOT_ADD_ELEMENT__SLOTS:
        setSlots((Expression)newValue);
        return;
      case SimUiDslPackage.SLOT_ADD_ELEMENT__START_HOUR:
        setStartHour((Expression)newValue);
        return;
      case SimUiDslPackage.SLOT_ADD_ELEMENT__END_HOUR:
        setEndHour((Expression)newValue);
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
      case SimUiDslPackage.SLOT_ADD_ELEMENT__PRODUCT:
        setProduct((Expression)null);
        return;
      case SimUiDslPackage.SLOT_ADD_ELEMENT__DAY:
        setDay((Expression)null);
        return;
      case SimUiDslPackage.SLOT_ADD_ELEMENT__SLOTS:
        setSlots((Expression)null);
        return;
      case SimUiDslPackage.SLOT_ADD_ELEMENT__START_HOUR:
        setStartHour((Expression)null);
        return;
      case SimUiDslPackage.SLOT_ADD_ELEMENT__END_HOUR:
        setEndHour((Expression)null);
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
      case SimUiDslPackage.SLOT_ADD_ELEMENT__PRODUCT:
        return product != null;
      case SimUiDslPackage.SLOT_ADD_ELEMENT__DAY:
        return day != null;
      case SimUiDslPackage.SLOT_ADD_ELEMENT__SLOTS:
        return slots != null;
      case SimUiDslPackage.SLOT_ADD_ELEMENT__START_HOUR:
        return startHour != null;
      case SimUiDslPackage.SLOT_ADD_ELEMENT__END_HOUR:
        return endHour != null;
    }
    return super.eIsSet(featureID);
  }

} //SlotAddElementImpl

/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer;
import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Countdown Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CountdownTimerImpl#isObserved <em>Observed</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CountdownTimerImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CountdownTimerImpl#getOnEnd <em>On End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CountdownTimerImpl extends ElementImpl implements CountdownTimer
{
  /**
   * The default value of the '{@link #isObserved() <em>Observed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isObserved()
   * @generated
   * @ordered
   */
  protected static final boolean OBSERVED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isObserved() <em>Observed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isObserved()
   * @generated
   * @ordered
   */
  protected boolean observed = OBSERVED_EDEFAULT;

  /**
   * The cached value of the '{@link #getEndTime() <em>End Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndTime()
   * @generated
   * @ordered
   */
  protected Expression endTime;

  /**
   * The cached value of the '{@link #getOnEnd() <em>On End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnEnd()
   * @generated
   * @ordered
   */
  protected Expression onEnd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CountdownTimerImpl()
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
    return SimUiDslPackage.Literals.COUNTDOWN_TIMER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isObserved()
  {
    return observed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObserved(boolean newObserved)
  {
    boolean oldObserved = observed;
    observed = newObserved;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.COUNTDOWN_TIMER__OBSERVED, oldObserved, observed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getEndTime()
  {
    return endTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEndTime(Expression newEndTime, NotificationChain msgs)
  {
    Expression oldEndTime = endTime;
    endTime = newEndTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.COUNTDOWN_TIMER__END_TIME, oldEndTime, newEndTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndTime(Expression newEndTime)
  {
    if (newEndTime != endTime)
    {
      NotificationChain msgs = null;
      if (endTime != null)
        msgs = ((InternalEObject)endTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.COUNTDOWN_TIMER__END_TIME, null, msgs);
      if (newEndTime != null)
        msgs = ((InternalEObject)newEndTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.COUNTDOWN_TIMER__END_TIME, null, msgs);
      msgs = basicSetEndTime(newEndTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.COUNTDOWN_TIMER__END_TIME, newEndTime, newEndTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getOnEnd()
  {
    return onEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOnEnd(Expression newOnEnd, NotificationChain msgs)
  {
    Expression oldOnEnd = onEnd;
    onEnd = newOnEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.COUNTDOWN_TIMER__ON_END, oldOnEnd, newOnEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnEnd(Expression newOnEnd)
  {
    if (newOnEnd != onEnd)
    {
      NotificationChain msgs = null;
      if (onEnd != null)
        msgs = ((InternalEObject)onEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.COUNTDOWN_TIMER__ON_END, null, msgs);
      if (newOnEnd != null)
        msgs = ((InternalEObject)newOnEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.COUNTDOWN_TIMER__ON_END, null, msgs);
      msgs = basicSetOnEnd(newOnEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.COUNTDOWN_TIMER__ON_END, newOnEnd, newOnEnd));
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
      case SimUiDslPackage.COUNTDOWN_TIMER__END_TIME:
        return basicSetEndTime(null, msgs);
      case SimUiDslPackage.COUNTDOWN_TIMER__ON_END:
        return basicSetOnEnd(null, msgs);
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
      case SimUiDslPackage.COUNTDOWN_TIMER__OBSERVED:
        return isObserved();
      case SimUiDslPackage.COUNTDOWN_TIMER__END_TIME:
        return getEndTime();
      case SimUiDslPackage.COUNTDOWN_TIMER__ON_END:
        return getOnEnd();
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
      case SimUiDslPackage.COUNTDOWN_TIMER__OBSERVED:
        setObserved((Boolean)newValue);
        return;
      case SimUiDslPackage.COUNTDOWN_TIMER__END_TIME:
        setEndTime((Expression)newValue);
        return;
      case SimUiDslPackage.COUNTDOWN_TIMER__ON_END:
        setOnEnd((Expression)newValue);
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
      case SimUiDslPackage.COUNTDOWN_TIMER__OBSERVED:
        setObserved(OBSERVED_EDEFAULT);
        return;
      case SimUiDslPackage.COUNTDOWN_TIMER__END_TIME:
        setEndTime((Expression)null);
        return;
      case SimUiDslPackage.COUNTDOWN_TIMER__ON_END:
        setOnEnd((Expression)null);
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
      case SimUiDslPackage.COUNTDOWN_TIMER__OBSERVED:
        return observed != OBSERVED_EDEFAULT;
      case SimUiDslPackage.COUNTDOWN_TIMER__END_TIME:
        return endTime != null;
      case SimUiDslPackage.COUNTDOWN_TIMER__ON_END:
        return onEnd != null;
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
    result.append(" (observed: ");
    result.append(observed);
    result.append(')');
    return result.toString();
  }

} //CountdownTimerImpl

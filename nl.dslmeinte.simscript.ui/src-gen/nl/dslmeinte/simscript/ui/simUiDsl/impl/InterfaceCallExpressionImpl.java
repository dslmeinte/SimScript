/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import java.util.Collection;

import nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.ServiceIdentification;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Call Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InterfaceCallExpressionImpl#getServiceId <em>Service Id</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InterfaceCallExpressionImpl#getObserveSites <em>Observe Sites</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InterfaceCallExpressionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InterfaceCallExpressionImpl#getCallback <em>Callback</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InterfaceCallExpressionImpl#getErrorCallback <em>Error Callback</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceCallExpressionImpl extends ExpressionImpl implements InterfaceCallExpression
{
  /**
   * The cached value of the '{@link #getServiceId() <em>Service Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceId()
   * @generated
   * @ordered
   */
  protected ServiceIdentification serviceId;

  /**
   * The cached value of the '{@link #getObserveSites() <em>Observe Sites</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObserveSites()
   * @generated
   * @ordered
   */
  protected EList<Expression> observeSites;

  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected Expression input;

  /**
   * The cached value of the '{@link #getCallback() <em>Callback</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCallback()
   * @generated
   * @ordered
   */
  protected CallbackExpression callback;

  /**
   * The cached value of the '{@link #getErrorCallback() <em>Error Callback</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorCallback()
   * @generated
   * @ordered
   */
  protected CallbackExpression errorCallback;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceCallExpressionImpl()
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
    return SimUiDslPackage.Literals.INTERFACE_CALL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceIdentification getServiceId()
  {
    return serviceId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetServiceId(ServiceIdentification newServiceId, NotificationChain msgs)
  {
    ServiceIdentification oldServiceId = serviceId;
    serviceId = newServiceId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INTERFACE_CALL_EXPRESSION__SERVICE_ID, oldServiceId, newServiceId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceId(ServiceIdentification newServiceId)
  {
    if (newServiceId != serviceId)
    {
      NotificationChain msgs = null;
      if (serviceId != null)
        msgs = ((InternalEObject)serviceId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INTERFACE_CALL_EXPRESSION__SERVICE_ID, null, msgs);
      if (newServiceId != null)
        msgs = ((InternalEObject)newServiceId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INTERFACE_CALL_EXPRESSION__SERVICE_ID, null, msgs);
      msgs = basicSetServiceId(newServiceId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INTERFACE_CALL_EXPRESSION__SERVICE_ID, newServiceId, newServiceId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getObserveSites()
  {
    if (observeSites == null)
    {
      observeSites = new EObjectContainmentEList<Expression>(Expression.class, this, SimUiDslPackage.INTERFACE_CALL_EXPRESSION__OBSERVE_SITES);
    }
    return observeSites;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(Expression newInput, NotificationChain msgs)
  {
    Expression oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INTERFACE_CALL_EXPRESSION__INPUT, oldInput, newInput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(Expression newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INTERFACE_CALL_EXPRESSION__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INTERFACE_CALL_EXPRESSION__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INTERFACE_CALL_EXPRESSION__INPUT, newInput, newInput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallbackExpression getCallback()
  {
    return callback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCallback(CallbackExpression newCallback, NotificationChain msgs)
  {
    CallbackExpression oldCallback = callback;
    callback = newCallback;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INTERFACE_CALL_EXPRESSION__CALLBACK, oldCallback, newCallback);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCallback(CallbackExpression newCallback)
  {
    if (newCallback != callback)
    {
      NotificationChain msgs = null;
      if (callback != null)
        msgs = ((InternalEObject)callback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INTERFACE_CALL_EXPRESSION__CALLBACK, null, msgs);
      if (newCallback != null)
        msgs = ((InternalEObject)newCallback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INTERFACE_CALL_EXPRESSION__CALLBACK, null, msgs);
      msgs = basicSetCallback(newCallback, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INTERFACE_CALL_EXPRESSION__CALLBACK, newCallback, newCallback));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallbackExpression getErrorCallback()
  {
    return errorCallback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetErrorCallback(CallbackExpression newErrorCallback, NotificationChain msgs)
  {
    CallbackExpression oldErrorCallback = errorCallback;
    errorCallback = newErrorCallback;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INTERFACE_CALL_EXPRESSION__ERROR_CALLBACK, oldErrorCallback, newErrorCallback);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setErrorCallback(CallbackExpression newErrorCallback)
  {
    if (newErrorCallback != errorCallback)
    {
      NotificationChain msgs = null;
      if (errorCallback != null)
        msgs = ((InternalEObject)errorCallback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INTERFACE_CALL_EXPRESSION__ERROR_CALLBACK, null, msgs);
      if (newErrorCallback != null)
        msgs = ((InternalEObject)newErrorCallback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INTERFACE_CALL_EXPRESSION__ERROR_CALLBACK, null, msgs);
      msgs = basicSetErrorCallback(newErrorCallback, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INTERFACE_CALL_EXPRESSION__ERROR_CALLBACK, newErrorCallback, newErrorCallback));
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
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__SERVICE_ID:
        return basicSetServiceId(null, msgs);
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__OBSERVE_SITES:
        return ((InternalEList<?>)getObserveSites()).basicRemove(otherEnd, msgs);
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__INPUT:
        return basicSetInput(null, msgs);
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__CALLBACK:
        return basicSetCallback(null, msgs);
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__ERROR_CALLBACK:
        return basicSetErrorCallback(null, msgs);
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
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__SERVICE_ID:
        return getServiceId();
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__OBSERVE_SITES:
        return getObserveSites();
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__INPUT:
        return getInput();
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__CALLBACK:
        return getCallback();
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__ERROR_CALLBACK:
        return getErrorCallback();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__SERVICE_ID:
        setServiceId((ServiceIdentification)newValue);
        return;
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__OBSERVE_SITES:
        getObserveSites().clear();
        getObserveSites().addAll((Collection<? extends Expression>)newValue);
        return;
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__INPUT:
        setInput((Expression)newValue);
        return;
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__CALLBACK:
        setCallback((CallbackExpression)newValue);
        return;
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__ERROR_CALLBACK:
        setErrorCallback((CallbackExpression)newValue);
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
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__SERVICE_ID:
        setServiceId((ServiceIdentification)null);
        return;
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__OBSERVE_SITES:
        getObserveSites().clear();
        return;
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__INPUT:
        setInput((Expression)null);
        return;
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__CALLBACK:
        setCallback((CallbackExpression)null);
        return;
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__ERROR_CALLBACK:
        setErrorCallback((CallbackExpression)null);
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
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__SERVICE_ID:
        return serviceId != null;
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__OBSERVE_SITES:
        return observeSites != null && !observeSites.isEmpty();
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__INPUT:
        return input != null;
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__CALLBACK:
        return callback != null;
      case SimUiDslPackage.INTERFACE_CALL_EXPRESSION__ERROR_CALLBACK:
        return errorCallback != null;
    }
    return super.eIsSet(featureID);
  }

} //InterfaceCallExpressionImpl

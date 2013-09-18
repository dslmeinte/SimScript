/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.ElementBody;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tab Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TabDeclarationImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TabDeclarationImpl#getPreviousCallback <em>Previous Callback</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TabDeclarationImpl#getNextCallback <em>Next Callback</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TabDeclarationImpl extends ViewableCallSiteImpl implements TabDeclaration
{
  /**
   * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected ElementBody header;

  /**
   * The cached value of the '{@link #getPreviousCallback() <em>Previous Callback</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreviousCallback()
   * @generated
   * @ordered
   */
  protected CallbackExpression previousCallback;

  /**
   * The cached value of the '{@link #getNextCallback() <em>Next Callback</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextCallback()
   * @generated
   * @ordered
   */
  protected CallbackExpression nextCallback;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TabDeclarationImpl()
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
    return SimUiDslPackage.Literals.TAB_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementBody getHeader()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeader(ElementBody newHeader, NotificationChain msgs)
  {
    ElementBody oldHeader = header;
    header = newHeader;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TAB_DECLARATION__HEADER, oldHeader, newHeader);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeader(ElementBody newHeader)
  {
    if (newHeader != header)
    {
      NotificationChain msgs = null;
      if (header != null)
        msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TAB_DECLARATION__HEADER, null, msgs);
      if (newHeader != null)
        msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TAB_DECLARATION__HEADER, null, msgs);
      msgs = basicSetHeader(newHeader, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TAB_DECLARATION__HEADER, newHeader, newHeader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallbackExpression getPreviousCallback()
  {
    return previousCallback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreviousCallback(CallbackExpression newPreviousCallback, NotificationChain msgs)
  {
    CallbackExpression oldPreviousCallback = previousCallback;
    previousCallback = newPreviousCallback;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TAB_DECLARATION__PREVIOUS_CALLBACK, oldPreviousCallback, newPreviousCallback);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreviousCallback(CallbackExpression newPreviousCallback)
  {
    if (newPreviousCallback != previousCallback)
    {
      NotificationChain msgs = null;
      if (previousCallback != null)
        msgs = ((InternalEObject)previousCallback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TAB_DECLARATION__PREVIOUS_CALLBACK, null, msgs);
      if (newPreviousCallback != null)
        msgs = ((InternalEObject)newPreviousCallback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TAB_DECLARATION__PREVIOUS_CALLBACK, null, msgs);
      msgs = basicSetPreviousCallback(newPreviousCallback, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TAB_DECLARATION__PREVIOUS_CALLBACK, newPreviousCallback, newPreviousCallback));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallbackExpression getNextCallback()
  {
    return nextCallback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNextCallback(CallbackExpression newNextCallback, NotificationChain msgs)
  {
    CallbackExpression oldNextCallback = nextCallback;
    nextCallback = newNextCallback;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TAB_DECLARATION__NEXT_CALLBACK, oldNextCallback, newNextCallback);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNextCallback(CallbackExpression newNextCallback)
  {
    if (newNextCallback != nextCallback)
    {
      NotificationChain msgs = null;
      if (nextCallback != null)
        msgs = ((InternalEObject)nextCallback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TAB_DECLARATION__NEXT_CALLBACK, null, msgs);
      if (newNextCallback != null)
        msgs = ((InternalEObject)newNextCallback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TAB_DECLARATION__NEXT_CALLBACK, null, msgs);
      msgs = basicSetNextCallback(newNextCallback, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TAB_DECLARATION__NEXT_CALLBACK, newNextCallback, newNextCallback));
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
      case SimUiDslPackage.TAB_DECLARATION__HEADER:
        return basicSetHeader(null, msgs);
      case SimUiDslPackage.TAB_DECLARATION__PREVIOUS_CALLBACK:
        return basicSetPreviousCallback(null, msgs);
      case SimUiDslPackage.TAB_DECLARATION__NEXT_CALLBACK:
        return basicSetNextCallback(null, msgs);
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
      case SimUiDslPackage.TAB_DECLARATION__HEADER:
        return getHeader();
      case SimUiDslPackage.TAB_DECLARATION__PREVIOUS_CALLBACK:
        return getPreviousCallback();
      case SimUiDslPackage.TAB_DECLARATION__NEXT_CALLBACK:
        return getNextCallback();
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
      case SimUiDslPackage.TAB_DECLARATION__HEADER:
        setHeader((ElementBody)newValue);
        return;
      case SimUiDslPackage.TAB_DECLARATION__PREVIOUS_CALLBACK:
        setPreviousCallback((CallbackExpression)newValue);
        return;
      case SimUiDslPackage.TAB_DECLARATION__NEXT_CALLBACK:
        setNextCallback((CallbackExpression)newValue);
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
      case SimUiDslPackage.TAB_DECLARATION__HEADER:
        setHeader((ElementBody)null);
        return;
      case SimUiDslPackage.TAB_DECLARATION__PREVIOUS_CALLBACK:
        setPreviousCallback((CallbackExpression)null);
        return;
      case SimUiDslPackage.TAB_DECLARATION__NEXT_CALLBACK:
        setNextCallback((CallbackExpression)null);
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
      case SimUiDslPackage.TAB_DECLARATION__HEADER:
        return header != null;
      case SimUiDslPackage.TAB_DECLARATION__PREVIOUS_CALLBACK:
        return previousCallback != null;
      case SimUiDslPackage.TAB_DECLARATION__NEXT_CALLBACK:
        return nextCallback != null;
    }
    return super.eIsSet(featureID);
  }

} //TabDeclarationImpl

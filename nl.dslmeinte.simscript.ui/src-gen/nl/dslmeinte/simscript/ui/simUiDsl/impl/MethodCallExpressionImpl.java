/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.ArgumentList;
import nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.ReferenceExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodCallExpressionImpl#getMethodRef <em>Method Ref</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodCallExpressionImpl#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodCallExpressionImpl extends ValueReferenceOrMethodCallExpressionImpl implements MethodCallExpression
{
  /**
   * The cached value of the '{@link #getMethodRef() <em>Method Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodRef()
   * @generated
   * @ordered
   */
  protected ReferenceExpression methodRef;

  /**
   * The cached value of the '{@link #getArgumentList() <em>Argument List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgumentList()
   * @generated
   * @ordered
   */
  protected ArgumentList argumentList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodCallExpressionImpl()
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
    return SimUiDslPackage.Literals.METHOD_CALL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceExpression getMethodRef()
  {
    return methodRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodRef(ReferenceExpression newMethodRef, NotificationChain msgs)
  {
    ReferenceExpression oldMethodRef = methodRef;
    methodRef = newMethodRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.METHOD_CALL_EXPRESSION__METHOD_REF, oldMethodRef, newMethodRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodRef(ReferenceExpression newMethodRef)
  {
    if (newMethodRef != methodRef)
    {
      NotificationChain msgs = null;
      if (methodRef != null)
        msgs = ((InternalEObject)methodRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.METHOD_CALL_EXPRESSION__METHOD_REF, null, msgs);
      if (newMethodRef != null)
        msgs = ((InternalEObject)newMethodRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.METHOD_CALL_EXPRESSION__METHOD_REF, null, msgs);
      msgs = basicSetMethodRef(newMethodRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.METHOD_CALL_EXPRESSION__METHOD_REF, newMethodRef, newMethodRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentList getArgumentList()
  {
    return argumentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgumentList(ArgumentList newArgumentList, NotificationChain msgs)
  {
    ArgumentList oldArgumentList = argumentList;
    argumentList = newArgumentList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.METHOD_CALL_EXPRESSION__ARGUMENT_LIST, oldArgumentList, newArgumentList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgumentList(ArgumentList newArgumentList)
  {
    if (newArgumentList != argumentList)
    {
      NotificationChain msgs = null;
      if (argumentList != null)
        msgs = ((InternalEObject)argumentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.METHOD_CALL_EXPRESSION__ARGUMENT_LIST, null, msgs);
      if (newArgumentList != null)
        msgs = ((InternalEObject)newArgumentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.METHOD_CALL_EXPRESSION__ARGUMENT_LIST, null, msgs);
      msgs = basicSetArgumentList(newArgumentList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.METHOD_CALL_EXPRESSION__ARGUMENT_LIST, newArgumentList, newArgumentList));
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
      case SimUiDslPackage.METHOD_CALL_EXPRESSION__METHOD_REF:
        return basicSetMethodRef(null, msgs);
      case SimUiDslPackage.METHOD_CALL_EXPRESSION__ARGUMENT_LIST:
        return basicSetArgumentList(null, msgs);
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
      case SimUiDslPackage.METHOD_CALL_EXPRESSION__METHOD_REF:
        return getMethodRef();
      case SimUiDslPackage.METHOD_CALL_EXPRESSION__ARGUMENT_LIST:
        return getArgumentList();
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
      case SimUiDslPackage.METHOD_CALL_EXPRESSION__METHOD_REF:
        setMethodRef((ReferenceExpression)newValue);
        return;
      case SimUiDslPackage.METHOD_CALL_EXPRESSION__ARGUMENT_LIST:
        setArgumentList((ArgumentList)newValue);
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
      case SimUiDslPackage.METHOD_CALL_EXPRESSION__METHOD_REF:
        setMethodRef((ReferenceExpression)null);
        return;
      case SimUiDslPackage.METHOD_CALL_EXPRESSION__ARGUMENT_LIST:
        setArgumentList((ArgumentList)null);
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
      case SimUiDslPackage.METHOD_CALL_EXPRESSION__METHOD_REF:
        return methodRef != null;
      case SimUiDslPackage.METHOD_CALL_EXPRESSION__ARGUMENT_LIST:
        return argumentList != null;
    }
    return super.eIsSet(featureID);
  }

} //MethodCallExpressionImpl

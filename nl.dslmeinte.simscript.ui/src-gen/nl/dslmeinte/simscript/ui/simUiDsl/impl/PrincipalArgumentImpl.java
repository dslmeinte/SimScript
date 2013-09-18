/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter;

import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Principal Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.PrincipalArgumentImpl#getPrincipal <em>Principal</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.PrincipalArgumentImpl#getValueExpr <em>Value Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrincipalArgumentImpl extends MinimalEObjectImpl.Container implements PrincipalArgument
{
  /**
   * The cached value of the '{@link #getPrincipal() <em>Principal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrincipal()
   * @generated
   * @ordered
   */
  protected AuthenticationParameter principal;

  /**
   * The cached value of the '{@link #getValueExpr() <em>Value Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueExpr()
   * @generated
   * @ordered
   */
  protected Expression valueExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrincipalArgumentImpl()
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
    return SimUiDslPackage.Literals.PRINCIPAL_ARGUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AuthenticationParameter getPrincipal()
  {
    if (principal != null && principal.eIsProxy())
    {
      InternalEObject oldPrincipal = (InternalEObject)principal;
      principal = (AuthenticationParameter)eResolveProxy(oldPrincipal);
      if (principal != oldPrincipal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimUiDslPackage.PRINCIPAL_ARGUMENT__PRINCIPAL, oldPrincipal, principal));
      }
    }
    return principal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AuthenticationParameter basicGetPrincipal()
  {
    return principal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrincipal(AuthenticationParameter newPrincipal)
  {
    AuthenticationParameter oldPrincipal = principal;
    principal = newPrincipal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.PRINCIPAL_ARGUMENT__PRINCIPAL, oldPrincipal, principal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getValueExpr()
  {
    return valueExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueExpr(Expression newValueExpr, NotificationChain msgs)
  {
    Expression oldValueExpr = valueExpr;
    valueExpr = newValueExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.PRINCIPAL_ARGUMENT__VALUE_EXPR, oldValueExpr, newValueExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueExpr(Expression newValueExpr)
  {
    if (newValueExpr != valueExpr)
    {
      NotificationChain msgs = null;
      if (valueExpr != null)
        msgs = ((InternalEObject)valueExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.PRINCIPAL_ARGUMENT__VALUE_EXPR, null, msgs);
      if (newValueExpr != null)
        msgs = ((InternalEObject)newValueExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.PRINCIPAL_ARGUMENT__VALUE_EXPR, null, msgs);
      msgs = basicSetValueExpr(newValueExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.PRINCIPAL_ARGUMENT__VALUE_EXPR, newValueExpr, newValueExpr));
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
      case SimUiDslPackage.PRINCIPAL_ARGUMENT__VALUE_EXPR:
        return basicSetValueExpr(null, msgs);
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
      case SimUiDslPackage.PRINCIPAL_ARGUMENT__PRINCIPAL:
        if (resolve) return getPrincipal();
        return basicGetPrincipal();
      case SimUiDslPackage.PRINCIPAL_ARGUMENT__VALUE_EXPR:
        return getValueExpr();
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
      case SimUiDslPackage.PRINCIPAL_ARGUMENT__PRINCIPAL:
        setPrincipal((AuthenticationParameter)newValue);
        return;
      case SimUiDslPackage.PRINCIPAL_ARGUMENT__VALUE_EXPR:
        setValueExpr((Expression)newValue);
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
      case SimUiDslPackage.PRINCIPAL_ARGUMENT__PRINCIPAL:
        setPrincipal((AuthenticationParameter)null);
        return;
      case SimUiDslPackage.PRINCIPAL_ARGUMENT__VALUE_EXPR:
        setValueExpr((Expression)null);
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
      case SimUiDslPackage.PRINCIPAL_ARGUMENT__PRINCIPAL:
        return principal != null;
      case SimUiDslPackage.PRINCIPAL_ARGUMENT__VALUE_EXPR:
        return valueExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //PrincipalArgumentImpl

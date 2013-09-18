/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ternary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TernaryExpressionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TernaryExpressionImpl#getThenExpr <em>Then Expr</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TernaryExpressionImpl#getElseExpr <em>Else Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TernaryExpressionImpl extends ExpressionImpl implements TernaryExpression
{
  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected Expression guard;

  /**
   * The cached value of the '{@link #getThenExpr() <em>Then Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenExpr()
   * @generated
   * @ordered
   */
  protected Expression thenExpr;

  /**
   * The cached value of the '{@link #getElseExpr() <em>Else Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseExpr()
   * @generated
   * @ordered
   */
  protected Expression elseExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TernaryExpressionImpl()
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
    return SimUiDslPackage.Literals.TERNARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuard(Expression newGuard, NotificationChain msgs)
  {
    Expression oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TERNARY_EXPRESSION__GUARD, oldGuard, newGuard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuard(Expression newGuard)
  {
    if (newGuard != guard)
    {
      NotificationChain msgs = null;
      if (guard != null)
        msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TERNARY_EXPRESSION__GUARD, null, msgs);
      if (newGuard != null)
        msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TERNARY_EXPRESSION__GUARD, null, msgs);
      msgs = basicSetGuard(newGuard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TERNARY_EXPRESSION__GUARD, newGuard, newGuard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getThenExpr()
  {
    return thenExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThenExpr(Expression newThenExpr, NotificationChain msgs)
  {
    Expression oldThenExpr = thenExpr;
    thenExpr = newThenExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TERNARY_EXPRESSION__THEN_EXPR, oldThenExpr, newThenExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThenExpr(Expression newThenExpr)
  {
    if (newThenExpr != thenExpr)
    {
      NotificationChain msgs = null;
      if (thenExpr != null)
        msgs = ((InternalEObject)thenExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TERNARY_EXPRESSION__THEN_EXPR, null, msgs);
      if (newThenExpr != null)
        msgs = ((InternalEObject)newThenExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TERNARY_EXPRESSION__THEN_EXPR, null, msgs);
      msgs = basicSetThenExpr(newThenExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TERNARY_EXPRESSION__THEN_EXPR, newThenExpr, newThenExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getElseExpr()
  {
    return elseExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseExpr(Expression newElseExpr, NotificationChain msgs)
  {
    Expression oldElseExpr = elseExpr;
    elseExpr = newElseExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TERNARY_EXPRESSION__ELSE_EXPR, oldElseExpr, newElseExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseExpr(Expression newElseExpr)
  {
    if (newElseExpr != elseExpr)
    {
      NotificationChain msgs = null;
      if (elseExpr != null)
        msgs = ((InternalEObject)elseExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TERNARY_EXPRESSION__ELSE_EXPR, null, msgs);
      if (newElseExpr != null)
        msgs = ((InternalEObject)newElseExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TERNARY_EXPRESSION__ELSE_EXPR, null, msgs);
      msgs = basicSetElseExpr(newElseExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TERNARY_EXPRESSION__ELSE_EXPR, newElseExpr, newElseExpr));
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
      case SimUiDslPackage.TERNARY_EXPRESSION__GUARD:
        return basicSetGuard(null, msgs);
      case SimUiDslPackage.TERNARY_EXPRESSION__THEN_EXPR:
        return basicSetThenExpr(null, msgs);
      case SimUiDslPackage.TERNARY_EXPRESSION__ELSE_EXPR:
        return basicSetElseExpr(null, msgs);
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
      case SimUiDslPackage.TERNARY_EXPRESSION__GUARD:
        return getGuard();
      case SimUiDslPackage.TERNARY_EXPRESSION__THEN_EXPR:
        return getThenExpr();
      case SimUiDslPackage.TERNARY_EXPRESSION__ELSE_EXPR:
        return getElseExpr();
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
      case SimUiDslPackage.TERNARY_EXPRESSION__GUARD:
        setGuard((Expression)newValue);
        return;
      case SimUiDslPackage.TERNARY_EXPRESSION__THEN_EXPR:
        setThenExpr((Expression)newValue);
        return;
      case SimUiDslPackage.TERNARY_EXPRESSION__ELSE_EXPR:
        setElseExpr((Expression)newValue);
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
      case SimUiDslPackage.TERNARY_EXPRESSION__GUARD:
        setGuard((Expression)null);
        return;
      case SimUiDslPackage.TERNARY_EXPRESSION__THEN_EXPR:
        setThenExpr((Expression)null);
        return;
      case SimUiDslPackage.TERNARY_EXPRESSION__ELSE_EXPR:
        setElseExpr((Expression)null);
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
      case SimUiDslPackage.TERNARY_EXPRESSION__GUARD:
        return guard != null;
      case SimUiDslPackage.TERNARY_EXPRESSION__THEN_EXPR:
        return thenExpr != null;
      case SimUiDslPackage.TERNARY_EXPRESSION__ELSE_EXPR:
        return elseExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //TernaryExpressionImpl

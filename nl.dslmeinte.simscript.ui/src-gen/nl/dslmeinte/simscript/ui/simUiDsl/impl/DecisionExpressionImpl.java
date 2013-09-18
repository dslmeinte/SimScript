/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import java.util.Collection;

import nl.dslmeinte.simscript.ui.simUiDsl.DecisionCase;
import nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
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
 * An implementation of the model object '<em><b>Decision Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DecisionExpressionImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DecisionExpressionImpl#getDefaultValueExpr <em>Default Value Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecisionExpressionImpl extends LiteralExpressionImpl implements DecisionExpression
{
  /**
   * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected EList<DecisionCase> cases;

  /**
   * The cached value of the '{@link #getDefaultValueExpr() <em>Default Value Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultValueExpr()
   * @generated
   * @ordered
   */
  protected Expression defaultValueExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecisionExpressionImpl()
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
    return SimUiDslPackage.Literals.DECISION_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DecisionCase> getCases()
  {
    if (cases == null)
    {
      cases = new EObjectContainmentEList<DecisionCase>(DecisionCase.class, this, SimUiDslPackage.DECISION_EXPRESSION__CASES);
    }
    return cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDefaultValueExpr()
  {
    return defaultValueExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultValueExpr(Expression newDefaultValueExpr, NotificationChain msgs)
  {
    Expression oldDefaultValueExpr = defaultValueExpr;
    defaultValueExpr = newDefaultValueExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.DECISION_EXPRESSION__DEFAULT_VALUE_EXPR, oldDefaultValueExpr, newDefaultValueExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultValueExpr(Expression newDefaultValueExpr)
  {
    if (newDefaultValueExpr != defaultValueExpr)
    {
      NotificationChain msgs = null;
      if (defaultValueExpr != null)
        msgs = ((InternalEObject)defaultValueExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.DECISION_EXPRESSION__DEFAULT_VALUE_EXPR, null, msgs);
      if (newDefaultValueExpr != null)
        msgs = ((InternalEObject)newDefaultValueExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.DECISION_EXPRESSION__DEFAULT_VALUE_EXPR, null, msgs);
      msgs = basicSetDefaultValueExpr(newDefaultValueExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.DECISION_EXPRESSION__DEFAULT_VALUE_EXPR, newDefaultValueExpr, newDefaultValueExpr));
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
      case SimUiDslPackage.DECISION_EXPRESSION__CASES:
        return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
      case SimUiDslPackage.DECISION_EXPRESSION__DEFAULT_VALUE_EXPR:
        return basicSetDefaultValueExpr(null, msgs);
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
      case SimUiDslPackage.DECISION_EXPRESSION__CASES:
        return getCases();
      case SimUiDslPackage.DECISION_EXPRESSION__DEFAULT_VALUE_EXPR:
        return getDefaultValueExpr();
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
      case SimUiDslPackage.DECISION_EXPRESSION__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends DecisionCase>)newValue);
        return;
      case SimUiDslPackage.DECISION_EXPRESSION__DEFAULT_VALUE_EXPR:
        setDefaultValueExpr((Expression)newValue);
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
      case SimUiDslPackage.DECISION_EXPRESSION__CASES:
        getCases().clear();
        return;
      case SimUiDslPackage.DECISION_EXPRESSION__DEFAULT_VALUE_EXPR:
        setDefaultValueExpr((Expression)null);
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
      case SimUiDslPackage.DECISION_EXPRESSION__CASES:
        return cases != null && !cases.isEmpty();
      case SimUiDslPackage.DECISION_EXPRESSION__DEFAULT_VALUE_EXPR:
        return defaultValueExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //DecisionExpressionImpl

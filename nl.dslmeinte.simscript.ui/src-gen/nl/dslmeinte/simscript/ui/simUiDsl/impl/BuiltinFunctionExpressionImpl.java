/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.structure.structureDsl.Feature;

import nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctions;
import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Builtin Function Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BuiltinFunctionExpressionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BuiltinFunctionExpressionImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BuiltinFunctionExpressionImpl#getSortFeature <em>Sort Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuiltinFunctionExpressionImpl extends ExpressionImpl implements BuiltinFunctionExpression
{
  /**
   * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected static final BuiltinFunctions FUNCTION_EDEFAULT = BuiltinFunctions.IS_SET;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected BuiltinFunctions function = FUNCTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected Expression argument;

  /**
   * The cached value of the '{@link #getSortFeature() <em>Sort Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSortFeature()
   * @generated
   * @ordered
   */
  protected Feature sortFeature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuiltinFunctionExpressionImpl()
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
    return SimUiDslPackage.Literals.BUILTIN_FUNCTION_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltinFunctions getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(BuiltinFunctions newFunction)
  {
    BuiltinFunctions oldFunction = function;
    function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__FUNCTION, oldFunction, function));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getArgument()
  {
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgument(Expression newArgument, NotificationChain msgs)
  {
    Expression oldArgument = argument;
    argument = newArgument;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__ARGUMENT, oldArgument, newArgument);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgument(Expression newArgument)
  {
    if (newArgument != argument)
    {
      NotificationChain msgs = null;
      if (argument != null)
        msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__ARGUMENT, null, msgs);
      if (newArgument != null)
        msgs = ((InternalEObject)newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__ARGUMENT, null, msgs);
      msgs = basicSetArgument(newArgument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__ARGUMENT, newArgument, newArgument));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature getSortFeature()
  {
    if (sortFeature != null && sortFeature.eIsProxy())
    {
      InternalEObject oldSortFeature = (InternalEObject)sortFeature;
      sortFeature = (Feature)eResolveProxy(oldSortFeature);
      if (sortFeature != oldSortFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__SORT_FEATURE, oldSortFeature, sortFeature));
      }
    }
    return sortFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature basicGetSortFeature()
  {
    return sortFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSortFeature(Feature newSortFeature)
  {
    Feature oldSortFeature = sortFeature;
    sortFeature = newSortFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__SORT_FEATURE, oldSortFeature, sortFeature));
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
      case SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__ARGUMENT:
        return basicSetArgument(null, msgs);
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
      case SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__FUNCTION:
        return getFunction();
      case SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__ARGUMENT:
        return getArgument();
      case SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__SORT_FEATURE:
        if (resolve) return getSortFeature();
        return basicGetSortFeature();
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
      case SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__FUNCTION:
        setFunction((BuiltinFunctions)newValue);
        return;
      case SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__ARGUMENT:
        setArgument((Expression)newValue);
        return;
      case SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__SORT_FEATURE:
        setSortFeature((Feature)newValue);
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
      case SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__FUNCTION:
        setFunction(FUNCTION_EDEFAULT);
        return;
      case SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__ARGUMENT:
        setArgument((Expression)null);
        return;
      case SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__SORT_FEATURE:
        setSortFeature((Feature)null);
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
      case SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__FUNCTION:
        return function != FUNCTION_EDEFAULT;
      case SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__ARGUMENT:
        return argument != null;
      case SimUiDslPackage.BUILTIN_FUNCTION_EXPRESSION__SORT_FEATURE:
        return sortFeature != null;
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
    result.append(" (function: ");
    result.append(function);
    result.append(')');
    return result.toString();
  }

} //BuiltinFunctionExpressionImpl

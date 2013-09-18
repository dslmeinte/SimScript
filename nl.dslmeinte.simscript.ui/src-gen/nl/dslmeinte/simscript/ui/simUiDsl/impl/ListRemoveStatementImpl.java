/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.structure.structureDsl.Feature;

import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Remove Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListRemoveStatementImpl#getListExpr <em>List Expr</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListRemoveStatementImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListRemoveStatementImpl#getValueExpr <em>Value Expr</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListRemoveStatementImpl#getIndexVariable <em>Index Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListRemoveStatementImpl extends NonExitingStatementImpl implements ListRemoveStatement
{
  /**
   * The cached value of the '{@link #getListExpr() <em>List Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListExpr()
   * @generated
   * @ordered
   */
  protected Expression listExpr;

  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected Feature feature;

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
   * The cached value of the '{@link #getIndexVariable() <em>Index Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexVariable()
   * @generated
   * @ordered
   */
  protected Expression indexVariable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListRemoveStatementImpl()
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
    return SimUiDslPackage.Literals.LIST_REMOVE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getListExpr()
  {
    return listExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetListExpr(Expression newListExpr, NotificationChain msgs)
  {
    Expression oldListExpr = listExpr;
    listExpr = newListExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.LIST_REMOVE_STATEMENT__LIST_EXPR, oldListExpr, newListExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListExpr(Expression newListExpr)
  {
    if (newListExpr != listExpr)
    {
      NotificationChain msgs = null;
      if (listExpr != null)
        msgs = ((InternalEObject)listExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.LIST_REMOVE_STATEMENT__LIST_EXPR, null, msgs);
      if (newListExpr != null)
        msgs = ((InternalEObject)newListExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.LIST_REMOVE_STATEMENT__LIST_EXPR, null, msgs);
      msgs = basicSetListExpr(newListExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.LIST_REMOVE_STATEMENT__LIST_EXPR, newListExpr, newListExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature getFeature()
  {
    if (feature != null && feature.eIsProxy())
    {
      InternalEObject oldFeature = (InternalEObject)feature;
      feature = (Feature)eResolveProxy(oldFeature);
      if (feature != oldFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimUiDslPackage.LIST_REMOVE_STATEMENT__FEATURE, oldFeature, feature));
      }
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature basicGetFeature()
  {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature(Feature newFeature)
  {
    Feature oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.LIST_REMOVE_STATEMENT__FEATURE, oldFeature, feature));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.LIST_REMOVE_STATEMENT__VALUE_EXPR, oldValueExpr, newValueExpr);
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
        msgs = ((InternalEObject)valueExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.LIST_REMOVE_STATEMENT__VALUE_EXPR, null, msgs);
      if (newValueExpr != null)
        msgs = ((InternalEObject)newValueExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.LIST_REMOVE_STATEMENT__VALUE_EXPR, null, msgs);
      msgs = basicSetValueExpr(newValueExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.LIST_REMOVE_STATEMENT__VALUE_EXPR, newValueExpr, newValueExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getIndexVariable()
  {
    return indexVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndexVariable(Expression newIndexVariable, NotificationChain msgs)
  {
    Expression oldIndexVariable = indexVariable;
    indexVariable = newIndexVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.LIST_REMOVE_STATEMENT__INDEX_VARIABLE, oldIndexVariable, newIndexVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndexVariable(Expression newIndexVariable)
  {
    if (newIndexVariable != indexVariable)
    {
      NotificationChain msgs = null;
      if (indexVariable != null)
        msgs = ((InternalEObject)indexVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.LIST_REMOVE_STATEMENT__INDEX_VARIABLE, null, msgs);
      if (newIndexVariable != null)
        msgs = ((InternalEObject)newIndexVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.LIST_REMOVE_STATEMENT__INDEX_VARIABLE, null, msgs);
      msgs = basicSetIndexVariable(newIndexVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.LIST_REMOVE_STATEMENT__INDEX_VARIABLE, newIndexVariable, newIndexVariable));
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
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__LIST_EXPR:
        return basicSetListExpr(null, msgs);
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__VALUE_EXPR:
        return basicSetValueExpr(null, msgs);
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__INDEX_VARIABLE:
        return basicSetIndexVariable(null, msgs);
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
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__LIST_EXPR:
        return getListExpr();
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__FEATURE:
        if (resolve) return getFeature();
        return basicGetFeature();
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__VALUE_EXPR:
        return getValueExpr();
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__INDEX_VARIABLE:
        return getIndexVariable();
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
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__LIST_EXPR:
        setListExpr((Expression)newValue);
        return;
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__FEATURE:
        setFeature((Feature)newValue);
        return;
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__VALUE_EXPR:
        setValueExpr((Expression)newValue);
        return;
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__INDEX_VARIABLE:
        setIndexVariable((Expression)newValue);
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
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__LIST_EXPR:
        setListExpr((Expression)null);
        return;
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__FEATURE:
        setFeature((Feature)null);
        return;
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__VALUE_EXPR:
        setValueExpr((Expression)null);
        return;
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__INDEX_VARIABLE:
        setIndexVariable((Expression)null);
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
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__LIST_EXPR:
        return listExpr != null;
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__FEATURE:
        return feature != null;
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__VALUE_EXPR:
        return valueExpr != null;
      case SimUiDslPackage.LIST_REMOVE_STATEMENT__INDEX_VARIABLE:
        return indexVariable != null;
    }
    return super.eIsSet(featureID);
  }

} //ListRemoveStatementImpl

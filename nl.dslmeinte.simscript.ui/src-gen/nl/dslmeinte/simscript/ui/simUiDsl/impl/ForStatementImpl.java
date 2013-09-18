/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.ForStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.ListVariable;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ForStatementImpl#getIndexVariable <em>Index Variable</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ForStatementImpl#getValueVariable <em>Value Variable</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ForStatementImpl#getListExpression <em>List Expression</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ForStatementImpl#getThenBlock <em>Then Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForStatementImpl extends NonExitingStatementImpl implements ForStatement
{
  /**
   * The cached value of the '{@link #getIndexVariable() <em>Index Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndexVariable()
   * @generated
   * @ordered
   */
  protected ListVariable indexVariable;

  /**
   * The cached value of the '{@link #getValueVariable() <em>Value Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueVariable()
   * @generated
   * @ordered
   */
  protected ListVariable valueVariable;

  /**
   * The cached value of the '{@link #getListExpression() <em>List Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListExpression()
   * @generated
   * @ordered
   */
  protected Expression listExpression;

  /**
   * The cached value of the '{@link #getThenBlock() <em>Then Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenBlock()
   * @generated
   * @ordered
   */
  protected StatementBlock thenBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForStatementImpl()
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
    return SimUiDslPackage.Literals.FOR_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListVariable getIndexVariable()
  {
    return indexVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndexVariable(ListVariable newIndexVariable, NotificationChain msgs)
  {
    ListVariable oldIndexVariable = indexVariable;
    indexVariable = newIndexVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.FOR_STATEMENT__INDEX_VARIABLE, oldIndexVariable, newIndexVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndexVariable(ListVariable newIndexVariable)
  {
    if (newIndexVariable != indexVariable)
    {
      NotificationChain msgs = null;
      if (indexVariable != null)
        msgs = ((InternalEObject)indexVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.FOR_STATEMENT__INDEX_VARIABLE, null, msgs);
      if (newIndexVariable != null)
        msgs = ((InternalEObject)newIndexVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.FOR_STATEMENT__INDEX_VARIABLE, null, msgs);
      msgs = basicSetIndexVariable(newIndexVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.FOR_STATEMENT__INDEX_VARIABLE, newIndexVariable, newIndexVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListVariable getValueVariable()
  {
    return valueVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueVariable(ListVariable newValueVariable, NotificationChain msgs)
  {
    ListVariable oldValueVariable = valueVariable;
    valueVariable = newValueVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.FOR_STATEMENT__VALUE_VARIABLE, oldValueVariable, newValueVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueVariable(ListVariable newValueVariable)
  {
    if (newValueVariable != valueVariable)
    {
      NotificationChain msgs = null;
      if (valueVariable != null)
        msgs = ((InternalEObject)valueVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.FOR_STATEMENT__VALUE_VARIABLE, null, msgs);
      if (newValueVariable != null)
        msgs = ((InternalEObject)newValueVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.FOR_STATEMENT__VALUE_VARIABLE, null, msgs);
      msgs = basicSetValueVariable(newValueVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.FOR_STATEMENT__VALUE_VARIABLE, newValueVariable, newValueVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getListExpression()
  {
    return listExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetListExpression(Expression newListExpression, NotificationChain msgs)
  {
    Expression oldListExpression = listExpression;
    listExpression = newListExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.FOR_STATEMENT__LIST_EXPRESSION, oldListExpression, newListExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListExpression(Expression newListExpression)
  {
    if (newListExpression != listExpression)
    {
      NotificationChain msgs = null;
      if (listExpression != null)
        msgs = ((InternalEObject)listExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.FOR_STATEMENT__LIST_EXPRESSION, null, msgs);
      if (newListExpression != null)
        msgs = ((InternalEObject)newListExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.FOR_STATEMENT__LIST_EXPRESSION, null, msgs);
      msgs = basicSetListExpression(newListExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.FOR_STATEMENT__LIST_EXPRESSION, newListExpression, newListExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementBlock getThenBlock()
  {
    return thenBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThenBlock(StatementBlock newThenBlock, NotificationChain msgs)
  {
    StatementBlock oldThenBlock = thenBlock;
    thenBlock = newThenBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.FOR_STATEMENT__THEN_BLOCK, oldThenBlock, newThenBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThenBlock(StatementBlock newThenBlock)
  {
    if (newThenBlock != thenBlock)
    {
      NotificationChain msgs = null;
      if (thenBlock != null)
        msgs = ((InternalEObject)thenBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.FOR_STATEMENT__THEN_BLOCK, null, msgs);
      if (newThenBlock != null)
        msgs = ((InternalEObject)newThenBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.FOR_STATEMENT__THEN_BLOCK, null, msgs);
      msgs = basicSetThenBlock(newThenBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.FOR_STATEMENT__THEN_BLOCK, newThenBlock, newThenBlock));
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
      case SimUiDslPackage.FOR_STATEMENT__INDEX_VARIABLE:
        return basicSetIndexVariable(null, msgs);
      case SimUiDslPackage.FOR_STATEMENT__VALUE_VARIABLE:
        return basicSetValueVariable(null, msgs);
      case SimUiDslPackage.FOR_STATEMENT__LIST_EXPRESSION:
        return basicSetListExpression(null, msgs);
      case SimUiDslPackage.FOR_STATEMENT__THEN_BLOCK:
        return basicSetThenBlock(null, msgs);
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
      case SimUiDslPackage.FOR_STATEMENT__INDEX_VARIABLE:
        return getIndexVariable();
      case SimUiDslPackage.FOR_STATEMENT__VALUE_VARIABLE:
        return getValueVariable();
      case SimUiDslPackage.FOR_STATEMENT__LIST_EXPRESSION:
        return getListExpression();
      case SimUiDslPackage.FOR_STATEMENT__THEN_BLOCK:
        return getThenBlock();
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
      case SimUiDslPackage.FOR_STATEMENT__INDEX_VARIABLE:
        setIndexVariable((ListVariable)newValue);
        return;
      case SimUiDslPackage.FOR_STATEMENT__VALUE_VARIABLE:
        setValueVariable((ListVariable)newValue);
        return;
      case SimUiDslPackage.FOR_STATEMENT__LIST_EXPRESSION:
        setListExpression((Expression)newValue);
        return;
      case SimUiDslPackage.FOR_STATEMENT__THEN_BLOCK:
        setThenBlock((StatementBlock)newValue);
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
      case SimUiDslPackage.FOR_STATEMENT__INDEX_VARIABLE:
        setIndexVariable((ListVariable)null);
        return;
      case SimUiDslPackage.FOR_STATEMENT__VALUE_VARIABLE:
        setValueVariable((ListVariable)null);
        return;
      case SimUiDslPackage.FOR_STATEMENT__LIST_EXPRESSION:
        setListExpression((Expression)null);
        return;
      case SimUiDslPackage.FOR_STATEMENT__THEN_BLOCK:
        setThenBlock((StatementBlock)null);
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
      case SimUiDslPackage.FOR_STATEMENT__INDEX_VARIABLE:
        return indexVariable != null;
      case SimUiDslPackage.FOR_STATEMENT__VALUE_VARIABLE:
        return valueVariable != null;
      case SimUiDslPackage.FOR_STATEMENT__LIST_EXPRESSION:
        return listExpression != null;
      case SimUiDslPackage.FOR_STATEMENT__THEN_BLOCK:
        return thenBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //ForStatementImpl

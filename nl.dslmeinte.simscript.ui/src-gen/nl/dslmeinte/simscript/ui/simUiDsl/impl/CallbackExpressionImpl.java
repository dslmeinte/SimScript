/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callback Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CallbackExpressionImpl#getStatementBlock <em>Statement Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallbackExpressionImpl extends CallbackExpressionsImpl implements CallbackExpression
{
  /**
   * The cached value of the '{@link #getStatementBlock() <em>Statement Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementBlock()
   * @generated
   * @ordered
   */
  protected StatementBlock statementBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallbackExpressionImpl()
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
    return SimUiDslPackage.Literals.CALLBACK_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementBlock getStatementBlock()
  {
    return statementBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatementBlock(StatementBlock newStatementBlock, NotificationChain msgs)
  {
    StatementBlock oldStatementBlock = statementBlock;
    statementBlock = newStatementBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.CALLBACK_EXPRESSION__STATEMENT_BLOCK, oldStatementBlock, newStatementBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatementBlock(StatementBlock newStatementBlock)
  {
    if (newStatementBlock != statementBlock)
    {
      NotificationChain msgs = null;
      if (statementBlock != null)
        msgs = ((InternalEObject)statementBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.CALLBACK_EXPRESSION__STATEMENT_BLOCK, null, msgs);
      if (newStatementBlock != null)
        msgs = ((InternalEObject)newStatementBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.CALLBACK_EXPRESSION__STATEMENT_BLOCK, null, msgs);
      msgs = basicSetStatementBlock(newStatementBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.CALLBACK_EXPRESSION__STATEMENT_BLOCK, newStatementBlock, newStatementBlock));
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
      case SimUiDslPackage.CALLBACK_EXPRESSION__STATEMENT_BLOCK:
        return basicSetStatementBlock(null, msgs);
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
      case SimUiDslPackage.CALLBACK_EXPRESSION__STATEMENT_BLOCK:
        return getStatementBlock();
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
      case SimUiDslPackage.CALLBACK_EXPRESSION__STATEMENT_BLOCK:
        setStatementBlock((StatementBlock)newValue);
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
      case SimUiDslPackage.CALLBACK_EXPRESSION__STATEMENT_BLOCK:
        setStatementBlock((StatementBlock)null);
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
      case SimUiDslPackage.CALLBACK_EXPRESSION__STATEMENT_BLOCK:
        return statementBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //CallbackExpressionImpl

/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.ObserveElement;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observe Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ObserveElementImpl#getObserveExpr <em>Observe Expr</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ObserveElementImpl#getStatementBlock <em>Statement Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObserveElementImpl extends ElementImpl implements ObserveElement
{
  /**
   * The cached value of the '{@link #getObserveExpr() <em>Observe Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObserveExpr()
   * @generated
   * @ordered
   */
  protected Expression observeExpr;

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
  protected ObserveElementImpl()
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
    return SimUiDslPackage.Literals.OBSERVE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getObserveExpr()
  {
    return observeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObserveExpr(Expression newObserveExpr, NotificationChain msgs)
  {
    Expression oldObserveExpr = observeExpr;
    observeExpr = newObserveExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.OBSERVE_ELEMENT__OBSERVE_EXPR, oldObserveExpr, newObserveExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObserveExpr(Expression newObserveExpr)
  {
    if (newObserveExpr != observeExpr)
    {
      NotificationChain msgs = null;
      if (observeExpr != null)
        msgs = ((InternalEObject)observeExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.OBSERVE_ELEMENT__OBSERVE_EXPR, null, msgs);
      if (newObserveExpr != null)
        msgs = ((InternalEObject)newObserveExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.OBSERVE_ELEMENT__OBSERVE_EXPR, null, msgs);
      msgs = basicSetObserveExpr(newObserveExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.OBSERVE_ELEMENT__OBSERVE_EXPR, newObserveExpr, newObserveExpr));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.OBSERVE_ELEMENT__STATEMENT_BLOCK, oldStatementBlock, newStatementBlock);
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
        msgs = ((InternalEObject)statementBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.OBSERVE_ELEMENT__STATEMENT_BLOCK, null, msgs);
      if (newStatementBlock != null)
        msgs = ((InternalEObject)newStatementBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.OBSERVE_ELEMENT__STATEMENT_BLOCK, null, msgs);
      msgs = basicSetStatementBlock(newStatementBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.OBSERVE_ELEMENT__STATEMENT_BLOCK, newStatementBlock, newStatementBlock));
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
      case SimUiDslPackage.OBSERVE_ELEMENT__OBSERVE_EXPR:
        return basicSetObserveExpr(null, msgs);
      case SimUiDslPackage.OBSERVE_ELEMENT__STATEMENT_BLOCK:
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
      case SimUiDslPackage.OBSERVE_ELEMENT__OBSERVE_EXPR:
        return getObserveExpr();
      case SimUiDslPackage.OBSERVE_ELEMENT__STATEMENT_BLOCK:
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
      case SimUiDslPackage.OBSERVE_ELEMENT__OBSERVE_EXPR:
        setObserveExpr((Expression)newValue);
        return;
      case SimUiDslPackage.OBSERVE_ELEMENT__STATEMENT_BLOCK:
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
      case SimUiDslPackage.OBSERVE_ELEMENT__OBSERVE_EXPR:
        setObserveExpr((Expression)null);
        return;
      case SimUiDslPackage.OBSERVE_ELEMENT__STATEMENT_BLOCK:
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
      case SimUiDslPackage.OBSERVE_ELEMENT__OBSERVE_EXPR:
        return observeExpr != null;
      case SimUiDslPackage.OBSERVE_ELEMENT__STATEMENT_BLOCK:
        return statementBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //ObserveElementImpl

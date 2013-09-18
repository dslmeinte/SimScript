/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.Method;
import nl.dslmeinte.simscript.ui.simUiDsl.MethodDefinition;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodDefinitionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.MethodDefinitionImpl#getStatementBlock <em>Statement Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodDefinitionImpl extends TopLevelDefinitionImpl implements MethodDefinition
{
  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected Method method;

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
  protected MethodDefinitionImpl()
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
    return SimUiDslPackage.Literals.METHOD_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethod(Method newMethod, NotificationChain msgs)
  {
    Method oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.METHOD_DEFINITION__METHOD, oldMethod, newMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(Method newMethod)
  {
    if (newMethod != method)
    {
      NotificationChain msgs = null;
      if (method != null)
        msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.METHOD_DEFINITION__METHOD, null, msgs);
      if (newMethod != null)
        msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.METHOD_DEFINITION__METHOD, null, msgs);
      msgs = basicSetMethod(newMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.METHOD_DEFINITION__METHOD, newMethod, newMethod));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.METHOD_DEFINITION__STATEMENT_BLOCK, oldStatementBlock, newStatementBlock);
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
        msgs = ((InternalEObject)statementBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.METHOD_DEFINITION__STATEMENT_BLOCK, null, msgs);
      if (newStatementBlock != null)
        msgs = ((InternalEObject)newStatementBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.METHOD_DEFINITION__STATEMENT_BLOCK, null, msgs);
      msgs = basicSetStatementBlock(newStatementBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.METHOD_DEFINITION__STATEMENT_BLOCK, newStatementBlock, newStatementBlock));
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
      case SimUiDslPackage.METHOD_DEFINITION__METHOD:
        return basicSetMethod(null, msgs);
      case SimUiDslPackage.METHOD_DEFINITION__STATEMENT_BLOCK:
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
      case SimUiDslPackage.METHOD_DEFINITION__METHOD:
        return getMethod();
      case SimUiDslPackage.METHOD_DEFINITION__STATEMENT_BLOCK:
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
      case SimUiDslPackage.METHOD_DEFINITION__METHOD:
        setMethod((Method)newValue);
        return;
      case SimUiDslPackage.METHOD_DEFINITION__STATEMENT_BLOCK:
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
      case SimUiDslPackage.METHOD_DEFINITION__METHOD:
        setMethod((Method)null);
        return;
      case SimUiDslPackage.METHOD_DEFINITION__STATEMENT_BLOCK:
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
      case SimUiDslPackage.METHOD_DEFINITION__METHOD:
        return method != null;
      case SimUiDslPackage.METHOD_DEFINITION__STATEMENT_BLOCK:
        return statementBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //MethodDefinitionImpl

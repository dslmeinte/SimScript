/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.ArgumentList;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.TableRowsDefinition;
import nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Rows Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TableRowsInvocationImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.TableRowsInvocationImpl#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableRowsInvocationImpl extends TableBodyElementImpl implements TableRowsInvocation
{
  /**
   * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinition()
   * @generated
   * @ordered
   */
  protected TableRowsDefinition definition;

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
  protected TableRowsInvocationImpl()
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
    return SimUiDslPackage.Literals.TABLE_ROWS_INVOCATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableRowsDefinition getDefinition()
  {
    if (definition != null && definition.eIsProxy())
    {
      InternalEObject oldDefinition = (InternalEObject)definition;
      definition = (TableRowsDefinition)eResolveProxy(oldDefinition);
      if (definition != oldDefinition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimUiDslPackage.TABLE_ROWS_INVOCATION__DEFINITION, oldDefinition, definition));
      }
    }
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableRowsDefinition basicGetDefinition()
  {
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefinition(TableRowsDefinition newDefinition)
  {
    TableRowsDefinition oldDefinition = definition;
    definition = newDefinition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TABLE_ROWS_INVOCATION__DEFINITION, oldDefinition, definition));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TABLE_ROWS_INVOCATION__ARGUMENT_LIST, oldArgumentList, newArgumentList);
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
        msgs = ((InternalEObject)argumentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TABLE_ROWS_INVOCATION__ARGUMENT_LIST, null, msgs);
      if (newArgumentList != null)
        msgs = ((InternalEObject)newArgumentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.TABLE_ROWS_INVOCATION__ARGUMENT_LIST, null, msgs);
      msgs = basicSetArgumentList(newArgumentList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.TABLE_ROWS_INVOCATION__ARGUMENT_LIST, newArgumentList, newArgumentList));
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
      case SimUiDslPackage.TABLE_ROWS_INVOCATION__ARGUMENT_LIST:
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
      case SimUiDslPackage.TABLE_ROWS_INVOCATION__DEFINITION:
        if (resolve) return getDefinition();
        return basicGetDefinition();
      case SimUiDslPackage.TABLE_ROWS_INVOCATION__ARGUMENT_LIST:
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
      case SimUiDslPackage.TABLE_ROWS_INVOCATION__DEFINITION:
        setDefinition((TableRowsDefinition)newValue);
        return;
      case SimUiDslPackage.TABLE_ROWS_INVOCATION__ARGUMENT_LIST:
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
      case SimUiDslPackage.TABLE_ROWS_INVOCATION__DEFINITION:
        setDefinition((TableRowsDefinition)null);
        return;
      case SimUiDslPackage.TABLE_ROWS_INVOCATION__ARGUMENT_LIST:
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
      case SimUiDslPackage.TABLE_ROWS_INVOCATION__DEFINITION:
        return definition != null;
      case SimUiDslPackage.TABLE_ROWS_INVOCATION__ARGUMENT_LIST:
        return argumentList != null;
    }
    return super.eIsSet(featureID);
  }

} //TableRowsInvocationImpl

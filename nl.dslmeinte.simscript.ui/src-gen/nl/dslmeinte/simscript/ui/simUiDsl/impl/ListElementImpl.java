/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.ElementBody;
import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.ListElement;
import nl.dslmeinte.simscript.ui.simUiDsl.ListVariable;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListElementImpl#getIndexVariable <em>Index Variable</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListElementImpl#getValueVariable <em>Value Variable</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListElementImpl#getListExpression <em>List Expression</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.ListElementImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListElementImpl extends ElementImpl implements ListElement
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
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected ElementBody body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListElementImpl()
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
    return SimUiDslPackage.Literals.LIST_ELEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.LIST_ELEMENT__INDEX_VARIABLE, oldIndexVariable, newIndexVariable);
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
        msgs = ((InternalEObject)indexVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.LIST_ELEMENT__INDEX_VARIABLE, null, msgs);
      if (newIndexVariable != null)
        msgs = ((InternalEObject)newIndexVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.LIST_ELEMENT__INDEX_VARIABLE, null, msgs);
      msgs = basicSetIndexVariable(newIndexVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.LIST_ELEMENT__INDEX_VARIABLE, newIndexVariable, newIndexVariable));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.LIST_ELEMENT__VALUE_VARIABLE, oldValueVariable, newValueVariable);
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
        msgs = ((InternalEObject)valueVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.LIST_ELEMENT__VALUE_VARIABLE, null, msgs);
      if (newValueVariable != null)
        msgs = ((InternalEObject)newValueVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.LIST_ELEMENT__VALUE_VARIABLE, null, msgs);
      msgs = basicSetValueVariable(newValueVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.LIST_ELEMENT__VALUE_VARIABLE, newValueVariable, newValueVariable));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.LIST_ELEMENT__LIST_EXPRESSION, oldListExpression, newListExpression);
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
        msgs = ((InternalEObject)listExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.LIST_ELEMENT__LIST_EXPRESSION, null, msgs);
      if (newListExpression != null)
        msgs = ((InternalEObject)newListExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.LIST_ELEMENT__LIST_EXPRESSION, null, msgs);
      msgs = basicSetListExpression(newListExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.LIST_ELEMENT__LIST_EXPRESSION, newListExpression, newListExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementBody getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(ElementBody newBody, NotificationChain msgs)
  {
    ElementBody oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.LIST_ELEMENT__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(ElementBody newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.LIST_ELEMENT__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.LIST_ELEMENT__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.LIST_ELEMENT__BODY, newBody, newBody));
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
      case SimUiDslPackage.LIST_ELEMENT__INDEX_VARIABLE:
        return basicSetIndexVariable(null, msgs);
      case SimUiDslPackage.LIST_ELEMENT__VALUE_VARIABLE:
        return basicSetValueVariable(null, msgs);
      case SimUiDslPackage.LIST_ELEMENT__LIST_EXPRESSION:
        return basicSetListExpression(null, msgs);
      case SimUiDslPackage.LIST_ELEMENT__BODY:
        return basicSetBody(null, msgs);
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
      case SimUiDslPackage.LIST_ELEMENT__INDEX_VARIABLE:
        return getIndexVariable();
      case SimUiDslPackage.LIST_ELEMENT__VALUE_VARIABLE:
        return getValueVariable();
      case SimUiDslPackage.LIST_ELEMENT__LIST_EXPRESSION:
        return getListExpression();
      case SimUiDslPackage.LIST_ELEMENT__BODY:
        return getBody();
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
      case SimUiDslPackage.LIST_ELEMENT__INDEX_VARIABLE:
        setIndexVariable((ListVariable)newValue);
        return;
      case SimUiDslPackage.LIST_ELEMENT__VALUE_VARIABLE:
        setValueVariable((ListVariable)newValue);
        return;
      case SimUiDslPackage.LIST_ELEMENT__LIST_EXPRESSION:
        setListExpression((Expression)newValue);
        return;
      case SimUiDslPackage.LIST_ELEMENT__BODY:
        setBody((ElementBody)newValue);
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
      case SimUiDslPackage.LIST_ELEMENT__INDEX_VARIABLE:
        setIndexVariable((ListVariable)null);
        return;
      case SimUiDslPackage.LIST_ELEMENT__VALUE_VARIABLE:
        setValueVariable((ListVariable)null);
        return;
      case SimUiDslPackage.LIST_ELEMENT__LIST_EXPRESSION:
        setListExpression((Expression)null);
        return;
      case SimUiDslPackage.LIST_ELEMENT__BODY:
        setBody((ElementBody)null);
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
      case SimUiDslPackage.LIST_ELEMENT__INDEX_VARIABLE:
        return indexVariable != null;
      case SimUiDslPackage.LIST_ELEMENT__VALUE_VARIABLE:
        return valueVariable != null;
      case SimUiDslPackage.LIST_ELEMENT__LIST_EXPRESSION:
        return listExpression != null;
      case SimUiDslPackage.LIST_ELEMENT__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

} //ListElementImpl

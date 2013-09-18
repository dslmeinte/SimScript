/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral;

import nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration;
import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Value Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.AbstractValueDeclarationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.AbstractValueDeclarationImpl#getDeclaredType <em>Declared Type</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.AbstractValueDeclarationImpl#getValueExpr <em>Value Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractValueDeclarationImpl extends MinimalEObjectImpl.Container implements AbstractValueDeclaration
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Value value;

  /**
   * The cached value of the '{@link #getDeclaredType() <em>Declared Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredType()
   * @generated
   * @ordered
   */
  protected TypeLiteral declaredType;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractValueDeclarationImpl()
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
    return SimUiDslPackage.Literals.ABSTRACT_VALUE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Value newValue, NotificationChain msgs)
  {
    Value oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Value newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLiteral getDeclaredType()
  {
    return declaredType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaredType(TypeLiteral newDeclaredType, NotificationChain msgs)
  {
    TypeLiteral oldDeclaredType = declaredType;
    declaredType = newDeclaredType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__DECLARED_TYPE, oldDeclaredType, newDeclaredType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaredType(TypeLiteral newDeclaredType)
  {
    if (newDeclaredType != declaredType)
    {
      NotificationChain msgs = null;
      if (declaredType != null)
        msgs = ((InternalEObject)declaredType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__DECLARED_TYPE, null, msgs);
      if (newDeclaredType != null)
        msgs = ((InternalEObject)newDeclaredType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__DECLARED_TYPE, null, msgs);
      msgs = basicSetDeclaredType(newDeclaredType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__DECLARED_TYPE, newDeclaredType, newDeclaredType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE_EXPR, oldValueExpr, newValueExpr);
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
        msgs = ((InternalEObject)valueExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE_EXPR, null, msgs);
      if (newValueExpr != null)
        msgs = ((InternalEObject)newValueExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE_EXPR, null, msgs);
      msgs = basicSetValueExpr(newValueExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE_EXPR, newValueExpr, newValueExpr));
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
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE:
        return basicSetValue(null, msgs);
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__DECLARED_TYPE:
        return basicSetDeclaredType(null, msgs);
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE_EXPR:
        return basicSetValueExpr(null, msgs);
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
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE:
        return getValue();
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__DECLARED_TYPE:
        return getDeclaredType();
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE_EXPR:
        return getValueExpr();
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
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE:
        setValue((Value)newValue);
        return;
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__DECLARED_TYPE:
        setDeclaredType((TypeLiteral)newValue);
        return;
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE_EXPR:
        setValueExpr((Expression)newValue);
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
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE:
        setValue((Value)null);
        return;
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__DECLARED_TYPE:
        setDeclaredType((TypeLiteral)null);
        return;
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE_EXPR:
        setValueExpr((Expression)null);
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
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE:
        return value != null;
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__DECLARED_TYPE:
        return declaredType != null;
      case SimUiDslPackage.ABSTRACT_VALUE_DECLARATION__VALUE_EXPR:
        return valueExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //AbstractValueDeclarationImpl

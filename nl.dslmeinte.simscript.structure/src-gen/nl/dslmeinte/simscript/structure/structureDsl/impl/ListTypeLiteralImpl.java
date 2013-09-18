/**
 */
package nl.dslmeinte.simscript.structure.structureDsl.impl;

import nl.dslmeinte.simscript.structure.structureDsl.ListTypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage;
import nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Type Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.structure.structureDsl.impl.ListTypeLiteralImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListTypeLiteralImpl extends TypeLiteralImpl implements ListTypeLiteral
{
  /**
   * The cached value of the '{@link #getItemType() <em>Item Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItemType()
   * @generated
   * @ordered
   */
  protected TypeLiteral itemType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListTypeLiteralImpl()
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
    return StructureDslPackage.Literals.LIST_TYPE_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLiteral getItemType()
  {
    return itemType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetItemType(TypeLiteral newItemType, NotificationChain msgs)
  {
    TypeLiteral oldItemType = itemType;
    itemType = newItemType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructureDslPackage.LIST_TYPE_LITERAL__ITEM_TYPE, oldItemType, newItemType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItemType(TypeLiteral newItemType)
  {
    if (newItemType != itemType)
    {
      NotificationChain msgs = null;
      if (itemType != null)
        msgs = ((InternalEObject)itemType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructureDslPackage.LIST_TYPE_LITERAL__ITEM_TYPE, null, msgs);
      if (newItemType != null)
        msgs = ((InternalEObject)newItemType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructureDslPackage.LIST_TYPE_LITERAL__ITEM_TYPE, null, msgs);
      msgs = basicSetItemType(newItemType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructureDslPackage.LIST_TYPE_LITERAL__ITEM_TYPE, newItemType, newItemType));
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
      case StructureDslPackage.LIST_TYPE_LITERAL__ITEM_TYPE:
        return basicSetItemType(null, msgs);
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
      case StructureDslPackage.LIST_TYPE_LITERAL__ITEM_TYPE:
        return getItemType();
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
      case StructureDslPackage.LIST_TYPE_LITERAL__ITEM_TYPE:
        setItemType((TypeLiteral)newValue);
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
      case StructureDslPackage.LIST_TYPE_LITERAL__ITEM_TYPE:
        setItemType((TypeLiteral)null);
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
      case StructureDslPackage.LIST_TYPE_LITERAL__ITEM_TYPE:
        return itemType != null;
    }
    return super.eIsSet(featureID);
  }

} //ListTypeLiteralImpl

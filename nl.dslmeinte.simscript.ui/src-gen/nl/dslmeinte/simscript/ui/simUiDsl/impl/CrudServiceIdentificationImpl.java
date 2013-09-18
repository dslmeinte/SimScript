/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.structure.structureDsl.Structure;

import nl.dslmeinte.simscript.ui.simUiDsl.CrudServiceIdentification;
import nl.dslmeinte.simscript.ui.simUiDsl.CrudTypes;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crud Service Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CrudServiceIdentificationImpl#getCrudType <em>Crud Type</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.CrudServiceIdentificationImpl#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CrudServiceIdentificationImpl extends ServiceIdentificationImpl implements CrudServiceIdentification
{
  /**
   * The default value of the '{@link #getCrudType() <em>Crud Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCrudType()
   * @generated
   * @ordered
   */
  protected static final CrudTypes CRUD_TYPE_EDEFAULT = CrudTypes.CREATE;

  /**
   * The cached value of the '{@link #getCrudType() <em>Crud Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCrudType()
   * @generated
   * @ordered
   */
  protected CrudTypes crudType = CRUD_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getStructure() <em>Structure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructure()
   * @generated
   * @ordered
   */
  protected Structure structure;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CrudServiceIdentificationImpl()
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
    return SimUiDslPackage.Literals.CRUD_SERVICE_IDENTIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CrudTypes getCrudType()
  {
    return crudType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCrudType(CrudTypes newCrudType)
  {
    CrudTypes oldCrudType = crudType;
    crudType = newCrudType == null ? CRUD_TYPE_EDEFAULT : newCrudType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.CRUD_SERVICE_IDENTIFICATION__CRUD_TYPE, oldCrudType, crudType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Structure getStructure()
  {
    if (structure != null && structure.eIsProxy())
    {
      InternalEObject oldStructure = (InternalEObject)structure;
      structure = (Structure)eResolveProxy(oldStructure);
      if (structure != oldStructure)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimUiDslPackage.CRUD_SERVICE_IDENTIFICATION__STRUCTURE, oldStructure, structure));
      }
    }
    return structure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Structure basicGetStructure()
  {
    return structure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructure(Structure newStructure)
  {
    Structure oldStructure = structure;
    structure = newStructure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.CRUD_SERVICE_IDENTIFICATION__STRUCTURE, oldStructure, structure));
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
      case SimUiDslPackage.CRUD_SERVICE_IDENTIFICATION__CRUD_TYPE:
        return getCrudType();
      case SimUiDslPackage.CRUD_SERVICE_IDENTIFICATION__STRUCTURE:
        if (resolve) return getStructure();
        return basicGetStructure();
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
      case SimUiDslPackage.CRUD_SERVICE_IDENTIFICATION__CRUD_TYPE:
        setCrudType((CrudTypes)newValue);
        return;
      case SimUiDslPackage.CRUD_SERVICE_IDENTIFICATION__STRUCTURE:
        setStructure((Structure)newValue);
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
      case SimUiDslPackage.CRUD_SERVICE_IDENTIFICATION__CRUD_TYPE:
        setCrudType(CRUD_TYPE_EDEFAULT);
        return;
      case SimUiDslPackage.CRUD_SERVICE_IDENTIFICATION__STRUCTURE:
        setStructure((Structure)null);
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
      case SimUiDslPackage.CRUD_SERVICE_IDENTIFICATION__CRUD_TYPE:
        return crudType != CRUD_TYPE_EDEFAULT;
      case SimUiDslPackage.CRUD_SERVICE_IDENTIFICATION__STRUCTURE:
        return structure != null;
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
    result.append(" (crudType: ");
    result.append(crudType);
    result.append(')');
    return result.toString();
  }

} //CrudServiceIdentificationImpl

/**
 */
package nl.dslmeinte.simscript.backend.simBackendDsl.impl;

import java.util.Collection;

import nl.dslmeinte.simscript.backend.simBackendDsl.CrudService;
import nl.dslmeinte.simscript.backend.simBackendDsl.CrudTypes;
import nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage;

import nl.dslmeinte.simscript.structure.structureDsl.Structure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crud Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.CrudServiceImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.CrudServiceImpl#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CrudServiceImpl extends ServiceImpl implements CrudService
{
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
   * The cached value of the '{@link #getServices() <em>Services</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServices()
   * @generated
   * @ordered
   */
  protected EList<CrudTypes> services;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CrudServiceImpl()
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
    return SimBackendDslPackage.Literals.CRUD_SERVICE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimBackendDslPackage.CRUD_SERVICE__STRUCTURE, oldStructure, structure));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.CRUD_SERVICE__STRUCTURE, oldStructure, structure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CrudTypes> getServices()
  {
    if (services == null)
    {
      services = new EDataTypeEList<CrudTypes>(CrudTypes.class, this, SimBackendDslPackage.CRUD_SERVICE__SERVICES);
    }
    return services;
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
      case SimBackendDslPackage.CRUD_SERVICE__STRUCTURE:
        if (resolve) return getStructure();
        return basicGetStructure();
      case SimBackendDslPackage.CRUD_SERVICE__SERVICES:
        return getServices();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimBackendDslPackage.CRUD_SERVICE__STRUCTURE:
        setStructure((Structure)newValue);
        return;
      case SimBackendDslPackage.CRUD_SERVICE__SERVICES:
        getServices().clear();
        getServices().addAll((Collection<? extends CrudTypes>)newValue);
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
      case SimBackendDslPackage.CRUD_SERVICE__STRUCTURE:
        setStructure((Structure)null);
        return;
      case SimBackendDslPackage.CRUD_SERVICE__SERVICES:
        getServices().clear();
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
      case SimBackendDslPackage.CRUD_SERVICE__STRUCTURE:
        return structure != null;
      case SimBackendDslPackage.CRUD_SERVICE__SERVICES:
        return services != null && !services.isEmpty();
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
    result.append(" (services: ");
    result.append(services);
    result.append(')');
    return result.toString();
  }

} //CrudServiceImpl

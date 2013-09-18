/**
 */
package nl.dslmeinte.simscript.structure.structureDsl.impl;

import java.util.Collection;

import nl.dslmeinte.simscript.structure.structureDsl.DefinedType;
import nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage;
import nl.dslmeinte.simscript.structure.structureDsl.StructureModel;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.structure.structureDsl.impl.StructureModelImpl#getTypeDefinitions <em>Type Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureModelImpl extends MinimalEObjectImpl.Container implements StructureModel
{
  /**
   * The cached value of the '{@link #getTypeDefinitions() <em>Type Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDefinitions()
   * @generated
   * @ordered
   */
  protected EList<DefinedType> typeDefinitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructureModelImpl()
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
    return StructureDslPackage.Literals.STRUCTURE_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DefinedType> getTypeDefinitions()
  {
    if (typeDefinitions == null)
    {
      typeDefinitions = new EObjectContainmentEList<DefinedType>(DefinedType.class, this, StructureDslPackage.STRUCTURE_MODEL__TYPE_DEFINITIONS);
    }
    return typeDefinitions;
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
      case StructureDslPackage.STRUCTURE_MODEL__TYPE_DEFINITIONS:
        return ((InternalEList<?>)getTypeDefinitions()).basicRemove(otherEnd, msgs);
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
      case StructureDslPackage.STRUCTURE_MODEL__TYPE_DEFINITIONS:
        return getTypeDefinitions();
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
      case StructureDslPackage.STRUCTURE_MODEL__TYPE_DEFINITIONS:
        getTypeDefinitions().clear();
        getTypeDefinitions().addAll((Collection<? extends DefinedType>)newValue);
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
      case StructureDslPackage.STRUCTURE_MODEL__TYPE_DEFINITIONS:
        getTypeDefinitions().clear();
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
      case StructureDslPackage.STRUCTURE_MODEL__TYPE_DEFINITIONS:
        return typeDefinitions != null && !typeDefinitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StructureModelImpl

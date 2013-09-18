/**
 */
package nl.dslmeinte.simscript.structure.structureDsl.impl;

import java.util.Collection;

import nl.dslmeinte.simscript.structure.structureDsl.Feature;
import nl.dslmeinte.simscript.structure.structureDsl.Structure;
import nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage;
import nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.structure.structureDsl.impl.StructureImpl#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.structure.structureDsl.impl.StructureImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureImpl extends DefinedTypeImpl implements Structure
{
  /**
   * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPersistent()
   * @generated
   * @ordered
   */
  protected static final boolean PERSISTENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPersistent()
   * @generated
   * @ordered
   */
  protected boolean persistent = PERSISTENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<Feature<TypeLiteral>> features;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructureImpl()
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
    return StructureDslPackage.Literals.STRUCTURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPersistent()
  {
    return persistent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersistent(boolean newPersistent)
  {
    boolean oldPersistent = persistent;
    persistent = newPersistent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructureDslPackage.STRUCTURE__PERSISTENT, oldPersistent, persistent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature<TypeLiteral>> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<Feature<TypeLiteral>>(Feature.class, this, StructureDslPackage.STRUCTURE__FEATURES);
    }
    return features;
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
      case StructureDslPackage.STRUCTURE__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
      case StructureDslPackage.STRUCTURE__PERSISTENT:
        return isPersistent();
      case StructureDslPackage.STRUCTURE__FEATURES:
        return getFeatures();
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
      case StructureDslPackage.STRUCTURE__PERSISTENT:
        setPersistent((Boolean)newValue);
        return;
      case StructureDslPackage.STRUCTURE__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends Feature<TypeLiteral>>)newValue);
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
      case StructureDslPackage.STRUCTURE__PERSISTENT:
        setPersistent(PERSISTENT_EDEFAULT);
        return;
      case StructureDslPackage.STRUCTURE__FEATURES:
        getFeatures().clear();
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
      case StructureDslPackage.STRUCTURE__PERSISTENT:
        return persistent != PERSISTENT_EDEFAULT;
      case StructureDslPackage.STRUCTURE__FEATURES:
        return features != null && !features.isEmpty();
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
    result.append(" (persistent: ");
    result.append(persistent);
    result.append(')');
    return result.toString();
  }

} //StructureImpl

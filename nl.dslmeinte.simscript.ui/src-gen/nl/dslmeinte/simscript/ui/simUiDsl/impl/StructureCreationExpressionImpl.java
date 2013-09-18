/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import java.util.Collection;

import nl.dslmeinte.simscript.structure.structureDsl.Structure;

import nl.dslmeinte.simscript.ui.simUiDsl.FeatureAssignment;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.StructureCreationExpression;

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
 * An implementation of the model object '<em><b>Structure Creation Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.StructureCreationExpressionImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.StructureCreationExpressionImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureCreationExpressionImpl extends ExpressionImpl implements StructureCreationExpression
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
   * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignments()
   * @generated
   * @ordered
   */
  protected EList<FeatureAssignment> assignments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructureCreationExpressionImpl()
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
    return SimUiDslPackage.Literals.STRUCTURE_CREATION_EXPRESSION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimUiDslPackage.STRUCTURE_CREATION_EXPRESSION__STRUCTURE, oldStructure, structure));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.STRUCTURE_CREATION_EXPRESSION__STRUCTURE, oldStructure, structure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FeatureAssignment> getAssignments()
  {
    if (assignments == null)
    {
      assignments = new EObjectContainmentEList<FeatureAssignment>(FeatureAssignment.class, this, SimUiDslPackage.STRUCTURE_CREATION_EXPRESSION__ASSIGNMENTS);
    }
    return assignments;
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
      case SimUiDslPackage.STRUCTURE_CREATION_EXPRESSION__ASSIGNMENTS:
        return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
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
      case SimUiDslPackage.STRUCTURE_CREATION_EXPRESSION__STRUCTURE:
        if (resolve) return getStructure();
        return basicGetStructure();
      case SimUiDslPackage.STRUCTURE_CREATION_EXPRESSION__ASSIGNMENTS:
        return getAssignments();
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
      case SimUiDslPackage.STRUCTURE_CREATION_EXPRESSION__STRUCTURE:
        setStructure((Structure)newValue);
        return;
      case SimUiDslPackage.STRUCTURE_CREATION_EXPRESSION__ASSIGNMENTS:
        getAssignments().clear();
        getAssignments().addAll((Collection<? extends FeatureAssignment>)newValue);
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
      case SimUiDslPackage.STRUCTURE_CREATION_EXPRESSION__STRUCTURE:
        setStructure((Structure)null);
        return;
      case SimUiDslPackage.STRUCTURE_CREATION_EXPRESSION__ASSIGNMENTS:
        getAssignments().clear();
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
      case SimUiDslPackage.STRUCTURE_CREATION_EXPRESSION__STRUCTURE:
        return structure != null;
      case SimUiDslPackage.STRUCTURE_CREATION_EXPRESSION__ASSIGNMENTS:
        return assignments != null && !assignments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StructureCreationExpressionImpl

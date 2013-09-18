/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import java.util.Collection;

import nl.dslmeinte.simscript.ui.simUiDsl.ElementBody;
import nl.dslmeinte.simscript.ui.simUiDsl.GroupElement;
import nl.dslmeinte.simscript.ui.simUiDsl.GroupOrientations;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.VerticalAlignment;

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
 * An implementation of the model object '<em><b>Group Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GroupElementImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GroupElementImpl#getV_align <em>Valign</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GroupElementImpl#getNestedGroups <em>Nested Groups</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GroupElementImpl#getLeafGroups <em>Leaf Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupElementImpl extends ElementImpl implements GroupElement
{
  /**
   * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrientation()
   * @generated
   * @ordered
   */
  protected static final GroupOrientations ORIENTATION_EDEFAULT = GroupOrientations.VERTICAL;

  /**
   * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrientation()
   * @generated
   * @ordered
   */
  protected GroupOrientations orientation = ORIENTATION_EDEFAULT;

  /**
   * The default value of the '{@link #getV_align() <em>Valign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV_align()
   * @generated
   * @ordered
   */
  protected static final VerticalAlignment VALIGN_EDEFAULT = VerticalAlignment.TOP;

  /**
   * The cached value of the '{@link #getV_align() <em>Valign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV_align()
   * @generated
   * @ordered
   */
  protected VerticalAlignment v_align = VALIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getNestedGroups() <em>Nested Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNestedGroups()
   * @generated
   * @ordered
   */
  protected EList<GroupElement> nestedGroups;

  /**
   * The cached value of the '{@link #getLeafGroups() <em>Leaf Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeafGroups()
   * @generated
   * @ordered
   */
  protected EList<ElementBody> leafGroups;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupElementImpl()
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
    return SimUiDslPackage.Literals.GROUP_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupOrientations getOrientation()
  {
    return orientation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrientation(GroupOrientations newOrientation)
  {
    GroupOrientations oldOrientation = orientation;
    orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GROUP_ELEMENT__ORIENTATION, oldOrientation, orientation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerticalAlignment getV_align()
  {
    return v_align;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV_align(VerticalAlignment newV_align)
  {
    VerticalAlignment oldV_align = v_align;
    v_align = newV_align == null ? VALIGN_EDEFAULT : newV_align;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GROUP_ELEMENT__VALIGN, oldV_align, v_align));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GroupElement> getNestedGroups()
  {
    if (nestedGroups == null)
    {
      nestedGroups = new EObjectContainmentEList<GroupElement>(GroupElement.class, this, SimUiDslPackage.GROUP_ELEMENT__NESTED_GROUPS);
    }
    return nestedGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementBody> getLeafGroups()
  {
    if (leafGroups == null)
    {
      leafGroups = new EObjectContainmentEList<ElementBody>(ElementBody.class, this, SimUiDslPackage.GROUP_ELEMENT__LEAF_GROUPS);
    }
    return leafGroups;
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
      case SimUiDslPackage.GROUP_ELEMENT__NESTED_GROUPS:
        return ((InternalEList<?>)getNestedGroups()).basicRemove(otherEnd, msgs);
      case SimUiDslPackage.GROUP_ELEMENT__LEAF_GROUPS:
        return ((InternalEList<?>)getLeafGroups()).basicRemove(otherEnd, msgs);
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
      case SimUiDslPackage.GROUP_ELEMENT__ORIENTATION:
        return getOrientation();
      case SimUiDslPackage.GROUP_ELEMENT__VALIGN:
        return getV_align();
      case SimUiDslPackage.GROUP_ELEMENT__NESTED_GROUPS:
        return getNestedGroups();
      case SimUiDslPackage.GROUP_ELEMENT__LEAF_GROUPS:
        return getLeafGroups();
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
      case SimUiDslPackage.GROUP_ELEMENT__ORIENTATION:
        setOrientation((GroupOrientations)newValue);
        return;
      case SimUiDslPackage.GROUP_ELEMENT__VALIGN:
        setV_align((VerticalAlignment)newValue);
        return;
      case SimUiDslPackage.GROUP_ELEMENT__NESTED_GROUPS:
        getNestedGroups().clear();
        getNestedGroups().addAll((Collection<? extends GroupElement>)newValue);
        return;
      case SimUiDslPackage.GROUP_ELEMENT__LEAF_GROUPS:
        getLeafGroups().clear();
        getLeafGroups().addAll((Collection<? extends ElementBody>)newValue);
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
      case SimUiDslPackage.GROUP_ELEMENT__ORIENTATION:
        setOrientation(ORIENTATION_EDEFAULT);
        return;
      case SimUiDslPackage.GROUP_ELEMENT__VALIGN:
        setV_align(VALIGN_EDEFAULT);
        return;
      case SimUiDslPackage.GROUP_ELEMENT__NESTED_GROUPS:
        getNestedGroups().clear();
        return;
      case SimUiDslPackage.GROUP_ELEMENT__LEAF_GROUPS:
        getLeafGroups().clear();
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
      case SimUiDslPackage.GROUP_ELEMENT__ORIENTATION:
        return orientation != ORIENTATION_EDEFAULT;
      case SimUiDslPackage.GROUP_ELEMENT__VALIGN:
        return v_align != VALIGN_EDEFAULT;
      case SimUiDslPackage.GROUP_ELEMENT__NESTED_GROUPS:
        return nestedGroups != null && !nestedGroups.isEmpty();
      case SimUiDslPackage.GROUP_ELEMENT__LEAF_GROUPS:
        return leafGroups != null && !leafGroups.isEmpty();
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
    result.append(" (orientation: ");
    result.append(orientation);
    result.append(", v_align: ");
    result.append(v_align);
    result.append(')');
    return result.toString();
  }

} //GroupElementImpl

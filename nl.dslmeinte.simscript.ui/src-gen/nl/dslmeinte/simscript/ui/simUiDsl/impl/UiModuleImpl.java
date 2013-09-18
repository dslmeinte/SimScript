/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import java.util.Collection;

import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.TopLevelDefinition;
import nl.dslmeinte.simscript.ui.simUiDsl.UiModule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.UiModuleImpl#isNotAuthenticated <em>Not Authenticated</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.UiModuleImpl#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UiModuleImpl extends MinimalEObjectImpl.Container implements UiModule
{
  /**
   * The default value of the '{@link #isNotAuthenticated() <em>Not Authenticated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotAuthenticated()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_AUTHENTICATED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNotAuthenticated() <em>Not Authenticated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNotAuthenticated()
   * @generated
   * @ordered
   */
  protected boolean notAuthenticated = NOT_AUTHENTICATED_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitions()
   * @generated
   * @ordered
   */
  protected EList<TopLevelDefinition> definitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UiModuleImpl()
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
    return SimUiDslPackage.Literals.UI_MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNotAuthenticated()
  {
    return notAuthenticated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotAuthenticated(boolean newNotAuthenticated)
  {
    boolean oldNotAuthenticated = notAuthenticated;
    notAuthenticated = newNotAuthenticated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.UI_MODULE__NOT_AUTHENTICATED, oldNotAuthenticated, notAuthenticated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TopLevelDefinition> getDefinitions()
  {
    if (definitions == null)
    {
      definitions = new EObjectContainmentEList<TopLevelDefinition>(TopLevelDefinition.class, this, SimUiDslPackage.UI_MODULE__DEFINITIONS);
    }
    return definitions;
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
      case SimUiDslPackage.UI_MODULE__DEFINITIONS:
        return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
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
      case SimUiDslPackage.UI_MODULE__NOT_AUTHENTICATED:
        return isNotAuthenticated();
      case SimUiDslPackage.UI_MODULE__DEFINITIONS:
        return getDefinitions();
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
      case SimUiDslPackage.UI_MODULE__NOT_AUTHENTICATED:
        setNotAuthenticated((Boolean)newValue);
        return;
      case SimUiDslPackage.UI_MODULE__DEFINITIONS:
        getDefinitions().clear();
        getDefinitions().addAll((Collection<? extends TopLevelDefinition>)newValue);
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
      case SimUiDslPackage.UI_MODULE__NOT_AUTHENTICATED:
        setNotAuthenticated(NOT_AUTHENTICATED_EDEFAULT);
        return;
      case SimUiDslPackage.UI_MODULE__DEFINITIONS:
        getDefinitions().clear();
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
      case SimUiDslPackage.UI_MODULE__NOT_AUTHENTICATED:
        return notAuthenticated != NOT_AUTHENTICATED_EDEFAULT;
      case SimUiDslPackage.UI_MODULE__DEFINITIONS:
        return definitions != null && !definitions.isEmpty();
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
    result.append(" (notAuthenticated: ");
    result.append(notAuthenticated);
    result.append(')');
    return result.toString();
  }

} //UiModuleImpl

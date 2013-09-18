/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.RadioOption;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radio Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.RadioOptionImpl#getTrue <em>True</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.RadioOptionImpl#getFalse <em>False</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadioOptionImpl extends MinimalEObjectImpl.Container implements RadioOption
{
  /**
   * The default value of the '{@link #getTrue() <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrue()
   * @generated
   * @ordered
   */
  protected static final String TRUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTrue() <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrue()
   * @generated
   * @ordered
   */
  protected String true_ = TRUE_EDEFAULT;

  /**
   * The default value of the '{@link #getFalse() <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalse()
   * @generated
   * @ordered
   */
  protected static final String FALSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFalse() <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalse()
   * @generated
   * @ordered
   */
  protected String false_ = FALSE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RadioOptionImpl()
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
    return SimUiDslPackage.Literals.RADIO_OPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTrue()
  {
    return true_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrue(String newTrue)
  {
    String oldTrue = true_;
    true_ = newTrue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.RADIO_OPTION__TRUE, oldTrue, true_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFalse()
  {
    return false_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFalse(String newFalse)
  {
    String oldFalse = false_;
    false_ = newFalse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.RADIO_OPTION__FALSE, oldFalse, false_));
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
      case SimUiDslPackage.RADIO_OPTION__TRUE:
        return getTrue();
      case SimUiDslPackage.RADIO_OPTION__FALSE:
        return getFalse();
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
      case SimUiDslPackage.RADIO_OPTION__TRUE:
        setTrue((String)newValue);
        return;
      case SimUiDslPackage.RADIO_OPTION__FALSE:
        setFalse((String)newValue);
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
      case SimUiDslPackage.RADIO_OPTION__TRUE:
        setTrue(TRUE_EDEFAULT);
        return;
      case SimUiDslPackage.RADIO_OPTION__FALSE:
        setFalse(FALSE_EDEFAULT);
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
      case SimUiDslPackage.RADIO_OPTION__TRUE:
        return TRUE_EDEFAULT == null ? true_ != null : !TRUE_EDEFAULT.equals(true_);
      case SimUiDslPackage.RADIO_OPTION__FALSE:
        return FALSE_EDEFAULT == null ? false_ != null : !FALSE_EDEFAULT.equals(false_);
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
    result.append(" (true: ");
    result.append(true_);
    result.append(", false: ");
    result.append(false_);
    result.append(')');
    return result.toString();
  }

} //RadioOptionImpl

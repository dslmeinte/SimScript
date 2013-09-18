/**
 */
package nl.dslmeinte.simscript.backend.simBackendDsl.impl;

import nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration;
import nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter;
import nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.AuthenticationDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.AuthenticationDeclarationImpl#getPrincipal <em>Principal</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.AuthenticationDeclarationImpl#getCredential <em>Credential</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthenticationDeclarationImpl extends MinimalEObjectImpl.Container implements AuthenticationDeclaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPrincipal() <em>Principal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrincipal()
   * @generated
   * @ordered
   */
  protected AuthenticationParameter principal;

  /**
   * The cached value of the '{@link #getCredential() <em>Credential</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCredential()
   * @generated
   * @ordered
   */
  protected AuthenticationParameter credential;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AuthenticationDeclarationImpl()
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
    return SimBackendDslPackage.Literals.AUTHENTICATION_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.AUTHENTICATION_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AuthenticationParameter getPrincipal()
  {
    return principal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrincipal(AuthenticationParameter newPrincipal, NotificationChain msgs)
  {
    AuthenticationParameter oldPrincipal = principal;
    principal = newPrincipal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.AUTHENTICATION_DECLARATION__PRINCIPAL, oldPrincipal, newPrincipal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrincipal(AuthenticationParameter newPrincipal)
  {
    if (newPrincipal != principal)
    {
      NotificationChain msgs = null;
      if (principal != null)
        msgs = ((InternalEObject)principal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimBackendDslPackage.AUTHENTICATION_DECLARATION__PRINCIPAL, null, msgs);
      if (newPrincipal != null)
        msgs = ((InternalEObject)newPrincipal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimBackendDslPackage.AUTHENTICATION_DECLARATION__PRINCIPAL, null, msgs);
      msgs = basicSetPrincipal(newPrincipal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.AUTHENTICATION_DECLARATION__PRINCIPAL, newPrincipal, newPrincipal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AuthenticationParameter getCredential()
  {
    return credential;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCredential(AuthenticationParameter newCredential, NotificationChain msgs)
  {
    AuthenticationParameter oldCredential = credential;
    credential = newCredential;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.AUTHENTICATION_DECLARATION__CREDENTIAL, oldCredential, newCredential);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCredential(AuthenticationParameter newCredential)
  {
    if (newCredential != credential)
    {
      NotificationChain msgs = null;
      if (credential != null)
        msgs = ((InternalEObject)credential).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimBackendDslPackage.AUTHENTICATION_DECLARATION__CREDENTIAL, null, msgs);
      if (newCredential != null)
        msgs = ((InternalEObject)newCredential).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimBackendDslPackage.AUTHENTICATION_DECLARATION__CREDENTIAL, null, msgs);
      msgs = basicSetCredential(newCredential, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.AUTHENTICATION_DECLARATION__CREDENTIAL, newCredential, newCredential));
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
      case SimBackendDslPackage.AUTHENTICATION_DECLARATION__PRINCIPAL:
        return basicSetPrincipal(null, msgs);
      case SimBackendDslPackage.AUTHENTICATION_DECLARATION__CREDENTIAL:
        return basicSetCredential(null, msgs);
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
      case SimBackendDslPackage.AUTHENTICATION_DECLARATION__NAME:
        return getName();
      case SimBackendDslPackage.AUTHENTICATION_DECLARATION__PRINCIPAL:
        return getPrincipal();
      case SimBackendDslPackage.AUTHENTICATION_DECLARATION__CREDENTIAL:
        return getCredential();
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
      case SimBackendDslPackage.AUTHENTICATION_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case SimBackendDslPackage.AUTHENTICATION_DECLARATION__PRINCIPAL:
        setPrincipal((AuthenticationParameter)newValue);
        return;
      case SimBackendDslPackage.AUTHENTICATION_DECLARATION__CREDENTIAL:
        setCredential((AuthenticationParameter)newValue);
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
      case SimBackendDslPackage.AUTHENTICATION_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SimBackendDslPackage.AUTHENTICATION_DECLARATION__PRINCIPAL:
        setPrincipal((AuthenticationParameter)null);
        return;
      case SimBackendDslPackage.AUTHENTICATION_DECLARATION__CREDENTIAL:
        setCredential((AuthenticationParameter)null);
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
      case SimBackendDslPackage.AUTHENTICATION_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SimBackendDslPackage.AUTHENTICATION_DECLARATION__PRINCIPAL:
        return principal != null;
      case SimBackendDslPackage.AUTHENTICATION_DECLARATION__CREDENTIAL:
        return credential != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AuthenticationDeclarationImpl

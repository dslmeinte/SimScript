/**
 */
package nl.dslmeinte.simscript.backend.simBackendDsl.impl;

import java.util.Collection;

import nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration;
import nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel;
import nl.dslmeinte.simscript.backend.simBackendDsl.Flavors;
import nl.dslmeinte.simscript.backend.simBackendDsl.Service;
import nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage;

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
 * An implementation of the model object '<em><b>Backend Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.BackendModelImpl#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.BackendModelImpl#getFlavor <em>Flavor</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.BackendModelImpl#getAuthOpts <em>Auth Opts</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.BackendModelImpl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BackendModelImpl extends MinimalEObjectImpl.Container implements BackendModel
{
  /**
   * The default value of the '{@link #getBaseUrl() <em>Base Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseUrl()
   * @generated
   * @ordered
   */
  protected static final String BASE_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBaseUrl() <em>Base Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseUrl()
   * @generated
   * @ordered
   */
  protected String baseUrl = BASE_URL_EDEFAULT;

  /**
   * The default value of the '{@link #getFlavor() <em>Flavor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlavor()
   * @generated
   * @ordered
   */
  protected static final Flavors FLAVOR_EDEFAULT = Flavors.JAVA;

  /**
   * The cached value of the '{@link #getFlavor() <em>Flavor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlavor()
   * @generated
   * @ordered
   */
  protected Flavors flavor = FLAVOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getAuthOpts() <em>Auth Opts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthOpts()
   * @generated
   * @ordered
   */
  protected EList<AuthenticationDeclaration> authOpts;

  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<Service> declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BackendModelImpl()
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
    return SimBackendDslPackage.Literals.BACKEND_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBaseUrl()
  {
    return baseUrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseUrl(String newBaseUrl)
  {
    String oldBaseUrl = baseUrl;
    baseUrl = newBaseUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.BACKEND_MODEL__BASE_URL, oldBaseUrl, baseUrl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flavors getFlavor()
  {
    return flavor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlavor(Flavors newFlavor)
  {
    Flavors oldFlavor = flavor;
    flavor = newFlavor == null ? FLAVOR_EDEFAULT : newFlavor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.BACKEND_MODEL__FLAVOR, oldFlavor, flavor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AuthenticationDeclaration> getAuthOpts()
  {
    if (authOpts == null)
    {
      authOpts = new EObjectContainmentEList<AuthenticationDeclaration>(AuthenticationDeclaration.class, this, SimBackendDslPackage.BACKEND_MODEL__AUTH_OPTS);
    }
    return authOpts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Service> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<Service>(Service.class, this, SimBackendDslPackage.BACKEND_MODEL__DECLARATIONS);
    }
    return declarations;
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
      case SimBackendDslPackage.BACKEND_MODEL__AUTH_OPTS:
        return ((InternalEList<?>)getAuthOpts()).basicRemove(otherEnd, msgs);
      case SimBackendDslPackage.BACKEND_MODEL__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
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
      case SimBackendDslPackage.BACKEND_MODEL__BASE_URL:
        return getBaseUrl();
      case SimBackendDslPackage.BACKEND_MODEL__FLAVOR:
        return getFlavor();
      case SimBackendDslPackage.BACKEND_MODEL__AUTH_OPTS:
        return getAuthOpts();
      case SimBackendDslPackage.BACKEND_MODEL__DECLARATIONS:
        return getDeclarations();
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
      case SimBackendDslPackage.BACKEND_MODEL__BASE_URL:
        setBaseUrl((String)newValue);
        return;
      case SimBackendDslPackage.BACKEND_MODEL__FLAVOR:
        setFlavor((Flavors)newValue);
        return;
      case SimBackendDslPackage.BACKEND_MODEL__AUTH_OPTS:
        getAuthOpts().clear();
        getAuthOpts().addAll((Collection<? extends AuthenticationDeclaration>)newValue);
        return;
      case SimBackendDslPackage.BACKEND_MODEL__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends Service>)newValue);
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
      case SimBackendDslPackage.BACKEND_MODEL__BASE_URL:
        setBaseUrl(BASE_URL_EDEFAULT);
        return;
      case SimBackendDslPackage.BACKEND_MODEL__FLAVOR:
        setFlavor(FLAVOR_EDEFAULT);
        return;
      case SimBackendDslPackage.BACKEND_MODEL__AUTH_OPTS:
        getAuthOpts().clear();
        return;
      case SimBackendDslPackage.BACKEND_MODEL__DECLARATIONS:
        getDeclarations().clear();
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
      case SimBackendDslPackage.BACKEND_MODEL__BASE_URL:
        return BASE_URL_EDEFAULT == null ? baseUrl != null : !BASE_URL_EDEFAULT.equals(baseUrl);
      case SimBackendDslPackage.BACKEND_MODEL__FLAVOR:
        return flavor != FLAVOR_EDEFAULT;
      case SimBackendDslPackage.BACKEND_MODEL__AUTH_OPTS:
        return authOpts != null && !authOpts.isEmpty();
      case SimBackendDslPackage.BACKEND_MODEL__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
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
    result.append(" (baseUrl: ");
    result.append(baseUrl);
    result.append(", flavor: ");
    result.append(flavor);
    result.append(')');
    return result.toString();
  }

} //BackendModelImpl

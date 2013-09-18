/**
 */
package nl.dslmeinte.simscript.backend.simBackendDsl.impl;

import nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet;
import nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legacy Servlet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.LegacyServletImpl#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.LegacyServletImpl#getFqClassName <em>Fq Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LegacyServletImpl extends NamedServiceImpl implements LegacyServlet
{
  /**
   * The default value of the '{@link #getUrlPattern() <em>Url Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrlPattern()
   * @generated
   * @ordered
   */
  protected static final String URL_PATTERN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrlPattern() <em>Url Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrlPattern()
   * @generated
   * @ordered
   */
  protected String urlPattern = URL_PATTERN_EDEFAULT;

  /**
   * The default value of the '{@link #getFqClassName() <em>Fq Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFqClassName()
   * @generated
   * @ordered
   */
  protected static final String FQ_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFqClassName() <em>Fq Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFqClassName()
   * @generated
   * @ordered
   */
  protected String fqClassName = FQ_CLASS_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LegacyServletImpl()
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
    return SimBackendDslPackage.Literals.LEGACY_SERVLET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrlPattern()
  {
    return urlPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrlPattern(String newUrlPattern)
  {
    String oldUrlPattern = urlPattern;
    urlPattern = newUrlPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.LEGACY_SERVLET__URL_PATTERN, oldUrlPattern, urlPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFqClassName()
  {
    return fqClassName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFqClassName(String newFqClassName)
  {
    String oldFqClassName = fqClassName;
    fqClassName = newFqClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.LEGACY_SERVLET__FQ_CLASS_NAME, oldFqClassName, fqClassName));
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
      case SimBackendDslPackage.LEGACY_SERVLET__URL_PATTERN:
        return getUrlPattern();
      case SimBackendDslPackage.LEGACY_SERVLET__FQ_CLASS_NAME:
        return getFqClassName();
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
      case SimBackendDslPackage.LEGACY_SERVLET__URL_PATTERN:
        setUrlPattern((String)newValue);
        return;
      case SimBackendDslPackage.LEGACY_SERVLET__FQ_CLASS_NAME:
        setFqClassName((String)newValue);
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
      case SimBackendDslPackage.LEGACY_SERVLET__URL_PATTERN:
        setUrlPattern(URL_PATTERN_EDEFAULT);
        return;
      case SimBackendDslPackage.LEGACY_SERVLET__FQ_CLASS_NAME:
        setFqClassName(FQ_CLASS_NAME_EDEFAULT);
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
      case SimBackendDslPackage.LEGACY_SERVLET__URL_PATTERN:
        return URL_PATTERN_EDEFAULT == null ? urlPattern != null : !URL_PATTERN_EDEFAULT.equals(urlPattern);
      case SimBackendDslPackage.LEGACY_SERVLET__FQ_CLASS_NAME:
        return FQ_CLASS_NAME_EDEFAULT == null ? fqClassName != null : !FQ_CLASS_NAME_EDEFAULT.equals(fqClassName);
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
    result.append(" (urlPattern: ");
    result.append(urlPattern);
    result.append(", fqClassName: ");
    result.append(fqClassName);
    result.append(')');
    return result.toString();
  }

} //LegacyServletImpl

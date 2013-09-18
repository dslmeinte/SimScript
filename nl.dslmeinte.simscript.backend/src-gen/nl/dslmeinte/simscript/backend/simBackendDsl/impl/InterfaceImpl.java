/**
 */
package nl.dslmeinte.simscript.backend.simBackendDsl.impl;

import nl.dslmeinte.simscript.backend.simBackendDsl.HttpMethods;
import nl.dslmeinte.simscript.backend.simBackendDsl.Interface;
import nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet;
import nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage;

import nl.dslmeinte.simscript.structure.structureDsl.DefinedTypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.InterfaceImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.InterfaceImpl#getInputType <em>Input Type</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.InterfaceImpl#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.InterfaceImpl#isNotAuthenticated <em>Not Authenticated</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.InterfaceImpl#getLegacyServlet <em>Legacy Servlet</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.impl.InterfaceImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends NamedServiceImpl implements Interface
{
  /**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final HttpMethods METHOD_EDEFAULT = HttpMethods.GET;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected HttpMethods method = METHOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getInputType() <em>Input Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputType()
   * @generated
   * @ordered
   */
  protected DefinedTypeLiteral inputType;

  /**
   * The cached value of the '{@link #getOutputType() <em>Output Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputType()
   * @generated
   * @ordered
   */
  protected TypeLiteral outputType;

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
   * The cached value of the '{@link #getLegacyServlet() <em>Legacy Servlet</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLegacyServlet()
   * @generated
   * @ordered
   */
  protected LegacyServlet legacyServlet;

  /**
   * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected static final String DOCUMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocumentation()
   * @generated
   * @ordered
   */
  protected String documentation = DOCUMENTATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceImpl()
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
    return SimBackendDslPackage.Literals.INTERFACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpMethods getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(HttpMethods newMethod)
  {
    HttpMethods oldMethod = method;
    method = newMethod == null ? METHOD_EDEFAULT : newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.INTERFACE__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinedTypeLiteral getInputType()
  {
    return inputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputType(DefinedTypeLiteral newInputType, NotificationChain msgs)
  {
    DefinedTypeLiteral oldInputType = inputType;
    inputType = newInputType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.INTERFACE__INPUT_TYPE, oldInputType, newInputType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputType(DefinedTypeLiteral newInputType)
  {
    if (newInputType != inputType)
    {
      NotificationChain msgs = null;
      if (inputType != null)
        msgs = ((InternalEObject)inputType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimBackendDslPackage.INTERFACE__INPUT_TYPE, null, msgs);
      if (newInputType != null)
        msgs = ((InternalEObject)newInputType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimBackendDslPackage.INTERFACE__INPUT_TYPE, null, msgs);
      msgs = basicSetInputType(newInputType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.INTERFACE__INPUT_TYPE, newInputType, newInputType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLiteral getOutputType()
  {
    return outputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputType(TypeLiteral newOutputType, NotificationChain msgs)
  {
    TypeLiteral oldOutputType = outputType;
    outputType = newOutputType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.INTERFACE__OUTPUT_TYPE, oldOutputType, newOutputType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputType(TypeLiteral newOutputType)
  {
    if (newOutputType != outputType)
    {
      NotificationChain msgs = null;
      if (outputType != null)
        msgs = ((InternalEObject)outputType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimBackendDslPackage.INTERFACE__OUTPUT_TYPE, null, msgs);
      if (newOutputType != null)
        msgs = ((InternalEObject)newOutputType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimBackendDslPackage.INTERFACE__OUTPUT_TYPE, null, msgs);
      msgs = basicSetOutputType(newOutputType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.INTERFACE__OUTPUT_TYPE, newOutputType, newOutputType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.INTERFACE__NOT_AUTHENTICATED, oldNotAuthenticated, notAuthenticated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LegacyServlet getLegacyServlet()
  {
    if (legacyServlet != null && legacyServlet.eIsProxy())
    {
      InternalEObject oldLegacyServlet = (InternalEObject)legacyServlet;
      legacyServlet = (LegacyServlet)eResolveProxy(oldLegacyServlet);
      if (legacyServlet != oldLegacyServlet)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimBackendDslPackage.INTERFACE__LEGACY_SERVLET, oldLegacyServlet, legacyServlet));
      }
    }
    return legacyServlet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LegacyServlet basicGetLegacyServlet()
  {
    return legacyServlet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLegacyServlet(LegacyServlet newLegacyServlet)
  {
    LegacyServlet oldLegacyServlet = legacyServlet;
    legacyServlet = newLegacyServlet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.INTERFACE__LEGACY_SERVLET, oldLegacyServlet, legacyServlet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDocumentation()
  {
    return documentation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocumentation(String newDocumentation)
  {
    String oldDocumentation = documentation;
    documentation = newDocumentation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimBackendDslPackage.INTERFACE__DOCUMENTATION, oldDocumentation, documentation));
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
      case SimBackendDslPackage.INTERFACE__INPUT_TYPE:
        return basicSetInputType(null, msgs);
      case SimBackendDslPackage.INTERFACE__OUTPUT_TYPE:
        return basicSetOutputType(null, msgs);
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
      case SimBackendDslPackage.INTERFACE__METHOD:
        return getMethod();
      case SimBackendDslPackage.INTERFACE__INPUT_TYPE:
        return getInputType();
      case SimBackendDslPackage.INTERFACE__OUTPUT_TYPE:
        return getOutputType();
      case SimBackendDslPackage.INTERFACE__NOT_AUTHENTICATED:
        return isNotAuthenticated();
      case SimBackendDslPackage.INTERFACE__LEGACY_SERVLET:
        if (resolve) return getLegacyServlet();
        return basicGetLegacyServlet();
      case SimBackendDslPackage.INTERFACE__DOCUMENTATION:
        return getDocumentation();
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
      case SimBackendDslPackage.INTERFACE__METHOD:
        setMethod((HttpMethods)newValue);
        return;
      case SimBackendDslPackage.INTERFACE__INPUT_TYPE:
        setInputType((DefinedTypeLiteral)newValue);
        return;
      case SimBackendDslPackage.INTERFACE__OUTPUT_TYPE:
        setOutputType((TypeLiteral)newValue);
        return;
      case SimBackendDslPackage.INTERFACE__NOT_AUTHENTICATED:
        setNotAuthenticated((Boolean)newValue);
        return;
      case SimBackendDslPackage.INTERFACE__LEGACY_SERVLET:
        setLegacyServlet((LegacyServlet)newValue);
        return;
      case SimBackendDslPackage.INTERFACE__DOCUMENTATION:
        setDocumentation((String)newValue);
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
      case SimBackendDslPackage.INTERFACE__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case SimBackendDslPackage.INTERFACE__INPUT_TYPE:
        setInputType((DefinedTypeLiteral)null);
        return;
      case SimBackendDslPackage.INTERFACE__OUTPUT_TYPE:
        setOutputType((TypeLiteral)null);
        return;
      case SimBackendDslPackage.INTERFACE__NOT_AUTHENTICATED:
        setNotAuthenticated(NOT_AUTHENTICATED_EDEFAULT);
        return;
      case SimBackendDslPackage.INTERFACE__LEGACY_SERVLET:
        setLegacyServlet((LegacyServlet)null);
        return;
      case SimBackendDslPackage.INTERFACE__DOCUMENTATION:
        setDocumentation(DOCUMENTATION_EDEFAULT);
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
      case SimBackendDslPackage.INTERFACE__METHOD:
        return method != METHOD_EDEFAULT;
      case SimBackendDslPackage.INTERFACE__INPUT_TYPE:
        return inputType != null;
      case SimBackendDslPackage.INTERFACE__OUTPUT_TYPE:
        return outputType != null;
      case SimBackendDslPackage.INTERFACE__NOT_AUTHENTICATED:
        return notAuthenticated != NOT_AUTHENTICATED_EDEFAULT;
      case SimBackendDslPackage.INTERFACE__LEGACY_SERVLET:
        return legacyServlet != null;
      case SimBackendDslPackage.INTERFACE__DOCUMENTATION:
        return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
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
    result.append(" (method: ");
    result.append(method);
    result.append(", notAuthenticated: ");
    result.append(notAuthenticated);
    result.append(", documentation: ");
    result.append(documentation);
    result.append(')');
    return result.toString();
  }

} //InterfaceImpl

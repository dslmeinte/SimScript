/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration;

import nl.dslmeinte.simscript.ui.simUiDsl.ArgumentList;
import nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.CredentialArgument;
import nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.UiModule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goto Module Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoModuleStatementImpl#getTargetModule <em>Target Module</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoModuleStatementImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoModuleStatementImpl#isAuthenticate <em>Authenticate</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoModuleStatementImpl#getAuthOption <em>Auth Option</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoModuleStatementImpl#getPrincipal <em>Principal</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoModuleStatementImpl#getCredential <em>Credential</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoModuleStatementImpl#getErrorCallback <em>Error Callback</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GotoModuleStatementImpl extends ExitingStatementImpl implements GotoModuleStatement
{
  /**
   * The cached value of the '{@link #getTargetModule() <em>Target Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetModule()
   * @generated
   * @ordered
   */
  protected UiModule targetModule;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected ArgumentList args;

  /**
   * The default value of the '{@link #isAuthenticate() <em>Authenticate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAuthenticate()
   * @generated
   * @ordered
   */
  protected static final boolean AUTHENTICATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAuthenticate() <em>Authenticate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAuthenticate()
   * @generated
   * @ordered
   */
  protected boolean authenticate = AUTHENTICATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getAuthOption() <em>Auth Option</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthOption()
   * @generated
   * @ordered
   */
  protected AuthenticationDeclaration authOption;

  /**
   * The cached value of the '{@link #getPrincipal() <em>Principal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrincipal()
   * @generated
   * @ordered
   */
  protected PrincipalArgument principal;

  /**
   * The cached value of the '{@link #getCredential() <em>Credential</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCredential()
   * @generated
   * @ordered
   */
  protected CredentialArgument credential;

  /**
   * The cached value of the '{@link #getErrorCallback() <em>Error Callback</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorCallback()
   * @generated
   * @ordered
   */
  protected CallbackExpression errorCallback;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GotoModuleStatementImpl()
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
    return SimUiDslPackage.Literals.GOTO_MODULE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UiModule getTargetModule()
  {
    if (targetModule != null && targetModule.eIsProxy())
    {
      InternalEObject oldTargetModule = (InternalEObject)targetModule;
      targetModule = (UiModule)eResolveProxy(oldTargetModule);
      if (targetModule != oldTargetModule)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimUiDslPackage.GOTO_MODULE_STATEMENT__TARGET_MODULE, oldTargetModule, targetModule));
      }
    }
    return targetModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UiModule basicGetTargetModule()
  {
    return targetModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetModule(UiModule newTargetModule)
  {
    UiModule oldTargetModule = targetModule;
    targetModule = newTargetModule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GOTO_MODULE_STATEMENT__TARGET_MODULE, oldTargetModule, targetModule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentList getArgs()
  {
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgs(ArgumentList newArgs, NotificationChain msgs)
  {
    ArgumentList oldArgs = args;
    args = newArgs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GOTO_MODULE_STATEMENT__ARGS, oldArgs, newArgs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgs(ArgumentList newArgs)
  {
    if (newArgs != args)
    {
      NotificationChain msgs = null;
      if (args != null)
        msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.GOTO_MODULE_STATEMENT__ARGS, null, msgs);
      if (newArgs != null)
        msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.GOTO_MODULE_STATEMENT__ARGS, null, msgs);
      msgs = basicSetArgs(newArgs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GOTO_MODULE_STATEMENT__ARGS, newArgs, newArgs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAuthenticate()
  {
    return authenticate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthenticate(boolean newAuthenticate)
  {
    boolean oldAuthenticate = authenticate;
    authenticate = newAuthenticate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GOTO_MODULE_STATEMENT__AUTHENTICATE, oldAuthenticate, authenticate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AuthenticationDeclaration getAuthOption()
  {
    if (authOption != null && authOption.eIsProxy())
    {
      InternalEObject oldAuthOption = (InternalEObject)authOption;
      authOption = (AuthenticationDeclaration)eResolveProxy(oldAuthOption);
      if (authOption != oldAuthOption)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimUiDslPackage.GOTO_MODULE_STATEMENT__AUTH_OPTION, oldAuthOption, authOption));
      }
    }
    return authOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AuthenticationDeclaration basicGetAuthOption()
  {
    return authOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthOption(AuthenticationDeclaration newAuthOption)
  {
    AuthenticationDeclaration oldAuthOption = authOption;
    authOption = newAuthOption;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GOTO_MODULE_STATEMENT__AUTH_OPTION, oldAuthOption, authOption));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrincipalArgument getPrincipal()
  {
    return principal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrincipal(PrincipalArgument newPrincipal, NotificationChain msgs)
  {
    PrincipalArgument oldPrincipal = principal;
    principal = newPrincipal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GOTO_MODULE_STATEMENT__PRINCIPAL, oldPrincipal, newPrincipal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrincipal(PrincipalArgument newPrincipal)
  {
    if (newPrincipal != principal)
    {
      NotificationChain msgs = null;
      if (principal != null)
        msgs = ((InternalEObject)principal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.GOTO_MODULE_STATEMENT__PRINCIPAL, null, msgs);
      if (newPrincipal != null)
        msgs = ((InternalEObject)newPrincipal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.GOTO_MODULE_STATEMENT__PRINCIPAL, null, msgs);
      msgs = basicSetPrincipal(newPrincipal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GOTO_MODULE_STATEMENT__PRINCIPAL, newPrincipal, newPrincipal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CredentialArgument getCredential()
  {
    return credential;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCredential(CredentialArgument newCredential, NotificationChain msgs)
  {
    CredentialArgument oldCredential = credential;
    credential = newCredential;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GOTO_MODULE_STATEMENT__CREDENTIAL, oldCredential, newCredential);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCredential(CredentialArgument newCredential)
  {
    if (newCredential != credential)
    {
      NotificationChain msgs = null;
      if (credential != null)
        msgs = ((InternalEObject)credential).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.GOTO_MODULE_STATEMENT__CREDENTIAL, null, msgs);
      if (newCredential != null)
        msgs = ((InternalEObject)newCredential).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.GOTO_MODULE_STATEMENT__CREDENTIAL, null, msgs);
      msgs = basicSetCredential(newCredential, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GOTO_MODULE_STATEMENT__CREDENTIAL, newCredential, newCredential));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallbackExpression getErrorCallback()
  {
    return errorCallback;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetErrorCallback(CallbackExpression newErrorCallback, NotificationChain msgs)
  {
    CallbackExpression oldErrorCallback = errorCallback;
    errorCallback = newErrorCallback;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GOTO_MODULE_STATEMENT__ERROR_CALLBACK, oldErrorCallback, newErrorCallback);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setErrorCallback(CallbackExpression newErrorCallback)
  {
    if (newErrorCallback != errorCallback)
    {
      NotificationChain msgs = null;
      if (errorCallback != null)
        msgs = ((InternalEObject)errorCallback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.GOTO_MODULE_STATEMENT__ERROR_CALLBACK, null, msgs);
      if (newErrorCallback != null)
        msgs = ((InternalEObject)newErrorCallback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.GOTO_MODULE_STATEMENT__ERROR_CALLBACK, null, msgs);
      msgs = basicSetErrorCallback(newErrorCallback, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GOTO_MODULE_STATEMENT__ERROR_CALLBACK, newErrorCallback, newErrorCallback));
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
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__ARGS:
        return basicSetArgs(null, msgs);
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__PRINCIPAL:
        return basicSetPrincipal(null, msgs);
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__CREDENTIAL:
        return basicSetCredential(null, msgs);
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__ERROR_CALLBACK:
        return basicSetErrorCallback(null, msgs);
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
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__TARGET_MODULE:
        if (resolve) return getTargetModule();
        return basicGetTargetModule();
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__ARGS:
        return getArgs();
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__AUTHENTICATE:
        return isAuthenticate();
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__AUTH_OPTION:
        if (resolve) return getAuthOption();
        return basicGetAuthOption();
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__PRINCIPAL:
        return getPrincipal();
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__CREDENTIAL:
        return getCredential();
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__ERROR_CALLBACK:
        return getErrorCallback();
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
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__TARGET_MODULE:
        setTargetModule((UiModule)newValue);
        return;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__ARGS:
        setArgs((ArgumentList)newValue);
        return;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__AUTHENTICATE:
        setAuthenticate((Boolean)newValue);
        return;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__AUTH_OPTION:
        setAuthOption((AuthenticationDeclaration)newValue);
        return;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__PRINCIPAL:
        setPrincipal((PrincipalArgument)newValue);
        return;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__CREDENTIAL:
        setCredential((CredentialArgument)newValue);
        return;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__ERROR_CALLBACK:
        setErrorCallback((CallbackExpression)newValue);
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
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__TARGET_MODULE:
        setTargetModule((UiModule)null);
        return;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__ARGS:
        setArgs((ArgumentList)null);
        return;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__AUTHENTICATE:
        setAuthenticate(AUTHENTICATE_EDEFAULT);
        return;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__AUTH_OPTION:
        setAuthOption((AuthenticationDeclaration)null);
        return;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__PRINCIPAL:
        setPrincipal((PrincipalArgument)null);
        return;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__CREDENTIAL:
        setCredential((CredentialArgument)null);
        return;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__ERROR_CALLBACK:
        setErrorCallback((CallbackExpression)null);
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
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__TARGET_MODULE:
        return targetModule != null;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__ARGS:
        return args != null;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__AUTHENTICATE:
        return authenticate != AUTHENTICATE_EDEFAULT;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__AUTH_OPTION:
        return authOption != null;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__PRINCIPAL:
        return principal != null;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__CREDENTIAL:
        return credential != null;
      case SimUiDslPackage.GOTO_MODULE_STATEMENT__ERROR_CALLBACK:
        return errorCallback != null;
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
    result.append(" (authenticate: ");
    result.append(authenticate);
    result.append(')');
    return result.toString();
  }

} //GotoModuleStatementImpl

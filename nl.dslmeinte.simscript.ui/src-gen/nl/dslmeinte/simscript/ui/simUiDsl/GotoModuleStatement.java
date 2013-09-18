/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goto Module Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getTargetModule <em>Target Module</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getArgs <em>Args</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#isAuthenticate <em>Authenticate</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getAuthOption <em>Auth Option</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getPrincipal <em>Principal</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getCredential <em>Credential</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getErrorCallback <em>Error Callback</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getGotoModuleStatement()
 * @model
 * @generated
 */
public interface GotoModuleStatement extends ExitingStatement
{
  /**
   * Returns the value of the '<em><b>Target Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Module</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Module</em>' reference.
   * @see #setTargetModule(UiModule)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getGotoModuleStatement_TargetModule()
   * @model
   * @generated
   */
  UiModule getTargetModule();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getTargetModule <em>Target Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Module</em>' reference.
   * @see #getTargetModule()
   * @generated
   */
  void setTargetModule(UiModule value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(ArgumentList)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getGotoModuleStatement_Args()
   * @model containment="true"
   * @generated
   */
  ArgumentList getArgs();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(ArgumentList value);

  /**
   * Returns the value of the '<em><b>Authenticate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Authenticate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Authenticate</em>' attribute.
   * @see #setAuthenticate(boolean)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getGotoModuleStatement_Authenticate()
   * @model
   * @generated
   */
  boolean isAuthenticate();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#isAuthenticate <em>Authenticate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Authenticate</em>' attribute.
   * @see #isAuthenticate()
   * @generated
   */
  void setAuthenticate(boolean value);

  /**
   * Returns the value of the '<em><b>Auth Option</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Auth Option</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Auth Option</em>' reference.
   * @see #setAuthOption(AuthenticationDeclaration)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getGotoModuleStatement_AuthOption()
   * @model
   * @generated
   */
  AuthenticationDeclaration getAuthOption();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getAuthOption <em>Auth Option</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Auth Option</em>' reference.
   * @see #getAuthOption()
   * @generated
   */
  void setAuthOption(AuthenticationDeclaration value);

  /**
   * Returns the value of the '<em><b>Principal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Principal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Principal</em>' containment reference.
   * @see #setPrincipal(PrincipalArgument)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getGotoModuleStatement_Principal()
   * @model containment="true"
   * @generated
   */
  PrincipalArgument getPrincipal();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getPrincipal <em>Principal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Principal</em>' containment reference.
   * @see #getPrincipal()
   * @generated
   */
  void setPrincipal(PrincipalArgument value);

  /**
   * Returns the value of the '<em><b>Credential</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Credential</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Credential</em>' containment reference.
   * @see #setCredential(CredentialArgument)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getGotoModuleStatement_Credential()
   * @model containment="true"
   * @generated
   */
  CredentialArgument getCredential();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getCredential <em>Credential</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Credential</em>' containment reference.
   * @see #getCredential()
   * @generated
   */
  void setCredential(CredentialArgument value);

  /**
   * Returns the value of the '<em><b>Error Callback</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error Callback</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error Callback</em>' containment reference.
   * @see #setErrorCallback(CallbackExpression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getGotoModuleStatement_ErrorCallback()
   * @model containment="true"
   * @generated
   */
  CallbackExpression getErrorCallback();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement#getErrorCallback <em>Error Callback</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error Callback</em>' containment reference.
   * @see #getErrorCallback()
   * @generated
   */
  void setErrorCallback(CallbackExpression value);

} // GotoModuleStatement

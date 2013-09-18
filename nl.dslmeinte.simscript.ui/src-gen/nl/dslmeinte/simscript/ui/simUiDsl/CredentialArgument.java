/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credential Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.CredentialArgument#getCredential <em>Credential</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.CredentialArgument#getValueExpr <em>Value Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCredentialArgument()
 * @model
 * @generated
 */
public interface CredentialArgument extends EObject
{
  /**
   * Returns the value of the '<em><b>Credential</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Credential</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Credential</em>' reference.
   * @see #setCredential(AuthenticationParameter)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCredentialArgument_Credential()
   * @model
   * @generated
   */
  AuthenticationParameter getCredential();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CredentialArgument#getCredential <em>Credential</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Credential</em>' reference.
   * @see #getCredential()
   * @generated
   */
  void setCredential(AuthenticationParameter value);

  /**
   * Returns the value of the '<em><b>Value Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Expr</em>' containment reference.
   * @see #setValueExpr(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCredentialArgument_ValueExpr()
   * @model containment="true"
   * @generated
   */
  Expression getValueExpr();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CredentialArgument#getValueExpr <em>Value Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Expr</em>' containment reference.
   * @see #getValueExpr()
   * @generated
   */
  void setValueExpr(Expression value);

} // CredentialArgument

/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Principal Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument#getPrincipal <em>Principal</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument#getValueExpr <em>Value Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getPrincipalArgument()
 * @model
 * @generated
 */
public interface PrincipalArgument extends EObject
{
  /**
   * Returns the value of the '<em><b>Principal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Principal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Principal</em>' reference.
   * @see #setPrincipal(AuthenticationParameter)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getPrincipalArgument_Principal()
   * @model
   * @generated
   */
  AuthenticationParameter getPrincipal();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument#getPrincipal <em>Principal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Principal</em>' reference.
   * @see #getPrincipal()
   * @generated
   */
  void setPrincipal(AuthenticationParameter value);

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
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getPrincipalArgument_ValueExpr()
   * @model containment="true"
   * @generated
   */
  Expression getValueExpr();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument#getValueExpr <em>Value Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Expr</em>' containment reference.
   * @see #getValueExpr()
   * @generated
   */
  void setValueExpr(Expression value);

} // PrincipalArgument

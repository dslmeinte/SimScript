/**
 */
package nl.dslmeinte.simscript.backend.simBackendDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration#getPrincipal <em>Principal</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration#getCredential <em>Credential</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getAuthenticationDeclaration()
 * @model
 * @generated
 */
public interface AuthenticationDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getAuthenticationDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Principal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Principal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Principal</em>' containment reference.
   * @see #setPrincipal(AuthenticationParameter)
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getAuthenticationDeclaration_Principal()
   * @model containment="true"
   * @generated
   */
  AuthenticationParameter getPrincipal();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration#getPrincipal <em>Principal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Principal</em>' containment reference.
   * @see #getPrincipal()
   * @generated
   */
  void setPrincipal(AuthenticationParameter value);

  /**
   * Returns the value of the '<em><b>Credential</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Credential</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Credential</em>' containment reference.
   * @see #setCredential(AuthenticationParameter)
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getAuthenticationDeclaration_Credential()
   * @model containment="true"
   * @generated
   */
  AuthenticationParameter getCredential();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration#getCredential <em>Credential</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Credential</em>' containment reference.
   * @see #getCredential()
   * @generated
   */
  void setCredential(AuthenticationParameter value);

} // AuthenticationDeclaration

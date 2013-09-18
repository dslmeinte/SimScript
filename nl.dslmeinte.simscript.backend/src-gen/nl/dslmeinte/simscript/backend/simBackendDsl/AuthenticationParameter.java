/**
 */
package nl.dslmeinte.simscript.backend.simBackendDsl;

import nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter#getName <em>Name</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getAuthenticationParameter()
 * @model
 * @generated
 */
public interface AuthenticationParameter extends EObject
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
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getAuthenticationParameter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeLiteral)
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getAuthenticationParameter_Type()
   * @model containment="true"
   * @generated
   */
  TypeLiteral getType();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeLiteral value);

} // AuthenticationParameter

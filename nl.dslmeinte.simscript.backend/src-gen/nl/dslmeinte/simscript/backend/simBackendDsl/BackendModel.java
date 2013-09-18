/**
 */
package nl.dslmeinte.simscript.backend.simBackendDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Backend Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel#getFlavor <em>Flavor</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel#getAuthOpts <em>Auth Opts</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getBackendModel()
 * @model
 * @generated
 */
public interface BackendModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Base Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Url</em>' attribute.
   * @see #setBaseUrl(String)
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getBackendModel_BaseUrl()
   * @model
   * @generated
   */
  String getBaseUrl();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel#getBaseUrl <em>Base Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Url</em>' attribute.
   * @see #getBaseUrl()
   * @generated
   */
  void setBaseUrl(String value);

  /**
   * Returns the value of the '<em><b>Flavor</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.simscript.backend.simBackendDsl.Flavors}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flavor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flavor</em>' attribute.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.Flavors
   * @see #setFlavor(Flavors)
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getBackendModel_Flavor()
   * @model
   * @generated
   */
  Flavors getFlavor();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel#getFlavor <em>Flavor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flavor</em>' attribute.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.Flavors
   * @see #getFlavor()
   * @generated
   */
  void setFlavor(Flavors value);

  /**
   * Returns the value of the '<em><b>Auth Opts</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Auth Opts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Auth Opts</em>' containment reference list.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getBackendModel_AuthOpts()
   * @model containment="true"
   * @generated
   */
  EList<AuthenticationDeclaration> getAuthOpts();

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.backend.simBackendDsl.Service}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getBackendModel_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Service> getDeclarations();

} // BackendModel

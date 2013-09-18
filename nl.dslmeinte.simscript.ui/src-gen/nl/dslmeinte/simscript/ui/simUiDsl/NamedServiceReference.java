/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import nl.dslmeinte.simscript.backend.simBackendDsl.NamedService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Service Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.NamedServiceReference#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getNamedServiceReference()
 * @model
 * @generated
 */
public interface NamedServiceReference extends ServiceIdentification
{
  /**
   * Returns the value of the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' reference.
   * @see #setService(NamedService)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getNamedServiceReference_Service()
   * @model
   * @generated
   */
  NamedService getService();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.NamedServiceReference#getService <em>Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' reference.
   * @see #getService()
   * @generated
   */
  void setService(NamedService value);

} // NamedServiceReference

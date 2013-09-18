/**
 */
package nl.dslmeinte.simscript.backend.simBackendDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Servlet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet#getFqClassName <em>Fq Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getLegacyServlet()
 * @model
 * @generated
 */
public interface LegacyServlet extends NamedService
{
  /**
   * Returns the value of the '<em><b>Url Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url Pattern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url Pattern</em>' attribute.
   * @see #setUrlPattern(String)
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getLegacyServlet_UrlPattern()
   * @model
   * @generated
   */
  String getUrlPattern();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet#getUrlPattern <em>Url Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url Pattern</em>' attribute.
   * @see #getUrlPattern()
   * @generated
   */
  void setUrlPattern(String value);

  /**
   * Returns the value of the '<em><b>Fq Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fq Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fq Class Name</em>' attribute.
   * @see #setFqClassName(String)
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getLegacyServlet_FqClassName()
   * @model
   * @generated
   */
  String getFqClassName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet#getFqClassName <em>Fq Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fq Class Name</em>' attribute.
   * @see #getFqClassName()
   * @generated
   */
  void setFqClassName(String value);

} // LegacyServlet

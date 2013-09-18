/**
 */
package nl.dslmeinte.simscript.backend.simBackendDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage
 * @generated
 */
public interface SimBackendDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimBackendDslFactory eINSTANCE = nl.dslmeinte.simscript.backend.simBackendDsl.impl.SimBackendDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Backend Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Backend Model</em>'.
   * @generated
   */
  BackendModel createBackendModel();

  /**
   * Returns a new object of class '<em>Authentication Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Authentication Declaration</em>'.
   * @generated
   */
  AuthenticationDeclaration createAuthenticationDeclaration();

  /**
   * Returns a new object of class '<em>Authentication Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Authentication Parameter</em>'.
   * @generated
   */
  AuthenticationParameter createAuthenticationParameter();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Named Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Named Service</em>'.
   * @generated
   */
  NamedService createNamedService();

  /**
   * Returns a new object of class '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface</em>'.
   * @generated
   */
  Interface createInterface();

  /**
   * Returns a new object of class '<em>Legacy Servlet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Legacy Servlet</em>'.
   * @generated
   */
  LegacyServlet createLegacyServlet();

  /**
   * Returns a new object of class '<em>Crud Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Crud Service</em>'.
   * @generated
   */
  CrudService createCrudService();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SimBackendDslPackage getSimBackendDslPackage();

} //SimBackendDslFactory

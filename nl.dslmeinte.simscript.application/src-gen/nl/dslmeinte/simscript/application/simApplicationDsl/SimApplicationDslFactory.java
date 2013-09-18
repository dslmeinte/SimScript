/**
 */
package nl.dslmeinte.simscript.application.simApplicationDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage
 * @generated
 */
public interface SimApplicationDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimApplicationDslFactory eINSTANCE = nl.dslmeinte.simscript.application.simApplicationDsl.impl.SimApplicationDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Application Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Model</em>'.
   * @generated
   */
  ApplicationModel createApplicationModel();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SimApplicationDslPackage getSimApplicationDslPackage();

} //SimApplicationDslFactory

/**
 */
package nl.dslmeinte.simscript.structure.structureDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage
 * @generated
 */
public interface StructureDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StructureDslFactory eINSTANCE = nl.dslmeinte.simscript.structure.structureDsl.impl.StructureDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Structure Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structure Model</em>'.
   * @generated
   */
  StructureModel createStructureModel();

  /**
   * Returns a new object of class '<em>Defined Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Defined Type</em>'.
   * @generated
   */
  DefinedType createDefinedType();

  /**
   * Returns a new object of class '<em>Structure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structure</em>'.
   * @generated
   */
  Structure createStructure();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  <T extends TypeLiteral> Feature<T> createFeature();

  /**
   * Returns a new object of class '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration</em>'.
   * @generated
   */
  Enumeration createEnumeration();

  /**
   * Returns a new object of class '<em>Enumeration Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enumeration Literal</em>'.
   * @generated
   */
  EnumerationLiteral createEnumerationLiteral();

  /**
   * Returns a new object of class '<em>Type Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Literal</em>'.
   * @generated
   */
  TypeLiteral createTypeLiteral();

  /**
   * Returns a new object of class '<em>Builtin Type Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Builtin Type Literal</em>'.
   * @generated
   */
  BuiltinTypeLiteral createBuiltinTypeLiteral();

  /**
   * Returns a new object of class '<em>Defined Type Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Defined Type Literal</em>'.
   * @generated
   */
  DefinedTypeLiteral createDefinedTypeLiteral();

  /**
   * Returns a new object of class '<em>List Type Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Type Literal</em>'.
   * @generated
   */
  ListTypeLiteral createListTypeLiteral();

  /**
   * Returns a new object of class '<em>Synthetic Type Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Synthetic Type Literal</em>'.
   * @generated
   */
  SyntheticTypeLiteral createSyntheticTypeLiteral();

  /**
   * Returns a new object of class '<em>Callback Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Callback Literal</em>'.
   * @generated
   */
  CallbackLiteral createCallbackLiteral();

  /**
   * Returns a new object of class '<em>Callback Error Response Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Callback Error Response Literal</em>'.
   * @generated
   */
  CallbackErrorResponseLiteral createCallbackErrorResponseLiteral();

  /**
   * Returns a new object of class '<em>Void Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Void Literal</em>'.
   * @generated
   */
  VoidLiteral createVoidLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  StructureDslPackage getStructureDslPackage();

} //StructureDslFactory

/**
 */
package nl.dslmeinte.simscript.structure.structureDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral#getName <em>Name</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getEnumerationLiteral()
 * @model
 * @generated
 */
public interface EnumerationLiteral extends EObject
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
   * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getEnumerationLiteral_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Display Name</em>' attribute.
   * @see #setDisplayName(String)
   * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getEnumerationLiteral_DisplayName()
   * @model
   * @generated
   */
  String getDisplayName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral#getDisplayName <em>Display Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display Name</em>' attribute.
   * @see #getDisplayName()
   * @generated
   */
  void setDisplayName(String value);

} // EnumerationLiteral

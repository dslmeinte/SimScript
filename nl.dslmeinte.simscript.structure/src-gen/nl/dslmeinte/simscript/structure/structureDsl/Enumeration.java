/**
 */
package nl.dslmeinte.simscript.structure.structureDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.structure.structureDsl.Enumeration#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends DefinedType
{
  /**
   * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' containment reference list.
   * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getEnumeration_Literals()
   * @model containment="true"
   * @generated
   */
  EList<EnumerationLiteral> getLiterals();

} // Enumeration

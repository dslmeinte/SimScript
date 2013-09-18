/**
 */
package nl.dslmeinte.simscript.structure.structureDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defined Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.structure.structureDsl.DefinedType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getDefinedType()
 * @model
 * @generated
 */
public interface DefinedType extends EObject
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
   * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getDefinedType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.structure.structureDsl.DefinedType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // DefinedType

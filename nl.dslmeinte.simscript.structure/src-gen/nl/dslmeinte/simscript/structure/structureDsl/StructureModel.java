/**
 */
package nl.dslmeinte.simscript.structure.structureDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.structure.structureDsl.StructureModel#getTypeDefinitions <em>Type Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getStructureModel()
 * @model
 * @generated
 */
public interface StructureModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Definitions</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.structure.structureDsl.DefinedType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Definitions</em>' containment reference list.
   * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getStructureModel_TypeDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<DefinedType> getTypeDefinitions();

} // StructureModel

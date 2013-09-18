/**
 */
package nl.dslmeinte.simscript.structure.structureDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.structure.structureDsl.Structure#isPersistent <em>Persistent</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.structure.structureDsl.Structure#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getStructure()
 * @model
 * @generated
 */
public interface Structure extends DefinedType
{
  /**
   * Returns the value of the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persistent</em>' attribute.
   * @see #setPersistent(boolean)
   * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getStructure_Persistent()
   * @model
   * @generated
   */
  boolean isPersistent();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.structure.structureDsl.Structure#isPersistent <em>Persistent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Persistent</em>' attribute.
   * @see #isPersistent()
   * @generated
   */
  void setPersistent(boolean value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.structure.structureDsl.Feature}&lt;nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getStructure_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature<TypeLiteral>> getFeatures();

} // Structure

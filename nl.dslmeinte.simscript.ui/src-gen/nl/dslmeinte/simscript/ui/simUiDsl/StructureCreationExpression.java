/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import nl.dslmeinte.simscript.structure.structureDsl.Structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Creation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.StructureCreationExpression#getStructure <em>Structure</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.StructureCreationExpression#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getStructureCreationExpression()
 * @model
 * @generated
 */
public interface StructureCreationExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Structure</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structure</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structure</em>' reference.
   * @see #setStructure(Structure)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getStructureCreationExpression_Structure()
   * @model
   * @generated
   */
  Structure getStructure();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.StructureCreationExpression#getStructure <em>Structure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structure</em>' reference.
   * @see #getStructure()
   * @generated
   */
  void setStructure(Structure value);

  /**
   * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.ui.simUiDsl.FeatureAssignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignments</em>' containment reference list.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getStructureCreationExpression_Assignments()
   * @model containment="true"
   * @generated
   */
  EList<FeatureAssignment> getAssignments();

} // StructureCreationExpression

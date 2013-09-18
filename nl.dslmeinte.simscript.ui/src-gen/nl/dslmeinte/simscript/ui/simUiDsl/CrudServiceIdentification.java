/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import nl.dslmeinte.simscript.structure.structureDsl.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crud Service Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.CrudServiceIdentification#getCrudType <em>Crud Type</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.CrudServiceIdentification#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCrudServiceIdentification()
 * @model
 * @generated
 */
public interface CrudServiceIdentification extends ServiceIdentification
{
  /**
   * Returns the value of the '<em><b>Crud Type</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.simscript.ui.simUiDsl.CrudTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Crud Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Crud Type</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CrudTypes
   * @see #setCrudType(CrudTypes)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCrudServiceIdentification_CrudType()
   * @model
   * @generated
   */
  CrudTypes getCrudType();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CrudServiceIdentification#getCrudType <em>Crud Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Crud Type</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.CrudTypes
   * @see #getCrudType()
   * @generated
   */
  void setCrudType(CrudTypes value);

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
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getCrudServiceIdentification_Structure()
   * @model
   * @generated
   */
  Structure getStructure();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.CrudServiceIdentification#getStructure <em>Structure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structure</em>' reference.
   * @see #getStructure()
   * @generated
   */
  void setStructure(Structure value);

} // CrudServiceIdentification

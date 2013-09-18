/**
 */
package nl.dslmeinte.simscript.backend.simBackendDsl;

import nl.dslmeinte.simscript.structure.structureDsl.Structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crud Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.CrudService#getStructure <em>Structure</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.CrudService#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getCrudService()
 * @model
 * @generated
 */
public interface CrudService extends Service
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
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getCrudService_Structure()
   * @model
   * @generated
   */
  Structure getStructure();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.CrudService#getStructure <em>Structure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structure</em>' reference.
   * @see #getStructure()
   * @generated
   */
  void setStructure(Structure value);

  /**
   * Returns the value of the '<em><b>Services</b></em>' attribute list.
   * The list contents are of type {@link nl.dslmeinte.simscript.backend.simBackendDsl.CrudTypes}.
   * The literals are from the enumeration {@link nl.dslmeinte.simscript.backend.simBackendDsl.CrudTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' attribute list.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.CrudTypes
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getCrudService_Services()
   * @model unique="false"
   * @generated
   */
  EList<CrudTypes> getServices();

} // CrudService

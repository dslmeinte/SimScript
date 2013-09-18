/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Rows Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRowsDefinition#getName <em>Name</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRowsDefinition#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTableRowsDefinition()
 * @model
 * @generated
 */
public interface TableRowsDefinition extends TopLevelDefinition
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
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTableRowsDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRowsDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.ui.simUiDsl.TableRow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rows</em>' containment reference list.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTableRowsDefinition_Rows()
   * @model containment="true"
   * @generated
   */
  EList<TableRow> getRows();

} // TableRowsDefinition

/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Rows Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation#getDefinition <em>Definition</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTableRowsInvocation()
 * @model
 * @generated
 */
public interface TableRowsInvocation extends TableBodyElement
{
  /**
   * Returns the value of the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' reference.
   * @see #setDefinition(TableRowsDefinition)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTableRowsInvocation_Definition()
   * @model
   * @generated
   */
  TableRowsDefinition getDefinition();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation#getDefinition <em>Definition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' reference.
   * @see #getDefinition()
   * @generated
   */
  void setDefinition(TableRowsDefinition value);

  /**
   * Returns the value of the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument List</em>' containment reference.
   * @see #setArgumentList(ArgumentList)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTableRowsInvocation_ArgumentList()
   * @model containment="true"
   * @generated
   */
  ArgumentList getArgumentList();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation#getArgumentList <em>Argument List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument List</em>' containment reference.
   * @see #getArgumentList()
   * @generated
   */
  void setArgumentList(ArgumentList value);

} // TableRowsInvocation

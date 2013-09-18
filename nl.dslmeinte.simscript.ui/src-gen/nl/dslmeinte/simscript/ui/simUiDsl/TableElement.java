/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.TableElement#getSubElements <em>Sub Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTableElement()
 * @model
 * @generated
 */
public interface TableElement extends Element
{
  /**
   * Returns the value of the '<em><b>Sub Elements</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.ui.simUiDsl.TableBodyElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Elements</em>' containment reference list.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTableElement_SubElements()
   * @model containment="true"
   * @generated
   */
  EList<TableBodyElement> getSubElements();

} // TableElement

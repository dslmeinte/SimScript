/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.GroupElement#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.GroupElement#getV_align <em>Valign</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.GroupElement#getNestedGroups <em>Nested Groups</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.GroupElement#getLeafGroups <em>Leaf Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getGroupElement()
 * @model
 * @generated
 */
public interface GroupElement extends Element
{
  /**
   * Returns the value of the '<em><b>Orientation</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.simscript.ui.simUiDsl.GroupOrientations}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orientation</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GroupOrientations
   * @see #setOrientation(GroupOrientations)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getGroupElement_Orientation()
   * @model
   * @generated
   */
  GroupOrientations getOrientation();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.GroupElement#getOrientation <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orientation</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.GroupOrientations
   * @see #getOrientation()
   * @generated
   */
  void setOrientation(GroupOrientations value);

  /**
   * Returns the value of the '<em><b>Valign</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.simscript.ui.simUiDsl.VerticalAlignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valign</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.VerticalAlignment
   * @see #setV_align(VerticalAlignment)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getGroupElement_V_align()
   * @model
   * @generated
   */
  VerticalAlignment getV_align();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.GroupElement#getV_align <em>Valign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valign</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.VerticalAlignment
   * @see #getV_align()
   * @generated
   */
  void setV_align(VerticalAlignment value);

  /**
   * Returns the value of the '<em><b>Nested Groups</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.ui.simUiDsl.GroupElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nested Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested Groups</em>' containment reference list.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getGroupElement_NestedGroups()
   * @model containment="true"
   * @generated
   */
  EList<GroupElement> getNestedGroups();

  /**
   * Returns the value of the '<em><b>Leaf Groups</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.ui.simUiDsl.ElementBody}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Leaf Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Leaf Groups</em>' containment reference list.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getGroupElement_LeafGroups()
   * @model containment="true"
   * @generated
   */
  EList<ElementBody> getLeafGroups();

} // GroupElement

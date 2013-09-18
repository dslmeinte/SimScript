/**
 */
package nl.dslmeinte.simscript.structure.structureDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Type Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.structure.structureDsl.ListTypeLiteral#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getListTypeLiteral()
 * @model
 * @generated
 */
public interface ListTypeLiteral extends TypeLiteral
{
  /**
   * Returns the value of the '<em><b>Item Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item Type</em>' containment reference.
   * @see #setItemType(TypeLiteral)
   * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getListTypeLiteral_ItemType()
   * @model containment="true"
   * @generated
   */
  TypeLiteral getItemType();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.structure.structureDsl.ListTypeLiteral#getItemType <em>Item Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item Type</em>' containment reference.
   * @see #getItemType()
   * @generated
   */
  void setItemType(TypeLiteral value);

} // ListTypeLiteral

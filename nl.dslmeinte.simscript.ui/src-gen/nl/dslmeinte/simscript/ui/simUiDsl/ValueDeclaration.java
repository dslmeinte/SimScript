/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ValueDeclaration#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getValueDeclaration()
 * @model
 * @generated
 */
public interface ValueDeclaration extends AbstractValueDeclaration
{
  /**
   * Returns the value of the '<em><b>Value Type</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.simscript.ui.simUiDsl.ValueTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Type</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ValueTypes
   * @see #setValueType(ValueTypes)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getValueDeclaration_ValueType()
   * @model
   * @generated
   */
  ValueTypes getValueType();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ValueDeclaration#getValueType <em>Value Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Type</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ValueTypes
   * @see #getValueType()
   * @generated
   */
  void setValueType(ValueTypes value);

} // ValueDeclaration

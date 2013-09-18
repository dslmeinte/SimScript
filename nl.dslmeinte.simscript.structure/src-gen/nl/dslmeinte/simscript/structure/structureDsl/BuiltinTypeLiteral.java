/**
 */
package nl.dslmeinte.simscript.structure.structureDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builtin Type Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypeLiteral#getBuiltin <em>Builtin</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getBuiltinTypeLiteral()
 * @model
 * @generated
 */
public interface BuiltinTypeLiteral extends TypeLiteral
{
  /**
   * Returns the value of the '<em><b>Builtin</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Builtin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Builtin</em>' attribute.
   * @see nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypes
   * @see #setBuiltin(BuiltinTypes)
   * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getBuiltinTypeLiteral_Builtin()
   * @model
   * @generated
   */
  BuiltinTypes getBuiltin();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypeLiteral#getBuiltin <em>Builtin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Builtin</em>' attribute.
   * @see nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypes
   * @see #getBuiltin()
   * @generated
   */
  void setBuiltin(BuiltinTypes value);

} // BuiltinTypeLiteral

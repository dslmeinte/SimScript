/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import nl.dslmeinte.simscript.structure.structureDsl.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Builtin Function Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression#getFunction <em>Function</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression#getArgument <em>Argument</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression#getSortFeature <em>Sort Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBuiltinFunctionExpression()
 * @model
 * @generated
 */
public interface BuiltinFunctionExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctions
   * @see #setFunction(BuiltinFunctions)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBuiltinFunctionExpression_Function()
   * @model
   * @generated
   */
  BuiltinFunctions getFunction();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctions
   * @see #getFunction()
   * @generated
   */
  void setFunction(BuiltinFunctions value);

  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference.
   * @see #setArgument(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBuiltinFunctionExpression_Argument()
   * @model containment="true"
   * @generated
   */
  Expression getArgument();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression#getArgument <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' containment reference.
   * @see #getArgument()
   * @generated
   */
  void setArgument(Expression value);

  /**
   * Returns the value of the '<em><b>Sort Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort Feature</em>' reference.
   * @see #setSortFeature(Feature)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBuiltinFunctionExpression_SortFeature()
   * @model
   * @generated
   */
  Feature getSortFeature();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression#getSortFeature <em>Sort Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort Feature</em>' reference.
   * @see #getSortFeature()
   * @generated
   */
  void setSortFeature(Feature value);

} // BuiltinFunctionExpression

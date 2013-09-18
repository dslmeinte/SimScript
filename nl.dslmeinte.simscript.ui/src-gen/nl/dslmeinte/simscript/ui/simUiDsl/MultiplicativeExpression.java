/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getMultiplicativeExpression()
 * @model
 * @generated
 */
public interface MultiplicativeExpression extends ArithmeticBinaryOperatorExpression
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeOperators}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeOperators
   * @see #setOperator(MultiplicativeOperators)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getMultiplicativeExpression_Operator()
   * @model
   * @generated
   */
  MultiplicativeOperators getOperator();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeOperators
   * @see #getOperator()
   * @generated
   */
  void setOperator(MultiplicativeOperators value);

} // MultiplicativeExpression

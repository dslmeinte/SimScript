/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.AdditiveExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getAdditiveExpression()
 * @model
 * @generated
 */
public interface AdditiveExpression extends ArithmeticBinaryOperatorExpression
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.simscript.ui.simUiDsl.AdditiveOperators}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AdditiveOperators
   * @see #setOperator(AdditiveOperators)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getAdditiveExpression_Operator()
   * @model
   * @generated
   */
  AdditiveOperators getOperator();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.AdditiveExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.AdditiveOperators
   * @see #getOperator()
   * @generated
   */
  void setOperator(AdditiveOperators value);

} // AdditiveExpression

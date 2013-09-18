/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiteralExpression#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBooleanLiteralExpression()
 * @model
 * @generated
 */
public interface BooleanLiteralExpression extends LiteralExpression
{
  /**
   * Returns the value of the '<em><b>Literal</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiterals}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiterals
   * @see #setLiteral(BooleanLiterals)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBooleanLiteralExpression_Literal()
   * @model
   * @generated
   */
  BooleanLiterals getLiteral();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiteralExpression#getLiteral <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiterals
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(BooleanLiterals value);

} // BooleanLiteralExpression

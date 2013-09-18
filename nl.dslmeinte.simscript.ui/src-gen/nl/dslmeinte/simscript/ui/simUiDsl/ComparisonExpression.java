/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ComparisonExpression#getComparator <em>Comparator</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getComparisonExpression()
 * @model
 * @generated
 */
public interface ComparisonExpression extends BinaryOperatorExpression
{
  /**
   * Returns the value of the '<em><b>Comparator</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.simscript.ui.simUiDsl.Comparator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comparator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comparator</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Comparator
   * @see #setComparator(Comparator)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getComparisonExpression_Comparator()
   * @model
   * @generated
   */
  Comparator getComparator();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ComparisonExpression#getComparator <em>Comparator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comparator</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.Comparator
   * @see #getComparator()
   * @generated
   */
  void setComparator(Comparator value);

} // ComparisonExpression

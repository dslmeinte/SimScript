/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ListLiteralExpression#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getListLiteralExpression()
 * @model
 * @generated
 */
public interface ListLiteralExpression extends LiteralExpression
{
  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.ui.simUiDsl.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getListLiteralExpression_Members()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getMembers();

} // ListLiteralExpression

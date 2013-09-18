/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import nl.dslmeinte.simscript.structure.structureDsl.Enumeration;
import nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.EnumerationLiteralExpression#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.EnumerationLiteralExpression#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getEnumerationLiteralExpression()
 * @model
 * @generated
 */
public interface EnumerationLiteralExpression extends LiteralExpression
{
  /**
   * Returns the value of the '<em><b>Enumeration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumeration</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumeration</em>' reference.
   * @see #setEnumeration(Enumeration)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getEnumerationLiteralExpression_Enumeration()
   * @model
   * @generated
   */
  Enumeration getEnumeration();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.EnumerationLiteralExpression#getEnumeration <em>Enumeration</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumeration</em>' reference.
   * @see #getEnumeration()
   * @generated
   */
  void setEnumeration(Enumeration value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' reference.
   * @see #setLiteral(EnumerationLiteral)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getEnumerationLiteralExpression_Literal()
   * @model
   * @generated
   */
  EnumerationLiteral getLiteral();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.EnumerationLiteralExpression#getLiteral <em>Literal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(EnumerationLiteral value);

} // EnumerationLiteralExpression

/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Value Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration#getValue <em>Value</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration#getDeclaredType <em>Declared Type</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration#getValueExpr <em>Value Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getAbstractValueDeclaration()
 * @model
 * @generated
 */
public interface AbstractValueDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Value)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getAbstractValueDeclaration_Value()
   * @model containment="true"
   * @generated
   */
  Value getValue();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Value value);

  /**
   * Returns the value of the '<em><b>Declared Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declared Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declared Type</em>' containment reference.
   * @see #setDeclaredType(TypeLiteral)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getAbstractValueDeclaration_DeclaredType()
   * @model containment="true"
   * @generated
   */
  TypeLiteral getDeclaredType();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration#getDeclaredType <em>Declared Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declared Type</em>' containment reference.
   * @see #getDeclaredType()
   * @generated
   */
  void setDeclaredType(TypeLiteral value);

  /**
   * Returns the value of the '<em><b>Value Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Expr</em>' containment reference.
   * @see #setValueExpr(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getAbstractValueDeclaration_ValueExpr()
   * @model containment="true"
   * @generated
   */
  Expression getValueExpr();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration#getValueExpr <em>Value Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Expr</em>' containment reference.
   * @see #getValueExpr()
   * @generated
   */
  void setValueExpr(Expression value);

} // AbstractValueDeclaration

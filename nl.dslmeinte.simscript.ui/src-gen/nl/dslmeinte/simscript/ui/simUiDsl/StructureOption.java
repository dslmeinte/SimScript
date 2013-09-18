/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.StructureOption#getSourceExpr <em>Source Expr</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.StructureOption#getDisplayFunction <em>Display Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getStructureOption()
 * @model
 * @generated
 */
public interface StructureOption extends EObject
{
  /**
   * Returns the value of the '<em><b>Source Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Expr</em>' containment reference.
   * @see #setSourceExpr(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getStructureOption_SourceExpr()
   * @model containment="true"
   * @generated
   */
  Expression getSourceExpr();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.StructureOption#getSourceExpr <em>Source Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Expr</em>' containment reference.
   * @see #getSourceExpr()
   * @generated
   */
  void setSourceExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Display Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Display Function</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Display Function</em>' reference.
   * @see #setDisplayFunction(Method)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getStructureOption_DisplayFunction()
   * @model
   * @generated
   */
  Method getDisplayFunction();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.StructureOption#getDisplayFunction <em>Display Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display Function</em>' reference.
   * @see #getDisplayFunction()
   * @generated
   */
  void setDisplayFunction(Method value);

} // StructureOption

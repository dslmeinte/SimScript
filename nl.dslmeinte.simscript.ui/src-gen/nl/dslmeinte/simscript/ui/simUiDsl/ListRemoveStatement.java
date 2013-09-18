/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import nl.dslmeinte.simscript.structure.structureDsl.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Remove Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getListExpr <em>List Expr</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getFeature <em>Feature</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getValueExpr <em>Value Expr</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getIndexVariable <em>Index Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getListRemoveStatement()
 * @model
 * @generated
 */
public interface ListRemoveStatement extends NonExitingStatement
{
  /**
   * Returns the value of the '<em><b>List Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Expr</em>' containment reference.
   * @see #setListExpr(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getListRemoveStatement_ListExpr()
   * @model containment="true"
   * @generated
   */
  Expression getListExpr();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getListExpr <em>List Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Expr</em>' containment reference.
   * @see #getListExpr()
   * @generated
   */
  void setListExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(Feature)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getListRemoveStatement_Feature()
   * @model
   * @generated
   */
  Feature getFeature();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(Feature value);

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
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getListRemoveStatement_ValueExpr()
   * @model containment="true"
   * @generated
   */
  Expression getValueExpr();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getValueExpr <em>Value Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Expr</em>' containment reference.
   * @see #getValueExpr()
   * @generated
   */
  void setValueExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Index Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index Variable</em>' containment reference.
   * @see #setIndexVariable(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getListRemoveStatement_IndexVariable()
   * @model containment="true"
   * @generated
   */
  Expression getIndexVariable();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement#getIndexVariable <em>Index Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index Variable</em>' containment reference.
   * @see #getIndexVariable()
   * @generated
   */
  void setIndexVariable(Expression value);

} // ListRemoveStatement

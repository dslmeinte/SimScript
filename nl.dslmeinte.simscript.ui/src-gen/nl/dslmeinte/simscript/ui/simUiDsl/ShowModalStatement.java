/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Show Modal Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ShowModalStatement#isPersistent <em>Persistent</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getShowModalStatement()
 * @model
 * @generated
 */
public interface ShowModalStatement extends NonExitingStatement, ViewableCallSite
{
  /**
   * Returns the value of the '<em><b>Persistent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Persistent</em>' attribute.
   * @see #setPersistent(boolean)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getShowModalStatement_Persistent()
   * @model
   * @generated
   */
  boolean isPersistent();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ShowModalStatement#isPersistent <em>Persistent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Persistent</em>' attribute.
   * @see #isPersistent()
   * @generated
   */
  void setPersistent(boolean value);

} // ShowModalStatement

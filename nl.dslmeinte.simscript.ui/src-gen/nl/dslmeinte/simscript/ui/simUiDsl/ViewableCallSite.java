/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewable Call Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite#getViewable <em>Viewable</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getViewableCallSite()
 * @model
 * @generated
 */
public interface ViewableCallSite extends EObject
{
  /**
   * Returns the value of the '<em><b>Viewable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Viewable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Viewable</em>' reference.
   * @see #setViewable(Viewable)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getViewableCallSite_Viewable()
   * @model
   * @generated
   */
  Viewable getViewable();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite#getViewable <em>Viewable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Viewable</em>' reference.
   * @see #getViewable()
   * @generated
   */
  void setViewable(Viewable value);

  /**
   * Returns the value of the '<em><b>Argument List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument List</em>' containment reference.
   * @see #setArgumentList(ArgumentList)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getViewableCallSite_ArgumentList()
   * @model containment="true"
   * @generated
   */
  ArgumentList getArgumentList();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite#getArgumentList <em>Argument List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument List</em>' containment reference.
   * @see #getArgumentList()
   * @generated
   */
  void setArgumentList(ArgumentList value);

} // ViewableCallSite

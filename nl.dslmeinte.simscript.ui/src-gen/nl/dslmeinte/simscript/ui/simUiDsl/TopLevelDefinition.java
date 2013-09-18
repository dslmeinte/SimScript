/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Level Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.TopLevelDefinition#getParameterList <em>Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTopLevelDefinition()
 * @model
 * @generated
 */
public interface TopLevelDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter List</em>' containment reference.
   * @see #setParameterList(ParameterList)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getTopLevelDefinition_ParameterList()
   * @model containment="true"
   * @generated
   */
  ParameterList getParameterList();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.TopLevelDefinition#getParameterList <em>Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter List</em>' containment reference.
   * @see #getParameterList()
   * @generated
   */
  void setParameterList(ParameterList value);

} // TopLevelDefinition

/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.UiModule#isNotAuthenticated <em>Not Authenticated</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.UiModule#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getUiModule()
 * @model
 * @generated
 */
public interface UiModule extends EObject
{
  /**
   * Returns the value of the '<em><b>Not Authenticated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not Authenticated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not Authenticated</em>' attribute.
   * @see #setNotAuthenticated(boolean)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getUiModule_NotAuthenticated()
   * @model
   * @generated
   */
  boolean isNotAuthenticated();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.UiModule#isNotAuthenticated <em>Not Authenticated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not Authenticated</em>' attribute.
   * @see #isNotAuthenticated()
   * @generated
   */
  void setNotAuthenticated(boolean value);

  /**
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.ui.simUiDsl.TopLevelDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference list.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getUiModule_Definitions()
   * @model containment="true"
   * @generated
   */
  EList<TopLevelDefinition> getDefinitions();

} // UiModule

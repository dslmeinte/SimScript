/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defined Viewable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable#getValuesBlock <em>Values Block</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getDefinedViewable()
 * @model
 * @generated
 */
public interface DefinedViewable extends Viewable
{
  /**
   * Returns the value of the '<em><b>Values Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values Block</em>' containment reference.
   * @see #setValuesBlock(ValuesBlock)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getDefinedViewable_ValuesBlock()
   * @model containment="true"
   * @generated
   */
  ValuesBlock getValuesBlock();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable#getValuesBlock <em>Values Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Values Block</em>' containment reference.
   * @see #getValuesBlock()
   * @generated
   */
  void setValuesBlock(ValuesBlock value);

  /**
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.ui.simUiDsl.LocalViewableDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference list.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getDefinedViewable_Definitions()
   * @model containment="true"
   * @generated
   */
  EList<LocalViewableDefinition> getDefinitions();

} // DefinedViewable

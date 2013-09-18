/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.RadioOption#getTrue <em>True</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.RadioOption#getFalse <em>False</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getRadioOption()
 * @model
 * @generated
 */
public interface RadioOption extends EObject
{
  /**
   * Returns the value of the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True</em>' attribute.
   * @see #setTrue(String)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getRadioOption_True()
   * @model
   * @generated
   */
  String getTrue();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.RadioOption#getTrue <em>True</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True</em>' attribute.
   * @see #getTrue()
   * @generated
   */
  void setTrue(String value);

  /**
   * Returns the value of the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False</em>' attribute.
   * @see #setFalse(String)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getRadioOption_False()
   * @model
   * @generated
   */
  String getFalse();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.RadioOption#getFalse <em>False</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>False</em>' attribute.
   * @see #getFalse()
   * @generated
   */
  void setFalse(String value);

} // RadioOption

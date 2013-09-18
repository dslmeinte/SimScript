/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.Viewable#getType <em>Type</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.Viewable#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getViewable()
 * @model
 * @generated
 */
public interface Viewable extends TopLevelDefinition
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.simscript.ui.simUiDsl.ViewableTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ViewableTypes
   * @see #setType(ViewableTypes)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getViewable_Type()
   * @model
   * @generated
   */
  ViewableTypes getType();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.Viewable#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see nl.dslmeinte.simscript.ui.simUiDsl.ViewableTypes
   * @see #getType()
   * @generated
   */
  void setType(ViewableTypes value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getViewable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.Viewable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Viewable

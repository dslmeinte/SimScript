/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import nl.dslmeinte.simscript.structure.structureDsl.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Access Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression#getPrevious <em>Previous</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getFeatureAccessExpression()
 * @model
 * @generated
 */
public interface FeatureAccessExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Previous</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Previous</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Previous</em>' containment reference.
   * @see #setPrevious(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getFeatureAccessExpression_Previous()
   * @model containment="true"
   * @generated
   */
  Expression getPrevious();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression#getPrevious <em>Previous</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Previous</em>' containment reference.
   * @see #getPrevious()
   * @generated
   */
  void setPrevious(Expression value);

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
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getFeatureAccessExpression_Feature()
   * @model
   * @generated
   */
  Feature getFeature();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(Feature value);

} // FeatureAccessExpression

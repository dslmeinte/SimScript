/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getBindSite <em>Bind Site</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getHint <em>Hint</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getRadioOption <em>Radio Option</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getOnChange <em>On Change</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getOnSubmit <em>On Submit</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getStructureOption <em>Structure Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getInputElement()
 * @model
 * @generated
 */
public interface InputElement extends Element
{
  /**
   * Returns the value of the '<em><b>Bind Site</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bind Site</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bind Site</em>' containment reference.
   * @see #setBindSite(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getInputElement_BindSite()
   * @model containment="true"
   * @generated
   */
  Expression getBindSite();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getBindSite <em>Bind Site</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bind Site</em>' containment reference.
   * @see #getBindSite()
   * @generated
   */
  void setBindSite(Expression value);

  /**
   * Returns the value of the '<em><b>Hint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hint</em>' attribute.
   * @see #setHint(String)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getInputElement_Hint()
   * @model
   * @generated
   */
  String getHint();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getHint <em>Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hint</em>' attribute.
   * @see #getHint()
   * @generated
   */
  void setHint(String value);

  /**
   * Returns the value of the '<em><b>Min Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Value</em>' containment reference.
   * @see #setMinValue(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getInputElement_MinValue()
   * @model containment="true"
   * @generated
   */
  Expression getMinValue();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getMinValue <em>Min Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Value</em>' containment reference.
   * @see #getMinValue()
   * @generated
   */
  void setMinValue(Expression value);

  /**
   * Returns the value of the '<em><b>Max Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Value</em>' containment reference.
   * @see #setMaxValue(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getInputElement_MaxValue()
   * @model containment="true"
   * @generated
   */
  Expression getMaxValue();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getMaxValue <em>Max Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Value</em>' containment reference.
   * @see #getMaxValue()
   * @generated
   */
  void setMaxValue(Expression value);

  /**
   * Returns the value of the '<em><b>Radio Option</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Radio Option</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Radio Option</em>' containment reference.
   * @see #setRadioOption(RadioOption)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getInputElement_RadioOption()
   * @model containment="true"
   * @generated
   */
  RadioOption getRadioOption();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getRadioOption <em>Radio Option</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Radio Option</em>' containment reference.
   * @see #getRadioOption()
   * @generated
   */
  void setRadioOption(RadioOption value);

  /**
   * Returns the value of the '<em><b>On Change</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Change</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Change</em>' containment reference.
   * @see #setOnChange(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getInputElement_OnChange()
   * @model containment="true"
   * @generated
   */
  Expression getOnChange();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getOnChange <em>On Change</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On Change</em>' containment reference.
   * @see #getOnChange()
   * @generated
   */
  void setOnChange(Expression value);

  /**
   * Returns the value of the '<em><b>On Submit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Submit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Submit</em>' containment reference.
   * @see #setOnSubmit(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getInputElement_OnSubmit()
   * @model containment="true"
   * @generated
   */
  Expression getOnSubmit();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getOnSubmit <em>On Submit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On Submit</em>' containment reference.
   * @see #getOnSubmit()
   * @generated
   */
  void setOnSubmit(Expression value);

  /**
   * Returns the value of the '<em><b>Structure Option</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structure Option</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structure Option</em>' containment reference.
   * @see #setStructureOption(StructureOption)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getInputElement_StructureOption()
   * @model containment="true"
   * @generated
   */
  StructureOption getStructureOption();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.InputElement#getStructureOption <em>Structure Option</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structure Option</em>' containment reference.
   * @see #getStructureOption()
   * @generated
   */
  void setStructureOption(StructureOption value);

} // InputElement

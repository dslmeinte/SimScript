/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getOnClick <em>On Click</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getCssClass <em>Css Class</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getBodyCssClass <em>Body Css Class</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getStyle <em>Style</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getHeader <em>Header</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getHeaderCssClass <em>Header Css Class</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#isNoCss <em>No Css</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBlockElement()
 * @model
 * @generated
 */
public interface BlockElement extends Element
{
  /**
   * Returns the value of the '<em><b>On Click</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Click</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Click</em>' containment reference.
   * @see #setOnClick(Expression)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBlockElement_OnClick()
   * @model containment="true"
   * @generated
   */
  Expression getOnClick();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getOnClick <em>On Click</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On Click</em>' containment reference.
   * @see #getOnClick()
   * @generated
   */
  void setOnClick(Expression value);

  /**
   * Returns the value of the '<em><b>Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Css Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Css Class</em>' attribute.
   * @see #setCssClass(String)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBlockElement_CssClass()
   * @model
   * @generated
   */
  String getCssClass();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getCssClass <em>Css Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Css Class</em>' attribute.
   * @see #getCssClass()
   * @generated
   */
  void setCssClass(String value);

  /**
   * Returns the value of the '<em><b>Body Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body Css Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body Css Class</em>' attribute.
   * @see #setBodyCssClass(String)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBlockElement_BodyCssClass()
   * @model
   * @generated
   */
  String getBodyCssClass();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getBodyCssClass <em>Body Css Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body Css Class</em>' attribute.
   * @see #getBodyCssClass()
   * @generated
   */
  void setBodyCssClass(String value);

  /**
   * Returns the value of the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' attribute.
   * @see #setStyle(String)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBlockElement_Style()
   * @model
   * @generated
   */
  String getStyle();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see #getStyle()
   * @generated
   */
  void setStyle(String value);

  /**
   * Returns the value of the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' containment reference.
   * @see #setHeader(ElementBody)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBlockElement_Header()
   * @model containment="true"
   * @generated
   */
  ElementBody getHeader();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getHeader <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' containment reference.
   * @see #getHeader()
   * @generated
   */
  void setHeader(ElementBody value);

  /**
   * Returns the value of the '<em><b>Header Css Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header Css Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header Css Class</em>' attribute.
   * @see #setHeaderCssClass(String)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBlockElement_HeaderCssClass()
   * @model
   * @generated
   */
  String getHeaderCssClass();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getHeaderCssClass <em>Header Css Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header Css Class</em>' attribute.
   * @see #getHeaderCssClass()
   * @generated
   */
  void setHeaderCssClass(String value);

  /**
   * Returns the value of the '<em><b>No Css</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No Css</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No Css</em>' attribute.
   * @see #setNoCss(boolean)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBlockElement_NoCss()
   * @model
   * @generated
   */
  boolean isNoCss();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#isNoCss <em>No Css</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No Css</em>' attribute.
   * @see #isNoCss()
   * @generated
   */
  void setNoCss(boolean value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(ElementBody)
   * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBlockElement_Body()
   * @model containment="true"
   * @generated
   */
  ElementBody getBody();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.ui.simUiDsl.BlockElement#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ElementBody value);

} // BlockElement

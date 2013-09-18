/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.BlockElement;
import nl.dslmeinte.simscript.ui.simUiDsl.ElementBody;
import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BlockElementImpl#getOnClick <em>On Click</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BlockElementImpl#getCssClass <em>Css Class</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BlockElementImpl#getBodyCssClass <em>Body Css Class</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BlockElementImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BlockElementImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BlockElementImpl#getHeaderCssClass <em>Header Css Class</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BlockElementImpl#isNoCss <em>No Css</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.BlockElementImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockElementImpl extends ElementImpl implements BlockElement
{
  /**
   * The cached value of the '{@link #getOnClick() <em>On Click</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnClick()
   * @generated
   * @ordered
   */
  protected Expression onClick;

  /**
   * The default value of the '{@link #getCssClass() <em>Css Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCssClass()
   * @generated
   * @ordered
   */
  protected static final String CSS_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCssClass() <em>Css Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCssClass()
   * @generated
   * @ordered
   */
  protected String cssClass = CSS_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getBodyCssClass() <em>Body Css Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyCssClass()
   * @generated
   * @ordered
   */
  protected static final String BODY_CSS_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBodyCssClass() <em>Body Css Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyCssClass()
   * @generated
   * @ordered
   */
  protected String bodyCssClass = BODY_CSS_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected static final String STYLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected String style = STYLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected ElementBody header;

  /**
   * The default value of the '{@link #getHeaderCssClass() <em>Header Css Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaderCssClass()
   * @generated
   * @ordered
   */
  protected static final String HEADER_CSS_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHeaderCssClass() <em>Header Css Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaderCssClass()
   * @generated
   * @ordered
   */
  protected String headerCssClass = HEADER_CSS_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #isNoCss() <em>No Css</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoCss()
   * @generated
   * @ordered
   */
  protected static final boolean NO_CSS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNoCss() <em>No Css</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoCss()
   * @generated
   * @ordered
   */
  protected boolean noCss = NO_CSS_EDEFAULT;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected ElementBody body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SimUiDslPackage.Literals.BLOCK_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getOnClick()
  {
    return onClick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOnClick(Expression newOnClick, NotificationChain msgs)
  {
    Expression oldOnClick = onClick;
    onClick = newOnClick;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.BLOCK_ELEMENT__ON_CLICK, oldOnClick, newOnClick);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnClick(Expression newOnClick)
  {
    if (newOnClick != onClick)
    {
      NotificationChain msgs = null;
      if (onClick != null)
        msgs = ((InternalEObject)onClick).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.BLOCK_ELEMENT__ON_CLICK, null, msgs);
      if (newOnClick != null)
        msgs = ((InternalEObject)newOnClick).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.BLOCK_ELEMENT__ON_CLICK, null, msgs);
      msgs = basicSetOnClick(newOnClick, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.BLOCK_ELEMENT__ON_CLICK, newOnClick, newOnClick));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCssClass()
  {
    return cssClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCssClass(String newCssClass)
  {
    String oldCssClass = cssClass;
    cssClass = newCssClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.BLOCK_ELEMENT__CSS_CLASS, oldCssClass, cssClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBodyCssClass()
  {
    return bodyCssClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBodyCssClass(String newBodyCssClass)
  {
    String oldBodyCssClass = bodyCssClass;
    bodyCssClass = newBodyCssClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.BLOCK_ELEMENT__BODY_CSS_CLASS, oldBodyCssClass, bodyCssClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(String newStyle)
  {
    String oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.BLOCK_ELEMENT__STYLE, oldStyle, style));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementBody getHeader()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeader(ElementBody newHeader, NotificationChain msgs)
  {
    ElementBody oldHeader = header;
    header = newHeader;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.BLOCK_ELEMENT__HEADER, oldHeader, newHeader);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeader(ElementBody newHeader)
  {
    if (newHeader != header)
    {
      NotificationChain msgs = null;
      if (header != null)
        msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.BLOCK_ELEMENT__HEADER, null, msgs);
      if (newHeader != null)
        msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.BLOCK_ELEMENT__HEADER, null, msgs);
      msgs = basicSetHeader(newHeader, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.BLOCK_ELEMENT__HEADER, newHeader, newHeader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHeaderCssClass()
  {
    return headerCssClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeaderCssClass(String newHeaderCssClass)
  {
    String oldHeaderCssClass = headerCssClass;
    headerCssClass = newHeaderCssClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.BLOCK_ELEMENT__HEADER_CSS_CLASS, oldHeaderCssClass, headerCssClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoCss()
  {
    return noCss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoCss(boolean newNoCss)
  {
    boolean oldNoCss = noCss;
    noCss = newNoCss;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.BLOCK_ELEMENT__NO_CSS, oldNoCss, noCss));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementBody getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(ElementBody newBody, NotificationChain msgs)
  {
    ElementBody oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.BLOCK_ELEMENT__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(ElementBody newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.BLOCK_ELEMENT__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.BLOCK_ELEMENT__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.BLOCK_ELEMENT__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SimUiDslPackage.BLOCK_ELEMENT__ON_CLICK:
        return basicSetOnClick(null, msgs);
      case SimUiDslPackage.BLOCK_ELEMENT__HEADER:
        return basicSetHeader(null, msgs);
      case SimUiDslPackage.BLOCK_ELEMENT__BODY:
        return basicSetBody(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SimUiDslPackage.BLOCK_ELEMENT__ON_CLICK:
        return getOnClick();
      case SimUiDslPackage.BLOCK_ELEMENT__CSS_CLASS:
        return getCssClass();
      case SimUiDslPackage.BLOCK_ELEMENT__BODY_CSS_CLASS:
        return getBodyCssClass();
      case SimUiDslPackage.BLOCK_ELEMENT__STYLE:
        return getStyle();
      case SimUiDslPackage.BLOCK_ELEMENT__HEADER:
        return getHeader();
      case SimUiDslPackage.BLOCK_ELEMENT__HEADER_CSS_CLASS:
        return getHeaderCssClass();
      case SimUiDslPackage.BLOCK_ELEMENT__NO_CSS:
        return isNoCss();
      case SimUiDslPackage.BLOCK_ELEMENT__BODY:
        return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimUiDslPackage.BLOCK_ELEMENT__ON_CLICK:
        setOnClick((Expression)newValue);
        return;
      case SimUiDslPackage.BLOCK_ELEMENT__CSS_CLASS:
        setCssClass((String)newValue);
        return;
      case SimUiDslPackage.BLOCK_ELEMENT__BODY_CSS_CLASS:
        setBodyCssClass((String)newValue);
        return;
      case SimUiDslPackage.BLOCK_ELEMENT__STYLE:
        setStyle((String)newValue);
        return;
      case SimUiDslPackage.BLOCK_ELEMENT__HEADER:
        setHeader((ElementBody)newValue);
        return;
      case SimUiDslPackage.BLOCK_ELEMENT__HEADER_CSS_CLASS:
        setHeaderCssClass((String)newValue);
        return;
      case SimUiDslPackage.BLOCK_ELEMENT__NO_CSS:
        setNoCss((Boolean)newValue);
        return;
      case SimUiDslPackage.BLOCK_ELEMENT__BODY:
        setBody((ElementBody)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SimUiDslPackage.BLOCK_ELEMENT__ON_CLICK:
        setOnClick((Expression)null);
        return;
      case SimUiDslPackage.BLOCK_ELEMENT__CSS_CLASS:
        setCssClass(CSS_CLASS_EDEFAULT);
        return;
      case SimUiDslPackage.BLOCK_ELEMENT__BODY_CSS_CLASS:
        setBodyCssClass(BODY_CSS_CLASS_EDEFAULT);
        return;
      case SimUiDslPackage.BLOCK_ELEMENT__STYLE:
        setStyle(STYLE_EDEFAULT);
        return;
      case SimUiDslPackage.BLOCK_ELEMENT__HEADER:
        setHeader((ElementBody)null);
        return;
      case SimUiDslPackage.BLOCK_ELEMENT__HEADER_CSS_CLASS:
        setHeaderCssClass(HEADER_CSS_CLASS_EDEFAULT);
        return;
      case SimUiDslPackage.BLOCK_ELEMENT__NO_CSS:
        setNoCss(NO_CSS_EDEFAULT);
        return;
      case SimUiDslPackage.BLOCK_ELEMENT__BODY:
        setBody((ElementBody)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SimUiDslPackage.BLOCK_ELEMENT__ON_CLICK:
        return onClick != null;
      case SimUiDslPackage.BLOCK_ELEMENT__CSS_CLASS:
        return CSS_CLASS_EDEFAULT == null ? cssClass != null : !CSS_CLASS_EDEFAULT.equals(cssClass);
      case SimUiDslPackage.BLOCK_ELEMENT__BODY_CSS_CLASS:
        return BODY_CSS_CLASS_EDEFAULT == null ? bodyCssClass != null : !BODY_CSS_CLASS_EDEFAULT.equals(bodyCssClass);
      case SimUiDslPackage.BLOCK_ELEMENT__STYLE:
        return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
      case SimUiDslPackage.BLOCK_ELEMENT__HEADER:
        return header != null;
      case SimUiDslPackage.BLOCK_ELEMENT__HEADER_CSS_CLASS:
        return HEADER_CSS_CLASS_EDEFAULT == null ? headerCssClass != null : !HEADER_CSS_CLASS_EDEFAULT.equals(headerCssClass);
      case SimUiDslPackage.BLOCK_ELEMENT__NO_CSS:
        return noCss != NO_CSS_EDEFAULT;
      case SimUiDslPackage.BLOCK_ELEMENT__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (cssClass: ");
    result.append(cssClass);
    result.append(", bodyCssClass: ");
    result.append(bodyCssClass);
    result.append(", style: ");
    result.append(style);
    result.append(", headerCssClass: ");
    result.append(headerCssClass);
    result.append(", noCss: ");
    result.append(noCss);
    result.append(')');
    return result.toString();
  }

} //BlockElementImpl

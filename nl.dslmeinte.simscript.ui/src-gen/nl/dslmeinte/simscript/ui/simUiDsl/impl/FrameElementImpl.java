/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.FrameElement;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.FrameElementImpl#getSourceUrl <em>Source Url</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.FrameElementImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.FrameElementImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrameElementImpl extends ElementImpl implements FrameElement
{
  /**
   * The cached value of the '{@link #getSourceUrl() <em>Source Url</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceUrl()
   * @generated
   * @ordered
   */
  protected Expression sourceUrl;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected Expression width;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected Expression height;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FrameElementImpl()
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
    return SimUiDslPackage.Literals.FRAME_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSourceUrl()
  {
    return sourceUrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSourceUrl(Expression newSourceUrl, NotificationChain msgs)
  {
    Expression oldSourceUrl = sourceUrl;
    sourceUrl = newSourceUrl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.FRAME_ELEMENT__SOURCE_URL, oldSourceUrl, newSourceUrl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceUrl(Expression newSourceUrl)
  {
    if (newSourceUrl != sourceUrl)
    {
      NotificationChain msgs = null;
      if (sourceUrl != null)
        msgs = ((InternalEObject)sourceUrl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.FRAME_ELEMENT__SOURCE_URL, null, msgs);
      if (newSourceUrl != null)
        msgs = ((InternalEObject)newSourceUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.FRAME_ELEMENT__SOURCE_URL, null, msgs);
      msgs = basicSetSourceUrl(newSourceUrl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.FRAME_ELEMENT__SOURCE_URL, newSourceUrl, newSourceUrl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWidth(Expression newWidth, NotificationChain msgs)
  {
    Expression oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.FRAME_ELEMENT__WIDTH, oldWidth, newWidth);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidth(Expression newWidth)
  {
    if (newWidth != width)
    {
      NotificationChain msgs = null;
      if (width != null)
        msgs = ((InternalEObject)width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.FRAME_ELEMENT__WIDTH, null, msgs);
      if (newWidth != null)
        msgs = ((InternalEObject)newWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.FRAME_ELEMENT__WIDTH, null, msgs);
      msgs = basicSetWidth(newWidth, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.FRAME_ELEMENT__WIDTH, newWidth, newWidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeight(Expression newHeight, NotificationChain msgs)
  {
    Expression oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.FRAME_ELEMENT__HEIGHT, oldHeight, newHeight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeight(Expression newHeight)
  {
    if (newHeight != height)
    {
      NotificationChain msgs = null;
      if (height != null)
        msgs = ((InternalEObject)height).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.FRAME_ELEMENT__HEIGHT, null, msgs);
      if (newHeight != null)
        msgs = ((InternalEObject)newHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.FRAME_ELEMENT__HEIGHT, null, msgs);
      msgs = basicSetHeight(newHeight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.FRAME_ELEMENT__HEIGHT, newHeight, newHeight));
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
      case SimUiDslPackage.FRAME_ELEMENT__SOURCE_URL:
        return basicSetSourceUrl(null, msgs);
      case SimUiDslPackage.FRAME_ELEMENT__WIDTH:
        return basicSetWidth(null, msgs);
      case SimUiDslPackage.FRAME_ELEMENT__HEIGHT:
        return basicSetHeight(null, msgs);
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
      case SimUiDslPackage.FRAME_ELEMENT__SOURCE_URL:
        return getSourceUrl();
      case SimUiDslPackage.FRAME_ELEMENT__WIDTH:
        return getWidth();
      case SimUiDslPackage.FRAME_ELEMENT__HEIGHT:
        return getHeight();
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
      case SimUiDslPackage.FRAME_ELEMENT__SOURCE_URL:
        setSourceUrl((Expression)newValue);
        return;
      case SimUiDslPackage.FRAME_ELEMENT__WIDTH:
        setWidth((Expression)newValue);
        return;
      case SimUiDslPackage.FRAME_ELEMENT__HEIGHT:
        setHeight((Expression)newValue);
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
      case SimUiDslPackage.FRAME_ELEMENT__SOURCE_URL:
        setSourceUrl((Expression)null);
        return;
      case SimUiDslPackage.FRAME_ELEMENT__WIDTH:
        setWidth((Expression)null);
        return;
      case SimUiDslPackage.FRAME_ELEMENT__HEIGHT:
        setHeight((Expression)null);
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
      case SimUiDslPackage.FRAME_ELEMENT__SOURCE_URL:
        return sourceUrl != null;
      case SimUiDslPackage.FRAME_ELEMENT__WIDTH:
        return width != null;
      case SimUiDslPackage.FRAME_ELEMENT__HEIGHT:
        return height != null;
    }
    return super.eIsSet(featureID);
  }

} //FrameElementImpl

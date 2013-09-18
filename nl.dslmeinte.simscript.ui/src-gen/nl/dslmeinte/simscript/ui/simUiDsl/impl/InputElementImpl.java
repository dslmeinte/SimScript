/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.InputElement;
import nl.dslmeinte.simscript.ui.simUiDsl.RadioOption;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.StructureOption;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InputElementImpl#getBindSite <em>Bind Site</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InputElementImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InputElementImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InputElementImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InputElementImpl#getRadioOption <em>Radio Option</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InputElementImpl#getOnChange <em>On Change</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InputElementImpl#getOnSubmit <em>On Submit</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.InputElementImpl#getStructureOption <em>Structure Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputElementImpl extends ElementImpl implements InputElement
{
  /**
   * The cached value of the '{@link #getBindSite() <em>Bind Site</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindSite()
   * @generated
   * @ordered
   */
  protected Expression bindSite;

  /**
   * The default value of the '{@link #getHint() <em>Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHint()
   * @generated
   * @ordered
   */
  protected static final String HINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHint() <em>Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHint()
   * @generated
   * @ordered
   */
  protected String hint = HINT_EDEFAULT;

  /**
   * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinValue()
   * @generated
   * @ordered
   */
  protected Expression minValue;

  /**
   * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxValue()
   * @generated
   * @ordered
   */
  protected Expression maxValue;

  /**
   * The cached value of the '{@link #getRadioOption() <em>Radio Option</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadioOption()
   * @generated
   * @ordered
   */
  protected RadioOption radioOption;

  /**
   * The cached value of the '{@link #getOnChange() <em>On Change</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnChange()
   * @generated
   * @ordered
   */
  protected Expression onChange;

  /**
   * The cached value of the '{@link #getOnSubmit() <em>On Submit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnSubmit()
   * @generated
   * @ordered
   */
  protected Expression onSubmit;

  /**
   * The cached value of the '{@link #getStructureOption() <em>Structure Option</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructureOption()
   * @generated
   * @ordered
   */
  protected StructureOption structureOption;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputElementImpl()
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
    return SimUiDslPackage.Literals.INPUT_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getBindSite()
  {
    return bindSite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBindSite(Expression newBindSite, NotificationChain msgs)
  {
    Expression oldBindSite = bindSite;
    bindSite = newBindSite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INPUT_ELEMENT__BIND_SITE, oldBindSite, newBindSite);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBindSite(Expression newBindSite)
  {
    if (newBindSite != bindSite)
    {
      NotificationChain msgs = null;
      if (bindSite != null)
        msgs = ((InternalEObject)bindSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INPUT_ELEMENT__BIND_SITE, null, msgs);
      if (newBindSite != null)
        msgs = ((InternalEObject)newBindSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INPUT_ELEMENT__BIND_SITE, null, msgs);
      msgs = basicSetBindSite(newBindSite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INPUT_ELEMENT__BIND_SITE, newBindSite, newBindSite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHint()
  {
    return hint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHint(String newHint)
  {
    String oldHint = hint;
    hint = newHint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INPUT_ELEMENT__HINT, oldHint, hint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getMinValue()
  {
    return minValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMinValue(Expression newMinValue, NotificationChain msgs)
  {
    Expression oldMinValue = minValue;
    minValue = newMinValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INPUT_ELEMENT__MIN_VALUE, oldMinValue, newMinValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinValue(Expression newMinValue)
  {
    if (newMinValue != minValue)
    {
      NotificationChain msgs = null;
      if (minValue != null)
        msgs = ((InternalEObject)minValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INPUT_ELEMENT__MIN_VALUE, null, msgs);
      if (newMinValue != null)
        msgs = ((InternalEObject)newMinValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INPUT_ELEMENT__MIN_VALUE, null, msgs);
      msgs = basicSetMinValue(newMinValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INPUT_ELEMENT__MIN_VALUE, newMinValue, newMinValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getMaxValue()
  {
    return maxValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMaxValue(Expression newMaxValue, NotificationChain msgs)
  {
    Expression oldMaxValue = maxValue;
    maxValue = newMaxValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INPUT_ELEMENT__MAX_VALUE, oldMaxValue, newMaxValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxValue(Expression newMaxValue)
  {
    if (newMaxValue != maxValue)
    {
      NotificationChain msgs = null;
      if (maxValue != null)
        msgs = ((InternalEObject)maxValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INPUT_ELEMENT__MAX_VALUE, null, msgs);
      if (newMaxValue != null)
        msgs = ((InternalEObject)newMaxValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INPUT_ELEMENT__MAX_VALUE, null, msgs);
      msgs = basicSetMaxValue(newMaxValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INPUT_ELEMENT__MAX_VALUE, newMaxValue, newMaxValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RadioOption getRadioOption()
  {
    return radioOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRadioOption(RadioOption newRadioOption, NotificationChain msgs)
  {
    RadioOption oldRadioOption = radioOption;
    radioOption = newRadioOption;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INPUT_ELEMENT__RADIO_OPTION, oldRadioOption, newRadioOption);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRadioOption(RadioOption newRadioOption)
  {
    if (newRadioOption != radioOption)
    {
      NotificationChain msgs = null;
      if (radioOption != null)
        msgs = ((InternalEObject)radioOption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INPUT_ELEMENT__RADIO_OPTION, null, msgs);
      if (newRadioOption != null)
        msgs = ((InternalEObject)newRadioOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INPUT_ELEMENT__RADIO_OPTION, null, msgs);
      msgs = basicSetRadioOption(newRadioOption, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INPUT_ELEMENT__RADIO_OPTION, newRadioOption, newRadioOption));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getOnChange()
  {
    return onChange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOnChange(Expression newOnChange, NotificationChain msgs)
  {
    Expression oldOnChange = onChange;
    onChange = newOnChange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INPUT_ELEMENT__ON_CHANGE, oldOnChange, newOnChange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnChange(Expression newOnChange)
  {
    if (newOnChange != onChange)
    {
      NotificationChain msgs = null;
      if (onChange != null)
        msgs = ((InternalEObject)onChange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INPUT_ELEMENT__ON_CHANGE, null, msgs);
      if (newOnChange != null)
        msgs = ((InternalEObject)newOnChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INPUT_ELEMENT__ON_CHANGE, null, msgs);
      msgs = basicSetOnChange(newOnChange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INPUT_ELEMENT__ON_CHANGE, newOnChange, newOnChange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getOnSubmit()
  {
    return onSubmit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOnSubmit(Expression newOnSubmit, NotificationChain msgs)
  {
    Expression oldOnSubmit = onSubmit;
    onSubmit = newOnSubmit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INPUT_ELEMENT__ON_SUBMIT, oldOnSubmit, newOnSubmit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnSubmit(Expression newOnSubmit)
  {
    if (newOnSubmit != onSubmit)
    {
      NotificationChain msgs = null;
      if (onSubmit != null)
        msgs = ((InternalEObject)onSubmit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INPUT_ELEMENT__ON_SUBMIT, null, msgs);
      if (newOnSubmit != null)
        msgs = ((InternalEObject)newOnSubmit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INPUT_ELEMENT__ON_SUBMIT, null, msgs);
      msgs = basicSetOnSubmit(newOnSubmit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INPUT_ELEMENT__ON_SUBMIT, newOnSubmit, newOnSubmit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureOption getStructureOption()
  {
    return structureOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStructureOption(StructureOption newStructureOption, NotificationChain msgs)
  {
    StructureOption oldStructureOption = structureOption;
    structureOption = newStructureOption;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INPUT_ELEMENT__STRUCTURE_OPTION, oldStructureOption, newStructureOption);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructureOption(StructureOption newStructureOption)
  {
    if (newStructureOption != structureOption)
    {
      NotificationChain msgs = null;
      if (structureOption != null)
        msgs = ((InternalEObject)structureOption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INPUT_ELEMENT__STRUCTURE_OPTION, null, msgs);
      if (newStructureOption != null)
        msgs = ((InternalEObject)newStructureOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.INPUT_ELEMENT__STRUCTURE_OPTION, null, msgs);
      msgs = basicSetStructureOption(newStructureOption, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.INPUT_ELEMENT__STRUCTURE_OPTION, newStructureOption, newStructureOption));
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
      case SimUiDslPackage.INPUT_ELEMENT__BIND_SITE:
        return basicSetBindSite(null, msgs);
      case SimUiDslPackage.INPUT_ELEMENT__MIN_VALUE:
        return basicSetMinValue(null, msgs);
      case SimUiDslPackage.INPUT_ELEMENT__MAX_VALUE:
        return basicSetMaxValue(null, msgs);
      case SimUiDslPackage.INPUT_ELEMENT__RADIO_OPTION:
        return basicSetRadioOption(null, msgs);
      case SimUiDslPackage.INPUT_ELEMENT__ON_CHANGE:
        return basicSetOnChange(null, msgs);
      case SimUiDslPackage.INPUT_ELEMENT__ON_SUBMIT:
        return basicSetOnSubmit(null, msgs);
      case SimUiDslPackage.INPUT_ELEMENT__STRUCTURE_OPTION:
        return basicSetStructureOption(null, msgs);
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
      case SimUiDslPackage.INPUT_ELEMENT__BIND_SITE:
        return getBindSite();
      case SimUiDslPackage.INPUT_ELEMENT__HINT:
        return getHint();
      case SimUiDslPackage.INPUT_ELEMENT__MIN_VALUE:
        return getMinValue();
      case SimUiDslPackage.INPUT_ELEMENT__MAX_VALUE:
        return getMaxValue();
      case SimUiDslPackage.INPUT_ELEMENT__RADIO_OPTION:
        return getRadioOption();
      case SimUiDslPackage.INPUT_ELEMENT__ON_CHANGE:
        return getOnChange();
      case SimUiDslPackage.INPUT_ELEMENT__ON_SUBMIT:
        return getOnSubmit();
      case SimUiDslPackage.INPUT_ELEMENT__STRUCTURE_OPTION:
        return getStructureOption();
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
      case SimUiDslPackage.INPUT_ELEMENT__BIND_SITE:
        setBindSite((Expression)newValue);
        return;
      case SimUiDslPackage.INPUT_ELEMENT__HINT:
        setHint((String)newValue);
        return;
      case SimUiDslPackage.INPUT_ELEMENT__MIN_VALUE:
        setMinValue((Expression)newValue);
        return;
      case SimUiDslPackage.INPUT_ELEMENT__MAX_VALUE:
        setMaxValue((Expression)newValue);
        return;
      case SimUiDslPackage.INPUT_ELEMENT__RADIO_OPTION:
        setRadioOption((RadioOption)newValue);
        return;
      case SimUiDslPackage.INPUT_ELEMENT__ON_CHANGE:
        setOnChange((Expression)newValue);
        return;
      case SimUiDslPackage.INPUT_ELEMENT__ON_SUBMIT:
        setOnSubmit((Expression)newValue);
        return;
      case SimUiDslPackage.INPUT_ELEMENT__STRUCTURE_OPTION:
        setStructureOption((StructureOption)newValue);
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
      case SimUiDslPackage.INPUT_ELEMENT__BIND_SITE:
        setBindSite((Expression)null);
        return;
      case SimUiDslPackage.INPUT_ELEMENT__HINT:
        setHint(HINT_EDEFAULT);
        return;
      case SimUiDslPackage.INPUT_ELEMENT__MIN_VALUE:
        setMinValue((Expression)null);
        return;
      case SimUiDslPackage.INPUT_ELEMENT__MAX_VALUE:
        setMaxValue((Expression)null);
        return;
      case SimUiDslPackage.INPUT_ELEMENT__RADIO_OPTION:
        setRadioOption((RadioOption)null);
        return;
      case SimUiDslPackage.INPUT_ELEMENT__ON_CHANGE:
        setOnChange((Expression)null);
        return;
      case SimUiDslPackage.INPUT_ELEMENT__ON_SUBMIT:
        setOnSubmit((Expression)null);
        return;
      case SimUiDslPackage.INPUT_ELEMENT__STRUCTURE_OPTION:
        setStructureOption((StructureOption)null);
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
      case SimUiDslPackage.INPUT_ELEMENT__BIND_SITE:
        return bindSite != null;
      case SimUiDslPackage.INPUT_ELEMENT__HINT:
        return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
      case SimUiDslPackage.INPUT_ELEMENT__MIN_VALUE:
        return minValue != null;
      case SimUiDslPackage.INPUT_ELEMENT__MAX_VALUE:
        return maxValue != null;
      case SimUiDslPackage.INPUT_ELEMENT__RADIO_OPTION:
        return radioOption != null;
      case SimUiDslPackage.INPUT_ELEMENT__ON_CHANGE:
        return onChange != null;
      case SimUiDslPackage.INPUT_ELEMENT__ON_SUBMIT:
        return onSubmit != null;
      case SimUiDslPackage.INPUT_ELEMENT__STRUCTURE_OPTION:
        return structureOption != null;
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
    result.append(" (hint: ");
    result.append(hint);
    result.append(')');
    return result.toString();
  }

} //InputElementImpl

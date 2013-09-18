/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import java.util.Collection;

import nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable;
import nl.dslmeinte.simscript.ui.simUiDsl.LocalViewableDefinition;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.ValuesBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defined Viewable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DefinedViewableImpl#getValuesBlock <em>Values Block</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.DefinedViewableImpl#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinedViewableImpl extends ViewableImpl implements DefinedViewable
{
  /**
   * The cached value of the '{@link #getValuesBlock() <em>Values Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuesBlock()
   * @generated
   * @ordered
   */
  protected ValuesBlock valuesBlock;

  /**
   * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitions()
   * @generated
   * @ordered
   */
  protected EList<LocalViewableDefinition> definitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinedViewableImpl()
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
    return SimUiDslPackage.Literals.DEFINED_VIEWABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuesBlock getValuesBlock()
  {
    return valuesBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValuesBlock(ValuesBlock newValuesBlock, NotificationChain msgs)
  {
    ValuesBlock oldValuesBlock = valuesBlock;
    valuesBlock = newValuesBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.DEFINED_VIEWABLE__VALUES_BLOCK, oldValuesBlock, newValuesBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValuesBlock(ValuesBlock newValuesBlock)
  {
    if (newValuesBlock != valuesBlock)
    {
      NotificationChain msgs = null;
      if (valuesBlock != null)
        msgs = ((InternalEObject)valuesBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.DEFINED_VIEWABLE__VALUES_BLOCK, null, msgs);
      if (newValuesBlock != null)
        msgs = ((InternalEObject)newValuesBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.DEFINED_VIEWABLE__VALUES_BLOCK, null, msgs);
      msgs = basicSetValuesBlock(newValuesBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.DEFINED_VIEWABLE__VALUES_BLOCK, newValuesBlock, newValuesBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LocalViewableDefinition> getDefinitions()
  {
    if (definitions == null)
    {
      definitions = new EObjectContainmentEList<LocalViewableDefinition>(LocalViewableDefinition.class, this, SimUiDslPackage.DEFINED_VIEWABLE__DEFINITIONS);
    }
    return definitions;
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
      case SimUiDslPackage.DEFINED_VIEWABLE__VALUES_BLOCK:
        return basicSetValuesBlock(null, msgs);
      case SimUiDslPackage.DEFINED_VIEWABLE__DEFINITIONS:
        return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
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
      case SimUiDslPackage.DEFINED_VIEWABLE__VALUES_BLOCK:
        return getValuesBlock();
      case SimUiDslPackage.DEFINED_VIEWABLE__DEFINITIONS:
        return getDefinitions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimUiDslPackage.DEFINED_VIEWABLE__VALUES_BLOCK:
        setValuesBlock((ValuesBlock)newValue);
        return;
      case SimUiDslPackage.DEFINED_VIEWABLE__DEFINITIONS:
        getDefinitions().clear();
        getDefinitions().addAll((Collection<? extends LocalViewableDefinition>)newValue);
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
      case SimUiDslPackage.DEFINED_VIEWABLE__VALUES_BLOCK:
        setValuesBlock((ValuesBlock)null);
        return;
      case SimUiDslPackage.DEFINED_VIEWABLE__DEFINITIONS:
        getDefinitions().clear();
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
      case SimUiDslPackage.DEFINED_VIEWABLE__VALUES_BLOCK:
        return valuesBlock != null;
      case SimUiDslPackage.DEFINED_VIEWABLE__DEFINITIONS:
        return definitions != null && !definitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DefinedViewableImpl

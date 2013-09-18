/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.ArgumentList;
import nl.dslmeinte.simscript.ui.simUiDsl.GotoScreenStatement;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.Viewable;
import nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goto Screen Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoScreenStatementImpl#getViewable <em>Viewable</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.GotoScreenStatementImpl#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GotoScreenStatementImpl extends ExitingStatementImpl implements GotoScreenStatement
{
  /**
   * The cached value of the '{@link #getViewable() <em>Viewable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewable()
   * @generated
   * @ordered
   */
  protected Viewable viewable;

  /**
   * The cached value of the '{@link #getArgumentList() <em>Argument List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgumentList()
   * @generated
   * @ordered
   */
  protected ArgumentList argumentList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GotoScreenStatementImpl()
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
    return SimUiDslPackage.Literals.GOTO_SCREEN_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Viewable getViewable()
  {
    if (viewable != null && viewable.eIsProxy())
    {
      InternalEObject oldViewable = (InternalEObject)viewable;
      viewable = (Viewable)eResolveProxy(oldViewable);
      if (viewable != oldViewable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimUiDslPackage.GOTO_SCREEN_STATEMENT__VIEWABLE, oldViewable, viewable));
      }
    }
    return viewable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Viewable basicGetViewable()
  {
    return viewable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewable(Viewable newViewable)
  {
    Viewable oldViewable = viewable;
    viewable = newViewable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GOTO_SCREEN_STATEMENT__VIEWABLE, oldViewable, viewable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentList getArgumentList()
  {
    return argumentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgumentList(ArgumentList newArgumentList, NotificationChain msgs)
  {
    ArgumentList oldArgumentList = argumentList;
    argumentList = newArgumentList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GOTO_SCREEN_STATEMENT__ARGUMENT_LIST, oldArgumentList, newArgumentList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgumentList(ArgumentList newArgumentList)
  {
    if (newArgumentList != argumentList)
    {
      NotificationChain msgs = null;
      if (argumentList != null)
        msgs = ((InternalEObject)argumentList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.GOTO_SCREEN_STATEMENT__ARGUMENT_LIST, null, msgs);
      if (newArgumentList != null)
        msgs = ((InternalEObject)newArgumentList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.GOTO_SCREEN_STATEMENT__ARGUMENT_LIST, null, msgs);
      msgs = basicSetArgumentList(newArgumentList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.GOTO_SCREEN_STATEMENT__ARGUMENT_LIST, newArgumentList, newArgumentList));
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
      case SimUiDslPackage.GOTO_SCREEN_STATEMENT__ARGUMENT_LIST:
        return basicSetArgumentList(null, msgs);
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
      case SimUiDslPackage.GOTO_SCREEN_STATEMENT__VIEWABLE:
        if (resolve) return getViewable();
        return basicGetViewable();
      case SimUiDslPackage.GOTO_SCREEN_STATEMENT__ARGUMENT_LIST:
        return getArgumentList();
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
      case SimUiDslPackage.GOTO_SCREEN_STATEMENT__VIEWABLE:
        setViewable((Viewable)newValue);
        return;
      case SimUiDslPackage.GOTO_SCREEN_STATEMENT__ARGUMENT_LIST:
        setArgumentList((ArgumentList)newValue);
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
      case SimUiDslPackage.GOTO_SCREEN_STATEMENT__VIEWABLE:
        setViewable((Viewable)null);
        return;
      case SimUiDslPackage.GOTO_SCREEN_STATEMENT__ARGUMENT_LIST:
        setArgumentList((ArgumentList)null);
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
      case SimUiDslPackage.GOTO_SCREEN_STATEMENT__VIEWABLE:
        return viewable != null;
      case SimUiDslPackage.GOTO_SCREEN_STATEMENT__ARGUMENT_LIST:
        return argumentList != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == ViewableCallSite.class)
    {
      switch (derivedFeatureID)
      {
        case SimUiDslPackage.GOTO_SCREEN_STATEMENT__VIEWABLE: return SimUiDslPackage.VIEWABLE_CALL_SITE__VIEWABLE;
        case SimUiDslPackage.GOTO_SCREEN_STATEMENT__ARGUMENT_LIST: return SimUiDslPackage.VIEWABLE_CALL_SITE__ARGUMENT_LIST;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == ViewableCallSite.class)
    {
      switch (baseFeatureID)
      {
        case SimUiDslPackage.VIEWABLE_CALL_SITE__VIEWABLE: return SimUiDslPackage.GOTO_SCREEN_STATEMENT__VIEWABLE;
        case SimUiDslPackage.VIEWABLE_CALL_SITE__ARGUMENT_LIST: return SimUiDslPackage.GOTO_SCREEN_STATEMENT__ARGUMENT_LIST;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //GotoScreenStatementImpl

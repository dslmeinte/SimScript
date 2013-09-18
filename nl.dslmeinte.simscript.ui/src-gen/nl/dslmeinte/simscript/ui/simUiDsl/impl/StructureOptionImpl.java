/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.ui.simUiDsl.Expression;
import nl.dslmeinte.simscript.ui.simUiDsl.Method;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;
import nl.dslmeinte.simscript.ui.simUiDsl.StructureOption;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.StructureOptionImpl#getSourceExpr <em>Source Expr</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.StructureOptionImpl#getDisplayFunction <em>Display Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureOptionImpl extends MinimalEObjectImpl.Container implements StructureOption
{
  /**
   * The cached value of the '{@link #getSourceExpr() <em>Source Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceExpr()
   * @generated
   * @ordered
   */
  protected Expression sourceExpr;

  /**
   * The cached value of the '{@link #getDisplayFunction() <em>Display Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayFunction()
   * @generated
   * @ordered
   */
  protected Method displayFunction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructureOptionImpl()
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
    return SimUiDslPackage.Literals.STRUCTURE_OPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSourceExpr()
  {
    return sourceExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSourceExpr(Expression newSourceExpr, NotificationChain msgs)
  {
    Expression oldSourceExpr = sourceExpr;
    sourceExpr = newSourceExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimUiDslPackage.STRUCTURE_OPTION__SOURCE_EXPR, oldSourceExpr, newSourceExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceExpr(Expression newSourceExpr)
  {
    if (newSourceExpr != sourceExpr)
    {
      NotificationChain msgs = null;
      if (sourceExpr != null)
        msgs = ((InternalEObject)sourceExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.STRUCTURE_OPTION__SOURCE_EXPR, null, msgs);
      if (newSourceExpr != null)
        msgs = ((InternalEObject)newSourceExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimUiDslPackage.STRUCTURE_OPTION__SOURCE_EXPR, null, msgs);
      msgs = basicSetSourceExpr(newSourceExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.STRUCTURE_OPTION__SOURCE_EXPR, newSourceExpr, newSourceExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method getDisplayFunction()
  {
    if (displayFunction != null && displayFunction.eIsProxy())
    {
      InternalEObject oldDisplayFunction = (InternalEObject)displayFunction;
      displayFunction = (Method)eResolveProxy(oldDisplayFunction);
      if (displayFunction != oldDisplayFunction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimUiDslPackage.STRUCTURE_OPTION__DISPLAY_FUNCTION, oldDisplayFunction, displayFunction));
      }
    }
    return displayFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method basicGetDisplayFunction()
  {
    return displayFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisplayFunction(Method newDisplayFunction)
  {
    Method oldDisplayFunction = displayFunction;
    displayFunction = newDisplayFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.STRUCTURE_OPTION__DISPLAY_FUNCTION, oldDisplayFunction, displayFunction));
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
      case SimUiDslPackage.STRUCTURE_OPTION__SOURCE_EXPR:
        return basicSetSourceExpr(null, msgs);
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
      case SimUiDslPackage.STRUCTURE_OPTION__SOURCE_EXPR:
        return getSourceExpr();
      case SimUiDslPackage.STRUCTURE_OPTION__DISPLAY_FUNCTION:
        if (resolve) return getDisplayFunction();
        return basicGetDisplayFunction();
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
      case SimUiDslPackage.STRUCTURE_OPTION__SOURCE_EXPR:
        setSourceExpr((Expression)newValue);
        return;
      case SimUiDslPackage.STRUCTURE_OPTION__DISPLAY_FUNCTION:
        setDisplayFunction((Method)newValue);
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
      case SimUiDslPackage.STRUCTURE_OPTION__SOURCE_EXPR:
        setSourceExpr((Expression)null);
        return;
      case SimUiDslPackage.STRUCTURE_OPTION__DISPLAY_FUNCTION:
        setDisplayFunction((Method)null);
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
      case SimUiDslPackage.STRUCTURE_OPTION__SOURCE_EXPR:
        return sourceExpr != null;
      case SimUiDslPackage.STRUCTURE_OPTION__DISPLAY_FUNCTION:
        return displayFunction != null;
    }
    return super.eIsSet(featureID);
  }

} //StructureOptionImpl

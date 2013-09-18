/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl.impl;

import nl.dslmeinte.simscript.structure.structureDsl.Enumeration;
import nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral;

import nl.dslmeinte.simscript.ui.simUiDsl.EnumerationLiteralExpression;
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.EnumerationLiteralExpressionImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.ui.simUiDsl.impl.EnumerationLiteralExpressionImpl#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationLiteralExpressionImpl extends LiteralExpressionImpl implements EnumerationLiteralExpression
{
  /**
   * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumeration()
   * @generated
   * @ordered
   */
  protected Enumeration enumeration;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected EnumerationLiteral literal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumerationLiteralExpressionImpl()
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
    return SimUiDslPackage.Literals.ENUMERATION_LITERAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration getEnumeration()
  {
    if (enumeration != null && enumeration.eIsProxy())
    {
      InternalEObject oldEnumeration = (InternalEObject)enumeration;
      enumeration = (Enumeration)eResolveProxy(oldEnumeration);
      if (enumeration != oldEnumeration)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimUiDslPackage.ENUMERATION_LITERAL_EXPRESSION__ENUMERATION, oldEnumeration, enumeration));
      }
    }
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration basicGetEnumeration()
  {
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumeration(Enumeration newEnumeration)
  {
    Enumeration oldEnumeration = enumeration;
    enumeration = newEnumeration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.ENUMERATION_LITERAL_EXPRESSION__ENUMERATION, oldEnumeration, enumeration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral getLiteral()
  {
    if (literal != null && literal.eIsProxy())
    {
      InternalEObject oldLiteral = (InternalEObject)literal;
      literal = (EnumerationLiteral)eResolveProxy(oldLiteral);
      if (literal != oldLiteral)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimUiDslPackage.ENUMERATION_LITERAL_EXPRESSION__LITERAL, oldLiteral, literal));
      }
    }
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral basicGetLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(EnumerationLiteral newLiteral)
  {
    EnumerationLiteral oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimUiDslPackage.ENUMERATION_LITERAL_EXPRESSION__LITERAL, oldLiteral, literal));
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
      case SimUiDslPackage.ENUMERATION_LITERAL_EXPRESSION__ENUMERATION:
        if (resolve) return getEnumeration();
        return basicGetEnumeration();
      case SimUiDslPackage.ENUMERATION_LITERAL_EXPRESSION__LITERAL:
        if (resolve) return getLiteral();
        return basicGetLiteral();
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
      case SimUiDslPackage.ENUMERATION_LITERAL_EXPRESSION__ENUMERATION:
        setEnumeration((Enumeration)newValue);
        return;
      case SimUiDslPackage.ENUMERATION_LITERAL_EXPRESSION__LITERAL:
        setLiteral((EnumerationLiteral)newValue);
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
      case SimUiDslPackage.ENUMERATION_LITERAL_EXPRESSION__ENUMERATION:
        setEnumeration((Enumeration)null);
        return;
      case SimUiDslPackage.ENUMERATION_LITERAL_EXPRESSION__LITERAL:
        setLiteral((EnumerationLiteral)null);
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
      case SimUiDslPackage.ENUMERATION_LITERAL_EXPRESSION__ENUMERATION:
        return enumeration != null;
      case SimUiDslPackage.ENUMERATION_LITERAL_EXPRESSION__LITERAL:
        return literal != null;
    }
    return super.eIsSet(featureID);
  }

} //EnumerationLiteralExpressionImpl

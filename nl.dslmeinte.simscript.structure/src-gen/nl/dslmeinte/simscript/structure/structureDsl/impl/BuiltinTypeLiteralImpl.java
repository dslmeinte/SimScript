/**
 */
package nl.dslmeinte.simscript.structure.structureDsl.impl;

import nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypes;
import nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Builtin Type Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.structure.structureDsl.impl.BuiltinTypeLiteralImpl#getBuiltin <em>Builtin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuiltinTypeLiteralImpl extends TypeLiteralImpl implements BuiltinTypeLiteral
{
  /**
   * The default value of the '{@link #getBuiltin() <em>Builtin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltin()
   * @generated
   * @ordered
   */
  protected static final BuiltinTypes BUILTIN_EDEFAULT = BuiltinTypes.STRING;

  /**
   * The cached value of the '{@link #getBuiltin() <em>Builtin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuiltin()
   * @generated
   * @ordered
   */
  protected BuiltinTypes builtin = BUILTIN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuiltinTypeLiteralImpl()
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
    return StructureDslPackage.Literals.BUILTIN_TYPE_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltinTypes getBuiltin()
  {
    return builtin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuiltin(BuiltinTypes newBuiltin)
  {
    BuiltinTypes oldBuiltin = builtin;
    builtin = newBuiltin == null ? BUILTIN_EDEFAULT : newBuiltin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StructureDslPackage.BUILTIN_TYPE_LITERAL__BUILTIN, oldBuiltin, builtin));
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
      case StructureDslPackage.BUILTIN_TYPE_LITERAL__BUILTIN:
        return getBuiltin();
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
      case StructureDslPackage.BUILTIN_TYPE_LITERAL__BUILTIN:
        setBuiltin((BuiltinTypes)newValue);
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
      case StructureDslPackage.BUILTIN_TYPE_LITERAL__BUILTIN:
        setBuiltin(BUILTIN_EDEFAULT);
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
      case StructureDslPackage.BUILTIN_TYPE_LITERAL__BUILTIN:
        return builtin != BUILTIN_EDEFAULT;
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
    result.append(" (builtin: ");
    result.append(builtin);
    result.append(')');
    return result.toString();
  }

} //BuiltinTypeLiteralImpl

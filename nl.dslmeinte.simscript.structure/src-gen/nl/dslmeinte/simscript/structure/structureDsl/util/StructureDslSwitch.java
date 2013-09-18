/**
 */
package nl.dslmeinte.simscript.structure.structureDsl.util;

import nl.dslmeinte.simscript.structure.structureDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage
 * @generated
 */
public class StructureDslSwitch<T1> extends Switch<T1>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StructureDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = StructureDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T1 doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case StructureDslPackage.STRUCTURE_MODEL:
      {
        StructureModel structureModel = (StructureModel)theEObject;
        T1 result = caseStructureModel(structureModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StructureDslPackage.DEFINED_TYPE:
      {
        DefinedType definedType = (DefinedType)theEObject;
        T1 result = caseDefinedType(definedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StructureDslPackage.STRUCTURE:
      {
        Structure structure = (Structure)theEObject;
        T1 result = caseStructure(structure);
        if (result == null) result = caseDefinedType(structure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StructureDslPackage.FEATURE:
      {
        Feature<?> feature = (Feature<?>)theEObject;
        T1 result = caseFeature(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StructureDslPackage.ENUMERATION:
      {
        Enumeration enumeration = (Enumeration)theEObject;
        T1 result = caseEnumeration(enumeration);
        if (result == null) result = caseDefinedType(enumeration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StructureDslPackage.ENUMERATION_LITERAL:
      {
        EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
        T1 result = caseEnumerationLiteral(enumerationLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StructureDslPackage.TYPE_LITERAL:
      {
        TypeLiteral typeLiteral = (TypeLiteral)theEObject;
        T1 result = caseTypeLiteral(typeLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StructureDslPackage.BUILTIN_TYPE_LITERAL:
      {
        BuiltinTypeLiteral builtinTypeLiteral = (BuiltinTypeLiteral)theEObject;
        T1 result = caseBuiltinTypeLiteral(builtinTypeLiteral);
        if (result == null) result = caseTypeLiteral(builtinTypeLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StructureDslPackage.DEFINED_TYPE_LITERAL:
      {
        DefinedTypeLiteral definedTypeLiteral = (DefinedTypeLiteral)theEObject;
        T1 result = caseDefinedTypeLiteral(definedTypeLiteral);
        if (result == null) result = caseTypeLiteral(definedTypeLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StructureDslPackage.LIST_TYPE_LITERAL:
      {
        ListTypeLiteral listTypeLiteral = (ListTypeLiteral)theEObject;
        T1 result = caseListTypeLiteral(listTypeLiteral);
        if (result == null) result = caseTypeLiteral(listTypeLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StructureDslPackage.SYNTHETIC_TYPE_LITERAL:
      {
        SyntheticTypeLiteral syntheticTypeLiteral = (SyntheticTypeLiteral)theEObject;
        T1 result = caseSyntheticTypeLiteral(syntheticTypeLiteral);
        if (result == null) result = caseTypeLiteral(syntheticTypeLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StructureDslPackage.CALLBACK_LITERAL:
      {
        CallbackLiteral callbackLiteral = (CallbackLiteral)theEObject;
        T1 result = caseCallbackLiteral(callbackLiteral);
        if (result == null) result = caseSyntheticTypeLiteral(callbackLiteral);
        if (result == null) result = caseTypeLiteral(callbackLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StructureDslPackage.CALLBACK_ERROR_RESPONSE_LITERAL:
      {
        CallbackErrorResponseLiteral callbackErrorResponseLiteral = (CallbackErrorResponseLiteral)theEObject;
        T1 result = caseCallbackErrorResponseLiteral(callbackErrorResponseLiteral);
        if (result == null) result = caseSyntheticTypeLiteral(callbackErrorResponseLiteral);
        if (result == null) result = caseTypeLiteral(callbackErrorResponseLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case StructureDslPackage.VOID_LITERAL:
      {
        VoidLiteral voidLiteral = (VoidLiteral)theEObject;
        T1 result = caseVoidLiteral(voidLiteral);
        if (result == null) result = caseSyntheticTypeLiteral(voidLiteral);
        if (result == null) result = caseTypeLiteral(voidLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseStructureModel(StructureModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Defined Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Defined Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseDefinedType(DefinedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseStructure(Structure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public <T extends TypeLiteral> T1 caseFeature(Feature<T> object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseEnumeration(Enumeration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseEnumerationLiteral(EnumerationLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseTypeLiteral(TypeLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Builtin Type Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Builtin Type Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseBuiltinTypeLiteral(BuiltinTypeLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Defined Type Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Defined Type Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseDefinedTypeLiteral(DefinedTypeLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Type Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Type Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseListTypeLiteral(ListTypeLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Synthetic Type Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Synthetic Type Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseSyntheticTypeLiteral(SyntheticTypeLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Callback Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Callback Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseCallbackLiteral(CallbackLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Callback Error Response Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Callback Error Response Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseCallbackErrorResponseLiteral(CallbackErrorResponseLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Void Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Void Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T1 caseVoidLiteral(VoidLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T1 defaultCase(EObject object)
  {
    return null;
  }

} //StructureDslSwitch

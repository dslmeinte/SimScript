/**
 */
package nl.dslmeinte.simscript.structure.structureDsl.util;

import nl.dslmeinte.simscript.structure.structureDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage
 * @generated
 */
public class StructureDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static StructureDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = StructureDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructureDslSwitch<Adapter> modelSwitch =
    new StructureDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseStructureModel(StructureModel object)
      {
        return createStructureModelAdapter();
      }
      @Override
      public Adapter caseDefinedType(DefinedType object)
      {
        return createDefinedTypeAdapter();
      }
      @Override
      public Adapter caseStructure(Structure object)
      {
        return createStructureAdapter();
      }
      @Override
      public <T extends TypeLiteral> Adapter caseFeature(Feature<T> object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseEnumeration(Enumeration object)
      {
        return createEnumerationAdapter();
      }
      @Override
      public Adapter caseEnumerationLiteral(EnumerationLiteral object)
      {
        return createEnumerationLiteralAdapter();
      }
      @Override
      public Adapter caseTypeLiteral(TypeLiteral object)
      {
        return createTypeLiteralAdapter();
      }
      @Override
      public Adapter caseBuiltinTypeLiteral(BuiltinTypeLiteral object)
      {
        return createBuiltinTypeLiteralAdapter();
      }
      @Override
      public Adapter caseDefinedTypeLiteral(DefinedTypeLiteral object)
      {
        return createDefinedTypeLiteralAdapter();
      }
      @Override
      public Adapter caseListTypeLiteral(ListTypeLiteral object)
      {
        return createListTypeLiteralAdapter();
      }
      @Override
      public Adapter caseSyntheticTypeLiteral(SyntheticTypeLiteral object)
      {
        return createSyntheticTypeLiteralAdapter();
      }
      @Override
      public Adapter caseCallbackLiteral(CallbackLiteral object)
      {
        return createCallbackLiteralAdapter();
      }
      @Override
      public Adapter caseCallbackErrorResponseLiteral(CallbackErrorResponseLiteral object)
      {
        return createCallbackErrorResponseLiteralAdapter();
      }
      @Override
      public Adapter caseVoidLiteral(VoidLiteral object)
      {
        return createVoidLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.structure.structureDsl.StructureModel <em>Structure Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.structure.structureDsl.StructureModel
   * @generated
   */
  public Adapter createStructureModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.structure.structureDsl.DefinedType <em>Defined Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.structure.structureDsl.DefinedType
   * @generated
   */
  public Adapter createDefinedTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.structure.structureDsl.Structure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.structure.structureDsl.Structure
   * @generated
   */
  public Adapter createStructureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.structure.structureDsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.structure.structureDsl.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.structure.structureDsl.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.structure.structureDsl.Enumeration
   * @generated
   */
  public Adapter createEnumerationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral <em>Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral
   * @generated
   */
  public Adapter createEnumerationLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral <em>Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral
   * @generated
   */
  public Adapter createTypeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypeLiteral <em>Builtin Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypeLiteral
   * @generated
   */
  public Adapter createBuiltinTypeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.structure.structureDsl.DefinedTypeLiteral <em>Defined Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.structure.structureDsl.DefinedTypeLiteral
   * @generated
   */
  public Adapter createDefinedTypeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.structure.structureDsl.ListTypeLiteral <em>List Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.structure.structureDsl.ListTypeLiteral
   * @generated
   */
  public Adapter createListTypeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.structure.structureDsl.SyntheticTypeLiteral <em>Synthetic Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.structure.structureDsl.SyntheticTypeLiteral
   * @generated
   */
  public Adapter createSyntheticTypeLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.structure.structureDsl.CallbackLiteral <em>Callback Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.structure.structureDsl.CallbackLiteral
   * @generated
   */
  public Adapter createCallbackLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.structure.structureDsl.CallbackErrorResponseLiteral <em>Callback Error Response Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.structure.structureDsl.CallbackErrorResponseLiteral
   * @generated
   */
  public Adapter createCallbackErrorResponseLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.dslmeinte.simscript.structure.structureDsl.VoidLiteral <em>Void Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.dslmeinte.simscript.structure.structureDsl.VoidLiteral
   * @generated
   */
  public Adapter createVoidLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //StructureDslAdapterFactory

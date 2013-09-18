/**
 */
package nl.dslmeinte.simscript.backend.simBackendDsl;

import nl.dslmeinte.simscript.structure.structureDsl.DefinedTypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getMethod <em>Method</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getInputType <em>Input Type</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getOutputType <em>Output Type</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#isNotAuthenticated <em>Not Authenticated</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getLegacyServlet <em>Legacy Servlet</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends NamedService
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.simscript.backend.simBackendDsl.HttpMethods}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.HttpMethods
   * @see #setMethod(HttpMethods)
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getInterface_Method()
   * @model
   * @generated
   */
  HttpMethods getMethod();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.HttpMethods
   * @see #getMethod()
   * @generated
   */
  void setMethod(HttpMethods value);

  /**
   * Returns the value of the '<em><b>Input Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Type</em>' containment reference.
   * @see #setInputType(DefinedTypeLiteral)
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getInterface_InputType()
   * @model containment="true"
   * @generated
   */
  DefinedTypeLiteral getInputType();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getInputType <em>Input Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Type</em>' containment reference.
   * @see #getInputType()
   * @generated
   */
  void setInputType(DefinedTypeLiteral value);

  /**
   * Returns the value of the '<em><b>Output Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Type</em>' containment reference.
   * @see #setOutputType(TypeLiteral)
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getInterface_OutputType()
   * @model containment="true"
   * @generated
   */
  TypeLiteral getOutputType();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getOutputType <em>Output Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Type</em>' containment reference.
   * @see #getOutputType()
   * @generated
   */
  void setOutputType(TypeLiteral value);

  /**
   * Returns the value of the '<em><b>Not Authenticated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not Authenticated</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not Authenticated</em>' attribute.
   * @see #setNotAuthenticated(boolean)
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getInterface_NotAuthenticated()
   * @model
   * @generated
   */
  boolean isNotAuthenticated();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#isNotAuthenticated <em>Not Authenticated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not Authenticated</em>' attribute.
   * @see #isNotAuthenticated()
   * @generated
   */
  void setNotAuthenticated(boolean value);

  /**
   * Returns the value of the '<em><b>Legacy Servlet</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Legacy Servlet</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Legacy Servlet</em>' reference.
   * @see #setLegacyServlet(LegacyServlet)
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getInterface_LegacyServlet()
   * @model
   * @generated
   */
  LegacyServlet getLegacyServlet();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getLegacyServlet <em>Legacy Servlet</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Legacy Servlet</em>' reference.
   * @see #getLegacyServlet()
   * @generated
   */
  void setLegacyServlet(LegacyServlet value);

  /**
   * Returns the value of the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' attribute.
   * @see #setDocumentation(String)
   * @see nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage#getInterface_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.backend.simBackendDsl.Interface#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

} // Interface

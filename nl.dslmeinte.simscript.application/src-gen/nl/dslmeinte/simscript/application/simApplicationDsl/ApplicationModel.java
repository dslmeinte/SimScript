/**
 */
package nl.dslmeinte.simscript.application.simApplicationDsl;

import nl.dslmeinte.simscript.ui.simUiDsl.UiModule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getTitle <em>Title</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getTargetPlatform <em>Target Platform</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getIncludeCSSs <em>Include CS Ss</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#isDefaultCSS <em>Default CSS</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getIncludedModules <em>Included Modules</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getEntryModule <em>Entry Module</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getIncludeCustomJS <em>Include Custom JS</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getCHtmlHead <em>CHtml Head</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getCHtmlBody <em>CHtml Body</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#isGenericBackButtonPrevention <em>Generic Back Button Prevention</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage#getApplicationModel()
 * @model
 * @generated
 */
public interface ApplicationModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage#getApplicationModel_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Target Platform</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.simscript.application.simApplicationDsl.TargetPlatforms}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Platform</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Platform</em>' attribute.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.TargetPlatforms
   * @see #setTargetPlatform(TargetPlatforms)
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage#getApplicationModel_TargetPlatform()
   * @model
   * @generated
   */
  TargetPlatforms getTargetPlatform();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getTargetPlatform <em>Target Platform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Platform</em>' attribute.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.TargetPlatforms
   * @see #getTargetPlatform()
   * @generated
   */
  void setTargetPlatform(TargetPlatforms value);

  /**
   * Returns the value of the '<em><b>Include CS Ss</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include CS Ss</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include CS Ss</em>' attribute list.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage#getApplicationModel_IncludeCSSs()
   * @model unique="false"
   * @generated
   */
  EList<String> getIncludeCSSs();

  /**
   * Returns the value of the '<em><b>Default CSS</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default CSS</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default CSS</em>' attribute.
   * @see #setDefaultCSS(boolean)
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage#getApplicationModel_DefaultCSS()
   * @model
   * @generated
   */
  boolean isDefaultCSS();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#isDefaultCSS <em>Default CSS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default CSS</em>' attribute.
   * @see #isDefaultCSS()
   * @generated
   */
  void setDefaultCSS(boolean value);

  /**
   * Returns the value of the '<em><b>Included Modules</b></em>' reference list.
   * The list contents are of type {@link nl.dslmeinte.simscript.ui.simUiDsl.UiModule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Included Modules</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Included Modules</em>' reference list.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage#getApplicationModel_IncludedModules()
   * @model
   * @generated
   */
  EList<UiModule> getIncludedModules();

  /**
   * Returns the value of the '<em><b>Entry Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry Module</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry Module</em>' reference.
   * @see #setEntryModule(UiModule)
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage#getApplicationModel_EntryModule()
   * @model
   * @generated
   */
  UiModule getEntryModule();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getEntryModule <em>Entry Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry Module</em>' reference.
   * @see #getEntryModule()
   * @generated
   */
  void setEntryModule(UiModule value);

  /**
   * Returns the value of the '<em><b>Include Custom JS</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Include Custom JS</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Include Custom JS</em>' attribute list.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage#getApplicationModel_IncludeCustomJS()
   * @model unique="false"
   * @generated
   */
  EList<String> getIncludeCustomJS();

  /**
   * Returns the value of the '<em><b>CHtml Head</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>CHtml Head</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>CHtml Head</em>' attribute.
   * @see #setCHtmlHead(String)
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage#getApplicationModel_CHtmlHead()
   * @model
   * @generated
   */
  String getCHtmlHead();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getCHtmlHead <em>CHtml Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CHtml Head</em>' attribute.
   * @see #getCHtmlHead()
   * @generated
   */
  void setCHtmlHead(String value);

  /**
   * Returns the value of the '<em><b>CHtml Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>CHtml Body</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>CHtml Body</em>' attribute.
   * @see #setCHtmlBody(String)
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage#getApplicationModel_CHtmlBody()
   * @model
   * @generated
   */
  String getCHtmlBody();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getCHtmlBody <em>CHtml Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CHtml Body</em>' attribute.
   * @see #getCHtmlBody()
   * @generated
   */
  void setCHtmlBody(String value);

  /**
   * Returns the value of the '<em><b>Generic Back Button Prevention</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic Back Button Prevention</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic Back Button Prevention</em>' attribute.
   * @see #setGenericBackButtonPrevention(boolean)
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage#getApplicationModel_GenericBackButtonPrevention()
   * @model
   * @generated
   */
  boolean isGenericBackButtonPrevention();

  /**
   * Sets the value of the '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#isGenericBackButtonPrevention <em>Generic Back Button Prevention</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic Back Button Prevention</em>' attribute.
   * @see #isGenericBackButtonPrevention()
   * @generated
   */
  void setGenericBackButtonPrevention(boolean value);

} // ApplicationModel

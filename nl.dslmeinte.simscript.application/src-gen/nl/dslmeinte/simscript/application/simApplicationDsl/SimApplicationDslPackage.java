/**
 */
package nl.dslmeinte.simscript.application.simApplicationDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslFactory
 * @model kind="package"
 * @generated
 */
public interface SimApplicationDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "simApplicationDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dslconsultancy.com/simscript/application/SimApplicationDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "simApplicationDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimApplicationDslPackage eINSTANCE = nl.dslmeinte.simscript.application.simApplicationDsl.impl.SimApplicationDslPackageImpl.init();

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.application.simApplicationDsl.impl.ApplicationModelImpl <em>Application Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.impl.ApplicationModelImpl
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.impl.SimApplicationDslPackageImpl#getApplicationModel()
   * @generated
   */
  int APPLICATION_MODEL = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__TITLE = 0;

  /**
   * The feature id for the '<em><b>Target Platform</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__TARGET_PLATFORM = 1;

  /**
   * The feature id for the '<em><b>Include CS Ss</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__INCLUDE_CS_SS = 2;

  /**
   * The feature id for the '<em><b>Default CSS</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__DEFAULT_CSS = 3;

  /**
   * The feature id for the '<em><b>Included Modules</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__INCLUDED_MODULES = 4;

  /**
   * The feature id for the '<em><b>Entry Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__ENTRY_MODULE = 5;

  /**
   * The feature id for the '<em><b>Include Custom JS</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__INCLUDE_CUSTOM_JS = 6;

  /**
   * The feature id for the '<em><b>CHtml Head</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__CHTML_HEAD = 7;

  /**
   * The feature id for the '<em><b>CHtml Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__CHTML_BODY = 8;

  /**
   * The feature id for the '<em><b>Generic Back Button Prevention</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL__GENERIC_BACK_BUTTON_PREVENTION = 9;

  /**
   * The number of structural features of the '<em>Application Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MODEL_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link nl.dslmeinte.simscript.application.simApplicationDsl.TargetPlatforms <em>Target Platforms</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.TargetPlatforms
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.impl.SimApplicationDslPackageImpl#getTargetPlatforms()
   * @generated
   */
  int TARGET_PLATFORMS = 1;


  /**
   * Returns the meta object for class '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel <em>Application Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Model</em>'.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel
   * @generated
   */
  EClass getApplicationModel();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getTitle()
   * @see #getApplicationModel()
   * @generated
   */
  EAttribute getApplicationModel_Title();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getTargetPlatform <em>Target Platform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Platform</em>'.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getTargetPlatform()
   * @see #getApplicationModel()
   * @generated
   */
  EAttribute getApplicationModel_TargetPlatform();

  /**
   * Returns the meta object for the attribute list '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getIncludeCSSs <em>Include CS Ss</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Include CS Ss</em>'.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getIncludeCSSs()
   * @see #getApplicationModel()
   * @generated
   */
  EAttribute getApplicationModel_IncludeCSSs();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#isDefaultCSS <em>Default CSS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default CSS</em>'.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#isDefaultCSS()
   * @see #getApplicationModel()
   * @generated
   */
  EAttribute getApplicationModel_DefaultCSS();

  /**
   * Returns the meta object for the reference list '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getIncludedModules <em>Included Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Included Modules</em>'.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getIncludedModules()
   * @see #getApplicationModel()
   * @generated
   */
  EReference getApplicationModel_IncludedModules();

  /**
   * Returns the meta object for the reference '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getEntryModule <em>Entry Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entry Module</em>'.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getEntryModule()
   * @see #getApplicationModel()
   * @generated
   */
  EReference getApplicationModel_EntryModule();

  /**
   * Returns the meta object for the attribute list '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getIncludeCustomJS <em>Include Custom JS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Include Custom JS</em>'.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getIncludeCustomJS()
   * @see #getApplicationModel()
   * @generated
   */
  EAttribute getApplicationModel_IncludeCustomJS();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getCHtmlHead <em>CHtml Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>CHtml Head</em>'.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getCHtmlHead()
   * @see #getApplicationModel()
   * @generated
   */
  EAttribute getApplicationModel_CHtmlHead();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getCHtmlBody <em>CHtml Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>CHtml Body</em>'.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#getCHtmlBody()
   * @see #getApplicationModel()
   * @generated
   */
  EAttribute getApplicationModel_CHtmlBody();

  /**
   * Returns the meta object for the attribute '{@link nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#isGenericBackButtonPrevention <em>Generic Back Button Prevention</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generic Back Button Prevention</em>'.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel#isGenericBackButtonPrevention()
   * @see #getApplicationModel()
   * @generated
   */
  EAttribute getApplicationModel_GenericBackButtonPrevention();

  /**
   * Returns the meta object for enum '{@link nl.dslmeinte.simscript.application.simApplicationDsl.TargetPlatforms <em>Target Platforms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Target Platforms</em>'.
   * @see nl.dslmeinte.simscript.application.simApplicationDsl.TargetPlatforms
   * @generated
   */
  EEnum getTargetPlatforms();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimApplicationDslFactory getSimApplicationDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.application.simApplicationDsl.impl.ApplicationModelImpl <em>Application Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.application.simApplicationDsl.impl.ApplicationModelImpl
     * @see nl.dslmeinte.simscript.application.simApplicationDsl.impl.SimApplicationDslPackageImpl#getApplicationModel()
     * @generated
     */
    EClass APPLICATION_MODEL = eINSTANCE.getApplicationModel();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MODEL__TITLE = eINSTANCE.getApplicationModel_Title();

    /**
     * The meta object literal for the '<em><b>Target Platform</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MODEL__TARGET_PLATFORM = eINSTANCE.getApplicationModel_TargetPlatform();

    /**
     * The meta object literal for the '<em><b>Include CS Ss</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MODEL__INCLUDE_CS_SS = eINSTANCE.getApplicationModel_IncludeCSSs();

    /**
     * The meta object literal for the '<em><b>Default CSS</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MODEL__DEFAULT_CSS = eINSTANCE.getApplicationModel_DefaultCSS();

    /**
     * The meta object literal for the '<em><b>Included Modules</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_MODEL__INCLUDED_MODULES = eINSTANCE.getApplicationModel_IncludedModules();

    /**
     * The meta object literal for the '<em><b>Entry Module</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_MODEL__ENTRY_MODULE = eINSTANCE.getApplicationModel_EntryModule();

    /**
     * The meta object literal for the '<em><b>Include Custom JS</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MODEL__INCLUDE_CUSTOM_JS = eINSTANCE.getApplicationModel_IncludeCustomJS();

    /**
     * The meta object literal for the '<em><b>CHtml Head</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MODEL__CHTML_HEAD = eINSTANCE.getApplicationModel_CHtmlHead();

    /**
     * The meta object literal for the '<em><b>CHtml Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MODEL__CHTML_BODY = eINSTANCE.getApplicationModel_CHtmlBody();

    /**
     * The meta object literal for the '<em><b>Generic Back Button Prevention</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MODEL__GENERIC_BACK_BUTTON_PREVENTION = eINSTANCE.getApplicationModel_GenericBackButtonPrevention();

    /**
     * The meta object literal for the '{@link nl.dslmeinte.simscript.application.simApplicationDsl.TargetPlatforms <em>Target Platforms</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.dslmeinte.simscript.application.simApplicationDsl.TargetPlatforms
     * @see nl.dslmeinte.simscript.application.simApplicationDsl.impl.SimApplicationDslPackageImpl#getTargetPlatforms()
     * @generated
     */
    EEnum TARGET_PLATFORMS = eINSTANCE.getTargetPlatforms();

  }

} //SimApplicationDslPackage

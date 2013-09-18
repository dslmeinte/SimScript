/**
 */
package nl.dslmeinte.simscript.application.simApplicationDsl.impl;

import java.util.Collection;

import nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel;
import nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage;
import nl.dslmeinte.simscript.application.simApplicationDsl.TargetPlatforms;

import nl.dslmeinte.simscript.ui.simUiDsl.UiModule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.impl.ApplicationModelImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.impl.ApplicationModelImpl#getTargetPlatform <em>Target Platform</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.impl.ApplicationModelImpl#getIncludeCSSs <em>Include CS Ss</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.impl.ApplicationModelImpl#isDefaultCSS <em>Default CSS</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.impl.ApplicationModelImpl#getIncludedModules <em>Included Modules</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.impl.ApplicationModelImpl#getEntryModule <em>Entry Module</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.impl.ApplicationModelImpl#getIncludeCustomJS <em>Include Custom JS</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.impl.ApplicationModelImpl#getCHtmlHead <em>CHtml Head</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.impl.ApplicationModelImpl#getCHtmlBody <em>CHtml Body</em>}</li>
 *   <li>{@link nl.dslmeinte.simscript.application.simApplicationDsl.impl.ApplicationModelImpl#isGenericBackButtonPrevention <em>Generic Back Button Prevention</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationModelImpl extends MinimalEObjectImpl.Container implements ApplicationModel
{
  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetPlatform() <em>Target Platform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetPlatform()
   * @generated
   * @ordered
   */
  protected static final TargetPlatforms TARGET_PLATFORM_EDEFAULT = TargetPlatforms.HTML5;

  /**
   * The cached value of the '{@link #getTargetPlatform() <em>Target Platform</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetPlatform()
   * @generated
   * @ordered
   */
  protected TargetPlatforms targetPlatform = TARGET_PLATFORM_EDEFAULT;

  /**
   * The cached value of the '{@link #getIncludeCSSs() <em>Include CS Ss</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeCSSs()
   * @generated
   * @ordered
   */
  protected EList<String> includeCSSs;

  /**
   * The default value of the '{@link #isDefaultCSS() <em>Default CSS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDefaultCSS()
   * @generated
   * @ordered
   */
  protected static final boolean DEFAULT_CSS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDefaultCSS() <em>Default CSS</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDefaultCSS()
   * @generated
   * @ordered
   */
  protected boolean defaultCSS = DEFAULT_CSS_EDEFAULT;

  /**
   * The cached value of the '{@link #getIncludedModules() <em>Included Modules</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludedModules()
   * @generated
   * @ordered
   */
  protected EList<UiModule> includedModules;

  /**
   * The cached value of the '{@link #getEntryModule() <em>Entry Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryModule()
   * @generated
   * @ordered
   */
  protected UiModule entryModule;

  /**
   * The cached value of the '{@link #getIncludeCustomJS() <em>Include Custom JS</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeCustomJS()
   * @generated
   * @ordered
   */
  protected EList<String> includeCustomJS;

  /**
   * The default value of the '{@link #getCHtmlHead() <em>CHtml Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCHtmlHead()
   * @generated
   * @ordered
   */
  protected static final String CHTML_HEAD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCHtmlHead() <em>CHtml Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCHtmlHead()
   * @generated
   * @ordered
   */
  protected String cHtmlHead = CHTML_HEAD_EDEFAULT;

  /**
   * The default value of the '{@link #getCHtmlBody() <em>CHtml Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCHtmlBody()
   * @generated
   * @ordered
   */
  protected static final String CHTML_BODY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCHtmlBody() <em>CHtml Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCHtmlBody()
   * @generated
   * @ordered
   */
  protected String cHtmlBody = CHTML_BODY_EDEFAULT;

  /**
   * The default value of the '{@link #isGenericBackButtonPrevention() <em>Generic Back Button Prevention</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGenericBackButtonPrevention()
   * @generated
   * @ordered
   */
  protected static final boolean GENERIC_BACK_BUTTON_PREVENTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGenericBackButtonPrevention() <em>Generic Back Button Prevention</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGenericBackButtonPrevention()
   * @generated
   * @ordered
   */
  protected boolean genericBackButtonPrevention = GENERIC_BACK_BUTTON_PREVENTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationModelImpl()
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
    return SimApplicationDslPackage.Literals.APPLICATION_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimApplicationDslPackage.APPLICATION_MODEL__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetPlatforms getTargetPlatform()
  {
    return targetPlatform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetPlatform(TargetPlatforms newTargetPlatform)
  {
    TargetPlatforms oldTargetPlatform = targetPlatform;
    targetPlatform = newTargetPlatform == null ? TARGET_PLATFORM_EDEFAULT : newTargetPlatform;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimApplicationDslPackage.APPLICATION_MODEL__TARGET_PLATFORM, oldTargetPlatform, targetPlatform));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIncludeCSSs()
  {
    if (includeCSSs == null)
    {
      includeCSSs = new EDataTypeEList<String>(String.class, this, SimApplicationDslPackage.APPLICATION_MODEL__INCLUDE_CS_SS);
    }
    return includeCSSs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDefaultCSS()
  {
    return defaultCSS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultCSS(boolean newDefaultCSS)
  {
    boolean oldDefaultCSS = defaultCSS;
    defaultCSS = newDefaultCSS;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimApplicationDslPackage.APPLICATION_MODEL__DEFAULT_CSS, oldDefaultCSS, defaultCSS));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UiModule> getIncludedModules()
  {
    if (includedModules == null)
    {
      includedModules = new EObjectResolvingEList<UiModule>(UiModule.class, this, SimApplicationDslPackage.APPLICATION_MODEL__INCLUDED_MODULES);
    }
    return includedModules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UiModule getEntryModule()
  {
    if (entryModule != null && entryModule.eIsProxy())
    {
      InternalEObject oldEntryModule = (InternalEObject)entryModule;
      entryModule = (UiModule)eResolveProxy(oldEntryModule);
      if (entryModule != oldEntryModule)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimApplicationDslPackage.APPLICATION_MODEL__ENTRY_MODULE, oldEntryModule, entryModule));
      }
    }
    return entryModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UiModule basicGetEntryModule()
  {
    return entryModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntryModule(UiModule newEntryModule)
  {
    UiModule oldEntryModule = entryModule;
    entryModule = newEntryModule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimApplicationDslPackage.APPLICATION_MODEL__ENTRY_MODULE, oldEntryModule, entryModule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIncludeCustomJS()
  {
    if (includeCustomJS == null)
    {
      includeCustomJS = new EDataTypeEList<String>(String.class, this, SimApplicationDslPackage.APPLICATION_MODEL__INCLUDE_CUSTOM_JS);
    }
    return includeCustomJS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCHtmlHead()
  {
    return cHtmlHead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCHtmlHead(String newCHtmlHead)
  {
    String oldCHtmlHead = cHtmlHead;
    cHtmlHead = newCHtmlHead;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimApplicationDslPackage.APPLICATION_MODEL__CHTML_HEAD, oldCHtmlHead, cHtmlHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCHtmlBody()
  {
    return cHtmlBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCHtmlBody(String newCHtmlBody)
  {
    String oldCHtmlBody = cHtmlBody;
    cHtmlBody = newCHtmlBody;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimApplicationDslPackage.APPLICATION_MODEL__CHTML_BODY, oldCHtmlBody, cHtmlBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGenericBackButtonPrevention()
  {
    return genericBackButtonPrevention;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenericBackButtonPrevention(boolean newGenericBackButtonPrevention)
  {
    boolean oldGenericBackButtonPrevention = genericBackButtonPrevention;
    genericBackButtonPrevention = newGenericBackButtonPrevention;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimApplicationDslPackage.APPLICATION_MODEL__GENERIC_BACK_BUTTON_PREVENTION, oldGenericBackButtonPrevention, genericBackButtonPrevention));
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
      case SimApplicationDslPackage.APPLICATION_MODEL__TITLE:
        return getTitle();
      case SimApplicationDslPackage.APPLICATION_MODEL__TARGET_PLATFORM:
        return getTargetPlatform();
      case SimApplicationDslPackage.APPLICATION_MODEL__INCLUDE_CS_SS:
        return getIncludeCSSs();
      case SimApplicationDslPackage.APPLICATION_MODEL__DEFAULT_CSS:
        return isDefaultCSS();
      case SimApplicationDslPackage.APPLICATION_MODEL__INCLUDED_MODULES:
        return getIncludedModules();
      case SimApplicationDslPackage.APPLICATION_MODEL__ENTRY_MODULE:
        if (resolve) return getEntryModule();
        return basicGetEntryModule();
      case SimApplicationDslPackage.APPLICATION_MODEL__INCLUDE_CUSTOM_JS:
        return getIncludeCustomJS();
      case SimApplicationDslPackage.APPLICATION_MODEL__CHTML_HEAD:
        return getCHtmlHead();
      case SimApplicationDslPackage.APPLICATION_MODEL__CHTML_BODY:
        return getCHtmlBody();
      case SimApplicationDslPackage.APPLICATION_MODEL__GENERIC_BACK_BUTTON_PREVENTION:
        return isGenericBackButtonPrevention();
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
      case SimApplicationDslPackage.APPLICATION_MODEL__TITLE:
        setTitle((String)newValue);
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__TARGET_PLATFORM:
        setTargetPlatform((TargetPlatforms)newValue);
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__INCLUDE_CS_SS:
        getIncludeCSSs().clear();
        getIncludeCSSs().addAll((Collection<? extends String>)newValue);
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__DEFAULT_CSS:
        setDefaultCSS((Boolean)newValue);
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__INCLUDED_MODULES:
        getIncludedModules().clear();
        getIncludedModules().addAll((Collection<? extends UiModule>)newValue);
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__ENTRY_MODULE:
        setEntryModule((UiModule)newValue);
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__INCLUDE_CUSTOM_JS:
        getIncludeCustomJS().clear();
        getIncludeCustomJS().addAll((Collection<? extends String>)newValue);
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__CHTML_HEAD:
        setCHtmlHead((String)newValue);
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__CHTML_BODY:
        setCHtmlBody((String)newValue);
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__GENERIC_BACK_BUTTON_PREVENTION:
        setGenericBackButtonPrevention((Boolean)newValue);
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
      case SimApplicationDslPackage.APPLICATION_MODEL__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__TARGET_PLATFORM:
        setTargetPlatform(TARGET_PLATFORM_EDEFAULT);
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__INCLUDE_CS_SS:
        getIncludeCSSs().clear();
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__DEFAULT_CSS:
        setDefaultCSS(DEFAULT_CSS_EDEFAULT);
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__INCLUDED_MODULES:
        getIncludedModules().clear();
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__ENTRY_MODULE:
        setEntryModule((UiModule)null);
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__INCLUDE_CUSTOM_JS:
        getIncludeCustomJS().clear();
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__CHTML_HEAD:
        setCHtmlHead(CHTML_HEAD_EDEFAULT);
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__CHTML_BODY:
        setCHtmlBody(CHTML_BODY_EDEFAULT);
        return;
      case SimApplicationDslPackage.APPLICATION_MODEL__GENERIC_BACK_BUTTON_PREVENTION:
        setGenericBackButtonPrevention(GENERIC_BACK_BUTTON_PREVENTION_EDEFAULT);
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
      case SimApplicationDslPackage.APPLICATION_MODEL__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case SimApplicationDslPackage.APPLICATION_MODEL__TARGET_PLATFORM:
        return targetPlatform != TARGET_PLATFORM_EDEFAULT;
      case SimApplicationDslPackage.APPLICATION_MODEL__INCLUDE_CS_SS:
        return includeCSSs != null && !includeCSSs.isEmpty();
      case SimApplicationDslPackage.APPLICATION_MODEL__DEFAULT_CSS:
        return defaultCSS != DEFAULT_CSS_EDEFAULT;
      case SimApplicationDslPackage.APPLICATION_MODEL__INCLUDED_MODULES:
        return includedModules != null && !includedModules.isEmpty();
      case SimApplicationDslPackage.APPLICATION_MODEL__ENTRY_MODULE:
        return entryModule != null;
      case SimApplicationDslPackage.APPLICATION_MODEL__INCLUDE_CUSTOM_JS:
        return includeCustomJS != null && !includeCustomJS.isEmpty();
      case SimApplicationDslPackage.APPLICATION_MODEL__CHTML_HEAD:
        return CHTML_HEAD_EDEFAULT == null ? cHtmlHead != null : !CHTML_HEAD_EDEFAULT.equals(cHtmlHead);
      case SimApplicationDslPackage.APPLICATION_MODEL__CHTML_BODY:
        return CHTML_BODY_EDEFAULT == null ? cHtmlBody != null : !CHTML_BODY_EDEFAULT.equals(cHtmlBody);
      case SimApplicationDslPackage.APPLICATION_MODEL__GENERIC_BACK_BUTTON_PREVENTION:
        return genericBackButtonPrevention != GENERIC_BACK_BUTTON_PREVENTION_EDEFAULT;
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
    result.append(" (title: ");
    result.append(title);
    result.append(", targetPlatform: ");
    result.append(targetPlatform);
    result.append(", includeCSSs: ");
    result.append(includeCSSs);
    result.append(", defaultCSS: ");
    result.append(defaultCSS);
    result.append(", includeCustomJS: ");
    result.append(includeCustomJS);
    result.append(", cHtmlHead: ");
    result.append(cHtmlHead);
    result.append(", cHtmlBody: ");
    result.append(cHtmlBody);
    result.append(", genericBackButtonPrevention: ");
    result.append(genericBackButtonPrevention);
    result.append(')');
    return result.toString();
  }

} //ApplicationModelImpl

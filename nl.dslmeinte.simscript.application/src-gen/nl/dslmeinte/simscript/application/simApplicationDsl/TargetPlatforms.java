/**
 */
package nl.dslmeinte.simscript.application.simApplicationDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Target Platforms</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage#getTargetPlatforms()
 * @model
 * @generated
 */
public enum TargetPlatforms implements Enumerator
{
  /**
   * The '<em><b>Html5</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HTML5_VALUE
   * @generated
   * @ordered
   */
  HTML5(0, "html5", "html5"),

  /**
   * The '<em><b>Facebook</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FACEBOOK_VALUE
   * @generated
   * @ordered
   */
  FACEBOOK(1, "facebook", "facebook"),

  /**
   * The '<em><b>Mobile</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOBILE_VALUE
   * @generated
   * @ordered
   */
  MOBILE(2, "mobile", "mobile");

  /**
   * The '<em><b>Html5</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Html5</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HTML5
   * @model name="html5"
   * @generated
   * @ordered
   */
  public static final int HTML5_VALUE = 0;

  /**
   * The '<em><b>Facebook</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Facebook</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FACEBOOK
   * @model name="facebook"
   * @generated
   * @ordered
   */
  public static final int FACEBOOK_VALUE = 1;

  /**
   * The '<em><b>Mobile</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Mobile</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MOBILE
   * @model name="mobile"
   * @generated
   * @ordered
   */
  public static final int MOBILE_VALUE = 2;

  /**
   * An array of all the '<em><b>Target Platforms</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TargetPlatforms[] VALUES_ARRAY =
    new TargetPlatforms[]
    {
      HTML5,
      FACEBOOK,
      MOBILE,
    };

  /**
   * A public read-only list of all the '<em><b>Target Platforms</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TargetPlatforms> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Target Platforms</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TargetPlatforms get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TargetPlatforms result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Target Platforms</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TargetPlatforms getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TargetPlatforms result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Target Platforms</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TargetPlatforms get(int value)
  {
    switch (value)
    {
      case HTML5_VALUE: return HTML5;
      case FACEBOOK_VALUE: return FACEBOOK;
      case MOBILE_VALUE: return MOBILE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private TargetPlatforms(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //TargetPlatforms

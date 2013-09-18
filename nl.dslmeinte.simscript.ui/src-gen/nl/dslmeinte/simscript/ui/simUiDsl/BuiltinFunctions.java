/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Builtin Functions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getBuiltinFunctions()
 * @model
 * @generated
 */
public enum BuiltinFunctions implements Enumerator
{
  /**
   * The '<em><b>Is Set</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IS_SET_VALUE
   * @generated
   * @ordered
   */
  IS_SET(0, "isSet", "isSet"),

  /**
   * The '<em><b>Alert</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALERT_VALUE
   * @generated
   * @ordered
   */
  ALERT(1, "alert", "alert"),

  /**
   * The '<em><b>Confirm</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONFIRM_VALUE
   * @generated
   * @ordered
   */
  CONFIRM(2, "confirm", "confirm"),

  /**
   * The '<em><b>Copy Of</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COPY_OF_VALUE
   * @generated
   * @ordered
   */
  COPY_OF(3, "copyOf", "copyOf"),

  /**
   * The '<em><b>To Millis</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TO_MILLIS_VALUE
   * @generated
   * @ordered
   */
  TO_MILLIS(4, "toMillis", "toMillis"),

  /**
   * The '<em><b>Round</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROUND_VALUE
   * @generated
   * @ordered
   */
  ROUND(5, "round", "round"),

  /**
   * The '<em><b>Sort</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SORT_VALUE
   * @generated
   * @ordered
   */
  SORT(6, "sort", "sort"),

  /**
   * The '<em><b>Is Valid</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IS_VALID_VALUE
   * @generated
   * @ordered
   */
  IS_VALID(7, "isValid", "isValid"),

  /**
   * The '<em><b>Id</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ID_VALUE
   * @generated
   * @ordered
   */
  ID(8, "id", "id");

  /**
   * The '<em><b>Is Set</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Is Set</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IS_SET
   * @model name="isSet"
   * @generated
   * @ordered
   */
  public static final int IS_SET_VALUE = 0;

  /**
   * The '<em><b>Alert</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Alert</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALERT
   * @model name="alert"
   * @generated
   * @ordered
   */
  public static final int ALERT_VALUE = 1;

  /**
   * The '<em><b>Confirm</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Confirm</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONFIRM
   * @model name="confirm"
   * @generated
   * @ordered
   */
  public static final int CONFIRM_VALUE = 2;

  /**
   * The '<em><b>Copy Of</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Copy Of</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COPY_OF
   * @model name="copyOf"
   * @generated
   * @ordered
   */
  public static final int COPY_OF_VALUE = 3;

  /**
   * The '<em><b>To Millis</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>To Millis</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TO_MILLIS
   * @model name="toMillis"
   * @generated
   * @ordered
   */
  public static final int TO_MILLIS_VALUE = 4;

  /**
   * The '<em><b>Round</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Round</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROUND
   * @model name="round"
   * @generated
   * @ordered
   */
  public static final int ROUND_VALUE = 5;

  /**
   * The '<em><b>Sort</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sort</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SORT
   * @model name="sort"
   * @generated
   * @ordered
   */
  public static final int SORT_VALUE = 6;

  /**
   * The '<em><b>Is Valid</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Is Valid</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IS_VALID
   * @model name="isValid"
   * @generated
   * @ordered
   */
  public static final int IS_VALID_VALUE = 7;

  /**
   * The '<em><b>Id</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Id</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ID
   * @model name="id"
   * @generated
   * @ordered
   */
  public static final int ID_VALUE = 8;

  /**
   * An array of all the '<em><b>Builtin Functions</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BuiltinFunctions[] VALUES_ARRAY =
    new BuiltinFunctions[]
    {
      IS_SET,
      ALERT,
      CONFIRM,
      COPY_OF,
      TO_MILLIS,
      ROUND,
      SORT,
      IS_VALID,
      ID,
    };

  /**
   * A public read-only list of all the '<em><b>Builtin Functions</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BuiltinFunctions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Builtin Functions</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuiltinFunctions get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BuiltinFunctions result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Builtin Functions</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuiltinFunctions getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BuiltinFunctions result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Builtin Functions</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuiltinFunctions get(int value)
  {
    switch (value)
    {
      case IS_SET_VALUE: return IS_SET;
      case ALERT_VALUE: return ALERT;
      case CONFIRM_VALUE: return CONFIRM;
      case COPY_OF_VALUE: return COPY_OF;
      case TO_MILLIS_VALUE: return TO_MILLIS;
      case ROUND_VALUE: return ROUND;
      case SORT_VALUE: return SORT;
      case IS_VALID_VALUE: return IS_VALID;
      case ID_VALUE: return ID;
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
  private BuiltinFunctions(int value, String name, String literal)
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
  
} //BuiltinFunctions

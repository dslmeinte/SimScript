/**
 */
package nl.dslmeinte.simscript.structure.structureDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Builtin Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage#getBuiltinTypes()
 * @model
 * @generated
 */
public enum BuiltinTypes implements Enumerator
{
  /**
   * The '<em><b>String</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(0, "string", "String"),

  /**
   * The '<em><b>Boolean</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN_VALUE
   * @generated
   * @ordered
   */
  BOOLEAN(1, "boolean", "Boolean"),

  /**
   * The '<em><b>Integer</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGER_VALUE
   * @generated
   * @ordered
   */
  INTEGER(2, "integer", "Integer"),

  /**
   * The '<em><b>Url</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #URL_VALUE
   * @generated
   * @ordered
   */
  URL(3, "url", "URL"),

  /**
   * The '<em><b>Text</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TEXT_VALUE
   * @generated
   * @ordered
   */
  TEXT(4, "text", "Text"),

  /**
   * The '<em><b>Number</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUMBER_VALUE
   * @generated
   * @ordered
   */
  NUMBER(5, "number", "Number"),

  /**
   * The '<em><b>Email</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EMAIL_VALUE
   * @generated
   * @ordered
   */
  EMAIL(6, "email", "Email"),

  /**
   * The '<em><b>Phone</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PHONE_VALUE
   * @generated
   * @ordered
   */
  PHONE(7, "phone", "Phone"),

  /**
   * The '<em><b>Date</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATE_VALUE
   * @generated
   * @ordered
   */
  DATE(8, "date", "Date"),

  /**
   * The '<em><b>Password</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PASSWORD_VALUE
   * @generated
   * @ordered
   */
  PASSWORD(9, "password", "Password");

  /**
   * The '<em><b>String</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model name="string" literal="String"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 0;

  /**
   * The '<em><b>Boolean</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOLEAN
   * @model name="boolean" literal="Boolean"
   * @generated
   * @ordered
   */
  public static final int BOOLEAN_VALUE = 1;

  /**
   * The '<em><b>Integer</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTEGER
   * @model name="integer" literal="Integer"
   * @generated
   * @ordered
   */
  public static final int INTEGER_VALUE = 2;

  /**
   * The '<em><b>Url</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Url</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #URL
   * @model name="url" literal="URL"
   * @generated
   * @ordered
   */
  public static final int URL_VALUE = 3;

  /**
   * The '<em><b>Text</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TEXT
   * @model name="text" literal="Text"
   * @generated
   * @ordered
   */
  public static final int TEXT_VALUE = 4;

  /**
   * The '<em><b>Number</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Number</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NUMBER
   * @model name="number" literal="Number"
   * @generated
   * @ordered
   */
  public static final int NUMBER_VALUE = 5;

  /**
   * The '<em><b>Email</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Email</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EMAIL
   * @model name="email" literal="Email"
   * @generated
   * @ordered
   */
  public static final int EMAIL_VALUE = 6;

  /**
   * The '<em><b>Phone</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Phone</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PHONE
   * @model name="phone" literal="Phone"
   * @generated
   * @ordered
   */
  public static final int PHONE_VALUE = 7;

  /**
   * The '<em><b>Date</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATE
   * @model name="date" literal="Date"
   * @generated
   * @ordered
   */
  public static final int DATE_VALUE = 8;

  /**
   * The '<em><b>Password</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Password</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PASSWORD
   * @model name="password" literal="Password"
   * @generated
   * @ordered
   */
  public static final int PASSWORD_VALUE = 9;

  /**
   * An array of all the '<em><b>Builtin Types</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BuiltinTypes[] VALUES_ARRAY =
    new BuiltinTypes[]
    {
      STRING,
      BOOLEAN,
      INTEGER,
      URL,
      TEXT,
      NUMBER,
      EMAIL,
      PHONE,
      DATE,
      PASSWORD,
    };

  /**
   * A public read-only list of all the '<em><b>Builtin Types</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BuiltinTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Builtin Types</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuiltinTypes get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BuiltinTypes result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Builtin Types</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuiltinTypes getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BuiltinTypes result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Builtin Types</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuiltinTypes get(int value)
  {
    switch (value)
    {
      case STRING_VALUE: return STRING;
      case BOOLEAN_VALUE: return BOOLEAN;
      case INTEGER_VALUE: return INTEGER;
      case URL_VALUE: return URL;
      case TEXT_VALUE: return TEXT;
      case NUMBER_VALUE: return NUMBER;
      case EMAIL_VALUE: return EMAIL;
      case PHONE_VALUE: return PHONE;
      case DATE_VALUE: return DATE;
      case PASSWORD_VALUE: return PASSWORD;
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
  private BuiltinTypes(int value, String name, String literal)
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
  
} //BuiltinTypes

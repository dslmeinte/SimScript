/**
 */
package nl.dslmeinte.simscript.ui.simUiDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comparator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage#getComparator()
 * @model
 * @generated
 */
public enum Comparator implements Enumerator
{
  /**
   * The '<em><b>Equals</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQUALS_VALUE
   * @generated
   * @ordered
   */
  EQUALS(0, "equals", "=="),

  /**
   * The '<em><b>Not Equals</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_EQUALS_VALUE
   * @generated
   * @ordered
   */
  NOT_EQUALS(1, "notEquals", "!="),

  /**
   * The '<em><b>Bigger</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIGGER_VALUE
   * @generated
   * @ordered
   */
  BIGGER(2, "bigger", ">"),

  /**
   * The '<em><b>Bigger Equals</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIGGER_EQUALS_VALUE
   * @generated
   * @ordered
   */
  BIGGER_EQUALS(3, "biggerEquals", ">="),

  /**
   * The '<em><b>Smaller</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SMALLER_VALUE
   * @generated
   * @ordered
   */
  SMALLER(4, "smaller", "<"),

  /**
   * The '<em><b>Smaller Equals</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SMALLER_EQUALS_VALUE
   * @generated
   * @ordered
   */
  SMALLER_EQUALS(5, "smallerEquals", "<="),

  /**
   * The '<em><b>Is In</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IS_IN_VALUE
   * @generated
   * @ordered
   */
  IS_IN(6, "isIn", "in");

  /**
   * The '<em><b>Equals</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Equals</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EQUALS
   * @model name="equals" literal="=="
   * @generated
   * @ordered
   */
  public static final int EQUALS_VALUE = 0;

  /**
   * The '<em><b>Not Equals</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Not Equals</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOT_EQUALS
   * @model name="notEquals" literal="!="
   * @generated
   * @ordered
   */
  public static final int NOT_EQUALS_VALUE = 1;

  /**
   * The '<em><b>Bigger</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bigger</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BIGGER
   * @model name="bigger" literal=">"
   * @generated
   * @ordered
   */
  public static final int BIGGER_VALUE = 2;

  /**
   * The '<em><b>Bigger Equals</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Bigger Equals</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BIGGER_EQUALS
   * @model name="biggerEquals" literal=">="
   * @generated
   * @ordered
   */
  public static final int BIGGER_EQUALS_VALUE = 3;

  /**
   * The '<em><b>Smaller</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Smaller</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SMALLER
   * @model name="smaller" literal="<"
   * @generated
   * @ordered
   */
  public static final int SMALLER_VALUE = 4;

  /**
   * The '<em><b>Smaller Equals</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Smaller Equals</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SMALLER_EQUALS
   * @model name="smallerEquals" literal="<="
   * @generated
   * @ordered
   */
  public static final int SMALLER_EQUALS_VALUE = 5;

  /**
   * The '<em><b>Is In</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Is In</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IS_IN
   * @model name="isIn" literal="in"
   * @generated
   * @ordered
   */
  public static final int IS_IN_VALUE = 6;

  /**
   * An array of all the '<em><b>Comparator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Comparator[] VALUES_ARRAY =
    new Comparator[]
    {
      EQUALS,
      NOT_EQUALS,
      BIGGER,
      BIGGER_EQUALS,
      SMALLER,
      SMALLER_EQUALS,
      IS_IN,
    };

  /**
   * A public read-only list of all the '<em><b>Comparator</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Comparator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Comparator</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Comparator get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Comparator result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Comparator</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Comparator getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Comparator result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Comparator</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Comparator get(int value)
  {
    switch (value)
    {
      case EQUALS_VALUE: return EQUALS;
      case NOT_EQUALS_VALUE: return NOT_EQUALS;
      case BIGGER_VALUE: return BIGGER;
      case BIGGER_EQUALS_VALUE: return BIGGER_EQUALS;
      case SMALLER_VALUE: return SMALLER;
      case SMALLER_EQUALS_VALUE: return SMALLER_EQUALS;
      case IS_IN_VALUE: return IS_IN;
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
  private Comparator(int value, String name, String literal)
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
  
} //Comparator

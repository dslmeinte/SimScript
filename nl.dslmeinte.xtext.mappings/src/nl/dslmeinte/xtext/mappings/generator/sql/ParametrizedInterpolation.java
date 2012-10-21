package nl.dslmeinte.xtext.mappings.generator.sql;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Instances of this class hold a string that must be interpolated by
 * use of a suitable format function as well as the arguments to use for that
 * interpolation, in a platform-independent (i.e., Java vs. PHP vs. whatever)
 * manner.
 * 
 * @author Meinte Boersma
 */
public class ParametrizedInterpolation {

	private final StringBuilder text;
	private final List<Object> arguments;

	public ParametrizedInterpolation(CharSequence text, List<Object> arguments) {
		this.text = new StringBuilder(text);
		this.arguments = new ArrayList<Object>(arguments);
	}

	public ParametrizedInterpolation(CharSequence text) {
		this(text, Collections.<Object>emptyList());
	}

	public CharSequence getText() {
		return text;
	}

	public List<Object> getArguments() {
		return Collections.unmodifiableList(arguments);
	}

	/**
	 * Appends two instances - in order.
	 * <p>
	 * The second instance is ignored if it's {@code null}.
	 */
	public ParametrizedInterpolation append(ParametrizedInterpolation otherInstance) {
		if( otherInstance != null ) {
			text.append(otherInstance.text);
			arguments.addAll(otherInstance.arguments);
		}
		return this;	// to enable fluent interfacing
	}

	/**
	 * Appends an instance with plain text.
	 */
	public ParametrizedInterpolation append(CharSequence appendText) {
		text.append(appendText);
		return this;	// to enable fluent interfacing
	}

	public static ParametrizedInterpolation join(List<ParametrizedInterpolation> otherInstances, CharSequence separator) {
		return new ParametrizedInterpolation("").appendJoined(otherInstances, separator);
	}

	public ParametrizedInterpolation appendJoined(List<ParametrizedInterpolation> otherInstances, CharSequence separator) {
		boolean insertSeparator = false;
		for( ParametrizedInterpolation otherInstance : otherInstances ) {
			if( insertSeparator ) {
				text.append(separator);
			}
			text.append(otherInstance.text);
			arguments.addAll(otherInstance.arguments);
			insertSeparator = true;
		}
		return this;	// to enable fluent interfacing
	}

}

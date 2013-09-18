package nl.dslmeinte.simscript.generator.ui.js;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.ImplementedBy;
import nl.dslmeinte.simscript.generator.ui.js.impl.JavaScriptUtilImpl;
import nl.dslmeinte.simscript.structure.structureDsl.Enumeration;
import nl.dslmeinte.simscript.structure.structureDsl.Feature;
import nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral;
import nl.dslmeinte.simscript.ui.simUiDsl.Argument;
import nl.dslmeinte.simscript.ui.simUiDsl.Method;
import nl.dslmeinte.simscript.ui.simUiDsl.Parameter;
import nl.dslmeinte.simscript.ui.simUiDsl.Referable;
import nl.dslmeinte.simscript.ui.simUiDsl.ServiceIdentification;
import nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation;
import nl.dslmeinte.simscript.ui.simUiDsl.Viewable;
import nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite;

@ImplementedBy(JavaScriptUtilImpl.class)
public interface JavaScriptUtil {

	/**
	 * @return Looks up the given {@link Parameter} in the given list of {@link Argument}s.
	 */
	Argument lookupIn(Parameter it, Iterable<Argument> arguments);

	String functionSignature(Iterable<Parameter> parameters,
			Iterable<Argument> arguments);

	String functionSignature(Iterable<Parameter> parameters,
			Iterable<Argument> arguments, CharSequence extraArgument);

	CharSequence invocation(ViewableCallSite it,
			ViewableInvocationTypes invocationType);

	/**
	 * @return A qualified name for the {@link Viewable} which is valid in a
	 *         JavaScript context.
	 */
	CharSequence qualifiedName(Viewable it);

	CharSequence tableRowsInvocation(TableRowsInvocation it);

	String jsName(Referable it);

	CharSequence initJs(Feature<? extends TypeLiteral> it);

	CharSequence notYetImplementedComment();

	CharSequence logProblemAndReturnJSComment(EObject it, CharSequence message);

	CharSequence logProblemAndReturnJSComment(CharSequence message);

	String escapeJS(String str);

	String jsName(Method it);

	CharSequence serviceName(ServiceIdentification it);

	CharSequence asInitJs(TypeLiteral it);

	CharSequence jsFunction(Enumeration it);

}
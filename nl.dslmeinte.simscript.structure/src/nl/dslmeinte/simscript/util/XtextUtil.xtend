package nl.dslmeinte.simscript.util

import com.google.inject.Singleton
import java.util.Set
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.validation.AbstractDeclarativeValidator

/**
 * Util class containing some Xtext niceties for scoping, validation and type
 * calculation.
 * 
 * @author Meinte Boersma
 */
@Singleton
class XtextUtil {

	/**
	 * @return The innermost {@link EObject} of the given type, containing the
	 *         given {@link EObject}.
	 */
	def <T extends EObject> T containerHaving(EObject it, Class<T> type) {
		EcoreUtil2.getContainerOfType(it, type)
	}

	/**
	 * Performs the magic incantation to export the given {@link EObject}
	 * under the given name to the global index.
	 * <p>
	 * To be used in a {@link IDefaultResourceDescriptionStrategy} implementation.
	 */
	def void exportName(EObject it, String name, IAcceptor<IEObjectDescription> acceptor) {
		if( !name.nullOrEmpty ) {	// avoid exceptions in QualifiedName.create because of null-ness
			acceptor.accept(EObjectDescription.create(QualifiedName.create(name), it))
		}
	}


	/**
	 * Raises an error with the given message on the given {@link EObject} (as a
	 * whole). Usage pattern:
	 * <pre>
	 * 	def check_something(Concept it) {
	 * 		it.error("some error message", this);
	 * 	}
	 * </pre>
	 * Note the {@code this} as a 2nd -actually 3rd- argument.
	 * Also, the {@code it.} is optional.
	 */
	def void error(EObject it, CharSequence message, AbstractDeclarativeValidator validator) {
		val node = NodeModelUtils.getNode(it)
		validator.messageAcceptor.acceptError(message.toString, it, node.offset, node.length, null)
	}

	/**
	 * Raises a warning with the given message on the given {@link EObject} (as a
	 * whole). Usage pattern:
	 * <pre>
	 * 	def check_something(Concept it) {
	 * 		it.warning("some warning message", this);
	 * 	}
	 * </pre>
	 * Note the {@code this} as a 2nd -actually 3rd- argument.
	 * Also, the {@code it.} is optional.
	 */
	def void warning(EObject it, CharSequence message, AbstractDeclarativeValidator validator) {
		val node = NodeModelUtils.getNode(it)
		validator.messageAcceptor.acceptWarning(message.toString, it, node.offset, node.length, null)
	}


	/**
	 * Logs the given message on {@link System#err} with some information
	 * on resource + line number of the given {@link EObject}.
	 */
	def void logProblem(EObject it, CharSequence message) {
		var node = NodeModelUtils.findActualNodeFor(it)
		// fallback:
		if( node == null ) {
			node = NodeModelUtils.getNode(it)
		}
		System.err.println('''«message»; location: L«node.totalStartLine» in «eResource.URI»''')
	}

	/**
	 * Logs the given message {@link System#err} with some information
	 * on resource + line number of the given {@link EObject},
	 * together with the (non-fatal) stacktrace.
	 */
	def void logProblemWithStacktrace(EObject it, CharSequence message) {
		logProblem(message)
		new RuntimeException().printStackTrace(System.err)
		System.err.println("(non-fatal stacktrace - ignore first lines ~ methods in XtextUtil)")
	}

	/**
	 * Logs some information on the current scope invocation site.
	 * <p>
	 * To be used inside {@link IScopeProvider} implementations.
	 */
	def logScopeComputation(EObject it, EReference eRef) {
		val node = NodeModelUtils.findActualNodeFor(it)
		println('''computing scope for («eRef.EReferenceType.name»-typed) reference «eRef.EContainingClass.name».«eRef.name» on «eClass.name»-typed context "«node.text»" @ L«node.totalStartLine +1»''')
	}


	/**
	 * Checks whether the given {@link EObject} is an instance of the given type,
	 * and reports that both by logging on {@link System#err} and by throwing an
	 * {@link Exception} to avoid having the latter swallowed, e.g. during scope
	 * computation.
	 */
	def <T extends EObject> checkedCast(EObject it, Class<T> type) {
		if( !(type.isAssignableFrom(^class)) ) {
			val message = "assertion failed / assumption broken: container not of type " + type.simpleName
			logProblemWithStacktrace(message)
			throw new IllegalArgumentException(message)		// might be swallowed during scope computation => log the problem anyway
		}
		type.cast(it)
	}


	/**
	 * (For purposes of post-processing the Xtext-generated Ecore meta model.)
	 */
	def modifyTypeToGeneric(EStructuralFeature feature, EClassifier outerType, EClassifier innerType) {
		val eFactory = EcoreFactory.eINSTANCE
		val genericType = eFactory.createEGenericType
		genericType.EClassifier = outerType
		val typeArgument = eFactory.createEGenericType
		typeArgument.EClassifier = innerType
		genericType.ETypeArguments += typeArgument
		feature.setEType(null)
		feature.setEGenericType(genericType)
	}


	/**
	 * @return The union of all given {@link Set sets}.
	 * (This is useful when using {@code .map[..]}, e.g., since Xtend's overloaded @{code +} doesn't handle this properly.)
	 */
	def <T> union(Iterable<Set<? extends T>> sets) {
		val newSet = <T>newLinkedHashSet
		sets.forEach[ s | newSet.addAll(s) ]
		return newSet as Set<? extends T>
	}

	/**
	 * @return The union of the two given {@link Set sets}.
	 */
	def <T> Set<? extends T> operator_plus(Set<? extends T> set1, Set<? extends T> set2) {
		val newSet = <T>newLinkedHashSet
		newSet.addAll(set1)
		newSet.addAll(set2)
		return newSet
	}

	/**
	 * @returns The file name of the {@link Resource} <em>without</em> the extension.
	 * 
	 * Assumptions:
	 * 1.)	The resource URI has an extension of the form .<[^\.]*>
	 * 	That's not an ASCII art beat-up ghost, it's a regexp.
	 */
	def fileName(Resource it) {
		URI.trimFileExtension.lastSegment
	}

}

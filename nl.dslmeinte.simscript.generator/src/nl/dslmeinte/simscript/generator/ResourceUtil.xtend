package nl.dslmeinte.simscript.generator

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.util.XtextUtil
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

/**
 * All kinds of util functions which are useful for code generation.
 * <p>
 * Typical usage:
 * <pre>
 * @Inject extension GeneratorUtil
 * 
 * ...
 * </pre>
 * 
 * @author Meinte Boersma
 */
@Singleton
class ResourceUtil {

	@Inject extension XtextUtil


	def containingFolder(Resource it) {
		val uriAsString = URI.toString
		if( !properlyLocated ) {
			throw new IllegalArgumentException('''uri '«uriAsString»' does not correspond to a resource in a valid Java source folder'''.toString)
		}
		val path = uriAsString.normalize
		val slashIndex = path.lastIndexOf('/')
		if( slashIndex < 0 ) {
			""
		} else {
			path.substring(0, slashIndex)
		}
	}

	private List<String> validModelFolders = newArrayList("/src/main/java/", "/src/", "/model/")

	/**
	 * @return The normalized version of the URI-as-string w.r.t. the use of Maven.
	 */
	def private normalize(String uriAsString) {
		for( validModelFolder : validModelFolders ) {
			val index = uriAsString.indexOf(validModelFolder)
			if( index > -1 ) {
				return uriAsString.after(validModelFolder)
			}
		}
		throw new IllegalArgumentException()
	}

	/**
	 * @return The part of the given (full) path after the given sub path.
	 * (Note that care is taken w.r.t. trailing slashes.)
	 */
	def private after(String path, String subPath) {
		var modifiedSubPath = subPath
		if( !subPath.endsWith('/') ) {
			modifiedSubPath = modifiedSubPath + "/"
		}
		val index = path.indexOf(modifiedSubPath)
		if( index < 0 ) {
			throw new IllegalArgumentException('''sub path "«modifiedSubPath»" not part of (full) path "«path»"'''.toString)
		}
		path.substring( index + modifiedSubPath.length )
	}

	def isProperlyLocated(Resource it) {
		val uriAsString = URI.toString
		validModelFolders.exists[ path | uriAsString.indexOf(path) >= 0 ]
	}

	def containingPackage(Resource it) {
		containingFolder.replaceAll("/", ".")
	}

	def containingFolder(EObject it) {
		eResource.containingFolder
	}

	def containingPackage(EObject it) {
		eResource.containingPackage
	}

	def asPath(String it) {
		replaceAll("\\.", "/")
	}

	def packageName(EObject it) {
		val pack = it.containingPackage;	// (need ; to avoid ambiguity w.r.t. function call...)

		( if( pack == "" ) "" else ( pack + "." ) ) + eResource.fileName
	}

}

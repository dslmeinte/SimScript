package nl.dslmeinte.simscript.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Dummy {@link IGenerator} implementation to satisfy the {@link AbstractSimScript*DslRuntimeModule}s.
 * <p>
 * <em>Note</em> that {@link SimScriptMultipleResourceGenerator} is actually the generator
 * registered with the Xtext builder participants.
 * 
 * @author Meinte Boersma
 */
class SupersededGenerator implements IGenerator {

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		// do nothing
	}
	
}

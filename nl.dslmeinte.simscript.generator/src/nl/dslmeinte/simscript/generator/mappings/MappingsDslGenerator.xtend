package nl.dslmeinte.simscript.generator.mappings

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.generator.ResourceUtil
import nl.dslmeinte.simscript.mappings.mappingsDsl.BackendTargets
import nl.dslmeinte.simscript.mappings.mappingsDsl.MappingsModel
import nl.dslmeinte.simscript.util.XtextUtil
import org.eclipse.xtext.generator.IFileSystemAccess

@Singleton
class MappingsDslGenerator {

	@Inject extension PhpGenerator
	@Inject extension JavaGenerator

	@Inject extension XtextUtil
	@Inject extension ResourceUtil


	def void generate(MappingsModel model, IFileSystemAccess fsa) {
		// paths are relative to ${project}/src-gen/:
		val phpGenPath = "../httpsdocs/api/gen/"
		val javaGenPath = "../../api/src/gen/java/"

		if( !model.definitions.empty ) {
			switch model.backendTarget {
				case BackendTargets.PHP:	fsa.generateFile(phpGenPath + "mappings_" + model.eResource.fileName + ".php", model.phpFile)
				case BackendTargets.JAVA:	fsa.generateFile(javaGenPath + model.containingPackage.asPath + "/" + model.eResource.fileName.toFirstUpper + "Repository" + ".java", model.javaFile)
				default:					throw new IllegalArgumentException("no generation implemented (yet) for backend target: " + model.backendTarget.literal)
			}
		}
	}

}

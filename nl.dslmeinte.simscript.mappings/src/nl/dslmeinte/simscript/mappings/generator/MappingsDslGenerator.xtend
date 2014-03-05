package nl.dslmeinte.simscript.mappings.generator

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.generator.ResourceUtil
import nl.dslmeinte.simscript.util.XtextUtil
import nl.dslmeinte.simscript.mappings.mappingsDsl.BackendTargets
import nl.dslmeinte.simscript.mappings.mappingsDsl.MappingsModel
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

@Singleton
class MappingsDslGenerator implements IGenerator {

	@Inject extension PhpGenerator
	@Inject extension JavaGenerator

	@Inject extension XtextUtil
	@Inject extension ResourceUtil


	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val model = resource.contents.head as MappingsModel

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

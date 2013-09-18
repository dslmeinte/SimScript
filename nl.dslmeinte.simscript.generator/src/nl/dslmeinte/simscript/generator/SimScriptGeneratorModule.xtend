package nl.dslmeinte.simscript.generator

import nl.dslmeinte.simscript.generator.util.IMultipleResourceGenerator
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.service.AbstractGenericModule

class SimScriptGeneratorModule extends AbstractGenericModule {

	def Class<? extends IGenerator> bindIGenerator() {
		typeof(SupersededGenerator)
	}

	def Class<? extends IMultipleResourceGenerator> bindIMultipleResourceGenerator() {
        typeof(SimScriptMultipleResourceGenerator)
    }

}

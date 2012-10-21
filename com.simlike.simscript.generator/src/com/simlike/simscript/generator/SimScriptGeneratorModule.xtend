package com.simlike.simscript.generator

import com.simlike.simscript.generator.util.IMultipleResourceGenerator
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

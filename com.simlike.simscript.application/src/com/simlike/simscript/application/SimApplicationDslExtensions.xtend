package com.simlike.simscript.application

import com.google.inject.Inject
import com.google.inject.Singleton
import com.simlike.simscript.application.simApplicationDsl.ApplicationModel
import com.simlike.simscript.ui.extensions.StructuralExtensions
import com.simlike.simscript.util.XtextUtil

@Singleton
class SimApplicationDslExtensions {

	@Inject extension StructuralExtensions
	@Inject extension XtextUtil


	def allReferredModules(ApplicationModel it) {
		includedModules.map[ m | m.allReferredModules ].flatten.sortBy[it.name]
	}

	def name(ApplicationModel it) {
		eResource.fileName
	}

}

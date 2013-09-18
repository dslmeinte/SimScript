package nl.dslmeinte.simscript.application

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel
import nl.dslmeinte.simscript.ui.extensions.StructuralExtensions
import nl.dslmeinte.simscript.util.XtextUtil

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

package com.simlike.simscript.backend

import com.google.inject.Inject
import com.google.inject.Singleton
import com.simlike.simscript.backend.simBackendDsl.BackendModel
import com.simlike.simscript.backend.simBackendDsl.CrudService
import com.simlike.simscript.backend.simBackendDsl.Flavors
import com.simlike.simscript.backend.simBackendDsl.Interface
import com.simlike.simscript.backend.simBackendDsl.LegacyServlet
import com.simlike.simscript.backend.simBackendDsl.Service
import com.simlike.simscript.structure.structureDsl.TypeLiteral
import com.simlike.simscript.structure.types.TypeExtensions

@Singleton
class SimBackendDslExtensions {

	@Inject extension TypeExtensions

	def interfaces(BackendModel it) {
		declarations.filter(typeof(Interface))
	}

	def legacyServlets(BackendModel it) {
		declarations.filter(typeof(LegacyServlet))
	}

	def crudServices(BackendModel it) {
		declarations.filter(typeof(CrudService))
	}

	def isCorrectlyTypedOutput(TypeLiteral it) {
		switch it {
			case structureTyped: 							true
			case listTyped && listItemType.structureTyped:	true
			default:										false
		}
	}

	def effectiveOutputType(TypeLiteral it) {
		switch it {
			case structureTyped:							structure
			case listTyped && listItemType.structureTyped:	listItemType.structure
			default:										null
		}
	}

	/**
	 * @return The URL for this {@link NamedService}.
	 */
	def dispatch url(LegacyServlet it)	{ urlPattern }
	def dispatch url(Interface it) {
		if( legacyServlet == null ) {
			name
		} else {
			legacyServlet.urlPattern.substring(1)	// remove leading slash (maybe do this in a value converter?)
		}
	}

	// TODO  come up with a way to generically define the URL for a CRUD service as well


	def baseUrl(Service it) {
		val model = eContainer as BackendModel
		if( !model.baseUrl.nullOrEmpty ) {
			model.baseUrl
		} else {
			"http://fb.simlike.com/api/"
		}
	}

	def suffix(Interface it) {
		val model = eContainer as BackendModel
		if( model.flavor == Flavors::PHP ) {
			".php"
		} else {
			""
		}
	}

}

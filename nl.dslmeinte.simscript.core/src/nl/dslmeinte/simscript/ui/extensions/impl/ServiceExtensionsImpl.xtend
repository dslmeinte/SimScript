package nl.dslmeinte.simscript.ui.extensions.impl

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.backend.simBackendDsl.CrudService
import nl.dslmeinte.simscript.backend.simBackendDsl.CrudServiceIdentification
import nl.dslmeinte.simscript.backend.simBackendDsl.CrudTypes
import nl.dslmeinte.simscript.backend.simBackendDsl.Interface
import nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet
import nl.dslmeinte.simscript.backend.simBackendDsl.NamedService
import nl.dslmeinte.simscript.backend.simBackendDsl.NamedServiceReference
import nl.dslmeinte.simscript.backend.simBackendDsl.Service
import nl.dslmeinte.simscript.backend.simBackendDsl.ServiceIdentification
import nl.dslmeinte.simscript.types.BuiltinTypes
import nl.dslmeinte.simscript.types.TypeExtensions
import nl.dslmeinte.simscript.types.TypeLiteral
import nl.dslmeinte.simscript.ui.extensions.ServiceExtensions

@Singleton
class ServiceExtensionsImpl implements ServiceExtensions {

	@Inject extension TypeExtensions


	override TypeLiteral inputType(ServiceIdentification it) {
		inputType_
	}

	def private dispatch TypeLiteral inputType_(NamedServiceReference it) {
		switch s: it.service {
			Interface:		s.inputType
			LegacyServlet:	null
		}
	}

	def private dispatch TypeLiteral inputType_(CrudServiceIdentification it) {
		switch crudType {
			case CrudTypes.CREATE: 	structure.createDefinedTypeLiteral
			case CrudTypes.UPDATE: 	structure.createDefinedTypeLiteral
			case CrudTypes.DELETE: 	structure.createDefinedTypeLiteral
			case CrudTypes.GET_BY_ID:	BuiltinTypes.INTEGER.createBuiltinTypeLiteral
		}
	}


	override returnType(ServiceIdentification it) {
		returnType_
	}

	def private dispatch returnType_(NamedServiceReference it) {
		switch s: it.service {
			Interface:		s.outputType
			LegacyServlet:	null	// uncomputable type
		}
	}

	def private dispatch returnType_(CrudServiceIdentification it) {
		switch crudType {
			case CrudTypes.CREATE:		createVoidLiteral
			case CrudTypes.DELETE:		createVoidLiteral
			case CrudTypes.GET_BY_ID:	structure.createDefinedTypeLiteral
			case CrudTypes.UPDATE:		createVoidLiteral
		}
	}


	override isInterface(ServiceIdentification it) {
		it instanceof NamedServiceReference && (it as NamedServiceReference).service instanceof Interface
	}

	override isLegacyServlet(ServiceIdentification it) {
		it instanceof NamedServiceReference && (it as NamedServiceReference).service instanceof LegacyServlet
	}

	override String nameForSorting(Service it) {
		val name = switch it {
			case null:		'null'
			NamedService:	name
			CrudService:	structure.name
			default:		throw new IllegalArgumentException('''can't handle sub type «^class.name» of «typeof(Service).name»''')
		}
		if( name === null ) {
			println("Service name is null")
		}
		name
	}
	
}

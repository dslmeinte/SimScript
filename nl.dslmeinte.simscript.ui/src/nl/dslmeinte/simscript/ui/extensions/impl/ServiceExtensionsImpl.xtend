package nl.dslmeinte.simscript.ui.extensions.impl

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.backend.simBackendDsl.Interface
import nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet
import nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypes
import nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral
import nl.dslmeinte.simscript.structure.types.TypeExtensions
import nl.dslmeinte.simscript.ui.extensions.ServiceExtensions
import nl.dslmeinte.simscript.ui.simUiDsl.CrudServiceIdentification
import nl.dslmeinte.simscript.ui.simUiDsl.CrudTypes
import nl.dslmeinte.simscript.ui.simUiDsl.NamedServiceReference
import nl.dslmeinte.simscript.ui.simUiDsl.ServiceIdentification

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

}

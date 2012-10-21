package nl.dslmeinte.xtext.mappings.extensions

import com.google.inject.Inject
import com.google.inject.Singleton
import com.simlike.simscript.structure.structureDsl.BuiltinTypes
import com.simlike.simscript.structure.types.TypeExtensions
import nl.dslmeinte.xtext.mappings.mappingsDsl.CountQuery
import nl.dslmeinte.xtext.mappings.mappingsDsl.DeleteQuery
import nl.dslmeinte.xtext.mappings.mappingsDsl.InsertQuery
import nl.dslmeinte.xtext.mappings.mappingsDsl.SelectQuery
import nl.dslmeinte.xtext.mappings.mappingsDsl.UpdateQuery

/**
 * Calculates result types of a {@link Query} in terms of a {@link TypeLiteral}
 * from <tt>SimScript-Structure</tt>.
 * 
 * @author Meinte Boersma
 */
@Singleton
class TypeCalculator {

	@Inject extension TypeExtensions

	def dispatch type(CountQuery it) {
		BuiltinTypes::INTEGER.createBuiltinTypeLiteral
	}

	def dispatch type(SelectQuery it) {
		structure.createDefinedTypeLiteral
	}

	def dispatch type(DeleteQuery it) {
		createVoidLiteral
	}

	def dispatch type(InsertQuery it) {
		//returnAutoIncrementColumn
		BuiltinTypes::INTEGER.createBuiltinTypeLiteral
	}

	def dispatch type(UpdateQuery it) {
		createVoidLiteral
	}

}

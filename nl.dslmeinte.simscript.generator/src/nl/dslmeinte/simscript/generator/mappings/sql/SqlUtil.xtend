package nl.dslmeinte.simscript.generator.mappings.sql

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.extensions.SimpleDbExtensions
import nl.dslmeinte.simscript.mappings.mappingsDsl.AllColumnsExpression
import nl.dslmeinte.simscript.mappings.mappingsDsl.ColumnsSpecification
import nl.dslmeinte.simscript.mappings.mappingsDsl.LeftRangeDelimiters
import nl.dslmeinte.simscript.mappings.mappingsDsl.OrderClause
import nl.dslmeinte.simscript.mappings.mappingsDsl.RightRangeDelimiters
import nl.dslmeinte.simscript.mappings.mappingsDsl.ToDbMappingSpecification
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.BooleanLiteral

/**
 * This extension class captures common SQL knowledge in relation to the Mappings DSL.
 * 
 * @author Meinte Boersma
 */
@Singleton
class SqlUtil {

	@Inject extension SimpleDbExtensions


	def dispatch resultAsSql(ColumnsSpecification it) {
		"distinct " + columns.map[name].join(', ')
	}

	def dispatch resultAsSql(AllColumnsExpression it)
		'''*'''

	def asSql(LeftRangeDelimiters it) {
		switch it {
			case CLOSED:	"<="
			case OPEN:		"<"
		}
	}

	def asSql(RightRangeDelimiters it) {
		switch it {
			case CLOSED:	"<="
			case OPEN:	"<"
		}
	}


	def asSql(OrderClause it)
		'''ORDER BY «FOR spec : columnSpecifications SEPARATOR ', '»«IF spec.timestamp»timestamp«ELSE»«spec.column.name»«ENDIF» «spec.direction.getName()»«ENDFOR»'''


	def interpolationString(ToDbMappingSpecification it) {
		switch column.type {
			BooleanLiteral: "%s"
			default:		"'%s'"
		}
	}

}

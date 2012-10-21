package nl.dslmeinte.xtext.mappings.generator.sql

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.xtext.mappings.mappingsDsl.AllColumnsExpression
import nl.dslmeinte.xtext.mappings.mappingsDsl.ColumnsSpecification
import nl.dslmeinte.xtext.mappings.mappingsDsl.LeftRangeDelimiters
import nl.dslmeinte.xtext.mappings.mappingsDsl.OrderClause
import nl.dslmeinte.xtext.mappings.mappingsDsl.RightRangeDelimiters
import nl.dslmeinte.xtext.mappings.mappingsDsl.ToDbMappingSpecification
import nl.dslmeinte.xtext.simpleDb.extensions.SimpleDbExtensions
import nl.dslmeinte.xtext.simpleDb.simpleDbDsl.BooleanLiteral

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
			case LeftRangeDelimiters::CLOSED:	"<="
			case LeftRangeDelimiters::OPEN:		"<"
		}
	}

	def asSql(RightRangeDelimiters it) {
		switch it {
			case RightRangeDelimiters::CLOSED:	"<="
			case RightRangeDelimiters::OPEN:	"<"
		}
	}


	def asSql(OrderClause it)
		'''ORDER BY «FOR spec : columnSpecifications SEPARATOR ', '»«IF spec.timestamp»timestamp«ELSE»«spec.column.name»«ENDIF» «spec.direction.name»«ENDFOR»'''


	def interpolationString(ToDbMappingSpecification it) {
		switch column.type {
			BooleanLiteral: "%s"
			default:		"'%s'"
		}
	}

}

package nl.dslmeinte.simscript.generator.mappings.sql

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.mappings.QueryExtensions
import nl.dslmeinte.simscript.mappings.mappingsDsl.CountQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.DeleteQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.InsertQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.MatchingClause
import nl.dslmeinte.simscript.mappings.mappingsDsl.OrSubClause
import nl.dslmeinte.simscript.mappings.mappingsDsl.SelectQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.SimpleEqualitySubClause
import nl.dslmeinte.simscript.mappings.mappingsDsl.SimpleRangeSubClause
import nl.dslmeinte.simscript.mappings.mappingsDsl.UpdateMatchingClause
import nl.dslmeinte.simscript.mappings.mappingsDsl.UpdateQuery

@Singleton
@Deprecated
class SqlGenerator {

	@Inject extension QueryExtensions
	@Inject extension SqlUtil


	def dispatch sqlQuery(SelectQuery it) {
		val columnsSpec = if( referedColumns.size > 0 ) referedColumns.map[name].join(", ") else "*"
		'''SELECT «columnsSpec» FROM «table.name» «whereClause?.asSql» «orderClause?.asSql» «IF atMost1»LIMIT 1«ENDIF»;'''
	}

	def dispatch sqlQuery(CountQuery it)
		'''SELECT count(«resultExpr.resultAsSql») as count FROM «table.name» «whereClause?.asSql»;'''

	def dispatch sqlQuery(DeleteQuery it)
		'''DELETE FROM «table.name» «whereClause.asSql»;'''

	def dispatch sqlQuery(InsertQuery it)
		'''INSERT INTO «table.name»(«FOR mapping : mappingSpecifications SEPARATOR ', '»«mapping.column.name»«ENDFOR») VALUES («FOR mapping : mappingSpecifications SEPARATOR ', '»«mapping.interpolationString»«ENDFOR»);'''

	def dispatch sqlQuery(UpdateQuery it)
		'''UPDATE «table.name» SET «FOR mapping : mappingSpecifications SEPARATOR ', '»«mapping.column.name»='%s'«ENDFOR» «whereClause.asSql»;'''


	def private asSql(MatchingClause it)
		'''WHERE «FOR subClause : subClauses SEPARATOR ' AND '»«subClause.asSubSql»«ENDFOR»'''

	def private asSql(UpdateMatchingClause it)
		'''WHERE «FOR subClause : subClauses SEPARATOR ' AND '»«subClause.column.name»='%s'«ENDFOR»'''


	def private dispatch CharSequence asSubSql(OrSubClause it)
		'''(«FOR subClause : subClauses SEPARATOR ' OR '»«subClause.asSubSql»«ENDFOR»)'''

	def private dispatch CharSequence asSubSql(SimpleEqualitySubClause it)		'''«column.name»='%s' '''		// extra space in template is required for parsing Xtend's rich strings...
	def private dispatch CharSequence asSubSql(SimpleRangeSubClause it)			'''('%s' «leftDelimiter.asSql» «column.name» AND «column.name» «rightDelimiter.asSql» '%s')'''

}

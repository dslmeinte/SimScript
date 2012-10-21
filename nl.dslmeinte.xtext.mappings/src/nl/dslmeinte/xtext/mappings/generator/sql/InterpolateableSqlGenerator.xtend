package nl.dslmeinte.xtext.mappings.generator.sql

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.xtext.mappings.extensions.QueryExtensions
import nl.dslmeinte.xtext.mappings.mappingsDsl.CountQuery
import nl.dslmeinte.xtext.mappings.mappingsDsl.DeleteQuery
import nl.dslmeinte.xtext.mappings.mappingsDsl.ExpressionEqualitySubClause
import nl.dslmeinte.xtext.mappings.mappingsDsl.InsertQuery
import nl.dslmeinte.xtext.mappings.mappingsDsl.MatchingClause
import nl.dslmeinte.xtext.mappings.mappingsDsl.OrSubClause
import nl.dslmeinte.xtext.mappings.mappingsDsl.SelectQuery
import nl.dslmeinte.xtext.mappings.mappingsDsl.SimpleEqualitySubClause
import nl.dslmeinte.xtext.mappings.mappingsDsl.SimpleRangeSubClause
import nl.dslmeinte.xtext.mappings.mappingsDsl.ToDbMappingSpecification
import nl.dslmeinte.xtext.mappings.mappingsDsl.UpdateMatchingClause
import nl.dslmeinte.xtext.mappings.mappingsDsl.UpdateQuery

@Singleton
class InterpolateableSqlGenerator {

	@Inject extension QueryExtensions
	@Inject extension SqlUtil


	def dispatch interpolateableSqlQuery(SelectQuery it) {
		val columnsSpec = if( referedColumns.size > 0 ) referedColumns.map[name].join(", ") else "*"
		val iSql = new ParametrizedInterpolation('''SELECT «columnsSpec» FROM «table.name» ''')
		if( whereClause != null ) {
			iSql.append(whereClause.asISql).append(" ")
		}
		if( orderClause != null ) {
			iSql.append(orderClause.asSql).append(" ")
		}
		if( atMost1 ) {
			iSql.append("LIMIT 1")
		}
		iSql.append(";")
	}

	def dispatch interpolateableSqlQuery(CountQuery it) {
		new ParametrizedInterpolation('''SELECT count(«resultExpr.resultAsSql») as count FROM «table.name» ''')
			.append(whereClause?.asISql).append(";")
	}

	def dispatch interpolateableSqlQuery(DeleteQuery it) {
		new ParametrizedInterpolation('''DELETE FROM «table.name» ''').append(whereClause.asISql).append(";")
	}

	def dispatch interpolateableSqlQuery(InsertQuery it) {
		new ParametrizedInterpolation('''INSERT INTO «table.name»(«FOR mapping : mappingSpecifications SEPARATOR ', '»«mapping.column.name»«ENDFOR») VALUES (''')
			.appendJoined(mappingSpecifications.map[asInsertIString], ", ")
			.append(");")
	}

	def private asInsertIString(ToDbMappingSpecification it) {
		new ParametrizedInterpolation(interpolationString, <Object>newArrayList(it))
	}

	def dispatch interpolateableSqlQuery(UpdateQuery it) {
		new ParametrizedInterpolation('''UPDATE «table.name» SET ''')
			.appendJoined(mappingSpecifications.map[asUpdateIString], ", ")
			.append(" ").append(whereClause.asISql).append(";")
	}

	def private asUpdateIString(ToDbMappingSpecification it) {
		new ParametrizedInterpolation('''«column.name»=«interpolationString»''', <Object>newArrayList(it))
	}


	def private asISql(MatchingClause it) {
		new ParametrizedInterpolation("WHERE ").appendJoined(subClauses.map[it.asSubISql], " AND ")
	}

	def private dispatch asSubISql(SimpleEqualitySubClause it) {
		if( parameter != null ) {
			new ParametrizedInterpolation('''«column.name»='%s' ''', <Object>newArrayList(parameter))		// extra space in template is required for parsing Xtend's rich strings...
		} else {
			new ParametrizedInterpolation('''«column.name»=%s''', <Object>newArrayList(literal))
		}
	}

	def private dispatch asSubISql(SimpleRangeSubClause it) {
		new ParametrizedInterpolation('''('%s' «leftDelimiter.asSql» «column.name» AND «column.name» «rightDelimiter.asSql» '%s')''', <Object>newArrayList(leftParameter, rightParameter))
	}

	def private dispatch asSubISql(OrSubClause it) {
		new ParametrizedInterpolation("(").appendJoined(subClauses.map[asSubISql], " OR ").append(")")
	}


	def private asISql(UpdateMatchingClause it) {
		new ParametrizedInterpolation("WHERE ").appendJoined(subClauses.map[asSubClauseIString], " AND ")
	}

	def private asSubClauseIString(ExpressionEqualitySubClause it) {
		new ParametrizedInterpolation('''«column.name»='%s' ''', <Object>newArrayList(it))		// (mind the extra whitespace...)
	}

}
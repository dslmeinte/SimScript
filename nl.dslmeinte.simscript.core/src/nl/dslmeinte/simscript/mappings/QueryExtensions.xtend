package nl.dslmeinte.simscript.mappings

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.Set
import nl.dslmeinte.simscript.extensions.SimpleDbExtensions
import nl.dslmeinte.simscript.mappings.mappingsDsl.CountQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.FromDbQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.NestedMappingSpecification
import nl.dslmeinte.simscript.mappings.mappingsDsl.OrSubClause
import nl.dslmeinte.simscript.mappings.mappingsDsl.QueryHavingResult
import nl.dslmeinte.simscript.mappings.mappingsDsl.SelectQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.SimpleColumnMappingSpecification
import nl.dslmeinte.simscript.mappings.mappingsDsl.SimpleSubClause
import nl.dslmeinte.simscript.mappings.mappingsDsl.TimestampColumnMappingSpecification
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.Column
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.SimpleColumn
import nl.dslmeinte.simscript.util.XtextUtil

/**
 * Extension (Xtend) class which provides computed values on everything query-like.
 */
@Singleton
class QueryExtensions {

	@Inject extension SimpleDbExtensions

	@Inject extension XtextUtil


	def yieldsSingleRow(FromDbQuery it) {
		if( whereClause == null ) {
			return false
		}

		val columnSet = <Column>newHashSet
		columnSet.addAll(whereClause.subClauses.filter(typeof(SimpleSubClause)).map[it.column])
		columnSet.addAll(whereClause.subClauses.filter(typeof(OrSubClause)).map[it.subClauses.map[it.column]].flatten)
		columnSet.filter(typeof(SimpleColumn)).exists[primary || unique]
	}

	/**
	 * @return The {@link SelectQuery} that's referenced by this {@link NestedMappingSpecification}.
	 */
	def nestedQuery(NestedMappingSpecification it) {
		query.queryExpr.checkedCast(typeof(QueryHavingResult))
	}

	def dispatch nonEmpty(SelectQuery it)	{ nonEmpty }
	def dispatch nonEmpty(CountQuery it)	{ true }


	def referedColumns(SelectQuery it) {
		val columnSet = <Column>newLinkedHashSet
		columnSet.addAll(mappingSpecifications.filter(typeof(SimpleColumnMappingSpecification)).map[column])
		columnSet.addAll(mappingSpecifications.filter(typeof(NestedMappingSpecification)).map[it.arguments.map[column]].flatten)
		if( table.timestamped && !mappingSpecifications.filter(typeof(TimestampColumnMappingSpecification)).empty ) {
			columnSet.add(timestampColumn(table.timestampIndexed))
		}
		return columnSet as Set<Column>
	}
	// (attempt to order these the exact same way the mapper does...)

}

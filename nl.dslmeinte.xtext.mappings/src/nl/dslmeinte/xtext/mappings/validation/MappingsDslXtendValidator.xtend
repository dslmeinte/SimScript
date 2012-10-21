package nl.dslmeinte.xtext.mappings.validation

import com.google.inject.Inject
import com.simlike.simscript.structure.structureDsl.TypeLiteral
import com.simlike.simscript.structure.types.TypeExtensions
import com.simlike.simscript.util.XtextUtil
import nl.dslmeinte.xtext.mappings.extensions.QueryExtensions
import nl.dslmeinte.xtext.mappings.mappingsDsl.ColumnOrderSpecification
import nl.dslmeinte.xtext.mappings.mappingsDsl.ColumnsSpecification
import nl.dslmeinte.xtext.mappings.mappingsDsl.CountQuery
import nl.dslmeinte.xtext.mappings.mappingsDsl.EncryptExpression
import nl.dslmeinte.xtext.mappings.mappingsDsl.FeatureExpressionHead
import nl.dslmeinte.xtext.mappings.mappingsDsl.FeatureExpressionTail
import nl.dslmeinte.xtext.mappings.mappingsDsl.InsertQuery
import nl.dslmeinte.xtext.mappings.mappingsDsl.MappingsDslPackage
import nl.dslmeinte.xtext.mappings.mappingsDsl.MatchingClause
import nl.dslmeinte.xtext.mappings.mappingsDsl.MonthRoundExpression
import nl.dslmeinte.xtext.mappings.mappingsDsl.NestedMappingSpecification
import nl.dslmeinte.xtext.mappings.mappingsDsl.OrderClause
import nl.dslmeinte.xtext.mappings.mappingsDsl.QueryHavingResult
import nl.dslmeinte.xtext.mappings.mappingsDsl.SelectQuery
import nl.dslmeinte.xtext.mappings.mappingsDsl.TimestampColumnMappingSpecification
import nl.dslmeinte.xtext.mappings.mappingsDsl.ToDbMappingSpecification
import nl.dslmeinte.xtext.mappings.mappingsDsl.UpdateMatchingClause
import nl.dslmeinte.xtext.mappings.mappingsDsl.UpdateQuery
import nl.dslmeinte.xtext.simpleDb.extensions.SimpleDbExtensions
import nl.dslmeinte.xtext.simpleDb.simpleDbDsl.SimpleColumn
import org.eclipse.xtext.validation.Check

class MappingsDslXtendValidator extends AbstractMappingsDslJavaValidator {

	@Inject extension QueryExtensions
	@Inject extension SimpleDbExtensions
	@Inject extension TypeExtensions

	@Inject extension XtextUtil


	private MappingsDslPackage ePackage = MappingsDslPackage::eINSTANCE

	@Check
	def check_single_result_queries(SelectQuery it) {
		if( yieldsSingleRow && atMost1 ) {
			warning( "query can already only yield at most 1 result row", ePackage.selectQuery_AtMost1 )
		}
	}

	@Check
	def check_all_undeferred_simpleTyped_features_receive_value(SelectQuery it) {
		val unmappedFeatures = structure.features.filter[ f | !it.mappingSpecifications.exists[ m | m.feature == f ] ]
		if( !unmappedFeatures.empty ) {
			warning("the following (undeferred, simple-typed) features are not mapped (to): " + unmappedFeatures.map[name].join(' '), this)
		}
	}

	@Check
	def warn_about_sameNamed_construct(SelectQuery it) {
		if( !sameNamedColumns.empty ) {
			warning("this construct isn't semantically supported yet", ePackage.selectQuery_SameNamedColumns)
		}
	}

	@Check
	def check_invocation_of_other_mapping(NestedMappingSpecification it) {
		if( !(query.queryExpr instanceof QueryHavingResult) ) {
			error("nested query/mapping must be a select or a count query", ePackage.nestedMappingSpecification_Query)
		}
		if( query.eResource != it.eResource ) {
			warning("nested query/mapping resides in other mappings file", ePackage.nestedMappingSpecification_Query)
		}
	}

	@Check
	def check_use_of_timestamp_in_mapping(TimestampColumnMappingSpecification it) {
		val query = containerHaving(typeof(QueryHavingResult))
		if( !query.table.timestamped ) {
			error("timestamp mapping specification can only be used in a query on timestamped table", this)
		}
	}

	@Check
	def check_single_result_query(CountQuery it) {
		if( yieldsSingleRow ) {
			warning( "query can already only yield at most 1 result row (so count is always 0 or 1)", this )
		}
	}

	@Check
	def check_columns_specification_non_empty(ColumnsSpecification it) {
		if( columns.empty ) {
			error("specify at least one column", this)
		}
	}

	@Check
	def warn_if_matching_clause_is_empty(MatchingClause it) {
		if( subClauses.empty ) {
			error("specify at least one matching sub clause", this)
		}
	}

	@Check
	def warn_if_order_clause_is_empty(OrderClause it) {
		if( columnSpecifications.empty ) {
			warning("specify at least one order clause", this)
		}
	}

	@Check
	def check_timestamp_spec_only_used_with_timestamped_table(ColumnOrderSpecification it) {
		val orderClause = eContainer.checkedCast(typeof(OrderClause))
		val selectQuery = orderClause.eContainer.checkedCast(typeof(SelectQuery))
		val table = selectQuery.table
		if( timestamp && !table.timestamped ) {
			error('''can't order on timestamp because table '«table.name»' is not timestamped'''.toString, ePackage.columnOrderSpecification_Timestamp)
		}
	}

	@Check
	def check_all_required_columns_receive_value(InsertQuery it) {
		val unmappedColumns = table.columnsToSet.filter[ c | !it.mappingSpecifications.exists[ m | m.column == c ] ]
		if( !unmappedColumns.empty ) {
			warning("the following columns-to-set are not mapped (to): " + unmappedColumns.map[name].join(' '), this)
		}
	}

	@Check
	def check_password_are_always_encrypted(ToDbMappingSpecification it) {
		switch expr {
			FeatureExpressionHead:
				if( expr.effectiveType.passwordTyped ) {
					error("a password-typed value cannot be persisted in the database un-encrypted", ePackage.toDbMappingSpecification_Expr)
				}
		}
	}

	@Check
	def warn_if_matching_clause_is_empty(UpdateMatchingClause it) {
		if( subClauses.empty ) {
			error("specify at least one matching sub clause", this)
		}
	}

	@Check
	def warn_if_primary_column_is_updated(ToDbMappingSpecification it) {
		if( eContainer instanceof UpdateQuery && column instanceof SimpleColumn && (column as SimpleColumn).primary ) {
			warning("warning: updating a primary", ePackage.toDbMappingSpecification_Column)
		}
	}

	@Check
	def check_operand_type_of(MonthRoundExpression it) {
		if( !operand.effectiveType.dateTyped ) {
			error("round-to-month can only be invoked on a date-typed operand", ePackage.monthRoundExpression_Operand)
		}
	}

	@Check
	def check_operand_type_of(EncryptExpression it) {
		if( !operand.effectiveType.passwordTyped ) {
			error("encrypt can only be invoked on a password-typed operand", ePackage.encryptExpression_Operand)
		}
	}

	def private dispatch TypeLiteral effectiveType(FeatureExpressionHead it) {
		if( tail == null ) {
			parameter.type
		} else {
			tail.effectiveType
		}
	}

	def private dispatch TypeLiteral effectiveType(FeatureExpressionTail it) {
		if( tail == null ) {
			feature.type
		} else {
			tail.effectiveType
		}
	}

}

package nl.dslmeinte.simscript.mappings.generator

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.util.XtextUtil
import nl.dslmeinte.simscript.mappings.extensions.MiscellaneousExtensions
import nl.dslmeinte.simscript.mappings.extensions.QueryExtensions
import nl.dslmeinte.simscript.mappings.generator.sql.InterpolateableSqlGenerator
import nl.dslmeinte.simscript.mappings.mappingsDsl.BooleanLiteralExpression
import nl.dslmeinte.simscript.mappings.mappingsDsl.CountQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.DeferedMappingSpecification
import nl.dslmeinte.simscript.mappings.mappingsDsl.DeleteQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.EncryptExpression
import nl.dslmeinte.simscript.mappings.mappingsDsl.ExpressionEqualitySubClause
import nl.dslmeinte.simscript.mappings.mappingsDsl.FeatureExpressionHead
import nl.dslmeinte.simscript.mappings.mappingsDsl.FeatureExpressionTail
import nl.dslmeinte.simscript.mappings.mappingsDsl.FromDbMappingSpecification
import nl.dslmeinte.simscript.mappings.mappingsDsl.InsertQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.MappingsModel
import nl.dslmeinte.simscript.mappings.mappingsDsl.MonthRoundExpression
import nl.dslmeinte.simscript.mappings.mappingsDsl.NestedMappingSpecification
import nl.dslmeinte.simscript.mappings.mappingsDsl.QueryHavingResult
import nl.dslmeinte.simscript.mappings.mappingsDsl.SelectQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.SimpleColumnMappingSpecification
import nl.dslmeinte.simscript.mappings.mappingsDsl.TimestampColumnMappingSpecification
import nl.dslmeinte.simscript.mappings.mappingsDsl.ToDbExpression
import nl.dslmeinte.simscript.mappings.mappingsDsl.ToDbMappingSpecification
import nl.dslmeinte.simscript.mappings.mappingsDsl.UntypedParameter
import nl.dslmeinte.simscript.mappings.mappingsDsl.UpdateQuery
import nl.dslmeinte.simscript.simpleDb.extensions.SimpleDbExtensions
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.BooleanLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.DateLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.FloatLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.IntLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.SqlTypeLiteral

@Singleton
class PhpGenerator {

	@Inject extension SimpleDbExtensions
	@Inject extension QueryExtensions
	@Inject extension MiscellaneousExtensions
	@Inject extension InterpolateableSqlGenerator

	@Inject extension XtextUtil


	def phpFile(MappingsModel it)
		'''
		<?php

			require_once('db.php');

			«FOR definition : definitions»
				«definition.queryExpr.phpFunction(definition.name)»
			«ENDFOR»

		?>
		'''

	def private dispatch phpFunction(QueryHavingResult it, String name) {
		val iSqlQuery = interpolateableSqlQuery
		'''
		function «name»(«FOR p : parameters SEPARATOR ', '»$«p.name»«ENDFOR») {
			$query =
				«IF iSqlQuery.arguments.empty»
					"«iSqlQuery.text»";
				«ELSE»
					sprintf(
						"«iSqlQuery.text»",
						«FOR arg : iSqlQuery.arguments SEPARATOR ","»
							«arg.asPhp»
						«ENDFOR»
					);
				«ENDIF»
			$db_result = @mysql_query($query);
			if( !$db_result ) {
				die( "Could not execute query '" . $query . "' because of: " . mysql_error() );
			}
			$num_rows = mysql_num_rows($db_result);
			«IF nonEmpty»
				if( $num_rows == 0 ) {
					die( "Query unexpectedly returned 0 result rows: " . $query );
				}
			«ENDIF»
			«resultMapping(name)»
			@mysql_free_result($db_result);
			return $result;
		}

		«mapperFunction(name)»

		'''
	}

	def asPhp(Object it) {
		switch it {
			UntypedParameter:				'''mysql_real_escape_string($«it.name»)'''
			ToDbMappingSpecification:		'''«it.column.type.wrapTo(it.expr.asPhp)»'''
			ExpressionEqualitySubClause:	'''«it.column.type.wrapTo(it.expr.asPhp)»'''
			BooleanLiteralExpression:		'''boolLit2NumVal('«it.literal.literal»')'''
			default:
				throw new IllegalArgumentException("PhpGenerator#asPhp: could not handle " + it.^class.simpleName)
		}
	}

	def private dispatch resultMapping(SelectQuery it, String name) {
		if( yieldsSingleRow || atMost1 )	// single-valued result
			'''
			$result = null;
			if( $num_rows == 1 ) {
				$result = «name»_mapper(mysql_fetch_assoc($db_result));
			}
			'''
			else
			'''
			$result = array();
			for( $i = 0; $i < $num_rows; $i++ ) {
				array_push($result, «name»_mapper(mysql_fetch_assoc($db_result)));
			}
			'''
	}

	def private dispatch resultMapping(CountQuery it, String name)
		'''
		$result = count_mapper(mysql_fetch_assoc($db_result));
		'''


	def private dispatch mapperFunction(SelectQuery it, String name)
		'''
		function «name»_mapper($row_assoc) {
			$structure = array();

			«FOR mapping : mappingSpecifications»
				«mapping.mappingStatement»
			«ENDFOR»

			return $structure;
		}
		'''

	def private mappingStatement(FromDbMappingSpecification it) {
		switch it {
			DeferedMappingSpecification:			'''// defer mapping of feature «feature.name»'''
			SimpleColumnMappingSpecification:		'''$structure['«feature.name»'] = «convertingGetterExpr»;'''
			NestedMappingSpecification:				'''$structure['«feature.name»'] = «it.query.name»(«mkArguments»);'''
			TimestampColumnMappingSpecification:	'''$structure['«feature.name»'] = sql2sim_datetime($row_assoc['timestamp']);'''
		}
	}

	def private mkArguments(NestedMappingSpecification it)
		'''«FOR p : nestedQuery.parameters SEPARATOR ', '»$row_assoc['«p.lookupIn(arguments).column.name»']«ENDFOR»'''

	def private convertingGetterExpr(SimpleColumnMappingSpecification it) {
		val inner = '''$row_assoc['«it.column.name»']'''
		switch column.type {
			BooleanLiteral:	'''(«inner» == "1")'''
			IntLiteral:		'''intval(«inner»)'''
			FloatLiteral:	'''floatval(«inner»)'''
			DateLiteral:	wrap("sql2sim_date", inner)
			default:		inner
		}
	}

	def private wrap(CharSequence outer, CharSequence inner) {
		'''«outer»(«inner»)'''
	}


	def private dispatch mapperFunction(CountQuery it, String name) ''''''		// uses a generic mapper function in db.php


	def private dispatch phpFunction(InsertQuery it, String name) {
		val iSqlQuery = interpolateableSqlQuery
		'''
		function «name»(«FOR parameter : parameters SEPARATOR ', '»$«parameter.name»«ENDFOR») {
			$query = sprintf(
					"«iSqlQuery.text»",
					«FOR arg : iSqlQuery.arguments SEPARATOR ','»
						«arg.asPhp»
					«ENDFOR»
				);
			error_log("«name»: insert query string = ".$query);«/* TODO  remove later on */»
			$db_result = @mysql_query($query);
			«IF returnAutoIncrementColumn != null»
				$auto_id = mysql_insert_id();
			«ENDIF»
			@mysql_free_result($db_result);
			«IF returnAutoIncrementColumn != null»
				return $auto_id;
			«ENDIF»
		}

		'''
	}

	def private dispatch phpFunction(UpdateQuery it, String name) {
		val iSqlQuery = interpolateableSqlQuery
		'''
		function «name»(«FOR parameter : parameters SEPARATOR ', '»$«parameter.name»«ENDFOR») {
			$query = sprintf(
					"«iSqlQuery.text»",
					«FOR arg : iSqlQuery.arguments SEPARATOR ','»
						«arg.asPhp»
					«ENDFOR»
				);
			error_log("«name»: update query string = ".$query);«/* TODO  remove later on */»
			$db_result = @mysql_query($query);
			@mysql_free_result($db_result);
		}

		'''
	}

	def private wrapTo(SqlTypeLiteral type, CharSequence inner) {
		wrap(
			switch type {
				BooleanLiteral:	"boolLit2NumVal"
				DateLiteral:	"sim2sql_date"
				default:		"mysql_real_escape_string"
			},
			inner
		)
	}

	def private CharSequence asPhp(ToDbExpression it) {
		switch it {
			FeatureExpressionHead:		'''«IF feature == null || feature.optional»isset(«it.asPhpAccessor») ? «it.asPhpAccessor» : null«ELSE»«it.asPhpAccessor»«ENDIF»'''		// assumption: this gets surrounded by parentheses
											// TODO  all the sub paths have to be checked as well
			MonthRoundExpression:		'''roundToMonth(«it.operand.asPhp»)'''
			EncryptExpression:			'''encryptPassword(«it.operand.asPhp»)'''
			BooleanLiteralExpression:	'''"«it.literal.literal»"'''
			default: {
				logProblem("unhandled (sub) type " + eClass.name + " (of ToDbExpression) in PhpGenerator#asPhp")
				""
			}
		}
	}

	def private asPhpAccessor(FeatureExpressionHead it)	'''$«it.parameter.name»«IF it.tail != null»«it.tail.tailAsPhp»«ENDIF»'''

	def private CharSequence tailAsPhp(FeatureExpressionTail it)		'''['«feature.name»']«tail?.tailAsPhp»'''


	def private dispatch phpFunction(DeleteQuery it, String name) {
		val iSqlQuery = interpolateableSqlQuery
		'''
		function «name»(«FOR p : parameters SEPARATOR ', '»$«p.name»«ENDFOR») {
			$query =
				«IF iSqlQuery.arguments.empty»
					"«iSqlQuery.text»";
				«ELSE»
					sprintf(
						"«iSqlQuery.text»",
						«FOR arg : iSqlQuery.arguments SEPARATOR ","»
							«arg.asPhp»
						«ENDFOR»
					);
				«ENDIF»
			$db_result = @mysql_query($query);
			if( !$db_result ) {
				die( "Could not execute query '" . $query . "' because of: " . mysql_error() );
			}
			@mysql_free_result($db_result);
		}

		'''
	}

}

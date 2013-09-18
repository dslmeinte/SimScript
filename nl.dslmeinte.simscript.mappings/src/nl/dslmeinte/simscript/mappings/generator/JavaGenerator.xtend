package nl.dslmeinte.simscript.mappings.generator

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.generator.ResourceUtil
import nl.dslmeinte.simscript.generator.backend.JavaGeneratorHelper
import nl.dslmeinte.simscript.structure.types.TypeExtensions
import nl.dslmeinte.simscript.util.XtextUtil
import nl.dslmeinte.simscript.mappings.extensions.QueryExtensions
import nl.dslmeinte.simscript.mappings.generator.sql.SqlGenerator
import nl.dslmeinte.simscript.mappings.mappingsDsl.BooleanLiteralExpression
import nl.dslmeinte.simscript.mappings.mappingsDsl.CountQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.DeferedMappingSpecification
import nl.dslmeinte.simscript.mappings.mappingsDsl.DeleteQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.EncryptExpression
import nl.dslmeinte.simscript.mappings.mappingsDsl.FeatureExpressionHead
import nl.dslmeinte.simscript.mappings.mappingsDsl.FeatureExpressionTail
import nl.dslmeinte.simscript.mappings.mappingsDsl.FromDbMappingSpecification
import nl.dslmeinte.simscript.mappings.mappingsDsl.FromDbQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.InsertQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.MappingsModel
import nl.dslmeinte.simscript.mappings.mappingsDsl.NestedMappingSpecification
import nl.dslmeinte.simscript.mappings.mappingsDsl.SelectQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.SimpleColumnMappingSpecification
import nl.dslmeinte.simscript.mappings.mappingsDsl.ToDbExpression
import nl.dslmeinte.simscript.mappings.mappingsDsl.ToDbQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.UpdateQuery
import nl.dslmeinte.simscript.simpleDb.extensions.SimpleDbExtensions
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.BooleanLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.DataTypeReference
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.DateLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.EnumerationReference
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.FloatLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.IntLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.SqlTypeLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.TextLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.VarCharLiteral

@Singleton
class JavaGenerator {

	@Inject extension SqlGenerator
	@Inject extension QueryExtensions
	@Inject extension TypeExtensions
	@Inject extension SimpleDbExtensions
	@Inject extension JavaGeneratorHelper

	@Inject extension XtextUtil
	@Inject extension ResourceUtil


	def javaFile(MappingsModel it) {
		println('''«this.^class.simpleName»: generated Java repository for «eResource.fileName»''')
		'''
		package «eResource.containingPackage»;

		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;
		import java.util.ArrayList;
		import java.util.List;
		import nl.dslmeinte.api.db.sql.SqlSupport;

		«FOR structure : structuresFromSelectQueries»
			import «structure.createDefinedTypeLiteral.asJavaTypeLiteral»;
		«ENDFOR»

		public class «eResource.fileName.toFirstUpper»Repository extends SqlSupport {

			«FOR definition : definitions»
				«definition.queryExpr.java(definition.name)»

			«ENDFOR»

		}
		'''
	}

	def private structuresFromSelectQueries(MappingsModel it) {
		definitions.map[queryExpr].filter(typeof(SelectQuery)).map[structure].toSet
	}


	/*
	 * +--------------+
	 * | select query |
	 * +--------------+
	 */

	def private dispatch java(SelectQuery it, String name)
		'''
		«queryMethod(name)»

		«mapperMethod(name)»

		'''


	def private untypedSignature(FromDbQuery it)
		'''«FOR p : parameters SEPARATOR ', '»String «p.name»«ENDFOR»'''


	def private queryMethod(SelectQuery it, String name) {
		if( yieldsSingleRow || atMost1 ) {
			'''
			public «structure.name» «name»(«untypedSignature») throws SQLException {
				«boilerplate»
				«structure.name» result = null;
				if( sqlResult.next() ) {
					result = «name»Mapper(sqlResult);
				}
				return result;
			}
			'''
			// TODO  check non-empty and such
		} else {
			'''
			public List<«structure.name»> «name»(«untypedSignature») throws SQLException {
				«boilerplate»
				final List<«structure.name»> resultList = new ArrayList<«structure.name»>();
				while( sqlResult.next() ) {
					resultList.add(«name»Mapper(sqlResult));
				}
				return resultList;
			}
			'''
		}
	}


	def private boilerplate(FromDbQuery it)
		'''
		final String query = String.format("«sqlQuery»"«FOR p : parameters», escapeSql(«p.name»)«ENDFOR»);
		final Statement statement = mkConnection().createStatement();
		final ResultSet sqlResult = statement.executeQuery(query);
		'''


	def private mapperMethod(SelectQuery it, String name)
		'''
		private «structure.name» «name»Mapper(ResultSet sqlResult) throws SQLException {
			final «structure.name» result = new «structure.name»();

			«FOR spec : mappingSpecifications»
				«spec.mappingStatement»
			«ENDFOR»

			return result;
		}
		'''


	def private mappingStatement(FromDbMappingSpecification it) {
		switch it {
			DeferedMappingSpecification:			'''// defer mapping of feature «feature.name»'''
			SimpleColumnMappingSpecification:		resultSetter(fromDbExpression)
			NestedMappingSpecification:				resultSetter('''«it.query.name»(«mkArguments»)''')
//			TimestampColumnMappingSpecification:	resultSetter('''sqlResult.getString("timestamp")''')	// TODO  getString probably not correct...
		}
	}

	def private resultSetter(FromDbMappingSpecification it, CharSequence inner)
		'''result.set«feature.name.toFirstUpper»(«inner»);'''

	def private fromDbExpression(SimpleColumnMappingSpecification it) {
		convertingGetterExpr(column.type, column.name)
	}

	def private mkArguments(NestedMappingSpecification it)
		'''«FOR p : nestedQuery.parameters SEPARATOR ', '»«(it as SimpleColumnMappingSpecification).fromDbExpression»«ENDFOR»'''

	def private String asJava(SqlTypeLiteral it) {
		switch it {
			BooleanLiteral:			"Boolean"
			DateLiteral:			"Date"
			FloatLiteral:			"Double"
			IntLiteral:				"Int"
			TextLiteral:			"String"
			VarCharLiteral:			"String"
			DataTypeReference:		it.datatype.type.asJava
			EnumerationReference:	"String"
			default:
				throw new IllegalArgumentException('''sub type «eClass.name» not handled in «this.^class.simpleName»#asJava(..)'''.toString)
		}
	}

	def private convertingGetterExpr(SqlTypeLiteral type, String columnName) {
		switch type {
			BooleanLiteral:			sqlGetter("Boolean", columnName)
			DateLiteral:			sqlGetter("Date", columnName)
			FloatLiteral:			sqlGetter("Double", columnName)
			IntLiteral:				sqlGetter("Integer", columnName)
			TextLiteral:			sqlGetter("Text", columnName)
			VarCharLiteral:			sqlGetter("String", columnName)
			DataTypeReference:		type.datatype.type.convertingGetterExpr(columnName)
			// TODO  EnumerationReference
			default:
				throw new IllegalArgumentException('''sub type «^class.simpleName» not handled in «this.^class.simpleName»#asJava(..)'''.toString)
		}
	}

	def private sqlGetter(String sqlType, String columnName) {
		val javaType = if( sqlType == "Integer" ) "Int" else sqlType
		'''sqlResult.get«javaType»("«columnName»")'''
	}


	/*
	 * +-------------+
	 * | count query |
	 * +-------------+
	 */

	def private dispatch java(CountQuery it, String name)
		'''
		public int «name»(«untypedSignature») throws SQLException {
			«boilerplate»
			sqlResult.next();
			return sqlResult.getInt("count");
		}
		'''


	/*
	 * +--------------+
	 * | insert query |
	 * +--------------+
	 */

	def private dispatch java(InsertQuery it, String name)
		'''
		public «IF returnAutoIncrementColumn == null»void«ELSE»String«ENDIF» «name»(«typedSignature») throws SQLException {
			final String query = String.format("«sqlQuery»",
					«FOR mapping : mappingSpecifications SEPARATOR ","»
						«mapping.expr.asJava»
					«ENDFOR»
				);
			final Statement statement = mkConnection().createStatement();
			statement.executeUpdate(query);
			«IF returnAutoIncrementColumn != null»
				final ResultSet sqlResult = statement.getGeneratedKeys();
				sqlResult.next();
				sqlResult.getString("«returnAutoIncrementColumn.name»");
			«ENDIF»
		}
		'''

	def private typedSignature(ToDbQuery it)
		'''«FOR p : parameters SEPARATOR ', '»«p.type.asJavaTypeLiteral» «p.name»«ENDFOR»'''


	/*
	 * +--------------+
	 * | update query |
	 * +--------------+
	 */

	def private dispatch java(UpdateQuery it, String name)
		'''
		public void «name»(«typedSignature») throws SQLException {
			final String query = String.format("«sqlQuery»",
					«FOR mapping : mappingSpecifications SEPARATOR ","»
						«mapping.expr.asJava»
					«ENDFOR»,
					«FOR subClause : whereClause.subClauses SEPARATOR ","»
						«subClause.expr.asJava»
					«ENDFOR»
				);
			final Statement statement = mkConnection().createStatement();
			statement.executeUpdate(query);
		}
		'''


	/*
	 * +--------------+
	 * | delete query |
	 * +--------------+
	 */

	def private dispatch java(DeleteQuery it, String name)
		'''
		public void «name»(«untypedSignature») throws SQLException {
			final String query = String.format("«sqlQuery»"«FOR p : parameters», escapeSql(«p.name»)«ENDFOR»);
			final Statement statement = mkConnection().createStatement();
			statement.executeUpdate(query);
		}
		'''


	/*
	 * +-------------+
	 * | expressions |
	 * +-------------+
	 */

	def private asJava(ToDbExpression it) {
		switch it {
			FeatureExpressionHead:		'''escapeSql(«it.parameter.name»«it.tail?.asJava».toString())'''
			EncryptExpression:			'''encrypt(«it.operand.asJava»)'''
			BooleanLiteralExpression:	'''"«it.literal.ordinal»"'''
			default:
				throw new IllegalArgumentException('''sub type «eClass.name» not handled in «this.^class.simpleName»#asJava(..)'''.toString)
		}
	}

	def private asJava(FeatureExpressionTail it) {
		'''.get«feature.name.toFirstUpper»()«tail?.asJava»'''
	}
	
}

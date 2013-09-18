package nl.dslmeinte.simscript.simpleDb.extensions

import com.google.inject.Inject
import com.google.inject.Singleton
import java.util.Collections
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.BooleanLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.Column
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.DataTypeReference
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.DatabaseModel
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.DateLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.EnumerationReference
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.FloatLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.ForeignKeyColumn
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.IntLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.NativeSqlTypeLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.SimpleColumn
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.SimpleDbDslFactory
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.SqlTypeLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.Table
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.TextLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.VarCharLiteral
import nl.dslmeinte.simscript.util.XtextUtil

@Singleton
class SimpleDbExtensions {

	@Inject extension XtextUtil

	/**
	 * @return The columns of this table which <em>must</em> (and can) receive a value.
	 */
	def columnsToSet(Table it) {
		columns.filter[it.settable]
	}

	def private settable(Column it) {
		switch it {
			SimpleColumn:		!nullable && !it.autoIncrement
			ForeignKeyColumn:	true
		}
	}

	/**
	 * @return The {@link Table tables} defined in this {@link DatabaseModel}.
	 */
	def tables(DatabaseModel it) {
		definitions.filter(typeof(Table))
	}

	/**
	 * @return The effective name of the given {@link DatabaseModel}.
	 */
	def name(DatabaseModel it) {
		eResource.fileName.toFirstUpper
	}


	def simpleColumns(Table it) {
		columns.filter(typeof(SimpleColumn))
	}


	def foreignKeyColumns(Table it) {
		columns.filter(typeof(ForeignKeyColumn))
	}


	def isKey(SimpleColumn it) {
		index || unique || primary
	}


	def type(Column it) {
		switch it {
			SimpleColumn:		it.type
			ForeignKeyColumn:	it.primaryId.primary.type
		}
	}


	private SimpleDbDslFactory eFactory = SimpleDbDslFactory.eINSTANCE

	def SqlTypeLiteral nativeSqlType(SqlTypeLiteral it) {
		switch it {
			DataTypeReference:		it.datatype.type.nativeSqlType as NativeSqlTypeLiteral
			EnumerationReference:	{
				eFactory.createVarCharLiteral => [ newLit |
					newLit.size = Collections.max(it.enumeration.literals.map[it.name.length])
				]
			}
			NativeSqlTypeLiteral:	it
		}
	}

	def toLiteral(SqlTypeLiteral it) {
		switch it {
			BooleanLiteral:			"boolean"
			DateLiteral:			"date"
			IntLiteral:				'''int(«it.size»)'''
			FloatLiteral:			'''float(«it.digits», «it.decimals»)'''
			TextLiteral:			"text"
			VarCharLiteral:			'''varchar(«it.size»)'''
			EnumerationReference:	'''enum «it.enumeration.name»'''
			DataTypeReference:		it.datatype.name
		}
	}

	def timestampColumn(boolean indexed) {
		val column = eFactory.createSimpleColumn

		column.name = "timestamp"
		column.nullable = false
		column.type = eFactory.createDateLiteral
		column.autoIncrement = false
		column.index = indexed
		column.primary = false
		column.unique = false

		column
	}

}

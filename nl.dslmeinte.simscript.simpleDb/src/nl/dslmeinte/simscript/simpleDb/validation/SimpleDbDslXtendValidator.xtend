package nl.dslmeinte.simscript.simpleDb.validation

import com.google.inject.Inject
import nl.dslmeinte.simscript.extensions.SimpleDbExtensions
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.IntLiteral
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.SimpleColumn
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.SimpleDbDslPackage
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.Table
import nl.dslmeinte.simscript.util.XtextUtil
import org.eclipse.xtext.validation.Check

class SimpleDbDslXtendValidator extends AbstractSimpleDbDslJavaValidator {

	@Inject extension SimpleDbExtensions
	@Inject extension XtextUtil

	private SimpleDbDslPackage ePackage = SimpleDbDslPackage.eINSTANCE

	@Check
	def check_table_has_columns(Table it) {
		if( columns.empty ) {
			error("table must have columns", this)
		}
	}

	@Check
	def check_auto_increment_implies_int_type(SimpleColumn it) {
		if( autoIncrement && !(type.nativeSqlType instanceof IntLiteral) ) {
			error('''auto-incremented column must be int-typed (instead of «type.nativeSqlType.toLiteral»)'''.toString, ePackage.simpleColumn_Type)
		}
	}

}

package nl.dslmeinte.xtext.simpleDb.validation

import com.google.inject.Inject
import com.simlike.simscript.util.XtextUtil
import nl.dslmeinte.xtext.simpleDb.extensions.SimpleDbExtensions
import nl.dslmeinte.xtext.simpleDb.simpleDbDsl.IntLiteral
import nl.dslmeinte.xtext.simpleDb.simpleDbDsl.SimpleColumn
import nl.dslmeinte.xtext.simpleDb.simpleDbDsl.SimpleDbDslPackage
import nl.dslmeinte.xtext.simpleDb.simpleDbDsl.Table
import org.eclipse.xtext.validation.Check

class SimpleDbDslXtendValidator extends AbstractSimpleDbDslJavaValidator {

	@Inject extension SimpleDbExtensions
	@Inject extension XtextUtil

	private SimpleDbDslPackage ePackage = SimpleDbDslPackage::eINSTANCE

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

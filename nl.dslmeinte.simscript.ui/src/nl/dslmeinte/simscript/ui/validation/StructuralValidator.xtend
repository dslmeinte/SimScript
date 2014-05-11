package nl.dslmeinte.simscript.ui.validation

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.types.TypeExtensions
import nl.dslmeinte.simscript.ui.extensions.ExpressionExtensions
import nl.dslmeinte.simscript.ui.extensions.StructuralExtensions
import nl.dslmeinte.simscript.ui.extensions.ViewableExtensions
import nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration
import nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable
import nl.dslmeinte.simscript.ui.simUiDsl.UiModule
import nl.dslmeinte.simscript.ui.simUiDsl.ValueDeclaration
import nl.dslmeinte.simscript.ui.types.TypeCalculator
import nl.dslmeinte.simscript.util.XtextUtil
import org.eclipse.xtext.validation.Check

import static nl.dslmeinte.simscript.ui.simUiDsl.ValueSpecificationTypes.*

@Singleton
class StructuralValidator extends ValidatorSupport {

	@Inject extension TypeCalculator
	@Inject extension TypeExtensions
	@Inject extension StructuralExtensions
	@Inject extension ViewableExtensions
	@Inject extension ExpressionExtensions

	@Inject extension XtextUtil


	@Check
	def void check_at_least_one_screen(UiModule it) {
		if( firstScreen == null ) {
			error("UI module must have at least one screen", this)
		}
	}

	@Check
	def void warn_if_body_has_no_elements(DefinedViewable it) {
		if( elements.size == 0 ) {
			warning( (if(screen) "screen" else "component") + " is useless without elements", ePackage.viewable_Name )
		}
	}

	@Check
	def void check_well_definedness_of(ValueDeclaration it) {
		switch valueSpecificationType {
			case INITIALIZATION: {
				if( declaredType == null && valueExpr == null ) {
					error("variable declaration must have either a declared type, a defined initialisation value (or both)", this)
				}
			}
			case INVARIANT: {
				if( valueExpr == null ) {
					error("derived value must have a declared expression", this)
				} else {
					if( !valueExpr.isObservable ) {
						error("derived value must have an observable expression", this)
					}
				}
			}
		}
	}

	@Check
	def void check_declared_type_is_compatible_with_initialisation_value(AbstractValueDeclaration it) {
		if( valueExpr != null && declaredType != null ) {
			val initType = valueExpr.type
			if( !declaredType.typeCompatible(valueExpr) ) {
				error(
					'''declared type («declaredType.toLiteral») must be compatible with type («initType.toLiteral») of value'''.toString,
					ePackage.abstractValueDeclaration_DeclaredType
				)
			}
		}
	}

}

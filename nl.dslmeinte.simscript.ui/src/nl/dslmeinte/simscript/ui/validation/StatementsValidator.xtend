package nl.dslmeinte.simscript.ui.validation

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.types.TypeExtensions
import nl.dslmeinte.simscript.ui.extensions.ExpressionExtensions
import nl.dslmeinte.simscript.ui.extensions.StructuralExtensions
import nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOperator
import nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement
import nl.dslmeinte.simscript.ui.simUiDsl.CredentialArgument
import nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement
import nl.dslmeinte.simscript.ui.simUiDsl.IfStatement
import nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement
import nl.dslmeinte.simscript.ui.simUiDsl.PrincipalArgument
import nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock
import nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite
import nl.dslmeinte.simscript.ui.types.TypeCalculator
import nl.dslmeinte.simscript.util.XtextUtil
import org.eclipse.xtext.validation.Check

import static nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOperator.*

@Singleton
class StatementsValidator extends ValidatorSupport {

	@Inject extension TypeCalculator
	@Inject extension TypeExtensions
	@Inject extension StructuralExtensions
	@Inject extension ExpressionExtensions

	@Inject extension XtextUtil


	@Check
	def void warn_for_empty_statement_block(StatementBlock it) {
		if( statements.empty ) {
			warning("empty statement block is useless", this)
		}
	}

	@Check
	def void check_lhs_is_a_valid_l_value(AssignmentOrExpressionStatement it) {
		if( rhs != null && !lhs.isLValue ) {
			error("lhs must be a valid l-value", ePackage.assignmentOrExpressionStatement_Lhs)
		}
	}

	@Check
	def void check_lhs_is_list_typed_if_add_operator_is_used(AssignmentOrExpressionStatement it) {
		if( rhs != null && operator == AssignmentOperator.ADD ) {
			if( !lhs.type.listTyped ) {
				error("lhs must be list-typed if you are using the += operator", ePackage.assignmentOrExpressionStatement_Lhs)
			}
		}
	}

	@Check
	def void check_lhs_is_type_compatible_with_rhs(AssignmentOrExpressionStatement it) {
		if( rhs != null ) {
			if( switch operator {
					case ASSIGN:	!lhs.type.isAssignableFrom(rhs.type)
					case ADD:		lhs.type.listTyped && !lhs.type.listItemType.isAssignableFrom(rhs.type)
					default:		throw new IllegalArgumentException("cannot handle AssignmentOperator " + operator.name())
				} )
			{
				error('''lhs must be type-compatible with rhs: «lhs.type.toLiteral» (l) vs. «rhs.type.toLiteral» (r)'''.toString, ePackage.assignmentOrExpressionStatement_Rhs)
			}
		}
	}

	@Check
	def void check_authentication(GotoModuleStatement it) {
		val authenticatedContext = containingModule.authenticated
		if (authenticate) {
			// check if we try to reauthenticate
			if( authenticatedContext ) {
				warning("already in authenticated context: don't need to re-authenticate", ePackage.gotoModuleStatement_Authenticate)
			}
		}
		
		if( targetModule.authenticated ) {	// target requires authentication
			if( !(authenticatedContext || authenticate) ) {
				error("target module requires authentication but current module does not and no authentication is invoked", ePackage.gotoModuleStatement_TargetModule)
			}
		} else {
			if( authenticate ) {
				warning("target module doesn't require authentication", ePackage.gotoModuleStatement_Authenticate)
			}
			// TODO  issue warning for leaving authenticated context?
		}
	}

	@Check
	def void check_type_of_authentication_principal(PrincipalArgument it) {
		if (!principal.type.isAssignableFrom(valueExpr.type)) {
			error(
				'''can't assign «valueExpr.type.toLiteral» to principal «principal.name» of type «principal.type.toLiteral»'''.toString,
				ePackage.principalArgument_ValueExpr
			)
		}
	}

	@Check
	def void check_type_of_authentication_credential(CredentialArgument it) {
		if (!credential.type.isAssignableFrom(valueExpr.type)) {
			error(
				'''can't assign «valueExpr.type.toLiteral» to credential «credential.name» of type «credential.type.toLiteral»'''.toString,
				ePackage.principalArgument_ValueExpr
			)
		}
	}

	@Check
	def void check_condition_is_a_Boolean_expression(IfStatement it) {
		if( !condition.type.booleanTyped ) {
			error("condition of an if-statement must be boolean-typed", ePackage.ifStatement_Condition)
		}
	}

	@Check
	def void check_parameter_argument_mapping(ViewableCallSite it) {
		val unmappedParameters =		viewable.parameters.filter[ p | it.arguments.filter[ a | a.parameter == p ].size == 0 ]
		val doublyMappedParameters =	viewable.parameters.filter[ p | it.arguments.filter[ a | a.parameter == p ].size > 1 ]
		if( !unmappedParameters.empty ) {
			error("the following parameters do not receive arguments: " + unmappedParameters.map[name].join(', '), ePackage.viewableCallSite_ArgumentList)
		}
		for( parameter : doublyMappedParameters ) {
			val duplicateArguments = it.arguments.filter[ a | a.parameter == parameter ]
			for( argument : duplicateArguments ) {
				argument.error('''duplicate argument for parameter "«parameter.name»"''', this)
			}
		}
	}

	@Check
	def void check_list_remove_statements(ListRemoveStatement it) {
		if( listExpr.type.listTyped ) {
			if( !listExpr.type.listItemType.structureTyped ) {
				error('''list expression must yield a structure-typed list (instead of a «listExpr.type.listItemType.toLiteral»)'''.toString, ePackage.listRemoveStatement_ListExpr)
			}
		} else {
			error('''list expression must yield a list (instead of a «listExpr.type.toLiteral»)'''.toString, ePackage.listRemoveStatement_ListExpr)
		}

		if( feature != null && !feature.type.isAssignableFrom(valueExpr.type) ) {
			error('''value expression is not type-compatible with feature type: «feature.type.toLiteral» (f) vs. «valueExpr.type.toLiteral» (v)'''.toString, ePackage.listRemoveStatement_ValueExpr)
		}
	}

	@Check
	def void check_GotoModuleStatement_has_required_parameters(GotoModuleStatement it) {
	    for( parameter : targetModule.firstScreen.parameters ) {
	        if( !args.arguments.map[parameter].contains(parameter) ) {
	            error('''you must suply parameter «parameter.name»'''.toString, ePackage.gotoModuleStatement_Args)
	        }
	    }
	}

}

package nl.dslmeinte.simscript.ui.validation

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.backend.simBackendDsl.Interface
import nl.dslmeinte.simscript.backend.simBackendDsl.NamedServiceReference
import nl.dslmeinte.simscript.types.TypeExtensions
import nl.dslmeinte.simscript.ui.extensions.ExpressionExtensions
import nl.dslmeinte.simscript.ui.extensions.MethodExtensions
import nl.dslmeinte.simscript.ui.extensions.ServiceExtensions
import nl.dslmeinte.simscript.ui.extensions.StructuralExtensions
import nl.dslmeinte.simscript.ui.simUiDsl.AdditiveExpression
import nl.dslmeinte.simscript.ui.simUiDsl.AdditiveOperators
import nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement
import nl.dslmeinte.simscript.ui.simUiDsl.BooleanBinaryOperatorExpression
import nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression
import nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement
import nl.dslmeinte.simscript.ui.simUiDsl.CallbackErrorResponseExpression
import nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression
import nl.dslmeinte.simscript.ui.simUiDsl.CallbackResponseExpression
import nl.dslmeinte.simscript.ui.simUiDsl.Comparator
import nl.dslmeinte.simscript.ui.simUiDsl.ComparisonExpression
import nl.dslmeinte.simscript.ui.simUiDsl.DecisionCase
import nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression
import nl.dslmeinte.simscript.ui.simUiDsl.Expression
import nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression
import nl.dslmeinte.simscript.ui.simUiDsl.FeatureAssignment
import nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression
import nl.dslmeinte.simscript.ui.simUiDsl.ListLiteralExpression
import nl.dslmeinte.simscript.ui.simUiDsl.Method
import nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression
import nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeExpression
import nl.dslmeinte.simscript.ui.simUiDsl.NotExpression
import nl.dslmeinte.simscript.ui.simUiDsl.ReferenceExpression
import nl.dslmeinte.simscript.ui.simUiDsl.SelectionExpression
import nl.dslmeinte.simscript.ui.simUiDsl.StructureCreationExpression
import nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression
import nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement
import nl.dslmeinte.simscript.ui.simUiDsl.ValueDeclaration
import nl.dslmeinte.simscript.ui.types.TypeCalculator
import nl.dslmeinte.simscript.util.XtextUtil
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.ValidationMessageAcceptor

import static nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctions.*
import nl.dslmeinte.simscript.ui.simUiDsl.ValueSpecificationTypes

@Singleton
class ExpressionsValidator extends ValidatorSupport {

	@Inject extension TypeCalculator
	@Inject extension TypeExtensions
	@Inject extension ExpressionExtensions
	@Inject extension MethodExtensions
	@Inject extension StructuralExtensions
	@Inject extension ServiceExtensions

	@Inject extension XtextUtil


	@Check
	def void check_types_of_members_of_ternary_operator(TernaryExpression it) {
		if( !guard.type.booleanTyped ) {
			error("guard of ternary operator must be boolean-typed", ePackage.ternaryExpression_Guard)
		}
		if( !thenExpr.type.isAssignableFrom(elseExpr.type) ) {
			error(
				'''then and else members of ternary operator must be type-compatible: «thenExpr.type.toLiteral» (then) vs. «elseExpr.type.toLiteral» (else)'''.toString,
				ePackage.ternaryExpression_ElseExpr
			)
		}
	}

	@Check
	def void check_operands_of_boolean_binary_operators_are_boolean_typed(BooleanBinaryOperatorExpression it) {
		if( !leftOperand.type.booleanTyped ) {
			error("operand of boolean binary operator must be boolean-typed", ePackage.binaryOperatorExpression_LeftOperand)
		}
		if( !rightOperand.type.booleanTyped ) {
			error("operand of boolean binary operator must be boolean-typed", ePackage.binaryOperatorExpression_RightOperand)
		}
	}

	@Check
	def void check_types_of_operands_of(ComparisonExpression it) {
		if (comparator == Comparator.IS_IN) {
			if (!rightOperand.type.listTyped) {
				error(
					'the right operand of the isIn comparison should be list-typed',
					ePackage.binaryOperatorExpression_RightOperand
				)
			} else if (!leftOperand.type.isAssignableFrom(rightOperand.type.listItemType)) {
				error(
					'the left operand of the isIn comparator should be assignable from ' + rightOperand.type.listItemType.toLiteral,
					ePackage.binaryOperatorExpression_LeftOperand
				)
			}
		} else {
			if( !(leftOperand.type.isAssignableFrom(rightOperand.type)) ) {
				error(
					'''operands must be type-compatible: «leftOperand.type.toLiteral» (l) vs. «rightOperand.type.toLiteral» (r)'''.toString,
					ePackage.binaryOperatorExpression_LeftOperand
				)
			}
			leftOperand.checkIsComparable(ePackage.binaryOperatorExpression_LeftOperand)
			rightOperand.checkIsComparable(ePackage.binaryOperatorExpression_RightOperand)
		}
	}

	def private void checkIsComparable(Expression it, EReference reference) {
		if( !(type.numericallyTyped || type.textuallyTyped || type.enumerationTyped) ) {
			error("operand of comparative expression must be comparably-typed (Integer, Number, String, Text or an enumeration)", eContainer, reference, ValidationMessageAcceptor.INSIGNIFICANT_INDEX)
		}
	}

	@Check
	def void check_type_compatibility_additive_binary_operator(AdditiveExpression it) {
		if( operator == AdditiveOperators.PLUS ) {
			// Note: we check that a concatenation of strings starts with a string, so mapping to JS is easy.
			if( leftOperand.type.numericallyTyped ) {
				rightOperand.checkIsNumerical(ePackage.binaryOperatorExpression_RightOperand)
			} else if( leftOperand.type.textuallyTyped ) {
				rightOperand.checkIsAddable(ePackage.binaryOperatorExpression_RightOperand)
			} else {
				leftOperand.checkIsAddable(ePackage.binaryOperatorExpression_LeftOperand)
				rightOperand.checkIsAddable(ePackage.binaryOperatorExpression_RightOperand)
			}
		} else {
			leftOperand.checkIsNumerical(ePackage.binaryOperatorExpression_LeftOperand)
			rightOperand.checkIsNumerical(ePackage.binaryOperatorExpression_RightOperand)
		}
	}

	@Check
	def void check_type_compatibility_multiplicative_binary_operator(MultiplicativeExpression it) {
		leftOperand.checkIsNumerical(ePackage.binaryOperatorExpression_LeftOperand)
		rightOperand.checkIsNumerical(ePackage.binaryOperatorExpression_RightOperand)
	}

	def private void checkIsNumerical(Expression it, EReference reference) {
		if( !type.numericallyTyped ) {
			error("operand of arithmetic expression must be numerically-typed (Integer or Number)", eContainer, reference, ValidationMessageAcceptor.INSIGNIFICANT_INDEX)
		}
	}

	def private void checkIsAddable(Expression it, EReference reference) {
		if( !(type.numericallyTyped || type.textuallyTyped) ) {
			error("operand of additive expression must be addably-typed (Integer, Number, String or Text)", eContainer, reference, ValidationMessageAcceptor.INSIGNIFICANT_INDEX)
		}
	}

	@Check
	def check_not_operand_is_boolean(NotExpression it) {
		if( !operand.type.booleanTyped ) {
			error("operand must be boolean-typed instead of " + operand.type.toLiteral, ePackage.notExpression_Operand)
		}
	}

	@Check
	def void check_argument_count_matches_parameters(InterfaceCallExpression it) {
		if( serviceId.interface ) {
			if( ((serviceId  as NamedServiceReference).service as Interface).inputType == null && input != null ) {
				error("this interface has no input type, so there is no sense in giving it stuff", ePackage.interfaceCallExpression_Input)
			}
		}
	}

	@Check
	def void check_parameters_and_arguments_are_type_compatible(InterfaceCallExpression it) {
		// if it's a legacy servlet we can't say anything about type compatibility:
		if( serviceId.legacyServlet && input != null ) {
			warning("can't determine input types of legacy servlets", ePackage.interfaceCallExpression_Input)
		}
		// ASSUMES that if inputType == null, it means the service expected no input (or was a legacy servlet, which was handled above):
		else if( serviceId.inputType != null && !serviceId.inputType.isAssignableFrom(input.type) ) {
			error(
				'''input to interface call must be type-compatible with declared input type: «serviceId.inputType.toLiteral» (param) vs. «input.type.toLiteral» (arg)'''.toString,
				ePackage.interfaceCallExpression_Input
			)
		}
	}

	@Check
	def void check_interface_call_expression_is_only_used_in_an_asynchronous_context(InterfaceCallExpression it) {
		switch eContainer {
			Expression:			error("interface cannot be called inside an expression", this)
			ValueDeclaration:	if( (eContainer as ValueDeclaration).valueSpecificationType != ValueSpecificationTypes.INITIALIZATION ) {
									error("interface can only be called as initialisation of a variable", this)
								}
			AssignmentOrExpressionStatement:
								/* it's OK */ {}
			default:			error("interface can only be called asynchronously (hint: use callback)", this)
		}
	}


	/*
	@Check
	def check_crud_service_is_defined_somewhere(CrudServiceIdentification crudServiceId) {
		val allBackendModels = crudServiceId.eResource.resourceSet.resources.map[contents.head].filter(typeof(BackendModel))
		// This would work only if BackendModel had incoming references, but they only have outgoing references...
		val allCrudServices = allBackendModels.map[declarations.filter(typeof(CrudService))].flatten
		val halfMatchingCrudServices = allCrudServices.filter[it.structure == crudServiceId.structure]
		if( halfMatchingCrudServices.size == 0 ) {
			error("no CRUD service defined for structure " + crudServiceId.structure.name, ePackage.crudServiceIdentification_Structure)
		} else {
			val crudTypeName = crudServiceId.crudType.name
			if( !halfMatchingCrudServices.exists[it.services.map[ t | t.name ].contains(crudTypeName)] ) {
				error("no CRUD defined for structure " + crudServiceId.structure.name + " which provide CRUD type " + crudTypeName, ePackage.crudServiceIdentification_CrudType)
			}
		}
	}
	 */

	@Check
	def void check_feature_access_operator_invoked_on_something_having_features(FeatureAccessExpression it) {
		val hasFeatures = switch it {
			ReferenceExpression:		true
			FeatureAccessExpression:	true
			SelectionExpression:		true
			default:					false
		}
		if( !hasFeatures ) {
			error("feature access operator ('.') can only be invoked on something having features", ePackage.featureAccessExpression_Previous)
		}
	}

	@Check
	def void check_selection_only_used_within_onSelect_callback(SelectionExpression it) {
		if( containerHaving(typeof(CalendarElement)) == null && containerHaving(typeof(TimeSlotListElement)) == null ) {
			error("selection expression may only be used within a callback within a calendar statement", this)
		}
	}

	@Check
	def void check_argument_of(BuiltinFunctionExpression it) {
		switch function {
			case ALERT:		checkForPopup
			case CONFIRM:	checkForPopup
			case TO_MILLIS: if( !argument.type.dateTyped ) {
								error("argument of toMillis function must be date-typed", ePackage.builtinFunctionExpression_Argument)
							}
			case ROUND:		if( !argument.type.numberTyped ) {
								error("argument of round function must be number-typed", ePackage.builtinFunctionExpression_Argument)
							}
			case IS_SET:	if( argument.type.structureTyped ) {
								warning("isSet of a structure is always true (null objects do not quite exist in observable JS space)", ePackage.builtinFunctionExpression_Argument)
							}
			case IS_VALID:	if( !argument.type.emailTyped ) {
								error("argument of isValid function must be email-typed", ePackage.builtinFunctionExpression_Argument)
							}
			case ID:		if( !argument.type.structureTyped ) {
								error("argument of id function must be structure-typed", ePackage.builtinFunctionExpression_Argument)
							}
			case COPY_OF,
			case SORT:		{ /* do nothing */ }
		}
		if( function != SORT && sortFeature != null ) {
			error("sort feature can only be specified for the sort function", ePackage.builtinFunctionExpression_SortFeature)
		}
	}

	def private void checkForPopup(BuiltinFunctionExpression it) {
		if( !argument.type.textuallyTyped ) {
			error("argument of " + function.literal + " must be textually-typed", ePackage.builtinFunctionExpression_Argument)
		}
		warning("use of " + function.literal + " is quasi-deprecated: use show-modal instead", ePackage.builtinFunctionExpression_Function)
	}


	@Check
	def void check_members_of_a_list_literal_expression_are_type_compatible(ListLiteralExpression it) {
		if( members.size > 1 ) {
			val firstMemberType = members.head.type
			members.drop(1).forEach[
				if( !firstMemberType.isAssignableFrom(it.type) ) {
					it.error("member not type-compatible with first member", this)
				}
			]
		}
	}

	@Check
	def void check_callback_values_may_only_be_used_within_callbacks(CallbackErrorResponseExpression it) {
		if( containerHaving(typeof(CallbackExpression)) == null ) {
			error("callback error response may only be used within a callback", this)
		}
	}

	@Check
	def void check_callback_values_may_only_be_used_within_callbacks(CallbackResponseExpression it) {
		if( containerHaving(typeof(CallbackExpression)) == null ) {
			error("callback response may only be used within a callback", this)
		}
	}

	@Check
	def void check_assignments_and_features_are_1_to_1(StructureCreationExpression it) {
		val duplicateAssignees = structure.features.filter[ f | assignments.filter[ a | a.feature == f ].size > 1 ]
		if( duplicateAssignees.size > 0 ) {
			error(
				"the following features were duplicately assigned in structure creation: " + duplicateAssignees.map[name].join(", "),
				ePackage.structureCreationExpression_Assignments
			)
		}
	}

	@Check
	def void check_feature_assignment_has_type_compatibility(FeatureAssignment it) {
		if( !feature.type.typeCompatible(valueExpr) ) {
			error(
				'''feature must be type-compatible with assigned value: «feature.type.toLiteral» (f) vs. «valueExpr.type.toLiteral» (v)'''.toString,
				ePackage.featureAssignment_ValueExpr
			)
		}
	}

	@Check
	def void check_method_call_references_a_method(MethodCallExpression it) {
		if( !(methodRef.ref instanceof Method) ) {
			error("method call must reference a method", ePackage.methodCallExpression_MethodRef)
		}
	}

	@Check
	def void check_parameters_and_arguments_are_1_to_1(MethodCallExpression it) {
		check_parameters_and_arguments_are_1_to_1(method.definition.parameters, it.arguments, "method", ePackage.methodCallExpression_MethodRef, ePackage.methodCallExpression_ArgumentList)
	}

	@Check
	def void check_reference_expression_cannot_reference_a_method(ReferenceExpression it) {
		if( ref instanceof Method && !(eContainer instanceof MethodCallExpression) ) {
			error("method can only be referenced by a method call (use parentheses)", this)
		}
	}

	@Check
	def void check_decision_expression_has_cases_and_valid_default(DecisionExpression it) {
		if( cases.empty ) {
			warning("decision expression is useless without cases", this)
		}
		if( defaultValueExpr != null && !type.isAssignableFrom(defaultValueExpr.type) ) {
			error('''default value expression is not type-compatible with return type: «type.toLiteral» (r) vs. «defaultValueExpr.type.toLiteral» (v)'''.toString, ePackage.decisionExpression_DefaultValueExpr)
		}
	}

	@Check
	def void check_types_in_decision_case(DecisionCase it) {
		if( !guardExpr.type.booleanTyped ) {
			error('''guard expression of decision case must be boolean-typed (instead of «guardExpr.type.toLiteral»)'''.toString, ePackage.decisionCase_GuardExpr)
		}
		val decisionExpr = eContainer.checkedCast(typeof(DecisionExpression))
		if( !decisionExpr.type.isAssignableFrom(valueExpr.type) ) {
			error('''value expression is not type-compatible with return type: «decisionExpr.type.toLiteral» (r) vs. «valueExpr.type.toLiteral» (v)'''.toString, ePackage.decisionCase_ValueExpr)
		}
	}

}

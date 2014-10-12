package nl.dslmeinte.simscript.ui.validation

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.types.Structure
import nl.dslmeinte.simscript.types.TypeExtensions
import nl.dslmeinte.simscript.ui.extensions.ExpressionExtensions
import nl.dslmeinte.simscript.ui.extensions.MethodExtensions
import nl.dslmeinte.simscript.ui.extensions.StructuralExtensions
import nl.dslmeinte.simscript.ui.extensions.ViewableExtensions
import nl.dslmeinte.simscript.ui.simUiDsl.Argument
import nl.dslmeinte.simscript.ui.simUiDsl.Binding
import nl.dslmeinte.simscript.ui.simUiDsl.BlockElement
import nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement
import nl.dslmeinte.simscript.ui.simUiDsl.ComponentInvocation
import nl.dslmeinte.simscript.ui.simUiDsl.Element
import nl.dslmeinte.simscript.ui.simUiDsl.ElementBody
import nl.dslmeinte.simscript.ui.simUiDsl.FrameElement
import nl.dslmeinte.simscript.ui.simUiDsl.ImageElement
import nl.dslmeinte.simscript.ui.simUiDsl.InputElement
import nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableElement
import nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableRow
import nl.dslmeinte.simscript.ui.simUiDsl.ListElement
import nl.dslmeinte.simscript.ui.simUiDsl.Method
import nl.dslmeinte.simscript.ui.simUiDsl.ProgressBarTabSet
import nl.dslmeinte.simscript.ui.simUiDsl.StructureOption
import nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration
import nl.dslmeinte.simscript.ui.simUiDsl.TableElement
import nl.dslmeinte.simscript.ui.simUiDsl.TableRow
import nl.dslmeinte.simscript.ui.simUiDsl.WhenElement
import nl.dslmeinte.simscript.ui.types.TypeCalculator
import nl.dslmeinte.simscript.util.XtextUtil
import org.eclipse.xtext.validation.Check

@Singleton
class ElementsValidator extends ValidatorSupport {

	@Inject extension TypeCalculator
	@Inject extension TypeExtensions
	@Inject extension StructuralExtensions
	@Inject extension ExpressionExtensions
	@Inject extension ViewableExtensions
	@Inject extension MethodExtensions

	@Inject extension XtextUtil


	@Check
	def void warn_if_body_has_no_elements(ElementBody it) {
		if( elements.size == 0 ) {
			warning("body is useless without elements", ePackage.elementBody_Elements)
		}
	}

	@Check
	def void check_component_invocation_invokes_component(ComponentInvocation it) {
		if( viewable.screen ) {
			error("can only invoke components, not screens", ePackage.viewableCallSite_Viewable)
		}
	}

	@Check
	def void check_parameters_and_arguments_are_1_to_1(ComponentInvocation it) {
		check_parameters_and_arguments_are_1_to_1(viewable.parameters, it.arguments, "embedding", ePackage.viewableCallSite_Viewable, ePackage.viewableCallSite_ArgumentList)
	}

	@Check
	def void check_argument_assignment_is_type_compatible(Argument it) {
		if( !parameter.type.isAssignableFrom(valueExpr.type) ) {
			error(
				'''parameter must be type-compatible with value: «parameter.type.toLiteral» (param) vs. «valueExpr.type.toLiteral» (arg)'''.toString,
				ePackage.argument_ValueExpr
			)
		}
	}

	@Check
	def void check_bind_site_is_primitive_typed(Binding it) {
		if( !bindSite.isObservable ) {
			error("the bind site of a binding must be observable", ePackage.binding_BindSite)
		}
	}

	@Check
	def void check_containment_within_labeled_table(LabeledTableElement it) {
		body.traverseForLabeledTable
	}

	// not @Check: "manual" traversal
	def private void check_element_inside_labeled_table(Element it) {
		switch it {
			LabeledTableRow:	{}
			ListElement:		it.body.traverseForLabeledTable
			WhenElement:		it.body.traverseForLabeledTable
				// (ListElement and WhenElement do not have a common super type having a `body`, so working off of the body's elements instead)
			default:
				error('''element (of type «eClass.name») is not allowed in the context of a labeled table in this way: embed in a list, a when or inside the row's body''', this)
		}
	}

	def private <T> void traverseForLabeledTable(ElementBody it) {
		elements.forEach[check_element_inside_labeled_table]
	}


	@Check
	def void check_button_onClick_is_callback(ButtonElement it) {
		if( !action.type.callback ) {
			error("onClick must be a Callback", ePackage.buttonElement_Action)
		}
	}

	@Check
	def void check_block_onClick_is_callback(BlockElement it) {
		if( onClick != null && !onClick.type.callback ) {
			error("onClick must be a Callback", ePackage.blockElement_OnClick)
		}
	}

	@Check
	def void check_list_element_works_on_list_expression(ListElement it) {
		if( !listExpression.type.listTyped ) {
			error('''list expression must be list-typed, but is «listExpression.type.toLiteral»'''.toString, ePackage.listElement_ListExpression)
		}
	}

	@Check
	def void warn_if_table_has_no_rows(TableElement it) {
		if( subElements.empty ) {
			warning("table is useless without rows", ePackage.tableElement_SubElements)
		}
	}

	@Check
	def void check_label_is_string_typed(TableRow it) {
		if( !label.type.stringTyped ) {
			error("label must evaluate to a String", ePackage.tableRow_Label)
		}
	}

	@Check
	def void check_label_is_string_typed(LabeledTableRow it) {
		if( !label.type.stringTyped ) {
			error("label must evaluate to a String", ePackage.labeledTableRow_Label)
		}
	}

	@Check
	def void warn_if_progress_bar_tab_set_has_no_tabs(ProgressBarTabSet it) {
		if( tabs.size == 0 ) {
			warning("tab set is useless without tabs", ePackage.progressBarTabSet_Tabs)
		}
	}

	@Check
	def void check_viewable_in_tab_is_a_component(TabDeclaration it) {
		if( viewable.screen ) {
			error("can only invoke components, not screens", ePackage.viewableCallSite_Viewable)
		}
	}

	@Check
	def void check_bind_site_of(InputElement it) {	// explicit void return type because otherwise inferred return type is Object
		if( !bindSite.isLValue ) {
			error("the bind site of an input must be a valid l-value", ePackage.inputElement_BindSite)
		}
		val type = bindSite.type
		if( !(type.simpleTyped || type.definedTyped) ) {
			error("the bind site of an input must be simple-typed (primitive, built-in), enumeration-typed or structure-typed", ePackage.inputElement_BindSite)
		}
		if( type.structureTyped && structureOption == null ) {
			error("structure options (syntax: \"source={ <source-expression> -> <display function> }\") must be present for structure-typed bind site", ePackage.inputElement_BindSite)
		}
	}

	@Check
	def void check_options_of(InputElement it) {	// explicit void return type because otherwise inferred return type is Object
		val type = bindSite.type

		if( hint != null ) {
			if( !( type.stringTyped || type.textTyped || type.emailTyped || type.integerTyped || type.numberTyped ) ) {
				warning("hint not supported (yet) for this type of input", ePackage.inputElement_Hint)
			}	// (password widget has placeholder but it's shown as *****...)
		}

		if( type.numericallyTyped ) {
			if( minValue != null && !minValue.type.numericallyTyped ) {
				error("min-value must be numerically-typed", ePackage.inputElement_MinValue)
			}
			if( maxValue != null && !maxValue.type.numericallyTyped ) {
				error("max-value must be numerically-typed", ePackage.inputElement_MaxValue)
			}
		} else {
			if( minValue != null ) {
				error("min-value can only be used with a numerically-typed bind site", ePackage.inputElement_MinValue)
			}
			if( maxValue != null ) {
				error("max-value can only be used with a numerically-typed bind site", ePackage.inputElement_MaxValue)
			}
		}

		if( radioOption != null ) {
			if( !type.booleanTyped ) {
				error("radio option is only valid for a boolean-typed bind site", ePackage.inputElement_RadioOption)
			}
		}

		if( onChange != null ) {
			if( !onChange.type.callback ) {
				error("onChange must be a Callback", ePackage.inputElement_OnChange)
			}
			warning("onChange not supported (yet)", ePackage.inputElement_OnChange)
		}

		if( onSubmit != null ) {
			if( !onSubmit.type.callback ) {
				error("onSubmit must be a Callback", ePackage.inputElement_OnSubmit)
			}
			if( !type.emailTyped ) {
				warning('''onSubmit not supported (yet) on this type («type.toLiteral»)'''.toString, ePackage.inputElement_OnSubmit)
			}
		}
	}

	@Check
	def void check_structure_option(StructureOption it) {
		val type = eContainer.checkedCast(typeof(InputElement)).bindSite.type
		if( !type.structureTyped ) {
			error("structure options can only be used with a bind site that is a structure", this)
		} else {
			if( !(sourceExpr.type.listTyped && sourceExpr.type.listItemType.structure == type.structure) ) {
				error('''source expression must be list-typed with structure «type.structure.name» as item type'''.toString, ePackage.structureOption_SourceExpr)
			}
			if( !displayFunction.isDisplayComputationFunction(type.structure) ) {
				error("display function-option does not reference a valid display computation function", ePackage.structureOption_DisplayFunction)
			}
		}
	}

	def private isDisplayComputationFunction(Method method, Structure structure) {
		val it = method.definition
		val param1 = parameters.head

		   param1 != null
		&& param1.type.structureTyped
		&& param1.type.structure == structure
		&& method.function
		&& method.returnType.stringTyped
	}

	@Check
	def void check_when_condition_is_boolean_typed(WhenElement it) {
		if( !condition.type.booleanTyped ) {
			error("condition of when-element must be boolean-typed", ePackage.whenElement_Condition)
		}
	}

	@Check
	def void check_image_arguments(ImageElement it) {
		if( !sourceUrl.type.stringTyped ) {
			error("source of image-element must be string-typed", ePackage.imageElement_SourceUrl)
		}
		if( !height.type.integerTyped) {
			error("height of image-element must be integer-typed", ePackage.imageElement_Height)
		}
		if( !width.type.integerTyped) {
			error("width of image-element must be integer-typed", ePackage.imageElement_Width)
		}
	}

	@Check
	def void check_arguments_of_iframe_element(FrameElement it) {
		if( !sourceUrl.type.stringTyped ) {
			error("source of (i)frame-element must be string-typed", ePackage.frameElement_SourceUrl)
		}
		if( width != null && !width.type.integerTyped ) {
			error("width of (i)frame-element must be integer-typed", ePackage.frameElement_Width)
		}
		if( height != null && !height.type.integerTyped ) {
			error("height of (i)frame-element must be integer-typed", ePackage.frameElement_Height)
		}
	}

}

package nl.dslmeinte.simscript.generator.ui.js.impl

import com.google.inject.Inject
import java.util.Set
import nl.dslmeinte.simscript.generator.ui.js.ElementsGenerator
import nl.dslmeinte.simscript.generator.ui.js.ExpressionsGenerator
import nl.dslmeinte.simscript.generator.ui.js.JavaScriptUtil
import nl.dslmeinte.simscript.generator.ui.js.ReturnFlags
import nl.dslmeinte.simscript.generator.ui.js.StatementsGenerator
import nl.dslmeinte.simscript.generator.ui.js.ViewableInvocationTypes
import nl.dslmeinte.simscript.types.Enumeration
import nl.dslmeinte.simscript.types.TypeExtensions
import nl.dslmeinte.simscript.ui.extensions.ExpressionExtensions
import nl.dslmeinte.simscript.ui.extensions.MethodExtensions
import nl.dslmeinte.simscript.ui.extensions.StructuralExtensions
import nl.dslmeinte.simscript.ui.extensions.ViewableExtensions
import nl.dslmeinte.simscript.ui.simUiDsl.Binding
import nl.dslmeinte.simscript.ui.simUiDsl.BlockElement
import nl.dslmeinte.simscript.ui.simUiDsl.ButtonElement
import nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement
import nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression
import nl.dslmeinte.simscript.ui.simUiDsl.ComponentInvocation
import nl.dslmeinte.simscript.ui.simUiDsl.CountdownTimer
import nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable
import nl.dslmeinte.simscript.ui.simUiDsl.Element
import nl.dslmeinte.simscript.ui.simUiDsl.ElementBody
import nl.dslmeinte.simscript.ui.simUiDsl.FrameElement
import nl.dslmeinte.simscript.ui.simUiDsl.GroupElement
import nl.dslmeinte.simscript.ui.simUiDsl.GroupOrientations
import nl.dslmeinte.simscript.ui.simUiDsl.ImageElement
import nl.dslmeinte.simscript.ui.simUiDsl.InputElement
import nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression
import nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableElement
import nl.dslmeinte.simscript.ui.simUiDsl.LabeledTableRow
import nl.dslmeinte.simscript.ui.simUiDsl.LineBreakElement
import nl.dslmeinte.simscript.ui.simUiDsl.ListElement
import nl.dslmeinte.simscript.ui.simUiDsl.ManualViewable
import nl.dslmeinte.simscript.ui.simUiDsl.MethodDefinition
import nl.dslmeinte.simscript.ui.simUiDsl.ObserveElement
import nl.dslmeinte.simscript.ui.simUiDsl.Parameter
import nl.dslmeinte.simscript.ui.simUiDsl.ProgressBarTabSet
import nl.dslmeinte.simscript.ui.simUiDsl.Quotation
import nl.dslmeinte.simscript.ui.simUiDsl.SlotAddElement
import nl.dslmeinte.simscript.ui.simUiDsl.TabDeclaration
import nl.dslmeinte.simscript.ui.simUiDsl.TableElement
import nl.dslmeinte.simscript.ui.simUiDsl.TableRow
import nl.dslmeinte.simscript.ui.simUiDsl.TableRowsDefinition
import nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation
import nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement
import nl.dslmeinte.simscript.ui.simUiDsl.TopLevelDefinition
import nl.dslmeinte.simscript.ui.simUiDsl.ValueDeclaration
import nl.dslmeinte.simscript.ui.simUiDsl.VerticalAlignment
import nl.dslmeinte.simscript.ui.simUiDsl.WhenElement
import nl.dslmeinte.simscript.ui.types.TypeCalculator
import nl.dslmeinte.simscript.util.XtextUtil

import static nl.dslmeinte.simscript.ui.simUiDsl.ValueSpecificationTypes.*

/**
 * Generates the defined layout as DOM-generating JavaScript code.
 */
// cannot be a @Singleton because of internal state, i.e.: the counters
class ElementsGeneratorImpl implements ElementsGenerator {

	@Inject extension JavaScriptUtil
	@Inject extension TypeCalculator
	@Inject extension TypeExtensions
	@Inject extension StatementsGenerator
	@Inject extension ExpressionsGenerator
	@Inject extension ExpressionExtensions
	@Inject extension ViewableExtensions
	@Inject extension StructuralExtensions
	@Inject extension MethodExtensions

	@Inject extension XtextUtil


	/**
	 * @return The JS function implementing the given {@link TopLevelDefinition}.
	 */
	override jsFunction(TopLevelDefinition it) {
		jsFunction_
	}

	private Set<Enumeration> referencedEnumerations = newHashSet

	def private dispatch CharSequence jsFunction_(ManualViewable it)
		'''
		// «type.literal» «qualifiedName» is manual

		'''

	def private dispatch CharSequence jsFunction_(DefinedViewable it)
		'''
		// «type.literal» «name»:
		«jsFunctionHead(name, parameters)» {
			«IF screen»
				container.html("");
			«ENDIF»
			«IF valuesBlock != null»
				«FOR declaration : valuesBlock.declarations»
					«declaration.definition»
				«ENDFOR»
			«ENDIF»
			«FOR element : elements»
				«element.domCreate»

			«ENDFOR»
			«FOR method : it.localMethodDefinitions»
				«method.jsFunction_»

			«ENDFOR»
		};

		'''

	def private dispatch CharSequence jsFunction_(TableRowsDefinition it)
		'''
		// table-rows «name»:
		«jsFunctionHead(name, parameters)» {
			«FOR row : rows»
				«row.tableDomCreate»
			«ENDFOR»
		}

		'''

	def private jsFunctionHead(String functionName, Iterable<Parameter> parameters)
		'''this.«functionName» = function («parameters.map[jsName + ', '].join»container)'''


	def private dispatch CharSequence jsFunction_(MethodDefinition it)
		'''
		// «IF method.function»function«ELSE»method«ENDIF» «method.name»:
		«IF method.topLevel»this.«method.name» = function«ELSE»function «method.name»«ENDIF»(«parameters.map[jsName].join(', ')») «statementBlock.asJs(ReturnFlags.canReturn)»«IF method.topLevel»;«ENDIF»

		'''

	override enumerationFunctions()
		'''
		«FOR enum_ : referencedEnumerations»
			«enum_.jsFunction»

		«ENDFOR»
		'''


	private int derivedVariableCounter = 0
	def private definition(ValueDeclaration it) {
		switch valueSpecificationType {
			case INITIALIZATION: {
				switch valueExpr {
					InterfaceCallExpression: asyncInitialisation
					default:
						'''
						var «value.jsName» = «IF valueExpr == null»new Item(«declaredType.asInitJs»)«ELSE»«valueExpr.asObservableJs»«ENDIF»;
						'''
				}
			}
			case INVARIANT: {
				derivedVariableCounter = derivedVariableCounter + 1
				'''
				var «value.jsName» = new Item(«valueExpr.type.asInitJs»);
				function derivedValueFunction«derivedVariableCounter»() { «value.jsName».load(«valueExpr.asPlainJs»); }
				«FOR observableJs : valueExpr.valuesToObserve.map[it.asObservableJs.toString].toSet»« /* (.toString is required since CharSequence.equals == Object.equals) */ »
					«observableJs».addObserver(derivedValueFunction«derivedVariableCounter»);
				«ENDFOR»
				derivedValueFunction«derivedVariableCounter»();
				'''
			}
		}
	}

	def private asyncInitialisation(ValueDeclaration it) {
		val ice = valueExpr.checkedCast(typeof(InterfaceCallExpression))
		'''
		var «value.jsName» = new Item(«valueExpr.type.asInitJs»);
		function updateFunction«value.jsName.toFirstUpper»() {
			«ice.serviceId.serviceName»(
				«IF ice.input != null»«ice.input.asObservableJs»,«ENDIF»
				globalModuleAuthenticationInfo,
				function(response, error) {«value.jsName».load(response.unwrap());},
				function() {} /* no error callback for InterfaceCallExpression */
			);
		};
		«FOR observable : valueExpr.valuesToObserve»
			«observable.asObservableJs».addObserver(function(a) { updateFunction«value.jsName.toFirstUpper»(); });
		«ENDFOR»
		updateFunction«value.jsName.toFirstUpper»();
		'''
	}


	/**
	 * @return The JS code fragment creating the DOM subtree for the given {@link Element}.
	 */
	def private CharSequence domCreate(Element it) {
		domCreate_
	}


	def private CharSequence domCreate(ElementBody it)
		'''
		«FOR element : elements»
			«element.domCreate_»
		«ENDFOR»
		'''


	/**
	 * Assumptions:
	 * 1.) The data from the Quotation expression should not be databound.
	 */
	def private dispatch CharSequence domCreate_(Quotation it)			'''container.append(document.createTextNode(«path.asObservableJs».print()));'''
		// TODO  check whether type is an enumeration: if so, use display string
		// TODO  create text node inside of span (Best Practice)

	/**
	 * Dependencies/Assumptions:
	 * 1.)	The invocation(ViewableCallSite it) method does not generate a semicolon (;).
	 */
	def private dispatch CharSequence domCreate_(ComponentInvocation it)	'''«invocation(ViewableInvocationTypes.nested)»;'''

	def private dispatch CharSequence domCreate_(LineBreakElement it) '''container.append("<br />");'''

	private int bindingCounter = 0
	def private dispatch CharSequence domCreate_(Binding it) {
		bindingCounter = bindingCounter + 1
		'''
		var bindingSpan«bindingCounter» = $('<span/>');
		var bindingFunction«bindingCounter» = function() { bindingSpan«bindingCounter».html('' + «bindSite.asPlainJs»); };
		«FOR observable : bindSite.valuesToObserve»
			«observable.asObservableJs».addObserver(bindingFunction«bindingCounter»);
		«ENDFOR»
		bindingFunction«bindingCounter»();
		container.append(bindingSpan«bindingCounter»);
		'''
	}


	def private dispatch CharSequence domCreate_(InputElement el) {
		val it = el.bindSite.type	// (named `it` so we don't have to prepend something in the switches' cases)
		val bindItem = el.bindSite.asObservableJs
		switch it {
			case stringTyped		: '''stringField(«bindItem», container, «el.hint.asJsIfNotNull»);'''
			case textTyped			: '''textField(«bindItem», container, «el.hint.asJsIfNotNull»);'''
			// Note: this works because inputs don't get arithmetic expressions as bindsite.
			// If they would, it would be impossible to know if we should use Integer or Number.
			// If we ever want to use arithmetic expressions as bindSite for inputs, intField/numField
			// might have to be reintroduced.
			case integerTyped		: '''integerField(«bindItem», container, «el.hint.asJsIfNotNull»);'''
			case numberTyped		: '''numField(«bindItem», container, «el.hint.asJsIfNotNull»);'''
			case emailTyped			: '''emailField(«bindItem», container, «el.optionsObject»);'''
			case passwordTyped		: '''passField(«bindItem», container, «el.hint.asJsIfNotNull»);'''
			case dateTyped			: '''dateField(«bindItem», container);'''
			case booleanTyped && el.radioOption == null	: '''new checkboxField(«bindItem», container);'''
			case booleanTyped		: '''new radioButtonField(«bindItem», container, '«el.radioOption.^true»', '«el.radioOption.^false»');'''
			case structureTyped		: '''new selectField(«bindItem», container, «el.structureOption.sourceExpr.asObservableJs», «el.structureOption.displayFunction.jsName»);'''
			case enumerationTyped	: {
				referencedEnumerations.add(it.enumeration)
				'''new enumField(«bindItem», container, enum_«it.enumeration.name»());'''
			}
			default:
				 el.bindSite.logProblemAndReturnJSComment('''type «el.bindSite.type.toLiteral» cannot be bound to an input element''')
		}
	}

	def private optionsObject(InputElement it)
		'''
		{
			«IF !hint.nullOrEmpty»placeholder: "«hint.escapeJS»",«ENDIF»
			«IF onSubmit != null»onSubmit: function() «(onSubmit as CallbackExpression).asJs»,«ENDIF»
			dummy: undefined«/* dummy hash item to prevent superfluous ,-problems */»
		}
		'''

	def private asJsIfNotNull(String str) {
		if( str.nullOrEmpty ) {
			"undefined"
		} else {
			'''"«str.escapeJS»"'''
		}
	}


	private int buttonCounter = 0

	def private dispatch CharSequence domCreate_(ButtonElement it) {
		buttonCounter = buttonCounter + 1
		'''
		var b«buttonCounter» = $('<input type="submit" value="«text»"/>"');
		b«buttonCounter».click(«action.asPlainJs»);
		container.append(b«buttonCounter»);
		«IF cssClass != null»b«buttonCounter».addClass("«cssClass»");«ENDIF»
		'''
	}


	private int divCounter = 0

	def private dispatch CharSequence domCreate_(BlockElement it) {
		divCounter = divCounter + 1
		val counter = divCounter
		'''
		var d«counter» = $('<div «IF style != null»style="«style»"«ENDIF»/>');
		«IF !noCss»d«counter».addClass('«IF cssClass == null»sim-ui-block«ELSE»«cssClass»«ENDIF»');«ENDIF»
		«IF onClick != null»d«counter».css("cursor", "pointer");«ENDIF»
		«IF header != null»
			var d«counter»TitleDiv = $('<div/>');
			«IF !noCss»d«counter»TitleDiv.addClass('«IF headerCssClass == null»sim-ui-block-title«ELSE»«headerCssClass»«ENDIF»');«ENDIF»
			var d«counter»HeaderTempContainer = container;
			container = d«counter»TitleDiv;
			«header.domCreate»
			container = d«counter»HeaderTempContainer;
			d«counter».append(d«counter»TitleDiv);
		«ENDIF»
		var d«counter»ContentDiv = $('<div/>');
		«IF !noCss»d«counter»ContentDiv.addClass('«IF bodyCssClass==null»sim-ui-block-body«ELSE»«bodyCssClass»«ENDIF»');«ENDIF»
		d«counter».append(d«counter»ContentDiv);
		«IF onClick != null»d«counter».click(«onClick.asPlainJs»);«ENDIF»
		container.append(d«counter»);
		var d«counter»BodyTempContainer = container;
		container = d«counter»ContentDiv;
		«body.domCreate»
		container = d«counter»BodyTempContainer;
		'''
	}


	private int groupElementCounter = 0

	def private dispatch CharSequence domCreate_(GroupElement it) {
		groupElementCounter = groupElementCounter + 1
		val counter = groupElementCounter
		'''
		/* Group */
		var groupElementTempContainer«counter» = container;
		var groupElementElementContainer«counter»;
		«FOR body : leafGroups»
			groupElementElementContainer«counter» = $('<div style="«groupOrientationStyle»«groupVAlignStyle»">');
			container.append(groupElementElementContainer«counter»);
			container = groupElementElementContainer«counter»;
			«body.domCreate»
			container = groupElementTempContainer«counter»;
		«ENDFOR»
		«FOR body : nestedGroups»
			groupElementElementContainer«counter» = $('<div «IF orientation == GroupOrientations.HORIZONTAL»style="display: inline-block;"«ENDIF»>');
			container.append(groupElementElementContainer«counter»);
			container = groupElementElementContainer«counter»;
			«body.domCreate»
			container = groupElementTempContainer«counter»;
		«ENDFOR»
		'''
	}

	def private groupOrientationStyle(GroupElement it) {
		switch orientation {
			case GroupOrientations.HORIZONTAL: '''display: inline-block;'''
			default:							''''''
		}
	}

	def private groupVAlignStyle(GroupElement it) {
		switch v_align {
			case VerticalAlignment.TOP:	'''vertical-align: top;'''
			case VerticalAlignment.MIDDLE:	'''vertical-align: middle;'''
			case VerticalAlignment.BOTTOM:	'''vertical-align: bottom;'''
		}
	}


	private int listCounter = 0

	def private dispatch CharSequence domCreate_(ListElement it) {
		listCounter = listCounter + 1
		val counter = listCounter
		'''
		// Begin ListElement
		var listDiv«counter» = $('<div>');
		container.append(listDiv«counter»);
		function list«counter»(«indexVariable.jsName», «valueVariable.jsName») {
			var container = listDiv«counter»;
			«body.domCreate»
		}
		var listOldCount«counter» = «listExpression.asObservableJs».size();
		«listExpression.asObservableJs».addObserver(function() {
			if («listExpression.asObservableJs».size() != listOldCount«counter») {
				listOldCount«counter» = «listExpression.asObservableJs».size();
				listDiv«counter».html(''); $(«listExpression.asObservableJs».toArray()).each(list«counter»);
			} 
		});
		
		listDiv«counter».html('');
		$(«listExpression.asObservableJs».toArray()).each(list«counter»);
		// End ListElement
		'''
	}


	/**
	 * Dependencies/Assumptions:
	 * 1.)	Adds the following default css classes:
	 * 	- sim-ui-table
	 * 	- default classes from domCreate_(TableRow)
	 */
	private int tableCounter = 0

	def private dispatch CharSequence domCreate_(TableElement it) {
		tableCounter = tableCounter + 1
		'''
		var table«tableCounter» = $('<div/>');
		table«tableCounter».addClass("sim-ui-table");
		container.append(table«tableCounter»);

		var tableTempContainer«tableCounter» = container;
		container = table«tableCounter»;
		«FOR subElement : subElements»
			«subElement.tableDomCreate»

		«ENDFOR»

		container = tableTempContainer«tableCounter»;
		'''
	}

	/**
	 * Dependencies/Assumptions:
	 * 1.)	Adds the following default css classes:
	 * 	- sim-ui-table-row
	 * 	- sim-ui-table-label-container
	 * 	- sim-ui-table-elements-container
	 */
	private int tableRowCounter = 0 

	def private dispatch CharSequence tableDomCreate(TableRow it) {
		tableRowCounter = tableRowCounter + 1
		val domId = '''«containingModule.name»-tableId-«tableRowCounter»'''
		'''
		var tableRow«tableRowCounter» = $('<div/>');
		tableRow«tableRowCounter».addClass("sim-ui-table-row");
		container.append(tableRow«tableRowCounter»);

		var tableLeftCol«tableRowCounter» = $('<div/>');
		tableLeftCol«tableRowCounter».addClass("sim-ui-table-label-container");
		tableRow«tableRowCounter».append(tableLeftCol«tableRowCounter»);

		var tableLabel«tableRowCounter» = $('<label/>');
		tableLabel«tableRowCounter».append(«label.asPlainJs»);
		tableLeftCol«tableRowCounter».append(tableLabel«tableRowCounter»);

		var tableRightCol«tableRowCounter» = $('<div/>');
		tableRightCol«tableRowCounter».addClass('sim-ui-table-elements-container');
		tableRow«tableRowCounter».append(tableRightCol«tableRowCounter»);

		var tableRowTempContainer«tableRowCounter» = container;
		container = tableRightCol«tableRowCounter»;

		«body.domCreate»

		container = tableRowTempContainer«tableRowCounter»;

		var tableFirstInput«tableRowCounter» = tableRightCol«tableRowCounter».find('input:first');
		if (tableFirstInput«tableRowCounter».length > 0) {
			tableFirstInput«tableRowCounter».attr('id', '«domId»');
			« /* WORKAROUND FOR DATEPICKER PLUGIN; see: http://www.nicollet.net/2011/09/jquery-datepicker-the-instance-data-bug/ */ »
			if (tableFirstInput«tableRowCounter».data('datepicker')) {
				tableFirstInput«tableRowCounter».data('datepicker').id = '«domId»';
			}
			« /* END WORKAROUND */ »
			tableLabel«tableRowCounter».attr('for', '«domId»');
		}
		'''
	}


	def private dispatch tableDomCreate(TableRowsInvocation it)
		'''
		«tableRowsInvocation»;
		'''


	/**
	 * Dependencies/Assumptions:
	 * 1.)	Adds the following default css classes:
	 * 	- sim-ui-table
	 * 	- default classes from domCreate_(TableRow)
	 */
	private int labeledTableCounter = 0

	def private dispatch CharSequence domCreate_(LabeledTableElement it) {
		labeledTableCounter = labeledTableCounter + 1
		'''
		var labeledTable«labeledTableCounter» = $('<div/>');
		labeledTable«labeledTableCounter».addClass("sim-ui-table");
		container.append(labeledTable«labeledTableCounter»);

		var labeledTableTempContainer«labeledTableCounter» = container;
		container = labeledTable«labeledTableCounter»;
		«body.domCreate»
		container = labeledTableTempContainer«labeledTableCounter»;
		'''
	}
	/*
	 * FIXME  the use of local/temp. variables doesn't always seem to work correctly or be necessary...
	 */

	/**
	 * Dependencies/Assumptions:
	 * 1.)	Adds the following default css classes:
	 * 	- sim-ui-table-row
	 * 	- sim-ui-table-label-container
	 * 	- sim-ui-table-elements-container
	 */
	private int labeledTableRowCounter = 0 

	def private dispatch CharSequence domCreate_(LabeledTableRow it) {
		labeledTableRowCounter = labeledTableRowCounter + 1
		val domId = '''«containingModule.name»-labeledTableId-«labeledTableRowCounter»'''
		'''
		var tableRow«labeledTableRowCounter» = $('<div/>');
		tableRow«labeledTableRowCounter».addClass("sim-ui-table-row");
		container.append(tableRow«labeledTableRowCounter»);

		var tableLeftCol«labeledTableRowCounter» = $('<div/>');
		tableLeftCol«labeledTableRowCounter».addClass("sim-ui-table-label-container");
		tableRow«labeledTableRowCounter».append(tableLeftCol«labeledTableRowCounter»);

		var tableLabel«labeledTableRowCounter» = $('<label/>');
		tableLabel«labeledTableRowCounter».append(«label.asPlainJs»);
		tableLeftCol«labeledTableRowCounter».append(tableLabel«labeledTableRowCounter»);

		var tableRightCol«labeledTableRowCounter» = $('<div/>');
		tableRightCol«labeledTableRowCounter».addClass('sim-ui-table-elements-container');
		tableRow«labeledTableRowCounter».append(tableRightCol«labeledTableRowCounter»);

		var tableRowTempContainer«labeledTableRowCounter» = container;
		container = tableRightCol«labeledTableRowCounter»;

		«body.domCreate»

		container = tableRowTempContainer«labeledTableRowCounter»;

		var tableFirstInput«labeledTableRowCounter» = tableRightCol«labeledTableRowCounter».find('input:first');
		if (tableFirstInput«labeledTableRowCounter».length > 0) {
			tableFirstInput«labeledTableRowCounter».attr('id', '«domId»');
			« /* WORKAROUND FOR DATEPICKER PLUGIN; see: http://www.nicollet.net/2011/09/jquery-datepicker-the-instance-data-bug/ */ »
			if (tableFirstInput«labeledTableRowCounter».data('datepicker')) {
				tableFirstInput«labeledTableRowCounter».data('datepicker').id = '«domId»';
			}
			« /* END WORKAROUND */ »
			tableLabel«labeledTableRowCounter».attr('for', '«domId»');
		}
		'''
	}


	def private dispatch CharSequence domCreate_(ProgressBarTabSet it)
		'''
		new ProgressbarTabset([
				«FOR tab : tabs SEPARATOR ', '»
					«tab.asTabsetArgument»
				«ENDFOR»
			], container
		);
		'''

	/**
	 * Dependencies/Assumptions:
	 * 1.)	Assumes the asJs(StatementBlock it) method generates '{content}', 
	 * 	so we still need to prepend the 'function()' to it.
	 */
	def private asTabsetArgument(TabDeclaration it)
		'''
		new ProgressbarTab(
			function(){
				var container = $('<div>');
				var oldContainer = container;
				«header.domCreate»
				return container;
			}, 
			function(«FOR arg : it.arguments SEPARATOR ', '»«arg.parameter.name»«ENDFOR») {
				return function(container) { «invocation(ViewableInvocationTypes.nested)»; }
			}(«FOR arg : it.arguments SEPARATOR ', '»«arg.valueExpr.asObservableJs»«ENDFOR»),
			«IF previousCallback == null»null«ELSE»function()«previousCallback.asJs»«ENDIF»,
			«IF nextCallback == null»null«ELSE»function()«nextCallback.asJs»«ENDIF»
		)
		'''

	/**
	 * Dependencies/Assumptions:
	 * 1.)	Assumes the callback.asJs generates valid, callable javascript function. 
	 */
	private int countdownCounter = 0
	def private dispatch CharSequence domCreate_(CountdownTimer it) {
		countdownCounter = countdownCounter + 1
		'''
		var countdown«countdownCounter» = new CountDown(«endTime.asPlainJs», «IF onEnd==null»function(){}«ELSE»«onEnd.asPlainJs»«ENDIF», container);
		«IF observed»«endTime.asObservableJs».addObserver(function(a) { countdown«countdownCounter».setDate(a.get()); });«ENDIF»
		'''
	}


	def private dispatch domCreate_(ObserveElement it)
		'''
		«observeExpr.asObservableJs».addObserver(function() «statementBlock.asJs(ReturnFlags.returnsVoid)» );
		'''


	private int calendarCounter = 0
	def private dispatch CharSequence domCreate_(CalendarElement it) {
		calendarCounter = calendarCounter + 1
		val counter = calendarCounter
		'''
		var calendar«counter» = $('<div>');
		calendar«counter».datepicker({
			«IF dateFormat!=null» dateFormat: "«dateFormat»",«ENDIF»
			/*TODO onselect and allowfrom*/
			onSelect : function(dateText, inst) {
				if (!«date.asPlainJs» || !DateUtil.dateEquals($(this).datepicker('getDate'), «date.asPlainJs»)) {
					«date.asObservableJs».set($(this).datepicker('getDate'));
				}
				«IF onSelect != null»
					new «onSelect.asPlainJs»();
				«ENDIF»
			}
			«IF days != null»
			, beforeShowDay : function(date) {
				if («days.asObservableJs».contains(new Item(date))) {
					return [true, '«cssClass»'];
				} else {
					return [true, ""];
				}
			}
			«ENDIF»
		});
		
		«IF days != null»
		«days.asObservableJs».addObserver(function() {
			calendar«counter».datepicker('refresh');
		});
		«ENDIF»
		
		«date.asObservableJs».addObserver(function(a){
			if (!DateUtil.dateEquals(calendar«counter».datepicker('getDate'), a.get())) {
				calendar«counter».datepicker('setDate', a.get());
			}
		});
		container.append(calendar«counter»);
		'''
	}


	private int timeslotlistCounter = 0
	def private dispatch CharSequence domCreate_(TimeSlotListElement it) {
		timeslotlistCounter = timeslotlistCounter + 1
		val counter = timeslotlistCounter
		'''
		var timeslotlist«counter» = new TimeSlotList(container);
		«IF onDelete != null»
			timeslotlist«counter».onDelete(function(slot){
				function(selection) {
					selection = new Item(selection);
					«onDelete.asPlainJs»
				}
			});
		«ENDIF»
		«slots.asObservableJs».addObserver(function(a) { timeslotlist«counter».loadSlots(a.unwrap()); });
		«IF onSelect != null»timeslotlist«counter».onSelect(function(slot){new «onSelect.asPlainJs»(new Item(slot));});«ENDIF»
		timeslotlist«counter».loadSlots(«slots.asPlainJs»);
		'''
	}
	
	def private dispatch domCreate_(SlotAddElement it) {
		'''
		timeList(«slots.asObservableJs», container, «product.asObservableJs», «day.asObservableJs», «IF startHour == null»null«ELSE»«startHour.asPlainJs»«ENDIF», «IF endHour == null»null«ELSE»«endHour.asPlainJs»«ENDIF»);
		'''
	}

	private int whenCounter = 0
	def private dispatch CharSequence domCreate_(WhenElement it) {
		whenCounter = whenCounter + 1
		val counter = whenCounter
		'''
		var when«counter» = new function(container) {
			var whenDiv = $('<div>');
			var contentsRendered = false;
			container.append(whenDiv);
			this.checkCondition = function() {
				var evalCondition = «condition.asPlainJs»;
				if( evalCondition && !contentsRendered ) {
					renderContents();
					contentsRendered = true;
				}
				whenDiv.toggle(evalCondition);
			};
			function renderContents() {
				var container = whenDiv;
				«body.domCreate»
			}
		}(container);
		«FOR observable : condition.valuesToObserve»
			«observable.asObservableJs».addObserver(when«counter».checkCondition);
		«ENDFOR»
		when«counter».checkCondition();

		'''
	}
	// TODO  fix problem with evaluation of expressions that can only be validly evaluated when the when-condition is true: only render and append contents as soon as the condition is true for the first time
	// TODO  make distinction between values that are changeable and those that are not?


	private int imageCounter = 0
	def private dispatch CharSequence domCreate_(ImageElement it) {
		imageCounter = imageCounter + 1
		val counter = imageCounter
		'''
		var image«counter» = new $('<img>');
		image«counter».attr('src', «sourceUrl.asPlainJs»);
		«IF observed»
			«FOR observable : sourceUrl.valuesToObserve»
				«observable.asObservableJs».addObserver(function() { image«counter».attr('src', «sourceUrl.asPlainJs»); });
			«ENDFOR»
		«ENDIF»
		«IF width != null»
			image«counter».width(«width.asPlainJs»);
		«ENDIF»
		«IF height != null»
			image«counter».height(«height.asPlainJs»);
		«ENDIF»
		container.append(image«counter»);
		'''
	}


	private int iframeCounter = 0
	def private dispatch CharSequence domCreate_(FrameElement it) {
		iframeCounter = iframeCounter + 1
		val counter = iframeCounter
		'''
		var iframe«counter» = new $('<iframe>');
		iframe«counter».attr('src', «sourceUrl.asPlainJs»);
		«IF width != null»
			iframe«counter».attr('width', «width.asPlainJs»);
		«ENDIF»
		«IF height != null»
			iframe«counter».attr('height', «height.asPlainJs»);
		«ENDIF»
		container.append(iframe«counter»);
		'''
	}

}

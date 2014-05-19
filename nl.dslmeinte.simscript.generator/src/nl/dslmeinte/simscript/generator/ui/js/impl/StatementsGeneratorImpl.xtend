package nl.dslmeinte.simscript.generator.ui.js.impl

import com.google.inject.Inject
import nl.dslmeinte.simscript.generator.ui.js.CommunicationsGenerator
import nl.dslmeinte.simscript.generator.ui.js.ExpressionsGenerator
import nl.dslmeinte.simscript.generator.ui.js.JavaScriptUtil
import nl.dslmeinte.simscript.generator.ui.js.ReturnFlags
import nl.dslmeinte.simscript.generator.ui.js.StatementsGenerator
import nl.dslmeinte.simscript.generator.ui.js.ViewableInvocationTypes
import nl.dslmeinte.simscript.ui.extensions.StatementExtensions
import nl.dslmeinte.simscript.ui.extensions.StructuralExtensions
import nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOperator
import nl.dslmeinte.simscript.ui.simUiDsl.AssignmentOrExpressionStatement
import nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression
import nl.dslmeinte.simscript.ui.simUiDsl.ExitModalStatement
import nl.dslmeinte.simscript.ui.simUiDsl.Expression
import nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression
import nl.dslmeinte.simscript.ui.simUiDsl.ForStatement
import nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement
import nl.dslmeinte.simscript.ui.simUiDsl.GotoScreenStatement
import nl.dslmeinte.simscript.ui.simUiDsl.IfStatement
import nl.dslmeinte.simscript.ui.simUiDsl.InterfaceCallExpression
import nl.dslmeinte.simscript.ui.simUiDsl.ListRemoveStatement
import nl.dslmeinte.simscript.ui.simUiDsl.LocalValueDeclarationStatement
import nl.dslmeinte.simscript.ui.simUiDsl.ReferenceExpression
import nl.dslmeinte.simscript.ui.simUiDsl.ShowModalStatement
import nl.dslmeinte.simscript.ui.simUiDsl.Statement
import nl.dslmeinte.simscript.ui.simUiDsl.StatementBlock
import nl.dslmeinte.simscript.ui.simUiDsl.UnsetStatement

class StatementsGeneratorImpl implements StatementsGenerator {

	@Inject extension JavaScriptUtil
	@Inject extension ExpressionsGenerator
	@Inject extension StatementExtensions
	@Inject extension StructuralExtensions


	override asJs(Statement it) {
		asJs_.toString.trim
	}
	

	override asJs(StatementBlock it, ReturnFlags returnFlag)
		'''
		{
			«FOR statement : statements»
				«IF returnFlag == ReturnFlags.canReturn && statement == statements.last && statement.hasResultValue»
					return( «statement.asJs» );
				«ELSE»
					«statement.asJs»;
				«ENDIF»
			«ENDFOR»
		}
		'''


	override asJs(CallbackExpression it) {
		statementBlock.asJs(ReturnFlags.returnsVoid)
	}

    // TODO  add checks for multiple comparators
	def private dispatch asJs_(ListRemoveStatement it) {
	    '''
	    «IF indexVariable != null»
	       «listExpr.asObservableJs».removeAt(«indexVariable.asObservableJs»);
	    «ELSE»
    	    «listExpr.asObservableJs».removeWhen(function(element){
    	        return element.get«feature.name.toFirstUpper»().compareTo(«valueExpr.asObservableJs») == 0;
    	    });
	    «ENDIF»
	    '''
	}

	/**
	 * Dependencies/Assumptions:
	 * 1.)	This method does not guarantee the validity of the lefthand or righthand side
	 * 	of the statement. The validator is responsible for throwing an error if there is an invalid expression.
	 * 2.)	This method adds a semicolon (;) to the end of the statement.
	 * 3.)	Assumes the only Expressions allowed as a Statement are the InterfaceCallExpression or MethodCallExpression.
	 * 	If any other Expressions should be allowed, add an asStatementJs method for them.
	 */
	def private dispatch asJs_(AssignmentOrExpressionStatement it) {
		if( !assignment ) {
			return lhs.asStatementJs
		}

		switch operator {
			case AssignmentOperator.ASSIGN:		lhs.asAssignmentJs(rhs)
			case AssignmentOperator.ADD:		lhs.asArrayAdditionAssignmentJs(rhs)
			case AssignmentOperator.SUB:		lhs.asArraySubtractionAssignmentJs(rhs)
		}
	}

	/**
	 * Dependencies/Assumptions:
	 * 1.)	Does no databinding. This means that instead of replacing the current feature object
	 * 	with the rhs object, it simply loads the values of the rhs into the current feature object.
	 * 	This leaves all current bindings on (features of) the feature intact.
	 * 2.)  The result type (plain object, literal or array) of rhs.asPlainJs must match the result type of asObservableJs, i.e.:
	 * 	Item <== plain object
	 * 	List <== array
	 * 	Literal <== literal
	 */
	def private dispatch asAssignmentJs(FeatureAccessExpression it, Expression rhs)		'''«asObservableJs».load(«rhs.asPlainJs»)'''	// FIXME  wrap assignment (see Trello)
	def private dispatch asAssignmentJs(ReferenceExpression it, Expression rhs)			'''«asObservableJs».load(«rhs.asPlainJs»)'''	// FIXME  wrap assignment (see Trello)

	/**
	 * Dependencies/Assumptions:
	 * 1.)	Does not databind. It simply loads values (i.e. copyOf rhs) into the the target.
	 * 2.)	Assumes items in Lists are Observable Items.
	 * 3.)	Expression it is the lefthand side and returns a List.
	 */
	def private asArrayAdditionAssignmentJs(Expression it, Expression rhs)
		'''«asObservableJs».add(new Item(«rhs.asPlainJs»))'''

	def private asArraySubtractionAssignmentJs(Expression it, Expression rhs)
		'''«asObservableJs».remove(«rhs.asObservableJs»)'''


	def private dispatch asJs_(ShowModalStatement it)	'''Modal.showModal(«invocation(ViewableInvocationTypes.modal)», «persistent»)'''

	def private dispatch asJs_(ExitModalStatement it)	'''Modal.exitModal()'''


	/**
	 * Dependencies/Assumptions:
	 * 1.)	The invocation(ViewableCallSite it) method does not generate a semicolon (;).
	 */
	def private dispatch asJs_(GotoScreenStatement it)	
	   '''
	   Modal.exitModal();« /* ensure that modal is exited whether one's active or not */ »
	   «invocation(ViewableInvocationTypes.topLevel)»
	   '''

	/**
	 * Dependencies/Assumptions:
	 * 1.)	Assumes there is an authentication servlet at the used URL
	 * 
	 * TODO: authenticate (if needed), call errorCallback in case of fail
	 * move authentication outwards if we ever introduce more than just email auth
	 */
	private int gotoModuleCounter = 0
	def private dispatch asJs_(GotoModuleStatement it) {
		gotoModuleCounter = gotoModuleCounter + 1
		'''
		Modal.exitModal();
		«IF targetModule.notAuthenticated»
			«targetModule.name».enter(null)
		«ELSEIF containingModule.notAuthenticated»
			var gotoModuleErrCallback«gotoModuleCounter» = function(response, error) «errorCallback.nullSafeAsJs»;
			$.ajax({
				url: '«CommunicationsGenerator.defaultApiBaseUrl»authenticate',
				data: {authenticationInfo:{
					type : '«authOption.name»',
					'«principal.principal.name»' : «principal.valueExpr.asPlainJs»,
					'«credential.credential.name»' : «credential.valueExpr.asPlainJs»
				}},
				dataType: 'json',
				type: 'POST',
				cache: false,
				success: function(a) { «targetModule.name».enter(«functionSignature(targetModule.firstScreen.parameters, args.arguments, "new Item(a)")»); },
				error: function() { 
					if (arguments[2]) {
						gotoModuleErrCallback«gotoModuleCounter»(null, new Item(arguments[2]));
					} else {
						gotoModuleErrCallback«gotoModuleCounter»(null, new Item('Unknown Failure!'));
					}
				}
			})
		«ELSE»
			«targetModule.name».enter(«functionSignature(targetModule.firstScreen.parameters, args.arguments, "globalModuleAuthenticationInfo")»);
		«ENDIF»'''
	}


	private int listCounter = 0

    def private dispatch asJs_(ForStatement it) {
        listCounter = listCounter + 1
        val counter = listCounter
        '''
        // Begin ListElement
        var listDiv«counter» = $('<div>');
        container.append(listDiv«counter»);
        function myFor«counter»(«indexVariable.jsName», «valueVariable.jsName») {
            console.log(«valueVariable.jsName»);
            «thenBlock.asJs(ReturnFlags.returnsVoid)»
        }
        $(«listExpression.asObservableJs».toArray()).each(myFor«counter»);
        // End ListElement
        '''
    }

	def private dispatch asJs_(IfStatement it)						'''if («condition.asPlainJs») «thenBlock.asJs(ReturnFlags.returnsVoid)» «IF elseBlock != null» else «elseBlock.asJs(ReturnFlags.returnsVoid)»«ENDIF»'''

	def private dispatch asJs_(LocalValueDeclarationStatement it)	'''var «value.jsName» = «valueExpr.asObservableJs»'''

	def private dispatch asJs_(UnsetStatement it)					'''«lhs.asObservableJs».load(null)'''	// FIXME  wrap assignment (see Trello)

	// sentinel:
	def private dispatch asJs_(Statement it)						{ logProblemAndReturnJSComment("StatementsGenerator.asJs_ called with unhandled type " + eClass.name) }


	/**
	 * Renders the JS for the InterfaceCallExpression as Statement (i.e., lone expression).
	 * 
	 * Dependencies/Assumptions:
	 * 1.)	The names for the response and error as used in the callback statements, 
	 * 	are defined in the SimUiDsl grammar as CallbackExpression.
	 * 	These names should match the argument names in the generated functions defined here.
	 * 
	 * 2.)	The order of the arguments of the generated callback functions depends on the order
	 * 	in which they are supplied by this class' functionInt(Interface it) method.
	 * 
	 * 3.)	There is assumed to be a variable called globalModulAuthenticationInfo. 
	 * 	This variable should be set after a module call with authentication paramaters. 
	 */
	def private dispatch asStatementJs(InterfaceCallExpression it) 	
		'''
		«serviceId.serviceName»(
			«IF input != null»«input.asObservableJs»,«ENDIF»
			globalModuleAuthenticationInfo,
			function(response, error) «callback.nullSafeAsJs»,
			function(response, error) «errorCallback.nullSafeAsJs»
		)
		'''

	def private nullSafeAsJs(CallbackExpression callback) {
		if( callback == null ) "{}" else callback.asJs
	}


	def private dispatch asStatementJs(Expression it)				'''«asPlainJs»'''
	/**
	 * Dependencies/Assumptions:
	 * 1.)	assumed to be used in functions as return statement.
	 * 2.)	functions are assumed to return Observable Items, so this should return an Observable Item.
	 */

}

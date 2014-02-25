package nl.dslmeinte.simscript.generator.ui.js.impl

import com.google.inject.Inject
import nl.dslmeinte.simscript.generator.ui.js.ExpressionsGenerator
import nl.dslmeinte.simscript.generator.ui.js.JavaScriptUtil
import nl.dslmeinte.simscript.generator.ui.js.ReturnFlags
import nl.dslmeinte.simscript.generator.ui.js.StatementsGenerator
import nl.dslmeinte.simscript.structure.structureDsl.CallbackLiteral
import nl.dslmeinte.simscript.ui.extensions.ExpressionExtensions
import nl.dslmeinte.simscript.ui.extensions.MethodExtensions
import nl.dslmeinte.simscript.ui.extensions.StructuralExtensions
import nl.dslmeinte.simscript.ui.simUiDsl.AdditiveExpression
import nl.dslmeinte.simscript.ui.simUiDsl.AndExpression
import nl.dslmeinte.simscript.ui.simUiDsl.ArithmeticBinaryOperatorExpression
import nl.dslmeinte.simscript.ui.simUiDsl.BooleanLiteralExpression
import nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctionExpression
import nl.dslmeinte.simscript.ui.simUiDsl.CalendarElement
import nl.dslmeinte.simscript.ui.simUiDsl.CallbackErrorResponseExpression
import nl.dslmeinte.simscript.ui.simUiDsl.CallbackExpression
import nl.dslmeinte.simscript.ui.simUiDsl.CallbackResponseExpression
import nl.dslmeinte.simscript.ui.simUiDsl.Comparator
import nl.dslmeinte.simscript.ui.simUiDsl.ComparisonExpression
import nl.dslmeinte.simscript.ui.simUiDsl.DateNowExpression
import nl.dslmeinte.simscript.ui.simUiDsl.DateTodayExpression
import nl.dslmeinte.simscript.ui.simUiDsl.DecisionExpression
import nl.dslmeinte.simscript.ui.simUiDsl.EnumerationLiteralExpression
import nl.dslmeinte.simscript.ui.simUiDsl.Expression
import nl.dslmeinte.simscript.ui.simUiDsl.FeatureAccessExpression
import nl.dslmeinte.simscript.ui.simUiDsl.IntegerLiteralExpression
import nl.dslmeinte.simscript.ui.simUiDsl.ListLiteralExpression
import nl.dslmeinte.simscript.ui.simUiDsl.MethodCallExpression
import nl.dslmeinte.simscript.ui.simUiDsl.MultiplicativeExpression
import nl.dslmeinte.simscript.ui.simUiDsl.NotExpression
import nl.dslmeinte.simscript.ui.simUiDsl.NumberLiteralExpression
import nl.dslmeinte.simscript.ui.simUiDsl.OrExpression
import nl.dslmeinte.simscript.ui.simUiDsl.ReferenceExpression
import nl.dslmeinte.simscript.ui.simUiDsl.SelectionExpression
import nl.dslmeinte.simscript.ui.simUiDsl.StringLiteralExpression
import nl.dslmeinte.simscript.ui.simUiDsl.StructureCreationExpression
import nl.dslmeinte.simscript.ui.simUiDsl.TernaryExpression
import nl.dslmeinte.simscript.ui.simUiDsl.TimeSlotListElement
import nl.dslmeinte.simscript.ui.types.TypeCalculator
import nl.dslmeinte.simscript.util.XtextUtil
import org.eclipse.emf.ecore.EObject

import static nl.dslmeinte.simscript.ui.simUiDsl.BuiltinFunctions.*

/*
 * This class could currently be @Singleton, but may want to introduce some settable state
 * regarding the context to quote text in and whether to escape for JS or HTML?		<== TODO  consider that <==
 */
class ExpressionsGeneratorImpl implements ExpressionsGenerator {

	@Inject extension JavaScriptUtil
	@Inject extension StatementsGenerator
	@Inject extension StructuralExtensions
	@Inject extension ExpressionExtensions
	@Inject extension MethodExtensions
	@Inject extension TypeCalculator

	@Inject extension XtextUtil


	/**
	 * @return JS code that represents the value given {@link Expression} in a wrapped form (which can be observed).
	 *  The wrapping is done through the use of the Item, Literal and List JS-types.
	 */
	override CharSequence asObservableJs(Expression it)	{	asObservableJs_ }

	/**
	 * @return JS code that evaluates the given {@link Expression} as a(n unwrapped) value.
	 */
	override CharSequence asPlainJs(Expression it)		{	asPlainJs_ }


	// TODO  shouldn't we directly use "new Literal()" when we already know it's going to be a literal instead of relying on new Item() to see it's a literal?

	def private dispatch CharSequence asObservableJs_(TernaryExpression it)	'''new Item(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(TernaryExpression it)		'''(«guard.asPlainJs_» ? «thenExpr.asPlainJs_» : «elseExpr.asPlainJs_»)'''

	def private dispatch CharSequence asObservableJs_(OrExpression it)	'''new Item(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(OrExpression it)		'''(«leftOperand.asPlainJs_» || «rightOperand.asPlainJs_»)'''

	def private dispatch CharSequence asObservableJs_(AndExpression it)	'''new Item(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(AndExpression it)		'''(«leftOperand.asPlainJs_» && «rightOperand.asPlainJs_»)'''

	/**
	 * Dependencies/Assumptions:
	 * 1.)	Usually only the comparison of literals makes sense.
	 * 	This implementation supports non-literal as well, but they would have to be
	 * the exact same wrapped object (i.e. Item).
	 */
	def private dispatch CharSequence asObservableJs_(ComparisonExpression it)	'''new Item(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(ComparisonExpression it) {
		if( comparator == Comparator.IS_IN ) {
			'''«rightOperand.asObservableJs».exists(function(element) { return element.compareTo(«leftOperand.asObservableJs») === 0; })'''
		} else {
			'''(«leftOperand.asObservableJs_».compareTo(«rightOperand.asObservableJs_») «comparator.asJs» 0)'''
		}
	}

	def private asJs(Comparator it) {
		switch it {
			case Comparator.EQUALS:		'''==='''
			case Comparator.NOT_EQUALS:	'''!=='''
			default:						it.literal
		}
	}

	/**
	 * Dependencies/Assumptions:
	 * 1.)	This method makes no attempt to verify whether the operands make sense as numerical expressions.
	 * 	This is left to the validator.
	 */
	def private dispatch CharSequence asObservableJs_(ArithmeticBinaryOperatorExpression it)	'''new Item(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(ArithmeticBinaryOperatorExpression it)		'''(«leftOperand.asPlainJs_» «operatorAsJs» «rightOperand.asPlainJs_»)'''
	def private dispatch operatorAsJs(AdditiveExpression it)					{ operator.literal }
	def private dispatch operatorAsJs(MultiplicativeExpression it)				{ operator.literal }
	// Note: need two dispatch functions since the `literal` properties of the sub types of ArithmeticBinaryOperatorExpression have non-matching enum types.

	def private dispatch CharSequence asObservableJs_(NotExpression it)						'''new Item(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(NotExpression it)							'''(! «operand.asPlainJs_»)'''

	/**
	 * Dependencies/Assumptions:
	 * 1.)	A FeatureAccessExpression always has a feature (i.e. it's never null). 
	 * 	Otherwise it should be a ValueReferenceExpression.
	 */
	def private dispatch CharSequence asObservableJs_(FeatureAccessExpression it)		'''«previous.asObservableJs_».get«feature.name.toFirstUpper»()'''
	def private dispatch CharSequence asPlainJs_(FeatureAccessExpression it)				'''«asObservableJs_».unwrap()'''

	def private dispatch CharSequence asObservableJs_(StringLiteralExpression it)		'''new Item(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(StringLiteralExpression it)				'''"«value.escapeJS»"'''
	def private dispatch CharSequence asObservableJs_(BooleanLiteralExpression it)		'''new Item(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(BooleanLiteralExpression it)			'''«literal.literal»'''
	def private dispatch CharSequence asObservableJs_(IntegerLiteralExpression it)		'''new Item(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(IntegerLiteralExpression it)			'''«value»'''
	def private dispatch CharSequence asObservableJs_(NumberLiteralExpression it)		'''new Item(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(NumberLiteralExpression it)				'''«value»'''
	def private dispatch CharSequence asObservableJs_(ListLiteralExpression it)			'''new List(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(ListLiteralExpression it)				'''[«FOR m : members SEPARATOR ', '»«m.asPlainJs_»«ENDFOR»]'''
	def private dispatch CharSequence asObservableJs_(EnumerationLiteralExpression it)	'''new Item(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(EnumerationLiteralExpression it)		'''"«literal.name»"'''	// FIXME  this is probably incorrect

	/**
	 * Dependencies/Assumptions:
	 * 1.)	assumes that CallbackExpressions in TimeSlotElements and CalendarElements accept selection as parameter.
	 */
	def private dispatch CharSequence asObservableJs_(CallbackExpression it)			{ asPlainJs_ }	// note: Callbacks don't return values, so they are not observable
	def private dispatch CharSequence asPlainJs_(CallbackExpression it) {
		if( containerHaving(typeof(CalendarElement)) != null || containerHaving(typeof(TimeSlotListElement)) != null ) {
			'''function(selection) «statementBlock.asJs(ReturnFlags.returnsVoid)»'''
		} else {
			'''function() «statementBlock.asJs(ReturnFlags.returnsVoid)»'''
		}
	}

	/**
	 * Dependencies/Assumptions:
	 * 1.)	assumes the response and error are Observable Items.
	 */
	def private dispatch CharSequence asObservableJs_(CallbackResponseExpression it)			'''response'''
	def private dispatch CharSequence asPlainJs_(CallbackResponseExpression it)				'''«asObservableJs_».unwrap()'''
	def private dispatch CharSequence asObservableJs_(CallbackErrorResponseExpression it)	'''error'''
	def private dispatch CharSequence asPlainJs_(CallbackErrorResponseExpression it)			'''«asObservableJs_».unwrap()'''
	def private dispatch CharSequence asObservableJs_(SelectionExpression it)				'''selection'''
	def private dispatch CharSequence asPlainJs_(SelectionExpression it)						'''«asObservableJs_».unwrap()'''

	/**
	 * Dependencies/Assumptions:
	 * 1.)	During initialisation no databinding should be done.
	 */
	def private dispatch CharSequence asObservableJs_(StructureCreationExpression it)		'''new Item(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(StructureCreationExpression it) {
		val assignedFeatures = assignments.map[feature]
		val unassignedFeatures = structure.features.filter[ f | !assignedFeatures.contains(f) ]
		'''
		{
			«FOR featureAssignment : assignments SEPARATOR ', '»
				'«featureAssignment.feature.name»' : «featureAssignment.valueExpr.asPlainJs_»
			«ENDFOR»
			«IF !assignments.empty», «ENDIF»id : null«IF !unassignedFeatures.empty», «ENDIF»
			«FOR feature : unassignedFeatures SEPARATOR ', '»
				«feature.initJs»
			«ENDFOR»
		}
		'''
	}

	def private dispatch CharSequence asObservableJs_(ReferenceExpression it)		 { it.ref.jsName }
	def private dispatch CharSequence asPlainJs_(ReferenceExpression it) {	// (need to specify return type explicitly: bug in Xtend 2.3?)
		switch type {
			CallbackLiteral:	'''«it.asObservableJs»'''
			default:			'''«it.asObservableJs_».unwrap()'''
		}
	}
	
	def private dispatch CharSequence asObservableJs_(DateNowExpression it)			'''new Item(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(DateNowExpression it)				'''new Date()'''
	def private dispatch CharSequence asObservableJs_(DateTodayExpression it)		'''new Item(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(DateTodayExpression it)				'''DateUtil.today()'''

	def private dispatch CharSequence asObservableJs_(BuiltinFunctionExpression it) {
		switch function {
			case COPY_OF:	'''new Item(«asPlainJs_»)'''
			case IS_SET:	'''new Item(«asPlainJs_»)'''
			case TO_MILLIS:	'''new Item(«asPlainJs_»)'''
			case ROUND:		'''new Item(«asPlainJs_»)'''
			case ALERT:		'''«asPlainJs_»'''				// note: alert not observable
			case CONFIRM:	'''«asPlainJs_»'''				// note: confirm not observable
			case SORT:			logProblemAndReturnJSComment('''built in function «function.getName()» only works in ExpressionsGenerator.asPlainJs_''')
			case IS_VALID:	'''new Item(«asPlainJs_»)'''
			case ID:		'''new Item(«asPlainJs_»)'''
			default:
				logProblemAndReturnJSComment('''built-in function «function.getName()» not handled in ExpressionsGenerator.asObservableJs_''')
		}
	}
	def private dispatch CharSequence asPlainJs_(BuiltinFunctionExpression it) {
		switch function {
			case COPY_OF:	'''«argument.asPlainJs_»'''
			case IS_SET:	'''(«argument.asPlainJs_» != null)'''
			case TO_MILLIS:	'''(«argument.asPlainJs_»).getTime()'''
			case ROUND:		'''Math.round(«argument.asPlainJs_»)'''
			case ALERT:		'''alert(«argument.asPlainJs_»)'''
			case CONFIRM:	'''confirm(«argument.asPlainJs_»)'''
			case SORT:		'''«argument.asObservableJs_».sort(function(item) { return item.get«sortFeature.name.toFirstUpper»(); })'''
			case IS_VALID:	logProblemAndReturnJSComment('''not implemented yet''')
			case ID:		'''«argument.asPlainJs_».id'''
			default:
				logProblemAndReturnJSComment('''built-in function «function.getName()» not handled in ExpressionsGenerator.asPlainJs_''')
		}
	}

	/**
	 * Dependencies/Assumptions:
	 * 1.)	assumes the function returns an Observable Item.
	 */
	def private dispatch CharSequence asObservableJs_(MethodCallExpression it)		'''«IF method.function»new Item(«asPlainJs_»)«ELSE»«asPlainJs_»«ENDIF»'''	// note: method calls not observable
	def private dispatch CharSequence asPlainJs_(MethodCallExpression it)			'''«method.jsName»(«functionSignature(method.definition.parameters, it.arguments)»)'''


	def private dispatch CharSequence asObservableJs_(DecisionExpression it)			'''new Item(«asPlainJs_»)'''
	def private dispatch CharSequence asPlainJs_(DecisionExpression it)
		'''
		function() {
			«FOR case_ : cases /* "^case" is not properly escaped by Xtend */ »
				if( «case_.guardExpr.asPlainJs» ) {
					return( «case_.valueExpr.asPlainJs» );
				}
			«ENDFOR»
			«IF defaultValueExpr == null»
				throw "fell through all cases and no default case present";
			«ELSE»
				return( «defaultValueExpr.asPlainJs» );
			«ENDIF»
		}()
		'''


	// sentinels:

	def private dispatch CharSequence asObservableJs_(Void it)						{ logProblemAndReturnJSComment("ExpressionsGenerator.asObservableJs_ called with null") }
	def private dispatch CharSequence asPlainJs_(Void it)							{ logProblemAndReturnJSComment("ExpressionsGenerator.asPlainJs_ called with null") }

	def private dispatch CharSequence asObservableJs_(EObject it)					{ it.logProblemAndReturnJSComment("ExpressionsGenerator.asObservableJs_ called with unhandled type " + eClass.name) }
	def private dispatch CharSequence asPlainJs_(EObject it)							{ it.logProblemAndReturnJSComment("ExpressionsGenerator.asPlainJs_ called with unhandled type " + eClass.name) }

}

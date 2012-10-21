package com.simlike.simscript.generator.ui.js.impl

import com.google.inject.Inject
import com.google.inject.Singleton
import com.simlike.simscript.generator.ui.js.ExpressionsGenerator
import com.simlike.simscript.generator.ui.js.JavaScriptUtil
import com.simlike.simscript.generator.ui.js.ViewableInvocationTypes
import com.simlike.simscript.structure.structureDsl.BuiltinTypeLiteral
import com.simlike.simscript.structure.structureDsl.BuiltinTypes
import com.simlike.simscript.structure.structureDsl.DefinedTypeLiteral
import com.simlike.simscript.structure.structureDsl.Enumeration
import com.simlike.simscript.structure.structureDsl.Feature
import com.simlike.simscript.structure.structureDsl.ListTypeLiteral
import com.simlike.simscript.structure.structureDsl.Structure
import com.simlike.simscript.structure.structureDsl.TypeLiteral
import com.simlike.simscript.structure.types.TypeExtensions
import com.simlike.simscript.ui.extensions.MethodExtensions
import com.simlike.simscript.ui.extensions.StructuralExtensions
import com.simlike.simscript.ui.simUiDsl.Argument
import com.simlike.simscript.ui.simUiDsl.CrudServiceIdentification
import com.simlike.simscript.ui.simUiDsl.DefinedViewable
import com.simlike.simscript.ui.simUiDsl.ManualViewable
import com.simlike.simscript.ui.simUiDsl.Method
import com.simlike.simscript.ui.simUiDsl.NamedServiceReference
import com.simlike.simscript.ui.simUiDsl.Parameter
import com.simlike.simscript.ui.simUiDsl.Referable
import com.simlike.simscript.ui.simUiDsl.TableRowsInvocation
import com.simlike.simscript.ui.simUiDsl.Viewable
import com.simlike.simscript.ui.simUiDsl.ViewableCallSite
import com.simlike.simscript.util.XtextUtil
import org.apache.commons.lang.StringEscapeUtils
import org.eclipse.emf.ecore.EObject

@Singleton
class JavaScriptUtilImpl implements JavaScriptUtil {

	@Inject extension TypeExtensions
	@Inject extension MethodExtensions
	@Inject extension StructuralExtensions
	@Inject extension ExpressionsGenerator

	@Inject extension XtextUtil


	override lookupIn(Parameter it, Iterable<Argument> arguments) {
		val result = arguments.findFirst[ arg | arg.parameter == it ]

		if( result == null ) {
			val message = '''couldn't look up parameter '«name»' in arguments list: [«arguments.map[parameter.name].join(', ')»]'''
//			arguments.head.logProblemWithStacktrace(message)	// for an indication of where the Parameter resides
			throw new IllegalArgumentException(message.toString)
		}

		result
	}

	override functionSignature(Iterable<Parameter> parameters, Iterable<Argument> arguments) {
		functionSignature(parameters, arguments, null)
	}

	override functionSignature(Iterable<Parameter> parameters, Iterable<Argument> arguments, CharSequence extraArgument) {
		val jsArguments = parameters.map[ parameter | parameter.lookupIn(arguments).valueExpr.asObservableJs ].toList
		if( extraArgument != null ) {
			jsArguments += extraArgument
		}
		jsArguments.join(', ')
	}


	override invocation(ViewableCallSite it, ViewableInvocationTypes invocationType)
		'''«viewable.qualifiedName»(«functionSignature(viewable.parameters, arguments, invocationType.jsExpression)»)'''


	override qualifiedName(Viewable it) {
		qualifiedName_
	}

	def private dispatch qualifiedName_(DefinedViewable it)
		'''«containingModule.name».«name»'''

	def private dispatch qualifiedName_(ManualViewable it)
		'''«namespace».«name»'''


	override tableRowsInvocation(TableRowsInvocation it)
		'''
		this.«definition.name»(«functionSignature(definition.parameters, it.arguments, "container")»)
		'''

	override jsName(Referable it)								{ "var" + name.toFirstUpper }


	/**
	 * Returns the name of the Javascript function that implements the API call to the service.
	 */
	def dispatch serviceName(NamedServiceReference it)		{ service.name }

	/**
	 * Dependencies/Assumptions:
	 * 1.)	The name of the crudservice servlet should be the same as the one generated in WebXmlGenerator.
	 * 
	 * TODO  reuse a method from the WebXmlGenerator?
	 */
	def dispatch serviceName(CrudServiceIdentification it)	'''«crudType.literal»«structure.name»'''


	def dispatch asInitJs(DefinedTypeLiteral it) {
		switch type {
			Structure:		'''{ «FOR feature : type.featuresOf»«feature.initJs», «ENDFOR» id : null }'''
			Enumeration:	'''"«type.literals.head.name»"'''	// initialise on first literal, otherwise the JS input widget might fail
		}
	}

	override initJs(Feature<? extends TypeLiteral> it)
		''''«name»' : «IF optional && type.structureTyped»null«ELSE»«type.asInitJs»«ENDIF»'''


	/**
	 * Dependencies/Assumptions:
	 * 1.)	When new BuiltinTypes are added, make an entry here too.
	 */
	def dispatch asInitJs(BuiltinTypeLiteral it) {
		switch builtin {
			case BuiltinTypes::STRING		: 'null'
			case BuiltinTypes::TEXT			: 'null'
			case BuiltinTypes::BOOLEAN		: 'null'
			case BuiltinTypes::INTEGER		: 'null'
			case BuiltinTypes::NUMBER		: 'null'
			case BuiltinTypes::DATE			: 'null'
			case BuiltinTypes::PASSWORD		: 'null'
			case BuiltinTypes::EMAIL		: 'null'
			default: {
				throw new IllegalArgumentException('''the built-in type «builtin.literal» is (as yet) unhandled in SimScript-UI'''.toString)
			}
		}
	}

	def dispatch asInitJs(ListTypeLiteral it)	'''[]'''

	def dispatch asInitJs(Void it)				{ notYetImplementedComment }


	override jsFunction(Enumeration it) {
		'''
		// enumeration «name»:
		function enum_«name»() {
			return [
				«FOR literal : literals SEPARATOR ','»
					{ name: "«literal.name.escapeJS»", description: "«literal.displayName.escapeJS»" }
				«ENDFOR»
			];
		}
		'''
	}


	override jsName(Method it) {
		if( topLevel ) {
			containingModule.name + "." + name
		} else {
			name
		}
	}


	// helper functions:

	override notYetImplementedComment()		'''/* not yet implemented! */'''

	override logProblemAndReturnJSComment(EObject it, CharSequence message) {
		logProblem(message)
		notYetImplementedComment
	}

	override logProblemAndReturnJSComment(CharSequence message) {
		System::err.println(message)
		notYetImplementedComment
	}

	override escapeJS(String str) {
		StringEscapeUtils::escapeJavaScript(str)
	}

}

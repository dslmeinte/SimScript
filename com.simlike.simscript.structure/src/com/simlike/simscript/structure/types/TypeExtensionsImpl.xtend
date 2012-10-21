package com.simlike.simscript.structure.types

import com.google.inject.Inject
import com.google.inject.Singleton
import com.simlike.simscript.structure.structureDsl.BuiltinTypeLiteral
import com.simlike.simscript.structure.structureDsl.BuiltinTypes
import com.simlike.simscript.structure.structureDsl.CallbackErrorResponseLiteral
import com.simlike.simscript.structure.structureDsl.CallbackLiteral
import com.simlike.simscript.structure.structureDsl.DefinedType
import com.simlike.simscript.structure.structureDsl.DefinedTypeLiteral
import com.simlike.simscript.structure.structureDsl.Enumeration
import com.simlike.simscript.structure.structureDsl.Feature
import com.simlike.simscript.structure.structureDsl.ListTypeLiteral
import com.simlike.simscript.structure.structureDsl.Structure
import com.simlike.simscript.structure.structureDsl.StructureDslFactory
import com.simlike.simscript.structure.structureDsl.TypeLiteral
import com.simlike.simscript.structure.structureDsl.VoidLiteral
import com.simlike.simscript.util.XtextUtil
import org.eclipse.emf.ecore.util.EcoreUtil

import static com.simlike.simscript.structure.structureDsl.BuiltinTypes.*

@Singleton
class TypeExtensionsImpl implements TypeExtensions {

	@Inject extension XtextUtil


	// built-in types:

	def private isBuiltinTyped(TypeLiteral it)		{ it instanceof BuiltinTypeLiteral }

	def private isBuiltinTypedAs(TypeLiteral it, BuiltinTypes builtintType) {
		builtinTyped && (it as BuiltinTypeLiteral).builtin == builtintType
	}

	override isBooleanTyped(TypeLiteral it)		{ isBuiltinTypedAs(BOOLEAN) }
	override isStringTyped(TypeLiteral it)		{ isBuiltinTypedAs(STRING) }
	override isTextTyped(TypeLiteral it)			{ isBuiltinTypedAs(TEXT) }
	override isIntegerTyped(TypeLiteral it)		{ isBuiltinTypedAs(INTEGER) }
	override isNumberTyped(TypeLiteral it)		{ isBuiltinTypedAs(NUMBER) }
	override isDateTyped(TypeLiteral it)			{ isBuiltinTypedAs(DATE) }
	override isPasswordTyped(TypeLiteral it)		{ isBuiltinTypedAs(PASSWORD) }
	override isEmailTyped(TypeLiteral it)		{ isBuiltinTypedAs(EMAIL) }

	/**
	 * Dependencies/Assumptions:
	 * 1.)	If any non-primitive built-ins are added, this method should be updated.
	 * 2.)	If any new built-ins are added a is<Type>Typed method should be made
	 */
	override isSimpleTyped(TypeLiteral it)		{ builtinTyped }
		/*
		 * Can't an enumeration considered to be simple-typed as well?
		 * Since this method is used in a lot of places, I'm afraid to
		 * add it just like that  -- MB 2012/06/27
		 */

	/**
	 * Dependencies/Assumptions:
	 * 1.)	update this if new BuiltinTypes are added
	 */
	override isTextuallyTyped(TypeLiteral it)	{ stringTyped || textTyped || passwordTyped || emailTyped }
	override isNumericallyTyped(TypeLiteral it)	{ integerTyped || numberTyped }


	// non-built-in types:

	override isListTyped(TypeLiteral it)			{ it instanceof ListTypeLiteral }
	override isDefinedTyped(TypeLiteral it)		{ it instanceof DefinedTypeLiteral }
	override isStructureTyped(TypeLiteral it)	{ definedTyped && (it as DefinedTypeLiteral).type instanceof Structure }
	override isEnumerationTyped(TypeLiteral it)	{ definedTyped && (it as DefinedTypeLiteral).type instanceof Enumeration }
	override isCallback(TypeLiteral it)			{ it instanceof CallbackLiteral }
	override isVaguelyTyped(TypeLiteral it)		{ listTyped && (it as ListTypeLiteral).itemType == null }
	override isVoidTyped(TypeLiteral it)			{ it instanceof VoidLiteral }

	def private isLinkedTyped(TypeLiteral it) 		{ !(simpleTyped || listTyped) }

	override listItemType(TypeLiteral it) {
		checkedCast(typeof(ListTypeLiteral)).itemType
	}

	override structure(TypeLiteral it) {
		checkedCast(typeof(DefinedTypeLiteral)).type.checkedCast(typeof(Structure))
	}

	override enumeration(TypeLiteral it) {
		checkedCast(typeof(DefinedTypeLiteral)).type.checkedCast(typeof(Enumeration))
	}


	/*
	 * +----------+
	 * | features |
	 * +----------+
	 */

	override features(TypeLiteral it) {
		features_
		// TODO  add a little verbosity to check for TypeLiteral sub types which are not covered
	}

	def private dispatch features_(CallbackLiteral it)		{ <Feature<TypeLiteral>>emptyList }
	def private dispatch features_(BuiltinTypeLiteral it)	{ <Feature<TypeLiteral>>emptyList }
	def private dispatch features_(ListTypeLiteral it)		{ <Feature<TypeLiteral>>emptyList }
	def private dispatch features_(DefinedTypeLiteral it)	{ type.featuresOf }

	def dispatch featuresOf(Structure it)	{ features }
	def dispatch featuresOf(Enumeration it)	{ <Feature<TypeLiteral>>emptyList }

	override simpleTypedFeatures(Structure it)		{ features.filter[type.simpleTyped] }
	override linkedTypedFeatures(Structure it)		{ features.filter[type.linkedTyped] }
	override listTypedFeatures(DefinedType it)		{ featuresOf.filter[type.listTyped] }
		// TODO  tweak this so this function returns Iterable<Feature<ListTypeLiteral>>
	override structureTypedFeatures(DefinedType it)	{ featuresOf.filter[type.structureTyped] }
		// TODO  tweak this so this function returns Iterable<Feature<DefinedTypeLiteral>>
	override builtinTypedFeatures(Structure it)		{ features.filter[type.builtinTyped] }
		// TODO  tweak this so this function returns Iterable<Feature<BuiltinTypeLiteral>>



	/*
	 * +--------------------+
	 * | type compatibility |
	 * +--------------------+
	 */

	/**
	 * @returns Whether a target having the first type (representation),
	 * 			can be assigned from a value having the second type (representation).
	 */

	def dispatch isAssignableFrom(CallbackLiteral target, CallbackLiteral source)							{ true }
	def dispatch isAssignableFrom(CallbackErrorResponseLiteral target, CallbackErrorResponseLiteral source)	{ true }

	def dispatch isAssignableFrom(BuiltinTypeLiteral target, CallbackErrorResponseLiteral source) {
		target.builtin == BuiltinTypes::STRING
	}

	def dispatch isAssignableFrom(BuiltinTypeLiteral target, BuiltinTypeLiteral source) {
		isAssignableFrom_(target.builtin, source.builtin)
	}

	def private isAssignableFrom_(BuiltinTypes target, BuiltinTypes source) {
		switch target {
			case EMAIL:		source == EMAIL || source == STRING
			case PASSWORD:	source == PASSWORD || source == STRING
			case TEXT:		source == TEXT || source == STRING
			case NUMBER:	source == NUMBER || source == INTEGER
			default:		source == target
		}
	}

	def dispatch isAssignableFrom(DefinedTypeLiteral target, DefinedTypeLiteral source)						{ EcoreUtil::equals(target.type, source.type) }
	def dispatch isAssignableFrom(ListTypeLiteral target, ListTypeLiteral source)							{ EcoreUtil::equals(target.itemType, source.itemType) }

	// sentinels:
	def dispatch isAssignableFrom(TypeLiteral target, TypeLiteral source)									{ false }
	def dispatch isAssignableFrom(TypeLiteral target, Void source ) {
		target.logProblem("isAssignableFrom called with source == null")
		false
	}
	def dispatch isAssignableFrom(Void target, TypeLiteral source ) {
		source.logProblem("isAssignableFrom called with target == null")
		false
	}
	def dispatch isAssignableFrom(Void target, Void source ) {
		System::err.println("WARNING		isAssignableFrom called with source, target == null; stacktrace:")
		new RuntimeException().printStackTrace(System::err)
		false
	}


	/*
	 * +-------------------+
	 * | factory functions |
	 * +-------------------+
	 */

	private StructureDslFactory eFactory = StructureDslFactory::eINSTANCE

	override createBuiltinTypeLiteral(BuiltinTypes builtinType) {
		val typeLiteral = eFactory.createBuiltinTypeLiteral
		typeLiteral.builtin = builtinType
		return typeLiteral
	}

	override createDefinedTypeLiteral(DefinedType it) {
 		val typeLiteral = eFactory.createDefinedTypeLiteral
		typeLiteral.type = it
		return typeLiteral
	}

	override createListTypeLiteral(TypeLiteral itemType) {
		val typeLiteral = eFactory.createListTypeLiteral
		typeLiteral.itemType = itemType
		return typeLiteral
	}

	override createCallbackLiteral() {
		eFactory.createCallbackLiteral
	}

	override createCallbackErrorResponseLiteral() {
		eFactory.createCallbackErrorResponseLiteral
	}

	override createVoidLiteral() {
		eFactory.createVoidLiteral
	}


	/*
	 * +-------------------+
	 * | literal verbosity |
	 * +-------------------+
	 */

	def dispatch toLiteral(BuiltinTypeLiteral it)				{ builtin.literal }
	def dispatch String toLiteral(ListTypeLiteral it)			{ '[' + ( if( it.vaguelyTyped ) "?" else itemType.toLiteral ) + ']' }
	def dispatch toLiteral(DefinedTypeLiteral it)				{ type.name }

	def dispatch toLiteral(CallbackLiteral it)					{ 'Callback' }
	def dispatch toLiteral(CallbackErrorResponseLiteral it)		{ 'Error' }
	def dispatch toLiteral(VoidLiteral it)						{ 'void' }

	def dispatch toLiteral(TypeLiteral it)						{ '''<literal-less type (Java class: «^class.simpleName»)>'''.toString }
	def dispatch toLiteral(Void it)								{ '<uncalculable type>' }

}

package nl.dslmeinte.simscript.mappings.extensions

import com.google.inject.Singleton
import nl.dslmeinte.simscript.mappings.mappingsDsl.Argument
import nl.dslmeinte.simscript.mappings.mappingsDsl.FeatureExpressionElement
import nl.dslmeinte.simscript.mappings.mappingsDsl.FeatureExpressionHead
import nl.dslmeinte.simscript.mappings.mappingsDsl.FeatureExpressionTail
import nl.dslmeinte.simscript.mappings.mappingsDsl.TypedParameter
import nl.dslmeinte.simscript.mappings.mappingsDsl.UntypedParameter
import nl.dslmeinte.simscript.types.DefinedTypeLiteral
import nl.dslmeinte.simscript.types.Feature
import nl.dslmeinte.simscript.types.Structure
import nl.dslmeinte.simscript.types.TypeLiteral

/**
 * Extension (Xtend) class which provides computed values on everything not query-like.
 */
@Singleton
class MiscellaneousExtensions {

	def features(FeatureExpressionElement it) {
		features_
	}

	def dispatch features_(FeatureExpressionHead it) {
		parameter.type.features
	}

	def dispatch features_(FeatureExpressionTail it) {
		feature.type.features
	}

	def private features(TypeLiteral it) {
		switch it {
			DefinedTypeLiteral:
				if( it.type instanceof Structure ) {
					(it.type as Structure).features
				} else {
					noFeatures
				}
			default:
				noFeatures
		}
	}

	def lookupIn(UntypedParameter it, Iterable<Argument> arguments) {
		val result = arguments.findFirst[ arg | arg.parameter == it ]

		if( result == null ) {
			val message = '''couldn't look up parameter '«name»' in arguments list: [«arguments.map[parameter.name].join(', ')»]'''
			throw new IllegalArgumentException(message.toString)
		}

		result
	}

	def private noFeatures() {
		<Feature<TypeLiteral>>emptyList
	}


	/**
	 * @return The {@link Feature} this {@link FeatureExpressionHead} points to
	 * 			or {@code null} if it doesn't point to anything beyond a {@link TypedParameter}.
	 */
	def feature(FeatureExpressionHead it) {
		if( it.tail == null ) {
			return null
		}
		var current = it.tail
		while( current.tail != null ) {
			current = current.tail
		}
		current.feature
	}

}

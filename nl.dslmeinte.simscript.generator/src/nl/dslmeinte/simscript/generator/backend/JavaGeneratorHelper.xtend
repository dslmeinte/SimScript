package nl.dslmeinte.simscript.generator.backend

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.generator.ResourceUtil
import nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypeLiteral
import nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypes
import nl.dslmeinte.simscript.structure.structureDsl.DefinedType
import nl.dslmeinte.simscript.structure.structureDsl.DefinedTypeLiteral
import nl.dslmeinte.simscript.structure.structureDsl.Feature
import nl.dslmeinte.simscript.structure.structureDsl.ListTypeLiteral
import nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral
import nl.dslmeinte.simscript.types.TypeExtensions

@Singleton
class JavaGeneratorHelper {

	@Inject extension ResourceUtil
	@Inject extension TypeExtensions


	/**
	 * Dependencies/Assumptions:
	 * 1.)	If a builtin type is added, add it here too.
	 */
	def asJavaTypeLiteral(BuiltinTypes it) {
		switch it {
			case BuiltinTypes.STRING		: "String"
			case BuiltinTypes.TEXT			: "String"
			case BuiltinTypes.BOOLEAN		: "Boolean"
			case BuiltinTypes.INTEGER		: "Integer"
			case BuiltinTypes.NUMBER		: "BigDecimal"
			// Dates are stored in an API DateString format (see the DataHelper.java framework class)
			case BuiltinTypes.DATE			: "String"
			case BuiltinTypes.EMAIL		: "String"
			case BuiltinTypes.PASSWORD		: "String"
			default: {
				println("warning: mapping built-in type " + getName() + " to String")
				"String"
			}
		}
	}


	def asJavaTypeLiteral(TypeLiteral it) {
		asJavaTypeLiteral_
	}

	def dispatch CharSequence asJavaTypeLiteral_(BuiltinTypeLiteral it) {
		builtin.asJavaTypeLiteral
	}

	def dispatch CharSequence asJavaTypeLiteral_(DefinedTypeLiteral it) {
		type.asJavaTypeLiteral
	}

	def dispatch CharSequence asJavaTypeLiteral_(ListTypeLiteral it) {
		'''List<«itemType.asJavaTypeLiteral»>'''
	}

	def dispatch CharSequence asJavaTypeLiteral_(Void it) {	// matches null
		"void"
	}

	def asJavaTypeLiteral(DefinedType it) {
		packageName + ".data." + name
	}

	def factoryMethodQualifiedName(Feature<?> it) {
		type.factoryMethodQualifiedName
	}

	/**
	 * Dependencies/Assumptions:
	 * 1.)	Depends on the existence of a SimpleTypeFactory to convert simple types.
	 * 	Note that this SimpleTypeFactory should also be updated when new simple typed Builtins are added.
	 */
	def CharSequence factoryMethodQualifiedName(TypeLiteral it) {
		switch it {
			DefinedTypeLiteral:	'''«it.type.name».to«it.type.name»'''
			BuiltinTypeLiteral:	'''SimpleTypeFactory.to«it.builtin.literal»'''
			ListTypeLiteral:	it.itemType.factoryMethodQualifiedName
		}
	}

	def controller(Feature<?> it) {
		type.controller
	}

	def private CharSequence controller(TypeLiteral it) {
		switch it {
			BuiltinTypeLiteral:		{
				if (!simpleTyped) {
					'''«it.builtin.literal»Controller'''
				} else {
					throw new IllegalArgumentException("Simple typed features have no Controller! Called for " + it.builtin.literal);
				}
			}
			DefinedTypeLiteral:		it.type.controller
			ListTypeLiteral:		it.itemType.controller
		}
	}

	def controller(DefinedType it)
		'''«packageName + ".controllers." + name»Controller'''

}

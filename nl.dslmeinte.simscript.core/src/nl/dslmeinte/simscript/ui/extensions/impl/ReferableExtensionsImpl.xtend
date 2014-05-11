package nl.dslmeinte.simscript.ui.extensions.impl

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.types.TypeExtensions
import nl.dslmeinte.simscript.ui.extensions.ReferableExtensions
import nl.dslmeinte.simscript.ui.simUiDsl.AbstractValueDeclaration
import nl.dslmeinte.simscript.ui.simUiDsl.ListElement
import nl.dslmeinte.simscript.ui.simUiDsl.ListVariable
import nl.dslmeinte.simscript.ui.simUiDsl.LocalValueDeclarationStatement
import nl.dslmeinte.simscript.ui.simUiDsl.Value
import nl.dslmeinte.simscript.ui.simUiDsl.ValueDeclaration
import nl.dslmeinte.simscript.ui.types.TypeCalculator
import nl.dslmeinte.simscript.util.XtextUtil
import nl.dslmeinte.simscript.ui.simUiDsl.ValueSpecificationTypes

@Singleton
class ReferableExtensionsImpl implements ReferableExtensions {

	@Inject extension TypeCalculator
	@Inject extension TypeExtensions

	@Inject extension XtextUtil


	override declaration(Value it) {
		eContainer.checkedCast(typeof(AbstractValueDeclaration))
	}

	/**
	 * @return The {@link ListElement} defining the given {@link ListVariable}.
	 */
	def private definingElement(ListVariable it) {
		eContainer.checkedCast(typeof(ListElement))
	}

	override <T> ifIndexVarThenElse(ListVariable it, (ListElement) => T indexFunc, (ListElement) => T valueFunc) {
		val listElement = definingElement

		if( it == listElement.indexVariable ) {
			indexFunc.apply(listElement)
		} else {
			valueFunc.apply(listElement)
		}
	}


	override isVariable(Value it) {
		switch d: it.declaration {
			ValueDeclaration:				d.valueSpecificationType == ValueSpecificationTypes.INITIALIZATION
			LocalValueDeclarationStatement:	false
			default:						throw new IllegalArgumentException("cannot handle Value of sub type " + ^class.simpleName)
		}
	}

	override valueVariableType(ListElement it) {
		return listExpression.type.listItemType
	}

}

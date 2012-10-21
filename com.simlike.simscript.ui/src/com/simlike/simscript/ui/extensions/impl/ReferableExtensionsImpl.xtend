package com.simlike.simscript.ui.extensions.impl

import com.google.inject.Inject
import com.google.inject.Singleton
import com.simlike.simscript.structure.types.TypeExtensions
import com.simlike.simscript.ui.extensions.ReferableExtensions
import com.simlike.simscript.ui.simUiDsl.AbstractValueDeclaration
import com.simlike.simscript.ui.simUiDsl.ListElement
import com.simlike.simscript.ui.simUiDsl.ListVariable
import com.simlike.simscript.ui.simUiDsl.LocalValueDeclarationStatement
import com.simlike.simscript.ui.simUiDsl.Value
import com.simlike.simscript.ui.simUiDsl.ValueDeclaration
import com.simlike.simscript.ui.simUiDsl.ValueTypes
import com.simlike.simscript.ui.types.TypeCalculator
import com.simlike.simscript.util.XtextUtil

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
		switch declaration {
			ValueDeclaration:				declaration.valueType == ValueTypes::VARIABLE
			LocalValueDeclarationStatement:	false
		}
	}

	override isDerived(Value it) {
		switch declaration {
			ValueDeclaration:					declaration.valueType == ValueTypes::DERIVED
			LocalValueDeclarationStatement:		false
		}
	}

	override valueVariableType(ListElement it) {
		return listExpression.type.listItemType
	}

}

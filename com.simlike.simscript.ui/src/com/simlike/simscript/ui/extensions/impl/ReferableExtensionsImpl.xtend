package com.simlike.simscript.ui.extensions.impl

import com.google.inject.Inject
import com.google.inject.Singleton
import com.simlike.simscript.structure.types.TypeExtensions
import com.simlike.simscript.ui.simUiDsl.AbstractValueDeclaration
import com.simlike.simscript.ui.simUiDsl.ListElement
import com.simlike.simscript.ui.simUiDsl.ListVariable
import com.simlike.simscript.ui.simUiDsl.LocalValueDeclarationStatement
import com.simlike.simscript.ui.simUiDsl.Value
import com.simlike.simscript.ui.simUiDsl.ValueDeclaration
import com.simlike.simscript.ui.simUiDsl.ValueTypes
import com.simlike.simscript.util.XtextUtil
import com.simlike.simscript.ui.types.TypeCalculator
import com.simlike.simscript.ui.extensions.ReferableExtensions

@Singleton
class ReferableExtensionsImpl implements ReferableExtensions {

	@Inject extension TypeCalculator
	@Inject extension TypeExtensions

	@Inject extension XtextUtil


	/**
	 * Inverse of {@link VariableDeclaration}{@code .variable}.
	 */
	override declaration(Value it) {
		eContainer.checkedCast(typeof(AbstractValueDeclaration))
	}

	/**
	 * @return The {@link ListElement} defining the given {@link ListVariable}.
	 */
	def private definingElement(ListVariable it) {
		eContainer.checkedCast(typeof(ListElement))
	}

	/**
	 * Finds the {@link ListElement} which defines the given {@link ListVariable}
	 * and performs the given Xtend functions for the case when it's the index or
	 * the value variable.
	 */
	override <T> ifIndexVarThenElse(ListVariable it, (ListElement) => T indexFunc, (ListElement) => T valueFunc) {
		val listElement = definingElement

		if( it == listElement.indexVariable ) {
			indexFunc.apply(listElement)
		} else {
			valueFunc.apply(listElement)
		}
	}


	/**
	 * @return Whether this {@link Value} is variable, i.e. represents a variable.
	 */
	override isVariable(Value it) {
		switch declaration {
			ValueDeclaration:				declaration.valueType == ValueTypes::VARIABLE
			LocalValueDeclarationStatement:	false
		}
	}

	/**
	 * @return Whether this {@link Value} is derived, i.e. represents a derived value.
	 */
	override isDerived(Value it) {
		switch declaration {
			ValueDeclaration:					declaration.valueType == ValueTypes::DERIVED
			LocalValueDeclarationStatement:		false
		}
	}


	/**
	 * @return The type of the <em>value</em> {@link ListVariable} of the {@link ListElement} given.
	 */
	override valueVariableType(ListElement it) {
		return listExpression.type.listItemType
	}

}

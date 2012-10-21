package com.simlike.simscript.ui.extensions.impl

import com.google.inject.Singleton
import com.simlike.simscript.ui.extensions.ViewableExtensions
import com.simlike.simscript.ui.simUiDsl.DefinedViewable
import com.simlike.simscript.ui.simUiDsl.Element
import com.simlike.simscript.ui.simUiDsl.MethodDefinition
import com.simlike.simscript.ui.simUiDsl.Value
import com.simlike.simscript.ui.simUiDsl.Viewable
import com.simlike.simscript.ui.simUiDsl.ViewableTypes

@Singleton
class ViewableExtensionsImpl implements ViewableExtensions {

	override isScreen(Viewable it) {
		type == ViewableTypes::SCREEN
	}

	override isComponent(Viewable it) {
		type == ViewableTypes::COMPONENT
	}

	override values(DefinedViewable it) {
		if( valuesBlock == null ) {
			<Value>emptyList
		} else {
			valuesBlock.declarations.map[value]
		}
	}

	override localMethodDefinitions(DefinedViewable it) {
		definitions.filter(typeof(MethodDefinition))
	}

	override elements(DefinedViewable it) {
		definitions.filter(typeof(Element))
	}

}

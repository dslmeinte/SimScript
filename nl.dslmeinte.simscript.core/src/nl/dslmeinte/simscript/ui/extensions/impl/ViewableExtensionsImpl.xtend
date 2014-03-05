package nl.dslmeinte.simscript.ui.extensions.impl

import com.google.inject.Singleton
import nl.dslmeinte.simscript.ui.extensions.ViewableExtensions
import nl.dslmeinte.simscript.ui.simUiDsl.DefinedViewable
import nl.dslmeinte.simscript.ui.simUiDsl.Element
import nl.dslmeinte.simscript.ui.simUiDsl.MethodDefinition
import nl.dslmeinte.simscript.ui.simUiDsl.Value
import nl.dslmeinte.simscript.ui.simUiDsl.Viewable
import nl.dslmeinte.simscript.ui.simUiDsl.ViewableTypes

@Singleton
class ViewableExtensionsImpl implements ViewableExtensions {

	override isScreen(Viewable it) {
		type == ViewableTypes.SCREEN
	}

	override isComponent(Viewable it) {
		type == ViewableTypes.COMPONENT
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

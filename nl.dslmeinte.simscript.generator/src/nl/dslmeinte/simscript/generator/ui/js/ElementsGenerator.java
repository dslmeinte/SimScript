package nl.dslmeinte.simscript.generator.ui.js;

import com.google.inject.ImplementedBy;
import nl.dslmeinte.simscript.generator.ui.js.impl.ElementsGeneratorImpl;
import nl.dslmeinte.simscript.ui.simUiDsl.TopLevelDefinition;

/**
 * Generator that works on {@link TopLevelDefinition top level definitions}
 * (which technically <em>encompasses</em> {@link Element elements}) and
 * generates the required JavaScript code for that.
 * 
 * @author Meinte Boersma
 */
@ImplementedBy(ElementsGeneratorImpl.class)
public interface ElementsGenerator {

	/**
	 * @return The JS function implementing the given {@link TopLevelDefinition}.
	 */
	CharSequence jsFunction(TopLevelDefinition it);

	/**
	 * @return The JS functions for the {@link nl.dslmeinte.simscript.structure.structureDsl.Enumeration enumerations}
	 * 			used in the given {@link UiModule}.
	 */
	CharSequence enumerationFunctions();

}

package com.simlike.simscript.ui.validation;

import org.eclipse.xtext.validation.ComposedChecks;
 
/**
 * Class containing (the implementation of all) the validations for
 * {@code SimScript-UI}.
 * <p>
 * The specification for these validations can be found in the grammar and the
 * implementation functions appear in that same order.
 * 
 * @author Meinte Boersma
 */
@ComposedChecks(validators={ ElementsValidator.class, ExpressionsValidator.class, StatementsValidator.class, StructuralValidator.class })
public class SimUiDslJavaValidator extends AbstractSimUiDslJavaValidator {}

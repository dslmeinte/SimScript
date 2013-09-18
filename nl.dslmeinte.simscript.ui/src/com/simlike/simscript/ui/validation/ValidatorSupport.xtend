package nl.dslmeinte.simscript.ui.validation

import nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage
import nl.dslmeinte.simscript.ui.simUiDsl.Argument
import nl.dslmeinte.simscript.ui.simUiDsl.Parameter
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.validation.AbstractDeclarativeValidator

class ValidatorSupport extends AbstractDeclarativeValidator {

	protected SimUiDslPackage ePackage = SimUiDslPackage.eINSTANCE

  	/**
	 * This overridden method ensures that this validator is triggered for model
	 * elements whose meta classes come from other Ecore packages than the {@code
	 * SimScript-UI} one as well.
	 */
	override getEPackages() {
		newArrayList(ePackage, StructureDslPackage.eINSTANCE)
	}

	def protected void check_parameters_and_arguments_are_1_to_1(
		Iterable<Parameter> parameters, Iterable<Argument> arguments, String callDescription,
		EReference headFeature, EReference argumentsListFeature
	) {
		val unassignedParameters = parameters.filter[ p | arguments.filter[ Argument a | a.parameter == p ].size == 0 ]
		val duplicateAssignees   = parameters.filter[ p | arguments.filter[ Argument a | a.parameter == p ].size > 1 ]
		if( !unassignedParameters.empty ) {
			error(
				"the following parameters were not assigned in " + callDescription + " call: " + unassignedParameters.map[name].join(", "),
				headFeature
			)
		}
		if( !duplicateAssignees.empty ) {
			error(
				"the following parameters were duplicately assigned in " + callDescription + " call: " + duplicateAssignees.map[name].join(", "),
				argumentsListFeature
			)
		}
	}

}

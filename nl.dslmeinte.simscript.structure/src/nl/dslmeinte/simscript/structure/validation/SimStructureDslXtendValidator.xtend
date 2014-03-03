package nl.dslmeinte.simscript.structure.validation

import com.google.inject.Inject
import nl.dslmeinte.simscript.structure.structureDsl.DefinedTypeLiteral
import nl.dslmeinte.simscript.structure.structureDsl.Enumeration
import nl.dslmeinte.simscript.structure.structureDsl.Feature
import nl.dslmeinte.simscript.structure.structureDsl.ListTypeLiteral
import nl.dslmeinte.simscript.structure.structureDsl.Structure
import nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage
import nl.dslmeinte.simscript.structure.structureDsl.StructureModel
import nl.dslmeinte.simscript.structure.structureDsl.SyntheticTypeLiteral
import nl.dslmeinte.simscript.structure.structureDsl.VoidLiteral
import nl.dslmeinte.simscript.types.TypeExtensions
import nl.dslmeinte.simscript.util.XtextUtil
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.validation.Check

class SimStructureDslXtendValidator extends AbstractSimStructureDslJavaValidator {

	@Inject extension XtextUtil
	@Inject extension TypeExtensions

	private StructureDslPackage ePackage = StructureDslPackage.eINSTANCE

	@Check
	def structure_has_features(Structure it) {
		if( features.size == 0 ) {
			warning("structure is useless without features", this)
		}
	}

	@Check
	def persistent_structure_only_refers_persistents(Feature<?> it) {
		if( (eContainer as Structure).persistent && type.structureTyped ) {
			val reffedStructure = (type as DefinedTypeLiteral).type as Structure
			if( !reffedStructure.persistent ) {
				error("structures (transitively -unchecked) referred to by a persistent structure must be persistent as well", ePackage.feature_Type)
			}
		}
	}

	@Check
	def enumeration_has_literals(Enumeration it) {
		if( literals.size == 0 ) {
			warning("enumeration is useless without literals", this)
		}
	}

	// TODO  remove when 'id' is not generated in POJOs anymore
	@Check
	def feature_name_is_not_id(Feature<?> it) {
		if( name == "id" ) {
			error( "feature cannot be named 'id' (reserved keyword)", ePackage.feature_Name )
		}
	}

	@Check
	def structure_name_starts_with_upper_capital(Structure it) {
		if( !capitalized ) {
			warning( "the name of a structure should start with an upper case character", ePackage.definedType_Name )
		}
	}

	@Check
	def feature_name_starts_with_lower_capital(Feature<?> it) {
		if( !it.uncapitalized ) {
			warning( "the name of a feature should start with a lower case character", ePackage.feature_Name )
		}
	}

	@Check
	def lists_not_directly_nested(ListTypeLiteral it) {
		if( itemType.listTyped ) {
			error( "lists may not be (directly) nested", ePackage.listTypeLiteral_ItemType )
		}
	}

	@Check
	def synthetic_type_not_used_here(SyntheticTypeLiteral it) {
		if( !voidTyped && EcoreUtil.getRootContainer(it) instanceof StructureModel ) {
			error("synthetic callback types can not be used in SimScript-Structure", this)
		}
	}

	@Check
	def void_type_not_used_here(VoidLiteral it) {
		error("the void literal is synthetic and only for internal purposes and may not be used anywhere", this)
	}


	def private isCapitalized(Structure it) {
		Character.isUpperCase(name.charAt(0))
	}

	def private isUncapitalized(Feature<?> it) {
		Character.isLowerCase(name.charAt(0))
	}

}

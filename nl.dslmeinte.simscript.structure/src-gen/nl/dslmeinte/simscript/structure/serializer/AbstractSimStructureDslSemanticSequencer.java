package nl.dslmeinte.simscript.structure.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import nl.dslmeinte.simscript.structure.services.SimStructureDslGrammarAccess;
import nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.CallbackErrorResponseLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.CallbackLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.DefinedTypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.Enumeration;
import nl.dslmeinte.simscript.structure.structureDsl.EnumerationLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.Feature;
import nl.dslmeinte.simscript.structure.structureDsl.ListTypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.Structure;
import nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage;
import nl.dslmeinte.simscript.structure.structureDsl.StructureModel;
import nl.dslmeinte.simscript.structure.structureDsl.VoidLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractSimStructureDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SimStructureDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == StructureDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StructureDslPackage.BUILTIN_TYPE_LITERAL:
				if(context == grammarAccess.getBuiltinTypeLiteralRule() ||
				   context == grammarAccess.getTypeLiteralRule()) {
					sequence_BuiltinTypeLiteral(context, (BuiltinTypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case StructureDslPackage.CALLBACK_ERROR_RESPONSE_LITERAL:
				if(context == grammarAccess.getSyntheticTypeLiteralRule() ||
				   context == grammarAccess.getTypeLiteralRule()) {
					sequence_SyntheticTypeLiteral(context, (CallbackErrorResponseLiteral) semanticObject); 
					return; 
				}
				else break;
			case StructureDslPackage.CALLBACK_LITERAL:
				if(context == grammarAccess.getSyntheticTypeLiteralRule() ||
				   context == grammarAccess.getTypeLiteralRule()) {
					sequence_SyntheticTypeLiteral(context, (CallbackLiteral) semanticObject); 
					return; 
				}
				else break;
			case StructureDslPackage.DEFINED_TYPE_LITERAL:
				if(context == grammarAccess.getDefinedTypeLiteralRule() ||
				   context == grammarAccess.getTypeLiteralRule()) {
					sequence_DefinedTypeLiteral(context, (DefinedTypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case StructureDslPackage.ENUMERATION:
				if(context == grammarAccess.getDefinedTypeRule() ||
				   context == grammarAccess.getEnumerationDefinitionRule()) {
					sequence_EnumerationDefinition(context, (Enumeration) semanticObject); 
					return; 
				}
				else break;
			case StructureDslPackage.ENUMERATION_LITERAL:
				if(context == grammarAccess.getEnumerationLiteralRule()) {
					sequence_EnumerationLiteral(context, (EnumerationLiteral) semanticObject); 
					return; 
				}
				else break;
			case StructureDslPackage.FEATURE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case StructureDslPackage.LIST_TYPE_LITERAL:
				if(context == grammarAccess.getListTypeLiteralRule() ||
				   context == grammarAccess.getTypeLiteralRule()) {
					sequence_ListTypeLiteral(context, (ListTypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case StructureDslPackage.STRUCTURE:
				if(context == grammarAccess.getDefinedTypeRule() ||
				   context == grammarAccess.getStructureDefinitionRule()) {
					sequence_StructureDefinition(context, (Structure) semanticObject); 
					return; 
				}
				else break;
			case StructureDslPackage.STRUCTURE_MODEL:
				if(context == grammarAccess.getStructureModelRule()) {
					sequence_StructureModel(context, (StructureModel) semanticObject); 
					return; 
				}
				else break;
			case StructureDslPackage.VOID_LITERAL:
				if(context == grammarAccess.getSyntheticTypeLiteralRule() ||
				   context == grammarAccess.getTypeLiteralRule()) {
					sequence_SyntheticTypeLiteral(context, (VoidLiteral) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     builtin=BuiltinTypes
	 */
	protected void sequence_BuiltinTypeLiteral(EObject context, BuiltinTypeLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StructureDslPackage.Literals.BUILTIN_TYPE_LITERAL__BUILTIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StructureDslPackage.Literals.BUILTIN_TYPE_LITERAL__BUILTIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBuiltinTypeLiteralAccess().getBuiltinBuiltinTypesEnumRuleCall_0(), semanticObject.getBuiltin());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=[DefinedType|ID]
	 */
	protected void sequence_DefinedTypeLiteral(EObject context, DefinedTypeLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StructureDslPackage.Literals.DEFINED_TYPE_LITERAL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StructureDslPackage.Literals.DEFINED_TYPE_LITERAL__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefinedTypeLiteralAccess().getTypeDefinedTypeIDTerminalRuleCall_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID literals+=EnumerationLiteral*)
	 */
	protected void sequence_EnumerationDefinition(EObject context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EnumerationName displayName=STRING)
	 */
	protected void sequence_EnumerationLiteral(EObject context, EnumerationLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StructureDslPackage.Literals.ENUMERATION_LITERAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StructureDslPackage.Literals.ENUMERATION_LITERAL__NAME));
			if(transientValues.isValueTransient(semanticObject, StructureDslPackage.Literals.ENUMERATION_LITERAL__DISPLAY_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StructureDslPackage.Literals.ENUMERATION_LITERAL__DISPLAY_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumerationLiteralAccess().getNameEnumerationNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEnumerationLiteralAccess().getDisplayNameSTRINGTerminalRuleCall_2_0(), semanticObject.getDisplayName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID optional?='optional'? type=TypeLiteral)
	 */
	protected void sequence_Feature(EObject context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     itemType=TypeLiteral
	 */
	protected void sequence_ListTypeLiteral(EObject context, ListTypeLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StructureDslPackage.Literals.LIST_TYPE_LITERAL__ITEM_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StructureDslPackage.Literals.LIST_TYPE_LITERAL__ITEM_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getListTypeLiteralAccess().getItemTypeTypeLiteralParserRuleCall_1_0(), semanticObject.getItemType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID persistent?='persistent'? features+=Feature*)
	 */
	protected void sequence_StructureDefinition(EObject context, Structure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     typeDefinitions+=DefinedType*
	 */
	protected void sequence_StructureModel(EObject context, StructureModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {CallbackErrorResponseLiteral}
	 */
	protected void sequence_SyntheticTypeLiteral(EObject context, CallbackErrorResponseLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {CallbackLiteral}
	 */
	protected void sequence_SyntheticTypeLiteral(EObject context, CallbackLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {VoidLiteral}
	 */
	protected void sequence_SyntheticTypeLiteral(EObject context, VoidLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

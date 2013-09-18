package nl.dslmeinte.simscript.backend.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import nl.dslmeinte.simscript.backend.services.SimBackendDslGrammarAccess;
import nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationDeclaration;
import nl.dslmeinte.simscript.backend.simBackendDsl.AuthenticationParameter;
import nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel;
import nl.dslmeinte.simscript.backend.simBackendDsl.CrudService;
import nl.dslmeinte.simscript.backend.simBackendDsl.Interface;
import nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet;
import nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage;
import nl.dslmeinte.simscript.structure.serializer.SimStructureDslSemanticSequencer;
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
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractSimBackendDslSemanticSequencer extends SimStructureDslSemanticSequencer {

	@Inject
	private SimBackendDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SimBackendDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SimBackendDslPackage.AUTHENTICATION_DECLARATION:
				if(context == grammarAccess.getAuthenticationDeclarationRule()) {
					sequence_AuthenticationDeclaration(context, (AuthenticationDeclaration) semanticObject); 
					return; 
				}
				else break;
			case SimBackendDslPackage.AUTHENTICATION_PARAMETER:
				if(context == grammarAccess.getAuthenticationParameterRule()) {
					sequence_AuthenticationParameter(context, (AuthenticationParameter) semanticObject); 
					return; 
				}
				else break;
			case SimBackendDslPackage.BACKEND_MODEL:
				if(context == grammarAccess.getBackendModelRule()) {
					sequence_BackendModel(context, (BackendModel) semanticObject); 
					return; 
				}
				else break;
			case SimBackendDslPackage.CRUD_SERVICE:
				if(context == grammarAccess.getCrudServiceRule() ||
				   context == grammarAccess.getServiceRule()) {
					sequence_CrudService(context, (CrudService) semanticObject); 
					return; 
				}
				else break;
			case SimBackendDslPackage.INTERFACE:
				if(context == grammarAccess.getInterfaceRule() ||
				   context == grammarAccess.getNamedServiceRule() ||
				   context == grammarAccess.getServiceRule()) {
					sequence_Interface(context, (Interface) semanticObject); 
					return; 
				}
				else break;
			case SimBackendDslPackage.LEGACY_SERVLET:
				if(context == grammarAccess.getLegacyServletRule() ||
				   context == grammarAccess.getNamedServiceRule() ||
				   context == grammarAccess.getServiceRule()) {
					sequence_LegacyServlet(context, (LegacyServlet) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == StructureDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
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
	 *     (name=ID principal=AuthenticationParameter credential=AuthenticationParameter)
	 */
	protected void sequence_AuthenticationDeclaration(EObject context, AuthenticationDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SimBackendDslPackage.Literals.AUTHENTICATION_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimBackendDslPackage.Literals.AUTHENTICATION_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, SimBackendDslPackage.Literals.AUTHENTICATION_DECLARATION__PRINCIPAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimBackendDslPackage.Literals.AUTHENTICATION_DECLARATION__PRINCIPAL));
			if(transientValues.isValueTransient(semanticObject, SimBackendDslPackage.Literals.AUTHENTICATION_DECLARATION__CREDENTIAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimBackendDslPackage.Literals.AUTHENTICATION_DECLARATION__CREDENTIAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAuthenticationDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAuthenticationDeclarationAccess().getPrincipalAuthenticationParameterParserRuleCall_4_0(), semanticObject.getPrincipal());
		feeder.accept(grammarAccess.getAuthenticationDeclarationAccess().getCredentialAuthenticationParameterParserRuleCall_6_0(), semanticObject.getCredential());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=TypeLiteral)
	 */
	protected void sequence_AuthenticationParameter(EObject context, AuthenticationParameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SimBackendDslPackage.Literals.AUTHENTICATION_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimBackendDslPackage.Literals.AUTHENTICATION_PARAMETER__NAME));
			if(transientValues.isValueTransient(semanticObject, SimBackendDslPackage.Literals.AUTHENTICATION_PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimBackendDslPackage.Literals.AUTHENTICATION_PARAMETER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAuthenticationParameterAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAuthenticationParameterAccess().getTypeTypeLiteralParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((baseUrl=STRING? flavor=Flavors?)? authOpts+=AuthenticationDeclaration* declarations+=Service*)
	 */
	protected void sequence_BackendModel(EObject context, BackendModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (structure=[Structure|ID] services+=CrudTypes*)
	 */
	protected void sequence_CrudService(EObject context, CrudService semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         method=HttpMethods 
	 *         inputType=DefinedTypeLiteral? 
	 *         outputType=TypeLiteral? 
	 *         notAuthenticated?='not-authenticated'? 
	 *         legacyServlet=[LegacyServlet|ID]? 
	 *         documentation=STRING?
	 *     )
	 */
	protected void sequence_Interface(EObject context, Interface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID urlPattern=URL fqClassName=QualifiedName)
	 */
	protected void sequence_LegacyServlet(EObject context, LegacyServlet semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SimBackendDslPackage.Literals.NAMED_SERVICE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimBackendDslPackage.Literals.NAMED_SERVICE__NAME));
			if(transientValues.isValueTransient(semanticObject, SimBackendDslPackage.Literals.LEGACY_SERVLET__URL_PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimBackendDslPackage.Literals.LEGACY_SERVLET__URL_PATTERN));
			if(transientValues.isValueTransient(semanticObject, SimBackendDslPackage.Literals.LEGACY_SERVLET__FQ_CLASS_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimBackendDslPackage.Literals.LEGACY_SERVLET__FQ_CLASS_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLegacyServletAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLegacyServletAccess().getUrlPatternURLTerminalRuleCall_3_0(), semanticObject.getUrlPattern());
		feeder.accept(grammarAccess.getLegacyServletAccess().getFqClassNameQualifiedNameParserRuleCall_5_0(), semanticObject.getFqClassName());
		feeder.finish();
	}
}

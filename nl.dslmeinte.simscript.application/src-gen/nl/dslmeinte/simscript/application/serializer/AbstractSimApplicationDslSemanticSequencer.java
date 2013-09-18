package nl.dslmeinte.simscript.application.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import nl.dslmeinte.simscript.application.services.SimApplicationDslGrammarAccess;
import nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel;
import nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractSimApplicationDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SimApplicationDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SimApplicationDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SimApplicationDslPackage.APPLICATION_MODEL:
				if(context == grammarAccess.getApplicationModelRule()) {
					sequence_ApplicationModel(context, (ApplicationModel) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         title=STRING 
	 *         targetPlatform=TargetPlatforms 
	 *         includeCSSs+=STRING* 
	 *         defaultCSS?='with-default-css'? 
	 *         includedModules+=[UiModule|ID]* 
	 *         entryModule=[UiModule|ID] 
	 *         includeCustomJS+=STRING* 
	 *         cHtmlHead=STRING? 
	 *         cHtmlBody=STRING? 
	 *         genericBackButtonPrevention?='with-generic-back-button-prevention'?
	 *     )
	 */
	protected void sequence_ApplicationModel(EObject context, ApplicationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

package nl.dslmeinte.simscript.application.serializer;

import com.google.inject.Inject;
import java.util.List;
import nl.dslmeinte.simscript.application.services.SimApplicationDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractSimApplicationDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SimApplicationDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ApplicationModel_IncludeCssKeyword_7_0_q;
	protected AbstractElementAlias match_ApplicationModel_IncludeCustomJavaScriptKeyword_14_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SimApplicationDslGrammarAccess) access;
		match_ApplicationModel_IncludeCssKeyword_7_0_q = new TokenAlias(false, true, grammarAccess.getApplicationModelAccess().getIncludeCssKeyword_7_0());
		match_ApplicationModel_IncludeCustomJavaScriptKeyword_14_0_q = new TokenAlias(false, true, grammarAccess.getApplicationModelAccess().getIncludeCustomJavaScriptKeyword_14_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ApplicationModel_IncludeCssKeyword_7_0_q.equals(syntax))
				emit_ApplicationModel_IncludeCssKeyword_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ApplicationModel_IncludeCustomJavaScriptKeyword_14_0_q.equals(syntax))
				emit_ApplicationModel_IncludeCustomJavaScriptKeyword_14_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'include-css'?
	 */
	protected void emit_ApplicationModel_IncludeCssKeyword_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'include-custom-JavaScript'?
	 */
	protected void emit_ApplicationModel_IncludeCustomJavaScriptKeyword_14_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

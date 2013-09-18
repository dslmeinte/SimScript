package nl.dslmeinte.simscript.backend.serializer;

import com.google.inject.Inject;
import java.util.List;
import nl.dslmeinte.simscript.backend.services.SimBackendDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractSimBackendDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SimBackendDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BackendModel_RightCurlyBracketKeyword_1_1_1_a;
	protected AbstractElementAlias match_BackendModel___ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1_RightCurlyBracketKeyword_1_1_1_a__a;
	protected AbstractElementAlias match_BackendModel___RightCurlyBracketKeyword_1_1_1_a_ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p;
	protected AbstractElementAlias match_BackendModel___RightCurlyBracketKeyword_1_1_1_p___ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p__p;
	protected AbstractElementAlias match_BackendModel_____ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p___RightCurlyBracketKeyword_1_1_1_a___ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p__a_RightCurlyBracketKeyword_1_1_1_a__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SimBackendDslGrammarAccess) access;
		match_BackendModel_RightCurlyBracketKeyword_1_1_1_a = new TokenAlias(true, true, grammarAccess.getBackendModelAccess().getRightCurlyBracketKeyword_1_1_1());
		match_BackendModel___ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1_RightCurlyBracketKeyword_1_1_1_a__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getBackendModelAccess().getConfigKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getBackendModelAccess().getLeftCurlyBracketKeyword_1_0_1()), new TokenAlias(true, true, grammarAccess.getBackendModelAccess().getRightCurlyBracketKeyword_1_1_1()));
		match_BackendModel___RightCurlyBracketKeyword_1_1_1_a_ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p = new GroupAlias(true, false, new TokenAlias(true, true, grammarAccess.getBackendModelAccess().getRightCurlyBracketKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getBackendModelAccess().getConfigKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getBackendModelAccess().getLeftCurlyBracketKeyword_1_0_1()));
		match_BackendModel___RightCurlyBracketKeyword_1_1_1_p___ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p__p = new GroupAlias(true, false, new TokenAlias(true, false, grammarAccess.getBackendModelAccess().getRightCurlyBracketKeyword_1_1_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getBackendModelAccess().getConfigKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getBackendModelAccess().getLeftCurlyBracketKeyword_1_0_1())));
		match_BackendModel_____ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p___RightCurlyBracketKeyword_1_1_1_a___ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p__a_RightCurlyBracketKeyword_1_1_1_a__q = new GroupAlias(false, true, new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getBackendModelAccess().getConfigKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getBackendModelAccess().getLeftCurlyBracketKeyword_1_0_1())), new GroupAlias(true, true, new TokenAlias(true, true, grammarAccess.getBackendModelAccess().getRightCurlyBracketKeyword_1_1_1()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getBackendModelAccess().getConfigKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getBackendModelAccess().getLeftCurlyBracketKeyword_1_0_1()))), new TokenAlias(true, true, grammarAccess.getBackendModelAccess().getRightCurlyBracketKeyword_1_1_1()));
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
			if(match_BackendModel_RightCurlyBracketKeyword_1_1_1_a.equals(syntax))
				emit_BackendModel_RightCurlyBracketKeyword_1_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BackendModel___ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1_RightCurlyBracketKeyword_1_1_1_a__a.equals(syntax))
				emit_BackendModel___ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1_RightCurlyBracketKeyword_1_1_1_a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BackendModel___RightCurlyBracketKeyword_1_1_1_a_ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p.equals(syntax))
				emit_BackendModel___RightCurlyBracketKeyword_1_1_1_a_ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BackendModel___RightCurlyBracketKeyword_1_1_1_p___ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p__p.equals(syntax))
				emit_BackendModel___RightCurlyBracketKeyword_1_1_1_p___ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BackendModel_____ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p___RightCurlyBracketKeyword_1_1_1_a___ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p__a_RightCurlyBracketKeyword_1_1_1_a__q.equals(syntax))
				emit_BackendModel_____ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p___RightCurlyBracketKeyword_1_1_1_a___ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p__a_RightCurlyBracketKeyword_1_1_1_a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '}'*
	 */
	protected void emit_BackendModel_RightCurlyBracketKeyword_1_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('config' '{' '}'*)*
	 */
	protected void emit_BackendModel___ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1_RightCurlyBracketKeyword_1_1_1_a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}'* 'config' '{')+
	 */
	protected void emit_BackendModel___RightCurlyBracketKeyword_1_1_1_a_ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}'+ ('config' '{')+)+
	 */
	protected void emit_BackendModel___RightCurlyBracketKeyword_1_1_1_p___ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('config' '{')+ ('}'* ('config' '{')+)* '}'*)?
	 */
	protected void emit_BackendModel_____ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p___RightCurlyBracketKeyword_1_1_1_a___ConfigKeyword_1_0_0_LeftCurlyBracketKeyword_1_0_1__p__a_RightCurlyBracketKeyword_1_1_1_a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

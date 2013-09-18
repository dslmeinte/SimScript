package nl.dslmeinte.simscript.structure.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import nl.dslmeinte.simscript.structure.services.SimStructureDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimStructureDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Boolean'", "'Integer'", "'URL'", "'Text'", "'Number'", "'Email'", "'Phone'", "'Date'", "'Password'", "'structure'", "'{'", "'}'", "':'", "'enumeration'", "'->'", "'['", "']'", "'Callback'", "'Error'", "'$Void'", "'persistent'", "'optional'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSimStructureDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimStructureDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimStructureDslParser.tokenNames; }
    public String getGrammarFileName() { return "../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g"; }


     
     	private SimStructureDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SimStructureDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleStructureModel"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:60:1: entryRuleStructureModel : ruleStructureModel EOF ;
    public final void entryRuleStructureModel() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:61:1: ( ruleStructureModel EOF )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:62:1: ruleStructureModel EOF
            {
             before(grammarAccess.getStructureModelRule()); 
            pushFollow(FOLLOW_ruleStructureModel_in_entryRuleStructureModel61);
            ruleStructureModel();

            state._fsp--;

             after(grammarAccess.getStructureModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructureModel"


    // $ANTLR start "ruleStructureModel"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:69:1: ruleStructureModel : ( ( rule__StructureModel__TypeDefinitionsAssignment )* ) ;
    public final void ruleStructureModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:73:2: ( ( ( rule__StructureModel__TypeDefinitionsAssignment )* ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:74:1: ( ( rule__StructureModel__TypeDefinitionsAssignment )* )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:74:1: ( ( rule__StructureModel__TypeDefinitionsAssignment )* )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:75:1: ( rule__StructureModel__TypeDefinitionsAssignment )*
            {
             before(grammarAccess.getStructureModelAccess().getTypeDefinitionsAssignment()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:76:1: ( rule__StructureModel__TypeDefinitionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:76:2: rule__StructureModel__TypeDefinitionsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__StructureModel__TypeDefinitionsAssignment_in_ruleStructureModel94);
            	    rule__StructureModel__TypeDefinitionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getStructureModelAccess().getTypeDefinitionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructureModel"


    // $ANTLR start "entryRuleDefinedType"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:88:1: entryRuleDefinedType : ruleDefinedType EOF ;
    public final void entryRuleDefinedType() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:89:1: ( ruleDefinedType EOF )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:90:1: ruleDefinedType EOF
            {
             before(grammarAccess.getDefinedTypeRule()); 
            pushFollow(FOLLOW_ruleDefinedType_in_entryRuleDefinedType122);
            ruleDefinedType();

            state._fsp--;

             after(grammarAccess.getDefinedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinedType129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinedType"


    // $ANTLR start "ruleDefinedType"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:97:1: ruleDefinedType : ( ( rule__DefinedType__Alternatives ) ) ;
    public final void ruleDefinedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:101:2: ( ( ( rule__DefinedType__Alternatives ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:102:1: ( ( rule__DefinedType__Alternatives ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:102:1: ( ( rule__DefinedType__Alternatives ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:103:1: ( rule__DefinedType__Alternatives )
            {
             before(grammarAccess.getDefinedTypeAccess().getAlternatives()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:104:1: ( rule__DefinedType__Alternatives )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:104:2: rule__DefinedType__Alternatives
            {
            pushFollow(FOLLOW_rule__DefinedType__Alternatives_in_ruleDefinedType155);
            rule__DefinedType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefinedTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinedType"


    // $ANTLR start "entryRuleStructureDefinition"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:116:1: entryRuleStructureDefinition : ruleStructureDefinition EOF ;
    public final void entryRuleStructureDefinition() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:117:1: ( ruleStructureDefinition EOF )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:118:1: ruleStructureDefinition EOF
            {
             before(grammarAccess.getStructureDefinitionRule()); 
            pushFollow(FOLLOW_ruleStructureDefinition_in_entryRuleStructureDefinition182);
            ruleStructureDefinition();

            state._fsp--;

             after(grammarAccess.getStructureDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureDefinition189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructureDefinition"


    // $ANTLR start "ruleStructureDefinition"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:125:1: ruleStructureDefinition : ( ( rule__StructureDefinition__Group__0 ) ) ;
    public final void ruleStructureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:129:2: ( ( ( rule__StructureDefinition__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:130:1: ( ( rule__StructureDefinition__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:130:1: ( ( rule__StructureDefinition__Group__0 ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:131:1: ( rule__StructureDefinition__Group__0 )
            {
             before(grammarAccess.getStructureDefinitionAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:132:1: ( rule__StructureDefinition__Group__0 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:132:2: rule__StructureDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__StructureDefinition__Group__0_in_ruleStructureDefinition215);
            rule__StructureDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructureDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructureDefinition"


    // $ANTLR start "entryRuleFeature"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:144:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:145:1: ( ruleFeature EOF )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:146:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature242);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:153:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:157:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:158:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:158:1: ( ( rule__Feature__Group__0 ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:159:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:160:1: ( rule__Feature__Group__0 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:160:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature275);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleEnumerationDefinition"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:172:1: entryRuleEnumerationDefinition : ruleEnumerationDefinition EOF ;
    public final void entryRuleEnumerationDefinition() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:173:1: ( ruleEnumerationDefinition EOF )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:174:1: ruleEnumerationDefinition EOF
            {
             before(grammarAccess.getEnumerationDefinitionRule()); 
            pushFollow(FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition302);
            ruleEnumerationDefinition();

            state._fsp--;

             after(grammarAccess.getEnumerationDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationDefinition309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationDefinition"


    // $ANTLR start "ruleEnumerationDefinition"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:181:1: ruleEnumerationDefinition : ( ( rule__EnumerationDefinition__Group__0 ) ) ;
    public final void ruleEnumerationDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:185:2: ( ( ( rule__EnumerationDefinition__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:186:1: ( ( rule__EnumerationDefinition__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:186:1: ( ( rule__EnumerationDefinition__Group__0 ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:187:1: ( rule__EnumerationDefinition__Group__0 )
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:188:1: ( rule__EnumerationDefinition__Group__0 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:188:2: rule__EnumerationDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__0_in_ruleEnumerationDefinition335);
            rule__EnumerationDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationDefinition"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:200:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:201:1: ( ruleEnumerationLiteral EOF )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:202:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral362);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:209:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:213:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:214:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:214:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:215:1: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:216:1: ( rule__EnumerationLiteral__Group__0 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:216:2: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral395);
            rule__EnumerationLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleEnumerationName"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:228:1: entryRuleEnumerationName : ruleEnumerationName EOF ;
    public final void entryRuleEnumerationName() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:229:1: ( ruleEnumerationName EOF )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:230:1: ruleEnumerationName EOF
            {
             before(grammarAccess.getEnumerationNameRule()); 
            pushFollow(FOLLOW_ruleEnumerationName_in_entryRuleEnumerationName422);
            ruleEnumerationName();

            state._fsp--;

             after(grammarAccess.getEnumerationNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationName429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationName"


    // $ANTLR start "ruleEnumerationName"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:237:1: ruleEnumerationName : ( ( rule__EnumerationName__Alternatives ) ) ;
    public final void ruleEnumerationName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:241:2: ( ( ( rule__EnumerationName__Alternatives ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:242:1: ( ( rule__EnumerationName__Alternatives ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:242:1: ( ( rule__EnumerationName__Alternatives ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:243:1: ( rule__EnumerationName__Alternatives )
            {
             before(grammarAccess.getEnumerationNameAccess().getAlternatives()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:244:1: ( rule__EnumerationName__Alternatives )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:244:2: rule__EnumerationName__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumerationName__Alternatives_in_ruleEnumerationName455);
            rule__EnumerationName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationName"


    // $ANTLR start "entryRuleTypeLiteral"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:256:1: entryRuleTypeLiteral : ruleTypeLiteral EOF ;
    public final void entryRuleTypeLiteral() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:257:1: ( ruleTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:258:1: ruleTypeLiteral EOF
            {
             before(grammarAccess.getTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleTypeLiteral_in_entryRuleTypeLiteral482);
            ruleTypeLiteral();

            state._fsp--;

             after(grammarAccess.getTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLiteral489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeLiteral"


    // $ANTLR start "ruleTypeLiteral"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:265:1: ruleTypeLiteral : ( ( rule__TypeLiteral__Alternatives ) ) ;
    public final void ruleTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:269:2: ( ( ( rule__TypeLiteral__Alternatives ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:270:1: ( ( rule__TypeLiteral__Alternatives ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:270:1: ( ( rule__TypeLiteral__Alternatives ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:271:1: ( rule__TypeLiteral__Alternatives )
            {
             before(grammarAccess.getTypeLiteralAccess().getAlternatives()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:272:1: ( rule__TypeLiteral__Alternatives )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:272:2: rule__TypeLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeLiteral__Alternatives_in_ruleTypeLiteral515);
            rule__TypeLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeLiteral"


    // $ANTLR start "entryRuleBuiltinTypeLiteral"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:284:1: entryRuleBuiltinTypeLiteral : ruleBuiltinTypeLiteral EOF ;
    public final void entryRuleBuiltinTypeLiteral() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:285:1: ( ruleBuiltinTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:286:1: ruleBuiltinTypeLiteral EOF
            {
             before(grammarAccess.getBuiltinTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleBuiltinTypeLiteral_in_entryRuleBuiltinTypeLiteral542);
            ruleBuiltinTypeLiteral();

            state._fsp--;

             after(grammarAccess.getBuiltinTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinTypeLiteral549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBuiltinTypeLiteral"


    // $ANTLR start "ruleBuiltinTypeLiteral"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:293:1: ruleBuiltinTypeLiteral : ( ( rule__BuiltinTypeLiteral__BuiltinAssignment ) ) ;
    public final void ruleBuiltinTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:297:2: ( ( ( rule__BuiltinTypeLiteral__BuiltinAssignment ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:298:1: ( ( rule__BuiltinTypeLiteral__BuiltinAssignment ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:298:1: ( ( rule__BuiltinTypeLiteral__BuiltinAssignment ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:299:1: ( rule__BuiltinTypeLiteral__BuiltinAssignment )
            {
             before(grammarAccess.getBuiltinTypeLiteralAccess().getBuiltinAssignment()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:300:1: ( rule__BuiltinTypeLiteral__BuiltinAssignment )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:300:2: rule__BuiltinTypeLiteral__BuiltinAssignment
            {
            pushFollow(FOLLOW_rule__BuiltinTypeLiteral__BuiltinAssignment_in_ruleBuiltinTypeLiteral575);
            rule__BuiltinTypeLiteral__BuiltinAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBuiltinTypeLiteralAccess().getBuiltinAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuiltinTypeLiteral"


    // $ANTLR start "entryRuleDefinedTypeLiteral"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:312:1: entryRuleDefinedTypeLiteral : ruleDefinedTypeLiteral EOF ;
    public final void entryRuleDefinedTypeLiteral() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:313:1: ( ruleDefinedTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:314:1: ruleDefinedTypeLiteral EOF
            {
             before(grammarAccess.getDefinedTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleDefinedTypeLiteral_in_entryRuleDefinedTypeLiteral602);
            ruleDefinedTypeLiteral();

            state._fsp--;

             after(grammarAccess.getDefinedTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinedTypeLiteral609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinedTypeLiteral"


    // $ANTLR start "ruleDefinedTypeLiteral"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:321:1: ruleDefinedTypeLiteral : ( ( rule__DefinedTypeLiteral__TypeAssignment ) ) ;
    public final void ruleDefinedTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:325:2: ( ( ( rule__DefinedTypeLiteral__TypeAssignment ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:326:1: ( ( rule__DefinedTypeLiteral__TypeAssignment ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:326:1: ( ( rule__DefinedTypeLiteral__TypeAssignment ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:327:1: ( rule__DefinedTypeLiteral__TypeAssignment )
            {
             before(grammarAccess.getDefinedTypeLiteralAccess().getTypeAssignment()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:328:1: ( rule__DefinedTypeLiteral__TypeAssignment )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:328:2: rule__DefinedTypeLiteral__TypeAssignment
            {
            pushFollow(FOLLOW_rule__DefinedTypeLiteral__TypeAssignment_in_ruleDefinedTypeLiteral635);
            rule__DefinedTypeLiteral__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDefinedTypeLiteralAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinedTypeLiteral"


    // $ANTLR start "entryRuleListTypeLiteral"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:340:1: entryRuleListTypeLiteral : ruleListTypeLiteral EOF ;
    public final void entryRuleListTypeLiteral() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:341:1: ( ruleListTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:342:1: ruleListTypeLiteral EOF
            {
             before(grammarAccess.getListTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleListTypeLiteral_in_entryRuleListTypeLiteral662);
            ruleListTypeLiteral();

            state._fsp--;

             after(grammarAccess.getListTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListTypeLiteral669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListTypeLiteral"


    // $ANTLR start "ruleListTypeLiteral"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:349:1: ruleListTypeLiteral : ( ( rule__ListTypeLiteral__Group__0 ) ) ;
    public final void ruleListTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:353:2: ( ( ( rule__ListTypeLiteral__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:354:1: ( ( rule__ListTypeLiteral__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:354:1: ( ( rule__ListTypeLiteral__Group__0 ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:355:1: ( rule__ListTypeLiteral__Group__0 )
            {
             before(grammarAccess.getListTypeLiteralAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:356:1: ( rule__ListTypeLiteral__Group__0 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:356:2: rule__ListTypeLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ListTypeLiteral__Group__0_in_ruleListTypeLiteral695);
            rule__ListTypeLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListTypeLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListTypeLiteral"


    // $ANTLR start "entryRuleSyntheticTypeLiteral"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:368:1: entryRuleSyntheticTypeLiteral : ruleSyntheticTypeLiteral EOF ;
    public final void entryRuleSyntheticTypeLiteral() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:369:1: ( ruleSyntheticTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:370:1: ruleSyntheticTypeLiteral EOF
            {
             before(grammarAccess.getSyntheticTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleSyntheticTypeLiteral_in_entryRuleSyntheticTypeLiteral722);
            ruleSyntheticTypeLiteral();

            state._fsp--;

             after(grammarAccess.getSyntheticTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntheticTypeLiteral729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSyntheticTypeLiteral"


    // $ANTLR start "ruleSyntheticTypeLiteral"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:377:1: ruleSyntheticTypeLiteral : ( ( rule__SyntheticTypeLiteral__Alternatives ) ) ;
    public final void ruleSyntheticTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:381:2: ( ( ( rule__SyntheticTypeLiteral__Alternatives ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:382:1: ( ( rule__SyntheticTypeLiteral__Alternatives ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:382:1: ( ( rule__SyntheticTypeLiteral__Alternatives ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:383:1: ( rule__SyntheticTypeLiteral__Alternatives )
            {
             before(grammarAccess.getSyntheticTypeLiteralAccess().getAlternatives()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:384:1: ( rule__SyntheticTypeLiteral__Alternatives )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:384:2: rule__SyntheticTypeLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Alternatives_in_ruleSyntheticTypeLiteral755);
            rule__SyntheticTypeLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSyntheticTypeLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSyntheticTypeLiteral"


    // $ANTLR start "ruleBuiltinTypes"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:397:1: ruleBuiltinTypes : ( ( rule__BuiltinTypes__Alternatives ) ) ;
    public final void ruleBuiltinTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:401:1: ( ( ( rule__BuiltinTypes__Alternatives ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:402:1: ( ( rule__BuiltinTypes__Alternatives ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:402:1: ( ( rule__BuiltinTypes__Alternatives ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:403:1: ( rule__BuiltinTypes__Alternatives )
            {
             before(grammarAccess.getBuiltinTypesAccess().getAlternatives()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:404:1: ( rule__BuiltinTypes__Alternatives )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:404:2: rule__BuiltinTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__BuiltinTypes__Alternatives_in_ruleBuiltinTypes792);
            rule__BuiltinTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBuiltinTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuiltinTypes"


    // $ANTLR start "rule__DefinedType__Alternatives"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:415:1: rule__DefinedType__Alternatives : ( ( ruleStructureDefinition ) | ( ruleEnumerationDefinition ) );
    public final void rule__DefinedType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:419:1: ( ( ruleStructureDefinition ) | ( ruleEnumerationDefinition ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:420:1: ( ruleStructureDefinition )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:420:1: ( ruleStructureDefinition )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:421:1: ruleStructureDefinition
                    {
                     before(grammarAccess.getDefinedTypeAccess().getStructureDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStructureDefinition_in_rule__DefinedType__Alternatives827);
                    ruleStructureDefinition();

                    state._fsp--;

                     after(grammarAccess.getDefinedTypeAccess().getStructureDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:426:6: ( ruleEnumerationDefinition )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:426:6: ( ruleEnumerationDefinition )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:427:1: ruleEnumerationDefinition
                    {
                     before(grammarAccess.getDefinedTypeAccess().getEnumerationDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumerationDefinition_in_rule__DefinedType__Alternatives844);
                    ruleEnumerationDefinition();

                    state._fsp--;

                     after(grammarAccess.getDefinedTypeAccess().getEnumerationDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedType__Alternatives"


    // $ANTLR start "rule__EnumerationName__Alternatives"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:437:1: rule__EnumerationName__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__EnumerationName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:441:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:442:1: ( RULE_ID )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:442:1: ( RULE_ID )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:443:1: RULE_ID
                    {
                     before(grammarAccess.getEnumerationNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationName__Alternatives876); 
                     after(grammarAccess.getEnumerationNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:448:6: ( RULE_STRING )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:448:6: ( RULE_STRING )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:449:1: RULE_STRING
                    {
                     before(grammarAccess.getEnumerationNameAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumerationName__Alternatives893); 
                     after(grammarAccess.getEnumerationNameAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:454:6: ( RULE_INT )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:454:6: ( RULE_INT )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:455:1: RULE_INT
                    {
                     before(grammarAccess.getEnumerationNameAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationName__Alternatives910); 
                     after(grammarAccess.getEnumerationNameAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationName__Alternatives"


    // $ANTLR start "rule__TypeLiteral__Alternatives"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:465:1: rule__TypeLiteral__Alternatives : ( ( ruleBuiltinTypeLiteral ) | ( ruleDefinedTypeLiteral ) | ( ruleListTypeLiteral ) | ( ruleSyntheticTypeLiteral ) );
    public final void rule__TypeLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:469:1: ( ( ruleBuiltinTypeLiteral ) | ( ruleDefinedTypeLiteral ) | ( ruleListTypeLiteral ) | ( ruleSyntheticTypeLiteral ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            case 29:
            case 30:
            case 31:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:470:1: ( ruleBuiltinTypeLiteral )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:470:1: ( ruleBuiltinTypeLiteral )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:471:1: ruleBuiltinTypeLiteral
                    {
                     before(grammarAccess.getTypeLiteralAccess().getBuiltinTypeLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBuiltinTypeLiteral_in_rule__TypeLiteral__Alternatives942);
                    ruleBuiltinTypeLiteral();

                    state._fsp--;

                     after(grammarAccess.getTypeLiteralAccess().getBuiltinTypeLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:476:6: ( ruleDefinedTypeLiteral )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:476:6: ( ruleDefinedTypeLiteral )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:477:1: ruleDefinedTypeLiteral
                    {
                     before(grammarAccess.getTypeLiteralAccess().getDefinedTypeLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDefinedTypeLiteral_in_rule__TypeLiteral__Alternatives959);
                    ruleDefinedTypeLiteral();

                    state._fsp--;

                     after(grammarAccess.getTypeLiteralAccess().getDefinedTypeLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:482:6: ( ruleListTypeLiteral )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:482:6: ( ruleListTypeLiteral )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:483:1: ruleListTypeLiteral
                    {
                     before(grammarAccess.getTypeLiteralAccess().getListTypeLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleListTypeLiteral_in_rule__TypeLiteral__Alternatives976);
                    ruleListTypeLiteral();

                    state._fsp--;

                     after(grammarAccess.getTypeLiteralAccess().getListTypeLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:488:6: ( ruleSyntheticTypeLiteral )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:488:6: ( ruleSyntheticTypeLiteral )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:489:1: ruleSyntheticTypeLiteral
                    {
                     before(grammarAccess.getTypeLiteralAccess().getSyntheticTypeLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSyntheticTypeLiteral_in_rule__TypeLiteral__Alternatives993);
                    ruleSyntheticTypeLiteral();

                    state._fsp--;

                     after(grammarAccess.getTypeLiteralAccess().getSyntheticTypeLiteralParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeLiteral__Alternatives"


    // $ANTLR start "rule__SyntheticTypeLiteral__Alternatives"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:499:1: rule__SyntheticTypeLiteral__Alternatives : ( ( ( rule__SyntheticTypeLiteral__Group_0__0 ) ) | ( ( rule__SyntheticTypeLiteral__Group_1__0 ) ) | ( ( rule__SyntheticTypeLiteral__Group_2__0 ) ) );
    public final void rule__SyntheticTypeLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:503:1: ( ( ( rule__SyntheticTypeLiteral__Group_0__0 ) ) | ( ( rule__SyntheticTypeLiteral__Group_1__0 ) ) | ( ( rule__SyntheticTypeLiteral__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:504:1: ( ( rule__SyntheticTypeLiteral__Group_0__0 ) )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:504:1: ( ( rule__SyntheticTypeLiteral__Group_0__0 ) )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:505:1: ( rule__SyntheticTypeLiteral__Group_0__0 )
                    {
                     before(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_0()); 
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:506:1: ( rule__SyntheticTypeLiteral__Group_0__0 )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:506:2: rule__SyntheticTypeLiteral__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_0__0_in_rule__SyntheticTypeLiteral__Alternatives1025);
                    rule__SyntheticTypeLiteral__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:510:6: ( ( rule__SyntheticTypeLiteral__Group_1__0 ) )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:510:6: ( ( rule__SyntheticTypeLiteral__Group_1__0 ) )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:511:1: ( rule__SyntheticTypeLiteral__Group_1__0 )
                    {
                     before(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_1()); 
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:512:1: ( rule__SyntheticTypeLiteral__Group_1__0 )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:512:2: rule__SyntheticTypeLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_1__0_in_rule__SyntheticTypeLiteral__Alternatives1043);
                    rule__SyntheticTypeLiteral__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:516:6: ( ( rule__SyntheticTypeLiteral__Group_2__0 ) )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:516:6: ( ( rule__SyntheticTypeLiteral__Group_2__0 ) )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:517:1: ( rule__SyntheticTypeLiteral__Group_2__0 )
                    {
                     before(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_2()); 
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:518:1: ( rule__SyntheticTypeLiteral__Group_2__0 )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:518:2: rule__SyntheticTypeLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_2__0_in_rule__SyntheticTypeLiteral__Alternatives1061);
                    rule__SyntheticTypeLiteral__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntheticTypeLiteral__Alternatives"


    // $ANTLR start "rule__BuiltinTypes__Alternatives"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:527:1: rule__BuiltinTypes__Alternatives : ( ( ( 'String' ) ) | ( ( 'Boolean' ) ) | ( ( 'Integer' ) ) | ( ( 'URL' ) ) | ( ( 'Text' ) ) | ( ( 'Number' ) ) | ( ( 'Email' ) ) | ( ( 'Phone' ) ) | ( ( 'Date' ) ) | ( ( 'Password' ) ) );
    public final void rule__BuiltinTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:531:1: ( ( ( 'String' ) ) | ( ( 'Boolean' ) ) | ( ( 'Integer' ) ) | ( ( 'URL' ) ) | ( ( 'Text' ) ) | ( ( 'Number' ) ) | ( ( 'Email' ) ) | ( ( 'Phone' ) ) | ( ( 'Date' ) ) | ( ( 'Password' ) ) )
            int alt6=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            case 16:
                {
                alt6=6;
                }
                break;
            case 17:
                {
                alt6=7;
                }
                break;
            case 18:
                {
                alt6=8;
                }
                break;
            case 19:
                {
                alt6=9;
                }
                break;
            case 20:
                {
                alt6=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:532:1: ( ( 'String' ) )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:532:1: ( ( 'String' ) )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:533:1: ( 'String' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:534:1: ( 'String' )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:534:3: 'String'
                    {
                    match(input,11,FOLLOW_11_in_rule__BuiltinTypes__Alternatives1095); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:539:6: ( ( 'Boolean' ) )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:539:6: ( ( 'Boolean' ) )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:540:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getBooleanEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:541:1: ( 'Boolean' )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:541:3: 'Boolean'
                    {
                    match(input,12,FOLLOW_12_in_rule__BuiltinTypes__Alternatives1116); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getBooleanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:546:6: ( ( 'Integer' ) )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:546:6: ( ( 'Integer' ) )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:547:1: ( 'Integer' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:548:1: ( 'Integer' )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:548:3: 'Integer'
                    {
                    match(input,13,FOLLOW_13_in_rule__BuiltinTypes__Alternatives1137); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:553:6: ( ( 'URL' ) )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:553:6: ( ( 'URL' ) )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:554:1: ( 'URL' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getUrlEnumLiteralDeclaration_3()); 
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:555:1: ( 'URL' )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:555:3: 'URL'
                    {
                    match(input,14,FOLLOW_14_in_rule__BuiltinTypes__Alternatives1158); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getUrlEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:560:6: ( ( 'Text' ) )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:560:6: ( ( 'Text' ) )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:561:1: ( 'Text' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getTextEnumLiteralDeclaration_4()); 
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:562:1: ( 'Text' )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:562:3: 'Text'
                    {
                    match(input,15,FOLLOW_15_in_rule__BuiltinTypes__Alternatives1179); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getTextEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:567:6: ( ( 'Number' ) )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:567:6: ( ( 'Number' ) )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:568:1: ( 'Number' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getNumberEnumLiteralDeclaration_5()); 
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:569:1: ( 'Number' )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:569:3: 'Number'
                    {
                    match(input,16,FOLLOW_16_in_rule__BuiltinTypes__Alternatives1200); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getNumberEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:574:6: ( ( 'Email' ) )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:574:6: ( ( 'Email' ) )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:575:1: ( 'Email' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getEmailEnumLiteralDeclaration_6()); 
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:576:1: ( 'Email' )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:576:3: 'Email'
                    {
                    match(input,17,FOLLOW_17_in_rule__BuiltinTypes__Alternatives1221); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getEmailEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:581:6: ( ( 'Phone' ) )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:581:6: ( ( 'Phone' ) )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:582:1: ( 'Phone' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getPhoneEnumLiteralDeclaration_7()); 
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:583:1: ( 'Phone' )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:583:3: 'Phone'
                    {
                    match(input,18,FOLLOW_18_in_rule__BuiltinTypes__Alternatives1242); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getPhoneEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:588:6: ( ( 'Date' ) )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:588:6: ( ( 'Date' ) )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:589:1: ( 'Date' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getDateEnumLiteralDeclaration_8()); 
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:590:1: ( 'Date' )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:590:3: 'Date'
                    {
                    match(input,19,FOLLOW_19_in_rule__BuiltinTypes__Alternatives1263); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getDateEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:595:6: ( ( 'Password' ) )
                    {
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:595:6: ( ( 'Password' ) )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:596:1: ( 'Password' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getPasswordEnumLiteralDeclaration_9()); 
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:597:1: ( 'Password' )
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:597:3: 'Password'
                    {
                    match(input,20,FOLLOW_20_in_rule__BuiltinTypes__Alternatives1284); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getPasswordEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltinTypes__Alternatives"


    // $ANTLR start "rule__StructureDefinition__Group__0"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:609:1: rule__StructureDefinition__Group__0 : rule__StructureDefinition__Group__0__Impl rule__StructureDefinition__Group__1 ;
    public final void rule__StructureDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:613:1: ( rule__StructureDefinition__Group__0__Impl rule__StructureDefinition__Group__1 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:614:2: rule__StructureDefinition__Group__0__Impl rule__StructureDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__StructureDefinition__Group__0__Impl_in_rule__StructureDefinition__Group__01317);
            rule__StructureDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructureDefinition__Group__1_in_rule__StructureDefinition__Group__01320);
            rule__StructureDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureDefinition__Group__0"


    // $ANTLR start "rule__StructureDefinition__Group__0__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:621:1: rule__StructureDefinition__Group__0__Impl : ( 'structure' ) ;
    public final void rule__StructureDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:625:1: ( ( 'structure' ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:626:1: ( 'structure' )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:626:1: ( 'structure' )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:627:1: 'structure'
            {
             before(grammarAccess.getStructureDefinitionAccess().getStructureKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__StructureDefinition__Group__0__Impl1348); 
             after(grammarAccess.getStructureDefinitionAccess().getStructureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureDefinition__Group__0__Impl"


    // $ANTLR start "rule__StructureDefinition__Group__1"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:640:1: rule__StructureDefinition__Group__1 : rule__StructureDefinition__Group__1__Impl rule__StructureDefinition__Group__2 ;
    public final void rule__StructureDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:644:1: ( rule__StructureDefinition__Group__1__Impl rule__StructureDefinition__Group__2 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:645:2: rule__StructureDefinition__Group__1__Impl rule__StructureDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__StructureDefinition__Group__1__Impl_in_rule__StructureDefinition__Group__11379);
            rule__StructureDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructureDefinition__Group__2_in_rule__StructureDefinition__Group__11382);
            rule__StructureDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureDefinition__Group__1"


    // $ANTLR start "rule__StructureDefinition__Group__1__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:652:1: rule__StructureDefinition__Group__1__Impl : ( ( rule__StructureDefinition__NameAssignment_1 ) ) ;
    public final void rule__StructureDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:656:1: ( ( ( rule__StructureDefinition__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:657:1: ( ( rule__StructureDefinition__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:657:1: ( ( rule__StructureDefinition__NameAssignment_1 ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:658:1: ( rule__StructureDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getStructureDefinitionAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:659:1: ( rule__StructureDefinition__NameAssignment_1 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:659:2: rule__StructureDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StructureDefinition__NameAssignment_1_in_rule__StructureDefinition__Group__1__Impl1409);
            rule__StructureDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStructureDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureDefinition__Group__1__Impl"


    // $ANTLR start "rule__StructureDefinition__Group__2"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:669:1: rule__StructureDefinition__Group__2 : rule__StructureDefinition__Group__2__Impl rule__StructureDefinition__Group__3 ;
    public final void rule__StructureDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:673:1: ( rule__StructureDefinition__Group__2__Impl rule__StructureDefinition__Group__3 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:674:2: rule__StructureDefinition__Group__2__Impl rule__StructureDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__StructureDefinition__Group__2__Impl_in_rule__StructureDefinition__Group__21439);
            rule__StructureDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructureDefinition__Group__3_in_rule__StructureDefinition__Group__21442);
            rule__StructureDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureDefinition__Group__2"


    // $ANTLR start "rule__StructureDefinition__Group__2__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:681:1: rule__StructureDefinition__Group__2__Impl : ( ( rule__StructureDefinition__PersistentAssignment_2 )? ) ;
    public final void rule__StructureDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:685:1: ( ( ( rule__StructureDefinition__PersistentAssignment_2 )? ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:686:1: ( ( rule__StructureDefinition__PersistentAssignment_2 )? )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:686:1: ( ( rule__StructureDefinition__PersistentAssignment_2 )? )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:687:1: ( rule__StructureDefinition__PersistentAssignment_2 )?
            {
             before(grammarAccess.getStructureDefinitionAccess().getPersistentAssignment_2()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:688:1: ( rule__StructureDefinition__PersistentAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:688:2: rule__StructureDefinition__PersistentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__StructureDefinition__PersistentAssignment_2_in_rule__StructureDefinition__Group__2__Impl1469);
                    rule__StructureDefinition__PersistentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructureDefinitionAccess().getPersistentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureDefinition__Group__2__Impl"


    // $ANTLR start "rule__StructureDefinition__Group__3"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:698:1: rule__StructureDefinition__Group__3 : rule__StructureDefinition__Group__3__Impl rule__StructureDefinition__Group__4 ;
    public final void rule__StructureDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:702:1: ( rule__StructureDefinition__Group__3__Impl rule__StructureDefinition__Group__4 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:703:2: rule__StructureDefinition__Group__3__Impl rule__StructureDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__StructureDefinition__Group__3__Impl_in_rule__StructureDefinition__Group__31500);
            rule__StructureDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructureDefinition__Group__4_in_rule__StructureDefinition__Group__31503);
            rule__StructureDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureDefinition__Group__3"


    // $ANTLR start "rule__StructureDefinition__Group__3__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:710:1: rule__StructureDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__StructureDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:714:1: ( ( '{' ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:715:1: ( '{' )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:715:1: ( '{' )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:716:1: '{'
            {
             before(grammarAccess.getStructureDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__StructureDefinition__Group__3__Impl1531); 
             after(grammarAccess.getStructureDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureDefinition__Group__3__Impl"


    // $ANTLR start "rule__StructureDefinition__Group__4"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:729:1: rule__StructureDefinition__Group__4 : rule__StructureDefinition__Group__4__Impl rule__StructureDefinition__Group__5 ;
    public final void rule__StructureDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:733:1: ( rule__StructureDefinition__Group__4__Impl rule__StructureDefinition__Group__5 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:734:2: rule__StructureDefinition__Group__4__Impl rule__StructureDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__StructureDefinition__Group__4__Impl_in_rule__StructureDefinition__Group__41562);
            rule__StructureDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructureDefinition__Group__5_in_rule__StructureDefinition__Group__41565);
            rule__StructureDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureDefinition__Group__4"


    // $ANTLR start "rule__StructureDefinition__Group__4__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:741:1: rule__StructureDefinition__Group__4__Impl : ( ( rule__StructureDefinition__FeaturesAssignment_4 )* ) ;
    public final void rule__StructureDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:745:1: ( ( ( rule__StructureDefinition__FeaturesAssignment_4 )* ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:746:1: ( ( rule__StructureDefinition__FeaturesAssignment_4 )* )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:746:1: ( ( rule__StructureDefinition__FeaturesAssignment_4 )* )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:747:1: ( rule__StructureDefinition__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getStructureDefinitionAccess().getFeaturesAssignment_4()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:748:1: ( rule__StructureDefinition__FeaturesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:748:2: rule__StructureDefinition__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__StructureDefinition__FeaturesAssignment_4_in_rule__StructureDefinition__Group__4__Impl1592);
            	    rule__StructureDefinition__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStructureDefinitionAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureDefinition__Group__4__Impl"


    // $ANTLR start "rule__StructureDefinition__Group__5"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:758:1: rule__StructureDefinition__Group__5 : rule__StructureDefinition__Group__5__Impl ;
    public final void rule__StructureDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:762:1: ( rule__StructureDefinition__Group__5__Impl )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:763:2: rule__StructureDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StructureDefinition__Group__5__Impl_in_rule__StructureDefinition__Group__51623);
            rule__StructureDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureDefinition__Group__5"


    // $ANTLR start "rule__StructureDefinition__Group__5__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:769:1: rule__StructureDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__StructureDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:773:1: ( ( '}' ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:774:1: ( '}' )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:774:1: ( '}' )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:775:1: '}'
            {
             before(grammarAccess.getStructureDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__StructureDefinition__Group__5__Impl1651); 
             after(grammarAccess.getStructureDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureDefinition__Group__5__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:800:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:804:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:805:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01694);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01697);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:812:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__NameAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:816:1: ( ( ( rule__Feature__NameAssignment_0 ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:817:1: ( ( rule__Feature__NameAssignment_0 ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:817:1: ( ( rule__Feature__NameAssignment_0 ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:818:1: ( rule__Feature__NameAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_0()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:819:1: ( rule__Feature__NameAssignment_0 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:819:2: rule__Feature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_0_in_rule__Feature__Group__0__Impl1724);
            rule__Feature__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:829:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:833:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:834:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11754);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11757);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:841:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__OptionalAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:845:1: ( ( ( rule__Feature__OptionalAssignment_1 )? ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:846:1: ( ( rule__Feature__OptionalAssignment_1 )? )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:846:1: ( ( rule__Feature__OptionalAssignment_1 )? )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:847:1: ( rule__Feature__OptionalAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getOptionalAssignment_1()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:848:1: ( rule__Feature__OptionalAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:848:2: rule__Feature__OptionalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__OptionalAssignment_1_in_rule__Feature__Group__1__Impl1784);
                    rule__Feature__OptionalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getOptionalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:858:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:862:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:863:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21815);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21818);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:870:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:874:1: ( ( ':' ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:875:1: ( ':' )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:875:1: ( ':' )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:876:1: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__Feature__Group__2__Impl1846); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:889:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:893:1: ( rule__Feature__Group__3__Impl )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:894:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31877);
            rule__Feature__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:900:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:904:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:905:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:905:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:906:1: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:907:1: ( rule__Feature__TypeAssignment_3 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:907:2: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl1904);
            rule__Feature__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__EnumerationDefinition__Group__0"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:925:1: rule__EnumerationDefinition__Group__0 : rule__EnumerationDefinition__Group__0__Impl rule__EnumerationDefinition__Group__1 ;
    public final void rule__EnumerationDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:929:1: ( rule__EnumerationDefinition__Group__0__Impl rule__EnumerationDefinition__Group__1 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:930:2: rule__EnumerationDefinition__Group__0__Impl rule__EnumerationDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__0__Impl_in_rule__EnumerationDefinition__Group__01942);
            rule__EnumerationDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__1_in_rule__EnumerationDefinition__Group__01945);
            rule__EnumerationDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDefinition__Group__0"


    // $ANTLR start "rule__EnumerationDefinition__Group__0__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:937:1: rule__EnumerationDefinition__Group__0__Impl : ( 'enumeration' ) ;
    public final void rule__EnumerationDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:941:1: ( ( 'enumeration' ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:942:1: ( 'enumeration' )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:942:1: ( 'enumeration' )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:943:1: 'enumeration'
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getEnumerationKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__EnumerationDefinition__Group__0__Impl1973); 
             after(grammarAccess.getEnumerationDefinitionAccess().getEnumerationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDefinition__Group__0__Impl"


    // $ANTLR start "rule__EnumerationDefinition__Group__1"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:956:1: rule__EnumerationDefinition__Group__1 : rule__EnumerationDefinition__Group__1__Impl rule__EnumerationDefinition__Group__2 ;
    public final void rule__EnumerationDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:960:1: ( rule__EnumerationDefinition__Group__1__Impl rule__EnumerationDefinition__Group__2 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:961:2: rule__EnumerationDefinition__Group__1__Impl rule__EnumerationDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__1__Impl_in_rule__EnumerationDefinition__Group__12004);
            rule__EnumerationDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__2_in_rule__EnumerationDefinition__Group__12007);
            rule__EnumerationDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDefinition__Group__1"


    // $ANTLR start "rule__EnumerationDefinition__Group__1__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:968:1: rule__EnumerationDefinition__Group__1__Impl : ( ( rule__EnumerationDefinition__NameAssignment_1 ) ) ;
    public final void rule__EnumerationDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:972:1: ( ( ( rule__EnumerationDefinition__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:973:1: ( ( rule__EnumerationDefinition__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:973:1: ( ( rule__EnumerationDefinition__NameAssignment_1 ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:974:1: ( rule__EnumerationDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:975:1: ( rule__EnumerationDefinition__NameAssignment_1 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:975:2: rule__EnumerationDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumerationDefinition__NameAssignment_1_in_rule__EnumerationDefinition__Group__1__Impl2034);
            rule__EnumerationDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDefinition__Group__1__Impl"


    // $ANTLR start "rule__EnumerationDefinition__Group__2"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:985:1: rule__EnumerationDefinition__Group__2 : rule__EnumerationDefinition__Group__2__Impl rule__EnumerationDefinition__Group__3 ;
    public final void rule__EnumerationDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:989:1: ( rule__EnumerationDefinition__Group__2__Impl rule__EnumerationDefinition__Group__3 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:990:2: rule__EnumerationDefinition__Group__2__Impl rule__EnumerationDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__2__Impl_in_rule__EnumerationDefinition__Group__22064);
            rule__EnumerationDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__3_in_rule__EnumerationDefinition__Group__22067);
            rule__EnumerationDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDefinition__Group__2"


    // $ANTLR start "rule__EnumerationDefinition__Group__2__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:997:1: rule__EnumerationDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumerationDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1001:1: ( ( '{' ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1002:1: ( '{' )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1002:1: ( '{' )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1003:1: '{'
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__EnumerationDefinition__Group__2__Impl2095); 
             after(grammarAccess.getEnumerationDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDefinition__Group__2__Impl"


    // $ANTLR start "rule__EnumerationDefinition__Group__3"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1016:1: rule__EnumerationDefinition__Group__3 : rule__EnumerationDefinition__Group__3__Impl rule__EnumerationDefinition__Group__4 ;
    public final void rule__EnumerationDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1020:1: ( rule__EnumerationDefinition__Group__3__Impl rule__EnumerationDefinition__Group__4 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1021:2: rule__EnumerationDefinition__Group__3__Impl rule__EnumerationDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__3__Impl_in_rule__EnumerationDefinition__Group__32126);
            rule__EnumerationDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__4_in_rule__EnumerationDefinition__Group__32129);
            rule__EnumerationDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDefinition__Group__3"


    // $ANTLR start "rule__EnumerationDefinition__Group__3__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1028:1: rule__EnumerationDefinition__Group__3__Impl : ( ( rule__EnumerationDefinition__LiteralsAssignment_3 )* ) ;
    public final void rule__EnumerationDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1032:1: ( ( ( rule__EnumerationDefinition__LiteralsAssignment_3 )* ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1033:1: ( ( rule__EnumerationDefinition__LiteralsAssignment_3 )* )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1033:1: ( ( rule__EnumerationDefinition__LiteralsAssignment_3 )* )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1034:1: ( rule__EnumerationDefinition__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getLiteralsAssignment_3()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1035:1: ( rule__EnumerationDefinition__LiteralsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1035:2: rule__EnumerationDefinition__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__EnumerationDefinition__LiteralsAssignment_3_in_rule__EnumerationDefinition__Group__3__Impl2156);
            	    rule__EnumerationDefinition__LiteralsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEnumerationDefinitionAccess().getLiteralsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDefinition__Group__3__Impl"


    // $ANTLR start "rule__EnumerationDefinition__Group__4"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1045:1: rule__EnumerationDefinition__Group__4 : rule__EnumerationDefinition__Group__4__Impl ;
    public final void rule__EnumerationDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1049:1: ( rule__EnumerationDefinition__Group__4__Impl )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1050:2: rule__EnumerationDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__4__Impl_in_rule__EnumerationDefinition__Group__42187);
            rule__EnumerationDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDefinition__Group__4"


    // $ANTLR start "rule__EnumerationDefinition__Group__4__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1056:1: rule__EnumerationDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__EnumerationDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1060:1: ( ( '}' ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1061:1: ( '}' )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1061:1: ( '}' )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1062:1: '}'
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__EnumerationDefinition__Group__4__Impl2215); 
             after(grammarAccess.getEnumerationDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDefinition__Group__4__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__0"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1085:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1089:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1090:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__02256);
            rule__EnumerationLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__02259);
            rule__EnumerationLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0"


    // $ANTLR start "rule__EnumerationLiteral__Group__0__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1097:1: rule__EnumerationLiteral__Group__0__Impl : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1101:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1102:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1102:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1103:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1104:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1104:2: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl2286);
            rule__EnumerationLiteral__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__1"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1114:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1118:1: ( rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1119:2: rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__12316);
            rule__EnumerationLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__12319);
            rule__EnumerationLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__1"


    // $ANTLR start "rule__EnumerationLiteral__Group__1__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1126:1: rule__EnumerationLiteral__Group__1__Impl : ( '->' ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1130:1: ( ( '->' ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1131:1: ( '->' )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1131:1: ( '->' )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1132:1: '->'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__EnumerationLiteral__Group__1__Impl2347); 
             after(grammarAccess.getEnumerationLiteralAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__1__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__2"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1145:1: rule__EnumerationLiteral__Group__2 : rule__EnumerationLiteral__Group__2__Impl ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1149:1: ( rule__EnumerationLiteral__Group__2__Impl )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1150:2: rule__EnumerationLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__22378);
            rule__EnumerationLiteral__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__2"


    // $ANTLR start "rule__EnumerationLiteral__Group__2__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1156:1: rule__EnumerationLiteral__Group__2__Impl : ( ( rule__EnumerationLiteral__DisplayNameAssignment_2 ) ) ;
    public final void rule__EnumerationLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1160:1: ( ( ( rule__EnumerationLiteral__DisplayNameAssignment_2 ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1161:1: ( ( rule__EnumerationLiteral__DisplayNameAssignment_2 ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1161:1: ( ( rule__EnumerationLiteral__DisplayNameAssignment_2 ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1162:1: ( rule__EnumerationLiteral__DisplayNameAssignment_2 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getDisplayNameAssignment_2()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1163:1: ( rule__EnumerationLiteral__DisplayNameAssignment_2 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1163:2: rule__EnumerationLiteral__DisplayNameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__DisplayNameAssignment_2_in_rule__EnumerationLiteral__Group__2__Impl2405);
            rule__EnumerationLiteral__DisplayNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getDisplayNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__2__Impl"


    // $ANTLR start "rule__ListTypeLiteral__Group__0"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1179:1: rule__ListTypeLiteral__Group__0 : rule__ListTypeLiteral__Group__0__Impl rule__ListTypeLiteral__Group__1 ;
    public final void rule__ListTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1183:1: ( rule__ListTypeLiteral__Group__0__Impl rule__ListTypeLiteral__Group__1 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1184:2: rule__ListTypeLiteral__Group__0__Impl rule__ListTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ListTypeLiteral__Group__0__Impl_in_rule__ListTypeLiteral__Group__02441);
            rule__ListTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListTypeLiteral__Group__1_in_rule__ListTypeLiteral__Group__02444);
            rule__ListTypeLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListTypeLiteral__Group__0"


    // $ANTLR start "rule__ListTypeLiteral__Group__0__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1191:1: rule__ListTypeLiteral__Group__0__Impl : ( '[' ) ;
    public final void rule__ListTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1195:1: ( ( '[' ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1196:1: ( '[' )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1196:1: ( '[' )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1197:1: '['
            {
             before(grammarAccess.getListTypeLiteralAccess().getLeftSquareBracketKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ListTypeLiteral__Group__0__Impl2472); 
             after(grammarAccess.getListTypeLiteralAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListTypeLiteral__Group__0__Impl"


    // $ANTLR start "rule__ListTypeLiteral__Group__1"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1210:1: rule__ListTypeLiteral__Group__1 : rule__ListTypeLiteral__Group__1__Impl rule__ListTypeLiteral__Group__2 ;
    public final void rule__ListTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1214:1: ( rule__ListTypeLiteral__Group__1__Impl rule__ListTypeLiteral__Group__2 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1215:2: rule__ListTypeLiteral__Group__1__Impl rule__ListTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ListTypeLiteral__Group__1__Impl_in_rule__ListTypeLiteral__Group__12503);
            rule__ListTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListTypeLiteral__Group__2_in_rule__ListTypeLiteral__Group__12506);
            rule__ListTypeLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListTypeLiteral__Group__1"


    // $ANTLR start "rule__ListTypeLiteral__Group__1__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1222:1: rule__ListTypeLiteral__Group__1__Impl : ( ( rule__ListTypeLiteral__ItemTypeAssignment_1 ) ) ;
    public final void rule__ListTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1226:1: ( ( ( rule__ListTypeLiteral__ItemTypeAssignment_1 ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1227:1: ( ( rule__ListTypeLiteral__ItemTypeAssignment_1 ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1227:1: ( ( rule__ListTypeLiteral__ItemTypeAssignment_1 ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1228:1: ( rule__ListTypeLiteral__ItemTypeAssignment_1 )
            {
             before(grammarAccess.getListTypeLiteralAccess().getItemTypeAssignment_1()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1229:1: ( rule__ListTypeLiteral__ItemTypeAssignment_1 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1229:2: rule__ListTypeLiteral__ItemTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ListTypeLiteral__ItemTypeAssignment_1_in_rule__ListTypeLiteral__Group__1__Impl2533);
            rule__ListTypeLiteral__ItemTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListTypeLiteralAccess().getItemTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListTypeLiteral__Group__1__Impl"


    // $ANTLR start "rule__ListTypeLiteral__Group__2"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1239:1: rule__ListTypeLiteral__Group__2 : rule__ListTypeLiteral__Group__2__Impl ;
    public final void rule__ListTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1243:1: ( rule__ListTypeLiteral__Group__2__Impl )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1244:2: rule__ListTypeLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ListTypeLiteral__Group__2__Impl_in_rule__ListTypeLiteral__Group__22563);
            rule__ListTypeLiteral__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListTypeLiteral__Group__2"


    // $ANTLR start "rule__ListTypeLiteral__Group__2__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1250:1: rule__ListTypeLiteral__Group__2__Impl : ( ']' ) ;
    public final void rule__ListTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1254:1: ( ( ']' ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1255:1: ( ']' )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1255:1: ( ']' )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1256:1: ']'
            {
             before(grammarAccess.getListTypeLiteralAccess().getRightSquareBracketKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__ListTypeLiteral__Group__2__Impl2591); 
             after(grammarAccess.getListTypeLiteralAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListTypeLiteral__Group__2__Impl"


    // $ANTLR start "rule__SyntheticTypeLiteral__Group_0__0"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1275:1: rule__SyntheticTypeLiteral__Group_0__0 : rule__SyntheticTypeLiteral__Group_0__0__Impl rule__SyntheticTypeLiteral__Group_0__1 ;
    public final void rule__SyntheticTypeLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1279:1: ( rule__SyntheticTypeLiteral__Group_0__0__Impl rule__SyntheticTypeLiteral__Group_0__1 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1280:2: rule__SyntheticTypeLiteral__Group_0__0__Impl rule__SyntheticTypeLiteral__Group_0__1
            {
            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_0__0__Impl_in_rule__SyntheticTypeLiteral__Group_0__02628);
            rule__SyntheticTypeLiteral__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_0__1_in_rule__SyntheticTypeLiteral__Group_0__02631);
            rule__SyntheticTypeLiteral__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntheticTypeLiteral__Group_0__0"


    // $ANTLR start "rule__SyntheticTypeLiteral__Group_0__0__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1287:1: rule__SyntheticTypeLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__SyntheticTypeLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1291:1: ( ( () ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1292:1: ( () )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1292:1: ( () )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1293:1: ()
            {
             before(grammarAccess.getSyntheticTypeLiteralAccess().getCallbackLiteralAction_0_0()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1294:1: ()
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1296:1: 
            {
            }

             after(grammarAccess.getSyntheticTypeLiteralAccess().getCallbackLiteralAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntheticTypeLiteral__Group_0__0__Impl"


    // $ANTLR start "rule__SyntheticTypeLiteral__Group_0__1"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1306:1: rule__SyntheticTypeLiteral__Group_0__1 : rule__SyntheticTypeLiteral__Group_0__1__Impl ;
    public final void rule__SyntheticTypeLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1310:1: ( rule__SyntheticTypeLiteral__Group_0__1__Impl )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1311:2: rule__SyntheticTypeLiteral__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_0__1__Impl_in_rule__SyntheticTypeLiteral__Group_0__12689);
            rule__SyntheticTypeLiteral__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntheticTypeLiteral__Group_0__1"


    // $ANTLR start "rule__SyntheticTypeLiteral__Group_0__1__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1317:1: rule__SyntheticTypeLiteral__Group_0__1__Impl : ( 'Callback' ) ;
    public final void rule__SyntheticTypeLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1321:1: ( ( 'Callback' ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1322:1: ( 'Callback' )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1322:1: ( 'Callback' )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1323:1: 'Callback'
            {
             before(grammarAccess.getSyntheticTypeLiteralAccess().getCallbackKeyword_0_1()); 
            match(input,29,FOLLOW_29_in_rule__SyntheticTypeLiteral__Group_0__1__Impl2717); 
             after(grammarAccess.getSyntheticTypeLiteralAccess().getCallbackKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntheticTypeLiteral__Group_0__1__Impl"


    // $ANTLR start "rule__SyntheticTypeLiteral__Group_1__0"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1340:1: rule__SyntheticTypeLiteral__Group_1__0 : rule__SyntheticTypeLiteral__Group_1__0__Impl rule__SyntheticTypeLiteral__Group_1__1 ;
    public final void rule__SyntheticTypeLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1344:1: ( rule__SyntheticTypeLiteral__Group_1__0__Impl rule__SyntheticTypeLiteral__Group_1__1 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1345:2: rule__SyntheticTypeLiteral__Group_1__0__Impl rule__SyntheticTypeLiteral__Group_1__1
            {
            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_1__0__Impl_in_rule__SyntheticTypeLiteral__Group_1__02752);
            rule__SyntheticTypeLiteral__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_1__1_in_rule__SyntheticTypeLiteral__Group_1__02755);
            rule__SyntheticTypeLiteral__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntheticTypeLiteral__Group_1__0"


    // $ANTLR start "rule__SyntheticTypeLiteral__Group_1__0__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1352:1: rule__SyntheticTypeLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__SyntheticTypeLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1356:1: ( ( () ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1357:1: ( () )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1357:1: ( () )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1358:1: ()
            {
             before(grammarAccess.getSyntheticTypeLiteralAccess().getCallbackErrorResponseLiteralAction_1_0()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1359:1: ()
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1361:1: 
            {
            }

             after(grammarAccess.getSyntheticTypeLiteralAccess().getCallbackErrorResponseLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntheticTypeLiteral__Group_1__0__Impl"


    // $ANTLR start "rule__SyntheticTypeLiteral__Group_1__1"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1371:1: rule__SyntheticTypeLiteral__Group_1__1 : rule__SyntheticTypeLiteral__Group_1__1__Impl ;
    public final void rule__SyntheticTypeLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1375:1: ( rule__SyntheticTypeLiteral__Group_1__1__Impl )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1376:2: rule__SyntheticTypeLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_1__1__Impl_in_rule__SyntheticTypeLiteral__Group_1__12813);
            rule__SyntheticTypeLiteral__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntheticTypeLiteral__Group_1__1"


    // $ANTLR start "rule__SyntheticTypeLiteral__Group_1__1__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1382:1: rule__SyntheticTypeLiteral__Group_1__1__Impl : ( 'Error' ) ;
    public final void rule__SyntheticTypeLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1386:1: ( ( 'Error' ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1387:1: ( 'Error' )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1387:1: ( 'Error' )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1388:1: 'Error'
            {
             before(grammarAccess.getSyntheticTypeLiteralAccess().getErrorKeyword_1_1()); 
            match(input,30,FOLLOW_30_in_rule__SyntheticTypeLiteral__Group_1__1__Impl2841); 
             after(grammarAccess.getSyntheticTypeLiteralAccess().getErrorKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntheticTypeLiteral__Group_1__1__Impl"


    // $ANTLR start "rule__SyntheticTypeLiteral__Group_2__0"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1405:1: rule__SyntheticTypeLiteral__Group_2__0 : rule__SyntheticTypeLiteral__Group_2__0__Impl rule__SyntheticTypeLiteral__Group_2__1 ;
    public final void rule__SyntheticTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1409:1: ( rule__SyntheticTypeLiteral__Group_2__0__Impl rule__SyntheticTypeLiteral__Group_2__1 )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1410:2: rule__SyntheticTypeLiteral__Group_2__0__Impl rule__SyntheticTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_2__0__Impl_in_rule__SyntheticTypeLiteral__Group_2__02876);
            rule__SyntheticTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_2__1_in_rule__SyntheticTypeLiteral__Group_2__02879);
            rule__SyntheticTypeLiteral__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntheticTypeLiteral__Group_2__0"


    // $ANTLR start "rule__SyntheticTypeLiteral__Group_2__0__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1417:1: rule__SyntheticTypeLiteral__Group_2__0__Impl : ( () ) ;
    public final void rule__SyntheticTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1421:1: ( ( () ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1422:1: ( () )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1422:1: ( () )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1423:1: ()
            {
             before(grammarAccess.getSyntheticTypeLiteralAccess().getVoidLiteralAction_2_0()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1424:1: ()
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1426:1: 
            {
            }

             after(grammarAccess.getSyntheticTypeLiteralAccess().getVoidLiteralAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntheticTypeLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__SyntheticTypeLiteral__Group_2__1"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1436:1: rule__SyntheticTypeLiteral__Group_2__1 : rule__SyntheticTypeLiteral__Group_2__1__Impl ;
    public final void rule__SyntheticTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1440:1: ( rule__SyntheticTypeLiteral__Group_2__1__Impl )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1441:2: rule__SyntheticTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_2__1__Impl_in_rule__SyntheticTypeLiteral__Group_2__12937);
            rule__SyntheticTypeLiteral__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntheticTypeLiteral__Group_2__1"


    // $ANTLR start "rule__SyntheticTypeLiteral__Group_2__1__Impl"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1447:1: rule__SyntheticTypeLiteral__Group_2__1__Impl : ( '$Void' ) ;
    public final void rule__SyntheticTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1451:1: ( ( '$Void' ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1452:1: ( '$Void' )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1452:1: ( '$Void' )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1453:1: '$Void'
            {
             before(grammarAccess.getSyntheticTypeLiteralAccess().getVoidKeyword_2_1()); 
            match(input,31,FOLLOW_31_in_rule__SyntheticTypeLiteral__Group_2__1__Impl2965); 
             after(grammarAccess.getSyntheticTypeLiteralAccess().getVoidKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntheticTypeLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__StructureModel__TypeDefinitionsAssignment"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1471:1: rule__StructureModel__TypeDefinitionsAssignment : ( ruleDefinedType ) ;
    public final void rule__StructureModel__TypeDefinitionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1475:1: ( ( ruleDefinedType ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1476:1: ( ruleDefinedType )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1476:1: ( ruleDefinedType )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1477:1: ruleDefinedType
            {
             before(grammarAccess.getStructureModelAccess().getTypeDefinitionsDefinedTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDefinedType_in_rule__StructureModel__TypeDefinitionsAssignment3005);
            ruleDefinedType();

            state._fsp--;

             after(grammarAccess.getStructureModelAccess().getTypeDefinitionsDefinedTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureModel__TypeDefinitionsAssignment"


    // $ANTLR start "rule__StructureDefinition__NameAssignment_1"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1486:1: rule__StructureDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StructureDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1490:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1491:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1491:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1492:1: RULE_ID
            {
             before(grammarAccess.getStructureDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StructureDefinition__NameAssignment_13036); 
             after(grammarAccess.getStructureDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureDefinition__NameAssignment_1"


    // $ANTLR start "rule__StructureDefinition__PersistentAssignment_2"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1501:1: rule__StructureDefinition__PersistentAssignment_2 : ( ( 'persistent' ) ) ;
    public final void rule__StructureDefinition__PersistentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1505:1: ( ( ( 'persistent' ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1506:1: ( ( 'persistent' ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1506:1: ( ( 'persistent' ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1507:1: ( 'persistent' )
            {
             before(grammarAccess.getStructureDefinitionAccess().getPersistentPersistentKeyword_2_0()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1508:1: ( 'persistent' )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1509:1: 'persistent'
            {
             before(grammarAccess.getStructureDefinitionAccess().getPersistentPersistentKeyword_2_0()); 
            match(input,32,FOLLOW_32_in_rule__StructureDefinition__PersistentAssignment_23072); 
             after(grammarAccess.getStructureDefinitionAccess().getPersistentPersistentKeyword_2_0()); 

            }

             after(grammarAccess.getStructureDefinitionAccess().getPersistentPersistentKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureDefinition__PersistentAssignment_2"


    // $ANTLR start "rule__StructureDefinition__FeaturesAssignment_4"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1524:1: rule__StructureDefinition__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__StructureDefinition__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1528:1: ( ( ruleFeature ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1529:1: ( ruleFeature )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1529:1: ( ruleFeature )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1530:1: ruleFeature
            {
             before(grammarAccess.getStructureDefinitionAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__StructureDefinition__FeaturesAssignment_43111);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getStructureDefinitionAccess().getFeaturesFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureDefinition__FeaturesAssignment_4"


    // $ANTLR start "rule__Feature__NameAssignment_0"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1539:1: rule__Feature__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1543:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1544:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1544:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1545:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_03142); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_0"


    // $ANTLR start "rule__Feature__OptionalAssignment_1"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1554:1: rule__Feature__OptionalAssignment_1 : ( ( 'optional' ) ) ;
    public final void rule__Feature__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1558:1: ( ( ( 'optional' ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1559:1: ( ( 'optional' ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1559:1: ( ( 'optional' ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1560:1: ( 'optional' )
            {
             before(grammarAccess.getFeatureAccess().getOptionalOptionalKeyword_1_0()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1561:1: ( 'optional' )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1562:1: 'optional'
            {
             before(grammarAccess.getFeatureAccess().getOptionalOptionalKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Feature__OptionalAssignment_13178); 
             after(grammarAccess.getFeatureAccess().getOptionalOptionalKeyword_1_0()); 

            }

             after(grammarAccess.getFeatureAccess().getOptionalOptionalKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__OptionalAssignment_1"


    // $ANTLR start "rule__Feature__TypeAssignment_3"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1577:1: rule__Feature__TypeAssignment_3 : ( ruleTypeLiteral ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1581:1: ( ( ruleTypeLiteral ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1582:1: ( ruleTypeLiteral )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1582:1: ( ruleTypeLiteral )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1583:1: ruleTypeLiteral
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeLiteral_in_rule__Feature__TypeAssignment_33217);
            ruleTypeLiteral();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTypeTypeLiteralParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TypeAssignment_3"


    // $ANTLR start "rule__EnumerationDefinition__NameAssignment_1"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1592:1: rule__EnumerationDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumerationDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1596:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1597:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1597:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1598:1: RULE_ID
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationDefinition__NameAssignment_13248); 
             after(grammarAccess.getEnumerationDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDefinition__NameAssignment_1"


    // $ANTLR start "rule__EnumerationDefinition__LiteralsAssignment_3"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1607:1: rule__EnumerationDefinition__LiteralsAssignment_3 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationDefinition__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1611:1: ( ( ruleEnumerationLiteral ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1612:1: ( ruleEnumerationLiteral )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1612:1: ( ruleEnumerationLiteral )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1613:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__EnumerationDefinition__LiteralsAssignment_33279);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationDefinitionAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDefinition__LiteralsAssignment_3"


    // $ANTLR start "rule__EnumerationLiteral__NameAssignment_0"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1622:1: rule__EnumerationLiteral__NameAssignment_0 : ( ruleEnumerationName ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1626:1: ( ( ruleEnumerationName ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1627:1: ( ruleEnumerationName )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1627:1: ( ruleEnumerationName )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1628:1: ruleEnumerationName
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameEnumerationNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEnumerationName_in_rule__EnumerationLiteral__NameAssignment_03310);
            ruleEnumerationName();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralAccess().getNameEnumerationNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__NameAssignment_0"


    // $ANTLR start "rule__EnumerationLiteral__DisplayNameAssignment_2"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1637:1: rule__EnumerationLiteral__DisplayNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EnumerationLiteral__DisplayNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1641:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1642:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1642:1: ( RULE_STRING )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1643:1: RULE_STRING
            {
             before(grammarAccess.getEnumerationLiteralAccess().getDisplayNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumerationLiteral__DisplayNameAssignment_23341); 
             after(grammarAccess.getEnumerationLiteralAccess().getDisplayNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__DisplayNameAssignment_2"


    // $ANTLR start "rule__BuiltinTypeLiteral__BuiltinAssignment"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1652:1: rule__BuiltinTypeLiteral__BuiltinAssignment : ( ruleBuiltinTypes ) ;
    public final void rule__BuiltinTypeLiteral__BuiltinAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1656:1: ( ( ruleBuiltinTypes ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1657:1: ( ruleBuiltinTypes )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1657:1: ( ruleBuiltinTypes )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1658:1: ruleBuiltinTypes
            {
             before(grammarAccess.getBuiltinTypeLiteralAccess().getBuiltinBuiltinTypesEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleBuiltinTypes_in_rule__BuiltinTypeLiteral__BuiltinAssignment3372);
            ruleBuiltinTypes();

            state._fsp--;

             after(grammarAccess.getBuiltinTypeLiteralAccess().getBuiltinBuiltinTypesEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuiltinTypeLiteral__BuiltinAssignment"


    // $ANTLR start "rule__DefinedTypeLiteral__TypeAssignment"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1667:1: rule__DefinedTypeLiteral__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DefinedTypeLiteral__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1671:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1672:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1672:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1673:1: ( RULE_ID )
            {
             before(grammarAccess.getDefinedTypeLiteralAccess().getTypeDefinedTypeCrossReference_0()); 
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1674:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1675:1: RULE_ID
            {
             before(grammarAccess.getDefinedTypeLiteralAccess().getTypeDefinedTypeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefinedTypeLiteral__TypeAssignment3407); 
             after(grammarAccess.getDefinedTypeLiteralAccess().getTypeDefinedTypeIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getDefinedTypeLiteralAccess().getTypeDefinedTypeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTypeLiteral__TypeAssignment"


    // $ANTLR start "rule__ListTypeLiteral__ItemTypeAssignment_1"
    // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1686:1: rule__ListTypeLiteral__ItemTypeAssignment_1 : ( ruleTypeLiteral ) ;
    public final void rule__ListTypeLiteral__ItemTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1690:1: ( ( ruleTypeLiteral ) )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1691:1: ( ruleTypeLiteral )
            {
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1691:1: ( ruleTypeLiteral )
            // ../nl.dslmeinte.simscript.structure.ui/src-gen/nl/dslmeinte/simscript/structure/ui/contentassist/antlr/internal/InternalSimStructureDsl.g:1692:1: ruleTypeLiteral
            {
             before(grammarAccess.getListTypeLiteralAccess().getItemTypeTypeLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeLiteral_in_rule__ListTypeLiteral__ItemTypeAssignment_13442);
            ruleTypeLiteral();

            state._fsp--;

             after(grammarAccess.getListTypeLiteralAccess().getItemTypeTypeLiteralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListTypeLiteral__ItemTypeAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStructureModel_in_entryRuleStructureModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureModel__TypeDefinitionsAssignment_in_ruleStructureModel94 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_ruleDefinedType_in_entryRuleDefinedType122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinedType129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinedType__Alternatives_in_ruleDefinedType155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureDefinition_in_entryRuleStructureDefinition182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureDefinition189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__0_in_ruleStructureDefinition215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationDefinition309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__0_in_ruleEnumerationDefinition335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationName_in_entryRuleEnumerationName422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationName429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationName__Alternatives_in_ruleEnumerationName455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_entryRuleTypeLiteral482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteral489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLiteral__Alternatives_in_ruleTypeLiteral515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypeLiteral_in_entryRuleBuiltinTypeLiteral542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinTypeLiteral549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltinTypeLiteral__BuiltinAssignment_in_ruleBuiltinTypeLiteral575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinedTypeLiteral_in_entryRuleDefinedTypeLiteral602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinedTypeLiteral609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinedTypeLiteral__TypeAssignment_in_ruleDefinedTypeLiteral635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListTypeLiteral_in_entryRuleListTypeLiteral662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListTypeLiteral669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListTypeLiteral__Group__0_in_ruleListTypeLiteral695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntheticTypeLiteral_in_entryRuleSyntheticTypeLiteral722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntheticTypeLiteral729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Alternatives_in_ruleSyntheticTypeLiteral755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltinTypes__Alternatives_in_ruleBuiltinTypes792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureDefinition_in_rule__DefinedType__Alternatives827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_rule__DefinedType__Alternatives844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationName__Alternatives876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumerationName__Alternatives893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationName__Alternatives910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypeLiteral_in_rule__TypeLiteral__Alternatives942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinedTypeLiteral_in_rule__TypeLiteral__Alternatives959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListTypeLiteral_in_rule__TypeLiteral__Alternatives976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntheticTypeLiteral_in_rule__TypeLiteral__Alternatives993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_0__0_in_rule__SyntheticTypeLiteral__Alternatives1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_1__0_in_rule__SyntheticTypeLiteral__Alternatives1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_2__0_in_rule__SyntheticTypeLiteral__Alternatives1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BuiltinTypes__Alternatives1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BuiltinTypes__Alternatives1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BuiltinTypes__Alternatives1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BuiltinTypes__Alternatives1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BuiltinTypes__Alternatives1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BuiltinTypes__Alternatives1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BuiltinTypes__Alternatives1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BuiltinTypes__Alternatives1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BuiltinTypes__Alternatives1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BuiltinTypes__Alternatives1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__0__Impl_in_rule__StructureDefinition__Group__01317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__1_in_rule__StructureDefinition__Group__01320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StructureDefinition__Group__0__Impl1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__1__Impl_in_rule__StructureDefinition__Group__11379 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__2_in_rule__StructureDefinition__Group__11382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__NameAssignment_1_in_rule__StructureDefinition__Group__1__Impl1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__2__Impl_in_rule__StructureDefinition__Group__21439 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__3_in_rule__StructureDefinition__Group__21442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__PersistentAssignment_2_in_rule__StructureDefinition__Group__2__Impl1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__3__Impl_in_rule__StructureDefinition__Group__31500 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__4_in_rule__StructureDefinition__Group__31503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StructureDefinition__Group__3__Impl1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__4__Impl_in_rule__StructureDefinition__Group__41562 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__5_in_rule__StructureDefinition__Group__41565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__FeaturesAssignment_4_in_rule__StructureDefinition__Group__4__Impl1592 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__5__Impl_in_rule__StructureDefinition__Group__51623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__StructureDefinition__Group__5__Impl1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__01694 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__01697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_0_in_rule__Feature__Group__0__Impl1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__11754 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__11757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__OptionalAssignment_1_in_rule__Feature__Group__1__Impl1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__21815 = new BitSet(new long[]{0x00000000E81FF810L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__21818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Feature__Group__2__Impl1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__31877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__0__Impl_in_rule__EnumerationDefinition__Group__01942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__1_in_rule__EnumerationDefinition__Group__01945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__EnumerationDefinition__Group__0__Impl1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__1__Impl_in_rule__EnumerationDefinition__Group__12004 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__2_in_rule__EnumerationDefinition__Group__12007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__NameAssignment_1_in_rule__EnumerationDefinition__Group__1__Impl2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__2__Impl_in_rule__EnumerationDefinition__Group__22064 = new BitSet(new long[]{0x0000000000800070L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__3_in_rule__EnumerationDefinition__Group__22067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumerationDefinition__Group__2__Impl2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__3__Impl_in_rule__EnumerationDefinition__Group__32126 = new BitSet(new long[]{0x0000000000800070L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__4_in_rule__EnumerationDefinition__Group__32129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__LiteralsAssignment_3_in_rule__EnumerationDefinition__Group__3__Impl2156 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__4__Impl_in_rule__EnumerationDefinition__Group__42187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumerationDefinition__Group__4__Impl2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__02256 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__02259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__12316 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__12319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EnumerationLiteral__Group__1__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__22378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__DisplayNameAssignment_2_in_rule__EnumerationLiteral__Group__2__Impl2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListTypeLiteral__Group__0__Impl_in_rule__ListTypeLiteral__Group__02441 = new BitSet(new long[]{0x00000000E81FF810L});
    public static final BitSet FOLLOW_rule__ListTypeLiteral__Group__1_in_rule__ListTypeLiteral__Group__02444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ListTypeLiteral__Group__0__Impl2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListTypeLiteral__Group__1__Impl_in_rule__ListTypeLiteral__Group__12503 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ListTypeLiteral__Group__2_in_rule__ListTypeLiteral__Group__12506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListTypeLiteral__ItemTypeAssignment_1_in_rule__ListTypeLiteral__Group__1__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListTypeLiteral__Group__2__Impl_in_rule__ListTypeLiteral__Group__22563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ListTypeLiteral__Group__2__Impl2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_0__0__Impl_in_rule__SyntheticTypeLiteral__Group_0__02628 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_0__1_in_rule__SyntheticTypeLiteral__Group_0__02631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_0__1__Impl_in_rule__SyntheticTypeLiteral__Group_0__12689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SyntheticTypeLiteral__Group_0__1__Impl2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_1__0__Impl_in_rule__SyntheticTypeLiteral__Group_1__02752 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_1__1_in_rule__SyntheticTypeLiteral__Group_1__02755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_1__1__Impl_in_rule__SyntheticTypeLiteral__Group_1__12813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SyntheticTypeLiteral__Group_1__1__Impl2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_2__0__Impl_in_rule__SyntheticTypeLiteral__Group_2__02876 = new BitSet(new long[]{0x00000000E81FF810L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_2__1_in_rule__SyntheticTypeLiteral__Group_2__02879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_2__1__Impl_in_rule__SyntheticTypeLiteral__Group_2__12937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SyntheticTypeLiteral__Group_2__1__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinedType_in_rule__StructureModel__TypeDefinitionsAssignment3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StructureDefinition__NameAssignment_13036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__StructureDefinition__PersistentAssignment_23072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__StructureDefinition__FeaturesAssignment_43111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_03142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Feature__OptionalAssignment_13178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_rule__Feature__TypeAssignment_33217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationDefinition__NameAssignment_13248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__EnumerationDefinition__LiteralsAssignment_33279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationName_in_rule__EnumerationLiteral__NameAssignment_03310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumerationLiteral__DisplayNameAssignment_23341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypes_in_rule__BuiltinTypeLiteral__BuiltinAssignment3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefinedTypeLiteral__TypeAssignment3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_rule__ListTypeLiteral__ItemTypeAssignment_13442 = new BitSet(new long[]{0x0000000000000002L});

}
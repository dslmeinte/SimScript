package nl.dslmeinte.simscript.backend.ui.contentassist.antlr.internal; 

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
import nl.dslmeinte.simscript.backend.services.SimBackendDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimBackendDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_URL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Java'", "'PHP'", "'GET'", "'POST'", "'create'", "'get-by-id'", "'update'", "'delete'", "'String'", "'Boolean'", "'Integer'", "'URL'", "'Text'", "'Number'", "'Email'", "'Phone'", "'Date'", "'Password'", "'config'", "'{'", "'baseURL'", "'='", "'}'", "'flavor'", "'authentication-option'", "'principal'", "'credentials'", "':'", "'interface'", "'->'", "'implemented-by'", "'legacy-servlet'", "'.'", "'crud-service'", "'structure'", "'enumeration'", "'['", "']'", "'Callback'", "'Error'", "'$Void'", "'not-authenticated'", "'persistent'", "'optional'"
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
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_URL=7;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalSimBackendDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimBackendDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimBackendDslParser.tokenNames; }
    public String getGrammarFileName() { return "../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g"; }


     
     	private SimBackendDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SimBackendDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleBackendModel"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:60:1: entryRuleBackendModel : ruleBackendModel EOF ;
    public final void entryRuleBackendModel() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:61:1: ( ruleBackendModel EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:62:1: ruleBackendModel EOF
            {
             before(grammarAccess.getBackendModelRule()); 
            pushFollow(FOLLOW_ruleBackendModel_in_entryRuleBackendModel61);
            ruleBackendModel();

            state._fsp--;

             after(grammarAccess.getBackendModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackendModel68); 

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
    // $ANTLR end "entryRuleBackendModel"


    // $ANTLR start "ruleBackendModel"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:69:1: ruleBackendModel : ( ( rule__BackendModel__Group__0 ) ) ;
    public final void ruleBackendModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:73:2: ( ( ( rule__BackendModel__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:74:1: ( ( rule__BackendModel__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:74:1: ( ( rule__BackendModel__Group__0 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:75:1: ( rule__BackendModel__Group__0 )
            {
             before(grammarAccess.getBackendModelAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:76:1: ( rule__BackendModel__Group__0 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:76:2: rule__BackendModel__Group__0
            {
            pushFollow(FOLLOW_rule__BackendModel__Group__0_in_ruleBackendModel94);
            rule__BackendModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackendModelAccess().getGroup()); 

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
    // $ANTLR end "ruleBackendModel"


    // $ANTLR start "entryRuleAuthenticationDeclaration"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:88:1: entryRuleAuthenticationDeclaration : ruleAuthenticationDeclaration EOF ;
    public final void entryRuleAuthenticationDeclaration() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:89:1: ( ruleAuthenticationDeclaration EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:90:1: ruleAuthenticationDeclaration EOF
            {
             before(grammarAccess.getAuthenticationDeclarationRule()); 
            pushFollow(FOLLOW_ruleAuthenticationDeclaration_in_entryRuleAuthenticationDeclaration121);
            ruleAuthenticationDeclaration();

            state._fsp--;

             after(grammarAccess.getAuthenticationDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthenticationDeclaration128); 

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
    // $ANTLR end "entryRuleAuthenticationDeclaration"


    // $ANTLR start "ruleAuthenticationDeclaration"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:97:1: ruleAuthenticationDeclaration : ( ( rule__AuthenticationDeclaration__Group__0 ) ) ;
    public final void ruleAuthenticationDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:101:2: ( ( ( rule__AuthenticationDeclaration__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:102:1: ( ( rule__AuthenticationDeclaration__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:102:1: ( ( rule__AuthenticationDeclaration__Group__0 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:103:1: ( rule__AuthenticationDeclaration__Group__0 )
            {
             before(grammarAccess.getAuthenticationDeclarationAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:104:1: ( rule__AuthenticationDeclaration__Group__0 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:104:2: rule__AuthenticationDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__0_in_ruleAuthenticationDeclaration154);
            rule__AuthenticationDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleAuthenticationDeclaration"


    // $ANTLR start "entryRuleAuthenticationParameter"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:116:1: entryRuleAuthenticationParameter : ruleAuthenticationParameter EOF ;
    public final void entryRuleAuthenticationParameter() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:117:1: ( ruleAuthenticationParameter EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:118:1: ruleAuthenticationParameter EOF
            {
             before(grammarAccess.getAuthenticationParameterRule()); 
            pushFollow(FOLLOW_ruleAuthenticationParameter_in_entryRuleAuthenticationParameter181);
            ruleAuthenticationParameter();

            state._fsp--;

             after(grammarAccess.getAuthenticationParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthenticationParameter188); 

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
    // $ANTLR end "entryRuleAuthenticationParameter"


    // $ANTLR start "ruleAuthenticationParameter"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:125:1: ruleAuthenticationParameter : ( ( rule__AuthenticationParameter__Group__0 ) ) ;
    public final void ruleAuthenticationParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:129:2: ( ( ( rule__AuthenticationParameter__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:130:1: ( ( rule__AuthenticationParameter__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:130:1: ( ( rule__AuthenticationParameter__Group__0 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:131:1: ( rule__AuthenticationParameter__Group__0 )
            {
             before(grammarAccess.getAuthenticationParameterAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:132:1: ( rule__AuthenticationParameter__Group__0 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:132:2: rule__AuthenticationParameter__Group__0
            {
            pushFollow(FOLLOW_rule__AuthenticationParameter__Group__0_in_ruleAuthenticationParameter214);
            rule__AuthenticationParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleAuthenticationParameter"


    // $ANTLR start "entryRuleService"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:144:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:145:1: ( ruleService EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:146:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService241);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService248); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:153:1: ruleService : ( ( rule__Service__Alternatives ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:157:2: ( ( ( rule__Service__Alternatives ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:158:1: ( ( rule__Service__Alternatives ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:158:1: ( ( rule__Service__Alternatives ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:159:1: ( rule__Service__Alternatives )
            {
             before(grammarAccess.getServiceAccess().getAlternatives()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:160:1: ( rule__Service__Alternatives )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:160:2: rule__Service__Alternatives
            {
            pushFollow(FOLLOW_rule__Service__Alternatives_in_ruleService274);
            rule__Service__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleNamedService"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:172:1: entryRuleNamedService : ruleNamedService EOF ;
    public final void entryRuleNamedService() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:173:1: ( ruleNamedService EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:174:1: ruleNamedService EOF
            {
             before(grammarAccess.getNamedServiceRule()); 
            pushFollow(FOLLOW_ruleNamedService_in_entryRuleNamedService301);
            ruleNamedService();

            state._fsp--;

             after(grammarAccess.getNamedServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedService308); 

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
    // $ANTLR end "entryRuleNamedService"


    // $ANTLR start "ruleNamedService"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:181:1: ruleNamedService : ( ( rule__NamedService__Alternatives ) ) ;
    public final void ruleNamedService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:185:2: ( ( ( rule__NamedService__Alternatives ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:186:1: ( ( rule__NamedService__Alternatives ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:186:1: ( ( rule__NamedService__Alternatives ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:187:1: ( rule__NamedService__Alternatives )
            {
             before(grammarAccess.getNamedServiceAccess().getAlternatives()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:188:1: ( rule__NamedService__Alternatives )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:188:2: rule__NamedService__Alternatives
            {
            pushFollow(FOLLOW_rule__NamedService__Alternatives_in_ruleNamedService334);
            rule__NamedService__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNamedServiceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNamedService"


    // $ANTLR start "entryRuleInterface"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:200:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:201:1: ( ruleInterface EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:202:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface361);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface368); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:209:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:213:2: ( ( ( rule__Interface__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:214:1: ( ( rule__Interface__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:214:1: ( ( rule__Interface__Group__0 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:215:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:216:1: ( rule__Interface__Group__0 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:216:2: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_rule__Interface__Group__0_in_ruleInterface394);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleLegacyServlet"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:228:1: entryRuleLegacyServlet : ruleLegacyServlet EOF ;
    public final void entryRuleLegacyServlet() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:229:1: ( ruleLegacyServlet EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:230:1: ruleLegacyServlet EOF
            {
             before(grammarAccess.getLegacyServletRule()); 
            pushFollow(FOLLOW_ruleLegacyServlet_in_entryRuleLegacyServlet421);
            ruleLegacyServlet();

            state._fsp--;

             after(grammarAccess.getLegacyServletRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLegacyServlet428); 

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
    // $ANTLR end "entryRuleLegacyServlet"


    // $ANTLR start "ruleLegacyServlet"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:237:1: ruleLegacyServlet : ( ( rule__LegacyServlet__Group__0 ) ) ;
    public final void ruleLegacyServlet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:241:2: ( ( ( rule__LegacyServlet__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:242:1: ( ( rule__LegacyServlet__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:242:1: ( ( rule__LegacyServlet__Group__0 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:243:1: ( rule__LegacyServlet__Group__0 )
            {
             before(grammarAccess.getLegacyServletAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:244:1: ( rule__LegacyServlet__Group__0 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:244:2: rule__LegacyServlet__Group__0
            {
            pushFollow(FOLLOW_rule__LegacyServlet__Group__0_in_ruleLegacyServlet454);
            rule__LegacyServlet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLegacyServletAccess().getGroup()); 

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
    // $ANTLR end "ruleLegacyServlet"


    // $ANTLR start "entryRuleQualifiedName"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:256:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:257:1: ( ruleQualifiedName EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:258:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName481);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName488); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:265:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:269:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:270:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:270:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:271:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:272:1: ( rule__QualifiedName__Group__0 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:272:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName514);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleCrudService"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:284:1: entryRuleCrudService : ruleCrudService EOF ;
    public final void entryRuleCrudService() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:285:1: ( ruleCrudService EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:286:1: ruleCrudService EOF
            {
             before(grammarAccess.getCrudServiceRule()); 
            pushFollow(FOLLOW_ruleCrudService_in_entryRuleCrudService541);
            ruleCrudService();

            state._fsp--;

             after(grammarAccess.getCrudServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCrudService548); 

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
    // $ANTLR end "entryRuleCrudService"


    // $ANTLR start "ruleCrudService"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:293:1: ruleCrudService : ( ( rule__CrudService__Group__0 ) ) ;
    public final void ruleCrudService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:297:2: ( ( ( rule__CrudService__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:298:1: ( ( rule__CrudService__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:298:1: ( ( rule__CrudService__Group__0 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:299:1: ( rule__CrudService__Group__0 )
            {
             before(grammarAccess.getCrudServiceAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:300:1: ( rule__CrudService__Group__0 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:300:2: rule__CrudService__Group__0
            {
            pushFollow(FOLLOW_rule__CrudService__Group__0_in_ruleCrudService574);
            rule__CrudService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCrudServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleCrudService"


    // $ANTLR start "entryRuleDefinedType"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:314:1: entryRuleDefinedType : ruleDefinedType EOF ;
    public final void entryRuleDefinedType() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:315:1: ( ruleDefinedType EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:316:1: ruleDefinedType EOF
            {
             before(grammarAccess.getDefinedTypeRule()); 
            pushFollow(FOLLOW_ruleDefinedType_in_entryRuleDefinedType603);
            ruleDefinedType();

            state._fsp--;

             after(grammarAccess.getDefinedTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinedType610); 

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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:323:1: ruleDefinedType : ( ( rule__DefinedType__Alternatives ) ) ;
    public final void ruleDefinedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:327:2: ( ( ( rule__DefinedType__Alternatives ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:328:1: ( ( rule__DefinedType__Alternatives ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:328:1: ( ( rule__DefinedType__Alternatives ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:329:1: ( rule__DefinedType__Alternatives )
            {
             before(grammarAccess.getDefinedTypeAccess().getAlternatives()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:330:1: ( rule__DefinedType__Alternatives )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:330:2: rule__DefinedType__Alternatives
            {
            pushFollow(FOLLOW_rule__DefinedType__Alternatives_in_ruleDefinedType636);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:342:1: entryRuleStructureDefinition : ruleStructureDefinition EOF ;
    public final void entryRuleStructureDefinition() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:343:1: ( ruleStructureDefinition EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:344:1: ruleStructureDefinition EOF
            {
             before(grammarAccess.getStructureDefinitionRule()); 
            pushFollow(FOLLOW_ruleStructureDefinition_in_entryRuleStructureDefinition663);
            ruleStructureDefinition();

            state._fsp--;

             after(grammarAccess.getStructureDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureDefinition670); 

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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:351:1: ruleStructureDefinition : ( ( rule__StructureDefinition__Group__0 ) ) ;
    public final void ruleStructureDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:355:2: ( ( ( rule__StructureDefinition__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:356:1: ( ( rule__StructureDefinition__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:356:1: ( ( rule__StructureDefinition__Group__0 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:357:1: ( rule__StructureDefinition__Group__0 )
            {
             before(grammarAccess.getStructureDefinitionAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:358:1: ( rule__StructureDefinition__Group__0 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:358:2: rule__StructureDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__StructureDefinition__Group__0_in_ruleStructureDefinition696);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:370:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:371:1: ( ruleFeature EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:372:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature723);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature730); 

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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:379:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:383:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:384:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:384:1: ( ( rule__Feature__Group__0 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:385:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:386:1: ( rule__Feature__Group__0 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:386:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature756);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:398:1: entryRuleEnumerationDefinition : ruleEnumerationDefinition EOF ;
    public final void entryRuleEnumerationDefinition() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:399:1: ( ruleEnumerationDefinition EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:400:1: ruleEnumerationDefinition EOF
            {
             before(grammarAccess.getEnumerationDefinitionRule()); 
            pushFollow(FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition783);
            ruleEnumerationDefinition();

            state._fsp--;

             after(grammarAccess.getEnumerationDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationDefinition790); 

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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:407:1: ruleEnumerationDefinition : ( ( rule__EnumerationDefinition__Group__0 ) ) ;
    public final void ruleEnumerationDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:411:2: ( ( ( rule__EnumerationDefinition__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:412:1: ( ( rule__EnumerationDefinition__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:412:1: ( ( rule__EnumerationDefinition__Group__0 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:413:1: ( rule__EnumerationDefinition__Group__0 )
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:414:1: ( rule__EnumerationDefinition__Group__0 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:414:2: rule__EnumerationDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__0_in_ruleEnumerationDefinition816);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:426:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:427:1: ( ruleEnumerationLiteral EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:428:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral843);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral850); 

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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:435:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:439:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:440:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:440:1: ( ( rule__EnumerationLiteral__Group__0 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:441:1: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:442:1: ( rule__EnumerationLiteral__Group__0 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:442:2: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral876);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:454:1: entryRuleEnumerationName : ruleEnumerationName EOF ;
    public final void entryRuleEnumerationName() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:455:1: ( ruleEnumerationName EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:456:1: ruleEnumerationName EOF
            {
             before(grammarAccess.getEnumerationNameRule()); 
            pushFollow(FOLLOW_ruleEnumerationName_in_entryRuleEnumerationName903);
            ruleEnumerationName();

            state._fsp--;

             after(grammarAccess.getEnumerationNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationName910); 

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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:463:1: ruleEnumerationName : ( ( rule__EnumerationName__Alternatives ) ) ;
    public final void ruleEnumerationName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:467:2: ( ( ( rule__EnumerationName__Alternatives ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:468:1: ( ( rule__EnumerationName__Alternatives ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:468:1: ( ( rule__EnumerationName__Alternatives ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:469:1: ( rule__EnumerationName__Alternatives )
            {
             before(grammarAccess.getEnumerationNameAccess().getAlternatives()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:470:1: ( rule__EnumerationName__Alternatives )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:470:2: rule__EnumerationName__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumerationName__Alternatives_in_ruleEnumerationName936);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:482:1: entryRuleTypeLiteral : ruleTypeLiteral EOF ;
    public final void entryRuleTypeLiteral() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:483:1: ( ruleTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:484:1: ruleTypeLiteral EOF
            {
             before(grammarAccess.getTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleTypeLiteral_in_entryRuleTypeLiteral963);
            ruleTypeLiteral();

            state._fsp--;

             after(grammarAccess.getTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLiteral970); 

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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:491:1: ruleTypeLiteral : ( ( rule__TypeLiteral__Alternatives ) ) ;
    public final void ruleTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:495:2: ( ( ( rule__TypeLiteral__Alternatives ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:496:1: ( ( rule__TypeLiteral__Alternatives ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:496:1: ( ( rule__TypeLiteral__Alternatives ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:497:1: ( rule__TypeLiteral__Alternatives )
            {
             before(grammarAccess.getTypeLiteralAccess().getAlternatives()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:498:1: ( rule__TypeLiteral__Alternatives )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:498:2: rule__TypeLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeLiteral__Alternatives_in_ruleTypeLiteral996);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:510:1: entryRuleBuiltinTypeLiteral : ruleBuiltinTypeLiteral EOF ;
    public final void entryRuleBuiltinTypeLiteral() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:511:1: ( ruleBuiltinTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:512:1: ruleBuiltinTypeLiteral EOF
            {
             before(grammarAccess.getBuiltinTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleBuiltinTypeLiteral_in_entryRuleBuiltinTypeLiteral1023);
            ruleBuiltinTypeLiteral();

            state._fsp--;

             after(grammarAccess.getBuiltinTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinTypeLiteral1030); 

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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:519:1: ruleBuiltinTypeLiteral : ( ( rule__BuiltinTypeLiteral__BuiltinAssignment ) ) ;
    public final void ruleBuiltinTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:523:2: ( ( ( rule__BuiltinTypeLiteral__BuiltinAssignment ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:524:1: ( ( rule__BuiltinTypeLiteral__BuiltinAssignment ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:524:1: ( ( rule__BuiltinTypeLiteral__BuiltinAssignment ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:525:1: ( rule__BuiltinTypeLiteral__BuiltinAssignment )
            {
             before(grammarAccess.getBuiltinTypeLiteralAccess().getBuiltinAssignment()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:526:1: ( rule__BuiltinTypeLiteral__BuiltinAssignment )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:526:2: rule__BuiltinTypeLiteral__BuiltinAssignment
            {
            pushFollow(FOLLOW_rule__BuiltinTypeLiteral__BuiltinAssignment_in_ruleBuiltinTypeLiteral1056);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:538:1: entryRuleDefinedTypeLiteral : ruleDefinedTypeLiteral EOF ;
    public final void entryRuleDefinedTypeLiteral() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:539:1: ( ruleDefinedTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:540:1: ruleDefinedTypeLiteral EOF
            {
             before(grammarAccess.getDefinedTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleDefinedTypeLiteral_in_entryRuleDefinedTypeLiteral1083);
            ruleDefinedTypeLiteral();

            state._fsp--;

             after(grammarAccess.getDefinedTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinedTypeLiteral1090); 

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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:547:1: ruleDefinedTypeLiteral : ( ( rule__DefinedTypeLiteral__TypeAssignment ) ) ;
    public final void ruleDefinedTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:551:2: ( ( ( rule__DefinedTypeLiteral__TypeAssignment ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:552:1: ( ( rule__DefinedTypeLiteral__TypeAssignment ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:552:1: ( ( rule__DefinedTypeLiteral__TypeAssignment ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:553:1: ( rule__DefinedTypeLiteral__TypeAssignment )
            {
             before(grammarAccess.getDefinedTypeLiteralAccess().getTypeAssignment()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:554:1: ( rule__DefinedTypeLiteral__TypeAssignment )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:554:2: rule__DefinedTypeLiteral__TypeAssignment
            {
            pushFollow(FOLLOW_rule__DefinedTypeLiteral__TypeAssignment_in_ruleDefinedTypeLiteral1116);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:566:1: entryRuleListTypeLiteral : ruleListTypeLiteral EOF ;
    public final void entryRuleListTypeLiteral() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:567:1: ( ruleListTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:568:1: ruleListTypeLiteral EOF
            {
             before(grammarAccess.getListTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleListTypeLiteral_in_entryRuleListTypeLiteral1143);
            ruleListTypeLiteral();

            state._fsp--;

             after(grammarAccess.getListTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListTypeLiteral1150); 

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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:575:1: ruleListTypeLiteral : ( ( rule__ListTypeLiteral__Group__0 ) ) ;
    public final void ruleListTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:579:2: ( ( ( rule__ListTypeLiteral__Group__0 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:580:1: ( ( rule__ListTypeLiteral__Group__0 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:580:1: ( ( rule__ListTypeLiteral__Group__0 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:581:1: ( rule__ListTypeLiteral__Group__0 )
            {
             before(grammarAccess.getListTypeLiteralAccess().getGroup()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:582:1: ( rule__ListTypeLiteral__Group__0 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:582:2: rule__ListTypeLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ListTypeLiteral__Group__0_in_ruleListTypeLiteral1176);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:594:1: entryRuleSyntheticTypeLiteral : ruleSyntheticTypeLiteral EOF ;
    public final void entryRuleSyntheticTypeLiteral() throws RecognitionException {
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:595:1: ( ruleSyntheticTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:596:1: ruleSyntheticTypeLiteral EOF
            {
             before(grammarAccess.getSyntheticTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleSyntheticTypeLiteral_in_entryRuleSyntheticTypeLiteral1203);
            ruleSyntheticTypeLiteral();

            state._fsp--;

             after(grammarAccess.getSyntheticTypeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntheticTypeLiteral1210); 

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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:603:1: ruleSyntheticTypeLiteral : ( ( rule__SyntheticTypeLiteral__Alternatives ) ) ;
    public final void ruleSyntheticTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:607:2: ( ( ( rule__SyntheticTypeLiteral__Alternatives ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:608:1: ( ( rule__SyntheticTypeLiteral__Alternatives ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:608:1: ( ( rule__SyntheticTypeLiteral__Alternatives ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:609:1: ( rule__SyntheticTypeLiteral__Alternatives )
            {
             before(grammarAccess.getSyntheticTypeLiteralAccess().getAlternatives()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:610:1: ( rule__SyntheticTypeLiteral__Alternatives )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:610:2: rule__SyntheticTypeLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Alternatives_in_ruleSyntheticTypeLiteral1236);
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


    // $ANTLR start "ruleFlavors"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:623:1: ruleFlavors : ( ( rule__Flavors__Alternatives ) ) ;
    public final void ruleFlavors() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:627:1: ( ( ( rule__Flavors__Alternatives ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:628:1: ( ( rule__Flavors__Alternatives ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:628:1: ( ( rule__Flavors__Alternatives ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:629:1: ( rule__Flavors__Alternatives )
            {
             before(grammarAccess.getFlavorsAccess().getAlternatives()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:630:1: ( rule__Flavors__Alternatives )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:630:2: rule__Flavors__Alternatives
            {
            pushFollow(FOLLOW_rule__Flavors__Alternatives_in_ruleFlavors1273);
            rule__Flavors__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFlavorsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFlavors"


    // $ANTLR start "ruleHttpMethods"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:642:1: ruleHttpMethods : ( ( rule__HttpMethods__Alternatives ) ) ;
    public final void ruleHttpMethods() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:646:1: ( ( ( rule__HttpMethods__Alternatives ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:647:1: ( ( rule__HttpMethods__Alternatives ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:647:1: ( ( rule__HttpMethods__Alternatives ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:648:1: ( rule__HttpMethods__Alternatives )
            {
             before(grammarAccess.getHttpMethodsAccess().getAlternatives()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:649:1: ( rule__HttpMethods__Alternatives )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:649:2: rule__HttpMethods__Alternatives
            {
            pushFollow(FOLLOW_rule__HttpMethods__Alternatives_in_ruleHttpMethods1309);
            rule__HttpMethods__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHttpMethodsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleHttpMethods"


    // $ANTLR start "ruleCrudTypes"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:661:1: ruleCrudTypes : ( ( rule__CrudTypes__Alternatives ) ) ;
    public final void ruleCrudTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:665:1: ( ( ( rule__CrudTypes__Alternatives ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:666:1: ( ( rule__CrudTypes__Alternatives ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:666:1: ( ( rule__CrudTypes__Alternatives ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:667:1: ( rule__CrudTypes__Alternatives )
            {
             before(grammarAccess.getCrudTypesAccess().getAlternatives()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:668:1: ( rule__CrudTypes__Alternatives )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:668:2: rule__CrudTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__CrudTypes__Alternatives_in_ruleCrudTypes1345);
            rule__CrudTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCrudTypesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCrudTypes"


    // $ANTLR start "ruleBuiltinTypes"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:680:1: ruleBuiltinTypes : ( ( rule__BuiltinTypes__Alternatives ) ) ;
    public final void ruleBuiltinTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:684:1: ( ( ( rule__BuiltinTypes__Alternatives ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:685:1: ( ( rule__BuiltinTypes__Alternatives ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:685:1: ( ( rule__BuiltinTypes__Alternatives ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:686:1: ( rule__BuiltinTypes__Alternatives )
            {
             before(grammarAccess.getBuiltinTypesAccess().getAlternatives()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:687:1: ( rule__BuiltinTypes__Alternatives )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:687:2: rule__BuiltinTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__BuiltinTypes__Alternatives_in_ruleBuiltinTypes1381);
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


    // $ANTLR start "rule__Service__Alternatives"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:698:1: rule__Service__Alternatives : ( ( ruleNamedService ) | ( ruleCrudService ) );
    public final void rule__Service__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:702:1: ( ( ruleNamedService ) | ( ruleCrudService ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==40||LA1_0==43) ) {
                alt1=1;
            }
            else if ( (LA1_0==45) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:703:1: ( ruleNamedService )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:703:1: ( ruleNamedService )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:704:1: ruleNamedService
                    {
                     before(grammarAccess.getServiceAccess().getNamedServiceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNamedService_in_rule__Service__Alternatives1416);
                    ruleNamedService();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getNamedServiceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:709:6: ( ruleCrudService )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:709:6: ( ruleCrudService )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:710:1: ruleCrudService
                    {
                     before(grammarAccess.getServiceAccess().getCrudServiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCrudService_in_rule__Service__Alternatives1433);
                    ruleCrudService();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getCrudServiceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Service__Alternatives"


    // $ANTLR start "rule__NamedService__Alternatives"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:720:1: rule__NamedService__Alternatives : ( ( ruleInterface ) | ( ruleLegacyServlet ) );
    public final void rule__NamedService__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:724:1: ( ( ruleInterface ) | ( ruleLegacyServlet ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==40) ) {
                alt2=1;
            }
            else if ( (LA2_0==43) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:725:1: ( ruleInterface )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:725:1: ( ruleInterface )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:726:1: ruleInterface
                    {
                     before(grammarAccess.getNamedServiceAccess().getInterfaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleInterface_in_rule__NamedService__Alternatives1465);
                    ruleInterface();

                    state._fsp--;

                     after(grammarAccess.getNamedServiceAccess().getInterfaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:731:6: ( ruleLegacyServlet )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:731:6: ( ruleLegacyServlet )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:732:1: ruleLegacyServlet
                    {
                     before(grammarAccess.getNamedServiceAccess().getLegacyServletParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLegacyServlet_in_rule__NamedService__Alternatives1482);
                    ruleLegacyServlet();

                    state._fsp--;

                     after(grammarAccess.getNamedServiceAccess().getLegacyServletParserRuleCall_1()); 

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
    // $ANTLR end "rule__NamedService__Alternatives"


    // $ANTLR start "rule__DefinedType__Alternatives"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:742:1: rule__DefinedType__Alternatives : ( ( ruleStructureDefinition ) | ( ruleEnumerationDefinition ) );
    public final void rule__DefinedType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:746:1: ( ( ruleStructureDefinition ) | ( ruleEnumerationDefinition ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==46) ) {
                alt3=1;
            }
            else if ( (LA3_0==47) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:747:1: ( ruleStructureDefinition )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:747:1: ( ruleStructureDefinition )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:748:1: ruleStructureDefinition
                    {
                     before(grammarAccess.getDefinedTypeAccess().getStructureDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStructureDefinition_in_rule__DefinedType__Alternatives1514);
                    ruleStructureDefinition();

                    state._fsp--;

                     after(grammarAccess.getDefinedTypeAccess().getStructureDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:753:6: ( ruleEnumerationDefinition )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:753:6: ( ruleEnumerationDefinition )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:754:1: ruleEnumerationDefinition
                    {
                     before(grammarAccess.getDefinedTypeAccess().getEnumerationDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumerationDefinition_in_rule__DefinedType__Alternatives1531);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:764:1: rule__EnumerationName__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) );
    public final void rule__EnumerationName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:768:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:769:1: ( RULE_ID )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:769:1: ( RULE_ID )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:770:1: RULE_ID
                    {
                     before(grammarAccess.getEnumerationNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationName__Alternatives1563); 
                     after(grammarAccess.getEnumerationNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:775:6: ( RULE_STRING )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:775:6: ( RULE_STRING )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:776:1: RULE_STRING
                    {
                     before(grammarAccess.getEnumerationNameAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumerationName__Alternatives1580); 
                     after(grammarAccess.getEnumerationNameAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:781:6: ( RULE_INT )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:781:6: ( RULE_INT )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:782:1: RULE_INT
                    {
                     before(grammarAccess.getEnumerationNameAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumerationName__Alternatives1597); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:792:1: rule__TypeLiteral__Alternatives : ( ( ruleBuiltinTypeLiteral ) | ( ruleDefinedTypeLiteral ) | ( ruleListTypeLiteral ) | ( ruleSyntheticTypeLiteral ) );
    public final void rule__TypeLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:796:1: ( ( ruleBuiltinTypeLiteral ) | ( ruleDefinedTypeLiteral ) | ( ruleListTypeLiteral ) | ( ruleSyntheticTypeLiteral ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 48:
                {
                alt5=3;
                }
                break;
            case 50:
            case 51:
            case 52:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:797:1: ( ruleBuiltinTypeLiteral )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:797:1: ( ruleBuiltinTypeLiteral )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:798:1: ruleBuiltinTypeLiteral
                    {
                     before(grammarAccess.getTypeLiteralAccess().getBuiltinTypeLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBuiltinTypeLiteral_in_rule__TypeLiteral__Alternatives1629);
                    ruleBuiltinTypeLiteral();

                    state._fsp--;

                     after(grammarAccess.getTypeLiteralAccess().getBuiltinTypeLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:803:6: ( ruleDefinedTypeLiteral )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:803:6: ( ruleDefinedTypeLiteral )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:804:1: ruleDefinedTypeLiteral
                    {
                     before(grammarAccess.getTypeLiteralAccess().getDefinedTypeLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDefinedTypeLiteral_in_rule__TypeLiteral__Alternatives1646);
                    ruleDefinedTypeLiteral();

                    state._fsp--;

                     after(grammarAccess.getTypeLiteralAccess().getDefinedTypeLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:809:6: ( ruleListTypeLiteral )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:809:6: ( ruleListTypeLiteral )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:810:1: ruleListTypeLiteral
                    {
                     before(grammarAccess.getTypeLiteralAccess().getListTypeLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleListTypeLiteral_in_rule__TypeLiteral__Alternatives1663);
                    ruleListTypeLiteral();

                    state._fsp--;

                     after(grammarAccess.getTypeLiteralAccess().getListTypeLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:815:6: ( ruleSyntheticTypeLiteral )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:815:6: ( ruleSyntheticTypeLiteral )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:816:1: ruleSyntheticTypeLiteral
                    {
                     before(grammarAccess.getTypeLiteralAccess().getSyntheticTypeLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSyntheticTypeLiteral_in_rule__TypeLiteral__Alternatives1680);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:826:1: rule__SyntheticTypeLiteral__Alternatives : ( ( ( rule__SyntheticTypeLiteral__Group_0__0 ) ) | ( ( rule__SyntheticTypeLiteral__Group_1__0 ) ) | ( ( rule__SyntheticTypeLiteral__Group_2__0 ) ) );
    public final void rule__SyntheticTypeLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:830:1: ( ( ( rule__SyntheticTypeLiteral__Group_0__0 ) ) | ( ( rule__SyntheticTypeLiteral__Group_1__0 ) ) | ( ( rule__SyntheticTypeLiteral__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt6=1;
                }
                break;
            case 51:
                {
                alt6=2;
                }
                break;
            case 52:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:831:1: ( ( rule__SyntheticTypeLiteral__Group_0__0 ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:831:1: ( ( rule__SyntheticTypeLiteral__Group_0__0 ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:832:1: ( rule__SyntheticTypeLiteral__Group_0__0 )
                    {
                     before(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_0()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:833:1: ( rule__SyntheticTypeLiteral__Group_0__0 )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:833:2: rule__SyntheticTypeLiteral__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_0__0_in_rule__SyntheticTypeLiteral__Alternatives1712);
                    rule__SyntheticTypeLiteral__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:837:6: ( ( rule__SyntheticTypeLiteral__Group_1__0 ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:837:6: ( ( rule__SyntheticTypeLiteral__Group_1__0 ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:838:1: ( rule__SyntheticTypeLiteral__Group_1__0 )
                    {
                     before(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_1()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:839:1: ( rule__SyntheticTypeLiteral__Group_1__0 )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:839:2: rule__SyntheticTypeLiteral__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_1__0_in_rule__SyntheticTypeLiteral__Alternatives1730);
                    rule__SyntheticTypeLiteral__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:843:6: ( ( rule__SyntheticTypeLiteral__Group_2__0 ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:843:6: ( ( rule__SyntheticTypeLiteral__Group_2__0 ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:844:1: ( rule__SyntheticTypeLiteral__Group_2__0 )
                    {
                     before(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_2()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:845:1: ( rule__SyntheticTypeLiteral__Group_2__0 )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:845:2: rule__SyntheticTypeLiteral__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_2__0_in_rule__SyntheticTypeLiteral__Alternatives1748);
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


    // $ANTLR start "rule__Flavors__Alternatives"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:854:1: rule__Flavors__Alternatives : ( ( ( 'Java' ) ) | ( ( 'PHP' ) ) );
    public final void rule__Flavors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:858:1: ( ( ( 'Java' ) ) | ( ( 'PHP' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:859:1: ( ( 'Java' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:859:1: ( ( 'Java' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:860:1: ( 'Java' )
                    {
                     before(grammarAccess.getFlavorsAccess().getJavaEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:861:1: ( 'Java' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:861:3: 'Java'
                    {
                    match(input,12,FOLLOW_12_in_rule__Flavors__Alternatives1782); 

                    }

                     after(grammarAccess.getFlavorsAccess().getJavaEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:866:6: ( ( 'PHP' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:866:6: ( ( 'PHP' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:867:1: ( 'PHP' )
                    {
                     before(grammarAccess.getFlavorsAccess().getPhpEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:868:1: ( 'PHP' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:868:3: 'PHP'
                    {
                    match(input,13,FOLLOW_13_in_rule__Flavors__Alternatives1803); 

                    }

                     after(grammarAccess.getFlavorsAccess().getPhpEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Flavors__Alternatives"


    // $ANTLR start "rule__HttpMethods__Alternatives"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:878:1: rule__HttpMethods__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) );
    public final void rule__HttpMethods__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:882:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:883:1: ( ( 'GET' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:883:1: ( ( 'GET' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:884:1: ( 'GET' )
                    {
                     before(grammarAccess.getHttpMethodsAccess().getGetEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:885:1: ( 'GET' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:885:3: 'GET'
                    {
                    match(input,14,FOLLOW_14_in_rule__HttpMethods__Alternatives1839); 

                    }

                     after(grammarAccess.getHttpMethodsAccess().getGetEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:890:6: ( ( 'POST' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:890:6: ( ( 'POST' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:891:1: ( 'POST' )
                    {
                     before(grammarAccess.getHttpMethodsAccess().getPostEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:892:1: ( 'POST' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:892:3: 'POST'
                    {
                    match(input,15,FOLLOW_15_in_rule__HttpMethods__Alternatives1860); 

                    }

                     after(grammarAccess.getHttpMethodsAccess().getPostEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__HttpMethods__Alternatives"


    // $ANTLR start "rule__CrudTypes__Alternatives"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:902:1: rule__CrudTypes__Alternatives : ( ( ( 'create' ) ) | ( ( 'get-by-id' ) ) | ( ( 'update' ) ) | ( ( 'delete' ) ) );
    public final void rule__CrudTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:906:1: ( ( ( 'create' ) ) | ( ( 'get-by-id' ) ) | ( ( 'update' ) ) | ( ( 'delete' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            case 19:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:907:1: ( ( 'create' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:907:1: ( ( 'create' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:908:1: ( 'create' )
                    {
                     before(grammarAccess.getCrudTypesAccess().getCreateEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:909:1: ( 'create' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:909:3: 'create'
                    {
                    match(input,16,FOLLOW_16_in_rule__CrudTypes__Alternatives1896); 

                    }

                     after(grammarAccess.getCrudTypesAccess().getCreateEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:914:6: ( ( 'get-by-id' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:914:6: ( ( 'get-by-id' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:915:1: ( 'get-by-id' )
                    {
                     before(grammarAccess.getCrudTypesAccess().getGetByIdEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:916:1: ( 'get-by-id' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:916:3: 'get-by-id'
                    {
                    match(input,17,FOLLOW_17_in_rule__CrudTypes__Alternatives1917); 

                    }

                     after(grammarAccess.getCrudTypesAccess().getGetByIdEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:921:6: ( ( 'update' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:921:6: ( ( 'update' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:922:1: ( 'update' )
                    {
                     before(grammarAccess.getCrudTypesAccess().getUpdateEnumLiteralDeclaration_2()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:923:1: ( 'update' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:923:3: 'update'
                    {
                    match(input,18,FOLLOW_18_in_rule__CrudTypes__Alternatives1938); 

                    }

                     after(grammarAccess.getCrudTypesAccess().getUpdateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:928:6: ( ( 'delete' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:928:6: ( ( 'delete' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:929:1: ( 'delete' )
                    {
                     before(grammarAccess.getCrudTypesAccess().getDeleteEnumLiteralDeclaration_3()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:930:1: ( 'delete' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:930:3: 'delete'
                    {
                    match(input,19,FOLLOW_19_in_rule__CrudTypes__Alternatives1959); 

                    }

                     after(grammarAccess.getCrudTypesAccess().getDeleteEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__CrudTypes__Alternatives"


    // $ANTLR start "rule__BuiltinTypes__Alternatives"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:940:1: rule__BuiltinTypes__Alternatives : ( ( ( 'String' ) ) | ( ( 'Boolean' ) ) | ( ( 'Integer' ) ) | ( ( 'URL' ) ) | ( ( 'Text' ) ) | ( ( 'Number' ) ) | ( ( 'Email' ) ) | ( ( 'Phone' ) ) | ( ( 'Date' ) ) | ( ( 'Password' ) ) );
    public final void rule__BuiltinTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:944:1: ( ( ( 'String' ) ) | ( ( 'Boolean' ) ) | ( ( 'Integer' ) ) | ( ( 'URL' ) ) | ( ( 'Text' ) ) | ( ( 'Number' ) ) | ( ( 'Email' ) ) | ( ( 'Phone' ) ) | ( ( 'Date' ) ) | ( ( 'Password' ) ) )
            int alt10=10;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            case 23:
                {
                alt10=4;
                }
                break;
            case 24:
                {
                alt10=5;
                }
                break;
            case 25:
                {
                alt10=6;
                }
                break;
            case 26:
                {
                alt10=7;
                }
                break;
            case 27:
                {
                alt10=8;
                }
                break;
            case 28:
                {
                alt10=9;
                }
                break;
            case 29:
                {
                alt10=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:945:1: ( ( 'String' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:945:1: ( ( 'String' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:946:1: ( 'String' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:947:1: ( 'String' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:947:3: 'String'
                    {
                    match(input,20,FOLLOW_20_in_rule__BuiltinTypes__Alternatives1995); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:952:6: ( ( 'Boolean' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:952:6: ( ( 'Boolean' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:953:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getBooleanEnumLiteralDeclaration_1()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:954:1: ( 'Boolean' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:954:3: 'Boolean'
                    {
                    match(input,21,FOLLOW_21_in_rule__BuiltinTypes__Alternatives2016); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getBooleanEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:959:6: ( ( 'Integer' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:959:6: ( ( 'Integer' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:960:1: ( 'Integer' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getIntegerEnumLiteralDeclaration_2()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:961:1: ( 'Integer' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:961:3: 'Integer'
                    {
                    match(input,22,FOLLOW_22_in_rule__BuiltinTypes__Alternatives2037); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getIntegerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:966:6: ( ( 'URL' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:966:6: ( ( 'URL' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:967:1: ( 'URL' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getUrlEnumLiteralDeclaration_3()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:968:1: ( 'URL' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:968:3: 'URL'
                    {
                    match(input,23,FOLLOW_23_in_rule__BuiltinTypes__Alternatives2058); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getUrlEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:973:6: ( ( 'Text' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:973:6: ( ( 'Text' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:974:1: ( 'Text' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getTextEnumLiteralDeclaration_4()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:975:1: ( 'Text' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:975:3: 'Text'
                    {
                    match(input,24,FOLLOW_24_in_rule__BuiltinTypes__Alternatives2079); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getTextEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:980:6: ( ( 'Number' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:980:6: ( ( 'Number' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:981:1: ( 'Number' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getNumberEnumLiteralDeclaration_5()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:982:1: ( 'Number' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:982:3: 'Number'
                    {
                    match(input,25,FOLLOW_25_in_rule__BuiltinTypes__Alternatives2100); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getNumberEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:987:6: ( ( 'Email' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:987:6: ( ( 'Email' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:988:1: ( 'Email' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getEmailEnumLiteralDeclaration_6()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:989:1: ( 'Email' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:989:3: 'Email'
                    {
                    match(input,26,FOLLOW_26_in_rule__BuiltinTypes__Alternatives2121); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getEmailEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:994:6: ( ( 'Phone' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:994:6: ( ( 'Phone' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:995:1: ( 'Phone' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getPhoneEnumLiteralDeclaration_7()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:996:1: ( 'Phone' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:996:3: 'Phone'
                    {
                    match(input,27,FOLLOW_27_in_rule__BuiltinTypes__Alternatives2142); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getPhoneEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1001:6: ( ( 'Date' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1001:6: ( ( 'Date' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1002:1: ( 'Date' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getDateEnumLiteralDeclaration_8()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1003:1: ( 'Date' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1003:3: 'Date'
                    {
                    match(input,28,FOLLOW_28_in_rule__BuiltinTypes__Alternatives2163); 

                    }

                     after(grammarAccess.getBuiltinTypesAccess().getDateEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1008:6: ( ( 'Password' ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1008:6: ( ( 'Password' ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1009:1: ( 'Password' )
                    {
                     before(grammarAccess.getBuiltinTypesAccess().getPasswordEnumLiteralDeclaration_9()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1010:1: ( 'Password' )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1010:3: 'Password'
                    {
                    match(input,29,FOLLOW_29_in_rule__BuiltinTypes__Alternatives2184); 

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


    // $ANTLR start "rule__BackendModel__Group__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1022:1: rule__BackendModel__Group__0 : rule__BackendModel__Group__0__Impl rule__BackendModel__Group__1 ;
    public final void rule__BackendModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1026:1: ( rule__BackendModel__Group__0__Impl rule__BackendModel__Group__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1027:2: rule__BackendModel__Group__0__Impl rule__BackendModel__Group__1
            {
            pushFollow(FOLLOW_rule__BackendModel__Group__0__Impl_in_rule__BackendModel__Group__02217);
            rule__BackendModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BackendModel__Group__1_in_rule__BackendModel__Group__02220);
            rule__BackendModel__Group__1();

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
    // $ANTLR end "rule__BackendModel__Group__0"


    // $ANTLR start "rule__BackendModel__Group__0__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1034:1: rule__BackendModel__Group__0__Impl : ( () ) ;
    public final void rule__BackendModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1038:1: ( ( () ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1039:1: ( () )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1039:1: ( () )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1040:1: ()
            {
             before(grammarAccess.getBackendModelAccess().getBackendModelAction_0()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1041:1: ()
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1043:1: 
            {
            }

             after(grammarAccess.getBackendModelAccess().getBackendModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackendModel__Group__0__Impl"


    // $ANTLR start "rule__BackendModel__Group__1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1053:1: rule__BackendModel__Group__1 : rule__BackendModel__Group__1__Impl rule__BackendModel__Group__2 ;
    public final void rule__BackendModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1057:1: ( rule__BackendModel__Group__1__Impl rule__BackendModel__Group__2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1058:2: rule__BackendModel__Group__1__Impl rule__BackendModel__Group__2
            {
            pushFollow(FOLLOW_rule__BackendModel__Group__1__Impl_in_rule__BackendModel__Group__12278);
            rule__BackendModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BackendModel__Group__2_in_rule__BackendModel__Group__12281);
            rule__BackendModel__Group__2();

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
    // $ANTLR end "rule__BackendModel__Group__1"


    // $ANTLR start "rule__BackendModel__Group__1__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1065:1: rule__BackendModel__Group__1__Impl : ( ( rule__BackendModel__UnorderedGroup_1 )? ) ;
    public final void rule__BackendModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1069:1: ( ( ( rule__BackendModel__UnorderedGroup_1 )? ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1070:1: ( ( rule__BackendModel__UnorderedGroup_1 )? )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1070:1: ( ( rule__BackendModel__UnorderedGroup_1 )? )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1071:1: ( rule__BackendModel__UnorderedGroup_1 )?
            {
             before(grammarAccess.getBackendModelAccess().getUnorderedGroup_1()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1072:1: ( rule__BackendModel__UnorderedGroup_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 >=34 && LA11_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 1) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1072:2: rule__BackendModel__UnorderedGroup_1
                    {
                    pushFollow(FOLLOW_rule__BackendModel__UnorderedGroup_1_in_rule__BackendModel__Group__1__Impl2308);
                    rule__BackendModel__UnorderedGroup_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBackendModelAccess().getUnorderedGroup_1()); 

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
    // $ANTLR end "rule__BackendModel__Group__1__Impl"


    // $ANTLR start "rule__BackendModel__Group__2"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1082:1: rule__BackendModel__Group__2 : rule__BackendModel__Group__2__Impl rule__BackendModel__Group__3 ;
    public final void rule__BackendModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1086:1: ( rule__BackendModel__Group__2__Impl rule__BackendModel__Group__3 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1087:2: rule__BackendModel__Group__2__Impl rule__BackendModel__Group__3
            {
            pushFollow(FOLLOW_rule__BackendModel__Group__2__Impl_in_rule__BackendModel__Group__22339);
            rule__BackendModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BackendModel__Group__3_in_rule__BackendModel__Group__22342);
            rule__BackendModel__Group__3();

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
    // $ANTLR end "rule__BackendModel__Group__2"


    // $ANTLR start "rule__BackendModel__Group__2__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1094:1: rule__BackendModel__Group__2__Impl : ( ( rule__BackendModel__AuthOptsAssignment_2 )* ) ;
    public final void rule__BackendModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1098:1: ( ( ( rule__BackendModel__AuthOptsAssignment_2 )* ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1099:1: ( ( rule__BackendModel__AuthOptsAssignment_2 )* )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1099:1: ( ( rule__BackendModel__AuthOptsAssignment_2 )* )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1100:1: ( rule__BackendModel__AuthOptsAssignment_2 )*
            {
             before(grammarAccess.getBackendModelAccess().getAuthOptsAssignment_2()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1101:1: ( rule__BackendModel__AuthOptsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1101:2: rule__BackendModel__AuthOptsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BackendModel__AuthOptsAssignment_2_in_rule__BackendModel__Group__2__Impl2369);
            	    rule__BackendModel__AuthOptsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBackendModelAccess().getAuthOptsAssignment_2()); 

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
    // $ANTLR end "rule__BackendModel__Group__2__Impl"


    // $ANTLR start "rule__BackendModel__Group__3"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1111:1: rule__BackendModel__Group__3 : rule__BackendModel__Group__3__Impl ;
    public final void rule__BackendModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1115:1: ( rule__BackendModel__Group__3__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1116:2: rule__BackendModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BackendModel__Group__3__Impl_in_rule__BackendModel__Group__32400);
            rule__BackendModel__Group__3__Impl();

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
    // $ANTLR end "rule__BackendModel__Group__3"


    // $ANTLR start "rule__BackendModel__Group__3__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1122:1: rule__BackendModel__Group__3__Impl : ( ( rule__BackendModel__DeclarationsAssignment_3 )* ) ;
    public final void rule__BackendModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1126:1: ( ( ( rule__BackendModel__DeclarationsAssignment_3 )* ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1127:1: ( ( rule__BackendModel__DeclarationsAssignment_3 )* )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1127:1: ( ( rule__BackendModel__DeclarationsAssignment_3 )* )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1128:1: ( rule__BackendModel__DeclarationsAssignment_3 )*
            {
             before(grammarAccess.getBackendModelAccess().getDeclarationsAssignment_3()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1129:1: ( rule__BackendModel__DeclarationsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40||LA13_0==43||LA13_0==45) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1129:2: rule__BackendModel__DeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__BackendModel__DeclarationsAssignment_3_in_rule__BackendModel__Group__3__Impl2427);
            	    rule__BackendModel__DeclarationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBackendModelAccess().getDeclarationsAssignment_3()); 

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
    // $ANTLR end "rule__BackendModel__Group__3__Impl"


    // $ANTLR start "rule__BackendModel__Group_1_0__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1147:1: rule__BackendModel__Group_1_0__0 : rule__BackendModel__Group_1_0__0__Impl rule__BackendModel__Group_1_0__1 ;
    public final void rule__BackendModel__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1151:1: ( rule__BackendModel__Group_1_0__0__Impl rule__BackendModel__Group_1_0__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1152:2: rule__BackendModel__Group_1_0__0__Impl rule__BackendModel__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__BackendModel__Group_1_0__0__Impl_in_rule__BackendModel__Group_1_0__02466);
            rule__BackendModel__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BackendModel__Group_1_0__1_in_rule__BackendModel__Group_1_0__02469);
            rule__BackendModel__Group_1_0__1();

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
    // $ANTLR end "rule__BackendModel__Group_1_0__0"


    // $ANTLR start "rule__BackendModel__Group_1_0__0__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1159:1: rule__BackendModel__Group_1_0__0__Impl : ( 'config' ) ;
    public final void rule__BackendModel__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1163:1: ( ( 'config' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1164:1: ( 'config' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1164:1: ( 'config' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1165:1: 'config'
            {
             before(grammarAccess.getBackendModelAccess().getConfigKeyword_1_0_0()); 
            match(input,30,FOLLOW_30_in_rule__BackendModel__Group_1_0__0__Impl2497); 
             after(grammarAccess.getBackendModelAccess().getConfigKeyword_1_0_0()); 

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
    // $ANTLR end "rule__BackendModel__Group_1_0__0__Impl"


    // $ANTLR start "rule__BackendModel__Group_1_0__1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1178:1: rule__BackendModel__Group_1_0__1 : rule__BackendModel__Group_1_0__1__Impl rule__BackendModel__Group_1_0__2 ;
    public final void rule__BackendModel__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1182:1: ( rule__BackendModel__Group_1_0__1__Impl rule__BackendModel__Group_1_0__2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1183:2: rule__BackendModel__Group_1_0__1__Impl rule__BackendModel__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__BackendModel__Group_1_0__1__Impl_in_rule__BackendModel__Group_1_0__12528);
            rule__BackendModel__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BackendModel__Group_1_0__2_in_rule__BackendModel__Group_1_0__12531);
            rule__BackendModel__Group_1_0__2();

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
    // $ANTLR end "rule__BackendModel__Group_1_0__1"


    // $ANTLR start "rule__BackendModel__Group_1_0__1__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1190:1: rule__BackendModel__Group_1_0__1__Impl : ( '{' ) ;
    public final void rule__BackendModel__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1194:1: ( ( '{' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1195:1: ( '{' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1195:1: ( '{' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1196:1: '{'
            {
             before(grammarAccess.getBackendModelAccess().getLeftCurlyBracketKeyword_1_0_1()); 
            match(input,31,FOLLOW_31_in_rule__BackendModel__Group_1_0__1__Impl2559); 
             after(grammarAccess.getBackendModelAccess().getLeftCurlyBracketKeyword_1_0_1()); 

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
    // $ANTLR end "rule__BackendModel__Group_1_0__1__Impl"


    // $ANTLR start "rule__BackendModel__Group_1_0__2"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1209:1: rule__BackendModel__Group_1_0__2 : rule__BackendModel__Group_1_0__2__Impl ;
    public final void rule__BackendModel__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1213:1: ( rule__BackendModel__Group_1_0__2__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1214:2: rule__BackendModel__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__BackendModel__Group_1_0__2__Impl_in_rule__BackendModel__Group_1_0__22590);
            rule__BackendModel__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__BackendModel__Group_1_0__2"


    // $ANTLR start "rule__BackendModel__Group_1_0__2__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1220:1: rule__BackendModel__Group_1_0__2__Impl : ( ( rule__BackendModel__Group_1_0_2__0 )? ) ;
    public final void rule__BackendModel__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1224:1: ( ( ( rule__BackendModel__Group_1_0_2__0 )? ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1225:1: ( ( rule__BackendModel__Group_1_0_2__0 )? )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1225:1: ( ( rule__BackendModel__Group_1_0_2__0 )? )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1226:1: ( rule__BackendModel__Group_1_0_2__0 )?
            {
             before(grammarAccess.getBackendModelAccess().getGroup_1_0_2()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1227:1: ( rule__BackendModel__Group_1_0_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1227:2: rule__BackendModel__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_rule__BackendModel__Group_1_0_2__0_in_rule__BackendModel__Group_1_0__2__Impl2617);
                    rule__BackendModel__Group_1_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBackendModelAccess().getGroup_1_0_2()); 

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
    // $ANTLR end "rule__BackendModel__Group_1_0__2__Impl"


    // $ANTLR start "rule__BackendModel__Group_1_0_2__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1243:1: rule__BackendModel__Group_1_0_2__0 : rule__BackendModel__Group_1_0_2__0__Impl rule__BackendModel__Group_1_0_2__1 ;
    public final void rule__BackendModel__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1247:1: ( rule__BackendModel__Group_1_0_2__0__Impl rule__BackendModel__Group_1_0_2__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1248:2: rule__BackendModel__Group_1_0_2__0__Impl rule__BackendModel__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__BackendModel__Group_1_0_2__0__Impl_in_rule__BackendModel__Group_1_0_2__02654);
            rule__BackendModel__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BackendModel__Group_1_0_2__1_in_rule__BackendModel__Group_1_0_2__02657);
            rule__BackendModel__Group_1_0_2__1();

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
    // $ANTLR end "rule__BackendModel__Group_1_0_2__0"


    // $ANTLR start "rule__BackendModel__Group_1_0_2__0__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1255:1: rule__BackendModel__Group_1_0_2__0__Impl : ( 'baseURL' ) ;
    public final void rule__BackendModel__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1259:1: ( ( 'baseURL' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1260:1: ( 'baseURL' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1260:1: ( 'baseURL' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1261:1: 'baseURL'
            {
             before(grammarAccess.getBackendModelAccess().getBaseURLKeyword_1_0_2_0()); 
            match(input,32,FOLLOW_32_in_rule__BackendModel__Group_1_0_2__0__Impl2685); 
             after(grammarAccess.getBackendModelAccess().getBaseURLKeyword_1_0_2_0()); 

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
    // $ANTLR end "rule__BackendModel__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__BackendModel__Group_1_0_2__1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1274:1: rule__BackendModel__Group_1_0_2__1 : rule__BackendModel__Group_1_0_2__1__Impl rule__BackendModel__Group_1_0_2__2 ;
    public final void rule__BackendModel__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1278:1: ( rule__BackendModel__Group_1_0_2__1__Impl rule__BackendModel__Group_1_0_2__2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1279:2: rule__BackendModel__Group_1_0_2__1__Impl rule__BackendModel__Group_1_0_2__2
            {
            pushFollow(FOLLOW_rule__BackendModel__Group_1_0_2__1__Impl_in_rule__BackendModel__Group_1_0_2__12716);
            rule__BackendModel__Group_1_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BackendModel__Group_1_0_2__2_in_rule__BackendModel__Group_1_0_2__12719);
            rule__BackendModel__Group_1_0_2__2();

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
    // $ANTLR end "rule__BackendModel__Group_1_0_2__1"


    // $ANTLR start "rule__BackendModel__Group_1_0_2__1__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1286:1: rule__BackendModel__Group_1_0_2__1__Impl : ( '=' ) ;
    public final void rule__BackendModel__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1290:1: ( ( '=' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1291:1: ( '=' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1291:1: ( '=' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1292:1: '='
            {
             before(grammarAccess.getBackendModelAccess().getEqualsSignKeyword_1_0_2_1()); 
            match(input,33,FOLLOW_33_in_rule__BackendModel__Group_1_0_2__1__Impl2747); 
             after(grammarAccess.getBackendModelAccess().getEqualsSignKeyword_1_0_2_1()); 

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
    // $ANTLR end "rule__BackendModel__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__BackendModel__Group_1_0_2__2"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1305:1: rule__BackendModel__Group_1_0_2__2 : rule__BackendModel__Group_1_0_2__2__Impl ;
    public final void rule__BackendModel__Group_1_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1309:1: ( rule__BackendModel__Group_1_0_2__2__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1310:2: rule__BackendModel__Group_1_0_2__2__Impl
            {
            pushFollow(FOLLOW_rule__BackendModel__Group_1_0_2__2__Impl_in_rule__BackendModel__Group_1_0_2__22778);
            rule__BackendModel__Group_1_0_2__2__Impl();

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
    // $ANTLR end "rule__BackendModel__Group_1_0_2__2"


    // $ANTLR start "rule__BackendModel__Group_1_0_2__2__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1316:1: rule__BackendModel__Group_1_0_2__2__Impl : ( ( rule__BackendModel__BaseUrlAssignment_1_0_2_2 ) ) ;
    public final void rule__BackendModel__Group_1_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1320:1: ( ( ( rule__BackendModel__BaseUrlAssignment_1_0_2_2 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1321:1: ( ( rule__BackendModel__BaseUrlAssignment_1_0_2_2 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1321:1: ( ( rule__BackendModel__BaseUrlAssignment_1_0_2_2 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1322:1: ( rule__BackendModel__BaseUrlAssignment_1_0_2_2 )
            {
             before(grammarAccess.getBackendModelAccess().getBaseUrlAssignment_1_0_2_2()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1323:1: ( rule__BackendModel__BaseUrlAssignment_1_0_2_2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1323:2: rule__BackendModel__BaseUrlAssignment_1_0_2_2
            {
            pushFollow(FOLLOW_rule__BackendModel__BaseUrlAssignment_1_0_2_2_in_rule__BackendModel__Group_1_0_2__2__Impl2805);
            rule__BackendModel__BaseUrlAssignment_1_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getBackendModelAccess().getBaseUrlAssignment_1_0_2_2()); 

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
    // $ANTLR end "rule__BackendModel__Group_1_0_2__2__Impl"


    // $ANTLR start "rule__BackendModel__Group_1_1__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1339:1: rule__BackendModel__Group_1_1__0 : rule__BackendModel__Group_1_1__0__Impl rule__BackendModel__Group_1_1__1 ;
    public final void rule__BackendModel__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1343:1: ( rule__BackendModel__Group_1_1__0__Impl rule__BackendModel__Group_1_1__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1344:2: rule__BackendModel__Group_1_1__0__Impl rule__BackendModel__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__BackendModel__Group_1_1__0__Impl_in_rule__BackendModel__Group_1_1__02841);
            rule__BackendModel__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BackendModel__Group_1_1__1_in_rule__BackendModel__Group_1_1__02844);
            rule__BackendModel__Group_1_1__1();

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
    // $ANTLR end "rule__BackendModel__Group_1_1__0"


    // $ANTLR start "rule__BackendModel__Group_1_1__0__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1351:1: rule__BackendModel__Group_1_1__0__Impl : ( ( rule__BackendModel__Group_1_1_0__0 )? ) ;
    public final void rule__BackendModel__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1355:1: ( ( ( rule__BackendModel__Group_1_1_0__0 )? ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1356:1: ( ( rule__BackendModel__Group_1_1_0__0 )? )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1356:1: ( ( rule__BackendModel__Group_1_1_0__0 )? )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1357:1: ( rule__BackendModel__Group_1_1_0__0 )?
            {
             before(grammarAccess.getBackendModelAccess().getGroup_1_1_0()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1358:1: ( rule__BackendModel__Group_1_1_0__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1358:2: rule__BackendModel__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_rule__BackendModel__Group_1_1_0__0_in_rule__BackendModel__Group_1_1__0__Impl2871);
                    rule__BackendModel__Group_1_1_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBackendModelAccess().getGroup_1_1_0()); 

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
    // $ANTLR end "rule__BackendModel__Group_1_1__0__Impl"


    // $ANTLR start "rule__BackendModel__Group_1_1__1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1368:1: rule__BackendModel__Group_1_1__1 : rule__BackendModel__Group_1_1__1__Impl ;
    public final void rule__BackendModel__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1372:1: ( rule__BackendModel__Group_1_1__1__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1373:2: rule__BackendModel__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BackendModel__Group_1_1__1__Impl_in_rule__BackendModel__Group_1_1__12902);
            rule__BackendModel__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__BackendModel__Group_1_1__1"


    // $ANTLR start "rule__BackendModel__Group_1_1__1__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1379:1: rule__BackendModel__Group_1_1__1__Impl : ( '}' ) ;
    public final void rule__BackendModel__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1383:1: ( ( '}' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1384:1: ( '}' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1384:1: ( '}' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1385:1: '}'
            {
             before(grammarAccess.getBackendModelAccess().getRightCurlyBracketKeyword_1_1_1()); 
            match(input,34,FOLLOW_34_in_rule__BackendModel__Group_1_1__1__Impl2930); 
             after(grammarAccess.getBackendModelAccess().getRightCurlyBracketKeyword_1_1_1()); 

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
    // $ANTLR end "rule__BackendModel__Group_1_1__1__Impl"


    // $ANTLR start "rule__BackendModel__Group_1_1_0__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1402:1: rule__BackendModel__Group_1_1_0__0 : rule__BackendModel__Group_1_1_0__0__Impl rule__BackendModel__Group_1_1_0__1 ;
    public final void rule__BackendModel__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1406:1: ( rule__BackendModel__Group_1_1_0__0__Impl rule__BackendModel__Group_1_1_0__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1407:2: rule__BackendModel__Group_1_1_0__0__Impl rule__BackendModel__Group_1_1_0__1
            {
            pushFollow(FOLLOW_rule__BackendModel__Group_1_1_0__0__Impl_in_rule__BackendModel__Group_1_1_0__02965);
            rule__BackendModel__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BackendModel__Group_1_1_0__1_in_rule__BackendModel__Group_1_1_0__02968);
            rule__BackendModel__Group_1_1_0__1();

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
    // $ANTLR end "rule__BackendModel__Group_1_1_0__0"


    // $ANTLR start "rule__BackendModel__Group_1_1_0__0__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1414:1: rule__BackendModel__Group_1_1_0__0__Impl : ( 'flavor' ) ;
    public final void rule__BackendModel__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1418:1: ( ( 'flavor' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1419:1: ( 'flavor' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1419:1: ( 'flavor' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1420:1: 'flavor'
            {
             before(grammarAccess.getBackendModelAccess().getFlavorKeyword_1_1_0_0()); 
            match(input,35,FOLLOW_35_in_rule__BackendModel__Group_1_1_0__0__Impl2996); 
             after(grammarAccess.getBackendModelAccess().getFlavorKeyword_1_1_0_0()); 

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
    // $ANTLR end "rule__BackendModel__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__BackendModel__Group_1_1_0__1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1433:1: rule__BackendModel__Group_1_1_0__1 : rule__BackendModel__Group_1_1_0__1__Impl rule__BackendModel__Group_1_1_0__2 ;
    public final void rule__BackendModel__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1437:1: ( rule__BackendModel__Group_1_1_0__1__Impl rule__BackendModel__Group_1_1_0__2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1438:2: rule__BackendModel__Group_1_1_0__1__Impl rule__BackendModel__Group_1_1_0__2
            {
            pushFollow(FOLLOW_rule__BackendModel__Group_1_1_0__1__Impl_in_rule__BackendModel__Group_1_1_0__13027);
            rule__BackendModel__Group_1_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BackendModel__Group_1_1_0__2_in_rule__BackendModel__Group_1_1_0__13030);
            rule__BackendModel__Group_1_1_0__2();

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
    // $ANTLR end "rule__BackendModel__Group_1_1_0__1"


    // $ANTLR start "rule__BackendModel__Group_1_1_0__1__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1445:1: rule__BackendModel__Group_1_1_0__1__Impl : ( '=' ) ;
    public final void rule__BackendModel__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1449:1: ( ( '=' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1450:1: ( '=' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1450:1: ( '=' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1451:1: '='
            {
             before(grammarAccess.getBackendModelAccess().getEqualsSignKeyword_1_1_0_1()); 
            match(input,33,FOLLOW_33_in_rule__BackendModel__Group_1_1_0__1__Impl3058); 
             after(grammarAccess.getBackendModelAccess().getEqualsSignKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__BackendModel__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__BackendModel__Group_1_1_0__2"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1464:1: rule__BackendModel__Group_1_1_0__2 : rule__BackendModel__Group_1_1_0__2__Impl ;
    public final void rule__BackendModel__Group_1_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1468:1: ( rule__BackendModel__Group_1_1_0__2__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1469:2: rule__BackendModel__Group_1_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__BackendModel__Group_1_1_0__2__Impl_in_rule__BackendModel__Group_1_1_0__23089);
            rule__BackendModel__Group_1_1_0__2__Impl();

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
    // $ANTLR end "rule__BackendModel__Group_1_1_0__2"


    // $ANTLR start "rule__BackendModel__Group_1_1_0__2__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1475:1: rule__BackendModel__Group_1_1_0__2__Impl : ( ( rule__BackendModel__FlavorAssignment_1_1_0_2 ) ) ;
    public final void rule__BackendModel__Group_1_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1479:1: ( ( ( rule__BackendModel__FlavorAssignment_1_1_0_2 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1480:1: ( ( rule__BackendModel__FlavorAssignment_1_1_0_2 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1480:1: ( ( rule__BackendModel__FlavorAssignment_1_1_0_2 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1481:1: ( rule__BackendModel__FlavorAssignment_1_1_0_2 )
            {
             before(grammarAccess.getBackendModelAccess().getFlavorAssignment_1_1_0_2()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1482:1: ( rule__BackendModel__FlavorAssignment_1_1_0_2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1482:2: rule__BackendModel__FlavorAssignment_1_1_0_2
            {
            pushFollow(FOLLOW_rule__BackendModel__FlavorAssignment_1_1_0_2_in_rule__BackendModel__Group_1_1_0__2__Impl3116);
            rule__BackendModel__FlavorAssignment_1_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getBackendModelAccess().getFlavorAssignment_1_1_0_2()); 

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
    // $ANTLR end "rule__BackendModel__Group_1_1_0__2__Impl"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1498:1: rule__AuthenticationDeclaration__Group__0 : rule__AuthenticationDeclaration__Group__0__Impl rule__AuthenticationDeclaration__Group__1 ;
    public final void rule__AuthenticationDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1502:1: ( rule__AuthenticationDeclaration__Group__0__Impl rule__AuthenticationDeclaration__Group__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1503:2: rule__AuthenticationDeclaration__Group__0__Impl rule__AuthenticationDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__0__Impl_in_rule__AuthenticationDeclaration__Group__03152);
            rule__AuthenticationDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__1_in_rule__AuthenticationDeclaration__Group__03155);
            rule__AuthenticationDeclaration__Group__1();

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__0"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__0__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1510:1: rule__AuthenticationDeclaration__Group__0__Impl : ( 'authentication-option' ) ;
    public final void rule__AuthenticationDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1514:1: ( ( 'authentication-option' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1515:1: ( 'authentication-option' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1515:1: ( 'authentication-option' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1516:1: 'authentication-option'
            {
             before(grammarAccess.getAuthenticationDeclarationAccess().getAuthenticationOptionKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__AuthenticationDeclaration__Group__0__Impl3183); 
             after(grammarAccess.getAuthenticationDeclarationAccess().getAuthenticationOptionKeyword_0()); 

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__0__Impl"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1529:1: rule__AuthenticationDeclaration__Group__1 : rule__AuthenticationDeclaration__Group__1__Impl rule__AuthenticationDeclaration__Group__2 ;
    public final void rule__AuthenticationDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1533:1: ( rule__AuthenticationDeclaration__Group__1__Impl rule__AuthenticationDeclaration__Group__2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1534:2: rule__AuthenticationDeclaration__Group__1__Impl rule__AuthenticationDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__1__Impl_in_rule__AuthenticationDeclaration__Group__13214);
            rule__AuthenticationDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__2_in_rule__AuthenticationDeclaration__Group__13217);
            rule__AuthenticationDeclaration__Group__2();

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__1"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__1__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1541:1: rule__AuthenticationDeclaration__Group__1__Impl : ( ( rule__AuthenticationDeclaration__NameAssignment_1 ) ) ;
    public final void rule__AuthenticationDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1545:1: ( ( ( rule__AuthenticationDeclaration__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1546:1: ( ( rule__AuthenticationDeclaration__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1546:1: ( ( rule__AuthenticationDeclaration__NameAssignment_1 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1547:1: ( rule__AuthenticationDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getAuthenticationDeclarationAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1548:1: ( rule__AuthenticationDeclaration__NameAssignment_1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1548:2: rule__AuthenticationDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AuthenticationDeclaration__NameAssignment_1_in_rule__AuthenticationDeclaration__Group__1__Impl3244);
            rule__AuthenticationDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__1__Impl"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__2"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1558:1: rule__AuthenticationDeclaration__Group__2 : rule__AuthenticationDeclaration__Group__2__Impl rule__AuthenticationDeclaration__Group__3 ;
    public final void rule__AuthenticationDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1562:1: ( rule__AuthenticationDeclaration__Group__2__Impl rule__AuthenticationDeclaration__Group__3 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1563:2: rule__AuthenticationDeclaration__Group__2__Impl rule__AuthenticationDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__2__Impl_in_rule__AuthenticationDeclaration__Group__23274);
            rule__AuthenticationDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__3_in_rule__AuthenticationDeclaration__Group__23277);
            rule__AuthenticationDeclaration__Group__3();

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__2"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__2__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1570:1: rule__AuthenticationDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__AuthenticationDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1574:1: ( ( '{' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1575:1: ( '{' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1575:1: ( '{' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1576:1: '{'
            {
             before(grammarAccess.getAuthenticationDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__AuthenticationDeclaration__Group__2__Impl3305); 
             after(grammarAccess.getAuthenticationDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__2__Impl"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__3"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1589:1: rule__AuthenticationDeclaration__Group__3 : rule__AuthenticationDeclaration__Group__3__Impl rule__AuthenticationDeclaration__Group__4 ;
    public final void rule__AuthenticationDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1593:1: ( rule__AuthenticationDeclaration__Group__3__Impl rule__AuthenticationDeclaration__Group__4 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1594:2: rule__AuthenticationDeclaration__Group__3__Impl rule__AuthenticationDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__3__Impl_in_rule__AuthenticationDeclaration__Group__33336);
            rule__AuthenticationDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__4_in_rule__AuthenticationDeclaration__Group__33339);
            rule__AuthenticationDeclaration__Group__4();

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__3"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__3__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1601:1: rule__AuthenticationDeclaration__Group__3__Impl : ( 'principal' ) ;
    public final void rule__AuthenticationDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1605:1: ( ( 'principal' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1606:1: ( 'principal' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1606:1: ( 'principal' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1607:1: 'principal'
            {
             before(grammarAccess.getAuthenticationDeclarationAccess().getPrincipalKeyword_3()); 
            match(input,37,FOLLOW_37_in_rule__AuthenticationDeclaration__Group__3__Impl3367); 
             after(grammarAccess.getAuthenticationDeclarationAccess().getPrincipalKeyword_3()); 

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__3__Impl"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__4"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1620:1: rule__AuthenticationDeclaration__Group__4 : rule__AuthenticationDeclaration__Group__4__Impl rule__AuthenticationDeclaration__Group__5 ;
    public final void rule__AuthenticationDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1624:1: ( rule__AuthenticationDeclaration__Group__4__Impl rule__AuthenticationDeclaration__Group__5 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1625:2: rule__AuthenticationDeclaration__Group__4__Impl rule__AuthenticationDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__4__Impl_in_rule__AuthenticationDeclaration__Group__43398);
            rule__AuthenticationDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__5_in_rule__AuthenticationDeclaration__Group__43401);
            rule__AuthenticationDeclaration__Group__5();

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__4"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__4__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1632:1: rule__AuthenticationDeclaration__Group__4__Impl : ( ( rule__AuthenticationDeclaration__PrincipalAssignment_4 ) ) ;
    public final void rule__AuthenticationDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1636:1: ( ( ( rule__AuthenticationDeclaration__PrincipalAssignment_4 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1637:1: ( ( rule__AuthenticationDeclaration__PrincipalAssignment_4 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1637:1: ( ( rule__AuthenticationDeclaration__PrincipalAssignment_4 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1638:1: ( rule__AuthenticationDeclaration__PrincipalAssignment_4 )
            {
             before(grammarAccess.getAuthenticationDeclarationAccess().getPrincipalAssignment_4()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1639:1: ( rule__AuthenticationDeclaration__PrincipalAssignment_4 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1639:2: rule__AuthenticationDeclaration__PrincipalAssignment_4
            {
            pushFollow(FOLLOW_rule__AuthenticationDeclaration__PrincipalAssignment_4_in_rule__AuthenticationDeclaration__Group__4__Impl3428);
            rule__AuthenticationDeclaration__PrincipalAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationDeclarationAccess().getPrincipalAssignment_4()); 

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__4__Impl"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__5"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1649:1: rule__AuthenticationDeclaration__Group__5 : rule__AuthenticationDeclaration__Group__5__Impl rule__AuthenticationDeclaration__Group__6 ;
    public final void rule__AuthenticationDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1653:1: ( rule__AuthenticationDeclaration__Group__5__Impl rule__AuthenticationDeclaration__Group__6 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1654:2: rule__AuthenticationDeclaration__Group__5__Impl rule__AuthenticationDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__5__Impl_in_rule__AuthenticationDeclaration__Group__53458);
            rule__AuthenticationDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__6_in_rule__AuthenticationDeclaration__Group__53461);
            rule__AuthenticationDeclaration__Group__6();

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__5"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__5__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1661:1: rule__AuthenticationDeclaration__Group__5__Impl : ( 'credentials' ) ;
    public final void rule__AuthenticationDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1665:1: ( ( 'credentials' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1666:1: ( 'credentials' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1666:1: ( 'credentials' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1667:1: 'credentials'
            {
             before(grammarAccess.getAuthenticationDeclarationAccess().getCredentialsKeyword_5()); 
            match(input,38,FOLLOW_38_in_rule__AuthenticationDeclaration__Group__5__Impl3489); 
             after(grammarAccess.getAuthenticationDeclarationAccess().getCredentialsKeyword_5()); 

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__5__Impl"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__6"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1680:1: rule__AuthenticationDeclaration__Group__6 : rule__AuthenticationDeclaration__Group__6__Impl rule__AuthenticationDeclaration__Group__7 ;
    public final void rule__AuthenticationDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1684:1: ( rule__AuthenticationDeclaration__Group__6__Impl rule__AuthenticationDeclaration__Group__7 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1685:2: rule__AuthenticationDeclaration__Group__6__Impl rule__AuthenticationDeclaration__Group__7
            {
            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__6__Impl_in_rule__AuthenticationDeclaration__Group__63520);
            rule__AuthenticationDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__7_in_rule__AuthenticationDeclaration__Group__63523);
            rule__AuthenticationDeclaration__Group__7();

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__6"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__6__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1692:1: rule__AuthenticationDeclaration__Group__6__Impl : ( ( rule__AuthenticationDeclaration__CredentialAssignment_6 ) ) ;
    public final void rule__AuthenticationDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1696:1: ( ( ( rule__AuthenticationDeclaration__CredentialAssignment_6 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1697:1: ( ( rule__AuthenticationDeclaration__CredentialAssignment_6 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1697:1: ( ( rule__AuthenticationDeclaration__CredentialAssignment_6 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1698:1: ( rule__AuthenticationDeclaration__CredentialAssignment_6 )
            {
             before(grammarAccess.getAuthenticationDeclarationAccess().getCredentialAssignment_6()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1699:1: ( rule__AuthenticationDeclaration__CredentialAssignment_6 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1699:2: rule__AuthenticationDeclaration__CredentialAssignment_6
            {
            pushFollow(FOLLOW_rule__AuthenticationDeclaration__CredentialAssignment_6_in_rule__AuthenticationDeclaration__Group__6__Impl3550);
            rule__AuthenticationDeclaration__CredentialAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationDeclarationAccess().getCredentialAssignment_6()); 

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__6__Impl"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__7"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1709:1: rule__AuthenticationDeclaration__Group__7 : rule__AuthenticationDeclaration__Group__7__Impl ;
    public final void rule__AuthenticationDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1713:1: ( rule__AuthenticationDeclaration__Group__7__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1714:2: rule__AuthenticationDeclaration__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__AuthenticationDeclaration__Group__7__Impl_in_rule__AuthenticationDeclaration__Group__73580);
            rule__AuthenticationDeclaration__Group__7__Impl();

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__7"


    // $ANTLR start "rule__AuthenticationDeclaration__Group__7__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1720:1: rule__AuthenticationDeclaration__Group__7__Impl : ( '}' ) ;
    public final void rule__AuthenticationDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1724:1: ( ( '}' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1725:1: ( '}' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1725:1: ( '}' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1726:1: '}'
            {
             before(grammarAccess.getAuthenticationDeclarationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,34,FOLLOW_34_in_rule__AuthenticationDeclaration__Group__7__Impl3608); 
             after(grammarAccess.getAuthenticationDeclarationAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__AuthenticationDeclaration__Group__7__Impl"


    // $ANTLR start "rule__AuthenticationParameter__Group__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1755:1: rule__AuthenticationParameter__Group__0 : rule__AuthenticationParameter__Group__0__Impl rule__AuthenticationParameter__Group__1 ;
    public final void rule__AuthenticationParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1759:1: ( rule__AuthenticationParameter__Group__0__Impl rule__AuthenticationParameter__Group__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1760:2: rule__AuthenticationParameter__Group__0__Impl rule__AuthenticationParameter__Group__1
            {
            pushFollow(FOLLOW_rule__AuthenticationParameter__Group__0__Impl_in_rule__AuthenticationParameter__Group__03655);
            rule__AuthenticationParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthenticationParameter__Group__1_in_rule__AuthenticationParameter__Group__03658);
            rule__AuthenticationParameter__Group__1();

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
    // $ANTLR end "rule__AuthenticationParameter__Group__0"


    // $ANTLR start "rule__AuthenticationParameter__Group__0__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1767:1: rule__AuthenticationParameter__Group__0__Impl : ( ( rule__AuthenticationParameter__NameAssignment_0 ) ) ;
    public final void rule__AuthenticationParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1771:1: ( ( ( rule__AuthenticationParameter__NameAssignment_0 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1772:1: ( ( rule__AuthenticationParameter__NameAssignment_0 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1772:1: ( ( rule__AuthenticationParameter__NameAssignment_0 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1773:1: ( rule__AuthenticationParameter__NameAssignment_0 )
            {
             before(grammarAccess.getAuthenticationParameterAccess().getNameAssignment_0()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1774:1: ( rule__AuthenticationParameter__NameAssignment_0 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1774:2: rule__AuthenticationParameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AuthenticationParameter__NameAssignment_0_in_rule__AuthenticationParameter__Group__0__Impl3685);
            rule__AuthenticationParameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationParameterAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__AuthenticationParameter__Group__0__Impl"


    // $ANTLR start "rule__AuthenticationParameter__Group__1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1784:1: rule__AuthenticationParameter__Group__1 : rule__AuthenticationParameter__Group__1__Impl rule__AuthenticationParameter__Group__2 ;
    public final void rule__AuthenticationParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1788:1: ( rule__AuthenticationParameter__Group__1__Impl rule__AuthenticationParameter__Group__2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1789:2: rule__AuthenticationParameter__Group__1__Impl rule__AuthenticationParameter__Group__2
            {
            pushFollow(FOLLOW_rule__AuthenticationParameter__Group__1__Impl_in_rule__AuthenticationParameter__Group__13715);
            rule__AuthenticationParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthenticationParameter__Group__2_in_rule__AuthenticationParameter__Group__13718);
            rule__AuthenticationParameter__Group__2();

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
    // $ANTLR end "rule__AuthenticationParameter__Group__1"


    // $ANTLR start "rule__AuthenticationParameter__Group__1__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1796:1: rule__AuthenticationParameter__Group__1__Impl : ( ':' ) ;
    public final void rule__AuthenticationParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1800:1: ( ( ':' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1801:1: ( ':' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1801:1: ( ':' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1802:1: ':'
            {
             before(grammarAccess.getAuthenticationParameterAccess().getColonKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__AuthenticationParameter__Group__1__Impl3746); 
             after(grammarAccess.getAuthenticationParameterAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__AuthenticationParameter__Group__1__Impl"


    // $ANTLR start "rule__AuthenticationParameter__Group__2"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1815:1: rule__AuthenticationParameter__Group__2 : rule__AuthenticationParameter__Group__2__Impl ;
    public final void rule__AuthenticationParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1819:1: ( rule__AuthenticationParameter__Group__2__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1820:2: rule__AuthenticationParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AuthenticationParameter__Group__2__Impl_in_rule__AuthenticationParameter__Group__23777);
            rule__AuthenticationParameter__Group__2__Impl();

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
    // $ANTLR end "rule__AuthenticationParameter__Group__2"


    // $ANTLR start "rule__AuthenticationParameter__Group__2__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1826:1: rule__AuthenticationParameter__Group__2__Impl : ( ( rule__AuthenticationParameter__TypeAssignment_2 ) ) ;
    public final void rule__AuthenticationParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1830:1: ( ( ( rule__AuthenticationParameter__TypeAssignment_2 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1831:1: ( ( rule__AuthenticationParameter__TypeAssignment_2 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1831:1: ( ( rule__AuthenticationParameter__TypeAssignment_2 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1832:1: ( rule__AuthenticationParameter__TypeAssignment_2 )
            {
             before(grammarAccess.getAuthenticationParameterAccess().getTypeAssignment_2()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1833:1: ( rule__AuthenticationParameter__TypeAssignment_2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1833:2: rule__AuthenticationParameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__AuthenticationParameter__TypeAssignment_2_in_rule__AuthenticationParameter__Group__2__Impl3804);
            rule__AuthenticationParameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticationParameterAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__AuthenticationParameter__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1849:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1853:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1854:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__03840);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__03843);
            rule__Interface__Group__1();

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
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1861:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1865:1: ( ( 'interface' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1866:1: ( 'interface' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1866:1: ( 'interface' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1867:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Interface__Group__0__Impl3871); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 

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
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1880:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1884:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1885:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__13902);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__13905);
            rule__Interface__Group__2();

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
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1892:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1896:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1897:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1897:1: ( ( rule__Interface__NameAssignment_1 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1898:1: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1899:1: ( rule__Interface__NameAssignment_1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1899:2: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl3932);
            rule__Interface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1909:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1913:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1914:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__23962);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__23965);
            rule__Interface__Group__3();

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
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1921:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__MethodAssignment_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1925:1: ( ( ( rule__Interface__MethodAssignment_2 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1926:1: ( ( rule__Interface__MethodAssignment_2 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1926:1: ( ( rule__Interface__MethodAssignment_2 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1927:1: ( rule__Interface__MethodAssignment_2 )
            {
             before(grammarAccess.getInterfaceAccess().getMethodAssignment_2()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1928:1: ( rule__Interface__MethodAssignment_2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1928:2: rule__Interface__MethodAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface__MethodAssignment_2_in_rule__Interface__Group__2__Impl3992);
            rule__Interface__MethodAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getMethodAssignment_2()); 

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
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1938:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1942:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1943:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__34022);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__34025);
            rule__Interface__Group__4();

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
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1950:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__InputTypeAssignment_3 )? ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1954:1: ( ( ( rule__Interface__InputTypeAssignment_3 )? ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1955:1: ( ( rule__Interface__InputTypeAssignment_3 )? )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1955:1: ( ( rule__Interface__InputTypeAssignment_3 )? )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1956:1: ( rule__Interface__InputTypeAssignment_3 )?
            {
             before(grammarAccess.getInterfaceAccess().getInputTypeAssignment_3()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1957:1: ( rule__Interface__InputTypeAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1957:2: rule__Interface__InputTypeAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Interface__InputTypeAssignment_3_in_rule__Interface__Group__3__Impl4052);
                    rule__Interface__InputTypeAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getInputTypeAssignment_3()); 

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
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1967:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1971:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1972:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__44083);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__44086);
            rule__Interface__Group__5();

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
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1979:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__Group_4__0 )? ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1983:1: ( ( ( rule__Interface__Group_4__0 )? ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1984:1: ( ( rule__Interface__Group_4__0 )? )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1984:1: ( ( rule__Interface__Group_4__0 )? )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1985:1: ( rule__Interface__Group_4__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_4()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1986:1: ( rule__Interface__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1986:2: rule__Interface__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_4__0_in_rule__Interface__Group__4__Impl4113);
                    rule__Interface__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__5"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:1996:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2000:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2001:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__54144);
            rule__Interface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__6_in_rule__Interface__Group__54147);
            rule__Interface__Group__6();

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
    // $ANTLR end "rule__Interface__Group__5"


    // $ANTLR start "rule__Interface__Group__5__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2008:1: rule__Interface__Group__5__Impl : ( ( rule__Interface__NotAuthenticatedAssignment_5 )? ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2012:1: ( ( ( rule__Interface__NotAuthenticatedAssignment_5 )? ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2013:1: ( ( rule__Interface__NotAuthenticatedAssignment_5 )? )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2013:1: ( ( rule__Interface__NotAuthenticatedAssignment_5 )? )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2014:1: ( rule__Interface__NotAuthenticatedAssignment_5 )?
            {
             before(grammarAccess.getInterfaceAccess().getNotAuthenticatedAssignment_5()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2015:1: ( rule__Interface__NotAuthenticatedAssignment_5 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==53) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2015:2: rule__Interface__NotAuthenticatedAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Interface__NotAuthenticatedAssignment_5_in_rule__Interface__Group__5__Impl4174);
                    rule__Interface__NotAuthenticatedAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getNotAuthenticatedAssignment_5()); 

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
    // $ANTLR end "rule__Interface__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group__6"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2025:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl rule__Interface__Group__7 ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2029:1: ( rule__Interface__Group__6__Impl rule__Interface__Group__7 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2030:2: rule__Interface__Group__6__Impl rule__Interface__Group__7
            {
            pushFollow(FOLLOW_rule__Interface__Group__6__Impl_in_rule__Interface__Group__64205);
            rule__Interface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__7_in_rule__Interface__Group__64208);
            rule__Interface__Group__7();

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
    // $ANTLR end "rule__Interface__Group__6"


    // $ANTLR start "rule__Interface__Group__6__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2037:1: rule__Interface__Group__6__Impl : ( ( rule__Interface__Group_6__0 )? ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2041:1: ( ( ( rule__Interface__Group_6__0 )? ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2042:1: ( ( rule__Interface__Group_6__0 )? )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2042:1: ( ( rule__Interface__Group_6__0 )? )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2043:1: ( rule__Interface__Group_6__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_6()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2044:1: ( rule__Interface__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2044:2: rule__Interface__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Interface__Group_6__0_in_rule__Interface__Group__6__Impl4235);
                    rule__Interface__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Interface__Group__6__Impl"


    // $ANTLR start "rule__Interface__Group__7"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2054:1: rule__Interface__Group__7 : rule__Interface__Group__7__Impl ;
    public final void rule__Interface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2058:1: ( rule__Interface__Group__7__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2059:2: rule__Interface__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__7__Impl_in_rule__Interface__Group__74266);
            rule__Interface__Group__7__Impl();

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
    // $ANTLR end "rule__Interface__Group__7"


    // $ANTLR start "rule__Interface__Group__7__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2065:1: rule__Interface__Group__7__Impl : ( ( rule__Interface__DocumentationAssignment_7 )? ) ;
    public final void rule__Interface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2069:1: ( ( ( rule__Interface__DocumentationAssignment_7 )? ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2070:1: ( ( rule__Interface__DocumentationAssignment_7 )? )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2070:1: ( ( rule__Interface__DocumentationAssignment_7 )? )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2071:1: ( rule__Interface__DocumentationAssignment_7 )?
            {
             before(grammarAccess.getInterfaceAccess().getDocumentationAssignment_7()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2072:1: ( rule__Interface__DocumentationAssignment_7 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2072:2: rule__Interface__DocumentationAssignment_7
                    {
                    pushFollow(FOLLOW_rule__Interface__DocumentationAssignment_7_in_rule__Interface__Group__7__Impl4293);
                    rule__Interface__DocumentationAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getDocumentationAssignment_7()); 

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
    // $ANTLR end "rule__Interface__Group__7__Impl"


    // $ANTLR start "rule__Interface__Group_4__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2098:1: rule__Interface__Group_4__0 : rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 ;
    public final void rule__Interface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2102:1: ( rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2103:2: rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_4__0__Impl_in_rule__Interface__Group_4__04340);
            rule__Interface__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_4__1_in_rule__Interface__Group_4__04343);
            rule__Interface__Group_4__1();

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
    // $ANTLR end "rule__Interface__Group_4__0"


    // $ANTLR start "rule__Interface__Group_4__0__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2110:1: rule__Interface__Group_4__0__Impl : ( '->' ) ;
    public final void rule__Interface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2114:1: ( ( '->' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2115:1: ( '->' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2115:1: ( '->' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2116:1: '->'
            {
             before(grammarAccess.getInterfaceAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
            match(input,41,FOLLOW_41_in_rule__Interface__Group_4__0__Impl4371); 
             after(grammarAccess.getInterfaceAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 

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
    // $ANTLR end "rule__Interface__Group_4__0__Impl"


    // $ANTLR start "rule__Interface__Group_4__1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2129:1: rule__Interface__Group_4__1 : rule__Interface__Group_4__1__Impl ;
    public final void rule__Interface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2133:1: ( rule__Interface__Group_4__1__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2134:2: rule__Interface__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_4__1__Impl_in_rule__Interface__Group_4__14402);
            rule__Interface__Group_4__1__Impl();

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
    // $ANTLR end "rule__Interface__Group_4__1"


    // $ANTLR start "rule__Interface__Group_4__1__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2140:1: rule__Interface__Group_4__1__Impl : ( ( rule__Interface__OutputTypeAssignment_4_1 ) ) ;
    public final void rule__Interface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2144:1: ( ( ( rule__Interface__OutputTypeAssignment_4_1 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2145:1: ( ( rule__Interface__OutputTypeAssignment_4_1 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2145:1: ( ( rule__Interface__OutputTypeAssignment_4_1 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2146:1: ( rule__Interface__OutputTypeAssignment_4_1 )
            {
             before(grammarAccess.getInterfaceAccess().getOutputTypeAssignment_4_1()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2147:1: ( rule__Interface__OutputTypeAssignment_4_1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2147:2: rule__Interface__OutputTypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Interface__OutputTypeAssignment_4_1_in_rule__Interface__Group_4__1__Impl4429);
            rule__Interface__OutputTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getOutputTypeAssignment_4_1()); 

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
    // $ANTLR end "rule__Interface__Group_4__1__Impl"


    // $ANTLR start "rule__Interface__Group_6__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2161:1: rule__Interface__Group_6__0 : rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1 ;
    public final void rule__Interface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2165:1: ( rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2166:2: rule__Interface__Group_6__0__Impl rule__Interface__Group_6__1
            {
            pushFollow(FOLLOW_rule__Interface__Group_6__0__Impl_in_rule__Interface__Group_6__04463);
            rule__Interface__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group_6__1_in_rule__Interface__Group_6__04466);
            rule__Interface__Group_6__1();

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
    // $ANTLR end "rule__Interface__Group_6__0"


    // $ANTLR start "rule__Interface__Group_6__0__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2173:1: rule__Interface__Group_6__0__Impl : ( 'implemented-by' ) ;
    public final void rule__Interface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2177:1: ( ( 'implemented-by' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2178:1: ( 'implemented-by' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2178:1: ( 'implemented-by' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2179:1: 'implemented-by'
            {
             before(grammarAccess.getInterfaceAccess().getImplementedByKeyword_6_0()); 
            match(input,42,FOLLOW_42_in_rule__Interface__Group_6__0__Impl4494); 
             after(grammarAccess.getInterfaceAccess().getImplementedByKeyword_6_0()); 

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
    // $ANTLR end "rule__Interface__Group_6__0__Impl"


    // $ANTLR start "rule__Interface__Group_6__1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2192:1: rule__Interface__Group_6__1 : rule__Interface__Group_6__1__Impl ;
    public final void rule__Interface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2196:1: ( rule__Interface__Group_6__1__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2197:2: rule__Interface__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group_6__1__Impl_in_rule__Interface__Group_6__14525);
            rule__Interface__Group_6__1__Impl();

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
    // $ANTLR end "rule__Interface__Group_6__1"


    // $ANTLR start "rule__Interface__Group_6__1__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2203:1: rule__Interface__Group_6__1__Impl : ( ( rule__Interface__LegacyServletAssignment_6_1 ) ) ;
    public final void rule__Interface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2207:1: ( ( ( rule__Interface__LegacyServletAssignment_6_1 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2208:1: ( ( rule__Interface__LegacyServletAssignment_6_1 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2208:1: ( ( rule__Interface__LegacyServletAssignment_6_1 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2209:1: ( rule__Interface__LegacyServletAssignment_6_1 )
            {
             before(grammarAccess.getInterfaceAccess().getLegacyServletAssignment_6_1()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2210:1: ( rule__Interface__LegacyServletAssignment_6_1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2210:2: rule__Interface__LegacyServletAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Interface__LegacyServletAssignment_6_1_in_rule__Interface__Group_6__1__Impl4552);
            rule__Interface__LegacyServletAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getLegacyServletAssignment_6_1()); 

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
    // $ANTLR end "rule__Interface__Group_6__1__Impl"


    // $ANTLR start "rule__LegacyServlet__Group__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2224:1: rule__LegacyServlet__Group__0 : rule__LegacyServlet__Group__0__Impl rule__LegacyServlet__Group__1 ;
    public final void rule__LegacyServlet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2228:1: ( rule__LegacyServlet__Group__0__Impl rule__LegacyServlet__Group__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2229:2: rule__LegacyServlet__Group__0__Impl rule__LegacyServlet__Group__1
            {
            pushFollow(FOLLOW_rule__LegacyServlet__Group__0__Impl_in_rule__LegacyServlet__Group__04586);
            rule__LegacyServlet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LegacyServlet__Group__1_in_rule__LegacyServlet__Group__04589);
            rule__LegacyServlet__Group__1();

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
    // $ANTLR end "rule__LegacyServlet__Group__0"


    // $ANTLR start "rule__LegacyServlet__Group__0__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2236:1: rule__LegacyServlet__Group__0__Impl : ( 'legacy-servlet' ) ;
    public final void rule__LegacyServlet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2240:1: ( ( 'legacy-servlet' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2241:1: ( 'legacy-servlet' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2241:1: ( 'legacy-servlet' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2242:1: 'legacy-servlet'
            {
             before(grammarAccess.getLegacyServletAccess().getLegacyServletKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__LegacyServlet__Group__0__Impl4617); 
             after(grammarAccess.getLegacyServletAccess().getLegacyServletKeyword_0()); 

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
    // $ANTLR end "rule__LegacyServlet__Group__0__Impl"


    // $ANTLR start "rule__LegacyServlet__Group__1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2255:1: rule__LegacyServlet__Group__1 : rule__LegacyServlet__Group__1__Impl rule__LegacyServlet__Group__2 ;
    public final void rule__LegacyServlet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2259:1: ( rule__LegacyServlet__Group__1__Impl rule__LegacyServlet__Group__2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2260:2: rule__LegacyServlet__Group__1__Impl rule__LegacyServlet__Group__2
            {
            pushFollow(FOLLOW_rule__LegacyServlet__Group__1__Impl_in_rule__LegacyServlet__Group__14648);
            rule__LegacyServlet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LegacyServlet__Group__2_in_rule__LegacyServlet__Group__14651);
            rule__LegacyServlet__Group__2();

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
    // $ANTLR end "rule__LegacyServlet__Group__1"


    // $ANTLR start "rule__LegacyServlet__Group__1__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2267:1: rule__LegacyServlet__Group__1__Impl : ( ( rule__LegacyServlet__NameAssignment_1 ) ) ;
    public final void rule__LegacyServlet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2271:1: ( ( ( rule__LegacyServlet__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2272:1: ( ( rule__LegacyServlet__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2272:1: ( ( rule__LegacyServlet__NameAssignment_1 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2273:1: ( rule__LegacyServlet__NameAssignment_1 )
            {
             before(grammarAccess.getLegacyServletAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2274:1: ( rule__LegacyServlet__NameAssignment_1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2274:2: rule__LegacyServlet__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__LegacyServlet__NameAssignment_1_in_rule__LegacyServlet__Group__1__Impl4678);
            rule__LegacyServlet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLegacyServletAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__LegacyServlet__Group__1__Impl"


    // $ANTLR start "rule__LegacyServlet__Group__2"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2284:1: rule__LegacyServlet__Group__2 : rule__LegacyServlet__Group__2__Impl rule__LegacyServlet__Group__3 ;
    public final void rule__LegacyServlet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2288:1: ( rule__LegacyServlet__Group__2__Impl rule__LegacyServlet__Group__3 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2289:2: rule__LegacyServlet__Group__2__Impl rule__LegacyServlet__Group__3
            {
            pushFollow(FOLLOW_rule__LegacyServlet__Group__2__Impl_in_rule__LegacyServlet__Group__24708);
            rule__LegacyServlet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LegacyServlet__Group__3_in_rule__LegacyServlet__Group__24711);
            rule__LegacyServlet__Group__3();

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
    // $ANTLR end "rule__LegacyServlet__Group__2"


    // $ANTLR start "rule__LegacyServlet__Group__2__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2296:1: rule__LegacyServlet__Group__2__Impl : ( ':' ) ;
    public final void rule__LegacyServlet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2300:1: ( ( ':' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2301:1: ( ':' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2301:1: ( ':' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2302:1: ':'
            {
             before(grammarAccess.getLegacyServletAccess().getColonKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__LegacyServlet__Group__2__Impl4739); 
             after(grammarAccess.getLegacyServletAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__LegacyServlet__Group__2__Impl"


    // $ANTLR start "rule__LegacyServlet__Group__3"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2315:1: rule__LegacyServlet__Group__3 : rule__LegacyServlet__Group__3__Impl rule__LegacyServlet__Group__4 ;
    public final void rule__LegacyServlet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2319:1: ( rule__LegacyServlet__Group__3__Impl rule__LegacyServlet__Group__4 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2320:2: rule__LegacyServlet__Group__3__Impl rule__LegacyServlet__Group__4
            {
            pushFollow(FOLLOW_rule__LegacyServlet__Group__3__Impl_in_rule__LegacyServlet__Group__34770);
            rule__LegacyServlet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LegacyServlet__Group__4_in_rule__LegacyServlet__Group__34773);
            rule__LegacyServlet__Group__4();

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
    // $ANTLR end "rule__LegacyServlet__Group__3"


    // $ANTLR start "rule__LegacyServlet__Group__3__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2327:1: rule__LegacyServlet__Group__3__Impl : ( ( rule__LegacyServlet__UrlPatternAssignment_3 ) ) ;
    public final void rule__LegacyServlet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2331:1: ( ( ( rule__LegacyServlet__UrlPatternAssignment_3 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2332:1: ( ( rule__LegacyServlet__UrlPatternAssignment_3 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2332:1: ( ( rule__LegacyServlet__UrlPatternAssignment_3 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2333:1: ( rule__LegacyServlet__UrlPatternAssignment_3 )
            {
             before(grammarAccess.getLegacyServletAccess().getUrlPatternAssignment_3()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2334:1: ( rule__LegacyServlet__UrlPatternAssignment_3 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2334:2: rule__LegacyServlet__UrlPatternAssignment_3
            {
            pushFollow(FOLLOW_rule__LegacyServlet__UrlPatternAssignment_3_in_rule__LegacyServlet__Group__3__Impl4800);
            rule__LegacyServlet__UrlPatternAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLegacyServletAccess().getUrlPatternAssignment_3()); 

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
    // $ANTLR end "rule__LegacyServlet__Group__3__Impl"


    // $ANTLR start "rule__LegacyServlet__Group__4"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2344:1: rule__LegacyServlet__Group__4 : rule__LegacyServlet__Group__4__Impl rule__LegacyServlet__Group__5 ;
    public final void rule__LegacyServlet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2348:1: ( rule__LegacyServlet__Group__4__Impl rule__LegacyServlet__Group__5 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2349:2: rule__LegacyServlet__Group__4__Impl rule__LegacyServlet__Group__5
            {
            pushFollow(FOLLOW_rule__LegacyServlet__Group__4__Impl_in_rule__LegacyServlet__Group__44830);
            rule__LegacyServlet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LegacyServlet__Group__5_in_rule__LegacyServlet__Group__44833);
            rule__LegacyServlet__Group__5();

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
    // $ANTLR end "rule__LegacyServlet__Group__4"


    // $ANTLR start "rule__LegacyServlet__Group__4__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2356:1: rule__LegacyServlet__Group__4__Impl : ( '->' ) ;
    public final void rule__LegacyServlet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2360:1: ( ( '->' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2361:1: ( '->' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2361:1: ( '->' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2362:1: '->'
            {
             before(grammarAccess.getLegacyServletAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,41,FOLLOW_41_in_rule__LegacyServlet__Group__4__Impl4861); 
             after(grammarAccess.getLegacyServletAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

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
    // $ANTLR end "rule__LegacyServlet__Group__4__Impl"


    // $ANTLR start "rule__LegacyServlet__Group__5"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2375:1: rule__LegacyServlet__Group__5 : rule__LegacyServlet__Group__5__Impl ;
    public final void rule__LegacyServlet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2379:1: ( rule__LegacyServlet__Group__5__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2380:2: rule__LegacyServlet__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__LegacyServlet__Group__5__Impl_in_rule__LegacyServlet__Group__54892);
            rule__LegacyServlet__Group__5__Impl();

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
    // $ANTLR end "rule__LegacyServlet__Group__5"


    // $ANTLR start "rule__LegacyServlet__Group__5__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2386:1: rule__LegacyServlet__Group__5__Impl : ( ( rule__LegacyServlet__FqClassNameAssignment_5 ) ) ;
    public final void rule__LegacyServlet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2390:1: ( ( ( rule__LegacyServlet__FqClassNameAssignment_5 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2391:1: ( ( rule__LegacyServlet__FqClassNameAssignment_5 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2391:1: ( ( rule__LegacyServlet__FqClassNameAssignment_5 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2392:1: ( rule__LegacyServlet__FqClassNameAssignment_5 )
            {
             before(grammarAccess.getLegacyServletAccess().getFqClassNameAssignment_5()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2393:1: ( rule__LegacyServlet__FqClassNameAssignment_5 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2393:2: rule__LegacyServlet__FqClassNameAssignment_5
            {
            pushFollow(FOLLOW_rule__LegacyServlet__FqClassNameAssignment_5_in_rule__LegacyServlet__Group__5__Impl4919);
            rule__LegacyServlet__FqClassNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLegacyServletAccess().getFqClassNameAssignment_5()); 

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
    // $ANTLR end "rule__LegacyServlet__Group__5__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2415:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2419:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2420:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04961);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04964);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2427:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2431:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2432:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2432:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2433:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4991); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2444:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2448:1: ( rule__QualifiedName__Group__1__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2449:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15020);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2455:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2459:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2460:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2460:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2461:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2462:1: ( rule__QualifiedName__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==44) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2462:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5047);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2476:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2480:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2481:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05082);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05085);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2488:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2492:1: ( ( '.' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2493:1: ( '.' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2493:1: ( '.' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2494:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__QualifiedName__Group_1__0__Impl5113); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2507:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2511:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2512:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15144);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2518:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2522:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2523:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2523:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2524:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5171); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__CrudService__Group__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2539:1: rule__CrudService__Group__0 : rule__CrudService__Group__0__Impl rule__CrudService__Group__1 ;
    public final void rule__CrudService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2543:1: ( rule__CrudService__Group__0__Impl rule__CrudService__Group__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2544:2: rule__CrudService__Group__0__Impl rule__CrudService__Group__1
            {
            pushFollow(FOLLOW_rule__CrudService__Group__0__Impl_in_rule__CrudService__Group__05204);
            rule__CrudService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CrudService__Group__1_in_rule__CrudService__Group__05207);
            rule__CrudService__Group__1();

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
    // $ANTLR end "rule__CrudService__Group__0"


    // $ANTLR start "rule__CrudService__Group__0__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2551:1: rule__CrudService__Group__0__Impl : ( 'crud-service' ) ;
    public final void rule__CrudService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2555:1: ( ( 'crud-service' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2556:1: ( 'crud-service' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2556:1: ( 'crud-service' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2557:1: 'crud-service'
            {
             before(grammarAccess.getCrudServiceAccess().getCrudServiceKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__CrudService__Group__0__Impl5235); 
             after(grammarAccess.getCrudServiceAccess().getCrudServiceKeyword_0()); 

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
    // $ANTLR end "rule__CrudService__Group__0__Impl"


    // $ANTLR start "rule__CrudService__Group__1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2570:1: rule__CrudService__Group__1 : rule__CrudService__Group__1__Impl rule__CrudService__Group__2 ;
    public final void rule__CrudService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2574:1: ( rule__CrudService__Group__1__Impl rule__CrudService__Group__2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2575:2: rule__CrudService__Group__1__Impl rule__CrudService__Group__2
            {
            pushFollow(FOLLOW_rule__CrudService__Group__1__Impl_in_rule__CrudService__Group__15266);
            rule__CrudService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CrudService__Group__2_in_rule__CrudService__Group__15269);
            rule__CrudService__Group__2();

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
    // $ANTLR end "rule__CrudService__Group__1"


    // $ANTLR start "rule__CrudService__Group__1__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2582:1: rule__CrudService__Group__1__Impl : ( ( rule__CrudService__StructureAssignment_1 ) ) ;
    public final void rule__CrudService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2586:1: ( ( ( rule__CrudService__StructureAssignment_1 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2587:1: ( ( rule__CrudService__StructureAssignment_1 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2587:1: ( ( rule__CrudService__StructureAssignment_1 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2588:1: ( rule__CrudService__StructureAssignment_1 )
            {
             before(grammarAccess.getCrudServiceAccess().getStructureAssignment_1()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2589:1: ( rule__CrudService__StructureAssignment_1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2589:2: rule__CrudService__StructureAssignment_1
            {
            pushFollow(FOLLOW_rule__CrudService__StructureAssignment_1_in_rule__CrudService__Group__1__Impl5296);
            rule__CrudService__StructureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCrudServiceAccess().getStructureAssignment_1()); 

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
    // $ANTLR end "rule__CrudService__Group__1__Impl"


    // $ANTLR start "rule__CrudService__Group__2"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2599:1: rule__CrudService__Group__2 : rule__CrudService__Group__2__Impl rule__CrudService__Group__3 ;
    public final void rule__CrudService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2603:1: ( rule__CrudService__Group__2__Impl rule__CrudService__Group__3 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2604:2: rule__CrudService__Group__2__Impl rule__CrudService__Group__3
            {
            pushFollow(FOLLOW_rule__CrudService__Group__2__Impl_in_rule__CrudService__Group__25326);
            rule__CrudService__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CrudService__Group__3_in_rule__CrudService__Group__25329);
            rule__CrudService__Group__3();

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
    // $ANTLR end "rule__CrudService__Group__2"


    // $ANTLR start "rule__CrudService__Group__2__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2611:1: rule__CrudService__Group__2__Impl : ( ':' ) ;
    public final void rule__CrudService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2615:1: ( ( ':' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2616:1: ( ':' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2616:1: ( ':' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2617:1: ':'
            {
             before(grammarAccess.getCrudServiceAccess().getColonKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__CrudService__Group__2__Impl5357); 
             after(grammarAccess.getCrudServiceAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__CrudService__Group__2__Impl"


    // $ANTLR start "rule__CrudService__Group__3"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2630:1: rule__CrudService__Group__3 : rule__CrudService__Group__3__Impl ;
    public final void rule__CrudService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2634:1: ( rule__CrudService__Group__3__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2635:2: rule__CrudService__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CrudService__Group__3__Impl_in_rule__CrudService__Group__35388);
            rule__CrudService__Group__3__Impl();

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
    // $ANTLR end "rule__CrudService__Group__3"


    // $ANTLR start "rule__CrudService__Group__3__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2641:1: rule__CrudService__Group__3__Impl : ( ( rule__CrudService__ServicesAssignment_3 )* ) ;
    public final void rule__CrudService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2645:1: ( ( ( rule__CrudService__ServicesAssignment_3 )* ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2646:1: ( ( rule__CrudService__ServicesAssignment_3 )* )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2646:1: ( ( rule__CrudService__ServicesAssignment_3 )* )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2647:1: ( rule__CrudService__ServicesAssignment_3 )*
            {
             before(grammarAccess.getCrudServiceAccess().getServicesAssignment_3()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2648:1: ( rule__CrudService__ServicesAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=16 && LA22_0<=19)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2648:2: rule__CrudService__ServicesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__CrudService__ServicesAssignment_3_in_rule__CrudService__Group__3__Impl5415);
            	    rule__CrudService__ServicesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getCrudServiceAccess().getServicesAssignment_3()); 

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
    // $ANTLR end "rule__CrudService__Group__3__Impl"


    // $ANTLR start "rule__StructureDefinition__Group__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2666:1: rule__StructureDefinition__Group__0 : rule__StructureDefinition__Group__0__Impl rule__StructureDefinition__Group__1 ;
    public final void rule__StructureDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2670:1: ( rule__StructureDefinition__Group__0__Impl rule__StructureDefinition__Group__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2671:2: rule__StructureDefinition__Group__0__Impl rule__StructureDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__StructureDefinition__Group__0__Impl_in_rule__StructureDefinition__Group__05454);
            rule__StructureDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructureDefinition__Group__1_in_rule__StructureDefinition__Group__05457);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2678:1: rule__StructureDefinition__Group__0__Impl : ( 'structure' ) ;
    public final void rule__StructureDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2682:1: ( ( 'structure' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2683:1: ( 'structure' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2683:1: ( 'structure' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2684:1: 'structure'
            {
             before(grammarAccess.getStructureDefinitionAccess().getStructureKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__StructureDefinition__Group__0__Impl5485); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2697:1: rule__StructureDefinition__Group__1 : rule__StructureDefinition__Group__1__Impl rule__StructureDefinition__Group__2 ;
    public final void rule__StructureDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2701:1: ( rule__StructureDefinition__Group__1__Impl rule__StructureDefinition__Group__2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2702:2: rule__StructureDefinition__Group__1__Impl rule__StructureDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__StructureDefinition__Group__1__Impl_in_rule__StructureDefinition__Group__15516);
            rule__StructureDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructureDefinition__Group__2_in_rule__StructureDefinition__Group__15519);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2709:1: rule__StructureDefinition__Group__1__Impl : ( ( rule__StructureDefinition__NameAssignment_1 ) ) ;
    public final void rule__StructureDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2713:1: ( ( ( rule__StructureDefinition__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2714:1: ( ( rule__StructureDefinition__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2714:1: ( ( rule__StructureDefinition__NameAssignment_1 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2715:1: ( rule__StructureDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getStructureDefinitionAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2716:1: ( rule__StructureDefinition__NameAssignment_1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2716:2: rule__StructureDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StructureDefinition__NameAssignment_1_in_rule__StructureDefinition__Group__1__Impl5546);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2726:1: rule__StructureDefinition__Group__2 : rule__StructureDefinition__Group__2__Impl rule__StructureDefinition__Group__3 ;
    public final void rule__StructureDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2730:1: ( rule__StructureDefinition__Group__2__Impl rule__StructureDefinition__Group__3 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2731:2: rule__StructureDefinition__Group__2__Impl rule__StructureDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__StructureDefinition__Group__2__Impl_in_rule__StructureDefinition__Group__25576);
            rule__StructureDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructureDefinition__Group__3_in_rule__StructureDefinition__Group__25579);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2738:1: rule__StructureDefinition__Group__2__Impl : ( ( rule__StructureDefinition__PersistentAssignment_2 )? ) ;
    public final void rule__StructureDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2742:1: ( ( ( rule__StructureDefinition__PersistentAssignment_2 )? ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2743:1: ( ( rule__StructureDefinition__PersistentAssignment_2 )? )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2743:1: ( ( rule__StructureDefinition__PersistentAssignment_2 )? )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2744:1: ( rule__StructureDefinition__PersistentAssignment_2 )?
            {
             before(grammarAccess.getStructureDefinitionAccess().getPersistentAssignment_2()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2745:1: ( rule__StructureDefinition__PersistentAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==54) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2745:2: rule__StructureDefinition__PersistentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__StructureDefinition__PersistentAssignment_2_in_rule__StructureDefinition__Group__2__Impl5606);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2755:1: rule__StructureDefinition__Group__3 : rule__StructureDefinition__Group__3__Impl rule__StructureDefinition__Group__4 ;
    public final void rule__StructureDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2759:1: ( rule__StructureDefinition__Group__3__Impl rule__StructureDefinition__Group__4 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2760:2: rule__StructureDefinition__Group__3__Impl rule__StructureDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__StructureDefinition__Group__3__Impl_in_rule__StructureDefinition__Group__35637);
            rule__StructureDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructureDefinition__Group__4_in_rule__StructureDefinition__Group__35640);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2767:1: rule__StructureDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__StructureDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2771:1: ( ( '{' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2772:1: ( '{' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2772:1: ( '{' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2773:1: '{'
            {
             before(grammarAccess.getStructureDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__StructureDefinition__Group__3__Impl5668); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2786:1: rule__StructureDefinition__Group__4 : rule__StructureDefinition__Group__4__Impl rule__StructureDefinition__Group__5 ;
    public final void rule__StructureDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2790:1: ( rule__StructureDefinition__Group__4__Impl rule__StructureDefinition__Group__5 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2791:2: rule__StructureDefinition__Group__4__Impl rule__StructureDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__StructureDefinition__Group__4__Impl_in_rule__StructureDefinition__Group__45699);
            rule__StructureDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructureDefinition__Group__5_in_rule__StructureDefinition__Group__45702);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2798:1: rule__StructureDefinition__Group__4__Impl : ( ( rule__StructureDefinition__FeaturesAssignment_4 )* ) ;
    public final void rule__StructureDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2802:1: ( ( ( rule__StructureDefinition__FeaturesAssignment_4 )* ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2803:1: ( ( rule__StructureDefinition__FeaturesAssignment_4 )* )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2803:1: ( ( rule__StructureDefinition__FeaturesAssignment_4 )* )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2804:1: ( rule__StructureDefinition__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getStructureDefinitionAccess().getFeaturesAssignment_4()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2805:1: ( rule__StructureDefinition__FeaturesAssignment_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2805:2: rule__StructureDefinition__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__StructureDefinition__FeaturesAssignment_4_in_rule__StructureDefinition__Group__4__Impl5729);
            	    rule__StructureDefinition__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2815:1: rule__StructureDefinition__Group__5 : rule__StructureDefinition__Group__5__Impl ;
    public final void rule__StructureDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2819:1: ( rule__StructureDefinition__Group__5__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2820:2: rule__StructureDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__StructureDefinition__Group__5__Impl_in_rule__StructureDefinition__Group__55760);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2826:1: rule__StructureDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__StructureDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2830:1: ( ( '}' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2831:1: ( '}' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2831:1: ( '}' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2832:1: '}'
            {
             before(grammarAccess.getStructureDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_34_in_rule__StructureDefinition__Group__5__Impl5788); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2857:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2861:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2862:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__05831);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__05834);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2869:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__NameAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2873:1: ( ( ( rule__Feature__NameAssignment_0 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2874:1: ( ( rule__Feature__NameAssignment_0 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2874:1: ( ( rule__Feature__NameAssignment_0 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2875:1: ( rule__Feature__NameAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_0()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2876:1: ( rule__Feature__NameAssignment_0 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2876:2: rule__Feature__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_0_in_rule__Feature__Group__0__Impl5861);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2886:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2890:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2891:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__15891);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__15894);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2898:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__OptionalAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2902:1: ( ( ( rule__Feature__OptionalAssignment_1 )? ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2903:1: ( ( rule__Feature__OptionalAssignment_1 )? )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2903:1: ( ( rule__Feature__OptionalAssignment_1 )? )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2904:1: ( rule__Feature__OptionalAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getOptionalAssignment_1()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2905:1: ( rule__Feature__OptionalAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==55) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2905:2: rule__Feature__OptionalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Feature__OptionalAssignment_1_in_rule__Feature__Group__1__Impl5921);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2915:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2919:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2920:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__25952);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__25955);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2927:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2931:1: ( ( ':' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2932:1: ( ':' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2932:1: ( ':' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2933:1: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__Feature__Group__2__Impl5983); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2946:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2950:1: ( rule__Feature__Group__3__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2951:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__36014);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2957:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2961:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2962:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2962:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2963:1: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2964:1: ( rule__Feature__TypeAssignment_3 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2964:2: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl6041);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2982:1: rule__EnumerationDefinition__Group__0 : rule__EnumerationDefinition__Group__0__Impl rule__EnumerationDefinition__Group__1 ;
    public final void rule__EnumerationDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2986:1: ( rule__EnumerationDefinition__Group__0__Impl rule__EnumerationDefinition__Group__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2987:2: rule__EnumerationDefinition__Group__0__Impl rule__EnumerationDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__0__Impl_in_rule__EnumerationDefinition__Group__06079);
            rule__EnumerationDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__1_in_rule__EnumerationDefinition__Group__06082);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2994:1: rule__EnumerationDefinition__Group__0__Impl : ( 'enumeration' ) ;
    public final void rule__EnumerationDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2998:1: ( ( 'enumeration' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2999:1: ( 'enumeration' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:2999:1: ( 'enumeration' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3000:1: 'enumeration'
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getEnumerationKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__EnumerationDefinition__Group__0__Impl6110); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3013:1: rule__EnumerationDefinition__Group__1 : rule__EnumerationDefinition__Group__1__Impl rule__EnumerationDefinition__Group__2 ;
    public final void rule__EnumerationDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3017:1: ( rule__EnumerationDefinition__Group__1__Impl rule__EnumerationDefinition__Group__2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3018:2: rule__EnumerationDefinition__Group__1__Impl rule__EnumerationDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__1__Impl_in_rule__EnumerationDefinition__Group__16141);
            rule__EnumerationDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__2_in_rule__EnumerationDefinition__Group__16144);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3025:1: rule__EnumerationDefinition__Group__1__Impl : ( ( rule__EnumerationDefinition__NameAssignment_1 ) ) ;
    public final void rule__EnumerationDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3029:1: ( ( ( rule__EnumerationDefinition__NameAssignment_1 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3030:1: ( ( rule__EnumerationDefinition__NameAssignment_1 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3030:1: ( ( rule__EnumerationDefinition__NameAssignment_1 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3031:1: ( rule__EnumerationDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getNameAssignment_1()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3032:1: ( rule__EnumerationDefinition__NameAssignment_1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3032:2: rule__EnumerationDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumerationDefinition__NameAssignment_1_in_rule__EnumerationDefinition__Group__1__Impl6171);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3042:1: rule__EnumerationDefinition__Group__2 : rule__EnumerationDefinition__Group__2__Impl rule__EnumerationDefinition__Group__3 ;
    public final void rule__EnumerationDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3046:1: ( rule__EnumerationDefinition__Group__2__Impl rule__EnumerationDefinition__Group__3 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3047:2: rule__EnumerationDefinition__Group__2__Impl rule__EnumerationDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__2__Impl_in_rule__EnumerationDefinition__Group__26201);
            rule__EnumerationDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__3_in_rule__EnumerationDefinition__Group__26204);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3054:1: rule__EnumerationDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumerationDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3058:1: ( ( '{' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3059:1: ( '{' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3059:1: ( '{' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3060:1: '{'
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__EnumerationDefinition__Group__2__Impl6232); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3073:1: rule__EnumerationDefinition__Group__3 : rule__EnumerationDefinition__Group__3__Impl rule__EnumerationDefinition__Group__4 ;
    public final void rule__EnumerationDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3077:1: ( rule__EnumerationDefinition__Group__3__Impl rule__EnumerationDefinition__Group__4 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3078:2: rule__EnumerationDefinition__Group__3__Impl rule__EnumerationDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__3__Impl_in_rule__EnumerationDefinition__Group__36263);
            rule__EnumerationDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__4_in_rule__EnumerationDefinition__Group__36266);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3085:1: rule__EnumerationDefinition__Group__3__Impl : ( ( rule__EnumerationDefinition__LiteralsAssignment_3 )* ) ;
    public final void rule__EnumerationDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3089:1: ( ( ( rule__EnumerationDefinition__LiteralsAssignment_3 )* ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3090:1: ( ( rule__EnumerationDefinition__LiteralsAssignment_3 )* )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3090:1: ( ( rule__EnumerationDefinition__LiteralsAssignment_3 )* )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3091:1: ( rule__EnumerationDefinition__LiteralsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getLiteralsAssignment_3()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3092:1: ( rule__EnumerationDefinition__LiteralsAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_INT)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3092:2: rule__EnumerationDefinition__LiteralsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__EnumerationDefinition__LiteralsAssignment_3_in_rule__EnumerationDefinition__Group__3__Impl6293);
            	    rule__EnumerationDefinition__LiteralsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3102:1: rule__EnumerationDefinition__Group__4 : rule__EnumerationDefinition__Group__4__Impl ;
    public final void rule__EnumerationDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3106:1: ( rule__EnumerationDefinition__Group__4__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3107:2: rule__EnumerationDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationDefinition__Group__4__Impl_in_rule__EnumerationDefinition__Group__46324);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3113:1: rule__EnumerationDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__EnumerationDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3117:1: ( ( '}' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3118:1: ( '}' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3118:1: ( '}' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3119:1: '}'
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_34_in_rule__EnumerationDefinition__Group__4__Impl6352); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3142:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3146:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3147:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__06393);
            rule__EnumerationLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__06396);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3154:1: rule__EnumerationLiteral__Group__0__Impl : ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3158:1: ( ( ( rule__EnumerationLiteral__NameAssignment_0 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3159:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3159:1: ( ( rule__EnumerationLiteral__NameAssignment_0 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3160:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3161:1: ( rule__EnumerationLiteral__NameAssignment_0 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3161:2: rule__EnumerationLiteral__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl6423);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3171:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3175:1: ( rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3176:2: rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__16453);
            rule__EnumerationLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__16456);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3183:1: rule__EnumerationLiteral__Group__1__Impl : ( '->' ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3187:1: ( ( '->' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3188:1: ( '->' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3188:1: ( '->' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3189:1: '->'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__EnumerationLiteral__Group__1__Impl6484); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3202:1: rule__EnumerationLiteral__Group__2 : rule__EnumerationLiteral__Group__2__Impl ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3206:1: ( rule__EnumerationLiteral__Group__2__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3207:2: rule__EnumerationLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__26515);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3213:1: rule__EnumerationLiteral__Group__2__Impl : ( ( rule__EnumerationLiteral__DisplayNameAssignment_2 ) ) ;
    public final void rule__EnumerationLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3217:1: ( ( ( rule__EnumerationLiteral__DisplayNameAssignment_2 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3218:1: ( ( rule__EnumerationLiteral__DisplayNameAssignment_2 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3218:1: ( ( rule__EnumerationLiteral__DisplayNameAssignment_2 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3219:1: ( rule__EnumerationLiteral__DisplayNameAssignment_2 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getDisplayNameAssignment_2()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3220:1: ( rule__EnumerationLiteral__DisplayNameAssignment_2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3220:2: rule__EnumerationLiteral__DisplayNameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumerationLiteral__DisplayNameAssignment_2_in_rule__EnumerationLiteral__Group__2__Impl6542);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3236:1: rule__ListTypeLiteral__Group__0 : rule__ListTypeLiteral__Group__0__Impl rule__ListTypeLiteral__Group__1 ;
    public final void rule__ListTypeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3240:1: ( rule__ListTypeLiteral__Group__0__Impl rule__ListTypeLiteral__Group__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3241:2: rule__ListTypeLiteral__Group__0__Impl rule__ListTypeLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ListTypeLiteral__Group__0__Impl_in_rule__ListTypeLiteral__Group__06578);
            rule__ListTypeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListTypeLiteral__Group__1_in_rule__ListTypeLiteral__Group__06581);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3248:1: rule__ListTypeLiteral__Group__0__Impl : ( '[' ) ;
    public final void rule__ListTypeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3252:1: ( ( '[' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3253:1: ( '[' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3253:1: ( '[' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3254:1: '['
            {
             before(grammarAccess.getListTypeLiteralAccess().getLeftSquareBracketKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__ListTypeLiteral__Group__0__Impl6609); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3267:1: rule__ListTypeLiteral__Group__1 : rule__ListTypeLiteral__Group__1__Impl rule__ListTypeLiteral__Group__2 ;
    public final void rule__ListTypeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3271:1: ( rule__ListTypeLiteral__Group__1__Impl rule__ListTypeLiteral__Group__2 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3272:2: rule__ListTypeLiteral__Group__1__Impl rule__ListTypeLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ListTypeLiteral__Group__1__Impl_in_rule__ListTypeLiteral__Group__16640);
            rule__ListTypeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListTypeLiteral__Group__2_in_rule__ListTypeLiteral__Group__16643);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3279:1: rule__ListTypeLiteral__Group__1__Impl : ( ( rule__ListTypeLiteral__ItemTypeAssignment_1 ) ) ;
    public final void rule__ListTypeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3283:1: ( ( ( rule__ListTypeLiteral__ItemTypeAssignment_1 ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3284:1: ( ( rule__ListTypeLiteral__ItemTypeAssignment_1 ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3284:1: ( ( rule__ListTypeLiteral__ItemTypeAssignment_1 ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3285:1: ( rule__ListTypeLiteral__ItemTypeAssignment_1 )
            {
             before(grammarAccess.getListTypeLiteralAccess().getItemTypeAssignment_1()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3286:1: ( rule__ListTypeLiteral__ItemTypeAssignment_1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3286:2: rule__ListTypeLiteral__ItemTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ListTypeLiteral__ItemTypeAssignment_1_in_rule__ListTypeLiteral__Group__1__Impl6670);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3296:1: rule__ListTypeLiteral__Group__2 : rule__ListTypeLiteral__Group__2__Impl ;
    public final void rule__ListTypeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3300:1: ( rule__ListTypeLiteral__Group__2__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3301:2: rule__ListTypeLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ListTypeLiteral__Group__2__Impl_in_rule__ListTypeLiteral__Group__26700);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3307:1: rule__ListTypeLiteral__Group__2__Impl : ( ']' ) ;
    public final void rule__ListTypeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3311:1: ( ( ']' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3312:1: ( ']' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3312:1: ( ']' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3313:1: ']'
            {
             before(grammarAccess.getListTypeLiteralAccess().getRightSquareBracketKeyword_2()); 
            match(input,49,FOLLOW_49_in_rule__ListTypeLiteral__Group__2__Impl6728); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3332:1: rule__SyntheticTypeLiteral__Group_0__0 : rule__SyntheticTypeLiteral__Group_0__0__Impl rule__SyntheticTypeLiteral__Group_0__1 ;
    public final void rule__SyntheticTypeLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3336:1: ( rule__SyntheticTypeLiteral__Group_0__0__Impl rule__SyntheticTypeLiteral__Group_0__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3337:2: rule__SyntheticTypeLiteral__Group_0__0__Impl rule__SyntheticTypeLiteral__Group_0__1
            {
            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_0__0__Impl_in_rule__SyntheticTypeLiteral__Group_0__06765);
            rule__SyntheticTypeLiteral__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_0__1_in_rule__SyntheticTypeLiteral__Group_0__06768);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3344:1: rule__SyntheticTypeLiteral__Group_0__0__Impl : ( () ) ;
    public final void rule__SyntheticTypeLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3348:1: ( ( () ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3349:1: ( () )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3349:1: ( () )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3350:1: ()
            {
             before(grammarAccess.getSyntheticTypeLiteralAccess().getCallbackLiteralAction_0_0()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3351:1: ()
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3353:1: 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3363:1: rule__SyntheticTypeLiteral__Group_0__1 : rule__SyntheticTypeLiteral__Group_0__1__Impl ;
    public final void rule__SyntheticTypeLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3367:1: ( rule__SyntheticTypeLiteral__Group_0__1__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3368:2: rule__SyntheticTypeLiteral__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_0__1__Impl_in_rule__SyntheticTypeLiteral__Group_0__16826);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3374:1: rule__SyntheticTypeLiteral__Group_0__1__Impl : ( 'Callback' ) ;
    public final void rule__SyntheticTypeLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3378:1: ( ( 'Callback' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3379:1: ( 'Callback' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3379:1: ( 'Callback' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3380:1: 'Callback'
            {
             before(grammarAccess.getSyntheticTypeLiteralAccess().getCallbackKeyword_0_1()); 
            match(input,50,FOLLOW_50_in_rule__SyntheticTypeLiteral__Group_0__1__Impl6854); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3397:1: rule__SyntheticTypeLiteral__Group_1__0 : rule__SyntheticTypeLiteral__Group_1__0__Impl rule__SyntheticTypeLiteral__Group_1__1 ;
    public final void rule__SyntheticTypeLiteral__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3401:1: ( rule__SyntheticTypeLiteral__Group_1__0__Impl rule__SyntheticTypeLiteral__Group_1__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3402:2: rule__SyntheticTypeLiteral__Group_1__0__Impl rule__SyntheticTypeLiteral__Group_1__1
            {
            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_1__0__Impl_in_rule__SyntheticTypeLiteral__Group_1__06889);
            rule__SyntheticTypeLiteral__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_1__1_in_rule__SyntheticTypeLiteral__Group_1__06892);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3409:1: rule__SyntheticTypeLiteral__Group_1__0__Impl : ( () ) ;
    public final void rule__SyntheticTypeLiteral__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3413:1: ( ( () ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3414:1: ( () )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3414:1: ( () )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3415:1: ()
            {
             before(grammarAccess.getSyntheticTypeLiteralAccess().getCallbackErrorResponseLiteralAction_1_0()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3416:1: ()
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3418:1: 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3428:1: rule__SyntheticTypeLiteral__Group_1__1 : rule__SyntheticTypeLiteral__Group_1__1__Impl ;
    public final void rule__SyntheticTypeLiteral__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3432:1: ( rule__SyntheticTypeLiteral__Group_1__1__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3433:2: rule__SyntheticTypeLiteral__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_1__1__Impl_in_rule__SyntheticTypeLiteral__Group_1__16950);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3439:1: rule__SyntheticTypeLiteral__Group_1__1__Impl : ( 'Error' ) ;
    public final void rule__SyntheticTypeLiteral__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3443:1: ( ( 'Error' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3444:1: ( 'Error' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3444:1: ( 'Error' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3445:1: 'Error'
            {
             before(grammarAccess.getSyntheticTypeLiteralAccess().getErrorKeyword_1_1()); 
            match(input,51,FOLLOW_51_in_rule__SyntheticTypeLiteral__Group_1__1__Impl6978); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3462:1: rule__SyntheticTypeLiteral__Group_2__0 : rule__SyntheticTypeLiteral__Group_2__0__Impl rule__SyntheticTypeLiteral__Group_2__1 ;
    public final void rule__SyntheticTypeLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3466:1: ( rule__SyntheticTypeLiteral__Group_2__0__Impl rule__SyntheticTypeLiteral__Group_2__1 )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3467:2: rule__SyntheticTypeLiteral__Group_2__0__Impl rule__SyntheticTypeLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_2__0__Impl_in_rule__SyntheticTypeLiteral__Group_2__07013);
            rule__SyntheticTypeLiteral__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_2__1_in_rule__SyntheticTypeLiteral__Group_2__07016);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3474:1: rule__SyntheticTypeLiteral__Group_2__0__Impl : ( () ) ;
    public final void rule__SyntheticTypeLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3478:1: ( ( () ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3479:1: ( () )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3479:1: ( () )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3480:1: ()
            {
             before(grammarAccess.getSyntheticTypeLiteralAccess().getVoidLiteralAction_2_0()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3481:1: ()
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3483:1: 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3493:1: rule__SyntheticTypeLiteral__Group_2__1 : rule__SyntheticTypeLiteral__Group_2__1__Impl ;
    public final void rule__SyntheticTypeLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3497:1: ( rule__SyntheticTypeLiteral__Group_2__1__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3498:2: rule__SyntheticTypeLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SyntheticTypeLiteral__Group_2__1__Impl_in_rule__SyntheticTypeLiteral__Group_2__17074);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3504:1: rule__SyntheticTypeLiteral__Group_2__1__Impl : ( '$Void' ) ;
    public final void rule__SyntheticTypeLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3508:1: ( ( '$Void' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3509:1: ( '$Void' )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3509:1: ( '$Void' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3510:1: '$Void'
            {
             before(grammarAccess.getSyntheticTypeLiteralAccess().getVoidKeyword_2_1()); 
            match(input,52,FOLLOW_52_in_rule__SyntheticTypeLiteral__Group_2__1__Impl7102); 
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


    // $ANTLR start "rule__BackendModel__UnorderedGroup_1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3528:1: rule__BackendModel__UnorderedGroup_1 : rule__BackendModel__UnorderedGroup_1__0 {...}?;
    public final void rule__BackendModel__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getBackendModelAccess().getUnorderedGroup_1());
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3533:1: ( rule__BackendModel__UnorderedGroup_1__0 {...}?)
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3534:2: rule__BackendModel__UnorderedGroup_1__0 {...}?
            {
            pushFollow(FOLLOW_rule__BackendModel__UnorderedGroup_1__0_in_rule__BackendModel__UnorderedGroup_17138);
            rule__BackendModel__UnorderedGroup_1__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBackendModelAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "rule__BackendModel__UnorderedGroup_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getBackendModelAccess().getUnorderedGroup_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getBackendModelAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackendModel__UnorderedGroup_1"


    // $ANTLR start "rule__BackendModel__UnorderedGroup_1__Impl"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3545:1: rule__BackendModel__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__BackendModel__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BackendModel__Group_1_1__0 ) ) ) ) ) ;
    public final void rule__BackendModel__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3550:1: ( ( ({...}? => ( ( ( rule__BackendModel__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BackendModel__Group_1_1__0 ) ) ) ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3551:3: ( ({...}? => ( ( ( rule__BackendModel__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BackendModel__Group_1_1__0 ) ) ) ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3551:3: ( ({...}? => ( ( ( rule__BackendModel__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BackendModel__Group_1_1__0 ) ) ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 >=34 && LA27_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 1) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3553:4: ({...}? => ( ( ( rule__BackendModel__Group_1_0__0 ) ) ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3553:4: ({...}? => ( ( ( rule__BackendModel__Group_1_0__0 ) ) ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3554:5: {...}? => ( ( ( rule__BackendModel__Group_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__BackendModel__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3554:109: ( ( ( rule__BackendModel__Group_1_0__0 ) ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3555:6: ( ( rule__BackendModel__Group_1_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3561:6: ( ( rule__BackendModel__Group_1_0__0 ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3563:7: ( rule__BackendModel__Group_1_0__0 )
                    {
                     before(grammarAccess.getBackendModelAccess().getGroup_1_0()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3564:7: ( rule__BackendModel__Group_1_0__0 )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3564:8: rule__BackendModel__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__BackendModel__Group_1_0__0_in_rule__BackendModel__UnorderedGroup_1__Impl7227);
                    rule__BackendModel__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBackendModelAccess().getGroup_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3570:4: ({...}? => ( ( ( rule__BackendModel__Group_1_1__0 ) ) ) )
                    {
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3570:4: ({...}? => ( ( ( rule__BackendModel__Group_1_1__0 ) ) ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3571:5: {...}? => ( ( ( rule__BackendModel__Group_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__BackendModel__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3571:109: ( ( ( rule__BackendModel__Group_1_1__0 ) ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3572:6: ( ( rule__BackendModel__Group_1_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3578:6: ( ( rule__BackendModel__Group_1_1__0 ) )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3580:7: ( rule__BackendModel__Group_1_1__0 )
                    {
                     before(grammarAccess.getBackendModelAccess().getGroup_1_1()); 
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3581:7: ( rule__BackendModel__Group_1_1__0 )
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3581:8: rule__BackendModel__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__BackendModel__Group_1_1__0_in_rule__BackendModel__UnorderedGroup_1__Impl7318);
                    rule__BackendModel__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBackendModelAccess().getGroup_1_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBackendModelAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackendModel__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__BackendModel__UnorderedGroup_1__0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3596:1: rule__BackendModel__UnorderedGroup_1__0 : rule__BackendModel__UnorderedGroup_1__Impl ( rule__BackendModel__UnorderedGroup_1__1 )? ;
    public final void rule__BackendModel__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3600:1: ( rule__BackendModel__UnorderedGroup_1__Impl ( rule__BackendModel__UnorderedGroup_1__1 )? )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3601:2: rule__BackendModel__UnorderedGroup_1__Impl ( rule__BackendModel__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_rule__BackendModel__UnorderedGroup_1__Impl_in_rule__BackendModel__UnorderedGroup_1__07377);
            rule__BackendModel__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3602:2: ( rule__BackendModel__UnorderedGroup_1__1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 >=34 && LA28_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 1) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3602:2: rule__BackendModel__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_rule__BackendModel__UnorderedGroup_1__1_in_rule__BackendModel__UnorderedGroup_1__07380);
                    rule__BackendModel__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__BackendModel__UnorderedGroup_1__0"


    // $ANTLR start "rule__BackendModel__UnorderedGroup_1__1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3609:1: rule__BackendModel__UnorderedGroup_1__1 : rule__BackendModel__UnorderedGroup_1__Impl ;
    public final void rule__BackendModel__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3613:1: ( rule__BackendModel__UnorderedGroup_1__Impl )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3614:2: rule__BackendModel__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_rule__BackendModel__UnorderedGroup_1__Impl_in_rule__BackendModel__UnorderedGroup_1__17405);
            rule__BackendModel__UnorderedGroup_1__Impl();

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
    // $ANTLR end "rule__BackendModel__UnorderedGroup_1__1"


    // $ANTLR start "rule__BackendModel__BaseUrlAssignment_1_0_2_2"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3625:1: rule__BackendModel__BaseUrlAssignment_1_0_2_2 : ( RULE_STRING ) ;
    public final void rule__BackendModel__BaseUrlAssignment_1_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3629:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3630:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3630:1: ( RULE_STRING )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3631:1: RULE_STRING
            {
             before(grammarAccess.getBackendModelAccess().getBaseUrlSTRINGTerminalRuleCall_1_0_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BackendModel__BaseUrlAssignment_1_0_2_27437); 
             after(grammarAccess.getBackendModelAccess().getBaseUrlSTRINGTerminalRuleCall_1_0_2_2_0()); 

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
    // $ANTLR end "rule__BackendModel__BaseUrlAssignment_1_0_2_2"


    // $ANTLR start "rule__BackendModel__FlavorAssignment_1_1_0_2"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3640:1: rule__BackendModel__FlavorAssignment_1_1_0_2 : ( ruleFlavors ) ;
    public final void rule__BackendModel__FlavorAssignment_1_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3644:1: ( ( ruleFlavors ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3645:1: ( ruleFlavors )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3645:1: ( ruleFlavors )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3646:1: ruleFlavors
            {
             before(grammarAccess.getBackendModelAccess().getFlavorFlavorsEnumRuleCall_1_1_0_2_0()); 
            pushFollow(FOLLOW_ruleFlavors_in_rule__BackendModel__FlavorAssignment_1_1_0_27468);
            ruleFlavors();

            state._fsp--;

             after(grammarAccess.getBackendModelAccess().getFlavorFlavorsEnumRuleCall_1_1_0_2_0()); 

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
    // $ANTLR end "rule__BackendModel__FlavorAssignment_1_1_0_2"


    // $ANTLR start "rule__BackendModel__AuthOptsAssignment_2"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3655:1: rule__BackendModel__AuthOptsAssignment_2 : ( ruleAuthenticationDeclaration ) ;
    public final void rule__BackendModel__AuthOptsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3659:1: ( ( ruleAuthenticationDeclaration ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3660:1: ( ruleAuthenticationDeclaration )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3660:1: ( ruleAuthenticationDeclaration )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3661:1: ruleAuthenticationDeclaration
            {
             before(grammarAccess.getBackendModelAccess().getAuthOptsAuthenticationDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAuthenticationDeclaration_in_rule__BackendModel__AuthOptsAssignment_27499);
            ruleAuthenticationDeclaration();

            state._fsp--;

             after(grammarAccess.getBackendModelAccess().getAuthOptsAuthenticationDeclarationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__BackendModel__AuthOptsAssignment_2"


    // $ANTLR start "rule__BackendModel__DeclarationsAssignment_3"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3670:1: rule__BackendModel__DeclarationsAssignment_3 : ( ruleService ) ;
    public final void rule__BackendModel__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3674:1: ( ( ruleService ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3675:1: ( ruleService )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3675:1: ( ruleService )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3676:1: ruleService
            {
             before(grammarAccess.getBackendModelAccess().getDeclarationsServiceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleService_in_rule__BackendModel__DeclarationsAssignment_37530);
            ruleService();

            state._fsp--;

             after(grammarAccess.getBackendModelAccess().getDeclarationsServiceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__BackendModel__DeclarationsAssignment_3"


    // $ANTLR start "rule__AuthenticationDeclaration__NameAssignment_1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3685:1: rule__AuthenticationDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AuthenticationDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3689:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3690:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3690:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3691:1: RULE_ID
            {
             before(grammarAccess.getAuthenticationDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AuthenticationDeclaration__NameAssignment_17561); 
             after(grammarAccess.getAuthenticationDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AuthenticationDeclaration__NameAssignment_1"


    // $ANTLR start "rule__AuthenticationDeclaration__PrincipalAssignment_4"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3700:1: rule__AuthenticationDeclaration__PrincipalAssignment_4 : ( ruleAuthenticationParameter ) ;
    public final void rule__AuthenticationDeclaration__PrincipalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3704:1: ( ( ruleAuthenticationParameter ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3705:1: ( ruleAuthenticationParameter )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3705:1: ( ruleAuthenticationParameter )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3706:1: ruleAuthenticationParameter
            {
             before(grammarAccess.getAuthenticationDeclarationAccess().getPrincipalAuthenticationParameterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAuthenticationParameter_in_rule__AuthenticationDeclaration__PrincipalAssignment_47592);
            ruleAuthenticationParameter();

            state._fsp--;

             after(grammarAccess.getAuthenticationDeclarationAccess().getPrincipalAuthenticationParameterParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__AuthenticationDeclaration__PrincipalAssignment_4"


    // $ANTLR start "rule__AuthenticationDeclaration__CredentialAssignment_6"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3715:1: rule__AuthenticationDeclaration__CredentialAssignment_6 : ( ruleAuthenticationParameter ) ;
    public final void rule__AuthenticationDeclaration__CredentialAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3719:1: ( ( ruleAuthenticationParameter ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3720:1: ( ruleAuthenticationParameter )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3720:1: ( ruleAuthenticationParameter )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3721:1: ruleAuthenticationParameter
            {
             before(grammarAccess.getAuthenticationDeclarationAccess().getCredentialAuthenticationParameterParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleAuthenticationParameter_in_rule__AuthenticationDeclaration__CredentialAssignment_67623);
            ruleAuthenticationParameter();

            state._fsp--;

             after(grammarAccess.getAuthenticationDeclarationAccess().getCredentialAuthenticationParameterParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__AuthenticationDeclaration__CredentialAssignment_6"


    // $ANTLR start "rule__AuthenticationParameter__NameAssignment_0"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3730:1: rule__AuthenticationParameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AuthenticationParameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3734:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3735:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3735:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3736:1: RULE_ID
            {
             before(grammarAccess.getAuthenticationParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AuthenticationParameter__NameAssignment_07654); 
             after(grammarAccess.getAuthenticationParameterAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__AuthenticationParameter__NameAssignment_0"


    // $ANTLR start "rule__AuthenticationParameter__TypeAssignment_2"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3745:1: rule__AuthenticationParameter__TypeAssignment_2 : ( ruleTypeLiteral ) ;
    public final void rule__AuthenticationParameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3749:1: ( ( ruleTypeLiteral ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3750:1: ( ruleTypeLiteral )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3750:1: ( ruleTypeLiteral )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3751:1: ruleTypeLiteral
            {
             before(grammarAccess.getAuthenticationParameterAccess().getTypeTypeLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeLiteral_in_rule__AuthenticationParameter__TypeAssignment_27685);
            ruleTypeLiteral();

            state._fsp--;

             after(grammarAccess.getAuthenticationParameterAccess().getTypeTypeLiteralParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AuthenticationParameter__TypeAssignment_2"


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3760:1: rule__Interface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3764:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3765:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3765:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3766:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_17716); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Interface__NameAssignment_1"


    // $ANTLR start "rule__Interface__MethodAssignment_2"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3775:1: rule__Interface__MethodAssignment_2 : ( ruleHttpMethods ) ;
    public final void rule__Interface__MethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3779:1: ( ( ruleHttpMethods ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3780:1: ( ruleHttpMethods )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3780:1: ( ruleHttpMethods )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3781:1: ruleHttpMethods
            {
             before(grammarAccess.getInterfaceAccess().getMethodHttpMethodsEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleHttpMethods_in_rule__Interface__MethodAssignment_27747);
            ruleHttpMethods();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getMethodHttpMethodsEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Interface__MethodAssignment_2"


    // $ANTLR start "rule__Interface__InputTypeAssignment_3"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3790:1: rule__Interface__InputTypeAssignment_3 : ( ruleDefinedTypeLiteral ) ;
    public final void rule__Interface__InputTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3794:1: ( ( ruleDefinedTypeLiteral ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3795:1: ( ruleDefinedTypeLiteral )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3795:1: ( ruleDefinedTypeLiteral )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3796:1: ruleDefinedTypeLiteral
            {
             before(grammarAccess.getInterfaceAccess().getInputTypeDefinedTypeLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDefinedTypeLiteral_in_rule__Interface__InputTypeAssignment_37778);
            ruleDefinedTypeLiteral();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getInputTypeDefinedTypeLiteralParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Interface__InputTypeAssignment_3"


    // $ANTLR start "rule__Interface__OutputTypeAssignment_4_1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3805:1: rule__Interface__OutputTypeAssignment_4_1 : ( ruleTypeLiteral ) ;
    public final void rule__Interface__OutputTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3809:1: ( ( ruleTypeLiteral ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3810:1: ( ruleTypeLiteral )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3810:1: ( ruleTypeLiteral )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3811:1: ruleTypeLiteral
            {
             before(grammarAccess.getInterfaceAccess().getOutputTypeTypeLiteralParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleTypeLiteral_in_rule__Interface__OutputTypeAssignment_4_17809);
            ruleTypeLiteral();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getOutputTypeTypeLiteralParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Interface__OutputTypeAssignment_4_1"


    // $ANTLR start "rule__Interface__NotAuthenticatedAssignment_5"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3820:1: rule__Interface__NotAuthenticatedAssignment_5 : ( ( 'not-authenticated' ) ) ;
    public final void rule__Interface__NotAuthenticatedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3824:1: ( ( ( 'not-authenticated' ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3825:1: ( ( 'not-authenticated' ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3825:1: ( ( 'not-authenticated' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3826:1: ( 'not-authenticated' )
            {
             before(grammarAccess.getInterfaceAccess().getNotAuthenticatedNotAuthenticatedKeyword_5_0()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3827:1: ( 'not-authenticated' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3828:1: 'not-authenticated'
            {
             before(grammarAccess.getInterfaceAccess().getNotAuthenticatedNotAuthenticatedKeyword_5_0()); 
            match(input,53,FOLLOW_53_in_rule__Interface__NotAuthenticatedAssignment_57845); 
             after(grammarAccess.getInterfaceAccess().getNotAuthenticatedNotAuthenticatedKeyword_5_0()); 

            }

             after(grammarAccess.getInterfaceAccess().getNotAuthenticatedNotAuthenticatedKeyword_5_0()); 

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
    // $ANTLR end "rule__Interface__NotAuthenticatedAssignment_5"


    // $ANTLR start "rule__Interface__LegacyServletAssignment_6_1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3843:1: rule__Interface__LegacyServletAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Interface__LegacyServletAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3847:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3848:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3848:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3849:1: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceAccess().getLegacyServletLegacyServletCrossReference_6_1_0()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3850:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3851:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getLegacyServletLegacyServletIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__LegacyServletAssignment_6_17888); 
             after(grammarAccess.getInterfaceAccess().getLegacyServletLegacyServletIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getLegacyServletLegacyServletCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Interface__LegacyServletAssignment_6_1"


    // $ANTLR start "rule__Interface__DocumentationAssignment_7"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3862:1: rule__Interface__DocumentationAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Interface__DocumentationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3866:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3867:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3867:1: ( RULE_STRING )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3868:1: RULE_STRING
            {
             before(grammarAccess.getInterfaceAccess().getDocumentationSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Interface__DocumentationAssignment_77923); 
             after(grammarAccess.getInterfaceAccess().getDocumentationSTRINGTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__Interface__DocumentationAssignment_7"


    // $ANTLR start "rule__LegacyServlet__NameAssignment_1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3877:1: rule__LegacyServlet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LegacyServlet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3881:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3882:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3882:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3883:1: RULE_ID
            {
             before(grammarAccess.getLegacyServletAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LegacyServlet__NameAssignment_17954); 
             after(grammarAccess.getLegacyServletAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__LegacyServlet__NameAssignment_1"


    // $ANTLR start "rule__LegacyServlet__UrlPatternAssignment_3"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3892:1: rule__LegacyServlet__UrlPatternAssignment_3 : ( RULE_URL ) ;
    public final void rule__LegacyServlet__UrlPatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3896:1: ( ( RULE_URL ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3897:1: ( RULE_URL )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3897:1: ( RULE_URL )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3898:1: RULE_URL
            {
             before(grammarAccess.getLegacyServletAccess().getUrlPatternURLTerminalRuleCall_3_0()); 
            match(input,RULE_URL,FOLLOW_RULE_URL_in_rule__LegacyServlet__UrlPatternAssignment_37985); 
             after(grammarAccess.getLegacyServletAccess().getUrlPatternURLTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__LegacyServlet__UrlPatternAssignment_3"


    // $ANTLR start "rule__LegacyServlet__FqClassNameAssignment_5"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3907:1: rule__LegacyServlet__FqClassNameAssignment_5 : ( ruleQualifiedName ) ;
    public final void rule__LegacyServlet__FqClassNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3911:1: ( ( ruleQualifiedName ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3912:1: ( ruleQualifiedName )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3912:1: ( ruleQualifiedName )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3913:1: ruleQualifiedName
            {
             before(grammarAccess.getLegacyServletAccess().getFqClassNameQualifiedNameParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__LegacyServlet__FqClassNameAssignment_58016);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getLegacyServletAccess().getFqClassNameQualifiedNameParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__LegacyServlet__FqClassNameAssignment_5"


    // $ANTLR start "rule__CrudService__StructureAssignment_1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3922:1: rule__CrudService__StructureAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CrudService__StructureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3926:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3927:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3927:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3928:1: ( RULE_ID )
            {
             before(grammarAccess.getCrudServiceAccess().getStructureStructureCrossReference_1_0()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3929:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3930:1: RULE_ID
            {
             before(grammarAccess.getCrudServiceAccess().getStructureStructureIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CrudService__StructureAssignment_18051); 
             after(grammarAccess.getCrudServiceAccess().getStructureStructureIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCrudServiceAccess().getStructureStructureCrossReference_1_0()); 

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
    // $ANTLR end "rule__CrudService__StructureAssignment_1"


    // $ANTLR start "rule__CrudService__ServicesAssignment_3"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3941:1: rule__CrudService__ServicesAssignment_3 : ( ruleCrudTypes ) ;
    public final void rule__CrudService__ServicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3945:1: ( ( ruleCrudTypes ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3946:1: ( ruleCrudTypes )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3946:1: ( ruleCrudTypes )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3947:1: ruleCrudTypes
            {
             before(grammarAccess.getCrudServiceAccess().getServicesCrudTypesEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCrudTypes_in_rule__CrudService__ServicesAssignment_38086);
            ruleCrudTypes();

            state._fsp--;

             after(grammarAccess.getCrudServiceAccess().getServicesCrudTypesEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__CrudService__ServicesAssignment_3"


    // $ANTLR start "rule__StructureDefinition__NameAssignment_1"
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3957:1: rule__StructureDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StructureDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3961:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3962:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3962:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3963:1: RULE_ID
            {
             before(grammarAccess.getStructureDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StructureDefinition__NameAssignment_18118); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3972:1: rule__StructureDefinition__PersistentAssignment_2 : ( ( 'persistent' ) ) ;
    public final void rule__StructureDefinition__PersistentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3976:1: ( ( ( 'persistent' ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3977:1: ( ( 'persistent' ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3977:1: ( ( 'persistent' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3978:1: ( 'persistent' )
            {
             before(grammarAccess.getStructureDefinitionAccess().getPersistentPersistentKeyword_2_0()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3979:1: ( 'persistent' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3980:1: 'persistent'
            {
             before(grammarAccess.getStructureDefinitionAccess().getPersistentPersistentKeyword_2_0()); 
            match(input,54,FOLLOW_54_in_rule__StructureDefinition__PersistentAssignment_28154); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3995:1: rule__StructureDefinition__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__StructureDefinition__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:3999:1: ( ( ruleFeature ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4000:1: ( ruleFeature )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4000:1: ( ruleFeature )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4001:1: ruleFeature
            {
             before(grammarAccess.getStructureDefinitionAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__StructureDefinition__FeaturesAssignment_48193);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4010:1: rule__Feature__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4014:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4015:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4015:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4016:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_08224); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4025:1: rule__Feature__OptionalAssignment_1 : ( ( 'optional' ) ) ;
    public final void rule__Feature__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4029:1: ( ( ( 'optional' ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4030:1: ( ( 'optional' ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4030:1: ( ( 'optional' ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4031:1: ( 'optional' )
            {
             before(grammarAccess.getFeatureAccess().getOptionalOptionalKeyword_1_0()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4032:1: ( 'optional' )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4033:1: 'optional'
            {
             before(grammarAccess.getFeatureAccess().getOptionalOptionalKeyword_1_0()); 
            match(input,55,FOLLOW_55_in_rule__Feature__OptionalAssignment_18260); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4048:1: rule__Feature__TypeAssignment_3 : ( ruleTypeLiteral ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4052:1: ( ( ruleTypeLiteral ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4053:1: ( ruleTypeLiteral )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4053:1: ( ruleTypeLiteral )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4054:1: ruleTypeLiteral
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTypeLiteral_in_rule__Feature__TypeAssignment_38299);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4063:1: rule__EnumerationDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumerationDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4067:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4068:1: ( RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4068:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4069:1: RULE_ID
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumerationDefinition__NameAssignment_18330); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4078:1: rule__EnumerationDefinition__LiteralsAssignment_3 : ( ruleEnumerationLiteral ) ;
    public final void rule__EnumerationDefinition__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4082:1: ( ( ruleEnumerationLiteral ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4083:1: ( ruleEnumerationLiteral )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4083:1: ( ruleEnumerationLiteral )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4084:1: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationDefinitionAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_rule__EnumerationDefinition__LiteralsAssignment_38361);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4093:1: rule__EnumerationLiteral__NameAssignment_0 : ( ruleEnumerationName ) ;
    public final void rule__EnumerationLiteral__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4097:1: ( ( ruleEnumerationName ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4098:1: ( ruleEnumerationName )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4098:1: ( ruleEnumerationName )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4099:1: ruleEnumerationName
            {
             before(grammarAccess.getEnumerationLiteralAccess().getNameEnumerationNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEnumerationName_in_rule__EnumerationLiteral__NameAssignment_08392);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4108:1: rule__EnumerationLiteral__DisplayNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EnumerationLiteral__DisplayNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4112:1: ( ( RULE_STRING ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4113:1: ( RULE_STRING )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4113:1: ( RULE_STRING )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4114:1: RULE_STRING
            {
             before(grammarAccess.getEnumerationLiteralAccess().getDisplayNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumerationLiteral__DisplayNameAssignment_28423); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4123:1: rule__BuiltinTypeLiteral__BuiltinAssignment : ( ruleBuiltinTypes ) ;
    public final void rule__BuiltinTypeLiteral__BuiltinAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4127:1: ( ( ruleBuiltinTypes ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4128:1: ( ruleBuiltinTypes )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4128:1: ( ruleBuiltinTypes )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4129:1: ruleBuiltinTypes
            {
             before(grammarAccess.getBuiltinTypeLiteralAccess().getBuiltinBuiltinTypesEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleBuiltinTypes_in_rule__BuiltinTypeLiteral__BuiltinAssignment8454);
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4138:1: rule__DefinedTypeLiteral__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DefinedTypeLiteral__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4142:1: ( ( ( RULE_ID ) ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4143:1: ( ( RULE_ID ) )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4143:1: ( ( RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4144:1: ( RULE_ID )
            {
             before(grammarAccess.getDefinedTypeLiteralAccess().getTypeDefinedTypeCrossReference_0()); 
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4145:1: ( RULE_ID )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4146:1: RULE_ID
            {
             before(grammarAccess.getDefinedTypeLiteralAccess().getTypeDefinedTypeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefinedTypeLiteral__TypeAssignment8489); 
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
    // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4157:1: rule__ListTypeLiteral__ItemTypeAssignment_1 : ( ruleTypeLiteral ) ;
    public final void rule__ListTypeLiteral__ItemTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4161:1: ( ( ruleTypeLiteral ) )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4162:1: ( ruleTypeLiteral )
            {
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4162:1: ( ruleTypeLiteral )
            // ../nl.dslmeinte.simscript.backend.ui/src-gen/nl/dslmeinte/simscript/backend/ui/contentassist/antlr/internal/InternalSimBackendDsl.g:4163:1: ruleTypeLiteral
            {
             before(grammarAccess.getListTypeLiteralAccess().getItemTypeTypeLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTypeLiteral_in_rule__ListTypeLiteral__ItemTypeAssignment_18524);
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


 

    public static final BitSet FOLLOW_ruleBackendModel_in_entryRuleBackendModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackendModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group__0_in_ruleBackendModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthenticationDeclaration_in_entryRuleAuthenticationDeclaration121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthenticationDeclaration128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__0_in_ruleAuthenticationDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthenticationParameter_in_entryRuleAuthenticationParameter181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthenticationParameter188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationParameter__Group__0_in_ruleAuthenticationParameter214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Alternatives_in_ruleService274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedService_in_entryRuleNamedService301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedService308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedService__Alternatives_in_ruleNamedService334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0_in_ruleInterface394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLegacyServlet_in_entryRuleLegacyServlet421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLegacyServlet428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LegacyServlet__Group__0_in_ruleLegacyServlet454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrudService_in_entryRuleCrudService541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrudService548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CrudService__Group__0_in_ruleCrudService574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinedType_in_entryRuleDefinedType603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinedType610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinedType__Alternatives_in_ruleDefinedType636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureDefinition_in_entryRuleStructureDefinition663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureDefinition670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__0_in_ruleStructureDefinition696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationDefinition790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__0_in_ruleEnumerationDefinition816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0_in_ruleEnumerationLiteral876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationName_in_entryRuleEnumerationName903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationName910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationName__Alternatives_in_ruleEnumerationName936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_entryRuleTypeLiteral963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteral970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeLiteral__Alternatives_in_ruleTypeLiteral996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypeLiteral_in_entryRuleBuiltinTypeLiteral1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinTypeLiteral1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltinTypeLiteral__BuiltinAssignment_in_ruleBuiltinTypeLiteral1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinedTypeLiteral_in_entryRuleDefinedTypeLiteral1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinedTypeLiteral1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinedTypeLiteral__TypeAssignment_in_ruleDefinedTypeLiteral1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListTypeLiteral_in_entryRuleListTypeLiteral1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListTypeLiteral1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListTypeLiteral__Group__0_in_ruleListTypeLiteral1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntheticTypeLiteral_in_entryRuleSyntheticTypeLiteral1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntheticTypeLiteral1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Alternatives_in_ruleSyntheticTypeLiteral1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flavors__Alternatives_in_ruleFlavors1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethods__Alternatives_in_ruleHttpMethods1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CrudTypes__Alternatives_in_ruleCrudTypes1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BuiltinTypes__Alternatives_in_ruleBuiltinTypes1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedService_in_rule__Service__Alternatives1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrudService_in_rule__Service__Alternatives1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__NamedService__Alternatives1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLegacyServlet_in_rule__NamedService__Alternatives1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureDefinition_in_rule__DefinedType__Alternatives1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_rule__DefinedType__Alternatives1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationName__Alternatives1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumerationName__Alternatives1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumerationName__Alternatives1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypeLiteral_in_rule__TypeLiteral__Alternatives1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinedTypeLiteral_in_rule__TypeLiteral__Alternatives1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListTypeLiteral_in_rule__TypeLiteral__Alternatives1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntheticTypeLiteral_in_rule__TypeLiteral__Alternatives1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_0__0_in_rule__SyntheticTypeLiteral__Alternatives1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_1__0_in_rule__SyntheticTypeLiteral__Alternatives1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_2__0_in_rule__SyntheticTypeLiteral__Alternatives1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Flavors__Alternatives1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Flavors__Alternatives1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__HttpMethods__Alternatives1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__HttpMethods__Alternatives1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CrudTypes__Alternatives1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CrudTypes__Alternatives1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CrudTypes__Alternatives1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CrudTypes__Alternatives1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BuiltinTypes__Alternatives1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BuiltinTypes__Alternatives2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BuiltinTypes__Alternatives2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BuiltinTypes__Alternatives2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BuiltinTypes__Alternatives2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BuiltinTypes__Alternatives2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BuiltinTypes__Alternatives2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BuiltinTypes__Alternatives2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BuiltinTypes__Alternatives2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BuiltinTypes__Alternatives2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group__0__Impl_in_rule__BackendModel__Group__02217 = new BitSet(new long[]{0x0000291C40000000L});
    public static final BitSet FOLLOW_rule__BackendModel__Group__1_in_rule__BackendModel__Group__02220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group__1__Impl_in_rule__BackendModel__Group__12278 = new BitSet(new long[]{0x0000291C40000000L});
    public static final BitSet FOLLOW_rule__BackendModel__Group__2_in_rule__BackendModel__Group__12281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__UnorderedGroup_1_in_rule__BackendModel__Group__1__Impl2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group__2__Impl_in_rule__BackendModel__Group__22339 = new BitSet(new long[]{0x0000291C40000000L});
    public static final BitSet FOLLOW_rule__BackendModel__Group__3_in_rule__BackendModel__Group__22342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__AuthOptsAssignment_2_in_rule__BackendModel__Group__2__Impl2369 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group__3__Impl_in_rule__BackendModel__Group__32400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__DeclarationsAssignment_3_in_rule__BackendModel__Group__3__Impl2427 = new BitSet(new long[]{0x0000290000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_0__0__Impl_in_rule__BackendModel__Group_1_0__02466 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_0__1_in_rule__BackendModel__Group_1_0__02469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BackendModel__Group_1_0__0__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_0__1__Impl_in_rule__BackendModel__Group_1_0__12528 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_0__2_in_rule__BackendModel__Group_1_0__12531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__BackendModel__Group_1_0__1__Impl2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_0__2__Impl_in_rule__BackendModel__Group_1_0__22590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_0_2__0_in_rule__BackendModel__Group_1_0__2__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_0_2__0__Impl_in_rule__BackendModel__Group_1_0_2__02654 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_0_2__1_in_rule__BackendModel__Group_1_0_2__02657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__BackendModel__Group_1_0_2__0__Impl2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_0_2__1__Impl_in_rule__BackendModel__Group_1_0_2__12716 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_0_2__2_in_rule__BackendModel__Group_1_0_2__12719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BackendModel__Group_1_0_2__1__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_0_2__2__Impl_in_rule__BackendModel__Group_1_0_2__22778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__BaseUrlAssignment_1_0_2_2_in_rule__BackendModel__Group_1_0_2__2__Impl2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_1__0__Impl_in_rule__BackendModel__Group_1_1__02841 = new BitSet(new long[]{0x0000000C40000000L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_1__1_in_rule__BackendModel__Group_1_1__02844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_1_0__0_in_rule__BackendModel__Group_1_1__0__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_1__1__Impl_in_rule__BackendModel__Group_1_1__12902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__BackendModel__Group_1_1__1__Impl2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_1_0__0__Impl_in_rule__BackendModel__Group_1_1_0__02965 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_1_0__1_in_rule__BackendModel__Group_1_1_0__02968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BackendModel__Group_1_1_0__0__Impl2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_1_0__1__Impl_in_rule__BackendModel__Group_1_1_0__13027 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_1_0__2_in_rule__BackendModel__Group_1_1_0__13030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BackendModel__Group_1_1_0__1__Impl3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_1_0__2__Impl_in_rule__BackendModel__Group_1_1_0__23089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__FlavorAssignment_1_1_0_2_in_rule__BackendModel__Group_1_1_0__2__Impl3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__0__Impl_in_rule__AuthenticationDeclaration__Group__03152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__1_in_rule__AuthenticationDeclaration__Group__03155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AuthenticationDeclaration__Group__0__Impl3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__1__Impl_in_rule__AuthenticationDeclaration__Group__13214 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__2_in_rule__AuthenticationDeclaration__Group__13217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__NameAssignment_1_in_rule__AuthenticationDeclaration__Group__1__Impl3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__2__Impl_in_rule__AuthenticationDeclaration__Group__23274 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__3_in_rule__AuthenticationDeclaration__Group__23277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AuthenticationDeclaration__Group__2__Impl3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__3__Impl_in_rule__AuthenticationDeclaration__Group__33336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__4_in_rule__AuthenticationDeclaration__Group__33339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__AuthenticationDeclaration__Group__3__Impl3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__4__Impl_in_rule__AuthenticationDeclaration__Group__43398 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__5_in_rule__AuthenticationDeclaration__Group__43401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__PrincipalAssignment_4_in_rule__AuthenticationDeclaration__Group__4__Impl3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__5__Impl_in_rule__AuthenticationDeclaration__Group__53458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__6_in_rule__AuthenticationDeclaration__Group__53461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__AuthenticationDeclaration__Group__5__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__6__Impl_in_rule__AuthenticationDeclaration__Group__63520 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__7_in_rule__AuthenticationDeclaration__Group__63523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__CredentialAssignment_6_in_rule__AuthenticationDeclaration__Group__6__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationDeclaration__Group__7__Impl_in_rule__AuthenticationDeclaration__Group__73580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__AuthenticationDeclaration__Group__7__Impl3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationParameter__Group__0__Impl_in_rule__AuthenticationParameter__Group__03655 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__AuthenticationParameter__Group__1_in_rule__AuthenticationParameter__Group__03658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationParameter__NameAssignment_0_in_rule__AuthenticationParameter__Group__0__Impl3685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationParameter__Group__1__Impl_in_rule__AuthenticationParameter__Group__13715 = new BitSet(new long[]{0x001D00003FF00010L});
    public static final BitSet FOLLOW_rule__AuthenticationParameter__Group__2_in_rule__AuthenticationParameter__Group__13718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__AuthenticationParameter__Group__1__Impl3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationParameter__Group__2__Impl_in_rule__AuthenticationParameter__Group__23777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthenticationParameter__TypeAssignment_2_in_rule__AuthenticationParameter__Group__2__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__03840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__03843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Interface__Group__0__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__13902 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__13905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__23962 = new BitSet(new long[]{0x0020060000000030L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__23965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__MethodAssignment_2_in_rule__Interface__Group__2__Impl3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__34022 = new BitSet(new long[]{0x0020060000000030L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__34025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__InputTypeAssignment_3_in_rule__Interface__Group__3__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__44083 = new BitSet(new long[]{0x0020060000000030L});
    public static final BitSet FOLLOW_rule__Interface__Group__5_in_rule__Interface__Group__44086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__0_in_rule__Interface__Group__4__Impl4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__5__Impl_in_rule__Interface__Group__54144 = new BitSet(new long[]{0x0020060000000030L});
    public static final BitSet FOLLOW_rule__Interface__Group__6_in_rule__Interface__Group__54147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NotAuthenticatedAssignment_5_in_rule__Interface__Group__5__Impl4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__6__Impl_in_rule__Interface__Group__64205 = new BitSet(new long[]{0x0020060000000030L});
    public static final BitSet FOLLOW_rule__Interface__Group__7_in_rule__Interface__Group__64208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__0_in_rule__Interface__Group__6__Impl4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__7__Impl_in_rule__Interface__Group__74266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__DocumentationAssignment_7_in_rule__Interface__Group__7__Impl4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__0__Impl_in_rule__Interface__Group_4__04340 = new BitSet(new long[]{0x001D00003FF00010L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__1_in_rule__Interface__Group_4__04343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Interface__Group_4__0__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_4__1__Impl_in_rule__Interface__Group_4__14402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__OutputTypeAssignment_4_1_in_rule__Interface__Group_4__1__Impl4429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__0__Impl_in_rule__Interface__Group_6__04463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__1_in_rule__Interface__Group_6__04466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Interface__Group_6__0__Impl4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group_6__1__Impl_in_rule__Interface__Group_6__14525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__LegacyServletAssignment_6_1_in_rule__Interface__Group_6__1__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LegacyServlet__Group__0__Impl_in_rule__LegacyServlet__Group__04586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LegacyServlet__Group__1_in_rule__LegacyServlet__Group__04589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__LegacyServlet__Group__0__Impl4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LegacyServlet__Group__1__Impl_in_rule__LegacyServlet__Group__14648 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__LegacyServlet__Group__2_in_rule__LegacyServlet__Group__14651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LegacyServlet__NameAssignment_1_in_rule__LegacyServlet__Group__1__Impl4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LegacyServlet__Group__2__Impl_in_rule__LegacyServlet__Group__24708 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__LegacyServlet__Group__3_in_rule__LegacyServlet__Group__24711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__LegacyServlet__Group__2__Impl4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LegacyServlet__Group__3__Impl_in_rule__LegacyServlet__Group__34770 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__LegacyServlet__Group__4_in_rule__LegacyServlet__Group__34773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LegacyServlet__UrlPatternAssignment_3_in_rule__LegacyServlet__Group__3__Impl4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LegacyServlet__Group__4__Impl_in_rule__LegacyServlet__Group__44830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LegacyServlet__Group__5_in_rule__LegacyServlet__Group__44833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__LegacyServlet__Group__4__Impl4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LegacyServlet__Group__5__Impl_in_rule__LegacyServlet__Group__54892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LegacyServlet__FqClassNameAssignment_5_in_rule__LegacyServlet__Group__5__Impl4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04961 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__15020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl5047 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__05082 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__05085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__QualifiedName__Group_1__0__Impl5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__15144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CrudService__Group__0__Impl_in_rule__CrudService__Group__05204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CrudService__Group__1_in_rule__CrudService__Group__05207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__CrudService__Group__0__Impl5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CrudService__Group__1__Impl_in_rule__CrudService__Group__15266 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__CrudService__Group__2_in_rule__CrudService__Group__15269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CrudService__StructureAssignment_1_in_rule__CrudService__Group__1__Impl5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CrudService__Group__2__Impl_in_rule__CrudService__Group__25326 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_rule__CrudService__Group__3_in_rule__CrudService__Group__25329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__CrudService__Group__2__Impl5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CrudService__Group__3__Impl_in_rule__CrudService__Group__35388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CrudService__ServicesAssignment_3_in_rule__CrudService__Group__3__Impl5415 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__0__Impl_in_rule__StructureDefinition__Group__05454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__1_in_rule__StructureDefinition__Group__05457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__StructureDefinition__Group__0__Impl5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__1__Impl_in_rule__StructureDefinition__Group__15516 = new BitSet(new long[]{0x0040000080000000L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__2_in_rule__StructureDefinition__Group__15519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__NameAssignment_1_in_rule__StructureDefinition__Group__1__Impl5546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__2__Impl_in_rule__StructureDefinition__Group__25576 = new BitSet(new long[]{0x0040000080000000L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__3_in_rule__StructureDefinition__Group__25579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__PersistentAssignment_2_in_rule__StructureDefinition__Group__2__Impl5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__3__Impl_in_rule__StructureDefinition__Group__35637 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__4_in_rule__StructureDefinition__Group__35640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__StructureDefinition__Group__3__Impl5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__4__Impl_in_rule__StructureDefinition__Group__45699 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__5_in_rule__StructureDefinition__Group__45702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureDefinition__FeaturesAssignment_4_in_rule__StructureDefinition__Group__4__Impl5729 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__StructureDefinition__Group__5__Impl_in_rule__StructureDefinition__Group__55760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__StructureDefinition__Group__5__Impl5788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__05831 = new BitSet(new long[]{0x0080008000000000L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__05834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_0_in_rule__Feature__Group__0__Impl5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__15891 = new BitSet(new long[]{0x0080008000000000L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__15894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__OptionalAssignment_1_in_rule__Feature__Group__1__Impl5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__25952 = new BitSet(new long[]{0x001D00003FF00010L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__25955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Feature__Group__2__Impl5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__36014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__0__Impl_in_rule__EnumerationDefinition__Group__06079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__1_in_rule__EnumerationDefinition__Group__06082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__EnumerationDefinition__Group__0__Impl6110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__1__Impl_in_rule__EnumerationDefinition__Group__16141 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__2_in_rule__EnumerationDefinition__Group__16144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__NameAssignment_1_in_rule__EnumerationDefinition__Group__1__Impl6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__2__Impl_in_rule__EnumerationDefinition__Group__26201 = new BitSet(new long[]{0x0000000400000070L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__3_in_rule__EnumerationDefinition__Group__26204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__EnumerationDefinition__Group__2__Impl6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__3__Impl_in_rule__EnumerationDefinition__Group__36263 = new BitSet(new long[]{0x0000000400000070L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__4_in_rule__EnumerationDefinition__Group__36266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__LiteralsAssignment_3_in_rule__EnumerationDefinition__Group__3__Impl6293 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_rule__EnumerationDefinition__Group__4__Impl_in_rule__EnumerationDefinition__Group__46324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EnumerationDefinition__Group__4__Impl6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__0__Impl_in_rule__EnumerationLiteral__Group__06393 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1_in_rule__EnumerationLiteral__Group__06396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__NameAssignment_0_in_rule__EnumerationLiteral__Group__0__Impl6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__1__Impl_in_rule__EnumerationLiteral__Group__16453 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2_in_rule__EnumerationLiteral__Group__16456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EnumerationLiteral__Group__1__Impl6484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__Group__2__Impl_in_rule__EnumerationLiteral__Group__26515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumerationLiteral__DisplayNameAssignment_2_in_rule__EnumerationLiteral__Group__2__Impl6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListTypeLiteral__Group__0__Impl_in_rule__ListTypeLiteral__Group__06578 = new BitSet(new long[]{0x001D00003FF00010L});
    public static final BitSet FOLLOW_rule__ListTypeLiteral__Group__1_in_rule__ListTypeLiteral__Group__06581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ListTypeLiteral__Group__0__Impl6609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListTypeLiteral__Group__1__Impl_in_rule__ListTypeLiteral__Group__16640 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__ListTypeLiteral__Group__2_in_rule__ListTypeLiteral__Group__16643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListTypeLiteral__ItemTypeAssignment_1_in_rule__ListTypeLiteral__Group__1__Impl6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListTypeLiteral__Group__2__Impl_in_rule__ListTypeLiteral__Group__26700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ListTypeLiteral__Group__2__Impl6728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_0__0__Impl_in_rule__SyntheticTypeLiteral__Group_0__06765 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_0__1_in_rule__SyntheticTypeLiteral__Group_0__06768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_0__1__Impl_in_rule__SyntheticTypeLiteral__Group_0__16826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__SyntheticTypeLiteral__Group_0__1__Impl6854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_1__0__Impl_in_rule__SyntheticTypeLiteral__Group_1__06889 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_1__1_in_rule__SyntheticTypeLiteral__Group_1__06892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_1__1__Impl_in_rule__SyntheticTypeLiteral__Group_1__16950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__SyntheticTypeLiteral__Group_1__1__Impl6978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_2__0__Impl_in_rule__SyntheticTypeLiteral__Group_2__07013 = new BitSet(new long[]{0x001D00003FF00010L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_2__1_in_rule__SyntheticTypeLiteral__Group_2__07016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntheticTypeLiteral__Group_2__1__Impl_in_rule__SyntheticTypeLiteral__Group_2__17074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__SyntheticTypeLiteral__Group_2__1__Impl7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__UnorderedGroup_1__0_in_rule__BackendModel__UnorderedGroup_17138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_0__0_in_rule__BackendModel__UnorderedGroup_1__Impl7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__Group_1_1__0_in_rule__BackendModel__UnorderedGroup_1__Impl7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__UnorderedGroup_1__Impl_in_rule__BackendModel__UnorderedGroup_1__07377 = new BitSet(new long[]{0x0000000C40000002L});
    public static final BitSet FOLLOW_rule__BackendModel__UnorderedGroup_1__1_in_rule__BackendModel__UnorderedGroup_1__07380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BackendModel__UnorderedGroup_1__Impl_in_rule__BackendModel__UnorderedGroup_1__17405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BackendModel__BaseUrlAssignment_1_0_2_27437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlavors_in_rule__BackendModel__FlavorAssignment_1_1_0_27468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthenticationDeclaration_in_rule__BackendModel__AuthOptsAssignment_27499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__BackendModel__DeclarationsAssignment_37530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AuthenticationDeclaration__NameAssignment_17561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthenticationParameter_in_rule__AuthenticationDeclaration__PrincipalAssignment_47592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthenticationParameter_in_rule__AuthenticationDeclaration__CredentialAssignment_67623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AuthenticationParameter__NameAssignment_07654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_rule__AuthenticationParameter__TypeAssignment_27685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_17716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethods_in_rule__Interface__MethodAssignment_27747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinedTypeLiteral_in_rule__Interface__InputTypeAssignment_37778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_rule__Interface__OutputTypeAssignment_4_17809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Interface__NotAuthenticatedAssignment_57845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__LegacyServletAssignment_6_17888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Interface__DocumentationAssignment_77923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LegacyServlet__NameAssignment_17954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_in_rule__LegacyServlet__UrlPatternAssignment_37985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__LegacyServlet__FqClassNameAssignment_58016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CrudService__StructureAssignment_18051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrudTypes_in_rule__CrudService__ServicesAssignment_38086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StructureDefinition__NameAssignment_18118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__StructureDefinition__PersistentAssignment_28154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__StructureDefinition__FeaturesAssignment_48193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_08224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Feature__OptionalAssignment_18260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_rule__Feature__TypeAssignment_38299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumerationDefinition__NameAssignment_18330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_rule__EnumerationDefinition__LiteralsAssignment_38361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationName_in_rule__EnumerationLiteral__NameAssignment_08392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumerationLiteral__DisplayNameAssignment_28423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypes_in_rule__BuiltinTypeLiteral__BuiltinAssignment8454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefinedTypeLiteral__TypeAssignment8489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_rule__ListTypeLiteral__ItemTypeAssignment_18524 = new BitSet(new long[]{0x0000000000000002L});

}

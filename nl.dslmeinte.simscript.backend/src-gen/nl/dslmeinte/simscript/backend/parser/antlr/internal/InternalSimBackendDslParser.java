package nl.dslmeinte.simscript.backend.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.dslmeinte.simscript.backend.services.SimBackendDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimBackendDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_URL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'config'", "'{'", "'baseURL'", "'='", "'flavor'", "'}'", "'authentication-option'", "'principal'", "'credentials'", "':'", "'interface'", "'->'", "'not-authenticated'", "'implemented-by'", "'legacy-servlet'", "'.'", "'crud-service'", "'structure'", "'persistent'", "'optional'", "'enumeration'", "'['", "']'", "'Callback'", "'Error'", "'$Void'", "'Java'", "'PHP'", "'GET'", "'POST'", "'create'", "'get-by-id'", "'update'", "'delete'", "'String'", "'Boolean'", "'Integer'", "'URL'", "'Text'", "'Number'", "'Email'", "'Phone'", "'Date'", "'Password'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_INT=7;
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
    public static final int RULE_URL=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g"; }



     	private SimBackendDslGrammarAccess grammarAccess;
     	
        public InternalSimBackendDslParser(TokenStream input, SimBackendDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BackendModel";	
       	}
       	
       	@Override
       	protected SimBackendDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBackendModel"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:68:1: entryRuleBackendModel returns [EObject current=null] : iv_ruleBackendModel= ruleBackendModel EOF ;
    public final EObject entryRuleBackendModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackendModel = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:69:2: (iv_ruleBackendModel= ruleBackendModel EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:70:2: iv_ruleBackendModel= ruleBackendModel EOF
            {
             newCompositeNode(grammarAccess.getBackendModelRule()); 
            pushFollow(FOLLOW_ruleBackendModel_in_entryRuleBackendModel75);
            iv_ruleBackendModel=ruleBackendModel();

            state._fsp--;

             current =iv_ruleBackendModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBackendModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackendModel"


    // $ANTLR start "ruleBackendModel"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:77:1: ruleBackendModel returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) )? ( (lv_authOpts_11_0= ruleAuthenticationDeclaration ) )* ( (lv_declarations_12_0= ruleService ) )* ) ;
    public final EObject ruleBackendModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_baseUrl_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_flavor_9_0 = null;

        EObject lv_authOpts_11_0 = null;

        EObject lv_declarations_12_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:80:28: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) )? ( (lv_authOpts_11_0= ruleAuthenticationDeclaration ) )* ( (lv_declarations_12_0= ruleService ) )* ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:81:1: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) )? ( (lv_authOpts_11_0= ruleAuthenticationDeclaration ) )* ( (lv_declarations_12_0= ruleService ) )* )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:81:1: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) )? ( (lv_authOpts_11_0= ruleAuthenticationDeclaration ) )* ( (lv_declarations_12_0= ruleService ) )* )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:81:2: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) )? ( (lv_authOpts_11_0= ruleAuthenticationDeclaration ) )* ( (lv_declarations_12_0= ruleService ) )*
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:81:2: ()
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBackendModelAccess().getBackendModelAction_0(),
                        current);
                

            }

            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:87:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12||(LA4_0>=16 && LA4_0<=17)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:89:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:89:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:90:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) ) ) )+ {...}?)
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getBackendModelAccess().getUnorderedGroup_1());
                    	
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:93:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) ) ) )+ {...}?)
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:94:3: ( ({...}? => ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) ) ) )+ {...}?
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:94:3: ( ({...}? => ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) ) ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( LA3_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 0) ) {
                            alt3=1;
                        }
                        else if ( LA3_0 >=16 && LA3_0<=17 && getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 1) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:96:4: ({...}? => ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) ) )
                    	    {
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:96:4: ({...}? => ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) ) )
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:97:5: {...}? => ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleBackendModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 0)");
                    	    }
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:97:109: ( ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) ) )
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:98:6: ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 0);
                    	    	 				
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:101:6: ({...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? ) )
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:101:7: {...}? => (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleBackendModel", "true");
                    	    }
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:101:16: (otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )? )
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:101:18: otherlv_2= 'config' otherlv_3= '{' (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )?
                    	    {
                    	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBackendModel177); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getBackendModelAccess().getConfigKeyword_1_0_0());
                    	        
                    	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleBackendModel189); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getBackendModelAccess().getLeftCurlyBracketKeyword_1_0_1());
                    	        
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:109:1: (otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) ) )?
                    	    int alt1=2;
                    	    int LA1_0 = input.LA(1);

                    	    if ( (LA1_0==14) ) {
                    	        alt1=1;
                    	    }
                    	    switch (alt1) {
                    	        case 1 :
                    	            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:109:3: otherlv_4= 'baseURL' otherlv_5= '=' ( (lv_baseUrl_6_0= RULE_STRING ) )
                    	            {
                    	            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleBackendModel202); 

                    	                	newLeafNode(otherlv_4, grammarAccess.getBackendModelAccess().getBaseURLKeyword_1_0_2_0());
                    	                
                    	            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleBackendModel214); 

                    	                	newLeafNode(otherlv_5, grammarAccess.getBackendModelAccess().getEqualsSignKeyword_1_0_2_1());
                    	                
                    	            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:117:1: ( (lv_baseUrl_6_0= RULE_STRING ) )
                    	            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:118:1: (lv_baseUrl_6_0= RULE_STRING )
                    	            {
                    	            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:118:1: (lv_baseUrl_6_0= RULE_STRING )
                    	            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:119:3: lv_baseUrl_6_0= RULE_STRING
                    	            {
                    	            lv_baseUrl_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBackendModel231); 

                    	            			newLeafNode(lv_baseUrl_6_0, grammarAccess.getBackendModelAccess().getBaseUrlSTRINGTerminalRuleCall_1_0_2_2_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getBackendModelRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"baseUrl",
                    	                    		lv_baseUrl_6_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBackendModelAccess().getUnorderedGroup_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:142:4: ({...}? => ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) ) )
                    	    {
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:142:4: ({...}? => ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) ) )
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:143:5: {...}? => ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleBackendModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 1)");
                    	    }
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:143:109: ( ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) ) )
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:144:6: ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBackendModelAccess().getUnorderedGroup_1(), 1);
                    	    	 				
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:147:6: ({...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' ) )
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:147:7: {...}? => ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleBackendModel", "true");
                    	    }
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:147:16: ( (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}' )
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:147:17: (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )? otherlv_10= '}'
                    	    {
                    	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:147:17: (otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) ) )?
                    	    int alt2=2;
                    	    int LA2_0 = input.LA(1);

                    	    if ( (LA2_0==16) ) {
                    	        alt2=1;
                    	    }
                    	    switch (alt2) {
                    	        case 1 :
                    	            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:147:19: otherlv_7= 'flavor' otherlv_8= '=' ( (lv_flavor_9_0= ruleFlavors ) )
                    	            {
                    	            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleBackendModel307); 

                    	                	newLeafNode(otherlv_7, grammarAccess.getBackendModelAccess().getFlavorKeyword_1_1_0_0());
                    	                
                    	            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleBackendModel319); 

                    	                	newLeafNode(otherlv_8, grammarAccess.getBackendModelAccess().getEqualsSignKeyword_1_1_0_1());
                    	                
                    	            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:155:1: ( (lv_flavor_9_0= ruleFlavors ) )
                    	            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:156:1: (lv_flavor_9_0= ruleFlavors )
                    	            {
                    	            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:156:1: (lv_flavor_9_0= ruleFlavors )
                    	            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:157:3: lv_flavor_9_0= ruleFlavors
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getBackendModelAccess().getFlavorFlavorsEnumRuleCall_1_1_0_2_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleFlavors_in_ruleBackendModel340);
                    	            lv_flavor_9_0=ruleFlavors();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getBackendModelRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"flavor",
                    	                    		lv_flavor_9_0, 
                    	                    		"Flavors");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleBackendModel354); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getBackendModelAccess().getRightCurlyBracketKeyword_1_1_1());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBackendModelAccess().getUnorderedGroup_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBackendModelAccess().getUnorderedGroup_1()) ) {
                        throw new FailedPredicateException(input, "ruleBackendModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getBackendModelAccess().getUnorderedGroup_1())");
                    }

                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getBackendModelAccess().getUnorderedGroup_1());
                    	

                    }
                    break;

            }

            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:192:3: ( (lv_authOpts_11_0= ruleAuthenticationDeclaration ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:193:1: (lv_authOpts_11_0= ruleAuthenticationDeclaration )
            	    {
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:193:1: (lv_authOpts_11_0= ruleAuthenticationDeclaration )
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:194:3: lv_authOpts_11_0= ruleAuthenticationDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBackendModelAccess().getAuthOptsAuthenticationDeclarationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAuthenticationDeclaration_in_ruleBackendModel423);
            	    lv_authOpts_11_0=ruleAuthenticationDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBackendModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"authOpts",
            	            		lv_authOpts_11_0, 
            	            		"AuthenticationDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:210:3: ( (lv_declarations_12_0= ruleService ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22||LA6_0==26||LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:211:1: (lv_declarations_12_0= ruleService )
            	    {
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:211:1: (lv_declarations_12_0= ruleService )
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:212:3: lv_declarations_12_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBackendModelAccess().getDeclarationsServiceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleBackendModel445);
            	    lv_declarations_12_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBackendModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_12_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackendModel"


    // $ANTLR start "entryRuleAuthenticationDeclaration"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:236:1: entryRuleAuthenticationDeclaration returns [EObject current=null] : iv_ruleAuthenticationDeclaration= ruleAuthenticationDeclaration EOF ;
    public final EObject entryRuleAuthenticationDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthenticationDeclaration = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:237:2: (iv_ruleAuthenticationDeclaration= ruleAuthenticationDeclaration EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:238:2: iv_ruleAuthenticationDeclaration= ruleAuthenticationDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAuthenticationDeclarationRule()); 
            pushFollow(FOLLOW_ruleAuthenticationDeclaration_in_entryRuleAuthenticationDeclaration482);
            iv_ruleAuthenticationDeclaration=ruleAuthenticationDeclaration();

            state._fsp--;

             current =iv_ruleAuthenticationDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthenticationDeclaration492); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuthenticationDeclaration"


    // $ANTLR start "ruleAuthenticationDeclaration"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:245:1: ruleAuthenticationDeclaration returns [EObject current=null] : (otherlv_0= 'authentication-option' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'principal' ( (lv_principal_4_0= ruleAuthenticationParameter ) ) otherlv_5= 'credentials' ( (lv_credential_6_0= ruleAuthenticationParameter ) ) otherlv_7= '}' ) ;
    public final EObject ruleAuthenticationDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_principal_4_0 = null;

        EObject lv_credential_6_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:248:28: ( (otherlv_0= 'authentication-option' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'principal' ( (lv_principal_4_0= ruleAuthenticationParameter ) ) otherlv_5= 'credentials' ( (lv_credential_6_0= ruleAuthenticationParameter ) ) otherlv_7= '}' ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:249:1: (otherlv_0= 'authentication-option' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'principal' ( (lv_principal_4_0= ruleAuthenticationParameter ) ) otherlv_5= 'credentials' ( (lv_credential_6_0= ruleAuthenticationParameter ) ) otherlv_7= '}' )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:249:1: (otherlv_0= 'authentication-option' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'principal' ( (lv_principal_4_0= ruleAuthenticationParameter ) ) otherlv_5= 'credentials' ( (lv_credential_6_0= ruleAuthenticationParameter ) ) otherlv_7= '}' )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:249:3: otherlv_0= 'authentication-option' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'principal' ( (lv_principal_4_0= ruleAuthenticationParameter ) ) otherlv_5= 'credentials' ( (lv_credential_6_0= ruleAuthenticationParameter ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleAuthenticationDeclaration529); 

                	newLeafNode(otherlv_0, grammarAccess.getAuthenticationDeclarationAccess().getAuthenticationOptionKeyword_0());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:253:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:254:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:254:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:255:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAuthenticationDeclaration546); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAuthenticationDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAuthenticationDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAuthenticationDeclaration563); 

                	newLeafNode(otherlv_2, grammarAccess.getAuthenticationDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleAuthenticationDeclaration575); 

                	newLeafNode(otherlv_3, grammarAccess.getAuthenticationDeclarationAccess().getPrincipalKeyword_3());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:279:1: ( (lv_principal_4_0= ruleAuthenticationParameter ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:280:1: (lv_principal_4_0= ruleAuthenticationParameter )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:280:1: (lv_principal_4_0= ruleAuthenticationParameter )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:281:3: lv_principal_4_0= ruleAuthenticationParameter
            {
             
            	        newCompositeNode(grammarAccess.getAuthenticationDeclarationAccess().getPrincipalAuthenticationParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAuthenticationParameter_in_ruleAuthenticationDeclaration596);
            lv_principal_4_0=ruleAuthenticationParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAuthenticationDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"principal",
                    		lv_principal_4_0, 
                    		"AuthenticationParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleAuthenticationDeclaration608); 

                	newLeafNode(otherlv_5, grammarAccess.getAuthenticationDeclarationAccess().getCredentialsKeyword_5());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:301:1: ( (lv_credential_6_0= ruleAuthenticationParameter ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:302:1: (lv_credential_6_0= ruleAuthenticationParameter )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:302:1: (lv_credential_6_0= ruleAuthenticationParameter )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:303:3: lv_credential_6_0= ruleAuthenticationParameter
            {
             
            	        newCompositeNode(grammarAccess.getAuthenticationDeclarationAccess().getCredentialAuthenticationParameterParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleAuthenticationParameter_in_ruleAuthenticationDeclaration629);
            lv_credential_6_0=ruleAuthenticationParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAuthenticationDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"credential",
                    		lv_credential_6_0, 
                    		"AuthenticationParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleAuthenticationDeclaration641); 

                	newLeafNode(otherlv_7, grammarAccess.getAuthenticationDeclarationAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuthenticationDeclaration"


    // $ANTLR start "entryRuleAuthenticationParameter"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:331:1: entryRuleAuthenticationParameter returns [EObject current=null] : iv_ruleAuthenticationParameter= ruleAuthenticationParameter EOF ;
    public final EObject entryRuleAuthenticationParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthenticationParameter = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:332:2: (iv_ruleAuthenticationParameter= ruleAuthenticationParameter EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:333:2: iv_ruleAuthenticationParameter= ruleAuthenticationParameter EOF
            {
             newCompositeNode(grammarAccess.getAuthenticationParameterRule()); 
            pushFollow(FOLLOW_ruleAuthenticationParameter_in_entryRuleAuthenticationParameter677);
            iv_ruleAuthenticationParameter=ruleAuthenticationParameter();

            state._fsp--;

             current =iv_ruleAuthenticationParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthenticationParameter687); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuthenticationParameter"


    // $ANTLR start "ruleAuthenticationParameter"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:340:1: ruleAuthenticationParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeLiteral ) ) ) ;
    public final EObject ruleAuthenticationParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:343:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeLiteral ) ) ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:344:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeLiteral ) ) )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:344:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeLiteral ) ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:344:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeLiteral ) )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:344:2: ( (lv_name_0_0= RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:345:1: (lv_name_0_0= RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:345:1: (lv_name_0_0= RULE_ID )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:346:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAuthenticationParameter729); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAuthenticationParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAuthenticationParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAuthenticationParameter746); 

                	newLeafNode(otherlv_1, grammarAccess.getAuthenticationParameterAccess().getColonKeyword_1());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:366:1: ( (lv_type_2_0= ruleTypeLiteral ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:367:1: (lv_type_2_0= ruleTypeLiteral )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:367:1: (lv_type_2_0= ruleTypeLiteral )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:368:3: lv_type_2_0= ruleTypeLiteral
            {
             
            	        newCompositeNode(grammarAccess.getAuthenticationParameterAccess().getTypeTypeLiteralParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeLiteral_in_ruleAuthenticationParameter767);
            lv_type_2_0=ruleTypeLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAuthenticationParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"TypeLiteral");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuthenticationParameter"


    // $ANTLR start "entryRuleService"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:392:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:393:2: (iv_ruleService= ruleService EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:394:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService803);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService813); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:401:1: ruleService returns [EObject current=null] : (this_NamedService_0= ruleNamedService | this_CrudService_1= ruleCrudService ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        EObject this_NamedService_0 = null;

        EObject this_CrudService_1 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:404:28: ( (this_NamedService_0= ruleNamedService | this_CrudService_1= ruleCrudService ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:405:1: (this_NamedService_0= ruleNamedService | this_CrudService_1= ruleCrudService )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:405:1: (this_NamedService_0= ruleNamedService | this_CrudService_1= ruleCrudService )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22||LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:406:5: this_NamedService_0= ruleNamedService
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAccess().getNamedServiceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNamedService_in_ruleService860);
                    this_NamedService_0=ruleNamedService();

                    state._fsp--;

                     
                            current = this_NamedService_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:416:5: this_CrudService_1= ruleCrudService
                    {
                     
                            newCompositeNode(grammarAccess.getServiceAccess().getCrudServiceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCrudService_in_ruleService887);
                    this_CrudService_1=ruleCrudService();

                    state._fsp--;

                     
                            current = this_CrudService_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleNamedService"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:432:1: entryRuleNamedService returns [EObject current=null] : iv_ruleNamedService= ruleNamedService EOF ;
    public final EObject entryRuleNamedService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedService = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:433:2: (iv_ruleNamedService= ruleNamedService EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:434:2: iv_ruleNamedService= ruleNamedService EOF
            {
             newCompositeNode(grammarAccess.getNamedServiceRule()); 
            pushFollow(FOLLOW_ruleNamedService_in_entryRuleNamedService922);
            iv_ruleNamedService=ruleNamedService();

            state._fsp--;

             current =iv_ruleNamedService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedService932); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedService"


    // $ANTLR start "ruleNamedService"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:441:1: ruleNamedService returns [EObject current=null] : (this_Interface_0= ruleInterface | this_LegacyServlet_1= ruleLegacyServlet ) ;
    public final EObject ruleNamedService() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_0 = null;

        EObject this_LegacyServlet_1 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:444:28: ( (this_Interface_0= ruleInterface | this_LegacyServlet_1= ruleLegacyServlet ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:445:1: (this_Interface_0= ruleInterface | this_LegacyServlet_1= ruleLegacyServlet )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:445:1: (this_Interface_0= ruleInterface | this_LegacyServlet_1= ruleLegacyServlet )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:446:5: this_Interface_0= ruleInterface
                    {
                     
                            newCompositeNode(grammarAccess.getNamedServiceAccess().getInterfaceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInterface_in_ruleNamedService979);
                    this_Interface_0=ruleInterface();

                    state._fsp--;

                     
                            current = this_Interface_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:456:5: this_LegacyServlet_1= ruleLegacyServlet
                    {
                     
                            newCompositeNode(grammarAccess.getNamedServiceAccess().getLegacyServletParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLegacyServlet_in_ruleNamedService1006);
                    this_LegacyServlet_1=ruleLegacyServlet();

                    state._fsp--;

                     
                            current = this_LegacyServlet_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedService"


    // $ANTLR start "entryRuleInterface"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:472:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:473:2: (iv_ruleInterface= ruleInterface EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:474:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface1041);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface1051); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:481:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_method_2_0= ruleHttpMethods ) ) ( (lv_inputType_3_0= ruleDefinedTypeLiteral ) )? (otherlv_4= '->' ( (lv_outputType_5_0= ruleTypeLiteral ) ) )? ( (lv_notAuthenticated_6_0= 'not-authenticated' ) )? (otherlv_7= 'implemented-by' ( (otherlv_8= RULE_ID ) ) )? ( (lv_documentation_9_0= RULE_STRING ) )? ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        Token lv_notAuthenticated_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_documentation_9_0=null;
        Enumerator lv_method_2_0 = null;

        EObject lv_inputType_3_0 = null;

        EObject lv_outputType_5_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:484:28: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_method_2_0= ruleHttpMethods ) ) ( (lv_inputType_3_0= ruleDefinedTypeLiteral ) )? (otherlv_4= '->' ( (lv_outputType_5_0= ruleTypeLiteral ) ) )? ( (lv_notAuthenticated_6_0= 'not-authenticated' ) )? (otherlv_7= 'implemented-by' ( (otherlv_8= RULE_ID ) ) )? ( (lv_documentation_9_0= RULE_STRING ) )? ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:485:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_method_2_0= ruleHttpMethods ) ) ( (lv_inputType_3_0= ruleDefinedTypeLiteral ) )? (otherlv_4= '->' ( (lv_outputType_5_0= ruleTypeLiteral ) ) )? ( (lv_notAuthenticated_6_0= 'not-authenticated' ) )? (otherlv_7= 'implemented-by' ( (otherlv_8= RULE_ID ) ) )? ( (lv_documentation_9_0= RULE_STRING ) )? )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:485:1: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_method_2_0= ruleHttpMethods ) ) ( (lv_inputType_3_0= ruleDefinedTypeLiteral ) )? (otherlv_4= '->' ( (lv_outputType_5_0= ruleTypeLiteral ) ) )? ( (lv_notAuthenticated_6_0= 'not-authenticated' ) )? (otherlv_7= 'implemented-by' ( (otherlv_8= RULE_ID ) ) )? ( (lv_documentation_9_0= RULE_STRING ) )? )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:485:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( (lv_method_2_0= ruleHttpMethods ) ) ( (lv_inputType_3_0= ruleDefinedTypeLiteral ) )? (otherlv_4= '->' ( (lv_outputType_5_0= ruleTypeLiteral ) ) )? ( (lv_notAuthenticated_6_0= 'not-authenticated' ) )? (otherlv_7= 'implemented-by' ( (otherlv_8= RULE_ID ) ) )? ( (lv_documentation_9_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleInterface1088); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:489:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:490:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:490:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:491:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface1105); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:507:2: ( (lv_method_2_0= ruleHttpMethods ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:508:1: (lv_method_2_0= ruleHttpMethods )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:508:1: (lv_method_2_0= ruleHttpMethods )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:509:3: lv_method_2_0= ruleHttpMethods
            {
             
            	        newCompositeNode(grammarAccess.getInterfaceAccess().getMethodHttpMethodsEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleHttpMethods_in_ruleInterface1131);
            lv_method_2_0=ruleHttpMethods();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"method",
                    		lv_method_2_0, 
                    		"HttpMethods");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:525:2: ( (lv_inputType_3_0= ruleDefinedTypeLiteral ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:526:1: (lv_inputType_3_0= ruleDefinedTypeLiteral )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:526:1: (lv_inputType_3_0= ruleDefinedTypeLiteral )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:527:3: lv_inputType_3_0= ruleDefinedTypeLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getInterfaceAccess().getInputTypeDefinedTypeLiteralParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDefinedTypeLiteral_in_ruleInterface1152);
                    lv_inputType_3_0=ruleDefinedTypeLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	        }
                           		set(
                           			current, 
                           			"inputType",
                            		lv_inputType_3_0, 
                            		"DefinedTypeLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:543:3: (otherlv_4= '->' ( (lv_outputType_5_0= ruleTypeLiteral ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:543:5: otherlv_4= '->' ( (lv_outputType_5_0= ruleTypeLiteral ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleInterface1166); 

                        	newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                        
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:547:1: ( (lv_outputType_5_0= ruleTypeLiteral ) )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:548:1: (lv_outputType_5_0= ruleTypeLiteral )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:548:1: (lv_outputType_5_0= ruleTypeLiteral )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:549:3: lv_outputType_5_0= ruleTypeLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getInterfaceAccess().getOutputTypeTypeLiteralParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeLiteral_in_ruleInterface1187);
                    lv_outputType_5_0=ruleTypeLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    	        }
                           		set(
                           			current, 
                           			"outputType",
                            		lv_outputType_5_0, 
                            		"TypeLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:565:4: ( (lv_notAuthenticated_6_0= 'not-authenticated' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:566:1: (lv_notAuthenticated_6_0= 'not-authenticated' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:566:1: (lv_notAuthenticated_6_0= 'not-authenticated' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:567:3: lv_notAuthenticated_6_0= 'not-authenticated'
                    {
                    lv_notAuthenticated_6_0=(Token)match(input,24,FOLLOW_24_in_ruleInterface1207); 

                            newLeafNode(lv_notAuthenticated_6_0, grammarAccess.getInterfaceAccess().getNotAuthenticatedNotAuthenticatedKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                           		setWithLastConsumed(current, "notAuthenticated", true, "not-authenticated");
                    	    

                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:580:3: (otherlv_7= 'implemented-by' ( (otherlv_8= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:580:5: otherlv_7= 'implemented-by' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleInterface1234); 

                        	newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getImplementedByKeyword_6_0());
                        
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:584:1: ( (otherlv_8= RULE_ID ) )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:585:1: (otherlv_8= RULE_ID )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:585:1: (otherlv_8= RULE_ID )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:586:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface1254); 

                    		newLeafNode(otherlv_8, grammarAccess.getInterfaceAccess().getLegacyServletLegacyServletCrossReference_6_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:597:4: ( (lv_documentation_9_0= RULE_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:598:1: (lv_documentation_9_0= RULE_STRING )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:598:1: (lv_documentation_9_0= RULE_STRING )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:599:3: lv_documentation_9_0= RULE_STRING
                    {
                    lv_documentation_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInterface1273); 

                    			newLeafNode(lv_documentation_9_0, grammarAccess.getInterfaceAccess().getDocumentationSTRINGTerminalRuleCall_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"documentation",
                            		lv_documentation_9_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleLegacyServlet"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:623:1: entryRuleLegacyServlet returns [EObject current=null] : iv_ruleLegacyServlet= ruleLegacyServlet EOF ;
    public final EObject entryRuleLegacyServlet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLegacyServlet = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:624:2: (iv_ruleLegacyServlet= ruleLegacyServlet EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:625:2: iv_ruleLegacyServlet= ruleLegacyServlet EOF
            {
             newCompositeNode(grammarAccess.getLegacyServletRule()); 
            pushFollow(FOLLOW_ruleLegacyServlet_in_entryRuleLegacyServlet1315);
            iv_ruleLegacyServlet=ruleLegacyServlet();

            state._fsp--;

             current =iv_ruleLegacyServlet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLegacyServlet1325); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLegacyServlet"


    // $ANTLR start "ruleLegacyServlet"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:632:1: ruleLegacyServlet returns [EObject current=null] : (otherlv_0= 'legacy-servlet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_urlPattern_3_0= RULE_URL ) ) otherlv_4= '->' ( (lv_fqClassName_5_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleLegacyServlet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_urlPattern_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_fqClassName_5_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:635:28: ( (otherlv_0= 'legacy-servlet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_urlPattern_3_0= RULE_URL ) ) otherlv_4= '->' ( (lv_fqClassName_5_0= ruleQualifiedName ) ) ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:636:1: (otherlv_0= 'legacy-servlet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_urlPattern_3_0= RULE_URL ) ) otherlv_4= '->' ( (lv_fqClassName_5_0= ruleQualifiedName ) ) )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:636:1: (otherlv_0= 'legacy-servlet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_urlPattern_3_0= RULE_URL ) ) otherlv_4= '->' ( (lv_fqClassName_5_0= ruleQualifiedName ) ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:636:3: otherlv_0= 'legacy-servlet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_urlPattern_3_0= RULE_URL ) ) otherlv_4= '->' ( (lv_fqClassName_5_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleLegacyServlet1362); 

                	newLeafNode(otherlv_0, grammarAccess.getLegacyServletAccess().getLegacyServletKeyword_0());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:640:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:641:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:641:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:642:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLegacyServlet1379); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLegacyServletAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLegacyServletRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleLegacyServlet1396); 

                	newLeafNode(otherlv_2, grammarAccess.getLegacyServletAccess().getColonKeyword_2());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:662:1: ( (lv_urlPattern_3_0= RULE_URL ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:663:1: (lv_urlPattern_3_0= RULE_URL )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:663:1: (lv_urlPattern_3_0= RULE_URL )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:664:3: lv_urlPattern_3_0= RULE_URL
            {
            lv_urlPattern_3_0=(Token)match(input,RULE_URL,FOLLOW_RULE_URL_in_ruleLegacyServlet1413); 

            			newLeafNode(lv_urlPattern_3_0, grammarAccess.getLegacyServletAccess().getUrlPatternURLTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLegacyServletRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"urlPattern",
                    		lv_urlPattern_3_0, 
                    		"URL");
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleLegacyServlet1430); 

                	newLeafNode(otherlv_4, grammarAccess.getLegacyServletAccess().getHyphenMinusGreaterThanSignKeyword_4());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:684:1: ( (lv_fqClassName_5_0= ruleQualifiedName ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:685:1: (lv_fqClassName_5_0= ruleQualifiedName )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:685:1: (lv_fqClassName_5_0= ruleQualifiedName )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:686:3: lv_fqClassName_5_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getLegacyServletAccess().getFqClassNameQualifiedNameParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLegacyServlet1451);
            lv_fqClassName_5_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLegacyServletRule());
            	        }
                   		set(
                   			current, 
                   			"fqClassName",
                    		lv_fqClassName_5_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLegacyServlet"


    // $ANTLR start "entryRuleQualifiedName"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:710:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:711:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:712:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1488);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1499); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:719:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:722:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:723:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:723:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:723:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1539); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:730:1: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:731:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,27,FOLLOW_27_in_ruleQualifiedName1558); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1573); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleCrudService"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:751:1: entryRuleCrudService returns [EObject current=null] : iv_ruleCrudService= ruleCrudService EOF ;
    public final EObject entryRuleCrudService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrudService = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:752:2: (iv_ruleCrudService= ruleCrudService EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:753:2: iv_ruleCrudService= ruleCrudService EOF
            {
             newCompositeNode(grammarAccess.getCrudServiceRule()); 
            pushFollow(FOLLOW_ruleCrudService_in_entryRuleCrudService1620);
            iv_ruleCrudService=ruleCrudService();

            state._fsp--;

             current =iv_ruleCrudService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCrudService1630); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCrudService"


    // $ANTLR start "ruleCrudService"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:760:1: ruleCrudService returns [EObject current=null] : (otherlv_0= 'crud-service' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_services_3_0= ruleCrudTypes ) )* ) ;
    public final EObject ruleCrudService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_services_3_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:763:28: ( (otherlv_0= 'crud-service' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_services_3_0= ruleCrudTypes ) )* ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:764:1: (otherlv_0= 'crud-service' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_services_3_0= ruleCrudTypes ) )* )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:764:1: (otherlv_0= 'crud-service' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_services_3_0= ruleCrudTypes ) )* )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:764:3: otherlv_0= 'crud-service' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_services_3_0= ruleCrudTypes ) )*
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleCrudService1667); 

                	newLeafNode(otherlv_0, grammarAccess.getCrudServiceAccess().getCrudServiceKeyword_0());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:768:1: ( (otherlv_1= RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:769:1: (otherlv_1= RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:769:1: (otherlv_1= RULE_ID )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:770:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCrudServiceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCrudService1687); 

            		newLeafNode(otherlv_1, grammarAccess.getCrudServiceAccess().getStructureStructureCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleCrudService1699); 

                	newLeafNode(otherlv_2, grammarAccess.getCrudServiceAccess().getColonKeyword_2());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:785:1: ( (lv_services_3_0= ruleCrudTypes ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=42 && LA15_0<=45)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:786:1: (lv_services_3_0= ruleCrudTypes )
            	    {
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:786:1: (lv_services_3_0= ruleCrudTypes )
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:787:3: lv_services_3_0= ruleCrudTypes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCrudServiceAccess().getServicesCrudTypesEnumRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCrudTypes_in_ruleCrudService1720);
            	    lv_services_3_0=ruleCrudTypes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCrudServiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"services",
            	            		lv_services_3_0, 
            	            		"CrudTypes");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrudService"


    // $ANTLR start "entryRuleDefinedType"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:813:1: entryRuleDefinedType returns [EObject current=null] : iv_ruleDefinedType= ruleDefinedType EOF ;
    public final EObject entryRuleDefinedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinedType = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:814:2: (iv_ruleDefinedType= ruleDefinedType EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:815:2: iv_ruleDefinedType= ruleDefinedType EOF
            {
             newCompositeNode(grammarAccess.getDefinedTypeRule()); 
            pushFollow(FOLLOW_ruleDefinedType_in_entryRuleDefinedType1759);
            iv_ruleDefinedType=ruleDefinedType();

            state._fsp--;

             current =iv_ruleDefinedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinedType1769); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinedType"


    // $ANTLR start "ruleDefinedType"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:822:1: ruleDefinedType returns [EObject current=null] : (this_StructureDefinition_0= ruleStructureDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition ) ;
    public final EObject ruleDefinedType() throws RecognitionException {
        EObject current = null;

        EObject this_StructureDefinition_0 = null;

        EObject this_EnumerationDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:825:28: ( (this_StructureDefinition_0= ruleStructureDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:826:1: (this_StructureDefinition_0= ruleStructureDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:826:1: (this_StructureDefinition_0= ruleStructureDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            else if ( (LA16_0==32) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:827:5: this_StructureDefinition_0= ruleStructureDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDefinedTypeAccess().getStructureDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStructureDefinition_in_ruleDefinedType1816);
                    this_StructureDefinition_0=ruleStructureDefinition();

                    state._fsp--;

                     
                            current = this_StructureDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:837:5: this_EnumerationDefinition_1= ruleEnumerationDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDefinedTypeAccess().getEnumerationDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumerationDefinition_in_ruleDefinedType1843);
                    this_EnumerationDefinition_1=ruleEnumerationDefinition();

                    state._fsp--;

                     
                            current = this_EnumerationDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinedType"


    // $ANTLR start "entryRuleStructureDefinition"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:853:1: entryRuleStructureDefinition returns [EObject current=null] : iv_ruleStructureDefinition= ruleStructureDefinition EOF ;
    public final EObject entryRuleStructureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureDefinition = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:854:2: (iv_ruleStructureDefinition= ruleStructureDefinition EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:855:2: iv_ruleStructureDefinition= ruleStructureDefinition EOF
            {
             newCompositeNode(grammarAccess.getStructureDefinitionRule()); 
            pushFollow(FOLLOW_ruleStructureDefinition_in_entryRuleStructureDefinition1878);
            iv_ruleStructureDefinition=ruleStructureDefinition();

            state._fsp--;

             current =iv_ruleStructureDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureDefinition1888); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructureDefinition"


    // $ANTLR start "ruleStructureDefinition"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:862:1: ruleStructureDefinition returns [EObject current=null] : (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_persistent_2_0= 'persistent' ) )? otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' ) ;
    public final EObject ruleStructureDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_persistent_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_4_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:865:28: ( (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_persistent_2_0= 'persistent' ) )? otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:866:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_persistent_2_0= 'persistent' ) )? otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:866:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_persistent_2_0= 'persistent' ) )? otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:866:3: otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_persistent_2_0= 'persistent' ) )? otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleStructureDefinition1925); 

                	newLeafNode(otherlv_0, grammarAccess.getStructureDefinitionAccess().getStructureKeyword_0());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:870:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:871:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:871:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:872:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureDefinition1942); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStructureDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructureDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:888:2: ( (lv_persistent_2_0= 'persistent' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:889:1: (lv_persistent_2_0= 'persistent' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:889:1: (lv_persistent_2_0= 'persistent' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:890:3: lv_persistent_2_0= 'persistent'
                    {
                    lv_persistent_2_0=(Token)match(input,30,FOLLOW_30_in_ruleStructureDefinition1965); 

                            newLeafNode(lv_persistent_2_0, grammarAccess.getStructureDefinitionAccess().getPersistentPersistentKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructureDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "persistent", true, "persistent");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStructureDefinition1991); 

                	newLeafNode(otherlv_3, grammarAccess.getStructureDefinitionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:907:1: ( (lv_features_4_0= ruleFeature ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:908:1: (lv_features_4_0= ruleFeature )
            	    {
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:908:1: (lv_features_4_0= ruleFeature )
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:909:3: lv_features_4_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructureDefinitionAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleStructureDefinition2012);
            	    lv_features_4_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructureDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_4_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleStructureDefinition2025); 

                	newLeafNode(otherlv_5, grammarAccess.getStructureDefinitionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructureDefinition"


    // $ANTLR start "entryRuleFeature"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:937:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:938:2: (iv_ruleFeature= ruleFeature EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:939:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature2061);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature2071); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:946:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= 'optional' ) )? otherlv_2= ':' ( (lv_type_3_0= ruleTypeLiteral ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:949:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= 'optional' ) )? otherlv_2= ':' ( (lv_type_3_0= ruleTypeLiteral ) ) ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:950:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= 'optional' ) )? otherlv_2= ':' ( (lv_type_3_0= ruleTypeLiteral ) ) )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:950:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= 'optional' ) )? otherlv_2= ':' ( (lv_type_3_0= ruleTypeLiteral ) ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:950:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= 'optional' ) )? otherlv_2= ':' ( (lv_type_3_0= ruleTypeLiteral ) )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:950:2: ( (lv_name_0_0= RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:951:1: (lv_name_0_0= RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:951:1: (lv_name_0_0= RULE_ID )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:952:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature2113); 

            			newLeafNode(lv_name_0_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:968:2: ( (lv_optional_1_0= 'optional' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:969:1: (lv_optional_1_0= 'optional' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:969:1: (lv_optional_1_0= 'optional' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:970:3: lv_optional_1_0= 'optional'
                    {
                    lv_optional_1_0=(Token)match(input,31,FOLLOW_31_in_ruleFeature2136); 

                            newLeafNode(lv_optional_1_0, grammarAccess.getFeatureAccess().getOptionalOptionalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleFeature2162); 

                	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:987:1: ( (lv_type_3_0= ruleTypeLiteral ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:988:1: (lv_type_3_0= ruleTypeLiteral )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:988:1: (lv_type_3_0= ruleTypeLiteral )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:989:3: lv_type_3_0= ruleTypeLiteral
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeLiteralParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeLiteral_in_ruleFeature2183);
            lv_type_3_0=ruleTypeLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFeatureRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"TypeLiteral");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleEnumerationDefinition"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1013:1: entryRuleEnumerationDefinition returns [EObject current=null] : iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF ;
    public final EObject entryRuleEnumerationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationDefinition = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1014:2: (iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1015:2: iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF
            {
             newCompositeNode(grammarAccess.getEnumerationDefinitionRule()); 
            pushFollow(FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition2219);
            iv_ruleEnumerationDefinition=ruleEnumerationDefinition();

            state._fsp--;

             current =iv_ruleEnumerationDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationDefinition2229); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationDefinition"


    // $ANTLR start "ruleEnumerationDefinition"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1022:1: ruleEnumerationDefinition returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnumerationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_3_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1025:28: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= '}' ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1026:1: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= '}' )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1026:1: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= '}' )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1026:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleEnumerationDefinition2266); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationDefinitionAccess().getEnumerationKeyword_0());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1030:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1031:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1031:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1032:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationDefinition2283); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumerationDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEnumerationDefinition2300); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumerationDefinitionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1052:1: ( (lv_literals_3_0= ruleEnumerationLiteral ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)||LA20_0==RULE_INT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1053:1: (lv_literals_3_0= ruleEnumerationLiteral )
            	    {
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1053:1: (lv_literals_3_0= ruleEnumerationLiteral )
            	    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1054:3: lv_literals_3_0= ruleEnumerationLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumerationDefinitionAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumerationDefinition2321);
            	    lv_literals_3_0=ruleEnumerationLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumerationDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"literals",
            	            		lv_literals_3_0, 
            	            		"EnumerationLiteral");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEnumerationDefinition2334); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumerationDefinitionAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationDefinition"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1082:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1083:2: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1084:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral2370);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral2380); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1091:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= ruleEnumerationName ) ) otherlv_1= '->' ( (lv_displayName_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_displayName_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1094:28: ( ( ( (lv_name_0_0= ruleEnumerationName ) ) otherlv_1= '->' ( (lv_displayName_2_0= RULE_STRING ) ) ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1095:1: ( ( (lv_name_0_0= ruleEnumerationName ) ) otherlv_1= '->' ( (lv_displayName_2_0= RULE_STRING ) ) )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1095:1: ( ( (lv_name_0_0= ruleEnumerationName ) ) otherlv_1= '->' ( (lv_displayName_2_0= RULE_STRING ) ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1095:2: ( (lv_name_0_0= ruleEnumerationName ) ) otherlv_1= '->' ( (lv_displayName_2_0= RULE_STRING ) )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1095:2: ( (lv_name_0_0= ruleEnumerationName ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1096:1: (lv_name_0_0= ruleEnumerationName )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1096:1: (lv_name_0_0= ruleEnumerationName )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1097:3: lv_name_0_0= ruleEnumerationName
            {
             
            	        newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getNameEnumerationNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumerationName_in_ruleEnumerationLiteral2426);
            lv_name_0_0=ruleEnumerationName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EnumerationName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleEnumerationLiteral2438); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1117:1: ( (lv_displayName_2_0= RULE_STRING ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1118:1: (lv_displayName_2_0= RULE_STRING )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1118:1: (lv_displayName_2_0= RULE_STRING )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1119:3: lv_displayName_2_0= RULE_STRING
            {
            lv_displayName_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumerationLiteral2455); 

            			newLeafNode(lv_displayName_2_0, grammarAccess.getEnumerationLiteralAccess().getDisplayNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumerationLiteralRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"displayName",
                    		lv_displayName_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleEnumerationName"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1143:1: entryRuleEnumerationName returns [String current=null] : iv_ruleEnumerationName= ruleEnumerationName EOF ;
    public final String entryRuleEnumerationName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumerationName = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1144:2: (iv_ruleEnumerationName= ruleEnumerationName EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1145:2: iv_ruleEnumerationName= ruleEnumerationName EOF
            {
             newCompositeNode(grammarAccess.getEnumerationNameRule()); 
            pushFollow(FOLLOW_ruleEnumerationName_in_entryRuleEnumerationName2497);
            iv_ruleEnumerationName=ruleEnumerationName();

            state._fsp--;

             current =iv_ruleEnumerationName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationName2508); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationName"


    // $ANTLR start "ruleEnumerationName"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1152:1: ruleEnumerationName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEnumerationName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1155:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1156:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1156:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
            int alt21=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt21=1;
                }
                break;
            case RULE_STRING:
                {
                alt21=2;
                }
                break;
            case RULE_INT:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1156:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationName2548); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getEnumerationNameAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1164:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumerationName2574); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getEnumerationNameAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1172:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationName2600); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getEnumerationNameAccess().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationName"


    // $ANTLR start "entryRuleTypeLiteral"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1187:1: entryRuleTypeLiteral returns [EObject current=null] : iv_ruleTypeLiteral= ruleTypeLiteral EOF ;
    public final EObject entryRuleTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteral = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1188:2: (iv_ruleTypeLiteral= ruleTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1189:2: iv_ruleTypeLiteral= ruleTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleTypeLiteral_in_entryRuleTypeLiteral2645);
            iv_ruleTypeLiteral=ruleTypeLiteral();

            state._fsp--;

             current =iv_ruleTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLiteral2655); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeLiteral"


    // $ANTLR start "ruleTypeLiteral"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1196:1: ruleTypeLiteral returns [EObject current=null] : (this_BuiltinTypeLiteral_0= ruleBuiltinTypeLiteral | this_DefinedTypeLiteral_1= ruleDefinedTypeLiteral | this_ListTypeLiteral_2= ruleListTypeLiteral | this_SyntheticTypeLiteral_3= ruleSyntheticTypeLiteral ) ;
    public final EObject ruleTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BuiltinTypeLiteral_0 = null;

        EObject this_DefinedTypeLiteral_1 = null;

        EObject this_ListTypeLiteral_2 = null;

        EObject this_SyntheticTypeLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1199:28: ( (this_BuiltinTypeLiteral_0= ruleBuiltinTypeLiteral | this_DefinedTypeLiteral_1= ruleDefinedTypeLiteral | this_ListTypeLiteral_2= ruleListTypeLiteral | this_SyntheticTypeLiteral_3= ruleSyntheticTypeLiteral ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1200:1: (this_BuiltinTypeLiteral_0= ruleBuiltinTypeLiteral | this_DefinedTypeLiteral_1= ruleDefinedTypeLiteral | this_ListTypeLiteral_2= ruleListTypeLiteral | this_SyntheticTypeLiteral_3= ruleSyntheticTypeLiteral )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1200:1: (this_BuiltinTypeLiteral_0= ruleBuiltinTypeLiteral | this_DefinedTypeLiteral_1= ruleDefinedTypeLiteral | this_ListTypeLiteral_2= ruleListTypeLiteral | this_SyntheticTypeLiteral_3= ruleSyntheticTypeLiteral )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt22=1;
                }
                break;
            case RULE_ID:
                {
                alt22=2;
                }
                break;
            case 33:
                {
                alt22=3;
                }
                break;
            case 35:
            case 36:
            case 37:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1201:5: this_BuiltinTypeLiteral_0= ruleBuiltinTypeLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTypeLiteralAccess().getBuiltinTypeLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBuiltinTypeLiteral_in_ruleTypeLiteral2702);
                    this_BuiltinTypeLiteral_0=ruleBuiltinTypeLiteral();

                    state._fsp--;

                     
                            current = this_BuiltinTypeLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1211:5: this_DefinedTypeLiteral_1= ruleDefinedTypeLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTypeLiteralAccess().getDefinedTypeLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDefinedTypeLiteral_in_ruleTypeLiteral2729);
                    this_DefinedTypeLiteral_1=ruleDefinedTypeLiteral();

                    state._fsp--;

                     
                            current = this_DefinedTypeLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1221:5: this_ListTypeLiteral_2= ruleListTypeLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTypeLiteralAccess().getListTypeLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleListTypeLiteral_in_ruleTypeLiteral2756);
                    this_ListTypeLiteral_2=ruleListTypeLiteral();

                    state._fsp--;

                     
                            current = this_ListTypeLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1231:5: this_SyntheticTypeLiteral_3= ruleSyntheticTypeLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTypeLiteralAccess().getSyntheticTypeLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSyntheticTypeLiteral_in_ruleTypeLiteral2783);
                    this_SyntheticTypeLiteral_3=ruleSyntheticTypeLiteral();

                    state._fsp--;

                     
                            current = this_SyntheticTypeLiteral_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeLiteral"


    // $ANTLR start "entryRuleBuiltinTypeLiteral"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1247:1: entryRuleBuiltinTypeLiteral returns [EObject current=null] : iv_ruleBuiltinTypeLiteral= ruleBuiltinTypeLiteral EOF ;
    public final EObject entryRuleBuiltinTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinTypeLiteral = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1248:2: (iv_ruleBuiltinTypeLiteral= ruleBuiltinTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1249:2: iv_ruleBuiltinTypeLiteral= ruleBuiltinTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getBuiltinTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleBuiltinTypeLiteral_in_entryRuleBuiltinTypeLiteral2818);
            iv_ruleBuiltinTypeLiteral=ruleBuiltinTypeLiteral();

            state._fsp--;

             current =iv_ruleBuiltinTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinTypeLiteral2828); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBuiltinTypeLiteral"


    // $ANTLR start "ruleBuiltinTypeLiteral"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1256:1: ruleBuiltinTypeLiteral returns [EObject current=null] : ( (lv_builtin_0_0= ruleBuiltinTypes ) ) ;
    public final EObject ruleBuiltinTypeLiteral() throws RecognitionException {
        EObject current = null;

        Enumerator lv_builtin_0_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1259:28: ( ( (lv_builtin_0_0= ruleBuiltinTypes ) ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1260:1: ( (lv_builtin_0_0= ruleBuiltinTypes ) )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1260:1: ( (lv_builtin_0_0= ruleBuiltinTypes ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1261:1: (lv_builtin_0_0= ruleBuiltinTypes )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1261:1: (lv_builtin_0_0= ruleBuiltinTypes )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1262:3: lv_builtin_0_0= ruleBuiltinTypes
            {
             
            	        newCompositeNode(grammarAccess.getBuiltinTypeLiteralAccess().getBuiltinBuiltinTypesEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBuiltinTypes_in_ruleBuiltinTypeLiteral2873);
            lv_builtin_0_0=ruleBuiltinTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBuiltinTypeLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"builtin",
                    		lv_builtin_0_0, 
                    		"BuiltinTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuiltinTypeLiteral"


    // $ANTLR start "entryRuleDefinedTypeLiteral"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1286:1: entryRuleDefinedTypeLiteral returns [EObject current=null] : iv_ruleDefinedTypeLiteral= ruleDefinedTypeLiteral EOF ;
    public final EObject entryRuleDefinedTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinedTypeLiteral = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1287:2: (iv_ruleDefinedTypeLiteral= ruleDefinedTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1288:2: iv_ruleDefinedTypeLiteral= ruleDefinedTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getDefinedTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleDefinedTypeLiteral_in_entryRuleDefinedTypeLiteral2908);
            iv_ruleDefinedTypeLiteral=ruleDefinedTypeLiteral();

            state._fsp--;

             current =iv_ruleDefinedTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinedTypeLiteral2918); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinedTypeLiteral"


    // $ANTLR start "ruleDefinedTypeLiteral"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1295:1: ruleDefinedTypeLiteral returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDefinedTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1298:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1299:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1299:1: ( (otherlv_0= RULE_ID ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1300:1: (otherlv_0= RULE_ID )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1300:1: (otherlv_0= RULE_ID )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1301:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinedTypeLiteralRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinedTypeLiteral2962); 

            		newLeafNode(otherlv_0, grammarAccess.getDefinedTypeLiteralAccess().getTypeDefinedTypeCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinedTypeLiteral"


    // $ANTLR start "entryRuleListTypeLiteral"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1320:1: entryRuleListTypeLiteral returns [EObject current=null] : iv_ruleListTypeLiteral= ruleListTypeLiteral EOF ;
    public final EObject entryRuleListTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTypeLiteral = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1321:2: (iv_ruleListTypeLiteral= ruleListTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1322:2: iv_ruleListTypeLiteral= ruleListTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getListTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleListTypeLiteral_in_entryRuleListTypeLiteral2997);
            iv_ruleListTypeLiteral=ruleListTypeLiteral();

            state._fsp--;

             current =iv_ruleListTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListTypeLiteral3007); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListTypeLiteral"


    // $ANTLR start "ruleListTypeLiteral"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1329:1: ruleListTypeLiteral returns [EObject current=null] : (otherlv_0= '[' ( (lv_itemType_1_0= ruleTypeLiteral ) ) otherlv_2= ']' ) ;
    public final EObject ruleListTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_itemType_1_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1332:28: ( (otherlv_0= '[' ( (lv_itemType_1_0= ruleTypeLiteral ) ) otherlv_2= ']' ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1333:1: (otherlv_0= '[' ( (lv_itemType_1_0= ruleTypeLiteral ) ) otherlv_2= ']' )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1333:1: (otherlv_0= '[' ( (lv_itemType_1_0= ruleTypeLiteral ) ) otherlv_2= ']' )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1333:3: otherlv_0= '[' ( (lv_itemType_1_0= ruleTypeLiteral ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleListTypeLiteral3044); 

                	newLeafNode(otherlv_0, grammarAccess.getListTypeLiteralAccess().getLeftSquareBracketKeyword_0());
                
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1337:1: ( (lv_itemType_1_0= ruleTypeLiteral ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1338:1: (lv_itemType_1_0= ruleTypeLiteral )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1338:1: (lv_itemType_1_0= ruleTypeLiteral )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1339:3: lv_itemType_1_0= ruleTypeLiteral
            {
             
            	        newCompositeNode(grammarAccess.getListTypeLiteralAccess().getItemTypeTypeLiteralParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeLiteral_in_ruleListTypeLiteral3065);
            lv_itemType_1_0=ruleTypeLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListTypeLiteralRule());
            	        }
                   		set(
                   			current, 
                   			"itemType",
                    		lv_itemType_1_0, 
                    		"TypeLiteral");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleListTypeLiteral3077); 

                	newLeafNode(otherlv_2, grammarAccess.getListTypeLiteralAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListTypeLiteral"


    // $ANTLR start "entryRuleSyntheticTypeLiteral"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1367:1: entryRuleSyntheticTypeLiteral returns [EObject current=null] : iv_ruleSyntheticTypeLiteral= ruleSyntheticTypeLiteral EOF ;
    public final EObject entryRuleSyntheticTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSyntheticTypeLiteral = null;


        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1368:2: (iv_ruleSyntheticTypeLiteral= ruleSyntheticTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1369:2: iv_ruleSyntheticTypeLiteral= ruleSyntheticTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getSyntheticTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleSyntheticTypeLiteral_in_entryRuleSyntheticTypeLiteral3113);
            iv_ruleSyntheticTypeLiteral=ruleSyntheticTypeLiteral();

            state._fsp--;

             current =iv_ruleSyntheticTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntheticTypeLiteral3123); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSyntheticTypeLiteral"


    // $ANTLR start "ruleSyntheticTypeLiteral"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1376:1: ruleSyntheticTypeLiteral returns [EObject current=null] : ( ( () otherlv_1= 'Callback' ) | ( () otherlv_3= 'Error' ) | ( () otherlv_5= '$Void' ) ) ;
    public final EObject ruleSyntheticTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1379:28: ( ( ( () otherlv_1= 'Callback' ) | ( () otherlv_3= 'Error' ) | ( () otherlv_5= '$Void' ) ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1380:1: ( ( () otherlv_1= 'Callback' ) | ( () otherlv_3= 'Error' ) | ( () otherlv_5= '$Void' ) )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1380:1: ( ( () otherlv_1= 'Callback' ) | ( () otherlv_3= 'Error' ) | ( () otherlv_5= '$Void' ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 37:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1380:2: ( () otherlv_1= 'Callback' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1380:2: ( () otherlv_1= 'Callback' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1380:3: () otherlv_1= 'Callback'
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1380:3: ()
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1381:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSyntheticTypeLiteralAccess().getCallbackLiteralAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleSyntheticTypeLiteral3170); 

                        	newLeafNode(otherlv_1, grammarAccess.getSyntheticTypeLiteralAccess().getCallbackKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1391:6: ( () otherlv_3= 'Error' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1391:6: ( () otherlv_3= 'Error' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1391:7: () otherlv_3= 'Error'
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1391:7: ()
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1392:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSyntheticTypeLiteralAccess().getCallbackErrorResponseLiteralAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleSyntheticTypeLiteral3199); 

                        	newLeafNode(otherlv_3, grammarAccess.getSyntheticTypeLiteralAccess().getErrorKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1402:6: ( () otherlv_5= '$Void' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1402:6: ( () otherlv_5= '$Void' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1402:7: () otherlv_5= '$Void'
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1402:7: ()
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1403:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSyntheticTypeLiteralAccess().getVoidLiteralAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleSyntheticTypeLiteral3228); 

                        	newLeafNode(otherlv_5, grammarAccess.getSyntheticTypeLiteralAccess().getVoidKeyword_2_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSyntheticTypeLiteral"


    // $ANTLR start "ruleFlavors"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1420:1: ruleFlavors returns [Enumerator current=null] : ( (enumLiteral_0= 'Java' ) | (enumLiteral_1= 'PHP' ) ) ;
    public final Enumerator ruleFlavors() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1422:28: ( ( (enumLiteral_0= 'Java' ) | (enumLiteral_1= 'PHP' ) ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1423:1: ( (enumLiteral_0= 'Java' ) | (enumLiteral_1= 'PHP' ) )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1423:1: ( (enumLiteral_0= 'Java' ) | (enumLiteral_1= 'PHP' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            else if ( (LA24_0==39) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1423:2: (enumLiteral_0= 'Java' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1423:2: (enumLiteral_0= 'Java' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1423:4: enumLiteral_0= 'Java'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleFlavors3279); 

                            current = grammarAccess.getFlavorsAccess().getJavaEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFlavorsAccess().getJavaEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1429:6: (enumLiteral_1= 'PHP' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1429:6: (enumLiteral_1= 'PHP' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1429:8: enumLiteral_1= 'PHP'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_39_in_ruleFlavors3296); 

                            current = grammarAccess.getFlavorsAccess().getPhpEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFlavorsAccess().getPhpEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlavors"


    // $ANTLR start "ruleHttpMethods"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1439:1: ruleHttpMethods returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) ) ;
    public final Enumerator ruleHttpMethods() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1441:28: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1442:1: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1442:1: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            else if ( (LA25_0==41) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1442:2: (enumLiteral_0= 'GET' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1442:2: (enumLiteral_0= 'GET' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1442:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleHttpMethods3341); 

                            current = grammarAccess.getHttpMethodsAccess().getGetEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getHttpMethodsAccess().getGetEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1448:6: (enumLiteral_1= 'POST' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1448:6: (enumLiteral_1= 'POST' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1448:8: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleHttpMethods3358); 

                            current = grammarAccess.getHttpMethodsAccess().getPostEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getHttpMethodsAccess().getPostEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpMethods"


    // $ANTLR start "ruleCrudTypes"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1458:1: ruleCrudTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'get-by-id' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'delete' ) ) ;
    public final Enumerator ruleCrudTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1460:28: ( ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'get-by-id' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'delete' ) ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1461:1: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'get-by-id' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'delete' ) )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1461:1: ( (enumLiteral_0= 'create' ) | (enumLiteral_1= 'get-by-id' ) | (enumLiteral_2= 'update' ) | (enumLiteral_3= 'delete' ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt26=1;
                }
                break;
            case 43:
                {
                alt26=2;
                }
                break;
            case 44:
                {
                alt26=3;
                }
                break;
            case 45:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1461:2: (enumLiteral_0= 'create' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1461:2: (enumLiteral_0= 'create' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1461:4: enumLiteral_0= 'create'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleCrudTypes3403); 

                            current = grammarAccess.getCrudTypesAccess().getCreateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCrudTypesAccess().getCreateEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1467:6: (enumLiteral_1= 'get-by-id' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1467:6: (enumLiteral_1= 'get-by-id' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1467:8: enumLiteral_1= 'get-by-id'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleCrudTypes3420); 

                            current = grammarAccess.getCrudTypesAccess().getGetByIdEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCrudTypesAccess().getGetByIdEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1473:6: (enumLiteral_2= 'update' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1473:6: (enumLiteral_2= 'update' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1473:8: enumLiteral_2= 'update'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_44_in_ruleCrudTypes3437); 

                            current = grammarAccess.getCrudTypesAccess().getUpdateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCrudTypesAccess().getUpdateEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1479:6: (enumLiteral_3= 'delete' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1479:6: (enumLiteral_3= 'delete' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1479:8: enumLiteral_3= 'delete'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_45_in_ruleCrudTypes3454); 

                            current = grammarAccess.getCrudTypesAccess().getDeleteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCrudTypesAccess().getDeleteEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrudTypes"


    // $ANTLR start "ruleBuiltinTypes"
    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1489:1: ruleBuiltinTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'URL' ) | (enumLiteral_4= 'Text' ) | (enumLiteral_5= 'Number' ) | (enumLiteral_6= 'Email' ) | (enumLiteral_7= 'Phone' ) | (enumLiteral_8= 'Date' ) | (enumLiteral_9= 'Password' ) ) ;
    public final Enumerator ruleBuiltinTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;

         enterRule(); 
        try {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1491:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'URL' ) | (enumLiteral_4= 'Text' ) | (enumLiteral_5= 'Number' ) | (enumLiteral_6= 'Email' ) | (enumLiteral_7= 'Phone' ) | (enumLiteral_8= 'Date' ) | (enumLiteral_9= 'Password' ) ) )
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1492:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'URL' ) | (enumLiteral_4= 'Text' ) | (enumLiteral_5= 'Number' ) | (enumLiteral_6= 'Email' ) | (enumLiteral_7= 'Phone' ) | (enumLiteral_8= 'Date' ) | (enumLiteral_9= 'Password' ) )
            {
            // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1492:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'URL' ) | (enumLiteral_4= 'Text' ) | (enumLiteral_5= 'Number' ) | (enumLiteral_6= 'Email' ) | (enumLiteral_7= 'Phone' ) | (enumLiteral_8= 'Date' ) | (enumLiteral_9= 'Password' ) )
            int alt27=10;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt27=1;
                }
                break;
            case 47:
                {
                alt27=2;
                }
                break;
            case 48:
                {
                alt27=3;
                }
                break;
            case 49:
                {
                alt27=4;
                }
                break;
            case 50:
                {
                alt27=5;
                }
                break;
            case 51:
                {
                alt27=6;
                }
                break;
            case 52:
                {
                alt27=7;
                }
                break;
            case 53:
                {
                alt27=8;
                }
                break;
            case 54:
                {
                alt27=9;
                }
                break;
            case 55:
                {
                alt27=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1492:2: (enumLiteral_0= 'String' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1492:2: (enumLiteral_0= 'String' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1492:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleBuiltinTypes3499); 

                            current = grammarAccess.getBuiltinTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBuiltinTypesAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1498:6: (enumLiteral_1= 'Boolean' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1498:6: (enumLiteral_1= 'Boolean' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1498:8: enumLiteral_1= 'Boolean'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleBuiltinTypes3516); 

                            current = grammarAccess.getBuiltinTypesAccess().getBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBuiltinTypesAccess().getBooleanEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1504:6: (enumLiteral_2= 'Integer' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1504:6: (enumLiteral_2= 'Integer' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1504:8: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_48_in_ruleBuiltinTypes3533); 

                            current = grammarAccess.getBuiltinTypesAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBuiltinTypesAccess().getIntegerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1510:6: (enumLiteral_3= 'URL' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1510:6: (enumLiteral_3= 'URL' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1510:8: enumLiteral_3= 'URL'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_49_in_ruleBuiltinTypes3550); 

                            current = grammarAccess.getBuiltinTypesAccess().getUrlEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBuiltinTypesAccess().getUrlEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1516:6: (enumLiteral_4= 'Text' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1516:6: (enumLiteral_4= 'Text' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1516:8: enumLiteral_4= 'Text'
                    {
                    enumLiteral_4=(Token)match(input,50,FOLLOW_50_in_ruleBuiltinTypes3567); 

                            current = grammarAccess.getBuiltinTypesAccess().getTextEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getBuiltinTypesAccess().getTextEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1522:6: (enumLiteral_5= 'Number' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1522:6: (enumLiteral_5= 'Number' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1522:8: enumLiteral_5= 'Number'
                    {
                    enumLiteral_5=(Token)match(input,51,FOLLOW_51_in_ruleBuiltinTypes3584); 

                            current = grammarAccess.getBuiltinTypesAccess().getNumberEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getBuiltinTypesAccess().getNumberEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1528:6: (enumLiteral_6= 'Email' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1528:6: (enumLiteral_6= 'Email' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1528:8: enumLiteral_6= 'Email'
                    {
                    enumLiteral_6=(Token)match(input,52,FOLLOW_52_in_ruleBuiltinTypes3601); 

                            current = grammarAccess.getBuiltinTypesAccess().getEmailEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getBuiltinTypesAccess().getEmailEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1534:6: (enumLiteral_7= 'Phone' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1534:6: (enumLiteral_7= 'Phone' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1534:8: enumLiteral_7= 'Phone'
                    {
                    enumLiteral_7=(Token)match(input,53,FOLLOW_53_in_ruleBuiltinTypes3618); 

                            current = grammarAccess.getBuiltinTypesAccess().getPhoneEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getBuiltinTypesAccess().getPhoneEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1540:6: (enumLiteral_8= 'Date' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1540:6: (enumLiteral_8= 'Date' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1540:8: enumLiteral_8= 'Date'
                    {
                    enumLiteral_8=(Token)match(input,54,FOLLOW_54_in_ruleBuiltinTypes3635); 

                            current = grammarAccess.getBuiltinTypesAccess().getDateEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getBuiltinTypesAccess().getDateEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1546:6: (enumLiteral_9= 'Password' )
                    {
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1546:6: (enumLiteral_9= 'Password' )
                    // ../nl.dslmeinte.simscript.backend/src-gen/nl/dslmeinte/simscript/backend/parser/antlr/internal/InternalSimBackendDsl.g:1546:8: enumLiteral_9= 'Password'
                    {
                    enumLiteral_9=(Token)match(input,55,FOLLOW_55_in_ruleBuiltinTypes3652); 

                            current = grammarAccess.getBuiltinTypesAccess().getPasswordEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getBuiltinTypesAccess().getPasswordEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBuiltinTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBackendModel_in_entryRuleBackendModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBackendModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleBackendModel177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBackendModel189 = new BitSet(new long[]{0x0000000014475002L});
    public static final BitSet FOLLOW_14_in_ruleBackendModel202 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBackendModel214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBackendModel231 = new BitSet(new long[]{0x0000000014471002L});
    public static final BitSet FOLLOW_16_in_ruleBackendModel307 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBackendModel319 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ruleFlavors_in_ruleBackendModel340 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBackendModel354 = new BitSet(new long[]{0x0000000014471002L});
    public static final BitSet FOLLOW_ruleAuthenticationDeclaration_in_ruleBackendModel423 = new BitSet(new long[]{0x0000000014440002L});
    public static final BitSet FOLLOW_ruleService_in_ruleBackendModel445 = new BitSet(new long[]{0x0000000014400002L});
    public static final BitSet FOLLOW_ruleAuthenticationDeclaration_in_entryRuleAuthenticationDeclaration482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthenticationDeclaration492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAuthenticationDeclaration529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAuthenticationDeclaration546 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAuthenticationDeclaration563 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAuthenticationDeclaration575 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAuthenticationParameter_in_ruleAuthenticationDeclaration596 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAuthenticationDeclaration608 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAuthenticationParameter_in_ruleAuthenticationDeclaration629 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAuthenticationDeclaration641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthenticationParameter_in_entryRuleAuthenticationParameter677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthenticationParameter687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAuthenticationParameter729 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAuthenticationParameter746 = new BitSet(new long[]{0x00FFC03A00000020L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_ruleAuthenticationParameter767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedService_in_ruleService860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrudService_in_ruleService887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedService_in_entryRuleNamedService922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedService932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleNamedService979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLegacyServlet_in_ruleNamedService1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface1041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleInterface1088 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface1105 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_ruleHttpMethods_in_ruleInterface1131 = new BitSet(new long[]{0x0000000003800032L});
    public static final BitSet FOLLOW_ruleDefinedTypeLiteral_in_ruleInterface1152 = new BitSet(new long[]{0x0000000003800012L});
    public static final BitSet FOLLOW_23_in_ruleInterface1166 = new BitSet(new long[]{0x00FFC03A00000020L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_ruleInterface1187 = new BitSet(new long[]{0x0000000003000012L});
    public static final BitSet FOLLOW_24_in_ruleInterface1207 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_25_in_ruleInterface1234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface1254 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInterface1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLegacyServlet_in_entryRuleLegacyServlet1315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLegacyServlet1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLegacyServlet1362 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLegacyServlet1379 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLegacyServlet1396 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_URL_in_ruleLegacyServlet1413 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLegacyServlet1430 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLegacyServlet1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1539 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleQualifiedName1558 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1573 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleCrudService_in_entryRuleCrudService1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrudService1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCrudService1667 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCrudService1687 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCrudService1699 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_ruleCrudTypes_in_ruleCrudService1720 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_ruleDefinedType_in_entryRuleDefinedType1759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinedType1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureDefinition_in_ruleDefinedType1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_ruleDefinedType1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureDefinition_in_entryRuleStructureDefinition1878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureDefinition1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStructureDefinition1925 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureDefinition1942 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_30_in_ruleStructureDefinition1965 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructureDefinition1991 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleStructureDefinition2012 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleStructureDefinition2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature2061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature2113 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_31_in_ruleFeature2136 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFeature2162 = new BitSet(new long[]{0x00FFC03A00000020L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_ruleFeature2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition2219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationDefinition2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEnumerationDefinition2266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationDefinition2283 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumerationDefinition2300 = new BitSet(new long[]{0x00000000000200B0L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumerationDefinition2321 = new BitSet(new long[]{0x00000000000200B0L});
    public static final BitSet FOLLOW_17_in_ruleEnumerationDefinition2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral2370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationName_in_ruleEnumerationLiteral2426 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEnumerationLiteral2438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumerationLiteral2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationName_in_entryRuleEnumerationName2497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationName2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationName2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumerationName2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationName2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_entryRuleTypeLiteral2645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteral2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypeLiteral_in_ruleTypeLiteral2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinedTypeLiteral_in_ruleTypeLiteral2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListTypeLiteral_in_ruleTypeLiteral2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntheticTypeLiteral_in_ruleTypeLiteral2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypeLiteral_in_entryRuleBuiltinTypeLiteral2818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinTypeLiteral2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypes_in_ruleBuiltinTypeLiteral2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinedTypeLiteral_in_entryRuleDefinedTypeLiteral2908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinedTypeLiteral2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinedTypeLiteral2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListTypeLiteral_in_entryRuleListTypeLiteral2997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListTypeLiteral3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleListTypeLiteral3044 = new BitSet(new long[]{0x00FFC03A00000020L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_ruleListTypeLiteral3065 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleListTypeLiteral3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntheticTypeLiteral_in_entryRuleSyntheticTypeLiteral3113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntheticTypeLiteral3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSyntheticTypeLiteral3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSyntheticTypeLiteral3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleSyntheticTypeLiteral3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleFlavors3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFlavors3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleHttpMethods3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleHttpMethods3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCrudTypes3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCrudTypes3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCrudTypes3437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCrudTypes3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleBuiltinTypes3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleBuiltinTypes3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBuiltinTypes3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleBuiltinTypes3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleBuiltinTypes3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBuiltinTypes3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBuiltinTypes3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBuiltinTypes3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBuiltinTypes3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBuiltinTypes3652 = new BitSet(new long[]{0x0000000000000002L});

}

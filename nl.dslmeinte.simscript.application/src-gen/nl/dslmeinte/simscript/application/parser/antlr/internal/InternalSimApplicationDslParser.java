package nl.dslmeinte.simscript.application.parser.antlr.internal; 

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
import nl.dslmeinte.simscript.application.services.SimApplicationDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimApplicationDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'title'", "'='", "'target-platform'", "'include-css'", "'with-default-css'", "'included-modules'", "'entry-module'", "'include-custom-JavaScript'", "'custom-html-head-additions'", "'custom-html-body'", "'with-generic-back-button-prevention'", "'html5'", "'facebook'", "'mobile'"
    };
    public static final int RULE_ID=5;
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
    public static final int T__19=19;
    public static final int RULE_STRING=4;
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


        public InternalSimApplicationDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimApplicationDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimApplicationDslParser.tokenNames; }
    public String getGrammarFileName() { return "../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g"; }



     	private SimApplicationDslGrammarAccess grammarAccess;
     	
        public InternalSimApplicationDslParser(TokenStream input, SimApplicationDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ApplicationModel";	
       	}
       	
       	@Override
       	protected SimApplicationDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleApplicationModel"
    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:68:1: entryRuleApplicationModel returns [EObject current=null] : iv_ruleApplicationModel= ruleApplicationModel EOF ;
    public final EObject entryRuleApplicationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationModel = null;


        try {
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:69:2: (iv_ruleApplicationModel= ruleApplicationModel EOF )
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:70:2: iv_ruleApplicationModel= ruleApplicationModel EOF
            {
             newCompositeNode(grammarAccess.getApplicationModelRule()); 
            pushFollow(FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel75);
            iv_ruleApplicationModel=ruleApplicationModel();

            state._fsp--;

             current =iv_ruleApplicationModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplicationModel85); 

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
    // $ANTLR end "entryRuleApplicationModel"


    // $ANTLR start "ruleApplicationModel"
    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:77:1: ruleApplicationModel returns [EObject current=null] : (otherlv_0= 'application' otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= RULE_STRING ) ) otherlv_4= 'target-platform' otherlv_5= '=' ( (lv_targetPlatform_6_0= ruleTargetPlatforms ) ) (otherlv_7= 'include-css' ( (lv_includeCSSs_8_0= RULE_STRING ) )* )? ( (lv_defaultCSS_9_0= 'with-default-css' ) )? otherlv_10= 'included-modules' ( (otherlv_11= RULE_ID ) )* otherlv_12= 'entry-module' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'include-custom-JavaScript' ( (lv_includeCustomJS_16_0= RULE_STRING ) )* )? (otherlv_17= 'custom-html-head-additions' otherlv_18= '=' ( (lv_cHtmlHead_19_0= RULE_STRING ) ) )? (otherlv_20= 'custom-html-body' otherlv_21= '=' ( (lv_cHtmlBody_22_0= RULE_STRING ) ) )? ( (lv_genericBackButtonPrevention_23_0= 'with-generic-back-button-prevention' ) )? ) ;
    public final EObject ruleApplicationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_title_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_includeCSSs_8_0=null;
        Token lv_defaultCSS_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_includeCustomJS_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_cHtmlHead_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_cHtmlBody_22_0=null;
        Token lv_genericBackButtonPrevention_23_0=null;
        Enumerator lv_targetPlatform_6_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:80:28: ( (otherlv_0= 'application' otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= RULE_STRING ) ) otherlv_4= 'target-platform' otherlv_5= '=' ( (lv_targetPlatform_6_0= ruleTargetPlatforms ) ) (otherlv_7= 'include-css' ( (lv_includeCSSs_8_0= RULE_STRING ) )* )? ( (lv_defaultCSS_9_0= 'with-default-css' ) )? otherlv_10= 'included-modules' ( (otherlv_11= RULE_ID ) )* otherlv_12= 'entry-module' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'include-custom-JavaScript' ( (lv_includeCustomJS_16_0= RULE_STRING ) )* )? (otherlv_17= 'custom-html-head-additions' otherlv_18= '=' ( (lv_cHtmlHead_19_0= RULE_STRING ) ) )? (otherlv_20= 'custom-html-body' otherlv_21= '=' ( (lv_cHtmlBody_22_0= RULE_STRING ) ) )? ( (lv_genericBackButtonPrevention_23_0= 'with-generic-back-button-prevention' ) )? ) )
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:81:1: (otherlv_0= 'application' otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= RULE_STRING ) ) otherlv_4= 'target-platform' otherlv_5= '=' ( (lv_targetPlatform_6_0= ruleTargetPlatforms ) ) (otherlv_7= 'include-css' ( (lv_includeCSSs_8_0= RULE_STRING ) )* )? ( (lv_defaultCSS_9_0= 'with-default-css' ) )? otherlv_10= 'included-modules' ( (otherlv_11= RULE_ID ) )* otherlv_12= 'entry-module' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'include-custom-JavaScript' ( (lv_includeCustomJS_16_0= RULE_STRING ) )* )? (otherlv_17= 'custom-html-head-additions' otherlv_18= '=' ( (lv_cHtmlHead_19_0= RULE_STRING ) ) )? (otherlv_20= 'custom-html-body' otherlv_21= '=' ( (lv_cHtmlBody_22_0= RULE_STRING ) ) )? ( (lv_genericBackButtonPrevention_23_0= 'with-generic-back-button-prevention' ) )? )
            {
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:81:1: (otherlv_0= 'application' otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= RULE_STRING ) ) otherlv_4= 'target-platform' otherlv_5= '=' ( (lv_targetPlatform_6_0= ruleTargetPlatforms ) ) (otherlv_7= 'include-css' ( (lv_includeCSSs_8_0= RULE_STRING ) )* )? ( (lv_defaultCSS_9_0= 'with-default-css' ) )? otherlv_10= 'included-modules' ( (otherlv_11= RULE_ID ) )* otherlv_12= 'entry-module' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'include-custom-JavaScript' ( (lv_includeCustomJS_16_0= RULE_STRING ) )* )? (otherlv_17= 'custom-html-head-additions' otherlv_18= '=' ( (lv_cHtmlHead_19_0= RULE_STRING ) ) )? (otherlv_20= 'custom-html-body' otherlv_21= '=' ( (lv_cHtmlBody_22_0= RULE_STRING ) ) )? ( (lv_genericBackButtonPrevention_23_0= 'with-generic-back-button-prevention' ) )? )
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:81:3: otherlv_0= 'application' otherlv_1= 'title' otherlv_2= '=' ( (lv_title_3_0= RULE_STRING ) ) otherlv_4= 'target-platform' otherlv_5= '=' ( (lv_targetPlatform_6_0= ruleTargetPlatforms ) ) (otherlv_7= 'include-css' ( (lv_includeCSSs_8_0= RULE_STRING ) )* )? ( (lv_defaultCSS_9_0= 'with-default-css' ) )? otherlv_10= 'included-modules' ( (otherlv_11= RULE_ID ) )* otherlv_12= 'entry-module' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= 'include-custom-JavaScript' ( (lv_includeCustomJS_16_0= RULE_STRING ) )* )? (otherlv_17= 'custom-html-head-additions' otherlv_18= '=' ( (lv_cHtmlHead_19_0= RULE_STRING ) ) )? (otherlv_20= 'custom-html-body' otherlv_21= '=' ( (lv_cHtmlBody_22_0= RULE_STRING ) ) )? ( (lv_genericBackButtonPrevention_23_0= 'with-generic-back-button-prevention' ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleApplicationModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getApplicationModelAccess().getApplicationKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleApplicationModel134); 

                	newLeafNode(otherlv_1, grammarAccess.getApplicationModelAccess().getTitleKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleApplicationModel146); 

                	newLeafNode(otherlv_2, grammarAccess.getApplicationModelAccess().getEqualsSignKeyword_2());
                
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:93:1: ( (lv_title_3_0= RULE_STRING ) )
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:94:1: (lv_title_3_0= RULE_STRING )
            {
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:94:1: (lv_title_3_0= RULE_STRING )
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:95:3: lv_title_3_0= RULE_STRING
            {
            lv_title_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationModel163); 

            			newLeafNode(lv_title_3_0, grammarAccess.getApplicationModelAccess().getTitleSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getApplicationModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleApplicationModel180); 

                	newLeafNode(otherlv_4, grammarAccess.getApplicationModelAccess().getTargetPlatformKeyword_4());
                
            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleApplicationModel192); 

                	newLeafNode(otherlv_5, grammarAccess.getApplicationModelAccess().getEqualsSignKeyword_5());
                
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:119:1: ( (lv_targetPlatform_6_0= ruleTargetPlatforms ) )
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:120:1: (lv_targetPlatform_6_0= ruleTargetPlatforms )
            {
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:120:1: (lv_targetPlatform_6_0= ruleTargetPlatforms )
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:121:3: lv_targetPlatform_6_0= ruleTargetPlatforms
            {
             
            	        newCompositeNode(grammarAccess.getApplicationModelAccess().getTargetPlatformTargetPlatformsEnumRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTargetPlatforms_in_ruleApplicationModel213);
            lv_targetPlatform_6_0=ruleTargetPlatforms();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplicationModelRule());
            	        }
                   		set(
                   			current, 
                   			"targetPlatform",
                    		lv_targetPlatform_6_0, 
                    		"TargetPlatforms");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:137:2: (otherlv_7= 'include-css' ( (lv_includeCSSs_8_0= RULE_STRING ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:137:4: otherlv_7= 'include-css' ( (lv_includeCSSs_8_0= RULE_STRING ) )*
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleApplicationModel226); 

                        	newLeafNode(otherlv_7, grammarAccess.getApplicationModelAccess().getIncludeCssKeyword_7_0());
                        
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:141:1: ( (lv_includeCSSs_8_0= RULE_STRING ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_STRING) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:142:1: (lv_includeCSSs_8_0= RULE_STRING )
                    	    {
                    	    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:142:1: (lv_includeCSSs_8_0= RULE_STRING )
                    	    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:143:3: lv_includeCSSs_8_0= RULE_STRING
                    	    {
                    	    lv_includeCSSs_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationModel243); 

                    	    			newLeafNode(lv_includeCSSs_8_0, grammarAccess.getApplicationModelAccess().getIncludeCSSsSTRINGTerminalRuleCall_7_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getApplicationModelRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"includeCSSs",
                    	            		lv_includeCSSs_8_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:159:5: ( (lv_defaultCSS_9_0= 'with-default-css' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:160:1: (lv_defaultCSS_9_0= 'with-default-css' )
                    {
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:160:1: (lv_defaultCSS_9_0= 'with-default-css' )
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:161:3: lv_defaultCSS_9_0= 'with-default-css'
                    {
                    lv_defaultCSS_9_0=(Token)match(input,16,FOLLOW_16_in_ruleApplicationModel269); 

                            newLeafNode(lv_defaultCSS_9_0, grammarAccess.getApplicationModelAccess().getDefaultCSSWithDefaultCssKeyword_8_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getApplicationModelRule());
                    	        }
                           		setWithLastConsumed(current, "defaultCSS", true, "with-default-css");
                    	    

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleApplicationModel295); 

                	newLeafNode(otherlv_10, grammarAccess.getApplicationModelAccess().getIncludedModulesKeyword_9());
                
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:178:1: ( (otherlv_11= RULE_ID ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:179:1: (otherlv_11= RULE_ID )
            	    {
            	    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:179:1: (otherlv_11= RULE_ID )
            	    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:180:3: otherlv_11= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getApplicationModelRule());
            	    	        }
            	            
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationModel315); 

            	    		newLeafNode(otherlv_11, grammarAccess.getApplicationModelAccess().getIncludedModulesUiModuleCrossReference_10_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleApplicationModel328); 

                	newLeafNode(otherlv_12, grammarAccess.getApplicationModelAccess().getEntryModuleKeyword_11());
                
            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleApplicationModel340); 

                	newLeafNode(otherlv_13, grammarAccess.getApplicationModelAccess().getEqualsSignKeyword_12());
                
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:199:1: ( (otherlv_14= RULE_ID ) )
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:200:1: (otherlv_14= RULE_ID )
            {
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:200:1: (otherlv_14= RULE_ID )
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:201:3: otherlv_14= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getApplicationModelRule());
            	        }
                    
            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApplicationModel360); 

            		newLeafNode(otherlv_14, grammarAccess.getApplicationModelAccess().getEntryModuleUiModuleCrossReference_13_0()); 
            	

            }


            }

            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:212:2: (otherlv_15= 'include-custom-JavaScript' ( (lv_includeCustomJS_16_0= RULE_STRING ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:212:4: otherlv_15= 'include-custom-JavaScript' ( (lv_includeCustomJS_16_0= RULE_STRING ) )*
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleApplicationModel373); 

                        	newLeafNode(otherlv_15, grammarAccess.getApplicationModelAccess().getIncludeCustomJavaScriptKeyword_14_0());
                        
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:216:1: ( (lv_includeCustomJS_16_0= RULE_STRING ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_STRING) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:217:1: (lv_includeCustomJS_16_0= RULE_STRING )
                    	    {
                    	    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:217:1: (lv_includeCustomJS_16_0= RULE_STRING )
                    	    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:218:3: lv_includeCustomJS_16_0= RULE_STRING
                    	    {
                    	    lv_includeCustomJS_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationModel390); 

                    	    			newLeafNode(lv_includeCustomJS_16_0, grammarAccess.getApplicationModelAccess().getIncludeCustomJSSTRINGTerminalRuleCall_14_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getApplicationModelRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"includeCustomJS",
                    	            		lv_includeCustomJS_16_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:234:5: (otherlv_17= 'custom-html-head-additions' otherlv_18= '=' ( (lv_cHtmlHead_19_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:234:7: otherlv_17= 'custom-html-head-additions' otherlv_18= '=' ( (lv_cHtmlHead_19_0= RULE_STRING ) )
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleApplicationModel411); 

                        	newLeafNode(otherlv_17, grammarAccess.getApplicationModelAccess().getCustomHtmlHeadAdditionsKeyword_15_0());
                        
                    otherlv_18=(Token)match(input,13,FOLLOW_13_in_ruleApplicationModel423); 

                        	newLeafNode(otherlv_18, grammarAccess.getApplicationModelAccess().getEqualsSignKeyword_15_1());
                        
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:242:1: ( (lv_cHtmlHead_19_0= RULE_STRING ) )
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:243:1: (lv_cHtmlHead_19_0= RULE_STRING )
                    {
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:243:1: (lv_cHtmlHead_19_0= RULE_STRING )
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:244:3: lv_cHtmlHead_19_0= RULE_STRING
                    {
                    lv_cHtmlHead_19_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationModel440); 

                    			newLeafNode(lv_cHtmlHead_19_0, grammarAccess.getApplicationModelAccess().getCHtmlHeadSTRINGTerminalRuleCall_15_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getApplicationModelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cHtmlHead",
                            		lv_cHtmlHead_19_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:260:4: (otherlv_20= 'custom-html-body' otherlv_21= '=' ( (lv_cHtmlBody_22_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:260:6: otherlv_20= 'custom-html-body' otherlv_21= '=' ( (lv_cHtmlBody_22_0= RULE_STRING ) )
                    {
                    otherlv_20=(Token)match(input,21,FOLLOW_21_in_ruleApplicationModel460); 

                        	newLeafNode(otherlv_20, grammarAccess.getApplicationModelAccess().getCustomHtmlBodyKeyword_16_0());
                        
                    otherlv_21=(Token)match(input,13,FOLLOW_13_in_ruleApplicationModel472); 

                        	newLeafNode(otherlv_21, grammarAccess.getApplicationModelAccess().getEqualsSignKeyword_16_1());
                        
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:268:1: ( (lv_cHtmlBody_22_0= RULE_STRING ) )
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:269:1: (lv_cHtmlBody_22_0= RULE_STRING )
                    {
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:269:1: (lv_cHtmlBody_22_0= RULE_STRING )
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:270:3: lv_cHtmlBody_22_0= RULE_STRING
                    {
                    lv_cHtmlBody_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleApplicationModel489); 

                    			newLeafNode(lv_cHtmlBody_22_0, grammarAccess.getApplicationModelAccess().getCHtmlBodySTRINGTerminalRuleCall_16_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getApplicationModelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cHtmlBody",
                            		lv_cHtmlBody_22_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:286:4: ( (lv_genericBackButtonPrevention_23_0= 'with-generic-back-button-prevention' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:287:1: (lv_genericBackButtonPrevention_23_0= 'with-generic-back-button-prevention' )
                    {
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:287:1: (lv_genericBackButtonPrevention_23_0= 'with-generic-back-button-prevention' )
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:288:3: lv_genericBackButtonPrevention_23_0= 'with-generic-back-button-prevention'
                    {
                    lv_genericBackButtonPrevention_23_0=(Token)match(input,22,FOLLOW_22_in_ruleApplicationModel514); 

                            newLeafNode(lv_genericBackButtonPrevention_23_0, grammarAccess.getApplicationModelAccess().getGenericBackButtonPreventionWithGenericBackButtonPreventionKeyword_17_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getApplicationModelRule());
                    	        }
                           		setWithLastConsumed(current, "genericBackButtonPrevention", true, "with-generic-back-button-prevention");
                    	    

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
    // $ANTLR end "ruleApplicationModel"


    // $ANTLR start "ruleTargetPlatforms"
    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:309:1: ruleTargetPlatforms returns [Enumerator current=null] : ( (enumLiteral_0= 'html5' ) | (enumLiteral_1= 'facebook' ) | (enumLiteral_2= 'mobile' ) ) ;
    public final Enumerator ruleTargetPlatforms() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:311:28: ( ( (enumLiteral_0= 'html5' ) | (enumLiteral_1= 'facebook' ) | (enumLiteral_2= 'mobile' ) ) )
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:312:1: ( (enumLiteral_0= 'html5' ) | (enumLiteral_1= 'facebook' ) | (enumLiteral_2= 'mobile' ) )
            {
            // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:312:1: ( (enumLiteral_0= 'html5' ) | (enumLiteral_1= 'facebook' ) | (enumLiteral_2= 'mobile' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:312:2: (enumLiteral_0= 'html5' )
                    {
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:312:2: (enumLiteral_0= 'html5' )
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:312:4: enumLiteral_0= 'html5'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleTargetPlatforms578); 

                            current = grammarAccess.getTargetPlatformsAccess().getHtml5EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTargetPlatformsAccess().getHtml5EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:318:6: (enumLiteral_1= 'facebook' )
                    {
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:318:6: (enumLiteral_1= 'facebook' )
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:318:8: enumLiteral_1= 'facebook'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleTargetPlatforms595); 

                            current = grammarAccess.getTargetPlatformsAccess().getFacebookEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTargetPlatformsAccess().getFacebookEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:324:6: (enumLiteral_2= 'mobile' )
                    {
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:324:6: (enumLiteral_2= 'mobile' )
                    // ../nl.dslmeinte.simscript.application/src-gen/nl/dslmeinte/simscript/application/parser/antlr/internal/InternalSimApplicationDsl.g:324:8: enumLiteral_2= 'mobile'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_25_in_ruleTargetPlatforms612); 

                            current = grammarAccess.getTargetPlatformsAccess().getMobileEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTargetPlatformsAccess().getMobileEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleTargetPlatforms"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleApplicationModel_in_entryRuleApplicationModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplicationModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleApplicationModel122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApplicationModel134 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleApplicationModel146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationModel163 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleApplicationModel180 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleApplicationModel192 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_ruleTargetPlatforms_in_ruleApplicationModel213 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_15_in_ruleApplicationModel226 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationModel243 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_16_in_ruleApplicationModel269 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleApplicationModel295 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationModel315 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_18_in_ruleApplicationModel328 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleApplicationModel340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApplicationModel360 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_19_in_ruleApplicationModel373 = new BitSet(new long[]{0x0000000000700012L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationModel390 = new BitSet(new long[]{0x0000000000700012L});
    public static final BitSet FOLLOW_20_in_ruleApplicationModel411 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleApplicationModel423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationModel440 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleApplicationModel460 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleApplicationModel472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleApplicationModel489 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleApplicationModel514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTargetPlatforms578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTargetPlatforms595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTargetPlatforms612 = new BitSet(new long[]{0x0000000000000002L});

}
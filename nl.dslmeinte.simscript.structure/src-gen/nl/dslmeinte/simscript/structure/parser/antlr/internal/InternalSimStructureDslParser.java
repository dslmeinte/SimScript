package nl.dslmeinte.simscript.structure.parser.antlr.internal; 

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
import nl.dslmeinte.simscript.structure.services.SimStructureDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimStructureDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'structure'", "'persistent'", "'{'", "'}'", "'optional'", "':'", "'enumeration'", "'->'", "'['", "']'", "'Callback'", "'Error'", "'$Void'", "'String'", "'Boolean'", "'Integer'", "'URL'", "'Text'", "'Number'", "'Email'", "'Phone'", "'Date'", "'Password'"
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
    public String getGrammarFileName() { return "../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g"; }



     	private SimStructureDslGrammarAccess grammarAccess;
     	
        public InternalSimStructureDslParser(TokenStream input, SimStructureDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StructureModel";	
       	}
       	
       	@Override
       	protected SimStructureDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStructureModel"
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:68:1: entryRuleStructureModel returns [EObject current=null] : iv_ruleStructureModel= ruleStructureModel EOF ;
    public final EObject entryRuleStructureModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureModel = null;


        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:69:2: (iv_ruleStructureModel= ruleStructureModel EOF )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:70:2: iv_ruleStructureModel= ruleStructureModel EOF
            {
             newCompositeNode(grammarAccess.getStructureModelRule()); 
            pushFollow(FOLLOW_ruleStructureModel_in_entryRuleStructureModel75);
            iv_ruleStructureModel=ruleStructureModel();

            state._fsp--;

             current =iv_ruleStructureModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureModel85); 

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
    // $ANTLR end "entryRuleStructureModel"


    // $ANTLR start "ruleStructureModel"
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:77:1: ruleStructureModel returns [EObject current=null] : ( (lv_typeDefinitions_0_0= ruleDefinedType ) )* ;
    public final EObject ruleStructureModel() throws RecognitionException {
        EObject current = null;

        EObject lv_typeDefinitions_0_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:80:28: ( ( (lv_typeDefinitions_0_0= ruleDefinedType ) )* )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:81:1: ( (lv_typeDefinitions_0_0= ruleDefinedType ) )*
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:81:1: ( (lv_typeDefinitions_0_0= ruleDefinedType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:82:1: (lv_typeDefinitions_0_0= ruleDefinedType )
            	    {
            	    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:82:1: (lv_typeDefinitions_0_0= ruleDefinedType )
            	    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:83:3: lv_typeDefinitions_0_0= ruleDefinedType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructureModelAccess().getTypeDefinitionsDefinedTypeParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefinedType_in_ruleStructureModel130);
            	    lv_typeDefinitions_0_0=ruleDefinedType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructureModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"typeDefinitions",
            	            		lv_typeDefinitions_0_0, 
            	            		"DefinedType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleStructureModel"


    // $ANTLR start "entryRuleDefinedType"
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:107:1: entryRuleDefinedType returns [EObject current=null] : iv_ruleDefinedType= ruleDefinedType EOF ;
    public final EObject entryRuleDefinedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinedType = null;


        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:108:2: (iv_ruleDefinedType= ruleDefinedType EOF )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:109:2: iv_ruleDefinedType= ruleDefinedType EOF
            {
             newCompositeNode(grammarAccess.getDefinedTypeRule()); 
            pushFollow(FOLLOW_ruleDefinedType_in_entryRuleDefinedType166);
            iv_ruleDefinedType=ruleDefinedType();

            state._fsp--;

             current =iv_ruleDefinedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinedType176); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:116:1: ruleDefinedType returns [EObject current=null] : (this_StructureDefinition_0= ruleStructureDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition ) ;
    public final EObject ruleDefinedType() throws RecognitionException {
        EObject current = null;

        EObject this_StructureDefinition_0 = null;

        EObject this_EnumerationDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:119:28: ( (this_StructureDefinition_0= ruleStructureDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:120:1: (this_StructureDefinition_0= ruleStructureDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:120:1: (this_StructureDefinition_0= ruleStructureDefinition | this_EnumerationDefinition_1= ruleEnumerationDefinition )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:121:5: this_StructureDefinition_0= ruleStructureDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDefinedTypeAccess().getStructureDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStructureDefinition_in_ruleDefinedType223);
                    this_StructureDefinition_0=ruleStructureDefinition();

                    state._fsp--;

                     
                            current = this_StructureDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:131:5: this_EnumerationDefinition_1= ruleEnumerationDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getDefinedTypeAccess().getEnumerationDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumerationDefinition_in_ruleDefinedType250);
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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:147:1: entryRuleStructureDefinition returns [EObject current=null] : iv_ruleStructureDefinition= ruleStructureDefinition EOF ;
    public final EObject entryRuleStructureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureDefinition = null;


        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:148:2: (iv_ruleStructureDefinition= ruleStructureDefinition EOF )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:149:2: iv_ruleStructureDefinition= ruleStructureDefinition EOF
            {
             newCompositeNode(grammarAccess.getStructureDefinitionRule()); 
            pushFollow(FOLLOW_ruleStructureDefinition_in_entryRuleStructureDefinition285);
            iv_ruleStructureDefinition=ruleStructureDefinition();

            state._fsp--;

             current =iv_ruleStructureDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureDefinition295); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:156:1: ruleStructureDefinition returns [EObject current=null] : (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_persistent_2_0= 'persistent' ) )? otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' ) ;
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
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:159:28: ( (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_persistent_2_0= 'persistent' ) )? otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:160:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_persistent_2_0= 'persistent' ) )? otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:160:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_persistent_2_0= 'persistent' ) )? otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}' )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:160:3: otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_persistent_2_0= 'persistent' ) )? otherlv_3= '{' ( (lv_features_4_0= ruleFeature ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleStructureDefinition332); 

                	newLeafNode(otherlv_0, grammarAccess.getStructureDefinitionAccess().getStructureKeyword_0());
                
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:164:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:165:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:165:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:166:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureDefinition349); 

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

            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:182:2: ( (lv_persistent_2_0= 'persistent' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:183:1: (lv_persistent_2_0= 'persistent' )
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:183:1: (lv_persistent_2_0= 'persistent' )
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:184:3: lv_persistent_2_0= 'persistent'
                    {
                    lv_persistent_2_0=(Token)match(input,12,FOLLOW_12_in_ruleStructureDefinition372); 

                            newLeafNode(lv_persistent_2_0, grammarAccess.getStructureDefinitionAccess().getPersistentPersistentKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructureDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "persistent", true, "persistent");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStructureDefinition398); 

                	newLeafNode(otherlv_3, grammarAccess.getStructureDefinitionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:201:1: ( (lv_features_4_0= ruleFeature ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:202:1: (lv_features_4_0= ruleFeature )
            	    {
            	    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:202:1: (lv_features_4_0= ruleFeature )
            	    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:203:3: lv_features_4_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructureDefinitionAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleStructureDefinition419);
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
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleStructureDefinition432); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:231:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:232:2: (iv_ruleFeature= ruleFeature EOF )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:233:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature468);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature478); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:240:1: ruleFeature returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= 'optional' ) )? otherlv_2= ':' ( (lv_type_3_0= ruleTypeLiteral ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:243:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= 'optional' ) )? otherlv_2= ':' ( (lv_type_3_0= ruleTypeLiteral ) ) ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:244:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= 'optional' ) )? otherlv_2= ':' ( (lv_type_3_0= ruleTypeLiteral ) ) )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:244:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= 'optional' ) )? otherlv_2= ':' ( (lv_type_3_0= ruleTypeLiteral ) ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:244:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_optional_1_0= 'optional' ) )? otherlv_2= ':' ( (lv_type_3_0= ruleTypeLiteral ) )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:244:2: ( (lv_name_0_0= RULE_ID ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:245:1: (lv_name_0_0= RULE_ID )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:245:1: (lv_name_0_0= RULE_ID )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:246:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature520); 

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

            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:262:2: ( (lv_optional_1_0= 'optional' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:263:1: (lv_optional_1_0= 'optional' )
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:263:1: (lv_optional_1_0= 'optional' )
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:264:3: lv_optional_1_0= 'optional'
                    {
                    lv_optional_1_0=(Token)match(input,15,FOLLOW_15_in_ruleFeature543); 

                            newLeafNode(lv_optional_1_0, grammarAccess.getFeatureAccess().getOptionalOptionalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "optional");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleFeature569); 

                	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
                
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:281:1: ( (lv_type_3_0= ruleTypeLiteral ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:282:1: (lv_type_3_0= ruleTypeLiteral )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:282:1: (lv_type_3_0= ruleTypeLiteral )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:283:3: lv_type_3_0= ruleTypeLiteral
            {
             
            	        newCompositeNode(grammarAccess.getFeatureAccess().getTypeTypeLiteralParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeLiteral_in_ruleFeature590);
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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:307:1: entryRuleEnumerationDefinition returns [EObject current=null] : iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF ;
    public final EObject entryRuleEnumerationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationDefinition = null;


        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:308:2: (iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:309:2: iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF
            {
             newCompositeNode(grammarAccess.getEnumerationDefinitionRule()); 
            pushFollow(FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition626);
            iv_ruleEnumerationDefinition=ruleEnumerationDefinition();

            state._fsp--;

             current =iv_ruleEnumerationDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationDefinition636); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:316:1: ruleEnumerationDefinition returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnumerationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_3_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:319:28: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= '}' ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:320:1: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= '}' )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:320:1: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= '}' )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:320:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleEnumerationLiteral ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEnumerationDefinition673); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationDefinitionAccess().getEnumerationKeyword_0());
                
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:324:1: ( (lv_name_1_0= RULE_ID ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:325:1: (lv_name_1_0= RULE_ID )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:325:1: (lv_name_1_0= RULE_ID )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:326:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationDefinition690); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEnumerationDefinition707); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumerationDefinitionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:346:1: ( (lv_literals_3_0= ruleEnumerationLiteral ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:347:1: (lv_literals_3_0= ruleEnumerationLiteral )
            	    {
            	    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:347:1: (lv_literals_3_0= ruleEnumerationLiteral )
            	    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:348:3: lv_literals_3_0= ruleEnumerationLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumerationDefinitionAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumerationDefinition728);
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
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleEnumerationDefinition741); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:376:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:377:2: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:378:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral777);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;

             current =iv_ruleEnumerationLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral787); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:385:1: ruleEnumerationLiteral returns [EObject current=null] : ( ( (lv_name_0_0= ruleEnumerationName ) ) otherlv_1= '->' ( (lv_displayName_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_displayName_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:388:28: ( ( ( (lv_name_0_0= ruleEnumerationName ) ) otherlv_1= '->' ( (lv_displayName_2_0= RULE_STRING ) ) ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:389:1: ( ( (lv_name_0_0= ruleEnumerationName ) ) otherlv_1= '->' ( (lv_displayName_2_0= RULE_STRING ) ) )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:389:1: ( ( (lv_name_0_0= ruleEnumerationName ) ) otherlv_1= '->' ( (lv_displayName_2_0= RULE_STRING ) ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:389:2: ( (lv_name_0_0= ruleEnumerationName ) ) otherlv_1= '->' ( (lv_displayName_2_0= RULE_STRING ) )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:389:2: ( (lv_name_0_0= ruleEnumerationName ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:390:1: (lv_name_0_0= ruleEnumerationName )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:390:1: (lv_name_0_0= ruleEnumerationName )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:391:3: lv_name_0_0= ruleEnumerationName
            {
             
            	        newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getNameEnumerationNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumerationName_in_ruleEnumerationLiteral833);
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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleEnumerationLiteral845); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:411:1: ( (lv_displayName_2_0= RULE_STRING ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:412:1: (lv_displayName_2_0= RULE_STRING )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:412:1: (lv_displayName_2_0= RULE_STRING )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:413:3: lv_displayName_2_0= RULE_STRING
            {
            lv_displayName_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumerationLiteral862); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:437:1: entryRuleEnumerationName returns [String current=null] : iv_ruleEnumerationName= ruleEnumerationName EOF ;
    public final String entryRuleEnumerationName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumerationName = null;


        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:438:2: (iv_ruleEnumerationName= ruleEnumerationName EOF )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:439:2: iv_ruleEnumerationName= ruleEnumerationName EOF
            {
             newCompositeNode(grammarAccess.getEnumerationNameRule()); 
            pushFollow(FOLLOW_ruleEnumerationName_in_entryRuleEnumerationName904);
            iv_ruleEnumerationName=ruleEnumerationName();

            state._fsp--;

             current =iv_ruleEnumerationName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationName915); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:446:1: ruleEnumerationName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEnumerationName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:449:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:450:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:450:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_INT_2= RULE_INT )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case RULE_INT:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:450:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationName955); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getEnumerationNameAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:458:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumerationName981); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getEnumerationNameAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:466:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumerationName1007); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:481:1: entryRuleTypeLiteral returns [EObject current=null] : iv_ruleTypeLiteral= ruleTypeLiteral EOF ;
    public final EObject entryRuleTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteral = null;


        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:482:2: (iv_ruleTypeLiteral= ruleTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:483:2: iv_ruleTypeLiteral= ruleTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleTypeLiteral_in_entryRuleTypeLiteral1052);
            iv_ruleTypeLiteral=ruleTypeLiteral();

            state._fsp--;

             current =iv_ruleTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeLiteral1062); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:490:1: ruleTypeLiteral returns [EObject current=null] : (this_BuiltinTypeLiteral_0= ruleBuiltinTypeLiteral | this_DefinedTypeLiteral_1= ruleDefinedTypeLiteral | this_ListTypeLiteral_2= ruleListTypeLiteral | this_SyntheticTypeLiteral_3= ruleSyntheticTypeLiteral ) ;
    public final EObject ruleTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_BuiltinTypeLiteral_0 = null;

        EObject this_DefinedTypeLiteral_1 = null;

        EObject this_ListTypeLiteral_2 = null;

        EObject this_SyntheticTypeLiteral_3 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:493:28: ( (this_BuiltinTypeLiteral_0= ruleBuiltinTypeLiteral | this_DefinedTypeLiteral_1= ruleDefinedTypeLiteral | this_ListTypeLiteral_2= ruleListTypeLiteral | this_SyntheticTypeLiteral_3= ruleSyntheticTypeLiteral ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:494:1: (this_BuiltinTypeLiteral_0= ruleBuiltinTypeLiteral | this_DefinedTypeLiteral_1= ruleDefinedTypeLiteral | this_ListTypeLiteral_2= ruleListTypeLiteral | this_SyntheticTypeLiteral_3= ruleSyntheticTypeLiteral )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:494:1: (this_BuiltinTypeLiteral_0= ruleBuiltinTypeLiteral | this_DefinedTypeLiteral_1= ruleDefinedTypeLiteral | this_ListTypeLiteral_2= ruleListTypeLiteral | this_SyntheticTypeLiteral_3= ruleSyntheticTypeLiteral )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            case 21:
            case 22:
            case 23:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:495:5: this_BuiltinTypeLiteral_0= ruleBuiltinTypeLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTypeLiteralAccess().getBuiltinTypeLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBuiltinTypeLiteral_in_ruleTypeLiteral1109);
                    this_BuiltinTypeLiteral_0=ruleBuiltinTypeLiteral();

                    state._fsp--;

                     
                            current = this_BuiltinTypeLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:505:5: this_DefinedTypeLiteral_1= ruleDefinedTypeLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTypeLiteralAccess().getDefinedTypeLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDefinedTypeLiteral_in_ruleTypeLiteral1136);
                    this_DefinedTypeLiteral_1=ruleDefinedTypeLiteral();

                    state._fsp--;

                     
                            current = this_DefinedTypeLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:515:5: this_ListTypeLiteral_2= ruleListTypeLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTypeLiteralAccess().getListTypeLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleListTypeLiteral_in_ruleTypeLiteral1163);
                    this_ListTypeLiteral_2=ruleListTypeLiteral();

                    state._fsp--;

                     
                            current = this_ListTypeLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:525:5: this_SyntheticTypeLiteral_3= ruleSyntheticTypeLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getTypeLiteralAccess().getSyntheticTypeLiteralParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSyntheticTypeLiteral_in_ruleTypeLiteral1190);
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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:541:1: entryRuleBuiltinTypeLiteral returns [EObject current=null] : iv_ruleBuiltinTypeLiteral= ruleBuiltinTypeLiteral EOF ;
    public final EObject entryRuleBuiltinTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuiltinTypeLiteral = null;


        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:542:2: (iv_ruleBuiltinTypeLiteral= ruleBuiltinTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:543:2: iv_ruleBuiltinTypeLiteral= ruleBuiltinTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getBuiltinTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleBuiltinTypeLiteral_in_entryRuleBuiltinTypeLiteral1225);
            iv_ruleBuiltinTypeLiteral=ruleBuiltinTypeLiteral();

            state._fsp--;

             current =iv_ruleBuiltinTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBuiltinTypeLiteral1235); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:550:1: ruleBuiltinTypeLiteral returns [EObject current=null] : ( (lv_builtin_0_0= ruleBuiltinTypes ) ) ;
    public final EObject ruleBuiltinTypeLiteral() throws RecognitionException {
        EObject current = null;

        Enumerator lv_builtin_0_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:553:28: ( ( (lv_builtin_0_0= ruleBuiltinTypes ) ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:554:1: ( (lv_builtin_0_0= ruleBuiltinTypes ) )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:554:1: ( (lv_builtin_0_0= ruleBuiltinTypes ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:555:1: (lv_builtin_0_0= ruleBuiltinTypes )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:555:1: (lv_builtin_0_0= ruleBuiltinTypes )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:556:3: lv_builtin_0_0= ruleBuiltinTypes
            {
             
            	        newCompositeNode(grammarAccess.getBuiltinTypeLiteralAccess().getBuiltinBuiltinTypesEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBuiltinTypes_in_ruleBuiltinTypeLiteral1280);
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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:580:1: entryRuleDefinedTypeLiteral returns [EObject current=null] : iv_ruleDefinedTypeLiteral= ruleDefinedTypeLiteral EOF ;
    public final EObject entryRuleDefinedTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinedTypeLiteral = null;


        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:581:2: (iv_ruleDefinedTypeLiteral= ruleDefinedTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:582:2: iv_ruleDefinedTypeLiteral= ruleDefinedTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getDefinedTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleDefinedTypeLiteral_in_entryRuleDefinedTypeLiteral1315);
            iv_ruleDefinedTypeLiteral=ruleDefinedTypeLiteral();

            state._fsp--;

             current =iv_ruleDefinedTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinedTypeLiteral1325); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:589:1: ruleDefinedTypeLiteral returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDefinedTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:592:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:593:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:593:1: ( (otherlv_0= RULE_ID ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:594:1: (otherlv_0= RULE_ID )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:594:1: (otherlv_0= RULE_ID )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:595:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinedTypeLiteralRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefinedTypeLiteral1369); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:614:1: entryRuleListTypeLiteral returns [EObject current=null] : iv_ruleListTypeLiteral= ruleListTypeLiteral EOF ;
    public final EObject entryRuleListTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTypeLiteral = null;


        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:615:2: (iv_ruleListTypeLiteral= ruleListTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:616:2: iv_ruleListTypeLiteral= ruleListTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getListTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleListTypeLiteral_in_entryRuleListTypeLiteral1404);
            iv_ruleListTypeLiteral=ruleListTypeLiteral();

            state._fsp--;

             current =iv_ruleListTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListTypeLiteral1414); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:623:1: ruleListTypeLiteral returns [EObject current=null] : (otherlv_0= '[' ( (lv_itemType_1_0= ruleTypeLiteral ) ) otherlv_2= ']' ) ;
    public final EObject ruleListTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_itemType_1_0 = null;


         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:626:28: ( (otherlv_0= '[' ( (lv_itemType_1_0= ruleTypeLiteral ) ) otherlv_2= ']' ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:627:1: (otherlv_0= '[' ( (lv_itemType_1_0= ruleTypeLiteral ) ) otherlv_2= ']' )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:627:1: (otherlv_0= '[' ( (lv_itemType_1_0= ruleTypeLiteral ) ) otherlv_2= ']' )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:627:3: otherlv_0= '[' ( (lv_itemType_1_0= ruleTypeLiteral ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleListTypeLiteral1451); 

                	newLeafNode(otherlv_0, grammarAccess.getListTypeLiteralAccess().getLeftSquareBracketKeyword_0());
                
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:631:1: ( (lv_itemType_1_0= ruleTypeLiteral ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:632:1: (lv_itemType_1_0= ruleTypeLiteral )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:632:1: (lv_itemType_1_0= ruleTypeLiteral )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:633:3: lv_itemType_1_0= ruleTypeLiteral
            {
             
            	        newCompositeNode(grammarAccess.getListTypeLiteralAccess().getItemTypeTypeLiteralParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeLiteral_in_ruleListTypeLiteral1472);
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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleListTypeLiteral1484); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:661:1: entryRuleSyntheticTypeLiteral returns [EObject current=null] : iv_ruleSyntheticTypeLiteral= ruleSyntheticTypeLiteral EOF ;
    public final EObject entryRuleSyntheticTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSyntheticTypeLiteral = null;


        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:662:2: (iv_ruleSyntheticTypeLiteral= ruleSyntheticTypeLiteral EOF )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:663:2: iv_ruleSyntheticTypeLiteral= ruleSyntheticTypeLiteral EOF
            {
             newCompositeNode(grammarAccess.getSyntheticTypeLiteralRule()); 
            pushFollow(FOLLOW_ruleSyntheticTypeLiteral_in_entryRuleSyntheticTypeLiteral1520);
            iv_ruleSyntheticTypeLiteral=ruleSyntheticTypeLiteral();

            state._fsp--;

             current =iv_ruleSyntheticTypeLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntheticTypeLiteral1530); 

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
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:670:1: ruleSyntheticTypeLiteral returns [EObject current=null] : ( ( () otherlv_1= 'Callback' ) | ( () otherlv_3= 'Error' ) | ( () otherlv_5= '$Void' ) ) ;
    public final EObject ruleSyntheticTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:673:28: ( ( ( () otherlv_1= 'Callback' ) | ( () otherlv_3= 'Error' ) | ( () otherlv_5= '$Void' ) ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:674:1: ( ( () otherlv_1= 'Callback' ) | ( () otherlv_3= 'Error' ) | ( () otherlv_5= '$Void' ) )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:674:1: ( ( () otherlv_1= 'Callback' ) | ( () otherlv_3= 'Error' ) | ( () otherlv_5= '$Void' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:674:2: ( () otherlv_1= 'Callback' )
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:674:2: ( () otherlv_1= 'Callback' )
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:674:3: () otherlv_1= 'Callback'
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:674:3: ()
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:675:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSyntheticTypeLiteralAccess().getCallbackLiteralAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSyntheticTypeLiteral1577); 

                        	newLeafNode(otherlv_1, grammarAccess.getSyntheticTypeLiteralAccess().getCallbackKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:685:6: ( () otherlv_3= 'Error' )
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:685:6: ( () otherlv_3= 'Error' )
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:685:7: () otherlv_3= 'Error'
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:685:7: ()
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:686:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSyntheticTypeLiteralAccess().getCallbackErrorResponseLiteralAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSyntheticTypeLiteral1606); 

                        	newLeafNode(otherlv_3, grammarAccess.getSyntheticTypeLiteralAccess().getErrorKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:696:6: ( () otherlv_5= '$Void' )
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:696:6: ( () otherlv_5= '$Void' )
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:696:7: () otherlv_5= '$Void'
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:696:7: ()
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:697:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSyntheticTypeLiteralAccess().getVoidLiteralAction_2_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleSyntheticTypeLiteral1635); 

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


    // $ANTLR start "ruleBuiltinTypes"
    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:714:1: ruleBuiltinTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'URL' ) | (enumLiteral_4= 'Text' ) | (enumLiteral_5= 'Number' ) | (enumLiteral_6= 'Email' ) | (enumLiteral_7= 'Phone' ) | (enumLiteral_8= 'Date' ) | (enumLiteral_9= 'Password' ) ) ;
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
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:716:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'URL' ) | (enumLiteral_4= 'Text' ) | (enumLiteral_5= 'Number' ) | (enumLiteral_6= 'Email' ) | (enumLiteral_7= 'Phone' ) | (enumLiteral_8= 'Date' ) | (enumLiteral_9= 'Password' ) ) )
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:717:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'URL' ) | (enumLiteral_4= 'Text' ) | (enumLiteral_5= 'Number' ) | (enumLiteral_6= 'Email' ) | (enumLiteral_7= 'Phone' ) | (enumLiteral_8= 'Date' ) | (enumLiteral_9= 'Password' ) )
            {
            // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:717:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Boolean' ) | (enumLiteral_2= 'Integer' ) | (enumLiteral_3= 'URL' ) | (enumLiteral_4= 'Text' ) | (enumLiteral_5= 'Number' ) | (enumLiteral_6= 'Email' ) | (enumLiteral_7= 'Phone' ) | (enumLiteral_8= 'Date' ) | (enumLiteral_9= 'Password' ) )
            int alt10=10;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            case 27:
                {
                alt10=4;
                }
                break;
            case 28:
                {
                alt10=5;
                }
                break;
            case 29:
                {
                alt10=6;
                }
                break;
            case 30:
                {
                alt10=7;
                }
                break;
            case 31:
                {
                alt10=8;
                }
                break;
            case 32:
                {
                alt10=9;
                }
                break;
            case 33:
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
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:717:2: (enumLiteral_0= 'String' )
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:717:2: (enumLiteral_0= 'String' )
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:717:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_24_in_ruleBuiltinTypes1686); 

                            current = grammarAccess.getBuiltinTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBuiltinTypesAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:723:6: (enumLiteral_1= 'Boolean' )
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:723:6: (enumLiteral_1= 'Boolean' )
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:723:8: enumLiteral_1= 'Boolean'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleBuiltinTypes1703); 

                            current = grammarAccess.getBuiltinTypesAccess().getBooleanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBuiltinTypesAccess().getBooleanEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:729:6: (enumLiteral_2= 'Integer' )
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:729:6: (enumLiteral_2= 'Integer' )
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:729:8: enumLiteral_2= 'Integer'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_26_in_ruleBuiltinTypes1720); 

                            current = grammarAccess.getBuiltinTypesAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBuiltinTypesAccess().getIntegerEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:735:6: (enumLiteral_3= 'URL' )
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:735:6: (enumLiteral_3= 'URL' )
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:735:8: enumLiteral_3= 'URL'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_27_in_ruleBuiltinTypes1737); 

                            current = grammarAccess.getBuiltinTypesAccess().getUrlEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBuiltinTypesAccess().getUrlEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:741:6: (enumLiteral_4= 'Text' )
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:741:6: (enumLiteral_4= 'Text' )
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:741:8: enumLiteral_4= 'Text'
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_28_in_ruleBuiltinTypes1754); 

                            current = grammarAccess.getBuiltinTypesAccess().getTextEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getBuiltinTypesAccess().getTextEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:747:6: (enumLiteral_5= 'Number' )
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:747:6: (enumLiteral_5= 'Number' )
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:747:8: enumLiteral_5= 'Number'
                    {
                    enumLiteral_5=(Token)match(input,29,FOLLOW_29_in_ruleBuiltinTypes1771); 

                            current = grammarAccess.getBuiltinTypesAccess().getNumberEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getBuiltinTypesAccess().getNumberEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:753:6: (enumLiteral_6= 'Email' )
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:753:6: (enumLiteral_6= 'Email' )
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:753:8: enumLiteral_6= 'Email'
                    {
                    enumLiteral_6=(Token)match(input,30,FOLLOW_30_in_ruleBuiltinTypes1788); 

                            current = grammarAccess.getBuiltinTypesAccess().getEmailEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getBuiltinTypesAccess().getEmailEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:759:6: (enumLiteral_7= 'Phone' )
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:759:6: (enumLiteral_7= 'Phone' )
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:759:8: enumLiteral_7= 'Phone'
                    {
                    enumLiteral_7=(Token)match(input,31,FOLLOW_31_in_ruleBuiltinTypes1805); 

                            current = grammarAccess.getBuiltinTypesAccess().getPhoneEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getBuiltinTypesAccess().getPhoneEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:765:6: (enumLiteral_8= 'Date' )
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:765:6: (enumLiteral_8= 'Date' )
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:765:8: enumLiteral_8= 'Date'
                    {
                    enumLiteral_8=(Token)match(input,32,FOLLOW_32_in_ruleBuiltinTypes1822); 

                            current = grammarAccess.getBuiltinTypesAccess().getDateEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getBuiltinTypesAccess().getDateEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:771:6: (enumLiteral_9= 'Password' )
                    {
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:771:6: (enumLiteral_9= 'Password' )
                    // ../nl.dslmeinte.simscript.structure/src-gen/nl/dslmeinte/simscript/structure/parser/antlr/internal/InternalSimStructureDsl.g:771:8: enumLiteral_9= 'Password'
                    {
                    enumLiteral_9=(Token)match(input,33,FOLLOW_33_in_ruleBuiltinTypes1839); 

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


 

    public static final BitSet FOLLOW_ruleStructureModel_in_entryRuleStructureModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinedType_in_ruleStructureModel130 = new BitSet(new long[]{0x0000000000020802L});
    public static final BitSet FOLLOW_ruleDefinedType_in_entryRuleDefinedType166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinedType176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureDefinition_in_ruleDefinedType223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_ruleDefinedType250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureDefinition_in_entryRuleStructureDefinition285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureDefinition295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStructureDefinition332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureDefinition349 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleStructureDefinition372 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructureDefinition398 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleStructureDefinition419 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleStructureDefinition432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature520 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleFeature543 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFeature569 = new BitSet(new long[]{0x00000003FFE80010L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_ruleFeature590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationDefinition636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEnumerationDefinition673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationDefinition690 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEnumerationDefinition707 = new BitSet(new long[]{0x0000000000004070L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumerationDefinition728 = new BitSet(new long[]{0x0000000000004070L});
    public static final BitSet FOLLOW_14_in_ruleEnumerationDefinition741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationName_in_ruleEnumerationLiteral833 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEnumerationLiteral845 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumerationLiteral862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationName_in_entryRuleEnumerationName904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationName915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationName955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumerationName981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumerationName1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_entryRuleTypeLiteral1052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeLiteral1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypeLiteral_in_ruleTypeLiteral1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinedTypeLiteral_in_ruleTypeLiteral1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListTypeLiteral_in_ruleTypeLiteral1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntheticTypeLiteral_in_ruleTypeLiteral1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypeLiteral_in_entryRuleBuiltinTypeLiteral1225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBuiltinTypeLiteral1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBuiltinTypes_in_ruleBuiltinTypeLiteral1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinedTypeLiteral_in_entryRuleDefinedTypeLiteral1315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinedTypeLiteral1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefinedTypeLiteral1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListTypeLiteral_in_entryRuleListTypeLiteral1404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListTypeLiteral1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleListTypeLiteral1451 = new BitSet(new long[]{0x00000003FFE80010L});
    public static final BitSet FOLLOW_ruleTypeLiteral_in_ruleListTypeLiteral1472 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleListTypeLiteral1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntheticTypeLiteral_in_entryRuleSyntheticTypeLiteral1520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntheticTypeLiteral1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSyntheticTypeLiteral1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSyntheticTypeLiteral1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSyntheticTypeLiteral1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBuiltinTypes1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBuiltinTypes1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBuiltinTypes1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBuiltinTypes1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBuiltinTypes1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBuiltinTypes1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBuiltinTypes1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBuiltinTypes1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBuiltinTypes1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBuiltinTypes1839 = new BitSet(new long[]{0x0000000000000002L});

}
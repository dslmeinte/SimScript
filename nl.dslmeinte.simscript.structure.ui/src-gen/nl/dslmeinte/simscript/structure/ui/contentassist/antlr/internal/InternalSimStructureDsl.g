/*
* generated by Xtext
*/
grammar InternalSimStructureDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package nl.dslmeinte.simscript.structure.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleStructureModel
entryRuleStructureModel 
:
{ before(grammarAccess.getStructureModelRule()); }
	 ruleStructureModel
{ after(grammarAccess.getStructureModelRule()); } 
	 EOF 
;

// Rule StructureModel
ruleStructureModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStructureModelAccess().getTypeDefinitionsAssignment()); }
(rule__StructureModel__TypeDefinitionsAssignment)*
{ after(grammarAccess.getStructureModelAccess().getTypeDefinitionsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDefinedType
entryRuleDefinedType 
:
{ before(grammarAccess.getDefinedTypeRule()); }
	 ruleDefinedType
{ after(grammarAccess.getDefinedTypeRule()); } 
	 EOF 
;

// Rule DefinedType
ruleDefinedType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDefinedTypeAccess().getAlternatives()); }
(rule__DefinedType__Alternatives)
{ after(grammarAccess.getDefinedTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStructureDefinition
entryRuleStructureDefinition 
:
{ before(grammarAccess.getStructureDefinitionRule()); }
	 ruleStructureDefinition
{ after(grammarAccess.getStructureDefinitionRule()); } 
	 EOF 
;

// Rule StructureDefinition
ruleStructureDefinition
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStructureDefinitionAccess().getGroup()); }
(rule__StructureDefinition__Group__0)
{ after(grammarAccess.getStructureDefinitionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFeature
entryRuleFeature 
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFeatureAccess().getGroup()); }
(rule__Feature__Group__0)
{ after(grammarAccess.getFeatureAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEnumerationDefinition
entryRuleEnumerationDefinition 
:
{ before(grammarAccess.getEnumerationDefinitionRule()); }
	 ruleEnumerationDefinition
{ after(grammarAccess.getEnumerationDefinitionRule()); } 
	 EOF 
;

// Rule EnumerationDefinition
ruleEnumerationDefinition
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEnumerationDefinitionAccess().getGroup()); }
(rule__EnumerationDefinition__Group__0)
{ after(grammarAccess.getEnumerationDefinitionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEnumerationLiteral
entryRuleEnumerationLiteral 
:
{ before(grammarAccess.getEnumerationLiteralRule()); }
	 ruleEnumerationLiteral
{ after(grammarAccess.getEnumerationLiteralRule()); } 
	 EOF 
;

// Rule EnumerationLiteral
ruleEnumerationLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEnumerationLiteralAccess().getGroup()); }
(rule__EnumerationLiteral__Group__0)
{ after(grammarAccess.getEnumerationLiteralAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEnumerationName
entryRuleEnumerationName 
:
{ before(grammarAccess.getEnumerationNameRule()); }
	 ruleEnumerationName
{ after(grammarAccess.getEnumerationNameRule()); } 
	 EOF 
;

// Rule EnumerationName
ruleEnumerationName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEnumerationNameAccess().getAlternatives()); }
(rule__EnumerationName__Alternatives)
{ after(grammarAccess.getEnumerationNameAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTypeLiteral
entryRuleTypeLiteral 
:
{ before(grammarAccess.getTypeLiteralRule()); }
	 ruleTypeLiteral
{ after(grammarAccess.getTypeLiteralRule()); } 
	 EOF 
;

// Rule TypeLiteral
ruleTypeLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTypeLiteralAccess().getAlternatives()); }
(rule__TypeLiteral__Alternatives)
{ after(grammarAccess.getTypeLiteralAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBuiltinTypeLiteral
entryRuleBuiltinTypeLiteral 
:
{ before(grammarAccess.getBuiltinTypeLiteralRule()); }
	 ruleBuiltinTypeLiteral
{ after(grammarAccess.getBuiltinTypeLiteralRule()); } 
	 EOF 
;

// Rule BuiltinTypeLiteral
ruleBuiltinTypeLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBuiltinTypeLiteralAccess().getBuiltinAssignment()); }
(rule__BuiltinTypeLiteral__BuiltinAssignment)
{ after(grammarAccess.getBuiltinTypeLiteralAccess().getBuiltinAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDefinedTypeLiteral
entryRuleDefinedTypeLiteral 
:
{ before(grammarAccess.getDefinedTypeLiteralRule()); }
	 ruleDefinedTypeLiteral
{ after(grammarAccess.getDefinedTypeLiteralRule()); } 
	 EOF 
;

// Rule DefinedTypeLiteral
ruleDefinedTypeLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDefinedTypeLiteralAccess().getTypeAssignment()); }
(rule__DefinedTypeLiteral__TypeAssignment)
{ after(grammarAccess.getDefinedTypeLiteralAccess().getTypeAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleListTypeLiteral
entryRuleListTypeLiteral 
:
{ before(grammarAccess.getListTypeLiteralRule()); }
	 ruleListTypeLiteral
{ after(grammarAccess.getListTypeLiteralRule()); } 
	 EOF 
;

// Rule ListTypeLiteral
ruleListTypeLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getListTypeLiteralAccess().getGroup()); }
(rule__ListTypeLiteral__Group__0)
{ after(grammarAccess.getListTypeLiteralAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSyntheticTypeLiteral
entryRuleSyntheticTypeLiteral 
:
{ before(grammarAccess.getSyntheticTypeLiteralRule()); }
	 ruleSyntheticTypeLiteral
{ after(grammarAccess.getSyntheticTypeLiteralRule()); } 
	 EOF 
;

// Rule SyntheticTypeLiteral
ruleSyntheticTypeLiteral
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSyntheticTypeLiteralAccess().getAlternatives()); }
(rule__SyntheticTypeLiteral__Alternatives)
{ after(grammarAccess.getSyntheticTypeLiteralAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule BuiltinTypes
ruleBuiltinTypes
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuiltinTypesAccess().getAlternatives()); }
(rule__BuiltinTypes__Alternatives)
{ after(grammarAccess.getBuiltinTypesAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__DefinedType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDefinedTypeAccess().getStructureDefinitionParserRuleCall_0()); }
	ruleStructureDefinition
{ after(grammarAccess.getDefinedTypeAccess().getStructureDefinitionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getDefinedTypeAccess().getEnumerationDefinitionParserRuleCall_1()); }
	ruleEnumerationDefinition
{ after(grammarAccess.getDefinedTypeAccess().getEnumerationDefinitionParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationName__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getEnumerationNameAccess().getIDTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getEnumerationNameAccess().getSTRINGTerminalRuleCall_1()); }
	RULE_STRING
{ after(grammarAccess.getEnumerationNameAccess().getSTRINGTerminalRuleCall_1()); }
)

    |(
{ before(grammarAccess.getEnumerationNameAccess().getINTTerminalRuleCall_2()); }
	RULE_INT
{ after(grammarAccess.getEnumerationNameAccess().getINTTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TypeLiteral__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeLiteralAccess().getBuiltinTypeLiteralParserRuleCall_0()); }
	ruleBuiltinTypeLiteral
{ after(grammarAccess.getTypeLiteralAccess().getBuiltinTypeLiteralParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getTypeLiteralAccess().getDefinedTypeLiteralParserRuleCall_1()); }
	ruleDefinedTypeLiteral
{ after(grammarAccess.getTypeLiteralAccess().getDefinedTypeLiteralParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getTypeLiteralAccess().getListTypeLiteralParserRuleCall_2()); }
	ruleListTypeLiteral
{ after(grammarAccess.getTypeLiteralAccess().getListTypeLiteralParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getTypeLiteralAccess().getSyntheticTypeLiteralParserRuleCall_3()); }
	ruleSyntheticTypeLiteral
{ after(grammarAccess.getTypeLiteralAccess().getSyntheticTypeLiteralParserRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SyntheticTypeLiteral__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_0()); }
(rule__SyntheticTypeLiteral__Group_0__0)
{ after(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_1()); }
(rule__SyntheticTypeLiteral__Group_1__0)
{ after(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_1()); }
)

    |(
{ before(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_2()); }
(rule__SyntheticTypeLiteral__Group_2__0)
{ after(grammarAccess.getSyntheticTypeLiteralAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BuiltinTypes__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuiltinTypesAccess().getStringEnumLiteralDeclaration_0()); }
(	'String' 
)
{ after(grammarAccess.getBuiltinTypesAccess().getStringEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getBuiltinTypesAccess().getBooleanEnumLiteralDeclaration_1()); }
(	'Boolean' 
)
{ after(grammarAccess.getBuiltinTypesAccess().getBooleanEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getBuiltinTypesAccess().getIntegerEnumLiteralDeclaration_2()); }
(	'Integer' 
)
{ after(grammarAccess.getBuiltinTypesAccess().getIntegerEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getBuiltinTypesAccess().getUrlEnumLiteralDeclaration_3()); }
(	'URL' 
)
{ after(grammarAccess.getBuiltinTypesAccess().getUrlEnumLiteralDeclaration_3()); }
)

    |(
{ before(grammarAccess.getBuiltinTypesAccess().getTextEnumLiteralDeclaration_4()); }
(	'Text' 
)
{ after(grammarAccess.getBuiltinTypesAccess().getTextEnumLiteralDeclaration_4()); }
)

    |(
{ before(grammarAccess.getBuiltinTypesAccess().getNumberEnumLiteralDeclaration_5()); }
(	'Number' 
)
{ after(grammarAccess.getBuiltinTypesAccess().getNumberEnumLiteralDeclaration_5()); }
)

    |(
{ before(grammarAccess.getBuiltinTypesAccess().getEmailEnumLiteralDeclaration_6()); }
(	'Email' 
)
{ after(grammarAccess.getBuiltinTypesAccess().getEmailEnumLiteralDeclaration_6()); }
)

    |(
{ before(grammarAccess.getBuiltinTypesAccess().getPhoneEnumLiteralDeclaration_7()); }
(	'Phone' 
)
{ after(grammarAccess.getBuiltinTypesAccess().getPhoneEnumLiteralDeclaration_7()); }
)

    |(
{ before(grammarAccess.getBuiltinTypesAccess().getDateEnumLiteralDeclaration_8()); }
(	'Date' 
)
{ after(grammarAccess.getBuiltinTypesAccess().getDateEnumLiteralDeclaration_8()); }
)

    |(
{ before(grammarAccess.getBuiltinTypesAccess().getPasswordEnumLiteralDeclaration_9()); }
(	'Password' 
)
{ after(grammarAccess.getBuiltinTypesAccess().getPasswordEnumLiteralDeclaration_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__StructureDefinition__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StructureDefinition__Group__0__Impl
	rule__StructureDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StructureDefinition__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructureDefinitionAccess().getStructureKeyword_0()); }

	'structure' 

{ after(grammarAccess.getStructureDefinitionAccess().getStructureKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StructureDefinition__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StructureDefinition__Group__1__Impl
	rule__StructureDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StructureDefinition__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructureDefinitionAccess().getNameAssignment_1()); }
(rule__StructureDefinition__NameAssignment_1)
{ after(grammarAccess.getStructureDefinitionAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StructureDefinition__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StructureDefinition__Group__2__Impl
	rule__StructureDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StructureDefinition__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructureDefinitionAccess().getPersistentAssignment_2()); }
(rule__StructureDefinition__PersistentAssignment_2)?
{ after(grammarAccess.getStructureDefinitionAccess().getPersistentAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StructureDefinition__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StructureDefinition__Group__3__Impl
	rule__StructureDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StructureDefinition__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructureDefinitionAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getStructureDefinitionAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StructureDefinition__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StructureDefinition__Group__4__Impl
	rule__StructureDefinition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StructureDefinition__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructureDefinitionAccess().getFeaturesAssignment_4()); }
(rule__StructureDefinition__FeaturesAssignment_4)*
{ after(grammarAccess.getStructureDefinitionAccess().getFeaturesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StructureDefinition__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StructureDefinition__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StructureDefinition__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructureDefinitionAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getStructureDefinitionAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Feature__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__0__Impl
	rule__Feature__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getNameAssignment_0()); }
(rule__Feature__NameAssignment_0)
{ after(grammarAccess.getFeatureAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__1__Impl
	rule__Feature__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getOptionalAssignment_1()); }
(rule__Feature__OptionalAssignment_1)?
{ after(grammarAccess.getFeatureAccess().getOptionalAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__2__Impl
	rule__Feature__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getFeatureAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); }
(rule__Feature__TypeAssignment_3)
{ after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__EnumerationDefinition__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EnumerationDefinition__Group__0__Impl
	rule__EnumerationDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationDefinition__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationDefinitionAccess().getEnumerationKeyword_0()); }

	'enumeration' 

{ after(grammarAccess.getEnumerationDefinitionAccess().getEnumerationKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationDefinition__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EnumerationDefinition__Group__1__Impl
	rule__EnumerationDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationDefinition__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationDefinitionAccess().getNameAssignment_1()); }
(rule__EnumerationDefinition__NameAssignment_1)
{ after(grammarAccess.getEnumerationDefinitionAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationDefinition__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EnumerationDefinition__Group__2__Impl
	rule__EnumerationDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationDefinition__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationDefinitionAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getEnumerationDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationDefinition__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EnumerationDefinition__Group__3__Impl
	rule__EnumerationDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationDefinition__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationDefinitionAccess().getLiteralsAssignment_3()); }
(rule__EnumerationDefinition__LiteralsAssignment_3)*
{ after(grammarAccess.getEnumerationDefinitionAccess().getLiteralsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationDefinition__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EnumerationDefinition__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationDefinition__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationDefinitionAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getEnumerationDefinitionAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__EnumerationLiteral__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EnumerationLiteral__Group__0__Impl
	rule__EnumerationLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); }
(rule__EnumerationLiteral__NameAssignment_0)
{ after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationLiteral__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EnumerationLiteral__Group__1__Impl
	rule__EnumerationLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationLiteralAccess().getHyphenMinusGreaterThanSignKeyword_1()); }

	'->' 

{ after(grammarAccess.getEnumerationLiteralAccess().getHyphenMinusGreaterThanSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationLiteral__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EnumerationLiteral__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationLiteralAccess().getDisplayNameAssignment_2()); }
(rule__EnumerationLiteral__DisplayNameAssignment_2)
{ after(grammarAccess.getEnumerationLiteralAccess().getDisplayNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ListTypeLiteral__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListTypeLiteral__Group__0__Impl
	rule__ListTypeLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTypeLiteral__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListTypeLiteralAccess().getLeftSquareBracketKeyword_0()); }

	'[' 

{ after(grammarAccess.getListTypeLiteralAccess().getLeftSquareBracketKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ListTypeLiteral__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListTypeLiteral__Group__1__Impl
	rule__ListTypeLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTypeLiteral__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListTypeLiteralAccess().getItemTypeAssignment_1()); }
(rule__ListTypeLiteral__ItemTypeAssignment_1)
{ after(grammarAccess.getListTypeLiteralAccess().getItemTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ListTypeLiteral__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListTypeLiteral__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListTypeLiteral__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListTypeLiteralAccess().getRightSquareBracketKeyword_2()); }

	']' 

{ after(grammarAccess.getListTypeLiteralAccess().getRightSquareBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__SyntheticTypeLiteral__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SyntheticTypeLiteral__Group_0__0__Impl
	rule__SyntheticTypeLiteral__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SyntheticTypeLiteral__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSyntheticTypeLiteralAccess().getCallbackLiteralAction_0_0()); }
(

)
{ after(grammarAccess.getSyntheticTypeLiteralAccess().getCallbackLiteralAction_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SyntheticTypeLiteral__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SyntheticTypeLiteral__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SyntheticTypeLiteral__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSyntheticTypeLiteralAccess().getCallbackKeyword_0_1()); }

	'Callback' 

{ after(grammarAccess.getSyntheticTypeLiteralAccess().getCallbackKeyword_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__SyntheticTypeLiteral__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SyntheticTypeLiteral__Group_1__0__Impl
	rule__SyntheticTypeLiteral__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SyntheticTypeLiteral__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSyntheticTypeLiteralAccess().getCallbackErrorResponseLiteralAction_1_0()); }
(

)
{ after(grammarAccess.getSyntheticTypeLiteralAccess().getCallbackErrorResponseLiteralAction_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SyntheticTypeLiteral__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SyntheticTypeLiteral__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SyntheticTypeLiteral__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSyntheticTypeLiteralAccess().getErrorKeyword_1_1()); }

	'Error' 

{ after(grammarAccess.getSyntheticTypeLiteralAccess().getErrorKeyword_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__SyntheticTypeLiteral__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SyntheticTypeLiteral__Group_2__0__Impl
	rule__SyntheticTypeLiteral__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SyntheticTypeLiteral__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSyntheticTypeLiteralAccess().getVoidLiteralAction_2_0()); }
(

)
{ after(grammarAccess.getSyntheticTypeLiteralAccess().getVoidLiteralAction_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SyntheticTypeLiteral__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SyntheticTypeLiteral__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SyntheticTypeLiteral__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSyntheticTypeLiteralAccess().getVoidKeyword_2_1()); }

	'$Void' 

{ after(grammarAccess.getSyntheticTypeLiteralAccess().getVoidKeyword_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__StructureModel__TypeDefinitionsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructureModelAccess().getTypeDefinitionsDefinedTypeParserRuleCall_0()); }
	ruleDefinedType{ after(grammarAccess.getStructureModelAccess().getTypeDefinitionsDefinedTypeParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__StructureDefinition__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructureDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getStructureDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__StructureDefinition__PersistentAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructureDefinitionAccess().getPersistentPersistentKeyword_2_0()); }
(
{ before(grammarAccess.getStructureDefinitionAccess().getPersistentPersistentKeyword_2_0()); }

	'persistent' 

{ after(grammarAccess.getStructureDefinitionAccess().getPersistentPersistentKeyword_2_0()); }
)

{ after(grammarAccess.getStructureDefinitionAccess().getPersistentPersistentKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__StructureDefinition__FeaturesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructureDefinitionAccess().getFeaturesFeatureParserRuleCall_4_0()); }
	ruleFeature{ after(grammarAccess.getStructureDefinitionAccess().getFeaturesFeatureParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__OptionalAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getOptionalOptionalKeyword_1_0()); }
(
{ before(grammarAccess.getFeatureAccess().getOptionalOptionalKeyword_1_0()); }

	'optional' 

{ after(grammarAccess.getFeatureAccess().getOptionalOptionalKeyword_1_0()); }
)

{ after(grammarAccess.getFeatureAccess().getOptionalOptionalKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__TypeAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getTypeTypeLiteralParserRuleCall_3_0()); }
	ruleTypeLiteral{ after(grammarAccess.getFeatureAccess().getTypeTypeLiteralParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationDefinition__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getEnumerationDefinitionAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationDefinition__LiteralsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationDefinitionAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); }
	ruleEnumerationLiteral{ after(grammarAccess.getEnumerationDefinitionAccess().getLiteralsEnumerationLiteralParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationLiteralAccess().getNameEnumerationNameParserRuleCall_0_0()); }
	ruleEnumerationName{ after(grammarAccess.getEnumerationLiteralAccess().getNameEnumerationNameParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__DisplayNameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEnumerationLiteralAccess().getDisplayNameSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getEnumerationLiteralAccess().getDisplayNameSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BuiltinTypeLiteral__BuiltinAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBuiltinTypeLiteralAccess().getBuiltinBuiltinTypesEnumRuleCall_0()); }
	ruleBuiltinTypes{ after(grammarAccess.getBuiltinTypeLiteralAccess().getBuiltinBuiltinTypesEnumRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DefinedTypeLiteral__TypeAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDefinedTypeLiteralAccess().getTypeDefinedTypeCrossReference_0()); }
(
{ before(grammarAccess.getDefinedTypeLiteralAccess().getTypeDefinedTypeIDTerminalRuleCall_0_1()); }
	RULE_ID{ after(grammarAccess.getDefinedTypeLiteralAccess().getTypeDefinedTypeIDTerminalRuleCall_0_1()); }
)
{ after(grammarAccess.getDefinedTypeLiteralAccess().getTypeDefinedTypeCrossReference_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ListTypeLiteral__ItemTypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListTypeLiteralAccess().getItemTypeTypeLiteralParserRuleCall_1_0()); }
	ruleTypeLiteral{ after(grammarAccess.getListTypeLiteralAccess().getItemTypeTypeLiteralParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



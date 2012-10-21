package com.simlike.simscript.generator.ui

import com.google.inject.Inject
import com.google.inject.Provider
import com.google.inject.Singleton
import com.simlike.simscript.generator.ui.js.CommunicationsGenerator
import com.simlike.simscript.generator.ui.js.ElementsGenerator
import com.simlike.simscript.generator.ui.js.JavaScriptUtil
import com.simlike.simscript.ui.extensions.StructuralExtensions
import com.simlike.simscript.ui.simUiDsl.UiModule
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Generator for JavaScript (and some HTML) code related to a UI module in SimScript-UI.
 * 
 * Assumptions:
 * 1.) elements and similar constructs should have a templateCreate function to generate the javascript
 * 	This function should generate valid javascript and thus end with a semicolon (;) if needed.
 * 2.) statements and expressions should have an asJs function to generate the javascript
 * 3.) the asJs functions return Observables 
 * 		e.g. the asJs of the expression 'deal.name' returns 'deal.getName()' 
 * 		and for the Stringliteral "string" it returns new Item("string")
 * 
 * TODO  move these assumptions to sub generators
 * 
 * @author Meinte Boersma, Volker Lanting
 */
@Singleton
class UserInterfaceGenerator {

	@Inject extension StructuralExtensions
	@Inject Provider<ElementsGenerator> elementsGeneratorProvider
	@Inject extension CommunicationsGenerator
	@Inject extension JavaScriptUtil

	def generate(UiModule it, IFileSystemAccess fsa) {
		fsa.generateFile(name + ".js", jsFile)
		fsa.generateFile("perModuleTest/" + name + ".html", htmlFile)
	}

	def htmlFile(UiModule it)
		'''
		<html>
		<head>
			<title>«name»</title>

			<!-- type system: -->
			<script src="../../sim-lib/js-type-system.js" type="text/javascript"></script>
			<script src="../structureMapper.js" type="text/javascript"></script>«/* note: currently relies on a symbolic link to work */»

			<!-- widgets: -->
			<link rel="stylesheet" href="../../sim-lib/widgets.css"></link>
			<script src="../../sim-lib/widgets.js" type="text/javascript"></script>

			<!-- default CSS: -->
			<link rel="stylesheet" href="../../sim-lib/default-style.css"></link>

			<script type="text/javascript" src="../«name».js"></script>
			«FOR moduleName : referredModules.map[it.name].toSet»
				<script src="../«moduleName».js" type="text/javascript"></script>
			«ENDFOR»

			<script>
			$(document).ready(function() {
				«name».enter(new Item({« /*
					authsimid:"afbdd344-da82-4917-ab5b-731a23cccaac", 
					simtoken:"8fe00894bae0f4b3358baaa2cee735deb9b07d56f948154a423a79d86fa20988"
				 */ »}));
			});
			</script>
		</head>
		<body>

			<div id="_modalBackground"></div>
			<div id="_modal">
				<div id="_modalContent">
				</div>
			</div>

			<div id="_content"></div>

		</body>
		</html>
		'''


	private extension ElementsGenerator elementsGenerator

	def jsFile(UiModule it) {
		elementsGenerator = elementsGeneratorProvider.get
		'''
		var «name» = new function() {
			var globalModuleAuthenticationInfo = null;

			«FOR definition : definitions»
				«definition.jsFunction»
			«ENDFOR»

			«interfaceFunctions»

			«elementsGenerator.enumerationFunctions»

			this.enter = function(«firstScreen.parameters.map[jsName + ', '].join»authenticationInfo) {
				globalModuleAuthenticationInfo = authenticationInfo;
				«IF firstScreen == null»
					alert('no 1st screen defined');
				«ELSE»
					this.«firstScreen.name»(«firstScreen.parameters.map[jsName + ', '].join» $('#_content'));
				«ENDIF»
			};
		}();
		'''
	}

}

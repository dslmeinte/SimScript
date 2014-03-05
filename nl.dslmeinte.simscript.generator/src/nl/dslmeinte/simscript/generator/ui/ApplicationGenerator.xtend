package nl.dslmeinte.simscript.generator.ui

import com.google.inject.Inject
import nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel
import nl.dslmeinte.simscript.extensions.ApplicationExtensions
import nl.dslmeinte.simscript.ui.extensions.StructuralExtensions

class ApplicationGenerator {

	@Inject extension StructuralExtensions
	@Inject extension ApplicationExtensions


	def generateHtml(ApplicationModel it) {
		'''
		<!DOCTYPE html>
		<html>
			<head>
				<title>«title»</title>
				<!-- type system & widgets: -->
				<script src="../sim-lib/js-type-system.js" type="text/javascript"></script>
				<script src="../sim-lib/widgets.js" type="text/javascript"></script>
				<script src="structureMapper.js" type="text/javascript"></script>«/* note: currently relies on a symbolic link to work */»
				<!-- modules: -->
				«FOR moduleName : allReferredModules.map[it.name].toSet»
					<script src="«moduleName».js" type="text/javascript"></script>
				«ENDFOR»
				«IF defaultCSS»
					<!-- default CSS: -->
					<link rel="stylesheet" href="../sim-lib/default-style.css"></link>
					<link rel="stylesheet" href="../sim-lib/widgets.css"></link>
				«ENDIF»
				«IF !includeCSSs.empty»
					<!-- included CSS: -->
					«FOR cssInclude : includeCSSs»
						<link rel="stylesheet" type="text/css" href="«cssInclude»" />
					«ENDFOR»
				«ENDIF»
				«IF !includeCustomJS.empty»
					<!-- included custom JS: -->
					«FOR jsCustomInclude : includeCustomJS»
						<script src="../«jsCustomInclude».js" type="text/javascript"></script>
					«ENDFOR»
				«ENDIF»

				<script>
				$(document).ready(function() {
					«entryModule.name».enter(new Item({« /*
						authsimid:"afbdd344-da82-4917-ab5b-731a23cccaac", 
						simtoken:"8fe00894bae0f4b3358baaa2cee735deb9b07d56f948154a423a79d86fa20988"
					 */ »}));
				});
				«IF genericBackButtonPrevention»
					$(window).on('beforeunload', function() {
						if( preventUserFromExiting != null && preventUserFromExiting() ) {« /* qualify(/specify) preventUserFromExiting? */ »
							return "Weet je zeker dat je deze applicatie wilt verlaten?";
						}
					});
				«ENDIF»
				</script>
				
				«IF CHtmlHead != null»
					«CHtmlHead»
				«ENDIF»
				
			</head>
			
			«IF CHtmlBody == null»
				<body>

					<div id="_menu"></div>

					<div id="_modalBackground"></div>
					<div id="_modal">
						<div id="_modalContent">
						</div>
					</div>

					<div id="_content"></div>

				</body>
			«ELSE»
				<body>
					<div id="_menu"></div>

					<div id="_modalBackground"></div>
					<div id="_modal">
						<div id="_modalContent">
					</div>
					
					«CHtmlBody»
				</body>
				«CHtmlBody»
			«ENDIF»
		</html>
		'''
	}
}

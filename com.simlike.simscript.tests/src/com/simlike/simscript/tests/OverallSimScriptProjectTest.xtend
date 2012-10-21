package com.simlike.simscript.tests

import java.io.File

import static junit.framework.Assert.*

class OverallSimScriptProjectTest extends XtextTestsSupport {

	def void test_parse_all_SimScript_files_in_src_main_java() {
		var nErrors = allFilesInOneResourceSet.reportFor
		assertTrue('''there were «nErrors» syntactic/semantic errors'''.toString, nErrors == 0)
	}

	private String outputPath = "src-gen"

	def void test_generate_all_SimScript_UI_files_in_src_main_java() {
		generateUiAndApp(allFilesInOneResourceSet, outputPath, false)
	}

	def allFilesInOneResourceSet() {
		val simlikeRepoDir = new File("../../")
		loadIntoOneResourceSet( gatherFiles(simlikeRepoDir).filter[it.path.contains("src/main/java")] )
	}

}

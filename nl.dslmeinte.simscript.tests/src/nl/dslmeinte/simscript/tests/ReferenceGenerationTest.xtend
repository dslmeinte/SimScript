package nl.dslmeinte.simscript.tests

import java.io.File

class ReferenceGenerationTest extends XtextTestsSupport {

	def void test_parse_and_generate_reference_test_() {
		val resourceSet = loadIntoOneResourceSet(gatherFiles(new File("src-ref-model/")))
		var nErrors = resourceSet.reportFor
		assertTrue('''there were «nErrors» syntactic/semantic errors'''.toString, nErrors == 0)
		generateUiAndApp(resourceSet, "src-ref-gen-gen", true)

		println("\ngenerated UI artifacts from reference model")
	}

	def static void main(String[] args) {
		val instance = new ReferenceGenerationTest()
		instance.setUp
		instance.test_parse_and_generate_reference_test_
//		instance.tearDown
	}

}

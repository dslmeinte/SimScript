package nl.dslmeinte.simscript.meta

import nl.dslmeinte.simscript.application.simApplicationDsl.SimApplicationDslPackage
import nl.dslmeinte.simscript.backend.simBackendDsl.SimBackendDslPackage
import nl.dslmeinte.simscript.mappings.mappingsDsl.MappingsDslPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipselabs.emfjson.EMFJs
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl
import nl.dslmeinte.simscript.naming.NamingPackage
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.SimpleDbDslPackage
import nl.dslmeinte.simscript.structure.structureDsl.StructureDslPackage
import nl.dslmeinte.simscript.types.TypesPackage
import nl.dslmeinte.simscript.ui.simUiDsl.SimUiDslPackage

class SerializeMetaModel {

	def static void main(String...args) {
		new SerializeMetaModel().serialize
	}

	private def void serialize() {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("json", new JsResourceFactoryImpl)
		val jsonResourceSet = new ResourceSetImpl
		val uri = URI.createFileURI('/Users/meinte/Documents/metaModel.json')
			// TODO  find a more correct way of determining a path
		val jsonResource = jsonResourceSet.createResource(uri)

		jsonResource.contents += #[
			SimApplicationDslPackage.eINSTANCE,
			SimBackendDslPackage.eINSTANCE,
			MappingsDslPackage.eINSTANCE,
			NamingPackage.eINSTANCE,
			SimpleDbDslPackage.eINSTANCE,
			StructureDslPackage.eINSTANCE,
			TypesPackage.eINSTANCE,
			SimUiDslPackage.eINSTANCE
		]
		jsonResource.save(#{ EMFJs.OPTION_INDENT_OUTPUT -> true, EMFJs.OPTION_SERIALIZE_TYPE -> true })

		println("serialized meta model to JSON")
	}

}

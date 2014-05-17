package nl.dslmeinte.simscript.generator

import com.google.inject.Singleton
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipselabs.emfjson.EMFJs
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl

@Singleton
class JsonSerialiser {

	new() {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("json", new JsResourceFactoryImpl)
	}

	def serialiseAsJson(ResourceSet resourceSet) {
		val jsonResourceSet = new ResourceSetImpl
		val uri = URI.createFileURI('/Users/meinte/Documents/model.json')
			// TODO  find a more correct way of determining a path
		val jsonResource = jsonResourceSet.createResource(uri)

		resourceSet.resources.forEach[jsonResource.contents += contents]
		jsonResource.save(#{ EMFJs.OPTION_INDENT_OUTPUT -> true, EMFJs.OPTION_SERIALIZE_TYPE -> true })

		println("serialized to JSON!")
	}

}

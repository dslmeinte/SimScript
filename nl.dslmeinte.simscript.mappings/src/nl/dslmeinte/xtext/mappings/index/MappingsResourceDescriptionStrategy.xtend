package nl.dslmeinte.simscript.mappings.index

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.util.XtextUtil
import nl.dslmeinte.simscript.mappings.mappingsDsl.MappingsModel
import nl.dslmeinte.simscript.mappings.mappingsDsl.NamedQueryDefinition
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IReferenceDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor

@Singleton
class MappingsResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	@Inject extension XtextUtil

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		createEObjectDescriptions_(eObject, acceptor)	// dispatch
	}

	def private dispatch createEObjectDescriptions_(MappingsModel it, IAcceptor<IEObjectDescription> acceptor) {
		true
	}

	def private dispatch createEObjectDescriptions_(NamedQueryDefinition it, IAcceptor<IEObjectDescription> acceptor) {
		exportName(name, acceptor)
		false
	}

	override createReferenceDescriptions(EObject from, URI exportedContainerURI, IAcceptor<IReferenceDescription> acceptor) {
		false
	}

}

package nl.dslmeinte.simscript.backend.index

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.backend.simBackendDsl.BackendModel
import nl.dslmeinte.simscript.backend.simBackendDsl.CrudService
import nl.dslmeinte.simscript.backend.simBackendDsl.NamedService
import nl.dslmeinte.simscript.util.XtextUtil
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IReferenceDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor

/*
 * Note: not wired yet, because it produces (strange) linking errors...
 */
@Singleton
class SimBackendResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	@Inject extension XtextUtil

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		createEObjectDescriptions_(eObject, acceptor)	// dispatch
	}

	def private dispatch createEObjectDescriptions_(BackendModel it, IAcceptor<IEObjectDescription> acceptor) {
		true
	}

	def private dispatch createEObjectDescriptions_(NamedService it, IAcceptor<IEObjectDescription> acceptor) {
		exportName(name, acceptor)
		false
	}

	def private dispatch createEObjectDescriptions_(CrudService it, IAcceptor<IEObjectDescription> acceptor) {
		for( type : services ) {
			exportName(type.literal + structure.name.toFirstUpper, acceptor)
		}
		false
	}

	override createReferenceDescriptions(EObject from, URI exportedContainerURI, IAcceptor<IReferenceDescription> acceptor) {
		false
	}

}

package nl.dslmeinte.simscript.simpleDb.index

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.util.XtextUtil
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.DataType
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.DatabaseModel
import nl.dslmeinte.simscript.simpleDb.simpleDbDsl.Table
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IReferenceDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor

@Singleton
class SimpleDbResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	@Inject extension XtextUtil

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		createEObjectDescriptions_(eObject, acceptor)	// dispatch
	}

	def private dispatch createEObjectDescriptions_(DatabaseModel it, IAcceptor<IEObjectDescription> acceptor) {
		true
	}

	def private dispatch createEObjectDescriptions_(Table it, IAcceptor<IEObjectDescription> acceptor) {
		exportName(name, acceptor)
		false
	}

	def private dispatch createEObjectDescriptions_(DataType it, IAcceptor<IEObjectDescription> acceptor) {
		false
	}


	override createReferenceDescriptions(EObject from, URI exportedContainerURI, IAcceptor<IReferenceDescription> acceptor) {
		false
	}

}

package com.simlike.simscript.structure.index

import com.google.inject.Inject
import com.google.inject.Singleton
import com.simlike.simscript.structure.structureDsl.DefinedType
import com.simlike.simscript.structure.structureDsl.StructureModel
import com.simlike.simscript.util.XtextUtil
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IReferenceDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor

@Singleton
class SimStructureResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	@Inject extension XtextUtil

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		createEObjectDescriptions_(eObject, acceptor)	// dispatch
	}

	def private dispatch createEObjectDescriptions_(StructureModel it, IAcceptor<IEObjectDescription> acceptor) {
		true
	}

	def private dispatch createEObjectDescriptions_(DefinedType it, IAcceptor<IEObjectDescription> acceptor) {
		exportName(name, acceptor)
		false
	}

	override createReferenceDescriptions(EObject from, URI exportedContainerURI, IAcceptor<IReferenceDescription> acceptor) {
		false
	}

}

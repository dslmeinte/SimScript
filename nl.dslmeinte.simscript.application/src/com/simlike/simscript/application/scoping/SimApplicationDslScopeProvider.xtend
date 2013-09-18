package nl.dslmeinte.simscript.application.scoping

import com.google.inject.Inject
import nl.dslmeinte.simscript.application.simApplicationDsl.ApplicationModel
import nl.dslmeinte.simscript.ui.extensions.StructuralExtensions
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

import static org.eclipse.xtext.scoping.Scopes.*

public class SimApplicationDslScopeProvider extends AbstractDeclarativeScopeProvider {

	@Inject extension StructuralExtensions


	def IScope scope_ApplicationModel_entryModule(ApplicationModel it, EReference eRef) {
		scopeFor(includedModules, [QualifiedName.create(name)], IScope.NULLSCOPE)
	}

}

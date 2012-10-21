 package nl.dslmeinte.xtext.simpleDb.scoping

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.xtext.simpleDb.extensions.SimpleDbExtensions
import nl.dslmeinte.xtext.simpleDb.simpleDbDsl.TablePrimaryIdentification
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

import static org.eclipse.xtext.scoping.Scopes.*

@Singleton
class SimpleDbDslScopeProvider extends AbstractDeclarativeScopeProvider {

	@Inject extension SimpleDbExtensions


	def IScope scope_TablePrimaryIdentification_primary(TablePrimaryIdentification it, EReference eRef) {
		scopeFor(table.simpleColumns.filter[primary])
	}

}

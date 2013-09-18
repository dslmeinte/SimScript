package nl.dslmeinte.simscript.ui.extensions.impl

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.ui.extensions.StructuralExtensions
import nl.dslmeinte.simscript.ui.extensions.ViewableExtensions
import nl.dslmeinte.simscript.ui.simUiDsl.Argument
import nl.dslmeinte.simscript.ui.simUiDsl.GotoModuleStatement
import nl.dslmeinte.simscript.ui.simUiDsl.GotoScreenStatement
import nl.dslmeinte.simscript.ui.simUiDsl.MethodDefinition
import nl.dslmeinte.simscript.ui.simUiDsl.Parameter
import nl.dslmeinte.simscript.ui.simUiDsl.TableRowsDefinition
import nl.dslmeinte.simscript.ui.simUiDsl.TableRowsInvocation
import nl.dslmeinte.simscript.ui.simUiDsl.TopLevelDefinition
import nl.dslmeinte.simscript.ui.simUiDsl.UiModule
import nl.dslmeinte.simscript.ui.simUiDsl.Viewable
import nl.dslmeinte.simscript.ui.simUiDsl.ViewableCallSite
import nl.dslmeinte.simscript.util.XtextUtil
import java.util.Set
import org.eclipse.emf.ecore.EObject

@Singleton
class StructuralExtensionsImpl implements StructuralExtensions {

	@Inject extension ViewableExtensions
	@Inject extension XtextUtil


	override name(UiModule it) {
		eResource.fileName
	}

	override isAuthenticated(UiModule it) {
		!notAuthenticated
	}
	
	override viewables(UiModule it) {
		definitions.filter(typeof(Viewable))
	}

	override tableRowsDefinitions(UiModule it) {
		definitions.filter(typeof(TableRowsDefinition))
	}

	override topLevelMethods(UiModule it) {
		definitions.filter(typeof(MethodDefinition)).map[method]
	}

	override firstScreen(UiModule it) {
		viewables.findFirst[screen]
	}

	override calledModules(UiModule it) {
		eAllContents.filter(typeof(GotoModuleStatement)).map[targetModule].toSet
	}

	override module(Viewable it) {
		eContainer.checkedCast(typeof(UiModule))
	}

	override referredModules(UiModule it) {
		val result = eAllContents.filter(typeof(GotoScreenStatement)).map[viewable.module].toSet
		result.addAll(calledModules)
		result.remove(it)
		result.remove(null)		// FIXME  this should not be necessary!
		return result
	}

	override allReferredModules(UiModule it) {
		val modules = <UiModule>newHashSet as Set<UiModule>
		visitModules(modules)
		return modules
	}

	def private void visitModules(UiModule currentModule, Set<UiModule> visitedModules) {
		val referredModules = currentModule.referredModules
		visitedModules += currentModule
		referredModules.filter[!visitedModules.contains(it)].forEach[visitModules(visitedModules)]
	}


	override containingModule(EObject it) {
		eResource.contents.head.checkedCast(typeof(UiModule))
	}


	/*
	 * +--------------------------+
	 * | parameters and arguments |
	 * +--------------------------+
	 * 
	 * The reuse of parameter and argument lists into separate type rules
	 * (and thus: types) is essentially a grammar engineering matter and
	 * clients of types having such lists shouldn't be burdened with that
	 * choice.
	 */

	override parameters(TopLevelDefinition it) {
		parameterList.parameters as Iterable<Parameter>
	}

	override arguments(ViewableCallSite it) {
		argumentList.arguments as Iterable<Argument>
	}

	override arguments(TableRowsInvocation it) {
		argumentList.arguments as Iterable<Argument>
	}

}

package nl.dslmeinte.simscript.mappings.scoping

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.util.XtextUtil
import nl.dslmeinte.simscript.mappings.extensions.MiscellaneousExtensions
import nl.dslmeinte.simscript.mappings.extensions.QueryExtensions
import nl.dslmeinte.simscript.mappings.mappingsDsl.FeatureExpressionElement
import nl.dslmeinte.simscript.mappings.mappingsDsl.FeatureExpressionTail
import nl.dslmeinte.simscript.mappings.mappingsDsl.FromDbQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.InsertQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.NestedMappingSpecification
import nl.dslmeinte.simscript.mappings.mappingsDsl.SelectQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.ToDbQuery
import nl.dslmeinte.simscript.mappings.mappingsDsl.UpdateQuery
import nl.dslmeinte.simscript.simpleDb.extensions.SimpleDbExtensions
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

import static org.eclipse.xtext.scoping.Scopes.*

@Singleton
public class MappingsDslScopeProvider extends AbstractDeclarativeScopeProvider {

	@Inject extension SimpleDbExtensions
	@Inject extension QueryExtensions
	@Inject extension MiscellaneousExtensions

	@Inject extension XtextUtil


	def scope_SelectQuery_sameNamedColumns(SelectQuery it, EReference eRef) {
		val featureNames = structure.features.map[name]
		scopeFor(table.columns.filter[ c | featureNames.contains(c.name) ])
	}

	def scope_FromDbMappingSpecification_feature(SelectQuery it, EReference eRef) {
		scopeFor(structure.features)
	}

	def scope_SimpleColumnMappingSpecification_column(SelectQuery it, EReference eRef) {
		scopeFor(table.columns)
	}
	/*
	 * FIXME  either this method doesn't work correctly or more scope methods are called and used to compile a scope that's too big
	 */

	def scope_Argument_parameter(NestedMappingSpecification it, EReference eRef) {
		scopeFor(nestedQuery.parameters)
	}

	def scope_Argument_column(SelectQuery it, EReference eRef) {
		scopeFor(table.columns)
	}


	def scope_ColumnsSpecification_columns(FromDbQuery it, EReference eRef) {
		scopeFor(table.columns)
	}


	def scope_SimpleSubClause_column(FromDbQuery it, EReference eRef) {
		scopeFor(table.columns)
	}

	def scope_SimpleEqualitySubClause_parameter(FromDbQuery it, EReference eRef) {
		scopeFor(parameters)
	}

	def scope_SimpleRangeSubClause_leftParameter(FromDbQuery it, EReference eRef) {
		scopeFor(parameters)
	}

	def scope_SimpleRangeSubClause_rightParameter(FromDbQuery it, EReference eRef) {
		scopeFor(parameters)
	}


	def scope_ColumnOrderSpecification_column(SelectQuery it, EReference eRef) {
		scopeFor(table.columns)
	}


	def scope_InsertQuery_returnAutoIncrementColumn(InsertQuery it, EReference eRef) {
		scopeFor(table.simpleColumns.filter[autoIncrement])
	}


	def scope_ToDbMappingSpecification_column(ToDbQuery it, EReference eRef) {
		scopeFor(table.columns)
	}


	def scope_ExpressionEqualitySubClause_column(UpdateQuery it, EReference eRef) {
		scopeFor(table.columns)
	}


	def scope_FeatureExpressionHead_parameter(ToDbQuery it, EReference eRef) {
		scopeFor(parameters)
	}


	def scope_FeatureExpressionTail_feature(FeatureExpressionTail it, EReference eRef) {
		val container = eContainer.checkedCast(typeof(FeatureExpressionElement))
		scopeFor(container.features)
	}


	/*
	 * +---------------------+
	 * | debugging functions |
	 * +---------------------+
	 */

	override getScope(EObject eObject, EReference eRef) {
		// hook for debugging:
//		logScopeComputation(it, eRef)
		super.getScope(eObject, eRef)
	}

}

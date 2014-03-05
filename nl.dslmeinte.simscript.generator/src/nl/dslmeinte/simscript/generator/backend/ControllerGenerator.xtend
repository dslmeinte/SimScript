package nl.dslmeinte.simscript.generator.backend

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.generator.ResourceUtil
import nl.dslmeinte.simscript.generator.util.GeneratorUtil
import nl.dslmeinte.simscript.types.BuiltinTypeLiteral
import nl.dslmeinte.simscript.types.DefinedTypeLiteral
import nl.dslmeinte.simscript.types.Feature
import nl.dslmeinte.simscript.types.ListTypeLiteral
import nl.dslmeinte.simscript.types.Structure
import nl.dslmeinte.simscript.types.TypeExtensions
import nl.dslmeinte.simscript.types.TypeLiteral

/**
 * Generates the Controller class for a {@link Structure}.
 * Check the nl.dslmeinte.api.controllers.ControllerInterface for the contract.
 * 
 * The idea is to use the ListController for database actions concerning
 * many-typed features.
 * 
 * @author Volker Lanting, Meinte Boersma
 */
@Singleton
class ControllerGenerator {

	@Inject extension GeneratorUtil
	@Inject extension ResourceUtil
	@Inject extension TypeExtensions
	@Inject extension JavaGeneratorHelper

	def generateController(Structure it)
		'''
		«header»
		package «packageName».controllers;

		import java.util.List;
		import java.util.UUID;
		import java.util.Map;

		import com.google.common.collect.Lists;

		import nl.dslmeinte.api.controllers.ControllerInterface;
		import nl.dslmeinte.api.controllers.ListController;
		import nl.dslmeinte.api.controllers.SimpleTypeConverter;
		import nl.dslmeinte.api.controllers.SimpleTypeFactory;
		import nl.dslmeinte.api.db.ColumnConverter;
		import nl.dslmeinte.api.db.CassandraConfig;
		import nl.dslmeinte.api.exceptions.NoResultException;
		import «it.asJavaTypeLiteral»;

		import me.prettyprint.cassandra.serializers.StringSerializer;
		import me.prettyprint.cassandra.serializers.UUIDSerializer;
		import me.prettyprint.hector.api.Keyspace;
		import me.prettyprint.hector.api.beans.HColumn;
		import me.prettyprint.hector.api.beans.HSuperColumn;
		import me.prettyprint.hector.api.factory.HFactory;
		import me.prettyprint.hector.api.mutation.Mutator;

		/**
		 * A Controller to convert «name»s to DB formats.
		 * @author Controller Generator
		 */
		public class «name»Controller implements ControllerInterface<String, String, String, «name»> {

			private final CassandraConfig connection;
			private final Keyspace keyspace;

			/**
			 * Constructor.
			 */
			public «name»Controller() {
				this.connection = new CassandraConfig();
				this.keyspace = connection.getKeyspace();
			}

			«dbCommunicationsMethods»
			
			«conversionMethod»
			
			«createFromMaps»
			
		}
		'''

	def private conversionMethod(Structure it)
		'''
		/**
		 * Converts the «name» to a List of SuperColumns.
		 *
		 * Note that it actually does some persisting of referred and list types!!!
		 * @param object the «name» to convert.
		 * @return the list of SuperColumns.
		 */
		private List<HSuperColumn<String, String, String>> toSuperColumns(final «name» object) {
			final List<HSuperColumn<String, String, String>> supers = Lists.newArrayList();
			final StringSerializer ss = new StringSerializer();

			final List<HColumn<String, String>> single_attributes = Lists.newArrayList();
			// persist ID just so we know each read object should have a single_attributes supercol
			single_attributes.add(HFactory.createStringColumn(«name».ID, object.getId().toString()));
			«IF !simpleTypedFeatures.empty»
				«FOR feature : simpleTypedFeatures»
					if (object.get«feature.name.toFirstUpper»() != null) {
						single_attributes.add(HFactory.createStringColumn(
							«name».«feature.name.toUpperCase»,
							SimpleTypeConverter.convertToString(object.get«feature.name.toFirstUpper»())
						));
					}
				«ENDFOR»
			«ENDIF»
			supers.add(HFactory.createSuperColumn(SINGLE_ATTRIBUTES, single_attributes, ss, ss, ss));

			«IF !linkedTypedFeatures.empty»
				final List<HColumn<String, String>> linked_attributes = Lists.newArrayList();
				«FOR feature : linkedTypedFeatures»
					«feature.controller» «feature.name»Controller = new «feature.controller»();
					if (object.get«feature.name.toFirstUpper»() != null) {
						linked_attributes.add(HFactory.createStringColumn(
							«name».«feature.name.toUpperCase»,
							«feature.name»Controller.persist(object.get«feature.name.toFirstUpper»()).toString()
						));
					}
				«ENDFOR»
				supers.add(HFactory.createSuperColumn(REFERENCED_ATTRIBUTES, linked_attributes, ss, ss, ss));
			«ENDIF»

			«IF !listTypedFeatures.empty»
				final ListController controller = new ListController();
				final List<HColumn<String, String>> list_attributes = Lists.newArrayList();
				«FOR feature : listTypedFeatures»
					final «feature.type.asJavaTypeLiteral» «feature.name»List = object.get«feature.name.toFirstUpper»();
					if («feature.name»List != null && !«feature.name»List.isEmpty()) {
						«listAttributesHelper(feature.type.listItemType, feature, it)»
					}
				«ENDFOR»
				supers.add(HFactory.createSuperColumn(LIST_ATTRIBUTES, list_attributes, ss, ss, ss));
			«ENDIF»
			return supers;
		}
		'''

	def private listAttributesHelper(TypeLiteral it, Feature<?> feature, Structure parent) {
		switch it {
			BuiltinTypeLiteral : {
				// since the removal of stringmap, all builtintypes are assumed to be simple typed
				// so only the SimpleTypeConverter is needed.
				'''
					list_attributes.add(HFactory.createStringColumn(
						«parent.name».«feature.name.toUpperCase»,
						controller.persist(SimpleTypeConverter.convertToList(«feature.name»List.toArray(new String[«feature.name»List.size()]))).toString()
					));
				'''
			}
			DefinedTypeLiteral: '''
				final «feature.controller» «feature.name»Controller =	new «feature.controller»();
				list_attributes.add(HFactory.createStringColumn(
					«parent.name».«feature.name.toUpperCase»,
					controller.persist(«feature.name»List, «feature.name»Controller).toString()
				));
			'''
			// FIXME  account for the enum case
			ListTypeLiteral : { throw new IllegalArgumentException("This kind of ArrayTyped feature is not supported") }
		}
	}

	def private dbCommunicationsMethods(Structure it) 
		'''
		private static final String CF = "«name»s";
		private static final int MAX_NUM_ATTRIBUTES = 500;
	
		«dbCommunicationsPersist»
	
		«dbCommunicationsRemove»
	
		«dbCommunicationsRead»
		
		«compareAndRemoveOldValuesFunction»
		'''

	def private dbCommunicationsPersist(Structure it)
		'''
		/**
		 * Persists the given {@link «name»} to the database.
		 * @param obj the «name».
		 * @return the UUID under which the object was stored, same as obj.getId().
		 */
		public UUID persist(final «name» obj) {
						
			if (obj == null) { throw new IllegalArgumentException("Won't persist null instead of «name» to the database."); }
			
			try {
				final «name» old = read(obj.getId());
				// it already exists, so we should update
				compareAndRemoveOldValues(obj, old);
			} catch (NoResultException e) {
				// it's a new structure
			}
			
			final UUIDSerializer us = new UUIDSerializer();
			final Mutator<UUID> mutator = HFactory.createMutator(keyspace, us);
			final List<HSuperColumn<String, String, String>> supers = toSuperColumns(obj);
			for (HSuperColumn<String, String, String> supercol : supers) {
				mutator.addInsertion(obj.getId(), CF, supercol);
			}
			mutator.execute();
			return obj.getId();
		}
		'''

	def private dbCommunicationsRemove(Structure it)
		'''
		/**
		 * Removes the {@link «name»} belonging to the given id from the database.
		 * @param id the id of the «name»
		 */
		public void remove(final UUID id) {
			if (id == null) { throw new IllegalArgumentException("Won't remove null instead of id of «name» from the database."); }
			final UUIDSerializer us = new UUIDSerializer();
			final StringSerializer ss = new StringSerializer();
			final Mutator<UUID> mutator = HFactory.createMutator(keyspace, us);
			
			«IF !listTypedFeatures.empty»
			// Removing list_attributes
			HSuperColumn<String, String, String> listCol =
				HFactory.createSuperColumnQuery(keyspace, us, ss, ss, ss)
				.setColumnFamily(CF)
				.setKey(id)
				.setSuperName(LIST_ATTRIBUTES)
				.execute().get();
			if (listCol != null) {
				final ListController listController = new ListController(); 
				final Map<String, String> listMap = ColumnConverter.toMap(listCol.getColumns());
				«FOR feature : listTypedFeatures»
					if (listMap.containsKey(«name».«feature.name.toUpperCase»)) {
						«IF feature.type.listItemType.simpleTyped»
							listController.remove(UUID.fromString(listMap.get(«name».«feature.name.toUpperCase»)));
						«ELSE»
							final «feature.controller» «feature.name»Controller = new «feature.controller»();
							listController.remove(
								UUID.fromString(listMap.get(«name».«feature.name.toUpperCase»)), 
								«feature.name»Controller
							);
						«ENDIF»
					}
				«ENDFOR»
			}
			«ENDIF»

			«IF !linkedTypedFeatures.empty»
			// Removing referenced_attributes
			HSuperColumn<String, String, String> refCol =
				HFactory.createSuperColumnQuery(keyspace, us, ss, ss, ss)
				.setColumnFamily(CF)
				.setKey(id)
				.setSuperName(REFERENCED_ATTRIBUTES)
				.execute().get();
			if (refCol != null) {
				final Map<String, String> refMap = ColumnConverter.toMap(refCol.getColumns());
				«FOR feature : linkedTypedFeatures»
					if (refMap.containsKey(«name».«feature.name.toUpperCase»)) {
						«feature.controller» «feature.name»Controller = new «feature.controller»();
						«feature.name»Controller.remove(UUID.fromString(refMap.get(«name».«feature.name.toUpperCase»)));
					}
				«ENDFOR»
			}
			«ENDIF»
			
			// Remove the simple_attributes
			mutator.addDeletion(id, CF);
			mutator.execute();
		}
		'''

	def private dbCommunicationsRead(Structure it)
		'''
		/**
		 * Reads the {@link «name»} belonging to the given {@link UUID}
		 * from the database.
		 * @param id the ID of the «name».
		 * @return the «name».
		 * @throws NoResultException if the «name» wasn't found in the database.
		 */
		public «name» read(final UUID id) throws NoResultException {
			if (id == null) { throw new IllegalArgumentException("No id given to retrieve the «name»."); }
			final UUIDSerializer us = new UUIDSerializer();
			final StringSerializer ss = new StringSerializer();
			
			Map<String, String> simpleMap = null;
			// there is always at least an ID in here, so we can tell if it was ever stored in the db
			HSuperColumn<String, String, String> simpleCol =
				«"SINGLE_ATTRIBUTES".superColumn»;
			if (simpleCol != null) { simpleMap = ColumnConverter.toMap(simpleCol.getColumns());	}
			
			Map<String, String> linkMap = null;
			«IF !linkedTypedFeatures.empty»
				HSuperColumn<String, String, String> linkCol =
					«"REFERENCED_ATTRIBUTES".superColumn»;
				if (linkCol != null) { linkMap = ColumnConverter.toMap(linkCol.getColumns()); }
			«ENDIF»
			
			Map<String, String> listMap = null;
			«IF !listTypedFeatures.empty»
				HSuperColumn<String, String, String> listCol =
					«"LIST_ATTRIBUTES".superColumn»;
				if (listCol != null) { listMap = ColumnConverter.toMap(listCol.getColumns()); }
			«ENDIF»
			
			if (simpleMap == null && linkMap == null && listMap == null) {
				throw new NoResultException("Didn't find any columns for id " + id);
			}
			return createFromMaps(id, simpleMap, linkMap, listMap);
		}			
		'''

	def private getSuperColumn(String name) 
		'''
		HFactory.createSuperColumnQuery(keyspace, us, ss, ss, ss)
			.setColumnFamily(CF)
			.setKey(id)
			.setSuperName(«name»)
			.execute().get()
		'''

	def private createFromMaps(Structure it)
		'''
		/**
		 * Creates a «name» from the given maps as obtained by the ColumnConverter.
		 * @param id the ID for the «name».
		 * @param simple the simple typed features from the SINGLE_ATTRIBUTES SuperColumn. May be null.
		 * @param linked the features from the REFERENCED_ATTRIBUTES SuperColumn. May be null.
		 * @param list the features from the LIST_ATTIBUTES SuperColumn. May be null.
		 * @return the «name».
		 * @throws NoResultException if the «name» wasn't found in the database.
		 */
		private «name» createFromMaps(
			final UUID id,
			final Map<String, String> simple,
			final Map<String, String> linked,
			final Map<String, String> list) throws NoResultException {
				
				if (id == null) { throw new IllegalArgumentException("No id given to create the «name» from maps."); }
				final «name» object = new «name»(id);
				if (simple != null) {
					«FOR feature : simpleTypedFeatures»
						if (simple.containsKey(«name».«feature.name.toUpperCase»)) {
							object.set«feature.name.toFirstUpper»(
								«feature.factoryMethodQualifiedName»(simple.get(«name».«feature.name.toUpperCase»))
							);
						}
					«ENDFOR»
				}
				
				if (linked != null) {
					«FOR feature : linkedTypedFeatures»
						if (linked.containsKey(«name».«feature.name.toUpperCase»)) {
							final «feature.controller» «feature.name»Controller = new «feature.controller»(); 
							object.set«feature.name.toFirstUpper»(
								«feature.name»Controller.read(UUID.fromString(linked.get(«name».«feature.name.toUpperCase»)))
							);
						}
					«ENDFOR»
				}
				
				if (list != null) {
					ListController controller = new ListController();
					«FOR feature : listTypedFeatures»
						if (list.containsKey(«name».«feature.name.toUpperCase»)) {
							«IF feature.type.listItemType.simpleTyped»
								object.set«feature.name.toFirstUpper»(«feature.factoryMethodQualifiedName»List(
									controller.read(UUID.fromString(list.get(«name».«feature.name.toUpperCase»))).toArray(new String[0])
								));
							«ELSE»
								final «feature.controller» «feature.name»Controller = new «feature.controller»(); 
								object.set«feature.name.toFirstUpper»(
									controller.read(UUID.fromString(list.get(«name».«feature.name.toUpperCase»)), «feature.name»Controller)
								);
							«ENDIF»
						}
					«ENDFOR»
				}
				
				return object;
			}
		'''

		def private compareAndRemoveOldValuesFunction(Structure it) {
			'''
			private void compareAndRemoveOldValues(final «name» obj, final «name» old) {
				final UUIDSerializer u = new UUIDSerializer();
				final StringSerializer s = new StringSerializer();
				final Mutator<UUID> m = HFactory.createMutator(keyspace, u);
				final ListController controller = new ListController();
				«FOR f : simpleTypedFeatures»
					if (old.get«f.name.toFirstUpper»() != null && obj.get«f.name.toFirstUpper»() == null) {
						m.addSubDelete(obj.getId(), CF, SINGLE_ATTRIBUTES, "«f.name»", s, s);
					}
				«ENDFOR»
				«FOR f : linkedTypedFeatures»
					if (old.get«f.name.toFirstUpper»() != null && obj.get«f.name.toFirstUpper»() == null) {
						// WARNING, not deleting the old structure itself (TODO consider if we should)
						m.addSubDelete(obj.getId(), CF, REFERENCED_ATTRIBUTES, "«f.name»", s, s);
					}
				«ENDFOR»
				«FOR f : listTypedFeatures»
					if ( (old.get«f.name.toFirstUpper»() != null && !old.get«f.name.toFirstUpper»().isEmpty())
							&& (obj.get«f.name.toFirstUpper»() == null || obj.get«f.name.toFirstUpper»().isEmpty()) ) {
						// WARNING, not deleting the old structure (if not simple typed) itself (TODO consider if we should)
						final String listIdStr = HFactory.createSubColumnQuery(keyspace, u, s, s, s)
							.setColumnFamily(CF)
							.setKey(obj.getId())
							.setSuperColumn(LIST_ATTRIBUTES)
							.setColumn("«f.name»")
							.execute().get().getValue();
						controller.remove(UUID.fromString(listIdStr));
						m.addSubDelete(obj.getId(), CF, LIST_ATTRIBUTES, "«f.name»", s, s);
					}
				«ENDFOR»
				m.execute();
			}
			'''
		}
}

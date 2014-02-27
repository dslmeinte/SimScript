package nl.dslmeinte.simscript.generator.backend

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.generator.ResourceUtil
import nl.dslmeinte.simscript.generator.util.GeneratorUtil
import nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypeLiteral
import nl.dslmeinte.simscript.structure.structureDsl.DefinedTypeLiteral
import nl.dslmeinte.simscript.structure.structureDsl.Feature
import nl.dslmeinte.simscript.structure.structureDsl.Structure
import nl.dslmeinte.simscript.structure.types.TypeExtensions

/**
 * Generates the POJO for a {@link Structure}.
 * 
 * @author Meinte Boersma, Volker Lanting
 */
@Singleton
class PojoGenerator {

	@Inject extension TypeExtensions
	@Inject extension JavaGeneratorHelper
	@Inject extension GeneratorUtil
	@Inject extension ResourceUtil

	def generatePOJO(Structure it) {
		val imports = newLinkedHashSet
		imports.addAll(structureTypedFeatures.map[(type as DefinedTypeLiteral).type.asJavaTypeLiteral])
		imports.addAll(listTypedFeatures.filter[type.listItemType.structureTyped].map[(type.listItemType as DefinedTypeLiteral).type.asJavaTypeLiteral])
		'''
		«header»
		package «packageName».data;

		import java.math.BigDecimal;
		import java.util.Date;
		import java.util.HashMap;
		import java.util.List;
		import java.util.ArrayList;
		import java.util.Map;
		import java.util.UUID;

		import com.google.common.collect.Lists;

		import org.json.simple.JSONObject;

		import nl.dslmeinte.api.controllers.SimpleTypeFactory;
		import nl.dslmeinte.api.db.AbstractPersistableObject;
		import nl.dslmeinte.api.db.data.util.*;
		
		«FOR i : imports»
		import «i»;
		«ENDFOR»

		import org.slf4j.Logger;
		import org.slf4j.LoggerFactory;

		@SuppressWarnings("all")
		public class «name» extends AbstractPersistableObject {
			
			private static final Logger LOGGER = LoggerFactory.getLogger(«name».class);
			
			«javaTypeBody»

		}
		'''
	}

	def private javaTypeBody(Structure it)
		'''
		// prefixes (names) for the attributes for JSON and DB storage:

		«FOR feature : features»
			/**
			 * JSON prefix for the «feature.name».
			 */
			public static final String «feature.name.toUpperCase» = "«feature.name»";
		«ENDFOR»

		// attributes:

		«FOR feature : features»
			private «feature.type.asJavaTypeLiteral» «feature.name»;
		«ENDFOR»

		« /* TODO  remove ID stuff */ »
		/**
		 * Constructor. Generates an ID for the «name».
		 */
		public «name»() {
			super();
		}

		/**
		 * Constructor for a «name».
		 * @param id the id of the «name».
		 */
		public «name»(final UUID id) {
			super(id);
		}

		@Override
		public Map<String, Object> toMap() {
			LOGGER.debug("Converting this «name» to a map");
			final JsonMapBuilder b = new JsonMapBuilder();
			b.append(ID, id);
			«FOR feature : features»
				b.append(«feature.name.toUpperCase», «feature.name»);
			«ENDFOR»
			return b.toJsonMap();
		}

		/**
		 * Converts the given GetParameter-Map to a «name».
		 * @param map the Map with the required information.
		 * @return the «name».
		 * @throws IllegalArgumentException if no data was present.
		 */
		public static «name» fromGetParams(final Map<String, String[]> map)
			throws IllegalArgumentException {
			«fromGetParamsBody»
		}
		
		private static boolean isNonEmptyParamsMap(final Map<String, String[]> map) {
			for (String k : map.keySet()) {
				if (k.startsWith(ID)) { return true; }
				«FOR f : features»
					if (k.startsWith(«f.name.toUpperCase»)) { return true; }
				«ENDFOR»
			}
			return false;
		}

		public boolean isValid() {
			«FOR f : features»
				«IF !f.optional»
					«IF f.type.listTyped»
						if («f.name» == null) {
							LOGGER.warn("Mandatory feature «f.name» missing from this «name» ({}).", getId());
							return false;
						} else {
							for («f.type.listItemType.asJavaTypeLiteral» item : «f.name») {
								if (item == null«IF f.type.listItemType.structureTyped» || !item.isValid()«ENDIF») {
									LOGGER.warn("Mandatory feature «f.name» invalid for this «name» ({}).", getId());
									return false;
								}
							}
						}
					«ELSE»
						if («f.name» == null«IF f.type.structureTyped» || !«f.name».isValid()«ENDIF») {
							LOGGER.warn("Mandatory feature «f.name» missing (or invalid) from this «name» ({}).", getId());
							return false;
						}
					«ENDIF»
				«ENDIF»
			«ENDFOR»
			return true;
		}

		«FOR feature : features»
			«feature.getterAndSetter»
		«ENDFOR»
		'''

	def private getterAndSetter(Feature<?> it) {
		val structureName = (eContainer as Structure).name

		'''
		/**
		 * Returns the «name» of this {@link «structureName»},
		 * or an empty «type.asJavaTypeLiteral» if there is none.
		 * @return the «name».
		 */
		public «type.asJavaTypeLiteral» get«name.toFirstUpper»() {
				return this.«name»;
		}

		/**
		 * Sets the «name» of this {@link «structureName»} to the given «type.asJavaTypeLiteral».
		 * @param «name» the «name».
		 */
		public void set«name.toFirstUpper»(final «type.asJavaTypeLiteral» «name») {
			this.«name» = «name»;
		}
		'''
	}

	def private fromGetParamsBody(Structure it)
		'''
		if (map == null || map.isEmpty() || !isNonEmptyParamsMap(map)) { 
			return new «name»();
		}
		
		final «name» obj;
		if (map.get(ID) != null) {
			obj = new «name»(UUID.fromString(map.get(ID)[0]));
		} else {
			obj = new «name»();
		}
		«FOR f : features»
			«IF f.type.listTyped»
				«f.manyFromGetParams»
			«ELSE»
				«f.singleFromGetParams»
			«ENDIF»
		«ENDFOR»
		// Loop over features heen
		// 		voor structure :
		//			structure.toStructure(HttpGetParameterUtil.getSubParams(name.NAME, map));
		//			set hem
		//		voor builtintype :
		//			simpeltype: set hem
		//			anders: TODO
		//		voor many
		//			structure: HttpGetParameterUtil.getArrayResolvedSubParams(name.NAME, map)
		//				for (map : list) add structure.toStructure(map)
		//			builtin: map.get(name.Name+"[]")
		return obj;
		'''

	def private singleFromGetParams(Feature<?> it) {
		switch t: it.type {
			DefinedTypeLiteral:
				'''
				Map<String, String[]> «name»Map = HttpGetParameterUtil.getSubParams(«name.toUpperCase», map);
				if (!«name»Map.isEmpty()) {
					obj.set«name.toFirstUpper»(«t.type.name».fromGetParams(«name»Map));
				}
				'''
			BuiltinTypeLiteral:
				// Builtin types are assumed to be represented in a single string (i.e. simpletyped)
				'''
					if (map.get(«name.toUpperCase») != null) {
						obj.set«name.toFirstUpper»(«it.factoryMethodQualifiedName»(map.get(«name.toUpperCase»)[0]));
					}
				'''
		}
	}

	def private manyFromGetParams(Feature<?> it) {
		val itemType = type.listItemType 
		switch itemType {
			DefinedTypeLiteral:
				'''
				«type.asJavaTypeLiteral» «name»List = Lists.newArrayList();
				for (Map<String, String[]> tmap : HttpGetParameterUtil.getArrayResolvedSubParams(«name.toUpperCase», map)) {
					if (!tmap.isEmpty()) {
						«name»List.add(«itemType.type.name».fromGetParams(tmap));
					}
				}
				if (!«name»List.isEmpty()) { obj.set«name.toFirstUpper»(«name»List); }
				'''
			BuiltinTypeLiteral:
				// since the removal of StringMap, all builtin types are assumed to be simple typed
				'''
				«type.asJavaTypeLiteral» «name»List = Lists.newArrayList();
				if (map.get(«name.toUpperCase» + "[]") != null) {
					for (String s : map.get(«name.toUpperCase» + "[]")) {
						«name»List.add(«factoryMethodQualifiedName»(s));
					}
					if (!«name»List.isEmpty()) { obj.set«name.toFirstUpper»(«name»List); }
				}
				'''
		}
	}

}
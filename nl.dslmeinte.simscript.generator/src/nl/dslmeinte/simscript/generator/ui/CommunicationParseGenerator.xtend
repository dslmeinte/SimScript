package nl.dslmeinte.simscript.generator.ui

import com.google.inject.Inject
import nl.dslmeinte.simscript.generator.ui.js.JavaScriptUtil
import nl.dslmeinte.simscript.types.Structure
import nl.dslmeinte.simscript.types.TypeExtensions

class CommunicationParseGenerator {
	
	@Inject extension TypeExtensions
	@Inject extension JavaScriptUtil


	def public generateParseFunctions(Iterable<Structure> all) '''
		«FOR it : all»
			«generateItemParseFunction»
			«generateDateParseFunction»
		«ENDFOR»
	'''
	
	def private generateItemParseFunction(Structure it)
		'''
		function «name»ToFullItemFunction(obj) {
			if (obj == null) {
				return «createDefinedTypeLiteral.asInitJs»;
			}
			var newObj = {};
			newObj.id = obj.id === undefined ? null : obj.id;
			«FOR it : listTypedFeatures»
				«IF type.listItemType.structureTyped»
					newObj.«name» = [];
					if (obj.«name» != undefined && $.isArray(obj.«name»)) {
						for (var i = 0; i < obj.«name».length; i++) {
							newObj.«name».push(«type.listItemType.structure.name»ToFullItemFunction(obj.«name»[i]));
						}
					}
				«ELSE»
					newObj.«name» = obj.«name» == undefined ? [] : obj.«name»;
				«ENDIF»
			«ENDFOR»
			«FOR f : structureTypedFeatures»
				newObj.«f.name» = «f.type.structure.name»ToFullItemFunction(obj.«f.name»);
			«ENDFOR»
			«FOR f : features.filter[!type.structureTyped && ! type.listTyped]»
				newObj.«f.name» = obj.«f.name» === undefined ? «f.type.asInitJs» : obj.«f.name»;
			«ENDFOR»
			return newObj;
		}
		'''

	def private generateDateParseFunction(Structure it)
		'''
		function «name»DateParseFunction(item) {
			if (item == undefined) { return; }
			«FOR f : features.filter[type.dateTyped]»
				if (item.get«f.name.toFirstUpper»().get() != undefined) {
					item.get«f.name.toFirstUpper»().set(DateUtil.parse(item.get«f.name.toFirstUpper»().get()));
				}
			«ENDFOR»
			«FOR f : structureTypedFeatures»
				«f.type.structure.name»DateParseFunction(item.get«f.name.toFirstUpper»());
			«ENDFOR»
			«FOR it : listTypedFeatures»
				«IF type.listItemType.structureTyped»
					if (item.get«name.toFirstUpper»() != undefined && !item.get«name.toFirstUpper»().isEmpty()) {
						item.get«name.toFirstUpper»().forAll(«type.listItemType.structure.name»DateParseFunction);
					}
				«ELSEIF type.listItemType.dateTyped»
					if (item.get«name.toFirstUpper»() != undefined && !item.get«name.toFirstUpper»().isEmpty()) {
						item.get«name.toFirstUpper»().forAll(
							function(item){
								if (item.get() != undefined) {
									item.set(DateUtil.parse(item.get()));
								}
							}
						);
					}
				«ENDIF»
			«ENDFOR»
		}
		'''

	// TODO  add generation of a function for an enum

}

package nl.dslmeinte.simscript.structure.types;

import java.util.List;

import com.google.inject.ImplementedBy;
import nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.BuiltinTypes;
import nl.dslmeinte.simscript.structure.structureDsl.CallbackErrorResponseLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.CallbackLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.DefinedType;
import nl.dslmeinte.simscript.structure.structureDsl.DefinedTypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.Enumeration;
import nl.dslmeinte.simscript.structure.structureDsl.Feature;
import nl.dslmeinte.simscript.structure.structureDsl.ListTypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.Structure;
import nl.dslmeinte.simscript.structure.structureDsl.TypeLiteral;
import nl.dslmeinte.simscript.structure.structureDsl.VoidLiteral;

@ImplementedBy(TypeExtensionsImpl.class)
public interface TypeExtensions {

	boolean isBooleanTyped(TypeLiteral it);

	boolean isStringTyped(TypeLiteral it);

	boolean isTextTyped(TypeLiteral it);

	boolean isIntegerTyped(TypeLiteral it);

	boolean isNumberTyped(TypeLiteral it);

	boolean isDateTyped(TypeLiteral it);

	boolean isPasswordTyped(TypeLiteral it);

	boolean isEmailTyped(TypeLiteral it);

	boolean isSimpleTyped(TypeLiteral it);

	boolean isTextuallyTyped(TypeLiteral it);

	boolean isNumericallyTyped(TypeLiteral it);

	boolean isListTyped(TypeLiteral it);

	boolean isDefinedTyped(TypeLiteral it);

	boolean isStructureTyped(TypeLiteral it);

	boolean isEnumerationTyped(TypeLiteral it);

	boolean isCallback(TypeLiteral it);

	boolean isVaguelyTyped(TypeLiteral it);

	boolean isVoidTyped(TypeLiteral it);

	TypeLiteral listItemType(TypeLiteral it);

	Structure structure(TypeLiteral it);

	Enumeration enumeration(TypeLiteral it);

	List<Feature<TypeLiteral>> features(TypeLiteral it);

	Iterable<Feature<TypeLiteral>> simpleTypedFeatures(Structure it);

	Iterable<Feature<TypeLiteral>> linkedTypedFeatures(Structure it);

	Iterable<Feature<TypeLiteral>> listTypedFeatures(DefinedType it);

	Iterable<Feature<TypeLiteral>> structureTypedFeatures(DefinedType it);

	Iterable<Feature<TypeLiteral>> builtinTypedFeatures(Structure it);

	BuiltinTypeLiteral createBuiltinTypeLiteral(BuiltinTypes builtinType);

	DefinedTypeLiteral createDefinedTypeLiteral(DefinedType it);

	ListTypeLiteral createListTypeLiteral(TypeLiteral itemType);

	CallbackLiteral createCallbackLiteral();

	CallbackErrorResponseLiteral createCallbackErrorResponseLiteral();

	VoidLiteral createVoidLiteral();

	List<Feature<TypeLiteral>> featuresOf(DefinedType it);

	boolean isAssignableFrom(TypeLiteral target, TypeLiteral source);

	String toLiteral(TypeLiteral it);

}
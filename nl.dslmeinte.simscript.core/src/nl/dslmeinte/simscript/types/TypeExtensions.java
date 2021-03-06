package nl.dslmeinte.simscript.types;

import java.util.List;

import com.google.inject.ImplementedBy;

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
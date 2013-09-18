package nl.dslmeinte.simscript.generator.util;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;

public interface IMultipleResourceGenerator {

	/**
	 * @param input
	 *            - the {@link ResourceSet} for which resources to generate.
	 * @param fsa
	 *            - {@link IFileSystemAccess file system access} to be used to
	 *            generate files.
	 */
	void doGenerate(ResourceSet input, IFileSystemAccess fsa);

}

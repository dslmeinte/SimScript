package com.simlike.simscript.generator.util;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

public abstract class GeneratorSupport implements IGenerator {

	private IFileSystemAccess fileSystemAccess;

	@Override
	public void doGenerate(Resource input, IFileSystemAccess fsa) {
		this.fileSystemAccess = fsa;
		doGenerate(input);
	}

	abstract protected void doGenerate(Resource input);

	protected void save(File file) {
		fileSystemAccess.generateFile(file.getPath(), file.getContents());
	}

}

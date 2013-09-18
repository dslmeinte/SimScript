package nl.dslmeinte.simscript.generator.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;

import com.google.inject.Inject;
import nl.dslmeinte.simscript.generator.util.IMultipleResourceGenerator;

public class MultipleResourceBuilderParticipant extends BuilderParticipant {

	@Inject
	private ResourceDescriptionsProvider resourceDescriptionsProvider;

//	@Inject
//	private IContainer.Manager containerManager;

	@Inject (optional=true)
	private IMultipleResourceGenerator generator;

	protected ThreadLocal<Boolean> buildSemaphor = new ThreadLocal<Boolean>();

	@Override
	public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		buildSemaphor.set(false);
		super.build(context, monitor);
	}

	@Override
	protected void handleChangedContents(Delta delta, IBuildContext context, EclipseResourceFileSystemAccess2 fileSystemAccess) throws CoreException {
		super.handleChangedContents(delta, context, fileSystemAccess);
		if( !buildSemaphor.get() && generator != null ) {
			invokeGenerator(delta, context, fileSystemAccess);
		}
	}

	@SuppressWarnings("unused")
	private void invokeGenerator(Delta delta, IBuildContext context, IFileSystemAccess fileSystemAccess) {
		// attempt to avoid “java.net.MalformedURLException: unknown protocol: java” exceptions being thrown:
		if( !delta.getUri().isPlatformResource() ) {
			return;
		}

		buildSemaphor.set(true);
		Resource resource = context.getResourceSet().getResource(delta.getUri(), true);
		if( shouldGenerate(resource, context) ) {
			IResourceDescriptions index = resourceDescriptionsProvider.createResourceDescriptions();
			/*
			 * FIXME  next line throws a NPE because index.resourceSet == null: stops generation and purpose is unclear

			IResourceDescription resDesc = index.getResourceDescription(resource.getURI());
			List<IContainer> visibleContainers = containerManager.getVisibleContainers(resDesc, index);
			for (IContainer c : visibleContainers) {
				for (IResourceDescription rd : c.getResourceDescriptions()) {
					context.getResourceSet().getResource(rd.getURI(), true);
				}
			}

			*/

			generator.doGenerate(context.getResourceSet(), fileSystemAccess);
		}
	}

}

package nl.dslmeinte.simscript.generator.backend

import com.google.inject.Inject
import nl.dslmeinte.simscript.backend.simBackendDsl.CrudService
import nl.dslmeinte.simscript.backend.simBackendDsl.CrudTypes
import nl.dslmeinte.simscript.generator.ResourceUtil
import nl.dslmeinte.simscript.generator.util.GeneratorUtil
import nl.dslmeinte.simscript.types.Structure
import org.eclipse.xtext.generator.IFileSystemAccess

import static nl.dslmeinte.simscript.backend.simBackendDsl.CrudTypes.*

class CrudServletsGenerator {

	@Inject extension GeneratorUtil
	@Inject extension ResourceUtil
	@Inject extension JavaGeneratorHelper

	def generateServlets(CrudService it, String basePath, IFileSystemAccess fileSystemAccess) {
		for( service : services ) {
			fileSystemAccess.generateFile(basePath + "/servlets/" + structure.servletName(service) +".java", structure.generateCrudServlet(service))
		}
	}

	def generateCrudServlet(Structure it, CrudTypes service)
		'''
		«header»
		package «packageName».servlets;

		import org.apache.shiro.subject.Subject;
		import com.google.common.collect.ImmutableList;
		import com.initrode.api.servlets.AbstractInitrodeServlet;
		import com.initrode.api.db.data.util.HttpGetParameterUtil;
		import com.initrode.api.exceptions.MultipleValuesForParameterException;
		import com.initrode.api.exceptions.MandatoryKeyMissingException;
		import com.initrode.api.exceptions.NoResultException;
		import javax.servlet.http.HttpServletResponse;
		import javax.servlet.http.HttpServletRequest;
		import java.io.PrintWriter;
		import java.util.Map;
		import java.util.UUID;
		import com.initrode.api.RequestParameterExtractor;
		import «it.asJavaTypeLiteral»;
		import «it.controller»;
		
		@SuppressWarnings("serial")
		public class «servletName(service)» extends AbstractInitrodeServlet {

			private static final String DATA = "«name.toFirstLower»";

			@Override
			protected void performAction(HttpServletRequest request,
				HttpServletResponse response, PrintWriter out, Subject subject) {
				«IF service != CREATE»try {«ENDIF»
					«getInput(it, service)»
					«databaseAction(it, service)»
				«IF service != CREATE»
				} catch(MultipleValuesForParameterException e) {
					throw new IllegalArgumentException(e.getMessage());
				} catch (MandatoryKeyMissingException e) {
					throw new IllegalArgumentException(e.getMessage());
				}
				«IF service == GET_BY_ID»
				catch (NoResultException e) {
					throw new IllegalArgumentException(e.getMessage());
				}
				«ENDIF»
				«ENDIF»
			}

		}
		'''

	def private getInput(Structure it, CrudTypes service) {
		switch service {
			case CREATE:	inputStructure
			case GET_BY_ID:	inputId
			case UPDATE:
				'''
				// an ID is required for the update servlet, so depend on the MandatoryKeyMissingException:
				RequestParameterExtractor.getSingleValue(«name».ID, request);
				«inputStructure»
				'''
			case DELETE:	inputId
		}
	}

	def private getInputId(Structure it)
		'''
		UUID id = UUID.fromString(RequestParameterExtractor.getSingleValue(«name».ID, request));
		'''

	def private getInputStructure(Structure it)
		'''
		@SuppressWarnings("unchecked")
		Map<String, String[]> inputMap = request.getParameterMap();
		«name» input = «name».fromGetParams(HttpGetParameterUtil.getSubParams(DATA, inputMap));
		'''

	def private databaseAction(Structure it, CrudTypes service) {
		switch service {
			case CREATE:	databaseActionPersist
			case GET_BY_ID:	databaseActionRead
			case UPDATE:	databaseActionPersist
			case DELETE:	databaseActionDelete
		}
	}

	def private databaseActionRead(Structure it)
		'''
		«name» output = new «name»Controller().read(id);
		out.write(output.toString());
		'''

	def private databaseActionPersist(Structure it)
		'''
		new «name»Controller().persist(input);
		out.write(input.toString());
		'''

	def private databaseActionDelete(Structure it)
		'''
		new «name»Controller().remove(id);
		out.write("{\"success\": \"true\"}");
		'''

	def servletName(Structure it, CrudTypes crudType) {
		crudType.getName().toLowerCase.toFirstUpper + name.toFirstUpper + "Servlet"
	}

}
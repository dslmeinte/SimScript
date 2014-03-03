package nl.dslmeinte.simscript.generator.backend

import com.google.inject.Inject
import com.google.inject.Singleton
import nl.dslmeinte.simscript.backend.SimBackendDslExtensions
import nl.dslmeinte.simscript.backend.simBackendDsl.Interface
import nl.dslmeinte.simscript.generator.ResourceUtil
import nl.dslmeinte.simscript.generator.util.GeneratorUtil
import nl.dslmeinte.simscript.types.TypeExtensions

/**
 * Generator for the servlets (base + implementation class) corresponding to {@link Interface interfaces}.
 * 
 * @author Meinte Boersma, Volker Lanting
 */
@Singleton
class ServletGenerator {

	@Inject extension GeneratorUtil
	@Inject extension ResourceUtil
	@Inject extension JavaGeneratorHelper
	@Inject extension SimBackendDslExtensions
	@Inject extension TypeExtensions

	def generateBaseServlet(Interface it)
		'''
		«header»
		package «packageName».servlets;

		«IF notAuthenticated»		
			import java.io.IOException;
			import javax.servlet.ServletException;
			import javax.servlet.http.HttpServlet;
		«ENDIF»

		«IF !notAuthenticated»
			import com.initrode.api.servlets.AbstractInitrodeServlet;
			import org.apache.shiro.subject.Subject;
			import org.apache.shiro.authz.AuthorizationException;
		«ENDIF»

		import com.initrode.api.ServletErrorUtil;
		import com.initrode.api.exceptions.ServerException;
		import com.initrode.api.db.data.util.HttpGetParameterUtil;

		import java.io.PrintWriter;
		import java.util.Map;
		import java.util.List;

		import javax.servlet.http.HttpServletResponse;
		import javax.servlet.http.HttpServletRequest;

		import org.slf4j.Logger;
		import org.slf4j.LoggerFactory;

		«IF inputType != null»
		import «inputType.type.asJavaTypeLiteral»;
		«ENDIF»
		«IF outputType != null»
		import «outputType.effectiveOutputType.asJavaTypeLiteral»;
		«ENDIF»

		@SuppressWarnings("serial")
		public abstract class Abstract«name.toFirstUpper»Servlet extends «IF notAuthenticated»HttpServlet«ELSE»AbstractInitrodeServlet«ENDIF» {

			private static final Logger LOG = LoggerFactory.getLogger(Abstract«name.toFirstUpper»Servlet.class);

			«IF notAuthenticated»
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
				doPost(req, resp);
			}
			«ENDIF»

			@Override
			protected void «IF notAuthenticated»doPost«ELSE»performAction«ENDIF»(HttpServletRequest request, 
				HttpServletResponse response
				«IF notAuthenticated»)«ELSE», PrintWriter out, Subject subject)«ENDIF» {

				try {
					«IF inputType != null»
						@SuppressWarnings("unchecked")
							Map<String, String[]> inputMap = request.getParameterMap();
						«inputType.type.name» input = «inputType.type.name».fromGetParams(HttpGetParameterUtil.getSubParams("«inputType.structure.name.toFirstLower»", inputMap));
					«ENDIF»
					«IF outputType!=null»«outputType.asJavaTypeLiteral» output = «ENDIF»
					executeContract(
						«IF inputType != null»input«ENDIF»«IF inputType != null && !notAuthenticated»,«ENDIF»
						«IF !notAuthenticated»subject«ENDIF»);
					«IF outputType!=null»
						«IF notAuthenticated»final PrintWriter out = response.getWriter();«ENDIF»
						out.write(output.toString());
						«IF notAuthenticated»out.close();«ENDIF»
					«ENDIF»
				} catch(ServerException e) {
					LOG.error("error", e);
					ServletErrorUtil.sendError(response, HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.getMessage());
				} catch(IllegalArgumentException e) {
					LOG.error("error", e);
					ServletErrorUtil.sendError(response, HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
				«IF !notAuthenticated»
					} catch(AuthorizationException e) {
						LOG.error("Someone tried to do something that was not allowed", e);
						ServletErrorUtil.sendError(response, HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
				«ENDIF»	
				} catch(Exception e) {
					LOG.error("ERROR: unexpected exception, CRITICAL: {}", e);
					response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				}
			}

			protected abstract «IF outputType == null»void«ELSE»«outputType.asJavaTypeLiteral»«ENDIF» executeContract(
				«IF inputType != null»«inputType.type.name» input«ENDIF»«IF inputType != null && !notAuthenticated»,«ENDIF»«IF !notAuthenticated»Subject subject«ENDIF»)
				throws ServerException, IllegalArgumentException«IF !notAuthenticated», AuthorizationException«ENDIF»;
		}
		'''
}

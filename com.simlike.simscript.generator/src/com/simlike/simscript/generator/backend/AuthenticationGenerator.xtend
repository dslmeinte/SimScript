package com.simlike.simscript.generator.backend

import com.google.inject.Inject
import com.simlike.simscript.backend.simBackendDsl.AuthenticationDeclaration
import com.simlike.simscript.generator.ResourceUtil
import com.simlike.simscript.structure.types.TypeExtensions
import org.eclipse.xtext.generator.IFileSystemAccess

class AuthenticationGenerator {

	@Inject extension ResourceUtil
	@Inject extension JavaGeneratorHelper
	@Inject extension TypeExtensions

	def generateAuthenticationTokenCreator(AuthenticationDeclaration it, String basePath, IFileSystemAccess fileSystemAccess) {
		fileSystemAccess.generateFile(basePath + '''/Abstract«name»AuthenticationTokenCreator.java''', generateAbstractAuthenticationTokenCreator)
	}

	def generateAuthenticationSource(Iterable<AuthenticationDeclaration> all)
		'''
		package com.simlike.api.auth;

		import java.util.Map;

		import com.simlike.api.auth.tokens.MyAuthenticationToken;

		public enum AuthenticationSource {

			«FOR authOpt : all SEPARATOR ","»
				«authOpt.name.toUpperCase»(new «authOpt.name»AuthenticationTokenCreator())
			«ENDFOR»;

			private static final String TYPE_KEY = "type";

			private final IAuthenticationTokenCreator tokenCreator;

			private AuthenticationSource(final IAuthenticationTokenCreator tokenCreator) {
				this.tokenCreator = tokenCreator;
			}

			/**
			 * Parses the given http parameters to authenticate a user and 
			 * create an {@link AuthenticationToken} for him/her.
			 * @param httpParams the {@link AuthenticationSource} to use and principals and credentials objects.
			 * Should be of the format:
			 * {@value #TYPE_KEY} : name of the AuthenticationSource to use
			 * {@value #PRINCIPALS_KEY} : the Object that identifies the user
			 * {@value #CREDENTIALS_KEY}: the Object that can be used to verify the principals
			 * 
			 * The Objects will be read from the httpParams by the HttpGetParameterUtil.
			 * @return an {@link AuthenticationToken} which the user can use to call servlets.
			 * 
			 */
			public static MyAuthenticationToken getAuthToken(Map<String, String[]> httpParams) {
				String[] typeParam = httpParams.get(TYPE_KEY);
				if (typeParam == null || typeParam.length > 1 || typeParam.length < 1) {
					throw new IllegalArgumentException("Invalid AuhtenticationSource specified.");
				}
				final AuthenticationSource source = valueOf(typeParam[0].toUpperCase());

				return source.tokenCreator.getToken(httpParams);
			}
		}
		'''

	def generateAbstractAuthenticationTokenCreator(AuthenticationDeclaration it)
		'''
		package «packageName»;

		import java.util.Map;

		import org.apache.shiro.authc.AuthenticationException;

		import com.simlike.api.auth.tokens.MyAuthenticationToken;
		import com.simlike.api.controllers.SimpleTypeFactory;

		public abstract class Abstract«name»AuthenticationTokenCreator implements IAuthenticationTokenCreator {

			private static final String PRINCIPALS_KEY = "«principal.name»";
			private static final String CREDENTIALS_KEY = "«credential.name»";

			@Override
			public MyAuthenticationToken getToken(final Map<String, String[]> httpParams) throws AuthenticationException {
				«IF principal.type.simpleTyped»
					final String[] principalArray = httpParams.get(PRINCIPALS_KEY);
					if (principalArray == null || principalArray.length != 1) {
						throw new IllegalArgumentException("Invalid principals.");
					}
					final «principal.type.asJavaTypeLiteral» principal = «credential.type.factoryMethodQualifiedName»(principalArray[0]);
				«ELSEIF principal.type.structureTyped»
					final «principal.type.asJavaTypeLiteral» principal = «principal.type.asJavaTypeLiteral».fromGetParams(
						HttpGetParameterUtil.getSubParams(PRINCIPALS_KEY, httpParams);
					);
				«ELSE»
					// Lists are not supported (yet?)
					UNSUPPORTED PRINCIPALS TYPE!!!
				«ENDIF»
				«IF credential.type.simpleTyped»
					final String[] credentialArray = httpParams.get(CREDENTIALS_KEY);
					if (credentialArray == null || credentialArray.length != 1) {
						throw new IllegalArgumentException("Invalid credentials.");
					}
					final «credential.type.asJavaTypeLiteral» credential = «credential.type.factoryMethodQualifiedName»(credentialArray[0]);
				«ELSEIF credential.type.structureTyped»
					final «credential.type.asJavaTypeLiteral» credential = «credential.type.asJavaTypeLiteral».fromGetParams(
						HttpGetParameterUtil.getSubParams(CREDENTIALS_KEY, httpParams);
					);
				«ELSE»
					// Lists are not supported (yet?)
					UNSUPPORTED CREDENTIALS TYPE!!!
				«ENDIF»
				return getToken(principal, credential);
			}

			public abstract MyAuthenticationToken getToken(final «principal.type.asJavaTypeLiteral» «principal.name», final «credential.type.asJavaTypeLiteral» «credential.name») throws AuthenticationException;

		}
		'''

}

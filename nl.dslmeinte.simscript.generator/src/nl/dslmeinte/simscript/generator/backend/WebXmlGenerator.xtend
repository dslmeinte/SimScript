package nl.dslmeinte.simscript.generator.backend

import com.google.inject.Inject
import nl.dslmeinte.simscript.backend.simBackendDsl.CrudService
import nl.dslmeinte.simscript.backend.simBackendDsl.Interface
import nl.dslmeinte.simscript.backend.simBackendDsl.LegacyServlet
import nl.dslmeinte.simscript.backend.simBackendDsl.Service
import nl.dslmeinte.simscript.extensions.BackendExtensions
import nl.dslmeinte.simscript.generator.ResourceUtil
import nl.dslmeinte.simscript.structure.structureDsl.Structure

/**
 * Generates the {@code web.xml}.
 * 
 * @author Meinte Boersma
 */
class WebXmlGenerator {

	@Inject extension ResourceUtil
	@Inject extension BackendExtensions
	@Inject private CrudServletsGenerator crudServletGenerator

	def generateWebXml(Iterable<Service> declarations) {
		// XSD-style (incompatible with Shiro configuration?):
//		'''
//		<?xml version="1.0" encoding="utf-8"?>
//		<web-app
//				xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//				xmlns="http://java.sun.com/xml/ns/javaee"
//				xmlns:web="http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
//				xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd" version="2.5"
//		>
		val crudServices = declarations.filter(typeof(CrudService))
		val interfaces = declarations.filter(typeof(Interface)).sortBy[name]
		val legacyServlets = declarations.filter(typeof(LegacyServlet)).sortBy[name]

		'''
		<!DOCTYPE web-app PUBLIC
		  '-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN'
		  'http://java.sun.com/dtd/web-app_2_3.dtd'>
		<web-app>

			«generateShiroConfiguration»

			<!-- structures with services -->
			«FOR crudService : crudServices»
				«FOR service : crudService.services»
				<servlet>
					<servlet-name>«service.literal»«crudService.structure.name»</servlet-name>
					<servlet-class>«crudService.structure.packageName».servlets.«crudServletGenerator.servletName(crudService.structure, service)»</servlet-class>
				</servlet>

				«ENDFOR»
			«ENDFOR»

			<!-- declared interfaces -->
			«FOR it : interfaces»
				<servlet>
					<servlet-name>«name»</servlet-name>
					<servlet-class>«packageName».servlets.«name.toFirstUpper»</servlet-class>
				</servlet>

			«ENDFOR»

			<!-- legacy servlets -->
			«FOR it : legacyServlets»
				<servlet>
					<servlet-name>«name»</servlet-name>
					<servlet-class>«fqClassName»</servlet-class>
				</servlet>

			«ENDFOR»

			<!-- structures with services -->
			«FOR crudService : crudServices»
				«FOR service : crudService.services»
					<servlet-mapping>
						<servlet-name>«service.literal»«crudService.structure.name»</servlet-name>
						<url-pattern>/«crudService.structure.url(service.literal)»</url-pattern>
					</servlet-mapping>

				«ENDFOR»
			«ENDFOR»

			<!-- declared interfaces -->
			«FOR it : interfaces»
				<servlet-mapping>
					<servlet-name>«name»</servlet-name>
					<url-pattern>/«url»</url-pattern>
				</servlet-mapping>

			«ENDFOR»

			<!-- legacy servlets -->
			«FOR it : legacyServlets»
				<servlet-mapping>
					<servlet-name>«name»</servlet-name>
					<url-pattern>«url»</url-pattern>
				</servlet-mapping>

			«ENDFOR»

			<welcome-file-list>
				<welcome-file>index.html</welcome-file>
			</welcome-file-list>

		</web-app>
		'''
	}

	def private url(Structure it, String serviceLiteral) {
		'''/«serviceLiteral»«name»'''
	}

	def private generateShiroConfiguration()
		'''
		<!-- begin Shiro 1.2 configuration -->
		  <filter>
		    <filter-name>ShiroFilter</filter-name>
		    <filter-class>org.apache.shiro.web.servlet.ShiroFilter</filter-class>
		  </filter>
			<filter>
				<filter-name>ResponseHeaderFilter</filter-name>
				<filter-class>nl.dslmeinte.api.filters.ResponseHeaderFilter</filter-class>
				<init-param>
					<param-name>Access-Control-Allow-Origin</param-name>
					<param-value>*</param-value>
				</init-param>
			</filter>

			<filter-mapping>
				<filter-name>ResponseHeaderFilter</filter-name>
				<url-pattern>/*</url-pattern>
			</filter-mapping>
		  <!-- ShiroFilter filter-mapping
		It is usually desirable to define the ShiroFilter filter-mapping before
		any other filter-mapping declarations to ensure that Shiro can function
		in those filters as well. -->

		  <filter-mapping>
		    <filter-name>ShiroFilter</filter-name>
		    <url-pattern>/*</url-pattern>
		  </filter-mapping>

		  <listener>
		    <listener-class>org.apache.shiro.web.env.EnvironmentLoaderListener</listener-class>
		  </listener>

		<!--  end Shiro 1.2 configuration -->
		'''

}

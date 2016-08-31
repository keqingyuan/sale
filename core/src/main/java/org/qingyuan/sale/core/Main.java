/**
* <p>
* @className:Main.java
* @classDescription:
* <p>
* @createTime：2016年8月31日
* @author：Qingyuan
*/

package org.qingyuan.sale.core;

import java.io.IOException;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.session.HashSessionIdManager;
import org.eclipse.jetty.server.session.HashSessionManager;
import org.eclipse.jetty.server.session.SessionHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
* <p>
* @className:Main.java
* @classDescription:
* <p>
* @createTime:2016年8月31日
* @author:Qingyuan
*/

public class Main {

	private final static Logger logger = LoggerFactory.getLogger(Main.class);

	// 默认端口
	private static final int DEFAULT_PORT = 8080;
	// Context路径
	private static final String CONTEXT_PATH = "/";
	// Mapping路径
	private static final String MAPPING_URL = "/";
	// 应用配置路径
	private static final String CONFIG_PATH = "classpath:application-context.xml";
	// 执行环境
	private static final String DEFAULT_PROFILE = "dev";
	
	private static int getPortFromArgs(String[] args) {
		if (args.length > 0) {
			try {
				return Integer.valueOf(args[0]);
			} catch (NumberFormatException ignore) {
				throw ignore;
			}
		}
		logger.debug("No server port configured, defalut port {}", DEFAULT_PORT);
		return DEFAULT_PORT;
	}

	private void start(int port) throws Exception {
		logger.debug("Starting server at port {}", port);
		Server server = new Server(port);

		// Create spring context
		ContextHandler context = getServletContextHandler(getContext());
		server.setHandler(context);

		// Specify the Session ID Manager
		HashSessionIdManager idmanager = new HashSessionIdManager();
		server.setSessionIdManager(idmanager);

		// Create the SessionHandler (wrapper) to handle the sessions
		HashSessionManager manager = new HashSessionManager();
		manager.setMaxInactiveInterval(60 * 30); // session timeout half hour
		SessionHandler sessions = new SessionHandler(manager);
		context.setHandler(sessions);

		server.start();
		logger.info("Server started at port {}", port);
		server.join();
	}

	private static ServletContextHandler getServletContextHandler(WebApplicationContext context) throws IOException {
		ServletContextHandler contextHandler = new ServletContextHandler();
		contextHandler.setErrorHandler(null);
		contextHandler.setContextPath(CONTEXT_PATH);
		contextHandler.addServlet(new ServletHolder(new DispatcherServlet(context)), MAPPING_URL);
		//contextHandler.addFilter(SessionOutFilter.class, MAPPING_URL, EnumSet.of(DispatcherType.INCLUDE, DispatcherType.REQUEST));
		contextHandler.addEventListener(new ContextLoaderListener(context));
		//contextHandler.setResourceBase(new ClassPathResource("webapp").getURI().toString());

		return contextHandler;
	}

	private static WebApplicationContext getContext() {
		XmlWebApplicationContext context = new XmlWebApplicationContext();
		context.setConfigLocations(CONFIG_PATH);
		context.getEnvironment().setDefaultProfiles(DEFAULT_PROFILE);
		return context;
	}
	
	/**
	 *<p>
	 * 功能描述：
	 *</p>
	 * @param args   
	 */
	public static void main(String[] args) {
		try {
			new Main().start(getPortFromArgs(args));
		} catch (Exception e) {
			logger.error("系统退出", e);
			System.exit(-1);
		}
	}
	
	

}

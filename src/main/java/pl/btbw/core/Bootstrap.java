//package pl.btbw.core;
//
//import io.swagger.jaxrs.config.BeanConfig;
//
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//
// // this class is needed if you are using web.xml configuration
//public class Bootstrap extends HttpServlet {
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//		super.init(config);
//
//		BeanConfig beanConfig = new BeanConfig();
//		beanConfig.setVersion("1.0.2");
//		beanConfig.setSchemes(new String[]{"http"});
//		beanConfig.setHost("localhost:8080");
//		beanConfig.setBasePath("/");
//		beanConfig.setResourcePackage("pl.btbw.modules");
//		beanConfig.setScan(true);
//	}
//}

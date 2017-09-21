package pl.btbw.core;

import io.swagger.jaxrs.config.BeanConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class MyApplication extends Application {

	// https://github.com/swagger-api/swagger-core/wiki/Swagger-Core-RESTEasy-2.X-Project-Setup-1.5#adding-the-dependencies-to-your-application
	// https://github.com/swagger-api/swagger-core/wiki/Annotations-1.5.X

	public MyApplication() {
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setVersion("1.0.0");
		beanConfig.setSchemes(new String[]{"http"});
		beanConfig.setHost("localhost:8080");
		beanConfig.setBasePath("/jee-swagger/rest");
		beanConfig.setResourcePackage("pl.btbw.modules");
		beanConfig.setScan(true);
	}

}

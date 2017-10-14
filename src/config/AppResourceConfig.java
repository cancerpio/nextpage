package config;

import javax.enterprise.inject.New;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import filter.CORSFilter;

@ApplicationPath("rest")
public class AppResourceConfig extends ResourceConfig {

    public AppResourceConfig() {
	
	register(JacksonFeature.class);
	register(new CORSFilter());
	packages("api");
    }

}



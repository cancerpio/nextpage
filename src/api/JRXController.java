package api;

import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import bean.JasonTemplateBean;
import module.MockDataService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.json.Json;
import javax.json.JsonObject;

@Path("/data")
public class JRXController {

    MockDataService mockDataService;

    public JRXController() {
	super();
	mockDataService = MockDataService.getInstance();
	// TODO Auto-generated constructor stub
    }

    @GET
    public String getString() {
	return "haha";
    }

    @Path("/json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJason() {
	return Response
		.ok(Json.createObjectBuilder().add("distination", "A").add("distination", "B").build().toString(),
			MediaType.APPLICATION_JSON)
		.build();
    }

    @Path("/json2")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<JasonTemplateBean> getJasonArrayFromBean() {
	return this.mockDataService.getAllHero();
    };

    @Path("/json2/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JasonTemplateBean getJasonFromBean(@PathParam("id") int id) {
	return this.mockDataService.getHero(id);

    }

    @Path("/json2/name={name}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<JasonTemplateBean> getJasonFromBean2(@PathParam("name") String name) {
	return this.mockDataService.getHeroByName(name);

    }

    @Path("/json2")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addJasonFromString(String name) {
	int id = this.mockDataService.getNewesId() + 1;
	ObjectMapper mapper = new ObjectMapper();
	try {
	    HashMap map = mapper.readValue(name, HashMap.class);
	    System.out.println("I got name : " + (String)map.get("name"));
	    this.mockDataService.addHeroByIdName(id,(String)map.get("name"));
	} catch (JsonParseException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (JsonMappingException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	
	
	System.out.println("data map size:" + this.mockDataService.getNewesId());
    }
}

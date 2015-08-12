package demo.cxf.rest_spring_cxf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
@Path("/hello")
public interface HelloService {

    @GET
    @Path("/say")
    @Produces(MediaType.APPLICATION_JSON)
    String say();
}

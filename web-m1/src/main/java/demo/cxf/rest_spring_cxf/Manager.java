package demo.cxf.rest_spring_cxf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by sunqingqing on 15/8/12.
 */
public interface Manager {
    @GET
    @Path("/names")
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> fetchName();
}

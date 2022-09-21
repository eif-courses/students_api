package eif.viko.lt.marius.central;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


//# Rapid prototyping time!
//    mvn compile quarkus:dev -Dquarkus.profile=dev-with-data
// .\mvnw compile quarkus:dev
//
//    # And now, let's be ready for prod
//    mvn clean package -Pnative -Dquarkus.profile=prod



@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
}
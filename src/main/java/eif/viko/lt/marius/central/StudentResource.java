package eif.viko.lt.marius.central;


import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/students")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StudentResource {

  @Inject
  StudentService service;

  @POST
  @Transactional
  public Response createStudent(Student student){
    service.createStudent(student);
    return Response.ok(student).status(Response.Status.CREATED).build();
  }

  @GET
  @Path("/")
  public Response getAllStudents(){
    return Response.ok(service.getAllStudents()).build();
  }


}

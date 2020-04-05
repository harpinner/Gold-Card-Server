package paths;


import data.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

public class StudentResource {



    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Student getStudent(@PathParam("id") int studentID)
    {
        return new Student();
    }

    @PUT
    @Path("{id}")
    public String updateStudent(@PathParam("id") int gid, Student theStudent)
    {
        return "success";
    }

   @POST
    public String createStudent(Student theStudent)
    {
        return "success";
    }

    @DELETE
    @Path("{id}")
    public String deleteStudent(Student theStudent)
    {
        return "success";
    }

}

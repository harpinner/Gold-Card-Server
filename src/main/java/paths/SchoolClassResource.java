package paths;

import data.SchoolClass;
import data.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

public class SchoolClassResource {
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public SchoolClass getSchoolClass(@PathParam("id") int schoolClassID)
    {
        return new SchoolClass();
    }

    @PUT
    @Path("{id}")
    public String updateSchoolClass(@PathParam("id") int gid, SchoolClass theSchoolClass)
    {
        return "success";
    }

    @POST
    public String createSchoolClass(SchoolClass theSchoolClass)
    {
        return "success";
    }

    @DELETE
    @Path("{id}")
    public String deleteSchoolClass(SchoolClass theSchoolClass)
    {
        return "success";
    }

    @PUT
    @Path("student/{id}")
    public String enrollStudent(Student aStudent)
    {
        return "success";
    }

    @DELETE
    @Path("student/{id}")
    public String dismissStudent(Student aStudent)
    {
        return "success";
    }



}

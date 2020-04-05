package paths;

import data.Staff;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

public class StaffResource {
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Staff getStaff(@PathParam("id") int staffID)
    {
        return new Staff();
    }

    @PUT
    @Path("{id}")
    public String updateStaff(@PathParam("id") int gid, Staff theStaff)
    {
        return "success";
    }

    @POST
    public String createStaff(Staff theStaff)
    {
        return "success";
    }

    @DELETE
    @Path("{id}")
    public String deleteStaff(Staff theStaff)
    {
        return "success";
    }
}

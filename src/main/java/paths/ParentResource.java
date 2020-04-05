package paths;

import data.Parent;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

public class ParentResource {
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Parent getParent(@PathParam("id") int parentID)
    {
        return new Parent();
    }

    @PUT
    @Path("{id}")
    public String updateParent(@PathParam("id") int gid, Parent theParent)
    {
        return "success";
    }

    @POST
    public String createParent(Parent theParent)
    {
        return "success";
    }

    @DELETE
    @Path("{id}")
    public String deleteParent(Parent theParent)
    {
        return "success";
    }
}

package paths;

import data.GoldCard;

import javax.persistence.EntityManager;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;


@Path("goldcard")
public class GoldCardResource{


    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public GoldCard getCard(@PathParam("id") int gid)
    {
        return new GoldCard();
    }

    @PUT
    @Path("{id}")
    public String updateCard(@PathParam("id") int gid, GoldCard theCard)
    {
        return "success";
    }

    @DELETE
    @Path("{id}")
    public  String deleteCard(@PathParam("id") int gid)
    {
        return "success";
    }

    @POST
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public GoldCard createCard(GoldCard theCard)
    {
        theCard.setId(1231);
        return theCard;
    }

    @GET
    @Path("studentcards/{id}")
    public List<GoldCard> studentCards(@PathParam("id") int studentID)
    {
        List<GoldCard> thelist = new ArrayList<GoldCard>();
        return  thelist;
    }

    @GET
    @Path("prizeCard")
    public GoldCard prizeDraw()
    {
        return new GoldCard();
    }




}

package tn.JobPortal.RestEasy.Controller;

import tn.JobPortal.RestEasy.Model.Offer;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@ApplicationScoped
@Path("/Offer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface OfferController {
    @GET
    @Path("/hello")
    public long hello() ;
    @GET
    public List<Offer> getAll() ;
    @GET
    @Path("/{url}")
    public Offer getByUrl(@PathParam("url") String url);
    @POST
    public Offer create(@Valid Offer offer);
    @DELETE
    @Path("/{url}")
    public void delete (@PathParam("url") String url);
    @GET
    @Path("/Collect")
    List<Offer> collectData();

}
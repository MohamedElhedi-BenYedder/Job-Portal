package tn.JobPortal.RestEasy.Controller;


import tn.JobPortal.RestEasy.Model.Profile;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@ApplicationScoped
@Path("/Profile")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface ProfileController {
    @GET
	@Path("/hello")
	public long hello() ;
    @GET
    public List<Profile> getAll() ;
    @GET
    @Path("/{userName}")
    public Profile getByUserName(@PathParam("userName") String userName);
    @POST
    public Profile create(@Valid Profile profile);
    @DELETE
    @Path("/{userName}")
    public void delete (@PathParam("userName") String userName);

}

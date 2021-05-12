package tn.JobPortal.RestEasy.Controller;

import java.util.List;


import javax.validation.Valid;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.jnosql.artemis.ConfigurationUnit;

import tn.JobPortal.RestEasy.Model.Profile;
import tn.JobPortal.RestEasy.Repository.ProfileRepository;
import tn.JobPortal.RestEasy.Service.ProfileServiceImpl;


@Path("/Profile")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfileController {
    //@Inject
    //@ConfigurationUnit(database = "Profile")
    private ProfileServiceImpl profileService = new ProfileServiceImpl(new ProfileRepository());

    @GET
	@Path("/hello")
	public Profile hello() {
		return new Profile("0");
	}
    @GET
    public List<Profile> getAll()
    {
        return profileService.getAll();
    }
    @GET
    @Path("/{userName}")
    public Profile getByUserName(@PathParam("userName") String userName)
    {
        return profileService.getByUserName(userName);
    }
    @POST
    public Profile create(@Valid Profile profile)
    {
        return profileService.create(profile);
    }
    
}

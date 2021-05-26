package tn.JobPortal.RestEasy.Controller;

import tn.JobPortal.RestEasy.Model.Profile;
import tn.JobPortal.RestEasy.Service.ProfileServiceImpl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@ApplicationScoped
@Path("/Profile")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfileControllerImpl implements ProfileController{
    @Inject
    private  ProfileServiceImpl profileService ;
    @Override
    public long hello() {
        return profileService.count();

    }
    @Override
    public List<Profile> getAll()  {
        return profileService.getAll();
    }
    @Override
    public Profile getByUserName(String userName) {

        return profileService.getByUserName(userName);
    }
    @Override
    public Profile create(Profile profile)
    {
        return profileService.create(profile);
    }
    @Override
    public void delete (String userName)
    {
        profileService.delete(userName);
    }

}

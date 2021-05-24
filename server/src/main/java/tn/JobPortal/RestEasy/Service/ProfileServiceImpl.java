package tn.JobPortal.RestEasy.Service;

import tn.JobPortal.RestEasy.Model.Profile;
import tn.JobPortal.RestEasy.Model.Account;
import tn.JobPortal.RestEasy.Repository.ProfileRepository;
import javax.inject.Inject;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.function.Supplier;

public  class  ProfileServiceImpl implements ProfileService{

    private static final Supplier<WebApplicationException> NOT_FOUND =
            () -> new WebApplicationException(Response.Status.NOT_FOUND);

    @Inject
    private ProfileRepository profileRepository;
    @Override
    public Profile create(Profile profile) {
            return profileRepository.save(profile);
    }
    @Override
    public Profile update(Profile profile) {
        
            return profileRepository.save(profile);
    }
    @Override 
    public void delete(String userName) {
        Account account = new Account();
        account.setUserName(userName);
        profileRepository.deleteById(account);
        
    } 
    @Override
    public Profile getByUserName(String userName)  {
        Account account = new Account();
        account.setUserName(userName);
        return profileRepository.findById(account).orElseThrow(NOT_FOUND);
    }
    @Override
    public List<Profile> getAll() {
        return profileRepository.findAll();
    }
    @Override
    public long count() {
        return profileRepository.count();
    }

}

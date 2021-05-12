package tn.JobPortal.RestEasy.Service;

import java.util.List;



import tn.JobPortal.RestEasy.Model.Profile;
import tn.JobPortal.RestEasy.Repository.ProfileRepository;


public  class  ProfileServiceImpl implements ProfileService{
    
    //@Inject
    //@ConfigurationUnit(database = "ProNet")
    private ProfileRepository profileRepository;
    public ProfileServiceImpl(ProfileRepository profileRepository)
    {
        this.profileRepository = profileRepository;
    }
    
    
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
        profileRepository.deleteById(userName);
        
    } 
    @Override
    public Profile getByUserName(String userName) {
        return profileRepository.findById(userName);
    }
    @Override
    public List<Profile> getAll() {
        return profileRepository.findAll();
    }
   
    
}

package tn.JobPortal.RestEasy.Service;

import java.util.List;

import tn.JobPortal.RestEasy.Model.Profile;


public interface ProfileService {
    public Profile create (Profile profile);
    public Profile update (Profile profile);
    public void delete (String username);
    public Profile getByUserName(String userName);
    public List<Profile> getAll();

    
}

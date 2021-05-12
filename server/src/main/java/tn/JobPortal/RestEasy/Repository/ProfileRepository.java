package tn.JobPortal.RestEasy.Repository;

import tn.JobPortal.RestEasy.Model.Profile;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProfileRepository {
    static private Map<String,Profile> profileCollection = new HashMap<String,Profile>(Map.of("1", new Profile("1")));
    public Profile save(Profile profile) {
        return  profileCollection.put(profile.getUserName(), profile);
    }
    public Profile findById(String Id)
    {
        return profileCollection.getOrDefault(Id,new Profile());
    }
    public List<Profile> findAll()
    {
        return  new ArrayList<Profile>(profileCollection.values());
    }
    public void deleteById(String Id)
    {
        profileCollection.remove(Id);
    }




}

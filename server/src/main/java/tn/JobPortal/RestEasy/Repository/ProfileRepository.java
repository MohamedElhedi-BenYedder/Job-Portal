package tn.JobPortal.RestEasy.Repository;


import jakarta.nosql.mapping.Repository;
import tn.JobPortal.RestEasy.Model.Profile;
import tn.JobPortal.RestEasy.Model.Account;

import java.util.List;
public interface ProfileRepository extends Repository<Profile, Account> {
    public List<Profile> findAll();
}

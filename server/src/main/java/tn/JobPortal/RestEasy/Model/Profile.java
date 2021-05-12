package tn.JobPortal.RestEasy.Model;

import org.jnosql.artemis.Column;
import org.jnosql.artemis.Entity;
import org.jnosql.artemis.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.JobPortal.RestEasy.Util.City;
import tn.JobPortal.RestEasy.Util.FullName;
import tn.JobPortal.RestEasy.Util.Gender;


import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
//@Entity("Profile")
public class Profile {
    @Id("userName")
    String userName;
    Date creationDate;
    @Column
    FullName fullName;
    Date birDate;
    @Column
    Gender gender;
    City city;
    @Column
    String aboutMe;
    public Profile(String id)
    {
        userName =id;
    }
    // List<Interest> interest;
    // List<Language> language;
    // List<Award> award;
    // List<Education> education ;
    // List<Position> position;
    // List<Project> project;
    // List<Certification> certification;
    // List<Other> other ;


}

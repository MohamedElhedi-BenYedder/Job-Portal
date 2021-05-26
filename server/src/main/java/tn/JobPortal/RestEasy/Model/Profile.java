package tn.JobPortal.RestEasy.Model;
import jakarta.nosql.mapping.Column;
import jakarta.nosql.mapping.Embeddable;
import jakarta.nosql.mapping.Entity;
import jakarta.nosql.mapping.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.JobPortal.RestEasy.Util.*;

import javax.swing.text.Position;
import java.sql.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Embeddable
@Entity("Profile")
public class Profile {
    @Id("account")
    Account account;
    @Column
    FullName fullName;
    Date birDate;
    @Column
    Gender gender;
    City city;
    @Column
    String aboutMe;

   // List<Interest> interest;
    List<Language> language;
    //List<Award> award;
    List<Education> education ;
    List<Position> position;
    List<Project> project;
    //List<Certification> certification;
    // List<Other> other ;
    Boolean lookingForJob;


}

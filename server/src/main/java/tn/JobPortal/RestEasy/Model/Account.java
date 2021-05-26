package tn.JobPortal.RestEasy.Model;

import jakarta.nosql.mapping.Column;
import jakarta.nosql.mapping.Entity;
import jakarta.nosql.mapping.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.JobPortal.RestEasy.Model.Login.Login;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity("Account")
public class Account {
    @Id
    private String userName;
    @Column
    private Date   creationDate;
    @Column
    private List<Company> asCompany ;
    //@Column
    //private Map<String,Login> logins;
}

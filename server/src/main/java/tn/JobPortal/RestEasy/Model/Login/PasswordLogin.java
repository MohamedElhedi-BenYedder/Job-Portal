package tn.JobPortal.RestEasy.Model.Login;


import jakarta.nosql.mapping.Column;
import jakarta.nosql.mapping.Entity;

@Entity("Login")
public class PasswordLogin implements Login{
    @Column("blabla")
    private String password;
    @Override
    public String getToken() {
        return null;
    }
}

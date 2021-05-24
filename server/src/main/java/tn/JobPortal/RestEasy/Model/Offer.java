package tn.JobPortal.RestEasy.Model;

import jakarta.nosql.mapping.Column;
import jakarta.nosql.mapping.Entity;
import jakarta.nosql.mapping.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity("Offer")
public class Offer {
    @Column
    private String title;
    @Column
    private String dateOfPub;
    @Id
    @Column
    private String originalLink;
    @Column
    private String company;
    @Column
    private String location;
}

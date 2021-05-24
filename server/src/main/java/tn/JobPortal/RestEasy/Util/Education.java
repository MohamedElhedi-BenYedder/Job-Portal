package tn.JobPortal.RestEasy.Util;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
public class Education {
    Date startDate;
    Date endDate;
    School school;
    String description;

    
}

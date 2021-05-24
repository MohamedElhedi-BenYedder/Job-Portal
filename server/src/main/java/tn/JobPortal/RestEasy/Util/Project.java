package tn.JobPortal.RestEasy.Util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.JobPortal.RestEasy.Util.Link.Link;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Project {
    private Date startDate;
    private Date endDate;
    private String name;
    private String description;
    private Link link;
}

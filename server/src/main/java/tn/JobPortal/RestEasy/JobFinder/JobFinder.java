package tn.JobPortal.RestEasy.JobFinder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import tn.JobPortal.RestEasy.Model.Offer;
import tn.JobPortal.RestEasy.Service.OfferService;
import tn.JobPortal.RestEasy.Service.OfferServiceImpl;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
@Data
public abstract class JobFinder {
    protected  WebSite webSite = null;
    protected List<Offer> Jobs = new ArrayList<Offer>();
    public List<Offer> getJobs()
    {
        return Jobs;
    }
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @ToString
    public class WebSite
    {
        private String name;
        private String url;

    }
    public abstract void collectData();



}

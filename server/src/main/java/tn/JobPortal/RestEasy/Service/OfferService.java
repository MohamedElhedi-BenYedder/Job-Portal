package tn.JobPortal.RestEasy.Service;

import tn.JobPortal.RestEasy.Model.Offer;


import java.util.List;

public interface OfferService {
    public Offer create (Offer offer);
    public Offer update (Offer offer);
    public String saveAll(List<Offer> all);
    public void delete (String url);
    public Offer getByUrl(String url) ;
    public List<Offer> getAll() ;
    List<Offer> collectData();
    public long count();
}

package tn.JobPortal.RestEasy.Controller;

import tn.JobPortal.RestEasy.Model.Offer;
import tn.JobPortal.RestEasy.Model.Profile;
import tn.JobPortal.RestEasy.Service.OfferServiceImpl;

import javax.inject.Inject;
import java.util.List;

public class OfferControllerImpl implements OfferController{
    @Inject
    private OfferServiceImpl offerService ;
    @Override
    public long hello() {
        return offerService.count();

    }
    @Override
    public List<Offer> getAll()  {
        return offerService.getAll();
    }
    @Override
    public Offer getByUrl(String url) {

        return offerService.getByUrl(url);
    }
    @Override
    public Offer create(Offer offer)
    {
        return offerService.create(offer);
    }
    @Override
    public void delete (String url)
    {
        offerService.delete(url);
    }

    @Override
    public List<Offer> collectData() {
        return offerService.collectData();
    }
}

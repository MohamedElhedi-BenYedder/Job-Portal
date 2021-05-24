package tn.JobPortal.RestEasy.Service;


import tn.JobPortal.RestEasy.JobFinder.JobFinder;
import tn.JobPortal.RestEasy.JobFinder.TanitJobFinder;
import tn.JobPortal.RestEasy.Model.Offer;
import tn.JobPortal.RestEasy.Repository.OfferRepository;

import javax.inject.Inject;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.function.Supplier;

public class OfferServiceImpl implements OfferService{
    private static final Supplier<WebApplicationException> NOT_FOUND =
            () -> new WebApplicationException(Response.Status.NOT_FOUND);
    @Inject
    OfferRepository offerRepository;
    @Override
    public Offer create(Offer offer) {
        return offerRepository.save(offer);
    }

    @Override
    public Offer update(Offer offer) {
        return null;
    }

    @Override
    public void delete(String url) {
        offerRepository.deleteById(url);
    }

    @Override
    public Offer getByUrl(String url) {
        return offerRepository.findById(url).orElseThrow(NOT_FOUND);
    }

    @Override
    public List<Offer> getAll() {
        return offerRepository.findAll();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public String saveAll(List<Offer> all) {
        offerRepository.save(all);
        return "Done";


    }

    @Override
    public List<Offer> collectData() {
        final int numberOfSources = 1;
        final JobFinder[] jobFinders = {new TanitJobFinder()};
        for (JobFinder jobFinder:jobFinders)
        {
            jobFinder.collectData();
            return (List<Offer>) offerRepository.save(jobFinder.getJobs());
        }
        return null;
    }
}

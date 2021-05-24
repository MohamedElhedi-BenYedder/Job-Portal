package tn.JobPortal.RestEasy.Repository;

import jakarta.nosql.mapping.Repository;
import tn.JobPortal.RestEasy.Model.Offer;

import java.util.List;

public interface OfferRepository extends Repository<Offer, String> {
    List<Offer> findAll();
}

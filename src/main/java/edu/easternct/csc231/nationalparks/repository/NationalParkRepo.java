package edu.easternct.csc231.nationalparks.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.easternct.csc231.nationalparks.models.NationalPark;

public interface NationalParkRepo extends MongoRepository<NationalPark, String> {

	public NationalPark findById(String id);
}

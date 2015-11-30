package edu.easternct.csc231.nationalparks.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.easternct.csc231.nationalparks.models.Registration;

/**
 * CRUD repo for all Registrations
 *
 * @author Anthony DeDominic
 */
public interface RegistrationRepo extends MongoRepository<Registration, String> {

	public List<Registration> findAllByParkId(String id);

	public List<Registration> findAllByVisitorId(String id);

	public Registration findById(String id);
}

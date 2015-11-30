package edu.easternct.csc231.nationalparks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.easternct.csc231.nationalparks.models.Registration;
import edu.easternct.csc231.nationalparks.repository.RegistrationRepo;

/**
 * Manages needed database 
 * transactions for all 
 * Registrations
 *
 * @author Anthony DeDominic
 */
@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepo registrationRepo;

	/**
	 * @param id a park id to find registration's for
	 * @return all registrations for given park
	 */
	public List<Registration> findAllByParkId(String id) {
		return registrationRepo.findAllByParkId(id);
	}

	/**
	 * @param id find all registraions by a given user
	 * @return all registrations by a given user
	 */
	public List<Registration> findAllByVisitorId(String id) {
		return registrationRepo.findAllByVisitorId(id);
	}

	/**
	 * @param id a registration object id
	 * @return the registrations for given id
	 */
	public Registration findById(String id) {
		return registrationRepo.findById(id);
	}

	/**
	 * @param registration a registration to save to db 
	 */
	public void saveRegistration(Registration registration){
		registrationRepo.save(registration);
	}
}

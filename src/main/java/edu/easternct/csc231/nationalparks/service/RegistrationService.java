package edu.easternct.csc231.nationalparks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.easternct.csc231.nationalparks.models.Registration;
import edu.easternct.csc231.nationalparks.repository.RegistrationRepo;

/**
 * Implementation of RegistrationService
 *
 * @see RegistrationService
 * @author Anthony DeDominic
 */
@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepo registrationRepo;

	public List<Registration> findAllByParkId(String id) {
		return registrationRepo.findAllByParkId(id);
	}

	public List<Registration> findAllByVisitorId(String id) {
		return registrationRepo.findAllByVisitorId(id);
	}

	public Registration findById(String id) {
		return registrationRepo.findById(id);
	}

	public void saveRegistration(Registration registration){
		registrationRepo.save(registration);
	}
}

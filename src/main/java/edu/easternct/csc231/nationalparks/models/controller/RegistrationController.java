package edu.easternct.csc231.nationalparks.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import edu.easternct.csc231.nationalparks.models.Registration;
import edu.easternct.csc231.nationalparks.service.RegistrationService;

/**
 * REST Controller for Registrations
 *
 * @author Anthony DeDominic
 */
@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;

	@RequestMapping(value="/api/v1/registration/new",method=RequestMethod.POST)
	public void insertRegistration(@RequestBody Registration registration){
		registrationService.saveRegistration(registration);
	}
	
	@RequestMapping(value="/api/v1/registration/get/{id}",method=RequestMethod.GET)
	public Registration getRegistration(@PathVariable String id) {
		return registrationService.findById(id);
	}

	@RequestMapping(value="/api/v1/registration/get/park/{parkId}",method=RequestMethod.GET)
	public List<Registration> getByParkId(@PathVariable String parkId) {
		return registrationService.findAllByParkId(parkId);
	}

	@RequestMapping(value="/api/v1/registration/get/visitor/{visitorId}",method=RequestMethod.GET)
	public List<Registration> getByVisitor(@PathVariable String visitorId) {
		return registrationService.findAllByVisitorId(visitorId);
	}
}

package edu.easternct.csc231.nationalparks.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	/**
	 * create new registration
	 *
	 * @param registration the registration
	 */
	@RequestMapping(value="/api/v1/registration/new",method=RequestMethod.POST)
	public void insertRegistration(@RequestBody Registration registration) {
		registrationService.saveRegistration(registration);
	}
	
	/**
	 * @param id a ragistration object id
	 * @return the requested registration object
	 */
	@RequestMapping(value="/api/v1/registration/get/{id}",method=RequestMethod.GET)
	public Registration getRegistration(@PathVariable String id) {
		return registrationService.findById(id);
	}

	/**
	 * @param parkId the park Id
	 * @return all registrations for given national park
	 */
	@RequestMapping(value="/api/v1/registration/get/park/{parkId}",method=RequestMethod.GET)
	public List<Registration> getByParkId(@PathVariable String parkId) {
		return registrationService.findAllByParkId(parkId);
	}

	/**
	 * @param visitorId the visitor id 
	 * @return all registrations for given visitor
	 */
	@RequestMapping(value="/api/v1/registration/get/visitor/{visitorId}",method=RequestMethod.GET)
	public List<Registration> getByVisitor(@PathVariable String visitorId) {
		return registrationService.findAllByVisitorId(visitorId);
	}
}

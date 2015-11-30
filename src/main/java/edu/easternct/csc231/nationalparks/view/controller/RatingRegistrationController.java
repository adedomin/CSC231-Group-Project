package edu.easternct.csc231.nationalparks.view.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import edu.easternct.csc231.nationalparks.models.Registration;
import edu.easternct.csc231.nationalparks.service.NationalParkService;
import edu.easternct.csc231.nationalparks.service.RegistrationService;

/**
 * Create new rating of a national parks
 *
 * @author Anthony DeDominic
 */
@Controller
public class RatingRegistrationController {
	
	public RegistrationService registrationService;
	public NationalParkService nationalParkService;

	/**
	 * @param registrationService
	 * @param nationalParkService
	 */
	@Autowired
	public RatingRegistrationController(RegistrationService registrationService,
			NationalParkService nationalParkService) {
		this.registrationService = registrationService;
		this.nationalParkService = nationalParkService;
	}


	/**
	 * return Registration form
	 *
	 * @param id the park id
	 * @param model template model
	 */
	@RequestMapping(value="/rate-park/{id}",method=RequestMethod.GET)
	public String rateGet(@PathVariable String id, 
			ModelMap model) {
		model.addAttribute("rating", new Registration());
		model.addAttribute("park", id);
		return "forms/rate-park";
	}

	/**
	 * Take registeration form
	 * and save the information provided
	 *
	 * @param registration the user submitted data
	 * @param id the park id
	 */
	@RequestMapping(value="/rate-park/{id}",method=RequestMethod.POST)
	public String ratePost(@PathVariable String id,
			Registration registration, HttpSession session) {
		registration.setVisitorId((String)session.getAttribute("visitorId"));
		registration.setParkId(id);
		registrationService.saveRegistration(registration);
		return "redirect:/";
	}
}

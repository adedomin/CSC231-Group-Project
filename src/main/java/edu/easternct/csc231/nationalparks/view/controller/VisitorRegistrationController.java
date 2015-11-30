package edu.easternct.csc231.nationalparks.view.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import edu.easternct.csc231.nationalparks.models.Visitor;
import edu.easternct.csc231.nationalparks.service.VisitorService;

/**
 * Handle new Visitor Registrations
 *
 * @author Anthony DeDominic
 */
@Controller
public class VisitorRegistrationController {
	
	@Autowired
	public VisitorService visitorService;

	/**
	 * Return a form for a user to complete
	 *
	 * @param model the visitor object
	 */
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String registerGet(Model model) {
		model.addAttribute("visitor", new Visitor());
		return "forms/register";
	}

	/**
	 * take form data deserialize to Visitor and save
	 *
	 * @param visitor the visitor from form data
	 */
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String registerPost(@ModelAttribute Visitor visitor, HttpSession session) {
		visitorService.saveVisitor(visitor);
		session.setAttribute("visitorId", visitor.getId());
		return "redirect:/";
	}
}

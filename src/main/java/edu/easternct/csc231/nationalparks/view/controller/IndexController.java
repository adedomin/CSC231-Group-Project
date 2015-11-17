package edu.easternct.csc231.nationalparks.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import edu.easternct.csc231.nationalparks.service.NationalParkService;

/**
 * Controller for front page of webapp
 *
 * @author Anthony DeDominic
 */
@Controller
public class IndexController {

	@Autowired
	private NationalParkService nationalParkService;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("parks", nationalParkService.findAll());
		return "index";
	}
}

package edu.easternct.csc231.nationalparks.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * controller for view of reports
 *
 * @author Anthony DeDominic
 */
@Controller
public class ReportController {

	/**
	 * return a rating report for given park id
	 *
	 * @param id the park id
	 */
	@RequestMapping(value="/report/rating/{id}",method=RequestMethod.GET)
	public String ratingReport(@PathVariable String id) {
		return "redirect:/";
	}

	/**
	 * return a visitor report for the given park
	 *
	 * @param id the park id
	 */
	@RequestMapping(value="/report/visitor/{id}",method=RequestMethod.GET)
	public String visitorReport(@PathVariable String id) {
		return "redirect:/";
	}
}

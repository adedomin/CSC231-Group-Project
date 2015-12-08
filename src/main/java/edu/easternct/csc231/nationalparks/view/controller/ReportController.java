package edu.easternct.csc231.nationalparks.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import edu.easternct.csc231.nationalparks.service.ReportGenerationService;
import edu.easternct.csc231.nationalparks.view.RatingReport;
import edu.easternct.csc231.nationalparks.view.VisitorReport;

/**
 * controller for view of reports
 *
 * @author Anthony DeDominic
 */
@Controller
public class ReportController {

	@Autowired
	private ReportGenerationService reportGenerationService;

	/**
	 * return a rating report for given park id
	 *
	 * @param id the park id
	 * @param model the model
	 */
	@RequestMapping(value="/report/rating/{id}",method=RequestMethod.GET)
	public String ratingReport(@PathVariable String id, Model model) {
		
		RatingReport report = reportGenerationService.makeRatingReport(id);
		if (report == null) { 
			return "redirect:/";
		}

		model.addAttribute("report", report);
		return "rating-report";
	}

	/**
	 * return a visitor report for the given park
	 *
	 * @param id the park id
	 * @param model the model
	 */
	@RequestMapping(value="/report/visitor/{id}",method=RequestMethod.GET)
	public String visitorReport(@PathVariable String id, Model model) {
		
		VisitorReport report = reportGenerationService.makeVisitorReport(id);
		if (report == null) {
			return "redirect:/";
		}

		model.addAttribute("report", report);
		return "visitor-report";
	}
}

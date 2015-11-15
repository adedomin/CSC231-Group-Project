package edu.easternct.csc231.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * controller for view of reports
 *
 * @author Anthony DeDominic
 */
@Controller
public class ReportResouceController {

	@RequestMapping("/report/{id}",method=RequestMethod.GET)
	public String report(@PathVariable String id) {
		return "report";
	}
}

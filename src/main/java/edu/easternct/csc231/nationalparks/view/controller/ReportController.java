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

	@RequestMapping(value="/report/{type}/{id}",method=RequestMethod.GET)
	public String report(@PathVariable String id,
						 @PathVariable String type) {
		return "index";
	}
}

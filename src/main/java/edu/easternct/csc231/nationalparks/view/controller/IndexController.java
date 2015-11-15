package edu.easternct.csc231.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for front page of webapp
 *
 * @author Anthony DeDominic
 */
@Controller
public class IndexController {

	@RequestMapping("/",method=RequestMethod.GET)
	public String index() {
		return "index";
	}
}

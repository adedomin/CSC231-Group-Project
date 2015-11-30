package edu.easternct.csc231.nationalparks.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import edu.easternct.csc231.nationalparks.models.Visitor;
import edu.easternct.csc231.nationalparks.service.VisitorService;

/**
 * REST controller for Visitor Objects
 */
@RestController
public class VisitorController {

	@Autowired
	private VisitorService visitorService;

	/**
	 * create a new visitor
	 *
	 * @param visitor a new visitor
	 */
	@RequestMapping(value="/api/v1/visitor/new",method=RequestMethod.POST)
	public void insertVisitor(@RequestBody Visitor visitor){
		visitorService.saveVisitor(visitor);
	}
	
	/**
	 * @param id the visitor id
	 * @return the visitor with given id
	 */
	@RequestMapping(value="/api/v1/visitor/get/{id}",method=RequestMethod.GET)
	public Visitor getVisitorById(@PathVariable String id) {
		return visitorService.findById(id);	
	}

	/**
	 */
	@RequestMapping(value="/api/v1/visitor/get/park/{parkId}",method=RequestMethod.GET)
	public List<Visitor> getAllVisitorsByParkId(@PathVariable String parkId) {
		return visitorService.findAllByParkId(parkId);
	}
}

package edu.easternct.csc231.nationalparks.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import edu.easternct.csc231.nationalparks.models.NationalPark;
import edu.easternct.csc231.nationalparks.service.NationalParkService;

/**
 * REST Controller for NationalPark objects
 *
 * @author Anthony DeDominic
 */
@RestController
public class NationalParkController {

	@Autowired
	private NationalParkService nationalParkService;

	@RequestMapping(value="/api/v1/national-park/new",method=RequestMethod.POST)
	public void insertPark(@RequestBody NationalPark park){
		nationalParkService.savePark(park);
	}
	
	@RequestMapping(value="/api/v1/national-park/get/{id}",method=RequestMethod.GET)
	public NationalPark getPark(@PathVariable String id) {
		return nationalParkService.findById(id);	
	}

	@RequestMapping(value="/api/v1/national-park/get/all",method=RequestMethod.GET)
	public List<NationalPark> getAllParks() {
		return nationalParkService.findAll();	
	}
}

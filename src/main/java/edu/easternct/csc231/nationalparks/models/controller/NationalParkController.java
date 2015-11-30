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

	/**
	 * Create new park
	 *
	 * @param park the deserialized park
	 */
	@RequestMapping(value="/api/v1/national-park/new",method=RequestMethod.POST)
	public void insertPark(@RequestBody NationalPark park){
		nationalParkService.savePark(park);
	}
	
	/**
	 * @param id the park id
	 * @return the national park requested
	 */
	@RequestMapping(value="/api/v1/national-park/get/{id}",method=RequestMethod.GET)
	public NationalPark getPark(@PathVariable String id) {
		return nationalParkService.findById(id);	
	}

	/**
	 * @return all national parks 
	 *         saved in the db
	 */
	@RequestMapping(value="/api/v1/national-park/get/all",method=RequestMethod.GET)
	public List<NationalPark> getAllParks() {
		return nationalParkService.findAll();	
	}
}

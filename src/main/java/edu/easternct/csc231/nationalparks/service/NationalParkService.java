package edu.easternct.csc231.nationalparks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.easternct.csc231.nationalparks.models.NationalPark;
import edu.easternct.csc231.nationalparks.repository.NationalParkRepo;

/**
 * Implementation of NationalParkService
 *
 * @author Anthony DeDominic
 */
@Service
public class NationalParkService {

	@Autowired
	private NationalParkRepo nationalParkRepo;

	/**
	 * @return all national parks
	 */
	public List<NationalPark> findAll(){
		return nationalParkRepo.findAll();
	}

	/**
	 * @param id of park to return
	 * @return the park found
	 */
	public NationalPark findById(String id) {
		return nationalParkRepo.findById(id);
	}
	
	/**
	 * @param park object to save
	 */
	public void savePark(NationalPark park) {
		nationalParkRepo.save(park);
	}
}

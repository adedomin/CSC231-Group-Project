package edu.easternct.csc231.nationalparks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.easternct.csc231.nationalparks.models.Visitor;
import edu.easternct.csc231.nationalparks.repository.VisitorRepo;

/**
 * db transtactions needed
 * for Visitor objects
 *
 * @author Anthony DeDominic
 */
@Service
public class VisitorService {

	@Autowired
	private VisitorRepo visitorRepo;

	/**
	 * @param id of a national park
	 * @return all visitors by park
	 */
	public List<Visitor> findAllByParkId(String id) {
		return visitorRepo.findAllByParkId(id);
	}

	/**
	 * @param id of the visitor
	 * @return the visitor
	 */
	public Visitor findById(String id) {
		return visitorRepo.findById(id);
	}

	/**
	 * @param visitor to save
	 */
	public void saveVisitor(Visitor visitor) {
		visitorRepo.save(visitor);
	}
}

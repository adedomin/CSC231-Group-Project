package edu.easternct.csc231.nationalparks.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.easternct.csc231.nationalparks.models.NationalPark;
import edu.easternct.csc231.nationalparks.models.Registration;
import edu.easternct.csc231.nationalparks.models.Visitor;
import edu.easternct.csc231.nationalparks.view.RatingReport;
import edu.easternct.csc231.nationalparks.view.VisitorReport;

/**
 * returns a new RatingReport or VisitorReport object
 */
@Service
public class ReportGenerationService {

	public NationalParkService nationalParkService;
	public RegistrationService registrationService;
	public VisitorService visitorService;

	/**
	 * @param nationalParkService
	 * @param registrationService
	 * @param visitorService
	 */
	@Autowired
	public ReportGenerationService(NationalParkService nationalParkService, RegistrationService registrationService,
			VisitorService visitorService) {
		this.nationalParkService = nationalParkService;
		this.registrationService = registrationService;
		this.visitorService = visitorService;
	}

	/**
	 * given a national park id, this function returns
	 * a new report which describes the overall park rating,
	 * the highest rated site in the park, the lowest rated
	 * site in the park and all the registraions and their
	 * comment bodies in the park
	 *
	 * @param parkid the national parks
	 * @return a new RatingReport to be rendered
	 */
	public RatingReport makeRatingReport(String parkid) {

		List<Registration> registrations = registrationService.findAllByParkId(parkid);
		NationalPark nationalPark = nationalParkService.findById(parkid);

		if (registrations == null || nationalPark == null) {
			return null;
		}

		return new RatingReport(registrations,nationalPark.getName());
	}

	/**
	 * @param registrations all registrations for park
	 * @return all visitors found in registrations
	 */
	public List<Visitor> findAllVisitors(List<Registration> registrations) {
		
		List<Visitor> visitors = new ArrayList<Visitor>();

		for (Registration registration : registrations) {
			if (registration.getVisitorId() != null) {
				Visitor visitor = visitorService.findById(registration.getVisitorId());
				if (visitor != null) {
					visitors.add(visitor);
				}
			}
		}

		return visitors;
	}

	/**
	 * @param parkid a National Park is
	 * @return a VisitorReport
	 */
	public VisitorReport makeVisitorReport(String parkid) {

		List<Registration> registrations = registrationService.findAllByParkId(parkid);
		NationalPark nationalPark = nationalParkService.findById(parkid);

		if (registrations == null || nationalPark == null) {
			return null;
		}

		List<Visitor> visitors = findAllVisitors(registrations);

		return new VisitorReport(visitors,nationalPark.getName());
	}
}

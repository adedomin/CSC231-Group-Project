package edu.easternct.csc231.nationalparks.view;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import edu.easternct.csc231.nationalparks.models.NationalPark;
import edu.easternct.csc231.nationalparks.models.Registration;

/**
 * A rating report that 
 * describes a park's overall rating
 * it's best rated site, worst rated site,
 * and all the registered comments about it
 *
 * @author Erin Strickland
 */
public class RatingReport {

	/**
	 * Inline class to determine
	 * site averages
	 *
	 * @author Anthony DeDominic
	 */
	private class AvgNode {
		
		private int sum;
		private int count;

		/**
		 * @param sum
		 * @param count
		 */
		public AvgNode(int sum, int count) {
			this.sum = sum;
			this.count = count;
		}

		/**
		 * Adds a sum to average object
		 * and increments count
		 *
		 * @param sum a sum to add
		 */
		public void addSum(int sum) {
			this.count++;
			this.sum = this.sum + sum;
		}
		/**
		 * @return the overall average
		 */
		public double getAvg() {
			return (double)sum / count;
		}
	}

	// name of report
	private String name;
	// best rated site in park
	private String bestSite;
	// worst rated
	private String worstSite;
	private double avgRating;
	private List<Registration> ratings;

	/**
	 * Return overall average rating for the national park
	 *
	 * @param registrations a list of registrations
	 */
	private double getOverallAvg(List<Registration> registrations) {

		AvgNode avg = new AvgNode(0,0);

		for (Registration registration : registrations) {
			avg.addSum(registration.getRating());
		}

		return avg.getAvg();
	}

	/**
	 * @param registrations
	 * @return a map of all the rated sites
	 *         and their average ratings
	 */
	private Map<String,AvgNode> getSiteAvg(List<Registration> registrations) {
		Map<String,AvgNode> map = new TreeMap<String,AvgNode>();
		for (Registration registration : registrations) {
			if (map.containsKey(registration.getName())) {
				map.get(registration.getName()).addSum(registration.getRating());
			}
			else {
				map.put(registration.getName(), new AvgNode(registration.getRating(),1));
			}
		}

		return map;
	}

	/**
	 * @param siteAverages all the site average ratings
	 * @return the site with the highest average rating
	 */
	private String findHighestAverage(Map<String,AvgNode> siteAverages) {

		String bestSite = "";
		double bestAvg = -1;

		for (Map.Entry<String,AvgNode> siteAverage : siteAverages.entrySet()) {
			if (siteAverage.getValue().getAvg() > bestAvg) {
				bestSite = siteAverage.getKey();
				bestAvg = siteAverage.getValue().getAvg();
			}
		}

		return bestSite;
	}

	/**
	 * @param siteAverages all the site averages
	 * @return the lowest average rated site
	 */
	private String findLowestAverage(Map<String,AvgNode> siteAverages) {

		String worstSite = "";
		double worstAvg = 999;

		for (Map.Entry<String,AvgNode> siteAverage : siteAverages.entrySet()) {
			if (siteAverage.getValue().getAvg() < worstAvg) {
				worstSite = siteAverage.getKey();
				worstAvg = siteAverage.getValue().getAvg();
			}
		}

		return worstSite;
	}

	/**
	 * Generates the nationalPark RatingReport
	 * most of the logic here is finding the averages
	 * of the given parks registrations
	 *
	 * @param registrations of the park in question
	 * @param name name of national park
	 */
	public RatingReport(List<Registration> registrations, String name) {

		this.ratings = Collections.sort(registrations);
		this.name = name;
		this.avgRating = getOverallAvg(this.ratings);
		Map<String,AvgNode> averages = getSiteAvg(this.ratings);
		this.bestSite = findHighestAverage(averages);
		this.worstSite = findLowestAverage(averages);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the bestSite
	 */
	public String getBestSite() {
		return bestSite;
	}

	/**
	 * @param bestSite the bestSite to set
	 */
	public void setBestSite(String bestSite) {
		this.bestSite = bestSite;
	}

	/**
	 * @return the worstSite
	 */
	public String getWorstSite() {
		return worstSite;
	}

	/**
	 * @param worstSite the worstSite to set
	 */
	public void setWorstSite(String worstSite) {
		this.worstSite = worstSite;
	}

	/**
	 * @return the avgRating
	 */
	public double getAvgRating() {
		return avgRating;
	}

	/**
	 * @param avgRating the avgRating to set
	 */
	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}

	/**
	 * @return the ratings
	 */
	public List<Registration> getRatings() {
		return ratings;
	}

	/**
	 * @param ratings the ratings to set
	 */
	public void setRatings(List<Registration> ratings) {
		this.ratings = ratings;
	}
}

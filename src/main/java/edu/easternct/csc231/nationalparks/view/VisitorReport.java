package edu.easternct.csc231.nationalparks.view;

import java.util.List;

import edu.easternct.csc231.nationalparks.models.Visitor;

/**
 *
 */
public class VisitorReport {

	private String name;
	private List<Visitor> visitors;
	private int visitorCount;
	private int yesterdayCount;

	/**
	 * @param name
	 * @param visitors
	 */
	public VisitorReport(List<Visitor> visitors,String name)  {

		this.name = name;
		this.visitors = visitors;
		this.yesterdayCount = visitors.size();
		this.visitorCount = yesterdayCount;
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
	 * @return the visitors
	 */
	public List<Visitor> getVisitors() {
		return visitors;
	}

	/**
	 * @param visitors the visitors to set
	 */
	public void setVisitors(List<Visitor> visitors) {
		this.visitors = visitors;
	}

	/**
	 * @return the visitorCount
	 */
	public int getVisitorCount() {
		return visitorCount;
	}

	/**
	 * @param visitorCount the visitorCount to set
	 */
	public void setVisitorCount(int visitorCount) {
		this.visitorCount = visitorCount;
	}

	/**
	 * @return the yesterdayCount
	 */
	public int getYesterdayCount() {
		return yesterdayCount;
	}

	/**
	 * @param yesterdayCount the yesterdayCount to set
	 */
	public void setYesterdayCount(int yesterdayCount) {
		this.yesterdayCount = yesterdayCount;
	}
}

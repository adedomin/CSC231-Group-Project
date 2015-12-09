package edu.easternct.csc231.nationalparks.view;

import java.util.Collections;
import java.util.List;

import edu.easternct.csc231.nationalparks.models.Visitor;

/**
 * A report that displays all
 * unique visitors yesterday
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
		Collections.sort(this.visitors);
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
	 * @return the visitors
	 */
	public List<Visitor> getVisitors() {
		return visitors;
	}

	/**
	 * @return the visitorCount
	 */
	public int getVisitorCount() {
		return visitorCount;
	}

	/**
	 * @return the yesterdayCount
	 */
	public int getYesterdayCount() {
		return yesterdayCount;
	}
}

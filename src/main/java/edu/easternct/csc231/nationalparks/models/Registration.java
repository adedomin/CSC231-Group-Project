package edu.easternct.csc231.nationalparks.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * A visitor fills this out
 * describes how the user felt
 * about a particular site in a park
 */
@Document
public class Registration {

	@Id
	private String id;

	private String name;
	private String parkId;
	private String visitorId;
	private Date date;
	private boolean onCloud;
	private String comment;
	private int rating;

	/**
	 * empty
	 */
	public Registration() {
	}

	/**
	 * @param name
	 * @param parkId
	 * @param visitorId
	 * @param date
	 * @param onCloud
	 * @param comment
	 * @param rating
	 */
	public Registration(String name, String parkId, String visitorId, Date date, boolean onCloud, String comment, int rating) {
		this.name = name;
		this.parkId = parkId;
		this.visitorId = visitorId;
		this.date = date;
		this.onCloud = onCloud;
		this.comment = comment;
		this.rating = rating;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the parkId
	 */
	public String getParkId() {
		return parkId;
	}

	/**
	 * @param parkId the parkId to set
	 */
	public void setParkId(String parkId) {
		this.parkId = parkId;
	}

	/**
	 * @return the visitorId
	 */
	public String getVisitorId() {
		return visitorId;
	}

	/**
	 * @param visitorId the visitorId to set
	 */
	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the onCloud
	 */
	public boolean isOnCloud() {
		return onCloud;
	}

	/**
	 * @param onCloud the onCloud to set
	 */
	public void setOnCloud(boolean onCloud) {
		this.onCloud = onCloud;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
}

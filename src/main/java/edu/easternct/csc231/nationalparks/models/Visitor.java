package edu.easternct.csc231.nationalparks.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Visitor extends Person {

	@Id
	private String id;
	private String parkId;

	/**
	 * empty
	 */
	public Visitor() {
	}

	/**
	 * @param parkId
	 * @param first
	 * @param last
	 * @param address
	 * @param contact
	 */
	public Visitor(String parkId, String first, String last, Address address, Contact contact) {
		super(first, last, address, contact);
		this.parkId = parkId;
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

}

package edu.easternct.csc231.nationalparks.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Describes a national park
 * which contains things like
 * name, location, etc
 */
@Document
public class NationalPark implements Comparable<NationalPark> {

	@Id
	private String id;

	private String name;
	private Address address;
	private Contact contact;
	private Person LeadRanger;
	private List<String> registrationSites;

	/**
	 * empty
	 */
	public NationalPark() {
	}

	/**
	 * @param name
	 * @param address
	 * @param contact
	 * @param leadRanger
	 * @param registrationSites
	 */
	public NationalPark(String name, Address address, Contact contact, Person leadRanger,
		List<String> registrationSites) {
		this.name = name;
		this.address = address;
		this.contact = contact;
		LeadRanger = leadRanger;
		this.registrationSites = registrationSites;
	}

	public boolean equals(NationalPark park) {
		if (this.id == null || park.getId() == null) {
			return this.name.equals(park.getName());
		}

		return this.id.equals(park.getId());
	}

	public int compareTo(NationalPark park) {
		return this.name.compareTo(park.getName());
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
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}

	/**
	 * @return the leadRanger
	 */
	public Person getLeadRanger() {
		return LeadRanger;
	}

	/**
	 * @param leadRanger the leadRanger to set
	 */
	public void setLeadRanger(Person leadRanger) {
		LeadRanger = leadRanger;
	}

	/**
	 * @return the registrationSites
	 */
	public List<String> getRegistrationSites() {
		return registrationSites;
	}

	/**
	 * @param registrationSites the registrationSites to set
	 */
	public void setRegistrationSites(List<String> registrationSites) {
		this.registrationSites = registrationSites;
	}
}

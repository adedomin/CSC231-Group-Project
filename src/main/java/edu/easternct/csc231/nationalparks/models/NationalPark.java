package edu.easternct.csc231.nationalparks.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class NationalPark {

	@Id
	private String id;

	private String name;
	private Address address;
	private Contact contact;
	private Person LeadRanger;

	/**
	 * empty
	 */
	public NationalPark() {
	}

	/**
	 * @param name
	 * @param address
	 * @param phone
	 * @param email
	 * @param leadRanger
	 */
	public NationalPark(String name, Address address, Contact contact, Person leadRanger) {
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.LeadRanger = leadRanger;
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

}

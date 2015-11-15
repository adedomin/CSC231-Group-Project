package edu.easternct.csc231.nationalparks.models;

public class Person {

	protected String first;
	protected String last;
	protected Address address;
	protected Contact contact;

	/**
	 * empty
	 */
	public Person() {
	}

	/**
	 * @param first
	 * @param last
	 * @param address
	 * @param contact
	 */
	public Person(String first, String last, Address address, Contact contact) {
		this.first = first;
		this.last = last;
		this.address = address;
		this.contact = contact;
	}

	/**
	 * @return the first
	 */
	public String getFirst() {
		return first;
	}

	/**
	 * @param first the first to set
	 */
	public void setFirst(String first) {
		this.first = first;
	}

	/**
	 * @return the last
	 */
	public String getLast() {
		return last;
	}

	/**
	 * @param last the last to set
	 */
	public void setLast(String last) {
		this.last = last;
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
}

package edu.easternct.csc231.nationalparks.models;

public class Contact {

	private String phone;
	private String email;

	/**
	 *
	 */
	public Contact() {
	}

	/**
	 * @param phone
	 * @param email
	 */
	public Contact(String phone, String email) {
		this.phone = phone;
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}

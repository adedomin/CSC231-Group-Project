package edu.easternct.csc231.nationalparks.models;

public class RegistrationSite {

	private String name;
	private String location;

	/**
	 * empty
	 */
	public RegistrationSite() {
	}

	/**
	 * @param name
	 * @param location
	 */
	public RegistrationSite(String name, String location) {
		this.name = name;
		this.location = location;
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
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
}

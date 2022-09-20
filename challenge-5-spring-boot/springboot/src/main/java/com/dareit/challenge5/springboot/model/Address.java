package com.dareit.challenge5.springboot.model;

public class Address {

	//PK
	private Long id;

	private int userId; // TODO primitive type
	private String streetName;
	private int streetNumber;
	private int areaCode;
	private String city;
	private String country;

	public Address(int userId, String streetName, int streetNumber, int areaCode, String city, String country) {
		this.userId = userId;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.areaCode = areaCode;
		this.city = city;
		this.country = country;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public int getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [userId=" + userId + ", streetName=" + streetName + ", streetNumber=" + streetNumber
				+ ", areaCode=" + areaCode + ", city=" + city + ", country=" + country + "]";
	}

}

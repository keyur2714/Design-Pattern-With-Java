package com.webstack.dto;

public class PersonDTO {
	private String firstName;
	private String lastName;
	private String panNo;
	private String passportNo;
	private String adharNo;
	private String mobileNo;
	private String email;
	public PersonDTO(String firstName, String lastName, String panNo, String passportNo, String adharNo,
			String mobileNo, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.panNo = panNo;
		this.passportNo = passportNo;
		this.adharNo = adharNo;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	@Override
	public String toString() {
		return "PersonDTO [firstName=" + firstName + ", lastName=" + lastName + ", panNo=" + panNo + ", passportNo="
				+ passportNo + ", adharNo=" + adharNo + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}
	
	
}

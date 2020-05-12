package com.webstack.builder;

import com.webstack.dto.PersonDTO;

public class PersonBuilder {
	
	private String firstName;
	private String lastName;
	private String panNo;
	private String passportNo;
	private String adharNo;
	private String mobileNo;
	private String email;
	
	public PersonBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public PersonBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public PersonBuilder setPanNo(String panNo) {
		this.panNo = panNo;
		return this;
	}
	public PersonBuilder setPassportNo(String passportNo) {
		this.passportNo = passportNo;
		return this;
	}
	public PersonBuilder setAdharNo(String adharNo) {
		this.adharNo = adharNo;
		return this;
	}
	public PersonBuilder setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
		return this;
	}
	public PersonBuilder setEmail(String email) {
		this.email = email;
		return this;
	}
	
	public PersonDTO getPerson() {
		return new PersonDTO(this.firstName,this.lastName,this.panNo,this.passportNo,this.adharNo,this.mobileNo,this.email);
	}

}

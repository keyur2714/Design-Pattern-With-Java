package com.webstack.dp.dto;

public class Person {

	private static Person person = new Person();
	private String firstName;
	private String lastName;
	//private Contact contact = new Contact("7387029671", "keyurjava27@gmail.com");
	private Contact contact = new Contact();

	private Person() {

	}

	public static Person getPersonInstance() {
		return person;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Contact getContact() {
		return contact;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

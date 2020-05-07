package com.webstack.dp.driver;

import com.webstack.dp.dto.Person;

public class TestDriver {
	public static void main(String str[]) {
		System.out.println("Hello Radhe Krishna...!");
		
		Person p1 = Person.getPersonInstance();
		p1.setFirstName("keyur");
		p1.setLastName("thakor");
		
				
		p1.getContact().setEmail("denishjava@gmail.com");
		System.out.println("Person 1 "+p1 + " Contact1 " + p1.getContact());
		
		Person p2 = Person.getPersonInstance();
		
		p2.setFirstName("denish");
		p2.getContact().setEmail("sachin@gmail.com");
		System.out.println("Person 2 "+p2 +" Contact1 " + p2.getContact());
		
		System.out.println("Person 1 "+p1 +" Contact1 " + p1.getContact());
		
		
	}
}

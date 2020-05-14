package com.webstack.dp.driver;

import com.webstack.builder.PersonBuilder;
import com.webstack.dto.PersonDTO;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		//Old way has problem when multiple properties.  
		/*PersonDTO person = new PersonDTO("keyur","thakor", "abcda1212a",null,"a99811w","7387029671", "keyurjava27@gmail.com");
		System.out.println(person);*/
		//New Way with Builder Pattern
		
		PersonDTO personDTO = new PersonBuilder().setFirstName("Keyur").setLastName("Thakor").setEmail("keyurjava27@gmail.com").setMobileNo("8600712124").getPerson();
		StringBuilder s = new StringBuilder();
		s.append("keyur").append(1).append(true);
		String s1 = s.toString(); 
		System.out.println(personDTO);
	}

}

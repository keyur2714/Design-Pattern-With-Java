package com.webstack.driver;

import com.webstack.dp.ChatMediator;
import com.webstack.dp.ChatMediatorImpl;
import com.webstack.dto.UserDTO;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		ChatMediator chatMediator = new ChatMediatorImpl();
		
		UserDTO user1 = new UserDTO(chatMediator, "keyur");
		UserDTO user2 = new UserDTO(chatMediator, "denish");
		UserDTO user3 = new UserDTO(chatMediator, "vinit");
		UserDTO user4 = new UserDTO(chatMediator, "ravi");
		UserDTO user5 = new UserDTO(chatMediator, "hiren");
		
		chatMediator.registerUser(user1);
		chatMediator.registerUser(user2);
		chatMediator.registerUser(user3);
		chatMediator.registerUser(user4);
		chatMediator.registerUser(user5);
		
		user1.send("Hello All Radhe Krishna...!");
		
		user3.send("Helllo Everyone...");
		
		
	}

}

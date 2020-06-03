package com.webstack.dto;

import com.webstack.dp.ChatMediator;
import com.webstack.dp.User;

public class UserDTO extends User{

	public UserDTO(ChatMediator chatMediator, String name) {
		super(chatMediator, name);		
	}

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.name+" Sending Message to All: "+msg);
		chatMediator.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.name+" Received Messgae: "+msg);
	}

}

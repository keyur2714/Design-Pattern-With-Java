package com.webstack.dp;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{

	List<User> users = new ArrayList<>();
	
	@Override
	public void sendMessage(String msg, User user) {
		// TODO Auto-generated method stub
		for(User usr : users) {
			if(usr != user) {
				usr.receive(msg);
			}
		}
	}

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		this.users.add(user);
	}

}

package com.webstack.dp;

import com.webstack.dto.UserDTO;

public interface ChatMediator {

	void sendMessage(String msg,User user);
	void registerUser(User user);
	
}

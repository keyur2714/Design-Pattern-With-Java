package com.webstack.driver;

import com.webstack.dto.Channel;
import com.webstack.dto.Subsriber;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		Channel channel = new Channel("WebStack");
		
		
		Subsriber subsriber1 = new Subsriber("keyur");
		Subsriber subsriber2 = new Subsriber("denish");
		Subsriber subsriber3 = new Subsriber("vinit");		
		Subsriber subsriber4 = new Subsriber("hiren");
		Subsriber subsriber5 = new Subsriber("ravi");
		
		subsriber1.subsribeChannel(channel);
		subsriber2.subsribeChannel(channel);
		subsriber3.subsribeChannel(channel);
		subsriber4.subsribeChannel(channel);
		subsriber5.subsribeChannel(channel);
		
		channel.uploadVideo("Java Design Pattern");
		
		subsriber4.unSubscribeChannel(channel);
			
		channel.uploadVideo("Spring Boot");
	}

}

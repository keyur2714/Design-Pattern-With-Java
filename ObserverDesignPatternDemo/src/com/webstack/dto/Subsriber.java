package com.webstack.dto;

import com.webstack.dp.Observer;

public class Subsriber implements Observer{

	private String name;
	
	private Channel channel;
	
	public Subsriber(String name) {
		this.name = name;
	}
	
	public void subsribeChannel(Channel channel) {
		this.channel = channel;
		channel.subsribe(this);
	}
	
	public void unSubscribeChannel(Channel channel) {
		channel.unSubsribe(this);
	}
	
	
	@Override
	public void updateObserver() {
		// TODO Auto-generated method stub
		System.out.println("Hey Video Uploaded for "+this.channel.getTitle()+" From "+this.channel.getName());
	}
	
}

package com.webstack.dto;

public class AdminBrowser implements Browser{

	@Override
	public void surfing(String url) {
		System.out.println(url+ " Open Successfully.");
	}

	
}

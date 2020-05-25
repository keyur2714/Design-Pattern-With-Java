package com.webstack.dto;

public class Browserproxy implements Browser{

	@Override
	public void surfing(String url) {
		if(url.contains("youtube") || url.contains("gmail") || url.contains("facebook")) {
			System.out.println("Sorry "+url+" is Blocked for you.");
		}else {
			System.out.println(url+" open Successfullly.");
		}
	}
	
}

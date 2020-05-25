package com.webstack.driver;

import com.webstack.dto.AdminBrowser;
import com.webstack.dto.Browser;
import com.webstack.dto.Browserproxy;

public class TestDriver {

	public static void main(String[] args) {

		System.out.println("Hello Radhe Krishna...!");
		
		Browser browser = new Browserproxy();
		
		browser.surfing("www.youtube.com");
		
		browser.surfing("www.google.com");
		
		browser.surfing("www.facebook.com");
		
		
		Browser adminBrowserUser = new AdminBrowser();
		adminBrowserUser.surfing("www.youtube.com");
		
		adminBrowserUser.surfing("www.facebook.com");
		
		adminBrowserUser.surfing("www.gmail.com");
		
		adminBrowserUser.surfing("www.google.com");
	}

}

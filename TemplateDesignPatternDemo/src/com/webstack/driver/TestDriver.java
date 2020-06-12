package com.webstack.driver;

import com.webstack.dp.HomePageTemplate;
import com.webstack.dto.InstituteMgtHomePage;
import com.webstack.dto.InventoryMgtHomePage;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");	
		
		HomePageTemplate instituteMgtHomePage = new InstituteMgtHomePage();
		instituteMgtHomePage.buildHomePage();
		
		System.out.println("===========================");
		
		HomePageTemplate inventoryMgtHomePage = new InventoryMgtHomePage();
		inventoryMgtHomePage.buildHomePage();
	}

}

package com.webstack.dto;

public class TataCar implements Car{

	@Override
	public void carName() {
		System.out.println("Nexon.");
	}

	@Override
	public void carPrice() {
		System.out.println("Price: "+900000);
	}

}

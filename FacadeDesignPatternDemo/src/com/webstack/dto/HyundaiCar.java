package com.webstack.dto;

public class HyundaiCar implements Car{

	@Override
	public void carName() {
		System.out.println("Creta.");
	}

	@Override
	public void carPrice() {
		System.out.println("Price: "+1400000);
	}

}

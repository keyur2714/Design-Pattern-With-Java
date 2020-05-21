package com.webstack.dto;

public class HondaCar implements Car{

	@Override
	public void carName() {
		System.out.println("Honda City.");
	}

	@Override
	public void carPrice() {
		System.out.println("Price : "+1000000);
	}

}

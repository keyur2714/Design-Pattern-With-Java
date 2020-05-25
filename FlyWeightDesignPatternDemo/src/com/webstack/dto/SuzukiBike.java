package com.webstack.dto;

public class SuzukiBike implements Vehicle {

	

	public SuzukiBike(String color) {
		System.out.println("SuzukiBike Object Created with color "+color);
	}

	@Override
	public void price() {
		System.out.println("Price: " + 100000);
	}

	@Override
	public void modelName() {
		System.out.println("Suzuki Sprorts Bike.");
	}

		

}

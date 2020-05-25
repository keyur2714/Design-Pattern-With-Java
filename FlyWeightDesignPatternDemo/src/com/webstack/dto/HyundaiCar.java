package com.webstack.dto;

public class HyundaiCar implements Vehicle{

	
	public HyundaiCar(String color) {		
		System.out.println("Hyundai Car Object Created with color "+color);
	}
	
	@Override
	public void price() {
		System.out.println("Price : "+1000000);
	}

	@Override
	public void modelName() {
		System.out.println("I20 Hyundai Car.");
	}

}

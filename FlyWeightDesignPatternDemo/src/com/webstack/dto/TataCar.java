package com.webstack.dto;

public class TataCar implements Vehicle {

	public TataCar(String color) {
		System.out.println("Tata Car Object Created with color "+color);
	}

	
	@Override
	public void price() {
		System.out.println("Price : "+800000);
	}

	@Override
	public void modelName() {
		System.out.println("TATA Nexon Car.");
	}

}

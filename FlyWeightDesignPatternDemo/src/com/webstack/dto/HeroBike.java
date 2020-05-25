package com.webstack.dto;

public class HeroBike implements Vehicle {

	public HeroBike(String color){
		System.out.println("Hero Bike Object Created with color "+color);
	}
	
	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("Price : "+60000);
	}

	@Override
	public void modelName() {
		// TODO Auto-generated method stub
		System.out.println("Hero Splendor Bike.");
	}

}

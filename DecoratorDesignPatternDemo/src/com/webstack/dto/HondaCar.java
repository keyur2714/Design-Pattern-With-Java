package com.webstack.dto;

public class HondaCar implements Car {

	@Override
	public void price() {
		System.out.println("Honda Car Average Price is : "+1000000);
	}

}

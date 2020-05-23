package com.webstack.dp;

import com.webstack.dto.Car;

public class HondaCarDecorator extends CarDecorator {

	public HondaCarDecorator(Car car) {
		super(car);		
	}

	@Override
	public void price() {
		car.price();
		this.features();
	}

	private void features() {
		System.out.println("1. 4 Air Bag.");
		System.out.println("2. Nice Dashboard.");
	}
	
}

package com.webstack.dp;

import com.webstack.dto.Car;

public abstract class CarDecorator implements Car {

	protected Car car;
	
	public CarDecorator(Car car) {
		this.car=car;
	}
	
	@Override
	public void price() {
		// TODO Auto-generated method stub
		car.price();
	}

}

package com.webstack.dp;

import com.webstack.dto.Car;

public class TataCarDecorator extends CarDecorator {

	public TataCarDecorator(Car car) {
		super(car);		
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		super.price();
		this.availabeColor();
	}
	
	private void availabeColor() {
		System.out.println("Below Colors are availbe...!");
		System.out.println("Red Car");
		System.out.println("Black Car");
		System.out.println("Orange Car");
	}

}

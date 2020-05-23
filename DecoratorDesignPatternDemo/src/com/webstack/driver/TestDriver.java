package com.webstack.driver;

import com.webstack.dp.HondaCarDecorator;
import com.webstack.dp.TataCarDecorator;
import com.webstack.dto.Car;
import com.webstack.dto.HondaCar;
import com.webstack.dto.HyundaiCar;
import com.webstack.dto.TATACar;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		System.out.println("Without Dacorator...!");
		Car hyundaiCar = new HyundaiCar();		
		hyundaiCar.price();
		
		System.out.println("With Dacorator....");
		Car hondaCar = new HondaCarDecorator(new HondaCar());
		
		hondaCar.price();
		
		Car tataCar = new TataCarDecorator(new TATACar());
		
		tataCar.price();
		
		
		
	}

}

package com.webstack.driver;

import com.webstack.dp.CarFacade;
import com.webstack.dto.Car;
import com.webstack.dto.HondaCar;
import com.webstack.dto.HyundaiCar;
import com.webstack.dto.TataCar;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");

		System.out.println("Without Facade Pattern.");
		
		Car hyundaiCar = new HyundaiCar();
		hyundaiCar.carName();
		hyundaiCar.carPrice();
		
		Car hondaCar = new HondaCar();
		hondaCar.carName();
		hondaCar.carPrice();
		
		Car tataCar = new TataCar();
		tataCar.carName();
		tataCar.carPrice();
		
		System.out.println("==============================");
		//this is difficult when multiple Interface.
		
		System.out.println("With Facade Pattern.");
		
		CarFacade carShop = new CarFacade();
		carShop.hondaCarDetail();
		carShop.hyundaiCarDetail();
		carShop.tataCarDetail();
		
		//thi is good because single point of contact and we don't care about create diff objects
	}

}

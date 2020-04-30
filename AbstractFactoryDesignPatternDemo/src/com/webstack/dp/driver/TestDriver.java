package com.webstack.dp.driver;

import com.webstack.dp.abstractfactory.FactoryProvider;
import com.webstack.dp.factory.CarFactory;
import com.webstack.dp.factory.TwoWheelerFactory;
import com.webstack.dp.service.Car;
import com.webstack.dp.service.TwoWheeler;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		System.out.println("Abstract Factory Demo...");
		
		CarFactory carFactory = (CarFactory) FactoryProvider.getFactory("car");
		Car hondaCar = carFactory.getCar("honda");
		System.out.println("Price of Honda Car is "+hondaCar.getPrice());
		
		Car tataCar = carFactory.getCar("tata");
		System.out.println("Price of Tata Car is "+tataCar.getPrice());
		
		Car marutiCar = carFactory.getCar("maruti");
		System.out.println("Price of Maruti Car is "+marutiCar.getPrice());
		
		TwoWheelerFactory twoWheelerFactory = (TwoWheelerFactory) FactoryProvider.getFactory("twowheeler");
		TwoWheeler hero = twoWheelerFactory.getTwoWheeler("hero");
		System.out.println("Price of Hero Bike is "+hero.getPrice());
		
		TwoWheeler suzuki = twoWheelerFactory.getTwoWheeler("suzuki");
		System.out.println("Price of Suzuki Bike is "+suzuki.getPrice());
		
		TwoWheeler bajaj = twoWheelerFactory.getTwoWheeler("bajaj");
		System.out.println("Price of Bajaj Bike is "+bajaj.getPrice());
		
		System.out.println("Done...");
	}

}

package com.webstack.dp.abstractfactory;


import com.webstack.dp.service.Car;
import com.webstack.dp.service.TwoWheeler;

public abstract class VehicleAbstractFactory {
	public abstract Car getCar(String company);
	
	public abstract TwoWheeler getTwoWheeler(String company);
}

package com.webstack.dp.factory;

import com.webstack.dp.abstractfactory.VehicleAbstractFactory;
import com.webstack.dp.service.Car;
import com.webstack.dp.service.TwoWheeler;
import com.webstack.dp.service.impl.Honda;
import com.webstack.dp.service.impl.Maruti;
import com.webstack.dp.service.impl.Tata;

public class CarFactory extends VehicleAbstractFactory{

	public Car getCar(String companyName) {
		if("HONDA".equalsIgnoreCase(companyName)) {
			return new Honda();
		}else if("MARUTI".equalsIgnoreCase(companyName)) {
			return new Maruti();
		}else if("TATA".equalsIgnoreCase(companyName)) {
			return new Tata();
		}
		return null;
	}
	public TwoWheeler getTwoWheeler(String companyName) {
		return null;
	}
}

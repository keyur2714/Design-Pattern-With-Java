package com.webstack.dp.factory;

import com.webstack.dp.abstractfactory.VehicleAbstractFactory;
import com.webstack.dp.service.Car;
import com.webstack.dp.service.TwoWheeler;
import com.webstack.dp.service.impl.Bajaj;
import com.webstack.dp.service.impl.Hero;
import com.webstack.dp.service.impl.Suzuki;

public class TwoWheelerFactory extends VehicleAbstractFactory{
	
	public Car getCar(String companyName) {		
		return null;
	}
	public TwoWheeler getTwoWheeler(String companyName) {
		if("BAJAJ".equalsIgnoreCase(companyName)) {
			return new Bajaj();
		}else if("SUZUKI".equalsIgnoreCase(companyName)) {
			return new Suzuki();
		}else if("HERO".equalsIgnoreCase(companyName)) {
			return new Hero();
		}
		return null;
	}

}

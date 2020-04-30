package com.webstack.dp.abstractfactory;

import com.webstack.dp.factory.CarFactory;
import com.webstack.dp.factory.TwoWheelerFactory;

public class FactoryProvider{

	public static VehicleAbstractFactory getFactory(String factoryType) {
		if("car".equalsIgnoreCase(factoryType)){
			return new CarFactory();
		}else if("twowheeler".equalsIgnoreCase(factoryType)) {
			return new TwoWheelerFactory();
		}
		return null;
	}
	
}

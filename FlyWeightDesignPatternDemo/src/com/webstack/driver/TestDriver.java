package com.webstack.driver;

import com.webstack.dp.VehicleFactory;
import com.webstack.dto.Vehicle;

public class TestDriver {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Hello Radhe Krishna...!");
		
		Vehicle suzukiBike1 = VehicleFactory.getVehicle("SuzukiBike","Red");
		suzukiBike1.price();		

		Vehicle suzukiBike2 = VehicleFactory.getVehicle("SuzukiBike","Red");
		suzukiBike2.price();
		
		Vehicle suzukiBike3 = VehicleFactory.getVehicle("SuzukiBike","Green");
		suzukiBike3.price();
		
		Vehicle hyundaiCar = VehicleFactory.getVehicle("HyundaiCar","Red");
		hyundaiCar.price();
		hyundaiCar.modelName();
		
		Vehicle hyundaiCar1 = VehicleFactory.getVehicle("HyundaiCar","Grey");
		hyundaiCar1.price();
		hyundaiCar1.modelName();
		
		Vehicle hyundaiCar2 = VehicleFactory.getVehicle("HyundaiCar","Red");
		hyundaiCar2.price();
		hyundaiCar2.modelName();
	}

}

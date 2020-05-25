package com.webstack.dp;

import java.util.HashMap;
import java.util.Map;

import com.webstack.dto.HeroBike;
import com.webstack.dto.HyundaiCar;
import com.webstack.dto.SuzukiBike;
import com.webstack.dto.TataCar;
import com.webstack.dto.Vehicle;

public class VehicleFactory {
	
	static Map<String,Vehicle> vehicleMaps = new HashMap<>();

	public static Vehicle getVehicle(String type,String color) throws Exception{
		Vehicle vehicle = null;
		if(vehicleMaps.containsKey(type+"_"+color)) {
			vehicle = vehicleMaps.get(type+"_"+color);
		}else {
			switch (type) {
			case "HyundaiCar":
				vehicle = new HyundaiCar(color);								
				break;
			case "TataCar":
				vehicle = new TataCar(color);
				break;
			case "SuzukiBike":
				vehicle = new SuzukiBike(color);
				break;
			case "HeroBike":
				vehicle = new HeroBike(color);
				break;
			default:
				throw new Exception("Object type Not Found...!");			
			}
			vehicleMaps.put(type+"_"+color,vehicle);
		}
		return vehicle;
	}
	
}

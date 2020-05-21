package com.webstack.dp;

import com.webstack.dto.Car;
import com.webstack.dto.HondaCar;
import com.webstack.dto.HyundaiCar;
import com.webstack.dto.TataCar;

public class CarFacade {

	private Car hyundaiCar; 
	private Car hondaCar;
	private Car tataCar;
	
	public CarFacade() {
		this.hondaCar = new HondaCar();
		this.hyundaiCar = new HyundaiCar();
		this.tataCar = new TataCar();
	}
	
	public void hyundaiCarDetail() {
		this.hyundaiCar.carName();
		this.hyundaiCar.carPrice();
	}
	
	public void hondaCarDetail() {
		this.hondaCar.carName();
		this.hondaCar.carPrice();
	}
	
	public void tataCarDetail() {
		this.tataCar.carName();
		this.tataCar.carPrice();
	}
}

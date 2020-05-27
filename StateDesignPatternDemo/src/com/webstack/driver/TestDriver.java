package com.webstack.driver;

import com.webstack.dp.FanContext;
import com.webstack.dto.FanOFFState;
import com.webstack.dto.FanOnState;
import com.webstack.dto.FanSpeed1State;
import com.webstack.dto.FanSpeed2State;
import com.webstack.dto.FanSpeed3State;
import com.webstack.dto.State;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		State fanOnState = new FanOnState();
		State fanOffState = new FanOFFState();
		State fanSpeed1State = new FanSpeed1State();
		State fanSpeed2State = new FanSpeed2State();
		State fanSpeed3State = new FanSpeed3State();
		
		FanContext fan = new FanContext(fanOffState);
		fan.performTask();
		
		fan.setCurrentState(fanOnState);
		fan.performTask();
		
		fan.setCurrentState(fanSpeed2State);
		fan.performTask();
		
		fan.setCurrentState(fanSpeed1State);
		fan.performTask();
		
		fan.setCurrentState(fanSpeed3State);
		fan.performTask();
		
		fan.setCurrentState(fanOffState);
		fan.performTask();
				
	}

}

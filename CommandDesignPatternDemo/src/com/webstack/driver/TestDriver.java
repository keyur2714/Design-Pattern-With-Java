package com.webstack.driver;

import com.webstack.dp.AvailableCommands;
import com.webstack.dp.Command;
import com.webstack.dp.HomeRemote;
import com.webstack.dto.FanCommandImpl;
import com.webstack.dto.TVCommandImpl;
import com.webstack.dto.WashingMatchineCommandImpl;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		AvailableCommands availableCommands = new AvailableCommands();
		
		Command startFan = new FanCommandImpl(new AvailableCommands());
		startFan.onExecute();
		
		
		Command startTV = new TVCommandImpl(availableCommands);
		startTV.onExecute();
		
		Command startWashingMatchine = new WashingMatchineCommandImpl(availableCommands);
		startWashingMatchine.onExecute();
				
		
		Command stopFan = new FanCommandImpl(new AvailableCommands());
		startFan.offExecute();
		
		Command stopTV = new TVCommandImpl(availableCommands);
		stopTV.offExecute();
		
		Command stopWashingMatchine = new WashingMatchineCommandImpl(availableCommands);
		stopWashingMatchine.offExecute();
		
		System.out.println("=====================");
		
		HomeRemote homeRemote = new HomeRemote();
		homeRemote.performAction(startWashingMatchine);		
		homeRemote.performAction(startFan);
		
		homeRemote.applyCommands();
		
	}

}

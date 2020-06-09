package com.webstack.dto;

import com.webstack.dp.AvailableCommands;
import com.webstack.dp.Command;

public class FanCommandImpl implements Command{

	private AvailableCommands commands;
	
	public FanCommandImpl(AvailableCommands commands) {
		// TODO Auto-generated constructor stub
		this.commands = commands;
	}
	
	@Override
	public void onExecute() {
		// TODO Auto-generated method stub
		this.commands.startDrawingRoomFan();
	}

	@Override
	public void offExecute() {
		// TODO Auto-generated method stub
		this.commands.stopDrawingRoomFan();		
	}

}

package com.webstack.dto;

import com.webstack.dp.AvailableCommands;
import com.webstack.dp.Command;

public class WashingMatchineCommandImpl implements Command {

	private AvailableCommands commands;
	
	public WashingMatchineCommandImpl(AvailableCommands command) {
		this.commands = command;
	}
	
	@Override
	public void onExecute() {
		// TODO Auto-generated method stub
		commands.startWashingMatchine();
	}

	@Override
	public void offExecute() {
		// TODO Auto-generated method stub
		commands.stopWashingMatchine();
	}

}

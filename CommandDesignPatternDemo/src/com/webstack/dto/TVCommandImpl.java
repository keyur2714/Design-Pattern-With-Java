package com.webstack.dto;

import com.webstack.dp.AvailableCommands;
import com.webstack.dp.Command;

public class TVCommandImpl implements Command {

	private AvailableCommands tvCommands;
	
	public TVCommandImpl(AvailableCommands tvCommand) {
		this.tvCommands = tvCommand;
	}
	
	@Override
	public void onExecute() {
		// TODO Auto-generated method stub
		tvCommands.startTV();
	}

	@Override
	public void offExecute() {
		tvCommands.stopTV();
	}

}

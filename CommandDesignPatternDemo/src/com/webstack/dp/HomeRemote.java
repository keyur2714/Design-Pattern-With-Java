package com.webstack.dp;

import java.util.ArrayList;
import java.util.List;

public class HomeRemote {

		List<Command> commands = new ArrayList<>();
		
		public void performAction(Command command) {
			commands.add(command);	
		}
		
		public void applyCommands() {
			for(Command command : commands) {
				command.onExecute();
				command.offExecute();
			}
		}
		
}

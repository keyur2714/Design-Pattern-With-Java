package com.webstack.dp;

import com.webstack.dto.State;

public class FanContext implements State {

	private State currentState;

	public FanContext(State currentState) {
		this.currentState = currentState;
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	@Override
	public void performTask() {
		// TODO Auto-generated method stub
		this.currentState.performTask();
	}

}

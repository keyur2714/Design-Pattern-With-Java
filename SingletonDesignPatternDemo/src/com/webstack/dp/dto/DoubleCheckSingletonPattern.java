package com.webstack.dp.dto;

public class DoubleCheckSingletonPattern {
	public static DoubleCheckSingletonPattern instance;
	
	private  DoubleCheckSingletonPattern() {}
	
	public static DoubleCheckSingletonPattern getInstance() {
		if(instance == null) {
			synchronized (DoubleCheckSingletonPattern.class) {
				if(instance == null) {
					instance = new DoubleCheckSingletonPattern();
				}
			}
		}
		return instance;
	}
}

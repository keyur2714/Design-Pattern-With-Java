package com.webstack.dp.dto;

public class LazySingletonPattern {
	
	private static LazySingletonPattern lazySingletonPattern;
	
	private LazySingletonPattern() {
		
	}
	
	public static LazySingletonPattern getInstance() {
		if(lazySingletonPattern == null) {
			lazySingletonPattern = new LazySingletonPattern();
		}
		return lazySingletonPattern;
	}

}

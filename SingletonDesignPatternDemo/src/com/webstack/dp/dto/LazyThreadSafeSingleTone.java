package com.webstack.dp.dto;

public class LazyThreadSafeSingleTone {
	private static LazyThreadSafeSingleTone lazyThreadSafeSingleTone;
	
	private LazyThreadSafeSingleTone() {	
	}
	
	public static synchronized LazyThreadSafeSingleTone getInstance() {
		if(lazyThreadSafeSingleTone == null) {
			lazyThreadSafeSingleTone = new LazyThreadSafeSingleTone();
		}
		return lazyThreadSafeSingleTone;
	}
}

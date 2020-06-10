package com.webstack.dto;

import com.webstack.dp.PaymentStrategy;

public class ShoppingContext {

	
	public ShoppingContext() {		
	}
	
	public void pay(PaymentStrategy paymentStrategy,double amount) {
		paymentStrategy.pay(amount);	
	}
}

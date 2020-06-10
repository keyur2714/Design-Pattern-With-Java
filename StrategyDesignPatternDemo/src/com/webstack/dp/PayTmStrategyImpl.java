package com.webstack.dp;

public class PayTmStrategyImpl implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment Done with PayTm of Rs. "+amount);
	}

}

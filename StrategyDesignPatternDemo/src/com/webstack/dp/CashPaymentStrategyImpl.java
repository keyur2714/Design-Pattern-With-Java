package com.webstack.dp;

public class CashPaymentStrategyImpl implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment Done with CASH of Rs : "+amount);
	}	

}

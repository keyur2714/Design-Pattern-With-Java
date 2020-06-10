package com.webstack.dp;

public class CreditCardPaymentStrategy implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment Done with CreditCard of Rs : "+amount);
	}

}

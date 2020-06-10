package com.webstack.driver;

import com.webstack.dp.CashPaymentStrategyImpl;
import com.webstack.dp.PayTmStrategyImpl;
import com.webstack.dto.ShoppingContext;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		double totalBill = 177.45;
		
		ShoppingContext shoppingContext = new ShoppingContext();
		
		
		shoppingContext.pay(new PayTmStrategyImpl(),77.45);
		shoppingContext.pay(new CashPaymentStrategyImpl(),100);
		
		System.out.println("Shopping Done...!");
		
	}

}

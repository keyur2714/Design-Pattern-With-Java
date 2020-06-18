package com.webstack.dto;

import com.webstack.dp.AtmMoneyChain;
import com.webstack.dp.Currency;

public class Rs500Dispenser implements AtmMoneyChain {

private AtmMoneyChain chain;
	
	@Override
	public void setNextChain(AtmMoneyChain chain) {
		// TODO Auto-generated method stub
		this.chain = chain;
	}

	@Override
	public void dispense(Currency currency) {
		// TODO Auto-generated method stub
		if(currency.getAmount() >= 500) {
			int noOfNotes = currency.getAmount() / 500;
			int remainingAmt = currency.getAmount() % 500;
			System.out.println("Dispaching "+noOfNotes+" of 500 Rs.");
			if(remainingAmt != 0) {
				this.chain.dispense(new Currency(remainingAmt));
			}
		}else {
			System.out.println("500  "+currency.getAmount() );
			this.chain.dispense(currency);
		}
	}


}

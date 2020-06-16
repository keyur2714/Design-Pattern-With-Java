package com.webstack.dto;

import com.webstack.dp.AtmMoneyChain;
import com.webstack.dp.Currency;

public class Rs200Dispenser implements AtmMoneyChain {

private AtmMoneyChain chain;
	
	@Override
	public void setNextChain(AtmMoneyChain chain) {
		// TODO Auto-generated method stub
		this.chain = chain;
	}

	@Override
	public void dispense(Currency currency) {
		// TODO Auto-generated method stub
		if(currency.getAmount() >= 200) {
			int noOfNotes = currency.getAmount() / 200;
			int remainingAmt = currency.getAmount() % 200;
			System.out.println("Dispaching "+noOfNotes+" of 200 Rs.");
			if(remainingAmt != 0) {
				this.chain.dispense(new Currency(remainingAmt));
			}else {
				this.chain.dispense(currency);
			}
		}else {			
			System.out.println("200");
			this.chain.dispense(currency);
		}
	}


}

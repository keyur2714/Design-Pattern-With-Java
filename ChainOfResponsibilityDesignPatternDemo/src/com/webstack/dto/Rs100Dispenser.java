package com.webstack.dto;

import com.webstack.dp.AtmMoneyChain;
import com.webstack.dp.Currency;

public class Rs100Dispenser implements AtmMoneyChain {

	private AtmMoneyChain chain;
	
	@Override
	public void setNextChain(AtmMoneyChain chain) {
		// TODO Auto-generated method stub
		this.chain = chain;
	}

	@Override
	public void dispense(Currency currency) {
		// TODO Auto-generated method stub
		if(currency.getAmount() >= 100) {
			int noOfNotes = currency.getAmount() / 100;
			int remainingAmt = currency.getAmount() % 100;
			System.out.println("Dispaching "+noOfNotes+" of 100 Rs.");
			if(remainingAmt != 0) {
				this.chain.dispense(new Currency(remainingAmt));
			}else {
				this.chain.dispense(currency);
			}
		}
	}

}

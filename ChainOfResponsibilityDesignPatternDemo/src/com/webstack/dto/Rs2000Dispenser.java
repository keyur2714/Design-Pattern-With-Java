package com.webstack.dto;

import com.webstack.dp.AtmMoneyChain;
import com.webstack.dp.Currency;

public class Rs2000Dispenser implements AtmMoneyChain {

	private AtmMoneyChain chain;
	
	@Override
	public void setNextChain(AtmMoneyChain chain) {
		// TODO Auto-generated method stub
		this.chain = chain;
	}

	@Override
	public void dispense(Currency currency) {
		// TODO Auto-generated method stub
		if(currency.getAmount() >= 2000) {
			int noOfNotes = currency.getAmount() / 2000;
			int remainingAmt = currency.getAmount() % 2000;
			System.out.println("Dispaching "+noOfNotes+" of 2000 Rs.");
			System.out.println("Remainig Amount ."+remainingAmt);
			if(remainingAmt != 0) {
				this.chain.dispense(new Currency(remainingAmt));
			}else {
				this.chain.dispense(currency);
			}
		}else {
			this.chain.dispense(currency);
		}
	}

}

package com.webstack.dp;

public interface AtmMoneyChain {

	void setNextChain(AtmMoneyChain chain);
	void dispense(Currency currency);
	
}

package com.webstack.driver;

import java.util.Scanner;

import com.webstack.dp.AtmMoneyChain;
import com.webstack.dp.Currency;
import com.webstack.dto.Rs100Dispenser;
import com.webstack.dto.Rs2000Dispenser;
import com.webstack.dto.Rs200Dispenser;
import com.webstack.dto.Rs500Dispenser;

public class TestDriver {

	private AtmMoneyChain chain1;
	
	public TestDriver() {
		this.chain1 = new Rs2000Dispenser();
		AtmMoneyChain chain2 = new Rs500Dispenser();
		AtmMoneyChain chain3 = new Rs200Dispenser();
		AtmMoneyChain chain4 = new Rs100Dispenser();
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		chain3.setNextChain(chain4);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		TestDriver testDriver = new TestDriver();
		
		while(true) {
			int withdrawalAmount = 0;
			System.out.println("Enter Ammount : ");
			Scanner scanner = new Scanner(System.in);
			withdrawalAmount = scanner.nextInt();
			
			if(withdrawalAmount % 100 != 0) {
				System.out.println("Amount is not in Multiply of 100.");
			}else {
				testDriver.chain1.dispense(new Currency(withdrawalAmount));
			}
		}
		
		
	}

}

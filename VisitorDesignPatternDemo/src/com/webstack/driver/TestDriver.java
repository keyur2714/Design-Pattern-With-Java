package com.webstack.driver;

import com.webstack.dp.HolidayTaxCalcVisitor;
import com.webstack.dp.TaxCalcVisitor;
import com.webstack.dto.DailyProduct;
import com.webstack.dto.Entertainment;
import com.webstack.dto.Garments;

public class TestDriver {

	public static void main(String[] args) {
		System.out.println("Hello Radhe Krishna...!");
		
		TaxCalcVisitor taxCalcVisitor = new TaxCalcVisitor();
		HolidayTaxCalcVisitor holidaytaxCalcVisitor = new HolidayTaxCalcVisitor();
		
		Garments garments = new Garments(5000);
		Entertainment entertainment = new Entertainment(2000);
		DailyProduct dailyNeeds = new DailyProduct(10000);
		
		System.out.println("Normal Days Tax Calc.");
		taxCalcVisitor.visit(garments);
		taxCalcVisitor.visit(entertainment);
		taxCalcVisitor.visit(dailyNeeds);
		
		System.out.println("Holiday Tax Calc.");
		holidaytaxCalcVisitor.visit(garments);
		holidaytaxCalcVisitor.visit(entertainment);
		holidaytaxCalcVisitor.visit(dailyNeeds);
		
	}

}

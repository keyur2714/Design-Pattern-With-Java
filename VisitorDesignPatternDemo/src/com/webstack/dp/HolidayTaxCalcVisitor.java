package com.webstack.dp;

import com.webstack.dto.DailyProduct;
import com.webstack.dto.Entertainment;
import com.webstack.dto.Garments;

public class HolidayTaxCalcVisitor implements Visitor {

	@Override
	public void visit(Entertainment entertinment) {
		// TODO Auto-generated method stub
		System.out.println("Holiday Tax on Entertainment is: "+entertinment.getCost()*30/100);
	}

	@Override
	public void visit(Garments garments) {
		// TODO Auto-generated method stub
		System.out.println("Holiday Tax on Garments is: "+garments.getCost()*20/100);
	}

	@Override
	public void visit(DailyProduct dailyProducts) {
		// TODO Auto-generated method stub
		System.out.println("Holiday Tax on Daily Product is: "+dailyProducts.getCost()*5/100);

	}

}

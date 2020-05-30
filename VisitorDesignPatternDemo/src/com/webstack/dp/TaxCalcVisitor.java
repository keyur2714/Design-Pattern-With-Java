package com.webstack.dp;

import com.webstack.dto.DailyProduct;
import com.webstack.dto.Entertainment;
import com.webstack.dto.Garments;

public class TaxCalcVisitor implements Visitor {

	@Override
	public void visit(Entertainment entertinment) {
		// TODO Auto-generated method stub
		System.out.println("Tax on Entertainment is: " + entertinment.getCost() * 20 / 100);
	}

	@Override
	public void visit(Garments garments) {
		// TODO Auto-generated method stub
		System.out.println("Tax on Garment is: " + garments.getCost() * 10 / 100);
	}

	@Override
	public void visit(DailyProduct dailyProducts) {
		// TODO Auto-generated method stub
		System.out.println("Tax on DailyProduct is: " + dailyProducts.getCost() * 5 / 100);

	}

}

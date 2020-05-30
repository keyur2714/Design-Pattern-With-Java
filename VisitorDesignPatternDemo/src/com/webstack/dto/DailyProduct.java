package com.webstack.dto;

import com.webstack.dp.Visitor;

public class DailyProduct implements Visible {

	private long cost;

	public DailyProduct(long cost) {
		this.cost = cost;
	}

	@Override
	public void acceptOrder(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

}

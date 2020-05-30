package com.webstack.dp;

import com.webstack.dto.DailyProduct;
import com.webstack.dto.Entertainment;
import com.webstack.dto.Garments;

public interface Visitor {
	void visit(Entertainment entertinment);
	void visit(Garments garments);
	void visit(DailyProduct dailyProducts);
}

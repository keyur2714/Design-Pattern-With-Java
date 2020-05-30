package com.webstack.dto;

import com.webstack.dp.Visitor;

public interface Visible {
	void acceptOrder(Visitor visitor);
}

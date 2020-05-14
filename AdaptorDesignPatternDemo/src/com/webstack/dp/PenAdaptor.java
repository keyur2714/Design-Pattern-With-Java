package com.webstack.dp;

import com.webstack.dto.Pen;
import com.webstack.friends.RedPen;

public class PenAdaptor implements Pen{

	private RedPen redPen = new RedPen();
	
	@Override
	public void write(String line) {
		this.redPen.writeStatement(line);
	}
	
}

package com.fis.dto;

public class Rectangle extends Shape{

	public Rectangle(Color color) {
		super(color);		
	}

	@Override
	public void drawShape() {
		System.out.println("Drawing Rectangle with Below Color...!");
		color.applyColor();
	}
	
}

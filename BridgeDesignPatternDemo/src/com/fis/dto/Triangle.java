package com.fis.dto;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
	}

	@Override
	public void drawShape() {
		System.out.println("Drawing Triangle with Below Color...!");
		color.applyColor();
	}

}

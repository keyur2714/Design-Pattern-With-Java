package com.fis.dto;

public abstract class Shape {
	protected Color color; //Composition - it's Implementor
	public Shape(Color color) {
		this.color = color;
	}
	
	public abstract void drawShape();
}

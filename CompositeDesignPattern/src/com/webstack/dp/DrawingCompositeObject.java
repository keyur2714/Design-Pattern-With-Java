package com.webstack.dp;

import java.util.ArrayList;
import java.util.List;

import com.webstack.dto.Shape;

public class DrawingCompositeObject implements Shape{

	List<Shape> shapes = new ArrayList<>(); 
	
	@Override
	public void draw(String color) {
		// TODO Auto-generated method stub
		System.out.println("Color : "+color);
		for(Shape shape : this.shapes) {
			shape.draw(color);
		}
	}	
	
	public void add(Shape shape) {
		this.shapes.add(shape);
	}
	
	public void remove(Shape shape) {
		this.shapes.remove(shape);
	}
	
	public void clear() {
		this.shapes.clear();
	}
	
}

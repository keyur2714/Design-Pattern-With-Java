package com.webstack.driver;

import com.webstack.dp.DrawingCompositeObject;
import com.webstack.dto.Circle;
import com.webstack.dto.Shape;
import com.webstack.dto.Square;

public class TestDriver {

	public static void main(String str[]) {
		System.out.println("Hello Radhe Krishna...");
		
		Shape circle1 = new Circle();
		circle1.draw("Green");
		
		Shape square = new Square();
		square.draw("Orange");
		
		Shape circle2 = new Circle();
		circle2.draw("Yellow");
		
		DrawingCompositeObject drawing1 = new DrawingCompositeObject();
		drawing1.add(circle1);
		drawing1.add(square);
		drawing1.add(circle2);
		
		drawing1.draw("Green");
		drawing1.remove(circle1);
		
		drawing1.draw("Red");
				
	}
}

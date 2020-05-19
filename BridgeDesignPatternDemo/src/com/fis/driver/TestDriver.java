package com.fis.driver;

import com.fis.dto.GreenColor;
import com.fis.dto.Rectangle;
import com.fis.dto.RedColor;
import com.fis.dto.Shape;
import com.fis.dto.Triangle;
import com.fis.dto.YellowColor;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		Shape rectangle1 = new Rectangle(new RedColor());
		rectangle1.drawShape();
		
		Shape rectangle2 = new Rectangle(new GreenColor());
		rectangle2.drawShape();
		
		Shape triangle1 = new Triangle(new YellowColor());
		triangle1.drawShape();
	}

}

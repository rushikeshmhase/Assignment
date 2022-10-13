package com.assingments2.opps.problem2;

import java.util.Scanner;

public class Triangle implements Shape{

	double height;
	double base;
	
	@Override
	public double area(double a, double b) {

		this.height = a;
		this.base = b;
		double area = Math.abs(0.5 *height *base);
		System.out.println(area);
		return area;	
		
	}


}

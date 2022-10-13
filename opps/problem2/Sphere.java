package com.assingments2.opps.problem2;

public class Sphere implements Shape{

	double a;
	
	@Override
	public double area(double a, double b) {

		double area = Math.abs(a * a);
		System.out.println(area);
		return area;
	}



}

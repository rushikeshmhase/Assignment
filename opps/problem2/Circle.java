package com.assingments2.opps.problem2;

public class Circle implements Shape {

	double r;
	
	@Override
	public double area(double a, double b) {
		double area = Math.abs(3.14* a * a);
		System.out.println(area);
		return area;
	}

	}

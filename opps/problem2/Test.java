package com.assingments2.opps.problem2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Select (1 : For Triangle, 2 : For Circle, 3 :For Sphere, 4 : To Stop)");
		int select = sc.nextInt();
		
		if(select == 1)
		{
		System.out.println("Enter The First Parameter");
		double a = sc.nextDouble();
		
		System.out.println("Enter The Second Parameter");
		double b = sc.nextDouble();
		
		System.out.println("");
		Triangle t = new Triangle();
		System.out.println("Area Of Traingle");
		t.area(a, b);
		System.out.println("");
		}
		
		if(select == 2)
		{
		System.out.println("Enter The Parameter");
		double a = sc.nextDouble();
		
		Circle c = new Circle();
		System.out.println("Area Of Circle");
		c.area(a, 0);
		System.out.println("");
		}
		
		if(select == 3)
		{
		System.out.println("Enter The Parameter");
		double a = sc.nextDouble();
		Sphere sphere = new Sphere();
		System.out.println("Area Of Sphere");
		sphere.area(a, 0);
		System.out.println("");
		}
		
		if(select == 4)
		{
			break;
		}
		}
	}
}

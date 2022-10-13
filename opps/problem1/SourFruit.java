package com.assingments2.opps.problem1;

public class SourFruit extends Fruit {

	String [] sourFruitInfo = new String[9];
	String sourtest;
	
	public SourFruit(String fruitName, String fruitColor, String sourFruitInfo [] ,String sourtest)
	{
		super(fruitName, fruitColor);
		this.sourFruitInfo=sourFruitInfo;
		this.sourtest=sourtest;

	}
	public void display(SourFruit sf)
	{
		System.out.println("***SourFruits info***");
		System.out.println("Fruit Name ="+sf.fruitName);
		System.out.println("Fruit Color ="+sf.fruitColor);
		System.out.println("**Nutrition summary**");
		       for(String s:sf.sourFruitInfo)
		       {
		    	   System.out.print(s +" ");
		       }
		System.out.println();
		System.out.println("SourFruit because of sugar is =" +sf.sourtest);
		System.out.println("=============****=============");
	}

	
}

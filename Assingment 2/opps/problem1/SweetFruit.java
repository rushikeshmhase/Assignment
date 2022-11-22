package com.assingments2.opps.problem1;

public class SweetFruit extends Fruit{
	String [] sweetFruitInfo = new String[9];
	String sweet;
	
	public SweetFruit(String fruitName, String fruitColor, String sweetFruitInfo [] ,String sweet)
	{
		super(fruitName, fruitColor);
		this.sweetFruitInfo=sweetFruitInfo;
		this.sweet=sweet;

	}
	public void display(SweetFruit sf)
	{
		System.out.println("***SweetFruits info***");
		System.out.println("Fruit Name ="+sf.fruitName);
		System.out.println("Fruit Color ="+sf.fruitColor);
		System.out.println("**Nutrition summary**");
		       for(String s:sf.sweetFruitInfo)
		       {
		    	   System.out.print(s +" ");
		       }
		System.out.println();
		System.out.println("SourFruit because of sugar is =" +sf.sweet);
		System.out.println("=============****=============");
	}
	
}

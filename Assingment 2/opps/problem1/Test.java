package com.assingments2.opps.problem1;

public class Test {
	public static void main(String[] args) 
	{
		String sourfruit[]= {"20%calories","30%carbohydrate","10%fiber" ,"15%sugar", "3%fat" ,"9%protein" ,"12%vit"};
		String sweetfruit[]= {"13%calories","17%carbohydrate","26%fiber" ,"43%sugar", "5%fat" ,"5%protein" ,"10%vit"};
		
		SourFruit sf=new SourFruit("Mango", "yellow", sourfruit, "15%sugar");
		SweetFruit swf=new SweetFruit("Apple", "Red", sweetfruit, "40%sugar");
		
		sf.display(sf);
		swf.display(swf);
	}
}

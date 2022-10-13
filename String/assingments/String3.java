package com.String.assingments;

//WAP to replace all small letter by capital and capital by small.

import java.util.Scanner;

public class String3 {
	public static void main(String args[])
	{
		//String is taken from user
		Scanner sc = new Scanner(System.in);
		String inputString;

		System.out.println("Enter the string  : ");
		inputString = sc.nextLine();
		
		//String is converted into arrayx
		
		char[] stringToChar=inputString.toCharArray();
       
		//logic
		for (int i = 0; i<stringToChar.length; i++) {
		      if(stringToChar[i] >= 'a' && stringToChar[i] <= 'z') {
		    	  stringToChar[i] = (char) (stringToChar[i] - 32);
		      }
		      else if(stringToChar[i] >= 'A' && stringToChar[i] <= 'Z')
		      {
		    	  stringToChar[i] = (char) (stringToChar[i] + 32);
		      }
		   }
		   System.out.println("String in Upper Case : ");
		   for (int i = 0; i<stringToChar.length; i++) {
			   System.out.print(stringToChar[i]);
		   }
	}
}



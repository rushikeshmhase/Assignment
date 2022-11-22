package com.String.assingments;

//WAP to implement split function by you.

import java.util.Scanner;

public class String6 {
	public static void main(String[] args) 
	{
		int countF = 0;
		int countS = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Strings");
		char[] firstStr = sc.nextLine().toCharArray();		
		for(char fStr : firstStr)
		{
			countF++;
		}
		
		int n = countF;
		
		System.out.println("Enter the Token To Split The String ");
		String tok = sc.next();
		char [] tokens = tok.toCharArray();
		char token = tokens[0];
		for(int i = 0; i < n; i++)
		{
			if(firstStr[i] == token)
			{
				System.out.println("\n");
			}
			else
			{
				System.out.println(" " + firstStr[i]);
			}
		}
		
	}
}

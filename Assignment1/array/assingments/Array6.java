package com.array.assingments;

//An array contains different numbers. You have to calculate average of two consecutive
//numbers.

import java.util.Scanner;

public class Array6 {
	public static void main(String[] args) 
	{
		int n ;
		//size of array is taken from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Elements You Want To Add"); 
		n = sc.nextInt();
		
		//Enter elements are stored in array
		int [] arr = new int[n];
		System.out.println("Enter The Elements");
		for(int i = 0; i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("");
		
		//logic
		for(int i = 0; i < n; i++)
		{
			if((i + 1) < n)
			{
				double avg = (arr[i] + arr [i + 1])/2;
				System.out.println("Average Of two Consecutive Number " + avg);
			}
			
		}
}
}
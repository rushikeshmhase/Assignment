package com.array.assingments;
//User will enter the different numbers. You have arrange numbers on the basis of their
//difference between two numbers.
import java.util.Scanner;

public class Array9 {
	static int k = 0;
	public static void main(String[] args) 
	{
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Elements You Want To Add"); 
		n = sc.nextInt();
		int [] arr = new int[n];
		int [] newArray = new int[n *5];
		System.out.println("Enter The Elements");
		//Entering The Elements In Array
		for(int i = 0; i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("");
		
		System.out.println("Differnce Between Elements");
		for(int i =0; i < n; i++)
		{
			for(int j= 0; j< n;j++)
			{
				if(arr[i] - arr[j] > 0)
				{
				System.out.println(arr[i] - arr[j]);	
				newArray [k]= arr[i] - arr[j];
				System.out.println(arr[i] - arr[j]);
				k++;
				}	
			}
			
		}
	}}

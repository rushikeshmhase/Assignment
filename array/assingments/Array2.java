
package com.array.assingments;

//WAP to remove duplicate numbers from list of numbers.

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
         int a;
	//size of array are taken from user
         Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:-");
		a=sc.nextInt();
		
		System.out.println("Enter the elements one by one which you want to add in array :-");
    //elements are added in array
		int[] arr=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int []arg=new int[a];
		System.out.println("Dublicate elements are:-");
    
		//logic to find duplicate
		for(int i=0;i<a;i++) {
                      for(int j=i+1;j<a;j++) {
                    	  if(arr[i]==arr[j]) {
                    		  System.out.println(arr[i]);
                    		  arr[j] = arr[a -1];
                    		  a--;
                    	  }
                      }
	    }

	    System.out.println("New Array Without Repeatations ::");
	    for(int i =0; i <a; i++)
	    {
	    	System.out.println(arr[i]);
	    }

	}

}

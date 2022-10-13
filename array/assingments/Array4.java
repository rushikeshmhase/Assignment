package com.array.assingments;

//An Array contain the n numbers you have to find out combination which satisfy Pythagoras
//Template. ( Pythagoras templates:- 3*3+4*4==5*5)

public class Array4 {
public static void main(String[] args) {
	
	int arr[]= {20,3,99,101,4,88,5,105,137,9};
	//find the length of array
	int count=0;
	for(int i:arr) {
		count++;
	}
	//System.out.println(count);
	//following are the three different way to check combination of pythagoras number
	//first way
	for(int i=0;i<count;i++) {
		for(int j=i+1;j<count;j++) {
			for(int k=j+1;k<count;k++) {
				if((arr[i]*arr[i])+(arr[j]*arr[j])==(arr[k]*arr[k])) {
					System.out.println(arr[i]+";"+arr[j]+";"+arr[k]);
				}

			}
		}
	}

}
}

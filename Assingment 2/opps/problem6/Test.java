package com.assingments2.opps.problem6;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The First String");
	String first = sc.next();

	System.out.println("Enter The Second String");
	String second = sc.next();

	String strOne = first;
	String strTwo = second;

	StringA a = new StringB();
	a.m1(strOne, strTwo);
}
}

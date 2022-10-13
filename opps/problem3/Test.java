package com.assingments2.opps.problem3;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) 
	{
		System.out.println("First ");
		Branch branch = new Branch(101, "SBI", "satav Nagar Mumbai");
		System.out.println(branch);
		Student std = new Student(1, 132123, "Mayur", "Katraj Pune", LocalDate.of(1997, 12, 12), LocalDate.of(2022, 10, 2), branch);
		System.out.println(std);
		Custmer_Account_Statments cas = new Custmer_Account_Statments(123, 123213, 10000, 2456, LocalDate.of(2022, 11, 2), std, branch);
		System.out.println(cas);
		System.out.println("");
		System.out.println("Second ");
		Branch branchOne = new Branch(104, "SBI", " Navi Mumbai");
		System.out.println(branchOne);
		Student stdOne = new Student(3, 132344, "Vedant", "Mundhawa Pune", LocalDate.of(1997, 11, 1), LocalDate.of(2022, 10, 12), branchOne);
		System.out.println(stdOne);
		Custmer_Account_Statments casOne = new Custmer_Account_Statments(133, 123213, 10000, 3356, LocalDate.of(2022, 11, 2), stdOne, branchOne);
		System.out.println(casOne);

	}}

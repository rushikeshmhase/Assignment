package com.assingments2.opps.problem10;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee(101,"Rushi Mhase", 35000, "Hadapsar,Pune",LocalDate.of(1997, 8, 1),LocalDate.of(2020, 8, 9));
		System.out.println(emp);
	}
}

package com.assingments2.opps.problem10;

import java.time.LocalDate;

//WAP to print the object of Employee class with the help of toString method.
//Employee class fields :- empid, empname, empsalary, empaddress, emp_dob,
//emp_doj. use Date class to store the date of birth(dob) and date of joining(doj).

public class Employee {

	private int empId;
	private String empName;
	private double empSalary;
	private String empAddress;
	private LocalDate emp_dob;
	private LocalDate emp_boj;
	
	public Employee(int empId, String empName, double empSalary, String empAddress, LocalDate emp_dob,
			LocalDate emp_boj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.emp_dob = emp_dob;
		this.emp_boj = emp_boj;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAddress="
				+ empAddress + ", emp_dob=" + emp_dob + ", emp_boj=" + emp_boj + "]";
	}
	

	
}

package com.assingments2.opps.problem9;

public class Employee implements Cloneable{

	int empId;
	String empName;
	int empSalary; 
	String deptname;
	
	public Employee(int empId, String empName, int empSalary, String deptname) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.deptname = deptname;
	}
	
	public Object clone () throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{
		Employee one = new Employee(101,"Rushi",12000,"JAVA");
		Employee two = new Employee(102,"Mayur",1000,"Testing");
		two =(Employee) one.clone();
		
		System.out.println(two.deptname);
		System.out.println(two.empId);
		System.out.println(two.empName);
		System.out.println(two.empSalary);
		
		if (two instanceof Employee) 
		{
			System.out.println("Yes It Is Object Of Class ProgramNine");
		}
		System.out.println(one == two);
		
	}
}

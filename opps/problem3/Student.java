package com.assingments2.opps.problem3;

import java.time.LocalDate;

//Create Class STudent which will have following class members: - rollno, accountno,
//custname, cust_address, cust_dob, cust_account_opening_date, Branch_Obj.

public class Student {
	int rollno;
	long accountno;
	String custname;
	String cust_address;
	public LocalDate cust_dob;
	public LocalDate cust_account_opening_date;
	Branch branch;
	
	public void studentInfo(Student std)
	{
	
		System.out.println(std.rollno);
		System.out.println(std.accountno);
		System.out.println(std.custname);
		System.out.println(std.cust_address);
		System.out.println(std.cust_dob);
		System.out.println(std.cust_account_opening_date);
		System.out.println(branch.getBranch_id());
		System.out.println(branch.getBranch_name());
		System.out.println(branch.getBranch_address());
		
	}
	
	
	
Student(int rollno, long accountno, String custname, String cust_address, LocalDate cust_dob,
			LocalDate cust_account_opening_date, Branch branch) 
	{
		super();
		this.rollno = rollno;
		this.accountno = accountno;
		this.custname = custname;
		this.cust_address = cust_address;
		this.cust_dob = cust_dob;
		this.cust_account_opening_date = cust_account_opening_date;
		this.branch = branch;
	}



	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public LocalDate getCust_dob() {
		return cust_dob;
	}
	public void setCust_dob(LocalDate cust_dob) {
		this.cust_dob = cust_dob;
	}
	public LocalDate getCust_account_opening_date() {
		return cust_account_opening_date;
	}
	public void setCust_account_opening_date(LocalDate cust_account_opening_date) {
		this.cust_account_opening_date = cust_account_opening_date;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", accountno=" + accountno + ", custname=" + custname + ", cust_address="
				+ cust_address + ", cust_dob=" + cust_dob + ", cust_account_opening_date=" + cust_account_opening_date
				+ ", branch=" + branch + "]";
	}
	
}

package com.assingments2.opps.problem3;

import java.time.LocalDate;

//Class Customer_Account_Statement:- CAID, CustId, amount, deposit_withdrawl,
//deposit_date.

public class Custmer_Account_Statments {
	long cAID;
	long CustId;
	long amount;
	long deposit_withdrawl;
	private LocalDate deposit_date;
	Student std;
	Branch branch;


	public Custmer_Account_Statments(long cAID, long custId, long amount, long deposit_withdrawl,
			LocalDate deposit_date, Student std, Branch branch) {
		super();
		this.cAID = cAID;
		CustId = custId;
		this.amount = amount;
		this.deposit_withdrawl = deposit_withdrawl;
		this.deposit_date = deposit_date;
		this.std = std;
		this.branch = branch;
	}





	public void cusInfo(Custmer_Account_Statments cas)
	{
		System.out.println(cas.cAID);
		System.out.println(cas.CustId);
		System.out.println(cas.amount);
		System.out.println(cas.deposit_withdrawl);
		System.out.println(std.getRollno());
		System.out.println(std.getAccountno());
		System.out.println(std.getCust_address());
		System.out.println(std.getCust_address());
		System.out.println(std.getCust_dob());
		System.out.println(std.getCust_account_opening_date());
		System.out.println(branch.getBranch_id());
		System.out.println(branch.getBranch_name());
		System.out.println(branch.getBranch_address());
		
	}





	@Override
	public String toString() 
	{
		return "Customer_Account_Statements [cAID=" + cAID + ", CustId=" + CustId + ", amount=" + amount
				+ ", deposit_withdrawl=" + deposit_withdrawl + ", deposit_date=" + deposit_date + ", std=" + std + "]";
	}
	
	
}

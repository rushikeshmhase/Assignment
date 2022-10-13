package com.assingments2.opps.problem7;

import java.time.LocalDate;

public class Athletic {
	int aid;
	String	aname;
	String address;
     private LocalDate dob;
	
     public Athletic(int aid, String aname, String address, LocalDate dob) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.address = address;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Athletic [aid=" + aid + ", aname=" + aname + ", address=" + address + ", dob=" + dob + "]";
	}
     
     
	
     
}

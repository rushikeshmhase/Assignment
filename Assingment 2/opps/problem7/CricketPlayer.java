package com.assingments2.opps.problem7;

import java.time.LocalDate;

public class CricketPlayer extends Athletic {

	String teamname;
	int jersyno; 
	int totalruns;
	int highestscore;
	double avg;
	int totalmatchedplayed;
	
	public CricketPlayer(int aid, String aname, String address, LocalDate dob, String teamname, int jersyno,
			int totalruns, int highestscore, double avg, int totalmatchedplayed) {
		super(aid, aname, address, dob);
		this.teamname = teamname;
		this.jersyno = jersyno;
		this.totalruns = totalruns;
		this.highestscore = highestscore;
		this.avg = avg;
		this.totalmatchedplayed = totalmatchedplayed;
	}

	@Override
	public String toString() {
		return "CricketPlayer [teamname=" + teamname + ", jersyno=" + jersyno + ", totalruns=" + totalruns
				+ ", highestscore=" + highestscore + ", avg=" + avg + ", totalmatchedplayed=" + totalmatchedplayed
				+ "]";
	}
	
	
}

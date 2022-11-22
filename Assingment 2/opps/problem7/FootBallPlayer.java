package com.assingments2.opps.problem7;

import java.time.LocalDate;

public class FootBallPlayer extends Athletic {

	String teamname;
	int jersyno;
	int totalgoals;
	int highestgoal_in_a_match;
	int totalmatchedplayed;
	
	public FootBallPlayer(int aid, String aname, String address, LocalDate dob, String teamname, int jersyno,
			int totalgoals, int highestgoal_in_a_match, int totalmatchedplayed) {
		super(aid, aname, address, dob);
		this.teamname = teamname;
		this.jersyno = jersyno;
		this.totalgoals = totalgoals;
		this.highestgoal_in_a_match = highestgoal_in_a_match;
		this.totalmatchedplayed = totalmatchedplayed;
	}

	@Override
	public String toString() {
		return "FootBallPlayer [teamname=" + teamname + ", jersyno=" + jersyno + ", totalgoals=" + totalgoals
				+ ", highestgoal_in_a_match=" + highestgoal_in_a_match + ", totalmatchedplayed=" + totalmatchedplayed
				+ "]";
	}
	
	
	
}

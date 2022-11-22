package com.assingments2.opps.problem7;

import java.time.LocalDate;

public class Hockey extends Athletic {

	String teamname;
	int jersyno;
	int totalgoals;
	int highest_goal_in_a_match;
	int total_matched_played;
	
	public Hockey(int aid, String aname, String address, LocalDate dob, String teamname, int jersyno, int totalgoals,
			int highest_goal_in_a_match, int total_matched_played) {
		super(aid, aname, address, dob);
		this.teamname = teamname;
		this.jersyno = jersyno;
		this.totalgoals = totalgoals;
		this.highest_goal_in_a_match = highest_goal_in_a_match;
		this.total_matched_played = total_matched_played;
	}

	@Override
	public String toString() {
		return "Hockey [teamname=" + teamname + ", jersyno=" + jersyno + ", totalgoals=" + totalgoals
				+ ", highest_goal_in_a_match=" + highest_goal_in_a_match + ", total_matched_played="
				+ total_matched_played + "]";
	}
	
	
	
     
}

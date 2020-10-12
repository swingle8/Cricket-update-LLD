package com.company.Model;


public class CricketScore {
	int runs;
	int wickets;
	int overs;
	public CricketScore() {
		super();
	}
	
	public int getRuns() {
		return runs;
	}
	
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public int getWickets() {
		return wickets;
	}
	
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	public int getOvers() {
		return overs;
	}
	
	public void setOvers(int overs) {
		this.overs = overs;
	}
	
	public void updateScore (int runs, int wickets, int overs) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
	}
	
	
}	

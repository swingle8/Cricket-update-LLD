package com.company.display;

import com.company.Model.CricketScore;
import com.company.Observer.Observer;

public class CurrentScoreDisplay implements Observer {
	

	@Override
	public void update(CricketScore score) {
		System.out.println("Score updated to Score : " + score.getRuns() + " Wickets : " + score.getWickets() + " Overs : " + score.getOvers());
		
	}
}

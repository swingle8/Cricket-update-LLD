package com.company.display;

import com.company.Model.CricketScore;
import com.company.Observer.Observer;

public class AverageScoreDisplay implements Observer {
	

	@Override
	public void update(CricketScore score) {
		System.out.println("Average Score : " + score.getRuns());
	}
}

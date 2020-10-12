package com.company;

import com.company.Model.CricketScore;
import com.company.Subject.CricketData;
import com.company.display.AverageScoreDisplay;
import com.company.display.CurrentScoreDisplay;

public class Main {
	public static void main(String [] args) {
		CurrentScoreDisplay curr = new CurrentScoreDisplay();
		CricketData data = new CricketData();
		
		AverageScoreDisplay avg = new AverageScoreDisplay();
		
		
		data.registerObserver(curr);
		data.registerObserver(avg);
		
		CricketScore score = new CricketScore();
		data.updateScore(score);
		
		score.updateScore(4, 0, 1);
		data.updateScore(score); 
	}
}

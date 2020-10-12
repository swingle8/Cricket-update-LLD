package com.company.Subject;

import java.util.ArrayList;
import java.util.Iterator;

import com.company.Model.CricketScore;
import com.company.Observer.Observer;

public class CricketData implements Subject {
	CricketScore score;
	ArrayList<Observer> ObserverList;
	
	public CricketData () {
		this.ObserverList = new ArrayList<Observer>();
	}
	
	public void updateScore (CricketScore score) {
		this.score = score;
		notifyObserver();
	}
	
	@Override
	public void registerObserver(Observer o) {
		ObserverList.add(o);
		
	}

	@Override
	public void UnRegisterObserver(Observer o) {
		ObserverList.remove(ObserverList.indexOf(o));
		
	}

	@Override
	public void notifyObserver() {
		for (Iterator<Observer> it = ObserverList.iterator(); it.hasNext() ; ) {
			Observer o = it.next();
			o.update(this.score);
		}
		
	}

}

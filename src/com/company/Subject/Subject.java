package com.company.Subject;

import com.company.Observer.Observer;

public interface Subject {
	void registerObserver(Observer o);
	void UnRegisterObserver(Observer o);
	void notifyObserver();
	 
}

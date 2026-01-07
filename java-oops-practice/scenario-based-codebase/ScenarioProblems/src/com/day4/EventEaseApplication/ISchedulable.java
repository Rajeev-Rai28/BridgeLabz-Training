package com.day4.EventEaseApplication;

public interface ISchedulable {
	
	void schedule();
	
	void reschedule(String newDate);
	
	void cancel();
	
}

package com.luv2code.springdemo;

public interface Coach {

	// Software engineering best practice: "code to the interface
	// Refactoring - if more then one related class can share an interface
	public String getDailyWorkout();
}

package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// Create the object
		//System.out.println("Testing Eclipse");
		Coach theCoach = new BaseballCoach();
		
		// Use the object
		System.out.println(theCoach.getDailyWorkout());
		
		Coach theSecondCoach = new trackCoach();
		System.out.println(theSecondCoach.getDailyWorkout());
	}

}

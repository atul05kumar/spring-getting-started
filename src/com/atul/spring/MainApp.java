package com.atul.spring;

public class MainApp {
	
	public static void main(String [] args) {
		
		//create the object
		Coach myCoach = new TrackCoach();
		
		//use the object
		myCoach.getDailyWorkout();
	}
}

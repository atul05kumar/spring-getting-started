package com.atul.spring;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run of atleast 5KM";
		
	}

	@Override
	public String getDailyFortune() {
		
		return "A track runner always has good fortune.";
	}
	
}

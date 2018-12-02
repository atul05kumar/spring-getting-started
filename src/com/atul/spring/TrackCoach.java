package com.atul.spring;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService  = fortuneService;
	}

	public TrackCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Run of atleast 5KM";
		
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
}

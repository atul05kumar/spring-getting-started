package com.atul.spring;

public class CricketCoach implements Coach {

	private FortuneService cricketFortuneService;
	
	public CricketCoach() {
		System.out.println("Inside default CricketCoach Constructor!");
	}
	
	
	public void setCricketFortuneService(FortuneService cricketFortuneService) {
		System.out.println("Setting the dependency using Spring!");
		this.cricketFortuneService = cricketFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast blowling for 20 mins.";
	}

	@Override
	public String getDailyFortune() {
		
		return cricketFortuneService.getFortune();
	}
	
}

package com.atul.spring;

public class BasketBallCoach implements Coach {
	
	//define a private field for dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BasketBallCoach(FortuneService myFortuneService) {
		fortuneService = myFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice batting for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
}

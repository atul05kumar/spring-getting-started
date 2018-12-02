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
	
	
	//init method - will be invoked on bean construction.
	public void init() {
		System.out.println("BasketBallCoach : Inside init method.");
	}
	
	//destroy method - will be invoked on bean destruction.
	public void cleanup() {
		System.out.println("BasketBallCoach : Inside cleanup method.");
	}

	
}

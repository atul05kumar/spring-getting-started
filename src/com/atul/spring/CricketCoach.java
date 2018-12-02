package com.atul.spring;

public class CricketCoach implements Coach {

	private FortuneService cricketFortuneService;
	private String email;
	private String team;
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		System.out.println("Inside CricketCoach : Setting Email");
		this.email = email;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Inside CricketCoach : Setting Team Name");
		this.team = team;
	}


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

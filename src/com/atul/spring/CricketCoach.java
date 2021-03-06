package com.atul.spring;

public class CricketCoach implements Coach {

	//private FortuneService cricketFortuneService;
	private FortuneService randomFortuneService;
	private String email;
	private String team;
	private String firstName;
	private String lastName;
	
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


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
	
	/*
	//Spring calls setter method of member variable to set its value, when the object gets created.
	public void setCricketFortuneService(FortuneService cricketFortuneService) {
		System.out.println("Setting the dependency using Spring!");
		this.cricketFortuneService = cricketFortuneService;
	}*/
	
	public void setRandomFortuneService(FortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast blowling for 20 mins.";
	}

	@Override
	public String getDailyFortune() {
		
		return randomFortuneService.getFortune();
	}
	
}

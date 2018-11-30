package com.atul.spring;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Hey You have a lucky Day!";
	}
	
	
	
}

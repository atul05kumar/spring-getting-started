package com.atul.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve the beans from spring container.
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		Coach basketBallCoach = context.getBean("basketBallCoach", Coach.class);
		//call the methods available in the bean.
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(basketBallCoach.getDailyWorkout());
		
		System.out.println(basketBallCoach.getDailyFortune());
		System.out.println(trackCoach.getDailyFortune());
		
		
		//setter injection using Spring
		Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
		System.out.println(cricketCoach.getDailyFortune());
		
		
		//reading literal values injected in bean using spring.
		CricketCoach cricketCoachImpl = context.getBean("cricketCoach", CricketCoach.class);
		System.out.println(cricketCoachImpl.getEmail());
		System.out.println(cricketCoachImpl.getTeam());
		
		//readying member variables using property file
		System.out.println(cricketCoachImpl.getFirstName());
		System.out.println(cricketCoachImpl.getLastName());
		//close the context
		context.close();
		

	}

}

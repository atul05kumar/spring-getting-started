package com.atul.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		
		//load the spring configuration file.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-ApplicationContext.xml");
		
		//get the bean from spring container
		Coach coach = context.getBean("trackCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		
		
		//in prototype scope destroy method is not called.
		Coach basketBallCoach = context.getBean("basketBallCoach", Coach.class);
		System.out.println(basketBallCoach.getDailyWorkout());
		
		//close the context.
		context.close();
		

	}

}

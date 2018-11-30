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
		trackCoach.getDailyWorkout();
		basketBallCoach.getDailyWorkout();
		//close the context
		context.close();
		

	}

}

package com.atul.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		
		//load the spring configuration file.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-ApplicationContext.xml");
		//retrieve the bean from spring container
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		
		//retrieve another bean
		Coach alphaCoach = context.getBean("trackCoach", Coach.class);
		
		//check if they are same
		boolean result = (trackCoach == alphaCoach);
		
		System.out.println("Are the beans same : " + result);
		
		//print the memory location of individual beans
		System.out.println("Memory location of trackCoach bean is " + trackCoach);
		System.out.println("Memory location of alphaCoach bean is " + alphaCoach);
		
		//above demonstrates that default bean scope is singleton and only one bean is created.
		

	}

}

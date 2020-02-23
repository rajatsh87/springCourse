package com.udemy.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotattionsDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		
		ClassPathXmlApplicationContext context=new 
		ClassPathXmlApplicationContext("applicationContext-Annotations.xml");
		
		//get beans
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}

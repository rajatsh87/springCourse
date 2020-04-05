package com.udemy.spring.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(SportsConfig.class);
		Coach theCoach=context.getBean("mySwimCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	}
}

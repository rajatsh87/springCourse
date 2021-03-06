package com.udemy.spring.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//laod spring config file
		ClassPathXmlApplicationContext context= new 
				ClassPathXmlApplicationContext ("applicationContext.xml");
		
		//retrieve bean from spring container
		
		Coach theCoach= context.getBean(FifaCoach.class);
				
		//call methods on beans
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close the context

		context.close();
	}

}

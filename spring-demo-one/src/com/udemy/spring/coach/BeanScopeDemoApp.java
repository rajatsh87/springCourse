package com.udemy.spring.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		//load spring config file
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve Bean from spring Container
		
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		boolean result=(theCoach==alphaCoach);
		
		System.out.println("are both beans pointing to same object: "+result);
		System.out.println("\nmemory loaction of theCoach"+theCoach);
		System.out.println("\nmemory loaction of alphaCoach"+alphaCoach);
		
		context.close();
	}
}

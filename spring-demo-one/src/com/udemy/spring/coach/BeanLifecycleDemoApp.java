package com.udemy.spring.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {
	
	public static void main(String[] args) {
		
		
		// @PostConstruct this annotation on function run at starting
		
		// @PreDestroy annotation to do clean up task  {{for scope prototype ref 62}}
		
		//for java 9 and above ref lecture 80
		
		
		//load spring config file
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
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

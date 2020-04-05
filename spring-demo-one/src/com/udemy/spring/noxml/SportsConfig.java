package com.udemy.spring.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.udemy.spring.coach.HappyFortuneService;

@Configuration
public class SportsConfig {
	@Bean FortuneService happyFortuneService() {
		return new com.udemy.spring.noxml.HappyFortuneService();
	}
	
	@Bean
	public SwimCoach mySwimCoach() {
		SwimCoach myswimCoach=new SwimCoach(happyFortuneService());
		return myswimCoach;
	}
}

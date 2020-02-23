package com.udemy.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	//field Injection
	@Autowired
	@Qualifier("happyFortune")
	private FortuneService forService;
	/*
	//auto wireing through constructor

	@Autowired
	public TennisCoach(FortuneService forService) {
		this.forService = forService;
	}
	*/
	
	//auto wireing through setter methods (any method name can work)
//	@Autowired
//	public void setForService(FortuneService forService) {
//		this.forService = forService;
//	}
	

	@Override
	public String getDailyWorkout() {
		
		return "Practice you backhand";
	}
	

	public String getDailyFortune() {
		return forService.dailyFortuneService();
	}
	
	

}

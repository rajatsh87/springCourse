package com.udemy.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	private FortuneService forService;

	@Autowired
	public TennisCoach(FortuneService forService) {
		this.forService = forService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice you backhand";
	}
	
	public String getDailyFortune() {
		return forService.dailyFortuneService();
	}
	
	

}

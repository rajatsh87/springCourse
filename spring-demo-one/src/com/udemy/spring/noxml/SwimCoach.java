package com.udemy.spring.noxml;

import com.udemy.spring.noxml.Coach;

public class SwimCoach implements Coach {
	
	private FortuneService fService;
	public SwimCoach(FortuneService fService1) {
		fService=fService1;
	}

	@Override
	public String getDailyWorkout() {
		return "practice swiming";
	}

	@Override
	public String getDailyFortune() {
		return fService.getFortune();
	}

}

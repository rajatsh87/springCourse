package com.udemy.spring.coach;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneSer;
	
	public BaseballCoach(FortuneService forSer) {
		fortuneSer=forSer;
	}
	
	@Override
	public String getDailyWorkout() {
		return "practice batting for 30 min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneSer.getFortune();
	}
}

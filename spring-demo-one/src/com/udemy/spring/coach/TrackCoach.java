package com.udemy.spring.coach;

public class TrackCoach implements Coach {
	
	private FortuneService forService;
	TrackCoach(FortuneService forSer){
		forService=forSer;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 1k daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return forService.getFortune();
	}

}

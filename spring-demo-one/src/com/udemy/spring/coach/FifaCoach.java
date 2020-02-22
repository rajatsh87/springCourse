package com.udemy.spring.coach;

public class FifaCoach implements Coach{
	
	private FortuneService forService;
	FifaCoach(FortuneService forSer){
		forService=forSer;
	}
	
@Override
public String getDailyWorkout() {
	return "play fifa daily for 1 hr";
}

@Override
public String getDailyFortune() {
	return forService.getFortune();
}
}

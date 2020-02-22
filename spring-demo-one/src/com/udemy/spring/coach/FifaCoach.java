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
	//add an init method
	public void onInitalization() {
		System.out.println("this method will run after beans are initialized");
	}
	
	//add a destory method
	
	public void onDestory() {
		System.out.println("	perform cleaning stuff");
	}
}

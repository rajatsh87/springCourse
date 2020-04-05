package com.udemy.spring.coach;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
//	public CricketCoach() {
//		System.out.println("inside constructor");
//	}
	
		
	public void setFortuneService(FortuneService fortuneService) {
		//System.out.println("inside setter method");
		this.fortuneService = fortuneService;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		//System.out.println(emailAddress);
		this.emailAddress = ""+emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	@Override
	public String getDailyWorkout() {
		
		return "play a test match every week";
	}
	
	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	

}

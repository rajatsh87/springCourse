package com.udemy.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements com.udemy.spring.annotations.FortuneService {

	@Override
	public String dailyFortuneService() {
		
		return "you will be lucky day";
	}

	

}

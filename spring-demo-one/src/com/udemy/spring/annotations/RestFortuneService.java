package com.udemy.spring.annotations;

import org.springframework.stereotype.Component;


@Component
public class RestFortuneService implements FortuneService {


	@Override
	public String dailyFortuneService() {
		// TODO Auto-generated method stub
		return "today you are good to go";
	}

}

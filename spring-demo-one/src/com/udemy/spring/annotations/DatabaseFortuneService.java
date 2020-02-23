package com.udemy.spring.annotations;

import org.springframework.stereotype.Component;


@Component
public class DatabaseFortuneService implements FortuneService {


	@Override
	public String dailyFortuneService() {
		// TODO Auto-generated method stub
		return "data base fortune service";
	}

}

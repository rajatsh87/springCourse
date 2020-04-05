package com.udemy.spring.noxml;

import com.udemy.spring.noxml.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}

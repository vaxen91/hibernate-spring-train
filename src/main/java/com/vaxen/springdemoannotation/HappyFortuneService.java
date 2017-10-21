package com.vaxen.springdemoannotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "Today is your lucky day!!";
	}

}

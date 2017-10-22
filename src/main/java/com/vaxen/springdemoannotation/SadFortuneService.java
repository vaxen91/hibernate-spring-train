package com.vaxen.springdemoannotation;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	public String getFortuneService() {
		
		return "Today is your sad day!!";
	}

}

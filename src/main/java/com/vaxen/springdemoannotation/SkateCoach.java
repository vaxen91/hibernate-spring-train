package com.vaxen.springdemoannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SkateCoach implements Coach {
	
	private FortuneService service;
	
	
	@Autowired
	public SkateCoach(FortuneService service) {
		this.service = service;
	}



	public String getEserciziGiornalieri() {
		return "fai 10 olly e 20 kickflip";
	}


	public String getDailyFortune() {
		return service.getFortuneService();
	}

}

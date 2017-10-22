package com.vaxen.springdemoannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SkateCoach implements Coach {
	
	//field injection
	@Autowired
	@Qualifier ("randomFortuneService")
	private FortuneService service;
	
	public SkateCoach() {
	}
	
	/* setter injection
	@Autowired
	public void setFortuneService(FortuneService service){
		System.out.println("dentro set");
		this.service = service;
	}
	//method injection
	@Autowired
	public void methodInjection (FortuneService serve){
		System.out.println("<< inside method injection "+serve.getFortuneService());
		this.service = serve;
	}
	*/

	public String getEserciziGiornalieri() {
		return "fai 10 olly e 20 kickflip";
	}


	public String getDailyFortune() {
		return service.getFortuneService();
	}

}

package com.vaxen.springdemoannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppAnnotation {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
		
		Coach myCoach = context.getBean("skateCoach", SkateCoach.class);
		
		System.out.println(myCoach.getEserciziGiornalieri());
		System.out.println(myCoach.getDailyFortune());
		
		context.close();
	}

}

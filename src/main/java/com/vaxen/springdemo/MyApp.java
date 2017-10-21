package com.vaxen.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CharacterImpl myChar = context.getBean("myChar",CharacterImpl.class);
		
		Elf myRace = context.getBean("raceElf",Elf.class);
		
		System.out.println(myChar.toString());
		
		context.close();
	}

}

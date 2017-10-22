package com.vaxen.springdemoannotation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class randomFortuneService implements FortuneService {
	
	String [] data = { "Chi fa da se' fa per tre", "Journey is the reward", "NOPE DUDE"};
	
	Random myRandom = new Random();

	public String getFortuneService() {
		int index = myRandom.nextInt(data.length);
		String message = data[index];
		
		return message;
	}

}

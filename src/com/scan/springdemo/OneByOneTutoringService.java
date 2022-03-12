package com.scan.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OneByOneTutoringService implements TutoringService {
	
	private String[]data = {
		"Noah","Allan","Kevin"	
	};
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	private Random random = new Random();
	@Override
	public String getTutoring() {
		
		int index = random.nextInt(data.length);
		
		String theTutoring = data[index];
		
		if(theTutoring.equals("Noah")) {			
			return theTutoring + "\nEmail:" + email + "\nTeam:" + team;
		}else
			return theTutoring;
	}

}

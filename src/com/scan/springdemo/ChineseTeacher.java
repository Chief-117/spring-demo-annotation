package com.scan.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class ChineseTeacher implements Teacher {
	
	private TutoringService tutoringService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	public ChineseTeacher(TutoringService thetutoringService) {
		tutoringService = thetutoringService;
	}
	@Override
	public String subject() {
		// TODO Auto-generated method stub
		return "Chinese";
	}

	@Override
	public String getTutoring() {
		// TODO Auto-generated method stub
		return tutoringService.getTutoring();
	}

}

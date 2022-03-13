package com.scan.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class ChineseTeacher implements Teacher {
	
	private TutoringService tutoringService;
	
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

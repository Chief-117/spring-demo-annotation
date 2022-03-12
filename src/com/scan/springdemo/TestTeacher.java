package com.scan.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class TestTeacher implements Teacher {
	
	@Autowired
	@Qualifier(value="testService")
	private TutoringService tutoringSerivce;
	
	public TestTeacher() {
		System.out.println("inside Test Constructor");
	}
	@Override
	public String subject() {
		return "This is a Test";
	}

	@Override
	public String getTutoring() {
		return tutoringSerivce.getTutoring();
	}

}

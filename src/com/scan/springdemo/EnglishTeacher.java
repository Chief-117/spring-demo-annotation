package com.scan.springdemo;

import org.springframework.stereotype.Component;

@Component(value="xxx")
public class EnglishTeacher implements Teacher {
	
	public String EnglishKnowledge() {
		return "only the engilshTeacher know how to speak english";
	}
	@Override
	public String subject() {
		return "teach student how to speak english";
	}
	@Override
	public String getTutoring() {
		return "in the English method";
	}
}

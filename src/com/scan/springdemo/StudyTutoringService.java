package com.scan.springdemo;

import org.springframework.stereotype.Component;

@Component
public class StudyTutoringService implements TutoringService {

	@Override
	public String getTutoring() {
		return "Study in School at night";
	}

}

package com.scan.springdemo;

import org.springframework.stereotype.Component;

@Component//Spring will regist it
public class AfterSchoolTutoringService implements TutoringService {

	@Override
	public String getTutoring() {
		return "After-school tutoring";
	}

}

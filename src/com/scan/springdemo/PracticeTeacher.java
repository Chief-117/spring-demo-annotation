package com.scan.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class PracticeTeacher implements Teacher {
	
//	@Autowired
//	@Qualifier(value="practiceTutoringService")
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

	public PracticeTeacher(PracticeTutoringService thepractiveTutoringService) {
		tutoringService = thepractiveTutoringService;
	}

	@Override
	public String subject() {
		return "Practivity#7 Teacher.subject";
	}

	@Override
	public String getTutoring() {
		return tutoringService.getTutoring();
	}
	
	
}

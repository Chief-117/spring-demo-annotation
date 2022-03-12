package com.scan.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("thescienceTeacher")//practice component scan with applicationContext.xml
@Component
public class ScienceTeacher implements Teacher {
	@Autowired
	@Qualifier(value="oneByOneTutoringService")
	//if there are 2 or more service int tutoringService 
	//console will show you error because spring don't know what you want to use
	//So here you need to add @Qualifier(value="(the service you want)") 
	private TutoringService tutoringService;
	
	public ScienceTeacher() {
		System.out.println(">> inside default constructor <<");
	}
	
//	@Autowired
//	public void doSomeTutorinService(TutoringService theTutoringService) {
//		System.out.println("inside doSomeTutorinService()");
//		tutoringService = theTutoringService;
//	}
	
//	@Autowired //after Spring 4.3 Constructor Autowired is no longer necessary
//	public ScienceTeacher(TutoringService thetutoringService) {
//		tutoringService = thetutoringService;
//	}
	
	public String subjectKnowledge() {
		return "only scienceTeacher know the power of science";
	}

	@Override
	public String subject() {
		return "develop students' understanding of scientific inquiry";
	}
	@Override
	public String getTutoring() {
		return tutoringService.getTutoring();
	}
}

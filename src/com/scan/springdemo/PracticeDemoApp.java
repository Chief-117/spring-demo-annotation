package com.scan.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(PracticeJavaConfiguration.class);
		
		PracticeTeacher p1 = context.getBean("practiceTeacher",PracticeTeacher.class);
		
		System.out.println(p1.getTutoring());
		
		context.close();
	}

}

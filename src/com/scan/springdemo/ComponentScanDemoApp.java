package com.scan.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanDemoApp {
	public static void main(String[]args) {
	//read java config file
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(MonthlySalary.class);
	Teacher s1 = context.getBean("xxx", Teacher.class);
	
	Teacher test = context.getBean("testTeacher", Teacher.class);
//	System.out.println(s1.getTutoring());
	System.out.println(s1.getTutoring());
	System.out.println(test.getTutoring());
//	
	context.close();
	}
}

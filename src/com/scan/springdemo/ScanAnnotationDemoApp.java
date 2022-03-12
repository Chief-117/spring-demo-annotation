package com.scan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScanAnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// default bean id is the class name FirstCharcter to lowercase
		
		Teacher s1 = context.getBean("xxx", Teacher.class);
		
		Teacher test = context.getBean("testTeacher", Teacher.class);
//		System.out.println(s1.getTutoring());
		System.out.println(s1.getTutoring());
		System.out.println(test.getTutoring());
		
		context.close();
	}

}

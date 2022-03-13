package com.scan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Teacher theTeacher = context.getBean("xxx",Teacher.class);
		
//		Teacher theTeacher2 = context.getBean("xxx",Teacher.class);
		
//		boolean result = (theTeacher == theTeacher2);
		
		
		System.out.println(theTeacher);
//		System.out.println(theTeacher2);
//		System.out.println(result);
		
		context.close();
	}

}

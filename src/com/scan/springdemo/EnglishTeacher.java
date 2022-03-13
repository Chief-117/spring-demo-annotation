package com.scan.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="xxx")
@Scope("prototype") //test bean scope
public class EnglishTeacher implements Teacher {
	public EnglishTeacher() {
		System.out.println("default constructor");
	}
	public String EnglishKnowledge() {
		return "only the engilshTeacher know how to speak english";
	}
	//define init method
	@PostConstruct// only support java8 or lower version 
	public void init() throws IOException {
		String fileName = "C:\\JavaFramework\\eclipse-workspace\\spring-demo-annotation\\src\\data.txt";
		File theFile = new File(fileName);
		if(theFile.exists()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(theFile));
				while(br.ready()) {
					System.out.println(br.readLine());
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("init method start");
	}
	@PreDestroy // only support java8 or lower version and not support for scope prototype
	public void destroy() {
		System.out.println("destroy method start");
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

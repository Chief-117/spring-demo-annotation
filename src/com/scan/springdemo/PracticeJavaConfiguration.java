package com.scan.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:personel.properties")
public class PracticeJavaConfiguration {
	
	@Bean
	public PracticeTutoringService practiveTutoringService() {
		return new PracticeTutoringService();
	}
	
	@Bean
	public Teacher practiceTeacher() {
		return new PracticeTeacher(practiveTutoringService());
	}
}

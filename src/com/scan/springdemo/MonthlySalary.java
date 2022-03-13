package com.scan.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//tell spring here is the JAVA Configuration
//in doing ChieneseDempApp we comment out
//@ComponentScan("com.scan.springdemo")//works like XML Component scanning
public class MonthlySalary {
	//define bean for our TutoringService
	@Bean	//notice!! this method name will be the real bean id
	public TutoringService studyTutoringService() {
		return new StudyTutoringService();
	}
	//define bean for our ChineseTeacher and inject dependency
	@Bean
	public Teacher chineseTeacher() {
		return new ChineseTeacher(studyTutoringService());
	}
}

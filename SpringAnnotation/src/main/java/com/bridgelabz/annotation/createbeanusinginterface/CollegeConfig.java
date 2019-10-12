package com.bridgelabz.annotation.createbeanusinginterface;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bridgelabz.annotation.createbeanusinginterface")
public class CollegeConfig {

	/*
	 * @Bean public Teacher teacherBean() { return new MathTeacher(); }
	 * 
	 * @Bean public College collegeBean() { College college = new College();
	 * college.setTeacher(teacherBean()); return college; }
	 */
}

package com.bridgelabz.annotation.gettingvaluefromprop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.bridgelabz.annotation.gettingvaluefromprop")
@PropertySource("classpath:college_info.properties")
public class CollegeConfig {

	/*
	 * @Bean public Teacher teacherBean() { return new MathTeacher(); }
	 * 
	 * @Bean public College collegeBean() { College college = new College();
	 * college.setTeacher(teacherBean()); return college; }
	 */
}

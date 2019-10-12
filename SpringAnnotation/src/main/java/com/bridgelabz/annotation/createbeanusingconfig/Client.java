package com.bridgelabz.annotation.createbeanusingconfig;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("collegeBean", College.class);
		System.out.println("College object name: " + college);
		college.disp();
		context.close();
	}

}

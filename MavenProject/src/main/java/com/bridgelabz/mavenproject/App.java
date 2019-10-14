package com.bridgelabz.mavenproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// using spring framework

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Vehicle obj = context.getBean("bike", Vehicle.class);
		obj.drive();

		((ClassPathXmlApplicationContext) context).close();
	}
}

/******************************************************************************
 *  Purpose: Program is written for dependency injection using xml beans in
 *  		 this application this is build on top of maven project which will
 *  		 helps us to add and remove dependency which is required for project
 *  		 using pom.xml file we are configuring xml but getting beans by using
 *  		 annotation only @Component
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   14-10-2019
 *
 ******************************************************************************/

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

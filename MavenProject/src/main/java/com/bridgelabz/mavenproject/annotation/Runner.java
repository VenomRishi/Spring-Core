/******************************************************************************
 *  Purpose: Program is written for dependency injection using application
 *  		 configuration in this application this is build on top of maven
 *  		 project which will helps us to add and remove dependency which is
 *  		 required for project using pom.xml file we are configuring xml but
 *  		 getting beans by using annotation only 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   14-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.mavenproject.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RunnerConfig.class);

		Mobile s = context.getBean("getLenovo",Mobile.class);
		s.process();

		((AnnotationConfigApplicationContext) context).close();

	}

}

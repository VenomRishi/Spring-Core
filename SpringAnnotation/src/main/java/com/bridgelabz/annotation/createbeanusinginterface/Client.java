/******************************************************************************
 *  Purpose: Program is written for dependency injection of spring using
 *  		 by configuration class and also injection is done by using interface
 *  		 which can configure all beans which is present in this package this 
 *  		 can achieve using java based config
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.annotation.createbeanusinginterface;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("college", College.class);
		System.out.println("College object name: " + college);
		college.disp();
		context.close();
	}

}

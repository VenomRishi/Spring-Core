/******************************************************************************
 *  Purpose: Program is written for running the @Aspect which will be invoked 
 *  		 before the getName() method calls
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   14-10-2019
 *
 ******************************************************************************/


package com.bridgelabz.springaop.brains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		System.out.println(shapeService.getCircle().getName());
			
		((ClassPathXmlApplicationContext) context).close();

	}

}

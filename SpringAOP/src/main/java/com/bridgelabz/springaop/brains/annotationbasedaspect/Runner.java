/******************************************************************************
 *  Purpose: Program is written for running the @Aspect which will be invoked 
 *  		 before the getName() method calls
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   15-10-2019
 *
 ******************************************************************************/


package com.bridgelabz.springaop.brains.annotationbasedaspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = context.getBean("annoShapeService", ShapeService.class);
		System.out.println(shapeService.getAnnocircle().getName());
		((ClassPathXmlApplicationContext) context).close();

	}

}

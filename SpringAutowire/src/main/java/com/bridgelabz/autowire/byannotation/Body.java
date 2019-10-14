/******************************************************************************
 *  Purpose: Program is written for dependency injection of spring using
 *  		 by autowiring with setter and constructor injection configure in xml
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/


package com.bridgelabz.autowire.byannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Human human = context.getBean("humanAnnotation", Human.class);
		human.startPumping();

	}

}

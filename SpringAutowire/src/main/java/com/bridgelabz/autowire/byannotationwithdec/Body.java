/******************************************************************************
 *  Purpose: Program is written for dependency injection of spring using
 *  		 by autowiring with declaration injection configure in xml
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.autowire.byannotationwithdec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Human human = context.getBean("humanAnnotationWithDec", Human.class);
		human.startPumping();
		((ClassPathXmlApplicationContext) context).close();
	}

}

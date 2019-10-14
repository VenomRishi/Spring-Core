/******************************************************************************
 *  Purpose: Program is written for dependency injection of spring using
 *  		 setter injection configure in xml
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.dependencyinjection.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		// dependency injection is used using setter method
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentSetter student = context.getBean("studentsetter", StudentSetter.class);

		System.out.println("Student id is: " + student.getId());
		  System.out.println("Student name is: "+student.getName());

		

	}
}

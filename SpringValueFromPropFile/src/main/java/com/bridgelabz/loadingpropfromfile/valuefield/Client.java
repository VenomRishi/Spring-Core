/******************************************************************************
 *  Purpose: Program is written for dependency injection of spring using
 *  		 by value field with declaration injection configure in xml
 *  		 and in this loading property from the student_info.properties file
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.loadingpropfromfile.valuefield;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("stud", Student.class);
		student.displayStudentInfo();

	}

}

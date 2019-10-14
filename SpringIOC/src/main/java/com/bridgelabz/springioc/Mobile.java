/******************************************************************************
 *  Purpose: Program is written for dependency injection of spring in this 
 *  		 you will find the IOC container example of spring framework
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.springioc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Mobile {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Sim obj=(Sim) context.getBean("sim");
		obj.call();
		obj.data();
	}

}

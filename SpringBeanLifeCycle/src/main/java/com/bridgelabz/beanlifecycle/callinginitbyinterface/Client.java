/******************************************************************************
 *  Purpose: Program is written for dependency injection of spring using
 *  		 by using interface injection of InitializingBean DisposableBean 
 *  		 and it uses init and destroy method of spring bean life cycle
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.beanlifecycle.callinginitbyinterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Hello hello = context.getBean("hello", Hello.class);
		hello.service();
		context.close();
	}
	
	
}

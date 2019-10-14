/******************************************************************************
 *  Purpose: Program is written for dependency injection of spring using
 *  		 by using setter method and it uses init and destroy method 
 *  		 of spring bean life cycle
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.beanlifecycle.callinginitbyxml;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDao dao = context.getBean("studentDao2", StudentDao.class);
		dao.showRow();
		//closing the current register 
		((ClassPathXmlApplicationContext) context).registerShutdownHook();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}

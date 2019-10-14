/******************************************************************************
 *  Purpose: Program is written for dependency injection of spring using
 *  		 by using annotation base and it uses init and destroy method 
 *  		 of spring bean life cycle
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/


package com.bridgelabz.beanlifecycle.callinginitbyannotation;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDao dao = context.getBean("studentDao", StudentDao.class);
		dao.showRow();
		((ClassPathXmlApplicationContext) context).close();
	}

}

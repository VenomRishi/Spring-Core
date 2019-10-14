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

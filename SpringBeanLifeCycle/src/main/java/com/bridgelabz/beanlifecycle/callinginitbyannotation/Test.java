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

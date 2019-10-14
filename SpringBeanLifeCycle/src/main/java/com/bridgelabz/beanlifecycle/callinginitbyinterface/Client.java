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

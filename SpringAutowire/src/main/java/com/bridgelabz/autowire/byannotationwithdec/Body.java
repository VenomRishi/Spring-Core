package com.bridgelabz.autowire.byannotationwithdec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		System.out.println("Auto");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Human human = context.getBean("humanAnnotationWithDec", Human.class);
		human.startPumping();

	}

}

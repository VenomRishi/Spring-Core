package com.bridgelabz.mavenproject.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RunnerConfig.class);

		Mobile s = context.getBean("getLenovo",Mobile.class);
		s.process();

		((AnnotationConfigApplicationContext) context).close();

	}

}

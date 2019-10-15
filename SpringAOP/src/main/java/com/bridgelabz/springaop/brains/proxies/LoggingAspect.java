package com.bridgelabz.springaop.brains.proxies;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
	public Object aroundAdviceReturnedAllGetters(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnedObject = null;
		try {
			System.out.println("Before advice");
			returnedObject = proceedingJoinPoint.proceed();
			System.out.println("After advice");
		} catch (Throwable e) {
			System.out.println("After Throwing");
			e.printStackTrace();
		}
		System.out.println("After finally");
		return returnedObject;
	}
	
	public void loggingAdvice() {
		System.out.println("Loging Advice is called");
	}
}
